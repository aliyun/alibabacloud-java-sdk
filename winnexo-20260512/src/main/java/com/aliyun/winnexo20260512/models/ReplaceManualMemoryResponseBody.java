// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceManualMemoryResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为 200，失败时为对应错误码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>保存后的手动记忆完整内容；清空成功时为空字符串</p>
     * 
     * <strong>example:</strong>
     * <p>喜欢简洁的回答。</p>
     */
    @NameInMap("content")
    public String content;

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

    public static ReplaceManualMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceManualMemoryResponseBody self = new ReplaceManualMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceManualMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReplaceManualMemoryResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ReplaceManualMemoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReplaceManualMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
