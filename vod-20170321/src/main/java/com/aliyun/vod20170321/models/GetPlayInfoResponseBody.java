// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayInfoResponseBody extends TeaModel {
    @NameInMap("PlayInfoList")
    public GetPlayInfoResponseBodyPlayInfoList playInfoList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VideoBase")
    public GetPlayInfoResponseBodyVideoBase videoBase;

    public static GetPlayInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPlayInfoResponseBody self = new GetPlayInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPlayInfoResponseBody setPlayInfoList(GetPlayInfoResponseBodyPlayInfoList playInfoList) {
        this.playInfoList = playInfoList;
        return this;
    }
    public GetPlayInfoResponseBodyPlayInfoList getPlayInfoList() {
        return this.playInfoList;
    }

    public GetPlayInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPlayInfoResponseBody setVideoBase(GetPlayInfoResponseBodyVideoBase videoBase) {
        this.videoBase = videoBase;
        return this;
    }
    public GetPlayInfoResponseBodyVideoBase getVideoBase() {
        return this.videoBase;
    }

    public static class GetPlayInfoResponseBodyPlayInfoListPlayInfo extends TeaModel {
        // 颜色位深
        @NameInMap("BitDepth")
        public Integer bitDepth;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Definition")
        public String definition;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Encrypt")
        public Long encrypt;

        @NameInMap("EncryptType")
        public String encryptType;

        @NameInMap("Format")
        public String format;

        @NameInMap("Fps")
        public String fps;

        // 视频流HDR类型
        @NameInMap("HDRType")
        public String HDRType;

        @NameInMap("Height")
        public Long height;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("NarrowBandType")
        public String narrowBandType;

        @NameInMap("PlayURL")
        public String playURL;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("Status")
        public String status;

        @NameInMap("StreamType")
        public String streamType;

        @NameInMap("WatermarkId")
        public String watermarkId;

        @NameInMap("Width")
        public Long width;

        public static GetPlayInfoResponseBodyPlayInfoListPlayInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPlayInfoResponseBodyPlayInfoListPlayInfo self = new GetPlayInfoResponseBodyPlayInfoListPlayInfo();
            return TeaModel.build(map, self);
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setBitDepth(Integer bitDepth) {
            this.bitDepth = bitDepth;
            return this;
        }
        public Integer getBitDepth() {
            return this.bitDepth;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setEncrypt(Long encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public Long getEncrypt() {
            return this.encrypt;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setHDRType(String HDRType) {
            this.HDRType = HDRType;
            return this;
        }
        public String getHDRType() {
            return this.HDRType;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setNarrowBandType(String narrowBandType) {
            this.narrowBandType = narrowBandType;
            return this;
        }
        public String getNarrowBandType() {
            return this.narrowBandType;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setPlayURL(String playURL) {
            this.playURL = playURL;
            return this;
        }
        public String getPlayURL() {
            return this.playURL;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class GetPlayInfoResponseBodyPlayInfoList extends TeaModel {
        @NameInMap("PlayInfo")
        public java.util.List<GetPlayInfoResponseBodyPlayInfoListPlayInfo> playInfo;

        public static GetPlayInfoResponseBodyPlayInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPlayInfoResponseBodyPlayInfoList self = new GetPlayInfoResponseBodyPlayInfoList();
            return TeaModel.build(map, self);
        }

        public GetPlayInfoResponseBodyPlayInfoList setPlayInfo(java.util.List<GetPlayInfoResponseBodyPlayInfoListPlayInfo> playInfo) {
            this.playInfo = playInfo;
            return this;
        }
        public java.util.List<GetPlayInfoResponseBodyPlayInfoListPlayInfo> getPlayInfo() {
            return this.playInfo;
        }

    }

    public static class GetPlayInfoResponseBodyVideoBase extends TeaModel {
        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DanMuURL")
        public String danMuURL;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("MediaType")
        public String mediaType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("VideoId")
        public String videoId;

        public static GetPlayInfoResponseBodyVideoBase build(java.util.Map<String, ?> map) throws Exception {
            GetPlayInfoResponseBodyVideoBase self = new GetPlayInfoResponseBodyVideoBase();
            return TeaModel.build(map, self);
        }

        public GetPlayInfoResponseBodyVideoBase setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetPlayInfoResponseBodyVideoBase setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetPlayInfoResponseBodyVideoBase setDanMuURL(String danMuURL) {
            this.danMuURL = danMuURL;
            return this;
        }
        public String getDanMuURL() {
            return this.danMuURL;
        }

        public GetPlayInfoResponseBodyVideoBase setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetPlayInfoResponseBodyVideoBase setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetPlayInfoResponseBodyVideoBase setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPlayInfoResponseBodyVideoBase setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetPlayInfoResponseBodyVideoBase setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
