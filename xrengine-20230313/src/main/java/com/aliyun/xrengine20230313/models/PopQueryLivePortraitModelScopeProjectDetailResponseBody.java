// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopQueryLivePortraitModelScopeProjectDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PopQueryLivePortraitModelScopeProjectDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopQueryLivePortraitModelScopeProjectDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopQueryLivePortraitModelScopeProjectDetailResponseBody self = new PopQueryLivePortraitModelScopeProjectDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public PopQueryLivePortraitModelScopeProjectDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopQueryLivePortraitModelScopeProjectDetailResponseBody setData(PopQueryLivePortraitModelScopeProjectDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PopQueryLivePortraitModelScopeProjectDetailResponseBodyData getData() {
        return this.data;
    }

    public PopQueryLivePortraitModelScopeProjectDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopQueryLivePortraitModelScopeProjectDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopQueryLivePortraitModelScopeProjectDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopQueryLivePortraitModelScopeProjectDetailResponseBodyDataDataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        public java.util.Map<String, ?> buildResultUrl;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static PopQueryLivePortraitModelScopeProjectDetailResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            PopQueryLivePortraitModelScopeProjectDetailResponseBodyDataDataset self = new PopQueryLivePortraitModelScopeProjectDetailResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyDataDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyDataDataset setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyDataDataset setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class PopQueryLivePortraitModelScopeProjectDetailResponseBodyData extends TeaModel {
        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("Dataset")
        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyDataDataset dataset;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("Id")
        public String id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("MaterialCoverUrl")
        public String materialCoverUrl;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static PopQueryLivePortraitModelScopeProjectDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopQueryLivePortraitModelScopeProjectDetailResponseBodyData self = new PopQueryLivePortraitModelScopeProjectDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyData setDataset(PopQueryLivePortraitModelScopeProjectDetailResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyData setMaterialCoverUrl(String materialCoverUrl) {
            this.materialCoverUrl = materialCoverUrl;
            return this;
        }
        public String getMaterialCoverUrl() {
            return this.materialCoverUrl;
        }

        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PopQueryLivePortraitModelScopeProjectDetailResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
