// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetMemoryAutoExtractionSwitchResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为 200，失败时为对应错误码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>当前记忆范围的自动记忆拾取开关状态；true 表示已开启，false 表示已关闭</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

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

    public static GetMemoryAutoExtractionSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryAutoExtractionSwitchResponseBody self = new GetMemoryAutoExtractionSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryAutoExtractionSwitchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMemoryAutoExtractionSwitchResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetMemoryAutoExtractionSwitchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMemoryAutoExtractionSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
