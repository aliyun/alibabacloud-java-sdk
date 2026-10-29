// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchCaptureRenderingInstanceScreenshotResponseBody extends TeaModel {
    /**
     * <p>The data pre-check result.</p>
     */
    @NameInMap("Datatest")
    public BatchCaptureRenderingInstanceScreenshotResponseBodyDatatest datatest;

    /**
     * <p>The number of failed instances.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedCount")
    public Long failedCount;

    /**
     * <p>The list of instances for which screenshot capture failed.</p>
     */
    @NameInMap("FailedItems")
    public java.util.List<BatchCaptureRenderingInstanceScreenshotResponseBodyFailedItems> failedItems;

    /**
     * <p>Id of the request</p>
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
     * <p>The list of successful instances.</p>
     */
    @NameInMap("SuccessItems")
    public java.util.List<BatchCaptureRenderingInstanceScreenshotResponseBodySuccessItems> successItems;

    public static BatchCaptureRenderingInstanceScreenshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCaptureRenderingInstanceScreenshotResponseBody self = new BatchCaptureRenderingInstanceScreenshotResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCaptureRenderingInstanceScreenshotResponseBody setDatatest(BatchCaptureRenderingInstanceScreenshotResponseBodyDatatest datatest) {
        this.datatest = datatest;
        return this;
    }
    public BatchCaptureRenderingInstanceScreenshotResponseBodyDatatest getDatatest() {
        return this.datatest;
    }

    public BatchCaptureRenderingInstanceScreenshotResponseBody setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public BatchCaptureRenderingInstanceScreenshotResponseBody setFailedItems(java.util.List<BatchCaptureRenderingInstanceScreenshotResponseBodyFailedItems> failedItems) {
        this.failedItems = failedItems;
        return this;
    }
    public java.util.List<BatchCaptureRenderingInstanceScreenshotResponseBodyFailedItems> getFailedItems() {
        return this.failedItems;
    }

    public BatchCaptureRenderingInstanceScreenshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCaptureRenderingInstanceScreenshotResponseBody setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public BatchCaptureRenderingInstanceScreenshotResponseBody setSuccessItems(java.util.List<BatchCaptureRenderingInstanceScreenshotResponseBodySuccessItems> successItems) {
        this.successItems = successItems;
        return this;
    }
    public java.util.List<BatchCaptureRenderingInstanceScreenshotResponseBodySuccessItems> getSuccessItems() {
        return this.successItems;
    }

    public static class BatchCaptureRenderingInstanceScreenshotResponseBodyDatatestResult extends TeaModel {
        /**
         * <p>The number of successful instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static BatchCaptureRenderingInstanceScreenshotResponseBodyDatatestResult build(java.util.Map<String, ?> map) throws Exception {
            BatchCaptureRenderingInstanceScreenshotResponseBodyDatatestResult self = new BatchCaptureRenderingInstanceScreenshotResponseBodyDatatestResult();
            return TeaModel.build(map, self);
        }

        public BatchCaptureRenderingInstanceScreenshotResponseBodyDatatestResult setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class BatchCaptureRenderingInstanceScreenshotResponseBodyDatatest extends TeaModel {
        /**
         * <p>The pre-check result.</p>
         */
        @NameInMap("Result")
        public BatchCaptureRenderingInstanceScreenshotResponseBodyDatatestResult result;

        public static BatchCaptureRenderingInstanceScreenshotResponseBodyDatatest build(java.util.Map<String, ?> map) throws Exception {
            BatchCaptureRenderingInstanceScreenshotResponseBodyDatatest self = new BatchCaptureRenderingInstanceScreenshotResponseBodyDatatest();
            return TeaModel.build(map, self);
        }

        public BatchCaptureRenderingInstanceScreenshotResponseBodyDatatest setResult(BatchCaptureRenderingInstanceScreenshotResponseBodyDatatestResult result) {
            this.result = result;
            return this;
        }
        public BatchCaptureRenderingInstanceScreenshotResponseBodyDatatestResult getResult() {
            return this.result;
        }

    }

    public static class BatchCaptureRenderingInstanceScreenshotResponseBodyFailedItems extends TeaModel {
        /**
         * <p>The error code for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrCode")
        public String errCode;

        /**
         * <p>The reason for the failure.</p>
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

        public static BatchCaptureRenderingInstanceScreenshotResponseBodyFailedItems build(java.util.Map<String, ?> map) throws Exception {
            BatchCaptureRenderingInstanceScreenshotResponseBodyFailedItems self = new BatchCaptureRenderingInstanceScreenshotResponseBodyFailedItems();
            return TeaModel.build(map, self);
        }

        public BatchCaptureRenderingInstanceScreenshotResponseBodyFailedItems setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public BatchCaptureRenderingInstanceScreenshotResponseBodyFailedItems setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public BatchCaptureRenderingInstanceScreenshotResponseBodyFailedItems setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

    public static class BatchCaptureRenderingInstanceScreenshotResponseBodySuccessItems extends TeaModel {
        /**
         * <p>The time when the screenshot was created. The time is displayed in the ISO 8601 standard with a time zone offset in the YYYY-MM-DDTHH:mm:ss+HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-19T14:46:37+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The download URL of the screenshot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://testts-1.oss-cn-beijing.aliyuncs.com/app/test-zip-file.zip">https://testts-1.oss-cn-beijing.aliyuncs.com/app/test-zip-file.zip</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The cloud application service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>render-1ada8cd82783407b99fa202826fc6447</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        public static BatchCaptureRenderingInstanceScreenshotResponseBodySuccessItems build(java.util.Map<String, ?> map) throws Exception {
            BatchCaptureRenderingInstanceScreenshotResponseBodySuccessItems self = new BatchCaptureRenderingInstanceScreenshotResponseBodySuccessItems();
            return TeaModel.build(map, self);
        }

        public BatchCaptureRenderingInstanceScreenshotResponseBodySuccessItems setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public BatchCaptureRenderingInstanceScreenshotResponseBodySuccessItems setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public BatchCaptureRenderingInstanceScreenshotResponseBodySuccessItems setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

    }

}
