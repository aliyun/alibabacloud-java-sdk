// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AssociateRenderingProjectInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedInstanceCount")
    public String failedInstanceCount;

    @NameInMap("FailedInstances")
    public java.util.List<AssociateRenderingProjectInstancesResponseBodyFailedInstances> failedInstances;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SuccessInstanceCount")
    public String successInstanceCount;

    @NameInMap("SuccessInstances")
    public java.util.List<AssociateRenderingProjectInstancesResponseBodySuccessInstances> successInstances;

    public static AssociateRenderingProjectInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateRenderingProjectInstancesResponseBody self = new AssociateRenderingProjectInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateRenderingProjectInstancesResponseBody setFailedInstanceCount(String failedInstanceCount) {
        this.failedInstanceCount = failedInstanceCount;
        return this;
    }
    public String getFailedInstanceCount() {
        return this.failedInstanceCount;
    }

    public AssociateRenderingProjectInstancesResponseBody setFailedInstances(java.util.List<AssociateRenderingProjectInstancesResponseBodyFailedInstances> failedInstances) {
        this.failedInstances = failedInstances;
        return this;
    }
    public java.util.List<AssociateRenderingProjectInstancesResponseBodyFailedInstances> getFailedInstances() {
        return this.failedInstances;
    }

    public AssociateRenderingProjectInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssociateRenderingProjectInstancesResponseBody setSuccessInstanceCount(String successInstanceCount) {
        this.successInstanceCount = successInstanceCount;
        return this;
    }
    public String getSuccessInstanceCount() {
        return this.successInstanceCount;
    }

    public AssociateRenderingProjectInstancesResponseBody setSuccessInstances(java.util.List<AssociateRenderingProjectInstancesResponseBodySuccessInstances> successInstances) {
        this.successInstances = successInstances;
        return this;
    }
    public java.util.List<AssociateRenderingProjectInstancesResponseBodySuccessInstances> getSuccessInstances() {
        return this.successInstances;
    }

    public static class AssociateRenderingProjectInstancesResponseBodyFailedInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>invalid id</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>render-b45f28650ffe4591bf4c5c95996a428c</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static AssociateRenderingProjectInstancesResponseBodyFailedInstances build(java.util.Map<String, ?> map) throws Exception {
            AssociateRenderingProjectInstancesResponseBodyFailedInstances self = new AssociateRenderingProjectInstancesResponseBodyFailedInstances();
            return TeaModel.build(map, self);
        }

        public AssociateRenderingProjectInstancesResponseBodyFailedInstances setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AssociateRenderingProjectInstancesResponseBodyFailedInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

    public static class AssociateRenderingProjectInstancesResponseBodySuccessInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>render-5130e2feb23f442fb9456a3d977f03d4</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static AssociateRenderingProjectInstancesResponseBodySuccessInstances build(java.util.Map<String, ?> map) throws Exception {
            AssociateRenderingProjectInstancesResponseBodySuccessInstances self = new AssociateRenderingProjectInstancesResponseBodySuccessInstances();
            return TeaModel.build(map, self);
        }

        public AssociateRenderingProjectInstancesResponseBodySuccessInstances setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AssociateRenderingProjectInstancesResponseBodySuccessInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

}
