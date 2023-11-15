// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopQueryLatestAvatarProjectDetailByUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PopQueryLatestAvatarProjectDetailByUserResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopQueryLatestAvatarProjectDetailByUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopQueryLatestAvatarProjectDetailByUserResponseBody self = new PopQueryLatestAvatarProjectDetailByUserResponseBody();
        return TeaModel.build(map, self);
    }

    public PopQueryLatestAvatarProjectDetailByUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopQueryLatestAvatarProjectDetailByUserResponseBody setData(PopQueryLatestAvatarProjectDetailByUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PopQueryLatestAvatarProjectDetailByUserResponseBodyData getData() {
        return this.data;
    }

    public PopQueryLatestAvatarProjectDetailByUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopQueryLatestAvatarProjectDetailByUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopQueryLatestAvatarProjectDetailByUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopQueryLatestAvatarProjectDetailByUserResponseBodyDataBuildDetail extends TeaModel {
        @NameInMap("RunningTime")
        public String runningTime;

        @NameInMap("Status")
        public String status;

        public static PopQueryLatestAvatarProjectDetailByUserResponseBodyDataBuildDetail build(java.util.Map<String, ?> map) throws Exception {
            PopQueryLatestAvatarProjectDetailByUserResponseBodyDataBuildDetail self = new PopQueryLatestAvatarProjectDetailByUserResponseBodyDataBuildDetail();
            return TeaModel.build(map, self);
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyDataBuildDetail setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyDataBuildDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class PopQueryLatestAvatarProjectDetailByUserResponseBodyDataDataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        public java.util.Map<String, ?> buildResultUrl;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static PopQueryLatestAvatarProjectDetailByUserResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            PopQueryLatestAvatarProjectDetailByUserResponseBodyDataDataset self = new PopQueryLatestAvatarProjectDetailByUserResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyDataDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyDataDataset setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyDataDataset setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class PopQueryLatestAvatarProjectDetailByUserResponseBodyData extends TeaModel {
        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("BuildDetail")
        public PopQueryLatestAvatarProjectDetailByUserResponseBodyDataBuildDetail buildDetail;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Dataset")
        public PopQueryLatestAvatarProjectDetailByUserResponseBodyDataDataset dataset;

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

        public static PopQueryLatestAvatarProjectDetailByUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopQueryLatestAvatarProjectDetailByUserResponseBodyData self = new PopQueryLatestAvatarProjectDetailByUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyData setBuildDetail(PopQueryLatestAvatarProjectDetailByUserResponseBodyDataBuildDetail buildDetail) {
            this.buildDetail = buildDetail;
            return this;
        }
        public PopQueryLatestAvatarProjectDetailByUserResponseBodyDataBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyData setDataset(PopQueryLatestAvatarProjectDetailByUserResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopQueryLatestAvatarProjectDetailByUserResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopQueryLatestAvatarProjectDetailByUserResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
