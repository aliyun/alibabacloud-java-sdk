// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportRecordResponseBody extends TeaModel {
    // The name of the exported file.
    @NameInMap("FileName")
    public String fileName;

    // The ID of the exported file.
    @NameInMap("Id")
    public Long id;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static ExportRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportRecordResponseBody self = new ExportRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportRecordResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ExportRecordResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExportRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
