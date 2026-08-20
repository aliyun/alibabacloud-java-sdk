// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CheckHealthResponseBody extends TeaModel {
    /**
     * <p>The authentication source: bearer / aliyun_gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_gateway</p>
     */
    @NameInMap("authSource")
    public String authSource;

    /**
     * <p>The caller type: user / aliyun_main / aliyun_ram / service.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_main</p>
     */
    @NameInMap("callerType")
    public String callerType;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The name of the currently effective digital employee. This value is empty if not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>pcitc-magent</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeName;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F4A9EB1C-6952-5CCC-B1DC-355576FC82A7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The effective tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21577</p>
     */
    @NameInMap("tenantId")
    public Long tenantId;

    /**
     * <p>The platform user ID.</p>
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
