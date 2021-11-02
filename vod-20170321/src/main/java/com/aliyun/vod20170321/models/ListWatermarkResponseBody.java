// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListWatermarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WatermarkInfos")
    public java.util.List<ListWatermarkResponseBodyWatermarkInfos> watermarkInfos;

    public static ListWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWatermarkResponseBody self = new ListWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWatermarkResponseBody setWatermarkInfos(java.util.List<ListWatermarkResponseBodyWatermarkInfos> watermarkInfos) {
        this.watermarkInfos = watermarkInfos;
        return this;
    }
    public java.util.List<ListWatermarkResponseBodyWatermarkInfos> getWatermarkInfos() {
        return this.watermarkInfos;
    }

    public static class ListWatermarkResponseBodyWatermarkInfos extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("IsDefault")
        public String isDefault;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("WatermarkConfig")
        public String watermarkConfig;

        @NameInMap("WatermarkId")
        public String watermarkId;

        public static ListWatermarkResponseBodyWatermarkInfos build(java.util.Map<String, ?> map) throws Exception {
            ListWatermarkResponseBodyWatermarkInfos self = new ListWatermarkResponseBodyWatermarkInfos();
            return TeaModel.build(map, self);
        }

        public ListWatermarkResponseBodyWatermarkInfos setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListWatermarkResponseBodyWatermarkInfos setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListWatermarkResponseBodyWatermarkInfos setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListWatermarkResponseBodyWatermarkInfos setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public ListWatermarkResponseBodyWatermarkInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWatermarkResponseBodyWatermarkInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListWatermarkResponseBodyWatermarkInfos setWatermarkConfig(String watermarkConfig) {
            this.watermarkConfig = watermarkConfig;
            return this;
        }
        public String getWatermarkConfig() {
            return this.watermarkConfig;
        }

        public ListWatermarkResponseBodyWatermarkInfos setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

    }

}
