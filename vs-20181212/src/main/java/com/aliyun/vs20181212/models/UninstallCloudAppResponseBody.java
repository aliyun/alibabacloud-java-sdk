// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UninstallCloudAppResponseBody extends TeaModel {
    @NameInMap("FailedInstanceCount")
    public Integer failedInstanceCount;

    @NameInMap("FailedInstances")
    public java.util.List<UninstallCloudAppResponseBodyFailedInstances> failedInstances;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessInstanceCount")
    public Integer successInstanceCount;

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
        @NameInMap("ErrCode")
        public Integer errCode;

        @NameInMap("ErrMessage")
        public String errMessage;

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
