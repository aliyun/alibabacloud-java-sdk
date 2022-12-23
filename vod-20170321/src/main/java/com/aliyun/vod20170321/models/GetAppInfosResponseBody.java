// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAppInfosResponseBody extends TeaModel {
    // The details of each application.
    @NameInMap("AppInfoList")
    public java.util.List<GetAppInfosResponseBodyAppInfoList> appInfoList;

    @NameInMap("Code")
    public String code;

    // The ID of the application that was not found.
    @NameInMap("NonExistAppIds")
    public java.util.List<String> nonExistAppIds;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static GetAppInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppInfosResponseBody self = new GetAppInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppInfosResponseBody setAppInfoList(java.util.List<GetAppInfosResponseBodyAppInfoList> appInfoList) {
        this.appInfoList = appInfoList;
        return this;
    }
    public java.util.List<GetAppInfosResponseBodyAppInfoList> getAppInfoList() {
        return this.appInfoList;
    }

    public GetAppInfosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppInfosResponseBody setNonExistAppIds(java.util.List<String> nonExistAppIds) {
        this.nonExistAppIds = nonExistAppIds;
        return this;
    }
    public java.util.List<String> getNonExistAppIds() {
        return this.nonExistAppIds;
    }

    public GetAppInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppInfosResponseBodyAppInfoList extends TeaModel {
        // The ID of the application.
        @NameInMap("AppId")
        public String appId;

        // The name of the application.
        @NameInMap("AppName")
        public String appName;

        // The time when the application was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the application.
        @NameInMap("Description")
        public String description;

        // The last time when the application was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("ModificationTime")
        public String modificationTime;

        // The status of the application. Valid values:
        // - **Normal**
        // - **Disable**
        @NameInMap("Status")
        public String status;

        // The type of the application. Valid values:
        // - **System**
        // - **Custom**
        @NameInMap("Type")
        public String type;

        public static GetAppInfosResponseBodyAppInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetAppInfosResponseBodyAppInfoList self = new GetAppInfosResponseBodyAppInfoList();
            return TeaModel.build(map, self);
        }

        public GetAppInfosResponseBodyAppInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAppInfosResponseBodyAppInfoList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetAppInfosResponseBodyAppInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetAppInfosResponseBodyAppInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAppInfosResponseBodyAppInfoList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetAppInfosResponseBodyAppInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAppInfosResponseBodyAppInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
