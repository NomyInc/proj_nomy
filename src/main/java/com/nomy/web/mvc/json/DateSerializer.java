package com.nomy.web.mvc.json;

import java.io.IOException;
import java.util.Date;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.nomy.common.utils.DateTimeUtils;

public class DateSerializer extends StdSerializer<Date> {

    public DateSerializer() {
        super(Date.class);
    }

    @Override
    public void serialize(Date value, JsonGenerator json,
            SerializerProvider provider) throws IOException,
            JsonGenerationException {

        String out = DateTimeUtils.toDisplayStringWithTime(value);
        json.writeString(out);
    }
}
