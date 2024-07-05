// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDigitalWatermarkExtractResultResponseBody extends TeaModel {
    /**
     * <p>The details of the watermark extraction job.</p>
     */
    @NameInMap("AiExtractResultList")
    public java.util.List<GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList> aiExtractResultList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>42E0554B-80F4-4921-****-ACFB22CAAAD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDigitalWatermarkExtractResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalWatermarkExtractResultResponseBody self = new GetDigitalWatermarkExtractResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDigitalWatermarkExtractResultResponseBody setAiExtractResultList(java.util.List<GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList> aiExtractResultList) {
        this.aiExtractResultList = aiExtractResultList;
        return this;
    }
    public java.util.List<GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList> getAiExtractResultList() {
        return this.aiExtractResultList;
    }

    public GetDigitalWatermarkExtractResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList extends TeaModel {
        /**
         * <p>The time when the watermark extraction job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-16T02:49:04Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the watermark extraction job.</p>
         * 
         * <strong>example:</strong>
         * <p>3af004763bcf459698860f4ede20****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The time when the watermark extraction job was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-17T06:20:45Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The status of the watermark extraction job. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong></li>
         * <li><strong>Failed</strong></li>
         * <li><strong>Processing</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The extracted watermark content.</p>
         * 
         * <strong>example:</strong>
         * <p>test mark</p>
         */
        @NameInMap("WaterMarkText")
        public String waterMarkText;

        public static GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList build(java.util.Map<String, ?> map) throws Exception {
            GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList self = new GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList();
            return TeaModel.build(map, self);
        }

        public GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList setWaterMarkText(String waterMarkText) {
            this.waterMarkText = waterMarkText;
            return this;
        }
        public String getWaterMarkText() {
            return this.waterMarkText;
        }

    }

}
