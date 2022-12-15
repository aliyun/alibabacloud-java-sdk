// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class GetSDKInstanceDebugInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSDKInstanceDebugInfoResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Ok")
    public Boolean ok;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSDKInstanceDebugInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSDKInstanceDebugInfoResponseBody self = new GetSDKInstanceDebugInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSDKInstanceDebugInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSDKInstanceDebugInfoResponseBody setData(GetSDKInstanceDebugInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSDKInstanceDebugInfoResponseBodyData getData() {
        return this.data;
    }

    public GetSDKInstanceDebugInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSDKInstanceDebugInfoResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetSDKInstanceDebugInfoResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public GetSDKInstanceDebugInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSDKInstanceDebugInfoResponseBodyDataEvents extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static GetSDKInstanceDebugInfoResponseBodyDataEvents build(java.util.Map<String, ?> map) throws Exception {
            GetSDKInstanceDebugInfoResponseBodyDataEvents self = new GetSDKInstanceDebugInfoResponseBodyDataEvents();
            return TeaModel.build(map, self);
        }

        public GetSDKInstanceDebugInfoResponseBodyDataEvents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetSDKInstanceDebugInfoResponseBodyDataEvents setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSDKInstanceDebugInfoResponseBodyDataEvents setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetSDKInstanceDebugInfoResponseBodyDataEvents setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class GetSDKInstanceDebugInfoResponseBodyData extends TeaModel {
        @NameInMap("BundleId")
        public String bundleId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Events")
        public java.util.List<GetSDKInstanceDebugInfoResponseBodyDataEvents> events;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LatestBuild")
        public String latestBuild;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Recipe")
        public String recipe;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("ValidFromDate")
        public String validFromDate;

        @NameInMap("ValidToDate")
        public String validToDate;

        public static GetSDKInstanceDebugInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSDKInstanceDebugInfoResponseBodyData self = new GetSDKInstanceDebugInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSDKInstanceDebugInfoResponseBodyData setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public GetSDKInstanceDebugInfoResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetSDKInstanceDebugInfoResponseBodyData setEvents(java.util.List<GetSDKInstanceDebugInfoResponseBodyDataEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<GetSDKInstanceDebugInfoResponseBodyDataEvents> getEvents() {
            return this.events;
        }

        public GetSDKInstanceDebugInfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetSDKInstanceDebugInfoResponseBodyData setLatestBuild(String latestBuild) {
            this.latestBuild = latestBuild;
            return this;
        }
        public String getLatestBuild() {
            return this.latestBuild;
        }

        public GetSDKInstanceDebugInfoResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetSDKInstanceDebugInfoResponseBodyData setRecipe(String recipe) {
            this.recipe = recipe;
            return this;
        }
        public String getRecipe() {
            return this.recipe;
        }

        public GetSDKInstanceDebugInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSDKInstanceDebugInfoResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetSDKInstanceDebugInfoResponseBodyData setValidFromDate(String validFromDate) {
            this.validFromDate = validFromDate;
            return this;
        }
        public String getValidFromDate() {
            return this.validFromDate;
        }

        public GetSDKInstanceDebugInfoResponseBodyData setValidToDate(String validToDate) {
            this.validToDate = validToDate;
            return this;
        }
        public String getValidToDate() {
            return this.validToDate;
        }

    }

}
