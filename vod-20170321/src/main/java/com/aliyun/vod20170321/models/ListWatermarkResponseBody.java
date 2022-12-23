// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListWatermarkResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The watermarks.
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
        // The ID of the application.
        @NameInMap("AppId")
        public String appId;

        // The time when the watermark was added. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The Object Storage Service (OSS) URL or Content Delivery Network (CDN) URL of the watermark file. A text watermark does not have a file URL.
        @NameInMap("FileUrl")
        public String fileUrl;

        // Indicates whether the watermark is the default one. Valid values:
        // *   **Default**: The watermark is the default one.
        // *   **NotDefault**: The watermark is not the default one.
        @NameInMap("IsDefault")
        public String isDefault;

        // The name of the watermark.
        @NameInMap("Name")
        public String name;

        // The type of the watermark. Valid values:
        // *   **Image**
        // *   **Text**
        @NameInMap("Type")
        public String type;

        // The configurations such as the position and effect of the text watermark or image watermark. The value is a JSON-formatted string. For more information about the data structure, see the "WatermarkConfig" section of the [Media processing parameters](~~98618~~) topic.
        @NameInMap("WatermarkConfig")
        public String watermarkConfig;

        // The ID of the watermark.
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
