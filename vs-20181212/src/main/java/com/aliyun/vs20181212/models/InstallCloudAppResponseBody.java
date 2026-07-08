// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class InstallCloudAppResponseBody extends TeaModel {
    /**
     * <p>Number of failed cloud application service instances</p>
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
    public java.util.List<InstallCloudAppResponseBodyFailedInstances> failedInstances;

    /**
     * <p>Request ID</p>
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
     * <p>List of successful cloud application service instances</p>
     */
    @NameInMap("SuccessInstances")
    public java.util.List<InstallCloudAppResponseBodySuccessInstances> successInstances;

    public static InstallCloudAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallCloudAppResponseBody self = new InstallCloudAppResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallCloudAppResponseBody setFailedInstanceCount(Integer failedInstanceCount) {
        this.failedInstanceCount = failedInstanceCount;
        return this;
    }
    public Integer getFailedInstanceCount() {
        return this.failedInstanceCount;
    }

    public InstallCloudAppResponseBody setFailedInstances(java.util.List<InstallCloudAppResponseBodyFailedInstances> failedInstances) {
        this.failedInstances = failedInstances;
        return this;
    }
    public java.util.List<InstallCloudAppResponseBodyFailedInstances> getFailedInstances() {
        return this.failedInstances;
    }

    public InstallCloudAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallCloudAppResponseBody setSuccessInstanceCount(Integer successInstanceCount) {
        this.successInstanceCount = successInstanceCount;
        return this;
    }
    public Integer getSuccessInstanceCount() {
        return this.successInstanceCount;
    }

    public InstallCloudAppResponseBody setSuccessInstances(java.util.List<InstallCloudAppResponseBodySuccessInstances> successInstances) {
        this.successInstances = successInstances;
        return this;
    }
    public java.util.List<InstallCloudAppResponseBodySuccessInstances> getSuccessInstances() {
        return this.successInstances;
    }

    public static class InstallCloudAppResponseBodyFailedInstances extends TeaModel {
        /**
         * <p>Failure error code</p>
         * 
         * <strong>example:</strong>
         * <p>300000</p>
         */
        @NameInMap("ErrCode")
        public Integer errCode;

        /**
         * <p>Failure reason message</p>
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
         * <p>render-b45f28650ffe4591bf4c5c95996a428c</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static InstallCloudAppResponseBodyFailedInstances build(java.util.Map<String, ?> map) throws Exception {
            InstallCloudAppResponseBodyFailedInstances self = new InstallCloudAppResponseBodyFailedInstances();
            return TeaModel.build(map, self);
        }

        public InstallCloudAppResponseBodyFailedInstances setErrCode(Integer errCode) {
            this.errCode = errCode;
            return this;
        }
        public Integer getErrCode() {
            return this.errCode;
        }

        public InstallCloudAppResponseBodyFailedInstances setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public InstallCloudAppResponseBodyFailedInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

    public static class InstallCloudAppResponseBodySuccessInstances extends TeaModel {
        /**
         * <p>Cloud application service instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>render-5130e2feb23f442fb9456a3d977f03d4</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static InstallCloudAppResponseBodySuccessInstances build(java.util.Map<String, ?> map) throws Exception {
            InstallCloudAppResponseBodySuccessInstances self = new InstallCloudAppResponseBodySuccessInstances();
            return TeaModel.build(map, self);
        }

        public InstallCloudAppResponseBodySuccessInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

}
