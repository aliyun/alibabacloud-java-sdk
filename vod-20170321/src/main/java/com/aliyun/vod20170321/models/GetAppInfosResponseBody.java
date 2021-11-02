// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAppInfosResponseBody extends TeaModel {
    @NameInMap("AppInfoList")
    public java.util.List<GetAppInfosResponseBodyAppInfoList> appInfoList;

    @NameInMap("NonExistAppIds")
    public java.util.List<String> nonExistAppIds;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("Status")
        public String status;

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
