// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListObjectGenerationProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<PopListObjectGenerationProjectResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Pages")
    public Integer pages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static PopListObjectGenerationProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopListObjectGenerationProjectResponseBody self = new PopListObjectGenerationProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public PopListObjectGenerationProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopListObjectGenerationProjectResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListObjectGenerationProjectResponseBody setData(java.util.List<PopListObjectGenerationProjectResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PopListObjectGenerationProjectResponseBodyData> getData() {
        return this.data;
    }

    public PopListObjectGenerationProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopListObjectGenerationProjectResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public PopListObjectGenerationProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopListObjectGenerationProjectResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PopListObjectGenerationProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PopListObjectGenerationProjectResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class PopListObjectGenerationProjectResponseBodyDataBuildDetail extends TeaModel {
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

        public static PopListObjectGenerationProjectResponseBodyDataBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            PopListObjectGenerationProjectResponseBodyDataBuildDetail self = new PopListObjectGenerationProjectResponseBodyDataBuildDetail();
            return TeaModel.build(map, self);
        }

        public PopListObjectGenerationProjectResponseBodyDataBuildDetail setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
        }

        public PopListObjectGenerationProjectResponseBodyDataBuildDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PopListObjectGenerationProjectResponseBodyDataBuildDetail setEstimatedDuration(Long estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        public PopListObjectGenerationProjectResponseBodyDataBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public PopListObjectGenerationProjectResponseBodyDataBuildDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class PopListObjectGenerationProjectResponseBodyDataDataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        public java.util.Map<String, ?> buildResultUrl;

        public static PopListObjectGenerationProjectResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            PopListObjectGenerationProjectResponseBodyDataDataset self = new PopListObjectGenerationProjectResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public PopListObjectGenerationProjectResponseBodyDataDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

    }

    public static class PopListObjectGenerationProjectResponseBodyData extends TeaModel {
        @NameInMap("BuildDetail")
        public PopListObjectGenerationProjectResponseBodyDataBuildDetail buildDetail;

        @NameInMap("Dataset")
        public PopListObjectGenerationProjectResponseBodyDataDataset dataset;

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

        public static PopListObjectGenerationProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopListObjectGenerationProjectResponseBodyData self = new PopListObjectGenerationProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopListObjectGenerationProjectResponseBodyData setBuildDetail(PopListObjectGenerationProjectResponseBodyDataBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public PopListObjectGenerationProjectResponseBodyDataBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public PopListObjectGenerationProjectResponseBodyData setDataset(PopListObjectGenerationProjectResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopListObjectGenerationProjectResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public PopListObjectGenerationProjectResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopListObjectGenerationProjectResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopListObjectGenerationProjectResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopListObjectGenerationProjectResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopListObjectGenerationProjectResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
