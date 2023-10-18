// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDigitalWatermarkExtractResultResponseBody extends TeaModel {
    @NameInMap("AiExtractResultList")
    public java.util.List<GetDigitalWatermarkExtractResultResponseBodyAiExtractResultList> aiExtractResultList;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Status")
        public String status;

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
