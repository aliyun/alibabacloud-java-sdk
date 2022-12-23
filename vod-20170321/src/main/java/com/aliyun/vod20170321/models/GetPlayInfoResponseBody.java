// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayInfoResponseBody extends TeaModel {
    // The information about the audio or video stream.
    @NameInMap("PlayInfoList")
    public GetPlayInfoResponseBodyPlayInfoList playInfoList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The basic information about the audio or video file.
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
        // The color depth. This value must be an integer.
        @NameInMap("BitDepth")
        public Integer bitDepth;

        // The bitrate of the media stream. Unit: Kbit/s.
        @NameInMap("Bitrate")
        public String bitrate;

        // The time when the audio or video file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The quality of the video stream. Valid values:
        // 
        // *   **FD**: low definition
        // *   **LD**: standard definition
        // *   **SD**: high definition
        // *   **HD**: ultra-high definition
        // *   **OD**: original definition
        // *   **2K**: 2K
        // *   **4K**: 4K
        // *   **SQ**: standard sound quality
        // *   **HQ**: high sound quality
        // *   **AUTO**: adaptive bitrate
        @NameInMap("Definition")
        public String definition;

        // The duration of the media stream. Unit: seconds.
        @NameInMap("Duration")
        public String duration;

        // Indicates whether the video stream was encrypted. Valid values:
        // 
        // *   **0**: no
        // *   **1**: yes
        @NameInMap("Encrypt")
        public Long encrypt;

        // The encryption type of the media stream. Valid values:
        // 
        // *   **AliyunVoDEncryption**: Alibaba Cloud proprietary cryptography
        // *   **HLSEncryption**: HTTP Live Streaming (HLS) encryption
        // 
        // > If the encryption type is **AliyunVoDEncryption**, only ApsaraVideo Player SDK can be used to play videos.
        @NameInMap("EncryptType")
        public String encryptType;

        // The format of the media stream.
        // 
        // *   If the media file is a video file, the valid values are **mp4** and **m3u8**.
        // *   If the media file is an audio-only file, the value is **mp3**.
        @NameInMap("Format")
        public String format;

        // The frame rate of the media stream. Unit: frames per second.
        @NameInMap("Fps")
        public String fps;

        // The HDR type of the media stream. Valid values:
        // 
        // *   HDR
        // *   HDR10
        // *   HLG
        // *   DolbyVision
        // *   HDRVivid
        // *   SDR+
        @NameInMap("HDRType")
        public String HDRType;

        // The height of the media stream. Unit: pixels.
        @NameInMap("Height")
        public Long height;

        // The ID of the media transcoding job. This ID uniquely identifies a media stream.
        @NameInMap("JobId")
        public String jobId;

        // The update time. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("ModificationTime")
        public String modificationTime;

        // The type of Narrowband HD transcoding. Valid values:
        // 
        // *   **0**: regular
        // *   **1.0**: Narrowband HD 1.0
        // *   **2.0**: Narrowband HD 2.0
        // 
        // This parameter is returned only when a quality that is available in the built-in Narrowband HD 1.0 transcoding template is specified. For more information, see the [Definition parameter in the TranscodeTemplate](~~52839~~) table.
        @NameInMap("NarrowBandType")
        public String narrowBandType;

        // The playback URL of the video stream.
        @NameInMap("PlayURL")
        public String playURL;

        // The size of the media stream. Unit: bytes.
        @NameInMap("Size")
        public Long size;

        // The specifications of transcoded audio and video streams. For more information about the valid values, see [Output specifications](~~124671~~).
        @NameInMap("Specification")
        public String specification;

        // The status of the media stream. Valid values:
        // 
        // *   **Normal**
        // *   **Invisible**
        @NameInMap("Status")
        public String status;

        // The type of the media stream. If the media stream is a video stream, the value is **video**. If the media stream is an audio-only stream, the value is **audio**.
        @NameInMap("StreamType")
        public String streamType;

        // The ID of the watermark that is associated with the media stream.
        @NameInMap("WatermarkId")
        public String watermarkId;

        // The width of the media stream. Unit: pixels.
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
        // The thumbnail URL of the audio or video file.
        @NameInMap("CoverURL")
        public String coverURL;

        // The time when the audio or video file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The URL of the masked live comment data.
        @NameInMap("DanMuURL")
        public String danMuURL;

        // The duration of the audio or video file. Unit: seconds.
        @NameInMap("Duration")
        public String duration;

        // The type of the media file. Valid values:
        // 
        // *   **video**
        // *   **audio**
        @NameInMap("MediaType")
        public String mediaType;

        // The status of the audio or video file. For more information about the value range and description, see the [Status](~~52839~~) table.
        @NameInMap("Status")
        public String status;

        // The title of the audio or video file.
        @NameInMap("Title")
        public String title;

        // The ID of the media file.
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
