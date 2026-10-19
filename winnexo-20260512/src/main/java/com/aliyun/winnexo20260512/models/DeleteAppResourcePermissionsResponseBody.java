// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteAppResourcePermissionsResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为 200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>删除的权限记录数</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("deletedCount")
    public Long deletedCount;

    /**
     * <p>错误描述；成功时为空</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteAppResourcePermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppResourcePermissionsResponseBody self = new DeleteAppResourcePermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppResourcePermissionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAppResourcePermissionsResponseBody setDeletedCount(Long deletedCount) {
        this.deletedCount = deletedCount;
        return this;
    }
    public Long getDeletedCount() {
        return this.deletedCount;
    }

    public DeleteAppResourcePermissionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAppResourcePermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
