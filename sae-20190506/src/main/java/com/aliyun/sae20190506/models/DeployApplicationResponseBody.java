// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeployApplicationResponseBody extends TeaModel {
    /**
     * <p>The API status or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: success.</li>
     * <li><strong>3xx</strong>: redirection.</li>
     * <li><strong>4xx</strong>: request error.</li>
     * <li><strong>5xx</strong>: server error.</li>
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
    public DeployApplicationResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> field is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>空</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Valid values:</p>
     * <ul>
     * <li>If the request is successful, <strong>success</strong> is returned.</li>
     * <li>If the request fails, a specific error code is returned.</li>
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
     * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application deployment is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: the deployment is successful.</li>
     * <li><strong>false</strong>: the deployment failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID, which is used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>ac1a0b2215622246421415014e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DeployApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationResponseBody self = new DeployApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeployApplicationResponseBody setData(DeployApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeployApplicationResponseBodyData getData() {
        return this.data;
    }

    public DeployApplicationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeployApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeployApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeployApplicationResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DeployApplicationResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The returned change order ID, which is used to query the task execution status.</p>
         * 
         * <strong>example:</strong>
         * <p>01db03d3-3ee9-48b3-b3d0-dfce2d88****</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        /**
         * <p>Indicates whether the change published by a Resource Access Management (RAM) user requires approval. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: approval is required.</li>
         * <li><strong>false</strong>: approval is not required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsNeedApproval")
        public Boolean isNeedApproval;

        public static DeployApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeployApplicationResponseBodyData self = new DeployApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeployApplicationResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DeployApplicationResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public DeployApplicationResponseBodyData setIsNeedApproval(Boolean isNeedApproval) {
            this.isNeedApproval = isNeedApproval;
            return this;
        }
        public Boolean getIsNeedApproval() {
            return this.isNeedApproval;
        }

    }

}
