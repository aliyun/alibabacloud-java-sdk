// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RebootRenderingServerResponseBody extends TeaModel {
    /**
     * <p>Number of cloud application service instances that failed to restart</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedInstanceCount")
    public Integer failedInstanceCount;

    /**
     * <p>Cloud application service instance IDs and their failure details</p>
     */
    @NameInMap("FailedInstances")
    public java.util.List<RebootRenderingServerResponseBodyFailedInstances> failedInstances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Number of successful cloud application service instances</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SuccessInstanceCount")
    public Integer successInstanceCount;

    /**
     * <p>The instance ID of the cloud application service and the description of the result.</p>
     */
    @NameInMap("SuccessInstances")
    public java.util.List<RebootRenderingServerResponseBodySuccessInstances> successInstances;

    public static RebootRenderingServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootRenderingServerResponseBody self = new RebootRenderingServerResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootRenderingServerResponseBody setFailedInstanceCount(Integer failedInstanceCount) {
        this.failedInstanceCount = failedInstanceCount;
        return this;
    }
    public Integer getFailedInstanceCount() {
        return this.failedInstanceCount;
    }

    public RebootRenderingServerResponseBody setFailedInstances(java.util.List<RebootRenderingServerResponseBodyFailedInstances> failedInstances) {
        this.failedInstances = failedInstances;
        return this;
    }
    public java.util.List<RebootRenderingServerResponseBodyFailedInstances> getFailedInstances() {
        return this.failedInstances;
    }

    public RebootRenderingServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebootRenderingServerResponseBody setSuccessInstanceCount(Integer successInstanceCount) {
        this.successInstanceCount = successInstanceCount;
        return this;
    }
    public Integer getSuccessInstanceCount() {
        return this.successInstanceCount;
    }

    public RebootRenderingServerResponseBody setSuccessInstances(java.util.List<RebootRenderingServerResponseBodySuccessInstances> successInstances) {
        this.successInstances = successInstances;
        return this;
    }
    public java.util.List<RebootRenderingServerResponseBodySuccessInstances> getSuccessInstances() {
        return this.successInstances;
    }

    public static class RebootRenderingServerResponseBodyFailedInstances extends TeaModel {
        /**
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>300000</p>
         */
        @NameInMap("ErrCode")
        public Integer errCode;

        /**
         * <p>Reason for failure</p>
         * 
         * <strong>example:</strong>
         * <p>Rejected due to timeout</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <p>Cloud application service instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>render-421cd2a1125947c19fcd5c7dd2c7d31e</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static RebootRenderingServerResponseBodyFailedInstances build(java.util.Map<String, ?> map) throws Exception {
            RebootRenderingServerResponseBodyFailedInstances self = new RebootRenderingServerResponseBodyFailedInstances();
            return TeaModel.build(map, self);
        }

        public RebootRenderingServerResponseBodyFailedInstances setErrCode(Integer errCode) {
            this.errCode = errCode;
            return this;
        }
        public Integer getErrCode() {
            return this.errCode;
        }

        public RebootRenderingServerResponseBodyFailedInstances setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public RebootRenderingServerResponseBodyFailedInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

    public static class RebootRenderingServerResponseBodySuccessInstances extends TeaModel {
        /**
         * <p>Cloud application service instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>render-e6cf423c787e4e43b460a788da254fe3</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static RebootRenderingServerResponseBodySuccessInstances build(java.util.Map<String, ?> map) throws Exception {
            RebootRenderingServerResponseBodySuccessInstances self = new RebootRenderingServerResponseBodySuccessInstances();
            return TeaModel.build(map, self);
        }

        public RebootRenderingServerResponseBodySuccessInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

}
