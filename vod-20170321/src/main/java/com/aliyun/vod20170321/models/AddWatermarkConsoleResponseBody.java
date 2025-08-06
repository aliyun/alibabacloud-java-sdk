// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWatermarkConsoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Watermark")
    public AddWatermarkConsoleResponseBodyWatermark watermark;

    @NameInMap("WatermarkInfo")
    public AddWatermarkConsoleResponseBodyWatermarkInfo watermarkInfo;

    public static AddWatermarkConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkConsoleResponseBody self = new AddWatermarkConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddWatermarkConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddWatermarkConsoleResponseBody setWatermark(AddWatermarkConsoleResponseBodyWatermark watermark) {
        this.watermark = watermark;
        return this;
    }
    public AddWatermarkConsoleResponseBodyWatermark getWatermark() {
        return this.watermark;
    }

    public AddWatermarkConsoleResponseBody setWatermarkInfo(AddWatermarkConsoleResponseBodyWatermarkInfo watermarkInfo) {
        this.watermarkInfo = watermarkInfo;
        return this;
    }
    public AddWatermarkConsoleResponseBodyWatermarkInfo getWatermarkInfo() {
        return this.watermarkInfo;
    }

    public static class AddWatermarkConsoleResponseBodyWatermark extends TeaModel {
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

        public static AddWatermarkConsoleResponseBodyWatermark build(java.util.Map<String, ?> map) throws Exception {
            AddWatermarkConsoleResponseBodyWatermark self = new AddWatermarkConsoleResponseBodyWatermark();
            return TeaModel.build(map, self);
        }

        public AddWatermarkConsoleResponseBodyWatermark setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public AddWatermarkConsoleResponseBodyWatermark setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public AddWatermarkConsoleResponseBodyWatermark setHorizontalOffset(String horizontalOffset) {
            this.horizontalOffset = horizontalOffset;
            return this;
        }
        public String getHorizontalOffset() {
            return this.horizontalOffset;
        }

        public AddWatermarkConsoleResponseBodyWatermark setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public AddWatermarkConsoleResponseBodyWatermark setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddWatermarkConsoleResponseBodyWatermark setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public AddWatermarkConsoleResponseBodyWatermark setScreenMode(String screenMode) {
            this.screenMode = screenMode;
            return this;
        }
        public String getScreenMode() {
            return this.screenMode;
        }

        public AddWatermarkConsoleResponseBodyWatermark setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public AddWatermarkConsoleResponseBodyWatermark setVerticalOffset(String verticalOffset) {
            this.verticalOffset = verticalOffset;
            return this;
        }
        public String getVerticalOffset() {
            return this.verticalOffset;
        }

        public AddWatermarkConsoleResponseBodyWatermark setVideoHeight(Integer videoHeight) {
            this.videoHeight = videoHeight;
            return this;
        }
        public Integer getVideoHeight() {
            return this.videoHeight;
        }

        public AddWatermarkConsoleResponseBodyWatermark setVideoWidth(Integer videoWidth) {
            this.videoWidth = videoWidth;
            return this;
        }
        public Integer getVideoWidth() {
            return this.videoWidth;
        }

        public AddWatermarkConsoleResponseBodyWatermark setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

        public AddWatermarkConsoleResponseBodyWatermark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class AddWatermarkConsoleResponseBodyWatermarkInfo extends TeaModel {
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

        public static AddWatermarkConsoleResponseBodyWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            AddWatermarkConsoleResponseBodyWatermarkInfo self = new AddWatermarkConsoleResponseBodyWatermarkInfo();
            return TeaModel.build(map, self);
        }

        public AddWatermarkConsoleResponseBodyWatermarkInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public AddWatermarkConsoleResponseBodyWatermarkInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public AddWatermarkConsoleResponseBodyWatermarkInfo setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public AddWatermarkConsoleResponseBodyWatermarkInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddWatermarkConsoleResponseBodyWatermarkInfo setScreenHeight(Integer screenHeight) {
            this.screenHeight = screenHeight;
            return this;
        }
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        public AddWatermarkConsoleResponseBodyWatermarkInfo setScreenWidth(Integer screenWidth) {
            this.screenWidth = screenWidth;
            return this;
        }
        public Integer getScreenWidth() {
            return this.screenWidth;
        }

        public AddWatermarkConsoleResponseBodyWatermarkInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddWatermarkConsoleResponseBodyWatermarkInfo setWatermarkConfig(String watermarkConfig) {
            this.watermarkConfig = watermarkConfig;
            return this;
        }
        public String getWatermarkConfig() {
            return this.watermarkConfig;
        }

        public AddWatermarkConsoleResponseBodyWatermarkInfo setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

    }

}
