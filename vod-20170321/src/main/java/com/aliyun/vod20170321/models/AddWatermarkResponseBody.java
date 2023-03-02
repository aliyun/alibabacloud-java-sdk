// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWatermarkResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the watermark.</p>
     */
    @NameInMap("WatermarkInfo")
    public AddWatermarkResponseBodyWatermarkInfo watermarkInfo;

    public static AddWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkResponseBody self = new AddWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public AddWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddWatermarkResponseBody setWatermarkInfo(AddWatermarkResponseBodyWatermarkInfo watermarkInfo) {
        this.watermarkInfo = watermarkInfo;
        return this;
    }
    public AddWatermarkResponseBodyWatermarkInfo getWatermarkInfo() {
        return this.watermarkInfo;
    }

    public static class AddWatermarkResponseBodyWatermarkInfo extends TeaModel {
        /**
         * <p>The time when the watermark was added. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The OSS URL or Content Delivery Network (CDN) URL of the watermark file. A text watermark does not have a file URL.</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>Indicates whether the watermark is the default one. Valid values:</p>
         * <p>*   **Default**: The watermark is the default one.</p>
         * <p>*   **NotDefault**: The watermark is not the default one.</p>
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
         * <p>*   **Image**: This is the default value.</p>
         * <p>*   **Text**</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The configurations such as the position and effect of the text watermark or image watermark. The value is a JSON-formatted string.</p>
         * <p>> The value of this parameter varies with the watermark type. For more information about the data structure, see the "WatermarkConfig" section of the [Media processing parameters](~~98618~~) topic.</p>
         */
        @NameInMap("WatermarkConfig")
        public String watermarkConfig;

        /**
         * <p>The ID of the watermark.</p>
         */
        @NameInMap("WatermarkId")
        public String watermarkId;

        public static AddWatermarkResponseBodyWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            AddWatermarkResponseBodyWatermarkInfo self = new AddWatermarkResponseBodyWatermarkInfo();
            return TeaModel.build(map, self);
        }

        public AddWatermarkResponseBodyWatermarkInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public AddWatermarkResponseBodyWatermarkInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public AddWatermarkResponseBodyWatermarkInfo setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public AddWatermarkResponseBodyWatermarkInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddWatermarkResponseBodyWatermarkInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddWatermarkResponseBodyWatermarkInfo setWatermarkConfig(String watermarkConfig) {
            this.watermarkConfig = watermarkConfig;
            return this;
        }
        public String getWatermarkConfig() {
            return this.watermarkConfig;
        }

        public AddWatermarkResponseBodyWatermarkInfo setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

    }

}
