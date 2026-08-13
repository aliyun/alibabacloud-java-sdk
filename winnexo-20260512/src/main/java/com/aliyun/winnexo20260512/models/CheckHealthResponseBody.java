// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CheckHealthResponseBody extends TeaModel {
    /**
     * <p>认证来源: bearer / aliyun_gateway</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_gateway</p>
     */
    @NameInMap("authSource")
    public String authSource;

    /**
     * <strong>example:</strong>
     * <p>aliyun_main</p>
     */
    @NameInMap("callerType")
    public String callerType;

    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>当前请求生效的数字员工名（运营对象）；未传且租户下无数字员工时为空</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeName;

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

    /**
     * <p>生效租户ID</p>
     * 
     * <strong>example:</strong>
     * <p>21577</p>
     */
    @NameInMap("tenantId")
    public Long tenantId;

    /**
     * <p>平台用户ID</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("userId")
    public Long userId;

    public static CheckHealthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckHealthResponseBody self = new CheckHealthResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckHealthResponseBody setAuthSource(String authSource) {
        this.authSource = authSource;
        return this;
    }
    public String getAuthSource() {
        return this.authSource;
    }

    public CheckHealthResponseBody setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public CheckHealthResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckHealthResponseBody setDigitalEmployeeName(String digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public CheckHealthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckHealthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckHealthResponseBody setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public CheckHealthResponseBody setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
