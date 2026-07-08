// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DisassociateRenderingProjectInstancesResponseBody extends TeaModel {
    /**
     * <p>The number of cloud application service instances that failed to dissociate.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedInstanceCount")
    public String failedInstanceCount;

    /**
     * <p>A list of instances that failed to dissociate.</p>
     */
    @NameInMap("FailedInstances")
    public java.util.List<DisassociateRenderingProjectInstancesResponseBodyFailedInstances> failedInstances;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of cloud application service instances that were successfully dissociated.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SuccessInstanceCount")
    public String successInstanceCount;

    /**
     * <p>A list of instances that were successfully dissociated.</p>
     */
    @NameInMap("SuccessInstances")
    public java.util.List<DisassociateRenderingProjectInstancesResponseBodySuccessInstances> successInstances;

    public static DisassociateRenderingProjectInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisassociateRenderingProjectInstancesResponseBody self = new DisassociateRenderingProjectInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DisassociateRenderingProjectInstancesResponseBody setFailedInstanceCount(String failedInstanceCount) {
        this.failedInstanceCount = failedInstanceCount;
        return this;
    }
    public String getFailedInstanceCount() {
        return this.failedInstanceCount;
    }

    public DisassociateRenderingProjectInstancesResponseBody setFailedInstances(java.util.List<DisassociateRenderingProjectInstancesResponseBodyFailedInstances> failedInstances) {
        this.failedInstances = failedInstances;
        return this;
    }
    public java.util.List<DisassociateRenderingProjectInstancesResponseBodyFailedInstances> getFailedInstances() {
        return this.failedInstances;
    }

    public DisassociateRenderingProjectInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisassociateRenderingProjectInstancesResponseBody setSuccessInstanceCount(String successInstanceCount) {
        this.successInstanceCount = successInstanceCount;
        return this;
    }
    public String getSuccessInstanceCount() {
        return this.successInstanceCount;
    }

    public DisassociateRenderingProjectInstancesResponseBody setSuccessInstances(java.util.List<DisassociateRenderingProjectInstancesResponseBodySuccessInstances> successInstances) {
        this.successInstances = successInstances;
        return this;
    }
    public java.util.List<DisassociateRenderingProjectInstancesResponseBodySuccessInstances> getSuccessInstances() {
        return this.successInstances;
    }

    public static class DisassociateRenderingProjectInstancesResponseBodyFailedInstances extends TeaModel {
        /**
         * <p>The reason for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>会话中</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>A cloud application service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>render-421cd2a1125947c19fcd5c7dd2c7d31e</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static DisassociateRenderingProjectInstancesResponseBodyFailedInstances build(java.util.Map<String, ?> map) throws Exception {
            DisassociateRenderingProjectInstancesResponseBodyFailedInstances self = new DisassociateRenderingProjectInstancesResponseBodyFailedInstances();
            return TeaModel.build(map, self);
        }

        public DisassociateRenderingProjectInstancesResponseBodyFailedInstances setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DisassociateRenderingProjectInstancesResponseBodyFailedInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

    public static class DisassociateRenderingProjectInstancesResponseBodySuccessInstances extends TeaModel {
        /**
         * <p>The result message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>A cloud application service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>render-e6cf423c787e4e43b460a788da254fe3</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static DisassociateRenderingProjectInstancesResponseBodySuccessInstances build(java.util.Map<String, ?> map) throws Exception {
            DisassociateRenderingProjectInstancesResponseBodySuccessInstances self = new DisassociateRenderingProjectInstancesResponseBodySuccessInstances();
            return TeaModel.build(map, self);
        }

        public DisassociateRenderingProjectInstancesResponseBodySuccessInstances setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DisassociateRenderingProjectInstancesResponseBodySuccessInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

}
