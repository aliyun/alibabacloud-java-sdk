// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteSecretResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirect.</li>
     * <li><strong>4xx</strong>: Client error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public DeleteSecretResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.NotEmpty</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>: The request is successful.</li>
     * <li>Specific error code: An exception occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the secret instance was deleted. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The instance was deleted.</li>
     * <li><strong>false</strong>: The instance failed to be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query the call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DeleteSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretResponseBody self = new DeleteSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecretResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSecretResponseBody setData(DeleteSecretResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSecretResponseBodyData getData() {
        return this.data;
    }

    public DeleteSecretResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteSecretResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSecretResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteSecretResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DeleteSecretResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID of the deleted secret instance.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("SecretId")
        public Long secretId;

        public static DeleteSecretResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSecretResponseBodyData self = new DeleteSecretResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSecretResponseBodyData setSecretId(Long secretId) {
            this.secretId = secretId;
            return this;
        }
        public Long getSecretId() {
            return this.secretId;
        }

    }

}
