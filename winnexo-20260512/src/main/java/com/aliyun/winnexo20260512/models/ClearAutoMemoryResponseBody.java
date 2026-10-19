// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ClearAutoMemoryResponseBody extends TeaModel {
    /**
     * <p>本次成功删除的自动记忆文件数量；无可清空记忆时为 0</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("clearedCount")
    public Long clearedCount;

    /**
     * <p>业务状态码；成功为 200，失败时为对应错误码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述；成功时为空字符串，失败时返回具体原因</p>
     * 
     * <strong>example:</strong>
     * <p>当前用户不是群组 cg_12345 的活跃成员</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID，用于定位本次调用</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>本次清空的自动记忆类型；取值为 user、feedback、reference、project 或 all</p>
     * 
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("type")
    public String type;

    public static ClearAutoMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearAutoMemoryResponseBody self = new ClearAutoMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearAutoMemoryResponseBody setClearedCount(Long clearedCount) {
        this.clearedCount = clearedCount;
        return this;
    }
    public Long getClearedCount() {
        return this.clearedCount;
    }

    public ClearAutoMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClearAutoMemoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClearAutoMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClearAutoMemoryResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
