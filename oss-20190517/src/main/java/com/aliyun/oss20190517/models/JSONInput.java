// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class JSONInput extends TeaModel {
    // description
    @NameInMap("ParseJsonNumberAsString")
    public Boolean parseJsonNumberAsString;

    // description
    @NameInMap("Range")
    public String range;

    @NameInMap("Type")
    public String type;

    public static JSONInput build(java.util.Map<String, ?> map) throws Exception {
        JSONInput self = new JSONInput();
        return TeaModel.build(map, self);
    }

    public JSONInput setParseJsonNumberAsString(Boolean parseJsonNumberAsString) {
        this.parseJsonNumberAsString = parseJsonNumberAsString;
        return this;
    }
    public Boolean getParseJsonNumberAsString() {
        return this.parseJsonNumberAsString;
    }

    public JSONInput setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

    public JSONInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
