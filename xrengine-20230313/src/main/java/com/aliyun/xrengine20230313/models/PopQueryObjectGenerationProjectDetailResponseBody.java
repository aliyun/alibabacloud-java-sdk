// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopQueryObjectGenerationProjectDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PopQueryObjectGenerationProjectDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopQueryObjectGenerationProjectDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopQueryObjectGenerationProjectDetailResponseBody self = new PopQueryObjectGenerationProjectDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public PopQueryObjectGenerationProjectDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopQueryObjectGenerationProjectDetailResponseBody setData(PopQueryObjectGenerationProjectDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PopQueryObjectGenerationProjectDetailResponseBodyData getData() {
        return this.data;
    }

    public PopQueryObjectGenerationProjectDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopQueryObjectGenerationProjectDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopQueryObjectGenerationProjectDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopQueryObjectGenerationProjectDetailResponseBodyDataBuildDetail extends TeaModel {
        @NameInMap("CompletedTime")
        public String completedTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("EstimatedDuration")
        public Long estimatedDuration;

        @NameInMap("RunningTime")
        public String runningTime;

        @NameInMap("SubmitTime")
        public String submitTime;

        public static PopQueryObjectGenerationProjectDetailResponseBodyDataBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            PopQueryObjectGenerationProjectDetailResponseBodyDataBuildDetail self = new PopQueryObjectGenerationProjectDetailResponseBodyDataBuildDetail();
            return TeaModel.build(map, self);
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyDataBuildDetail setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyDataBuildDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyDataBuildDetail setEstimatedDuration(Long estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyDataBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyDataBuildDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class PopQueryObjectGenerationProjectDetailResponseBodyDataDataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        public java.util.Map<String, ?> buildResultUrl;

        public static PopQueryObjectGenerationProjectDetailResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            PopQueryObjectGenerationProjectDetailResponseBodyDataDataset self = new PopQueryObjectGenerationProjectDetailResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyDataDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

    }

    public static class PopQueryObjectGenerationProjectDetailResponseBodyData extends TeaModel {
        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("BuildDetail")
        public PopQueryObjectGenerationProjectDetailResponseBodyDataBuildDetail buildDetail;

        @NameInMap("Dataset")
        public PopQueryObjectGenerationProjectDetailResponseBodyDataDataset dataset;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("Id")
        public String id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        public static PopQueryObjectGenerationProjectDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopQueryObjectGenerationProjectDetailResponseBodyData self = new PopQueryObjectGenerationProjectDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyData setBuildDetail(PopQueryObjectGenerationProjectDetailResponseBodyDataBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public PopQueryObjectGenerationProjectDetailResponseBodyDataBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyData setDataset(PopQueryObjectGenerationProjectDetailResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopQueryObjectGenerationProjectDetailResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopQueryObjectGenerationProjectDetailResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
