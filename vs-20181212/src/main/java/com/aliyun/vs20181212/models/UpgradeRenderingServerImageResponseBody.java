// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingServerImageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedInstanceCount")
    public Integer failedInstanceCount;

    @NameInMap("FailedInstances")
    public java.util.List<UpgradeRenderingServerImageResponseBodyFailedInstances> failedInstances;

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
    public Integer successInstanceCount;

    /**
     * <strong>example:</strong>
     * <p>[&quot;render-4cb88f452e11448095cde66e1ecea9d9&quot;, &quot;render-507538b7906742449680742a194f831e&quot;]</p>
     */
    @NameInMap("SuccessInstances")
    public java.util.List<UpgradeRenderingServerImageResponseBodySuccessInstances> successInstances;

    public static UpgradeRenderingServerImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingServerImageResponseBody self = new UpgradeRenderingServerImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingServerImageResponseBody setFailedInstanceCount(Integer failedInstanceCount) {
        this.failedInstanceCount = failedInstanceCount;
        return this;
    }
    public Integer getFailedInstanceCount() {
        return this.failedInstanceCount;
    }

    public UpgradeRenderingServerImageResponseBody setFailedInstances(java.util.List<UpgradeRenderingServerImageResponseBodyFailedInstances> failedInstances) {
        this.failedInstances = failedInstances;
        return this;
    }
    public java.util.List<UpgradeRenderingServerImageResponseBodyFailedInstances> getFailedInstances() {
        return this.failedInstances;
    }

    public UpgradeRenderingServerImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeRenderingServerImageResponseBody setSuccessInstanceCount(Integer successInstanceCount) {
        this.successInstanceCount = successInstanceCount;
        return this;
    }
    public Integer getSuccessInstanceCount() {
        return this.successInstanceCount;
    }

    public UpgradeRenderingServerImageResponseBody setSuccessInstances(java.util.List<UpgradeRenderingServerImageResponseBodySuccessInstances> successInstances) {
        this.successInstances = successInstances;
        return this;
    }
    public java.util.List<UpgradeRenderingServerImageResponseBodySuccessInstances> getSuccessInstances() {
        return this.successInstances;
    }

    public static class UpgradeRenderingServerImageResponseBodyFailedInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>300000</p>
         */
        @NameInMap("ErrCode")
        public Integer errCode;

        /**
         * <strong>example:</strong>
         * <p>Rejected due to timeout</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <strong>example:</strong>
         * <p>render-421cd2a1125947c19fcd5c7dd2c7d31e</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static UpgradeRenderingServerImageResponseBodyFailedInstances build(java.util.Map<String, ?> map) throws Exception {
            UpgradeRenderingServerImageResponseBodyFailedInstances self = new UpgradeRenderingServerImageResponseBodyFailedInstances();
            return TeaModel.build(map, self);
        }

        public UpgradeRenderingServerImageResponseBodyFailedInstances setErrCode(Integer errCode) {
            this.errCode = errCode;
            return this;
        }
        public Integer getErrCode() {
            return this.errCode;
        }

        public UpgradeRenderingServerImageResponseBodyFailedInstances setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public UpgradeRenderingServerImageResponseBodyFailedInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

    public static class UpgradeRenderingServerImageResponseBodySuccessInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>render-e6cf423c787e4e43b460a788da254fe3</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static UpgradeRenderingServerImageResponseBodySuccessInstances build(java.util.Map<String, ?> map) throws Exception {
            UpgradeRenderingServerImageResponseBodySuccessInstances self = new UpgradeRenderingServerImageResponseBodySuccessInstances();
            return TeaModel.build(map, self);
        }

        public UpgradeRenderingServerImageResponseBodySuccessInstances setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

}
