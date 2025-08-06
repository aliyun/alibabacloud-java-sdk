// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateWatermarkConsoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Watermark")
    public UpdateWatermarkConsoleResponseBodyWatermark watermark;

    @NameInMap("WatermarkInfo")
    public UpdateWatermarkConsoleResponseBodyWatermarkInfo watermarkInfo;

    public static UpdateWatermarkConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkConsoleResponseBody self = new UpdateWatermarkConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWatermarkConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWatermarkConsoleResponseBody setWatermark(UpdateWatermarkConsoleResponseBodyWatermark watermark) {
        this.watermark = watermark;
        return this;
    }
    public UpdateWatermarkConsoleResponseBodyWatermark getWatermark() {
        return this.watermark;
    }

    public UpdateWatermarkConsoleResponseBody setWatermarkInfo(UpdateWatermarkConsoleResponseBodyWatermarkInfo watermarkInfo) {
        this.watermarkInfo = watermarkInfo;
        return this;
    }
    public UpdateWatermarkConsoleResponseBodyWatermarkInfo getWatermarkInfo() {
        return this.watermarkInfo;
    }

    public static class UpdateWatermarkConsoleResponseBodyWatermark extends TeaModel {
        @NameInMap("CreateTime")
        public Integer createTime;

        @NameInMap("Height")
        public String height;

        @NameInMap("HorizontalOffset")
        public String horizontalOffset;

        @NameInMap("IsDefault")
        public String isDefault;

        @NameInMap("Name")
        public String name;

        @NameInMap("Position")
        public String position;

        @NameInMap("ScreenMode")
        public String screenMode;

        @NameInMap("Url")
        public String url;

        @NameInMap("VerticalOffset")
        public String verticalOffset;

        @NameInMap("VideoHeight")
        public Integer videoHeight;

        @NameInMap("VideoWidth")
        public Integer videoWidth;

        @NameInMap("WatermarkId")
        public String watermarkId;

        @NameInMap("Width")
        public String width;

        public static UpdateWatermarkConsoleResponseBodyWatermark build(java.util.Map<String, ?> map) throws Exception {
            UpdateWatermarkConsoleResponseBodyWatermark self = new UpdateWatermarkConsoleResponseBodyWatermark();
            return TeaModel.build(map, self);
        }

        public UpdateWatermarkConsoleResponseBodyWatermark setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public UpdateWatermarkConsoleResponseBodyWatermark setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public UpdateWatermarkConsoleResponseBodyWatermark setHorizontalOffset(String horizontalOffset) {
            this.horizontalOffset = horizontalOffset;
            return this;
        }
        public String getHorizontalOffset() {
            return this.horizontalOffset;
        }

        public UpdateWatermarkConsoleResponseBodyWatermark setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public UpdateWatermarkConsoleResponseBodyWatermark setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWatermarkConsoleResponseBodyWatermark setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public UpdateWatermarkConsoleResponseBodyWatermark setScreenMode(String screenMode) {
            this.screenMode = screenMode;
            return this;
        }
        public String getScreenMode() {
            return this.screenMode;
        }

        public UpdateWatermarkConsoleResponseBodyWatermark setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateWatermarkConsoleResponseBodyWatermark setVerticalOffset(String verticalOffset) {
            this.verticalOffset = verticalOffset;
            return this;
        }
        public String getVerticalOffset() {
            return this.verticalOffset;
        }

        public UpdateWatermarkConsoleResponseBodyWatermark setVideoHeight(Integer videoHeight) {
            this.videoHeight = videoHeight;
            return this;
        }
        public Integer getVideoHeight() {
            return this.videoHeight;
        }

        public UpdateWatermarkConsoleResponseBodyWatermark setVideoWidth(Integer videoWidth) {
            this.videoWidth = videoWidth;
            return this;
        }
        public Integer getVideoWidth() {
            return this.videoWidth;
        }

        public UpdateWatermarkConsoleResponseBodyWatermark setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

        public UpdateWatermarkConsoleResponseBodyWatermark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class UpdateWatermarkConsoleResponseBodyWatermarkInfo extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("IsDefault")
        public String isDefault;

        @NameInMap("Name")
        public String name;

        @NameInMap("ScreenHeight")
        public Integer screenHeight;

        @NameInMap("ScreenWidth")
        public Integer screenWidth;

        @NameInMap("Type")
        public String type;

        @NameInMap("WatermarkConfig")
        public String watermarkConfig;

        @NameInMap("WatermarkId")
        public String watermarkId;

        public static UpdateWatermarkConsoleResponseBodyWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateWatermarkConsoleResponseBodyWatermarkInfo self = new UpdateWatermarkConsoleResponseBodyWatermarkInfo();
            return TeaModel.build(map, self);
        }

        public UpdateWatermarkConsoleResponseBodyWatermarkInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public UpdateWatermarkConsoleResponseBodyWatermarkInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public UpdateWatermarkConsoleResponseBodyWatermarkInfo setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public UpdateWatermarkConsoleResponseBodyWatermarkInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWatermarkConsoleResponseBodyWatermarkInfo setScreenHeight(Integer screenHeight) {
            this.screenHeight = screenHeight;
            return this;
        }
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        public UpdateWatermarkConsoleResponseBodyWatermarkInfo setScreenWidth(Integer screenWidth) {
            this.screenWidth = screenWidth;
            return this;
        }
        public Integer getScreenWidth() {
            return this.screenWidth;
        }

        public UpdateWatermarkConsoleResponseBodyWatermarkInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateWatermarkConsoleResponseBodyWatermarkInfo setWatermarkConfig(String watermarkConfig) {
            this.watermarkConfig = watermarkConfig;
            return this;
        }
        public String getWatermarkConfig() {
            return this.watermarkConfig;
        }

        public UpdateWatermarkConsoleResponseBodyWatermarkInfo setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

    }

}
