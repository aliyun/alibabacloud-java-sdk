// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class ExportRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>health_check_export_20******</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>100******</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>AAC546A5-5EDC-5939-86A3-56DFAF******</p>
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
