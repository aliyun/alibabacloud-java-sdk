// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InputSerialization extends TeaModel {
    @NameInMap("CSV")
    public CSVInput csv;

    @NameInMap("CompressionType")
    public String compressionType;

    @NameInMap("JSON")
    public JSONInput json;

    public static InputSerialization build(java.util.Map<String, ?> map) throws Exception {
        InputSerialization self = new InputSerialization();
        return TeaModel.build(map, self);
    }

    public InputSerialization setCsv(CSVInput csv) {
        this.csv = csv;
        return this;
    }
    public CSVInput getCsv() {
        return this.csv;
    }

    public InputSerialization setCompressionType(String compressionType) {
        this.compressionType = compressionType;
        return this;
    }
    public String getCompressionType() {
        return this.compressionType;
    }

    public InputSerialization setJson(JSONInput json) {
        this.json = json;
        return this;
    }
    public JSONInput getJson() {
        return this.json;
    }

}
