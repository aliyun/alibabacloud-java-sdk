// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GrantAgentUsersResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>本次处理的授权记录数（含新增与更新）</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("grantedCount")
    public Long grantedCount;

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

    public static GrantAgentUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantAgentUsersResponseBody self = new GrantAgentUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantAgentUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GrantAgentUsersResponseBody setGrantedCount(Long grantedCount) {
        this.grantedCount = grantedCount;
        return this;
    }
    public Long getGrantedCount() {
        return this.grantedCount;
    }

    public GrantAgentUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GrantAgentUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
