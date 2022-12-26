// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportSuspEventsResponseBody extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("Id")
    public Integer id;

    @NameInMap("RequestId")
    public String requestId;

    public static ExportSuspEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportSuspEventsResponseBody self = new ExportSuspEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportSuspEventsResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ExportSuspEventsResponseBody setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public ExportSuspEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
