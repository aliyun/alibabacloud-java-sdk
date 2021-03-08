// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateWatermarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WatermarkInfo")
    public UpdateWatermarkResponseBodyWatermarkInfo watermarkInfo;

    public static UpdateWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkResponseBody self = new UpdateWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWatermarkResponseBody setWatermarkInfo(UpdateWatermarkResponseBodyWatermarkInfo watermarkInfo) {
        this.watermarkInfo = watermarkInfo;
        return this;
    }
    public UpdateWatermarkResponseBodyWatermarkInfo getWatermarkInfo() {
        return this.watermarkInfo;
    }

    public static class UpdateWatermarkResponseBodyWatermarkInfo extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("IsDefault")
        public String isDefault;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("WatermarkConfig")
        public String watermarkConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("WatermarkId")
        public String watermarkId;

        public static UpdateWatermarkResponseBodyWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateWatermarkResponseBodyWatermarkInfo self = new UpdateWatermarkResponseBodyWatermarkInfo();
            return TeaModel.build(map, self);
        }

        public UpdateWatermarkResponseBodyWatermarkInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public UpdateWatermarkResponseBodyWatermarkInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateWatermarkResponseBodyWatermarkInfo setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public UpdateWatermarkResponseBodyWatermarkInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public UpdateWatermarkResponseBodyWatermarkInfo setWatermarkConfig(String watermarkConfig) {
            this.watermarkConfig = watermarkConfig;
            return this;
        }
        public String getWatermarkConfig() {
            return this.watermarkConfig;
        }

        public UpdateWatermarkResponseBodyWatermarkInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWatermarkResponseBodyWatermarkInfo setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

    }

}
