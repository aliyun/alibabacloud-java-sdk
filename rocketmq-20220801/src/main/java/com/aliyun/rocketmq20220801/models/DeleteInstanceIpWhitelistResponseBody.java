// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteInstanceIpWhitelistResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This parameter is returned only if the access is denied due to the reason that the Resource Access Management (RAM) user does not have the required permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingInstanceId</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter instanceId is mandatory for this action .</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16425867-C948-5A0C-9A24-5259727BE727</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteInstanceIpWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceIpWhitelistResponseBody self = new DeleteInstanceIpWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceIpWhitelistResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteInstanceIpWhitelistResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteInstanceIpWhitelistResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteInstanceIpWhitelistResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DeleteInstanceIpWhitelistResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DeleteInstanceIpWhitelistResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteInstanceIpWhitelistResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteInstanceIpWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteInstanceIpWhitelistResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
