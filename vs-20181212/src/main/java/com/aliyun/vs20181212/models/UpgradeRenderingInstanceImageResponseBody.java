// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingInstanceImageResponseBody extends TeaModel {
    /**
     * <p>The number of failed instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FailedCount")
    public Long failedCount;

    /**
     * <p>The information about failed instances.</p>
     */
    @NameInMap("FailedItems")
    public java.util.List<UpgradeRenderingInstanceImageResponseBodyFailedItems> failedItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of successful instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SuccessCount")
    public Long successCount;

    /**
     * <p>The information about successful instances.</p>
     */
    @NameInMap("SuccessItems")
    public java.util.List<UpgradeRenderingInstanceImageResponseBodySuccessItems> successItems;

    public static UpgradeRenderingInstanceImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingInstanceImageResponseBody self = new UpgradeRenderingInstanceImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingInstanceImageResponseBody setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public UpgradeRenderingInstanceImageResponseBody setFailedItems(java.util.List<UpgradeRenderingInstanceImageResponseBodyFailedItems> failedItems) {
        this.failedItems = failedItems;
        return this;
    }
    public java.util.List<UpgradeRenderingInstanceImageResponseBodyFailedItems> getFailedItems() {
        return this.failedItems;
    }

    public UpgradeRenderingInstanceImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeRenderingInstanceImageResponseBody setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public UpgradeRenderingInstanceImageResponseBody setSuccessItems(java.util.List<UpgradeRenderingInstanceImageResponseBodySuccessItems> successItems) {
        this.successItems = successItems;
        return this;
    }
    public java.util.List<UpgradeRenderingInstanceImageResponseBodySuccessItems> getSuccessItems() {
        return this.successItems;
    }

    public static class UpgradeRenderingInstanceImageResponseBodyFailedItems extends TeaModel {
        /**
         * <p>The error code of the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200302</p>
         */
        @NameInMap("ErrCode")
        public String errCode;

        /**
         * <p>The error message of the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Not Applied</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <p>The cloud application service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>render-072da95539d3402da90353b244191722</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static UpgradeRenderingInstanceImageResponseBodyFailedItems build(java.util.Map<String, ?> map) throws Exception {
            UpgradeRenderingInstanceImageResponseBodyFailedItems self = new UpgradeRenderingInstanceImageResponseBodyFailedItems();
            return TeaModel.build(map, self);
        }

        public UpgradeRenderingInstanceImageResponseBodyFailedItems setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public UpgradeRenderingInstanceImageResponseBodyFailedItems setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public UpgradeRenderingInstanceImageResponseBodyFailedItems setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

    public static class UpgradeRenderingInstanceImageResponseBodySuccessItems extends TeaModel {
        /**
         * <p>The cloud application service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>render-1ada8cd82783407b99fa202826fc6447</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static UpgradeRenderingInstanceImageResponseBodySuccessItems build(java.util.Map<String, ?> map) throws Exception {
            UpgradeRenderingInstanceImageResponseBodySuccessItems self = new UpgradeRenderingInstanceImageResponseBodySuccessItems();
            return TeaModel.build(map, self);
        }

        public UpgradeRenderingInstanceImageResponseBodySuccessItems setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

}
