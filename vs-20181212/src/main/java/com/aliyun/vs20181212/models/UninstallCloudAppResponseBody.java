// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UninstallCloudAppResponseBody extends TeaModel {
    /**
     * <p>The number of cloud application service instances that failed.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedInstanceCount")
    public Integer failedInstanceCount;

    /**
     * <p>List of failed cloud application service instances</p>
     */
    @NameInMap("FailedInstances")
    public java.util.List<UninstallCloudAppResponseBodyFailedInstances> failedInstances;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Number of successfully uninstalled cloud application instances</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SuccessInstanceCount")
    public Integer successInstanceCount;

    /**
     * <p>A list of service instances for which the cloud application was uninstalled successfully.</p>
     */
    @NameInMap("SuccessInstances")
    public java.util.List<UninstallCloudAppResponseBodySuccessInstances> successInstances;

    public static UninstallCloudAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallCloudAppResponseBody self = new UninstallCloudAppResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallCloudAppResponseBody setFailedInstanceCount(Integer failedInstanceCount) {
        this.failedInstanceCount = failedInstanceCount;
        return this;
    }
    public Integer getFailedInstanceCount() {
        return this.failedInstanceCount;
    }

    public UninstallCloudAppResponseBody setFailedInstances(java.util.List<UninstallCloudAppResponseBodyFailedInstances> failedInstances) {
        this.failedInstances = failedInstances;
        return this;
    }
    public java.util.List<UninstallCloudAppResponseBodyFailedInstances> getFailedInstances() {
        return this.failedInstances;
    }

    public UninstallCloudAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UninstallCloudAppResponseBody setSuccessInstanceCount(Integer successInstanceCount) {
        this.successInstanceCount = successInstanceCount;
        return this;
    }
    public Integer getSuccessInstanceCount() {
        return this.successInstanceCount;
    }

    public UninstallCloudAppResponseBody setSuccessInstances(java.util.List<UninstallCloudAppResponseBodySuccessInstances> successInstances) {
        this.successInstances = successInstances;
        return this;
    }
    public java.util.List<UninstallCloudAppResponseBodySuccessInstances> getSuccessInstances() {
        return this.successInstances;
    }

    public static class UninstallCloudAppResponseBodyFailedInstances extends TeaModel {
        /**
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>300000</p>
         */
        @NameInMap("ErrCode")
        public Integer errCode;

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>Rejected due to timeout</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <p>Cloud application instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>render-b45f28650ffe4591bf4c5c95996a428c</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static UninstallCloudAppResponseBodyFailedInstances build(java.util.Map<String, ?> map) throws Exception {
            UninstallCloudAppResponseBodyFailedInstances self = new UninstallCloudAppResponseBodyFailedInstances();
            return TeaModel.build(map, self);
        }

        public UninstallCloudAppResponseBodyFailedInstances setErrCode(Integer errCode) {
            this.errCode = errCode;
            return this;
        }
        public Integer getErrCode() {
            return this.errCode;
        }

        public UninstallCloudAppResponseBodyFailedInstances setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public UninstallCloudAppResponseBodyFailedInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

    public static class UninstallCloudAppResponseBodySuccessInstances extends TeaModel {
        /**
         * <p>Cloud application instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>render-e6cf423c787e4e43b460a788da254fe3</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static UninstallCloudAppResponseBodySuccessInstances build(java.util.Map<String, ?> map) throws Exception {
            UninstallCloudAppResponseBodySuccessInstances self = new UninstallCloudAppResponseBodySuccessInstances();
            return TeaModel.build(map, self);
        }

        public UninstallCloudAppResponseBodySuccessInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

}
