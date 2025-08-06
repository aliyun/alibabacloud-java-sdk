// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWatermarksConsoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WatermarkInfos")
    public GetWatermarksConsoleResponseBodyWatermarkInfos watermarkInfos;

    @NameInMap("Watermarks")
    public GetWatermarksConsoleResponseBodyWatermarks watermarks;

    public static GetWatermarksConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarksConsoleResponseBody self = new GetWatermarksConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWatermarksConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWatermarksConsoleResponseBody setWatermarkInfos(GetWatermarksConsoleResponseBodyWatermarkInfos watermarkInfos) {
        this.watermarkInfos = watermarkInfos;
        return this;
    }
    public GetWatermarksConsoleResponseBodyWatermarkInfos getWatermarkInfos() {
        return this.watermarkInfos;
    }

    public GetWatermarksConsoleResponseBody setWatermarks(GetWatermarksConsoleResponseBodyWatermarks watermarks) {
        this.watermarks = watermarks;
        return this;
    }
    public GetWatermarksConsoleResponseBodyWatermarks getWatermarks() {
        return this.watermarks;
    }

    public static class GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo extends TeaModel {
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

        public static GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo self = new GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo();
            return TeaModel.build(map, self);
        }

        public GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo setScreenHeight(Integer screenHeight) {
            this.screenHeight = screenHeight;
            return this;
        }
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        public GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo setScreenWidth(Integer screenWidth) {
            this.screenWidth = screenWidth;
            return this;
        }
        public Integer getScreenWidth() {
            return this.screenWidth;
        }

        public GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo setWatermarkConfig(String watermarkConfig) {
            this.watermarkConfig = watermarkConfig;
            return this;
        }
        public String getWatermarkConfig() {
            return this.watermarkConfig;
        }

        public GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

    }

    public static class GetWatermarksConsoleResponseBodyWatermarkInfos extends TeaModel {
        @NameInMap("WatermarkInfo")
        public java.util.List<GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo> watermarkInfo;

        public static GetWatermarksConsoleResponseBodyWatermarkInfos build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarksConsoleResponseBodyWatermarkInfos self = new GetWatermarksConsoleResponseBodyWatermarkInfos();
            return TeaModel.build(map, self);
        }

        public GetWatermarksConsoleResponseBodyWatermarkInfos setWatermarkInfo(java.util.List<GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo> watermarkInfo) {
            this.watermarkInfo = watermarkInfo;
            return this;
        }
        public java.util.List<GetWatermarksConsoleResponseBodyWatermarkInfosWatermarkInfo> getWatermarkInfo() {
            return this.watermarkInfo;
        }

    }

    public static class GetWatermarksConsoleResponseBodyWatermarksWatermark extends TeaModel {
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

        public static GetWatermarksConsoleResponseBodyWatermarksWatermark build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarksConsoleResponseBodyWatermarksWatermark self = new GetWatermarksConsoleResponseBodyWatermarksWatermark();
            return TeaModel.build(map, self);
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setActive(String active) {
            this.active = active;
            return this;
        }
        public String getActive() {
            return this.active;
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setHorizontalOffset(String horizontalOffset) {
            this.horizontalOffset = horizontalOffset;
            return this;
        }
        public String getHorizontalOffset() {
            return this.horizontalOffset;
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setScreenMode(String screenMode) {
            this.screenMode = screenMode;
            return this;
        }
        public String getScreenMode() {
            return this.screenMode;
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setVerticalOffset(String verticalOffset) {
            this.verticalOffset = verticalOffset;
            return this;
        }
        public String getVerticalOffset() {
            return this.verticalOffset;
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setVideoHeight(Integer videoHeight) {
            this.videoHeight = videoHeight;
            return this;
        }
        public Integer getVideoHeight() {
            return this.videoHeight;
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setVideoWidth(Integer videoWidth) {
            this.videoWidth = videoWidth;
            return this;
        }
        public Integer getVideoWidth() {
            return this.videoWidth;
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

        public GetWatermarksConsoleResponseBodyWatermarksWatermark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetWatermarksConsoleResponseBodyWatermarks extends TeaModel {
        @NameInMap("Watermark")
        public java.util.List<GetWatermarksConsoleResponseBodyWatermarksWatermark> watermark;

        public static GetWatermarksConsoleResponseBodyWatermarks build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarksConsoleResponseBodyWatermarks self = new GetWatermarksConsoleResponseBodyWatermarks();
            return TeaModel.build(map, self);
        }

        public GetWatermarksConsoleResponseBodyWatermarks setWatermark(java.util.List<GetWatermarksConsoleResponseBodyWatermarksWatermark> watermark) {
            this.watermark = watermark;
            return this;
        }
        public java.util.List<GetWatermarksConsoleResponseBodyWatermarksWatermark> getWatermark() {
            return this.watermark;
        }

    }

}
