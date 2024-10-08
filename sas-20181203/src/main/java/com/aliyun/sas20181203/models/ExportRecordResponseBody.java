// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportRecordResponseBody extends TeaModel {
    /**
     * <p>The name of the exported file.</p>
     * 
     * <strong>example:</strong>
     * <p>cms_20171101.xlsx</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The ID of the exported file.</p>
     * 
     * <strong>example:</strong>
     * <p>131231</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6673D49C-A9AB-40DD-B4A2-B92306701AE7</p>
     */
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
