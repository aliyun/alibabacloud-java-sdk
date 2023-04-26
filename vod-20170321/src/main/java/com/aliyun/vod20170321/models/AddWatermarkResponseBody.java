// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWatermarkResponseBody extends TeaModel {
    /**
     * <p>> For more information about how to upload a watermark file, see [CreateUploadAttachedMedia](~~98467~~).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Adds a watermark.</p>
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
