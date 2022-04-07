// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class JSONOutput extends TeaModel {
    // description
    @NameInMap("RecordDelimiter")
    public String recordDelimiter;

    public static JSONOutput build(java.util.Map<String, ?> map) throws Exception {
        JSONOutput self = new JSONOutput();
        return TeaModel.build(map, self);
    }

    public JSONOutput setRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
        return this;
    }
    public String getRecordDelimiter() {
        return this.recordDelimiter;
    }

}
