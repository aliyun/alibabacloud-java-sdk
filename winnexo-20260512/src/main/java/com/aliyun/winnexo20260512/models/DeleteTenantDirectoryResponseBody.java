// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteTenantDirectoryResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>实际使用的删除模式</p>
     * 
     * <strong>example:</strong>
     * <p>reject</p>
     */
    @NameInMap("deleteMode")
    public String deleteMode;

    /**
     * <p>已删除的目录唯一标识</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>错误描述，成功时为空</p>
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

    public static DeleteTenantDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantDirectoryResponseBody self = new DeleteTenantDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTenantDirectoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteTenantDirectoryResponseBody setDeleteMode(String deleteMode) {
        this.deleteMode = deleteMode;
        return this;
    }
    public String getDeleteMode() {
        return this.deleteMode;
    }

    public DeleteTenantDirectoryResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DeleteTenantDirectoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteTenantDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
