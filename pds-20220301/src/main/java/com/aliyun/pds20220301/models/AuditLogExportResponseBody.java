// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuditLogExportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4221bf6e6ab43c255edc4463bf3a6f5f5d31****</p>
     */
    @NameInMap("async_task_id")
    public String asyncTaskId;

    public static AuditLogExportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuditLogExportResponseBody self = new AuditLogExportResponseBody();
        return TeaModel.build(map, self);
    }

    public AuditLogExportResponseBody setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

}
