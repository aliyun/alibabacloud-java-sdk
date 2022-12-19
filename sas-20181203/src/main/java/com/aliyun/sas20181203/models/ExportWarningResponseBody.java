// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportWarningResponseBody extends TeaModel {
    // The name of the file that contains exported baseline check results.
    @NameInMap("FileName")
    public String fileName;

    // The ID of the task to export baseline check results.
    @NameInMap("Id")
    public Long id;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static ExportWarningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportWarningResponseBody self = new ExportWarningResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportWarningResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ExportWarningResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExportWarningResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
