// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class OutputSerialization extends TeaModel {
    @NameInMap("CSV")
    public CSVOutput csv;

    // description
    @NameInMap("EnablePayloadCrc")
    public Boolean enablePayloadCrc;

    @NameInMap("JSON")
    public JSONOutput json;

    // description
    @NameInMap("KeepAllColumns")
    public Boolean keepAllColumns;

    // description
    @NameInMap("OutputHeader")
    public Boolean outputHeader;

    // description
    @NameInMap("OutputRawData")
    public Boolean outputRawData;

    public static OutputSerialization build(java.util.Map<String, ?> map) throws Exception {
        OutputSerialization self = new OutputSerialization();
        return TeaModel.build(map, self);
    }

    public OutputSerialization setCsv(CSVOutput csv) {
        this.csv = csv;
        return this;
    }
    public CSVOutput getCsv() {
        return this.csv;
    }

    public OutputSerialization setEnablePayloadCrc(Boolean enablePayloadCrc) {
        this.enablePayloadCrc = enablePayloadCrc;
        return this;
    }
    public Boolean getEnablePayloadCrc() {
        return this.enablePayloadCrc;
    }

    public OutputSerialization setJson(JSONOutput json) {
        this.json = json;
        return this;
    }
    public JSONOutput getJson() {
        return this.json;
    }

    public OutputSerialization setKeepAllColumns(Boolean keepAllColumns) {
        this.keepAllColumns = keepAllColumns;
        return this;
    }
    public Boolean getKeepAllColumns() {
        return this.keepAllColumns;
    }

    public OutputSerialization setOutputHeader(Boolean outputHeader) {
        this.outputHeader = outputHeader;
        return this;
    }
    public Boolean getOutputHeader() {
        return this.outputHeader;
    }

    public OutputSerialization setOutputRawData(Boolean outputRawData) {
        this.outputRawData = outputRawData;
        return this;
    }
    public Boolean getOutputRawData() {
        return this.outputRawData;
    }

}
