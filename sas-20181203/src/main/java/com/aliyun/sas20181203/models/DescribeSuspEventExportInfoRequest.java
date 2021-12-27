// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventExportInfoRequest extends TeaModel {
    @NameInMap("ExportId")
    public Integer exportId;

    @NameInMap("From")
    public String from;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSuspEventExportInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventExportInfoRequest self = new DescribeSuspEventExportInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventExportInfoRequest setExportId(Integer exportId) {
        this.exportId = exportId;
        return this;
    }
    public Integer getExportId() {
        return this.exportId;
    }

    public DescribeSuspEventExportInfoRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeSuspEventExportInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
