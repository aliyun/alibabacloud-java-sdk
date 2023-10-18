// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWatermarkResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the watermark.</p>
     */
    @NameInMap("WatermarkInfo")
    public GetWatermarkResponseBodyWatermarkInfo watermarkInfo;

    public static GetWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkResponseBody self = new GetWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWatermarkResponseBody setWatermarkInfo(GetWatermarkResponseBodyWatermarkInfo watermarkInfo) {
        this.watermarkInfo = watermarkInfo;
        return this;
    }
    public GetWatermarkResponseBodyWatermarkInfo getWatermarkInfo() {
        return this.watermarkInfo;
    }

    public static class GetWatermarkResponseBodyWatermarkInfo extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the watermark was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The Object Storage Service (OSS) URL or CDN URL of the watermark file. A text watermark does not have a file URL.</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>Indicates whether the watermark is the default one. Valid values:</p>
         * <br>
         * <p>*   **Default**</p>
         * <p>*   **NotDefault**</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The name of the watermark.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the watermark. Valid values:</p>
         * <br>
         * <p>*   **Image**</p>
         * <p>*   **Text**</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The configuration information such as the position and effect about the text watermark or image watermark. The value is a JSON string. For more information about the data structure, see the "WatermarkConfig: specifies the watermark configurations" section of the [Parameters for media processing](~~98618~~) topic.</p>
         */
        @NameInMap("WatermarkConfig")
        public String watermarkConfig;

        /**
         * <p>The ID of the watermark.</p>
         */
        @NameInMap("WatermarkId")
        public String watermarkId;

        public static GetWatermarkResponseBodyWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarkResponseBodyWatermarkInfo self = new GetWatermarkResponseBodyWatermarkInfo();
            return TeaModel.build(map, self);
        }

        public GetWatermarkResponseBodyWatermarkInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetWatermarkResponseBodyWatermarkInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetWatermarkResponseBodyWatermarkInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetWatermarkResponseBodyWatermarkInfo setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public GetWatermarkResponseBodyWatermarkInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWatermarkResponseBodyWatermarkInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWatermarkResponseBodyWatermarkInfo setWatermarkConfig(String watermarkConfig) {
            this.watermarkConfig = watermarkConfig;
            return this;
        }
        public String getWatermarkConfig() {
            return this.watermarkConfig;
        }

        public GetWatermarkResponseBodyWatermarkInfo setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

    }

}
