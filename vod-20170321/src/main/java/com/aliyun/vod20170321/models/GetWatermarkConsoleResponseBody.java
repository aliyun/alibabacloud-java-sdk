// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWatermarkConsoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Watermark")
    public GetWatermarkConsoleResponseBodyWatermark watermark;

    @NameInMap("WatermarkInfo")
    public GetWatermarkConsoleResponseBodyWatermarkInfo watermarkInfo;

    public static GetWatermarkConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkConsoleResponseBody self = new GetWatermarkConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWatermarkConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWatermarkConsoleResponseBody setWatermark(GetWatermarkConsoleResponseBodyWatermark watermark) {
        this.watermark = watermark;
        return this;
    }
    public GetWatermarkConsoleResponseBodyWatermark getWatermark() {
        return this.watermark;
    }

    public GetWatermarkConsoleResponseBody setWatermarkInfo(GetWatermarkConsoleResponseBodyWatermarkInfo watermarkInfo) {
        this.watermarkInfo = watermarkInfo;
        return this;
    }
    public GetWatermarkConsoleResponseBodyWatermarkInfo getWatermarkInfo() {
        return this.watermarkInfo;
    }

    public static class GetWatermarkConsoleResponseBodyWatermark extends TeaModel {
        @NameInMap("Active")
        public String active;

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

        public static GetWatermarkConsoleResponseBodyWatermark build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarkConsoleResponseBodyWatermark self = new GetWatermarkConsoleResponseBodyWatermark();
            return TeaModel.build(map, self);
        }

        public GetWatermarkConsoleResponseBodyWatermark setActive(String active) {
            this.active = active;
            return this;
        }
        public String getActive() {
            return this.active;
        }

        public GetWatermarkConsoleResponseBodyWatermark setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public GetWatermarkConsoleResponseBodyWatermark setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetWatermarkConsoleResponseBodyWatermark setHorizontalOffset(String horizontalOffset) {
            this.horizontalOffset = horizontalOffset;
            return this;
        }
        public String getHorizontalOffset() {
            return this.horizontalOffset;
        }

        public GetWatermarkConsoleResponseBodyWatermark setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public GetWatermarkConsoleResponseBodyWatermark setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWatermarkConsoleResponseBodyWatermark setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public GetWatermarkConsoleResponseBodyWatermark setScreenMode(String screenMode) {
            this.screenMode = screenMode;
            return this;
        }
        public String getScreenMode() {
            return this.screenMode;
        }

        public GetWatermarkConsoleResponseBodyWatermark setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetWatermarkConsoleResponseBodyWatermark setVerticalOffset(String verticalOffset) {
            this.verticalOffset = verticalOffset;
            return this;
        }
        public String getVerticalOffset() {
            return this.verticalOffset;
        }

        public GetWatermarkConsoleResponseBodyWatermark setVideoHeight(Integer videoHeight) {
            this.videoHeight = videoHeight;
            return this;
        }
        public Integer getVideoHeight() {
            return this.videoHeight;
        }

        public GetWatermarkConsoleResponseBodyWatermark setVideoWidth(Integer videoWidth) {
            this.videoWidth = videoWidth;
            return this;
        }
        public Integer getVideoWidth() {
            return this.videoWidth;
        }

        public GetWatermarkConsoleResponseBodyWatermark setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

        public GetWatermarkConsoleResponseBodyWatermark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetWatermarkConsoleResponseBodyWatermarkInfo extends TeaModel {
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

        public static GetWatermarkConsoleResponseBodyWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarkConsoleResponseBodyWatermarkInfo self = new GetWatermarkConsoleResponseBodyWatermarkInfo();
            return TeaModel.build(map, self);
        }

        public GetWatermarkConsoleResponseBodyWatermarkInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetWatermarkConsoleResponseBodyWatermarkInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetWatermarkConsoleResponseBodyWatermarkInfo setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public GetWatermarkConsoleResponseBodyWatermarkInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWatermarkConsoleResponseBodyWatermarkInfo setScreenHeight(Integer screenHeight) {
            this.screenHeight = screenHeight;
            return this;
        }
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        public GetWatermarkConsoleResponseBodyWatermarkInfo setScreenWidth(Integer screenWidth) {
            this.screenWidth = screenWidth;
            return this;
        }
        public Integer getScreenWidth() {
            return this.screenWidth;
        }

        public GetWatermarkConsoleResponseBodyWatermarkInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWatermarkConsoleResponseBodyWatermarkInfo setWatermarkConfig(String watermarkConfig) {
            this.watermarkConfig = watermarkConfig;
            return this;
        }
        public String getWatermarkConfig() {
            return this.watermarkConfig;
        }

        public GetWatermarkConsoleResponseBodyWatermarkInfo setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

    }

}
