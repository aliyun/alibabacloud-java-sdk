// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportVulResponseBody extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("Id")
    public Long id;

    @NameInMap("RequestId")
    public String requestId;

    public static ExportVulResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportVulResponseBody self = new ExportVulResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportVulResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ExportVulResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExportVulResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
