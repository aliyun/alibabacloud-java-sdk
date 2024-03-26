// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the audio or video stream.</p>
     */
    @NameInMap("PlayInfoList")
    public GetPlayInfoResponseBodyPlayInfoList playInfoList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The basic information about the audio or video file.</p>
     */
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
        /**
         * <p>The color depth. This value is an integer.</p>
         */
        @NameInMap("BitDepth")
        public Integer bitDepth;

        /**
         * <p>The bitrate of the media stream. Unit: Kbit/s.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The time when the audio or video stream was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The quality of the media stream. Valid values:</p>
         * <br>
         * <p>*   **FD**: low definition</p>
         * <p>*   **LD**: standard definition</p>
         * <p>*   **SD**: high definition</p>
         * <p>*   **HD**: ultra-high definition</p>
         * <p>*   **OD**: original definition</p>
         * <p>*   **2K**: 2K</p>
         * <p>*   **4K**: 4K</p>
         * <p>*   **SQ**: standard sound quality</p>
         * <p>*   **HQ**: high sound quality</p>
         * <p>*   **AUTO**: adaptive bitrate</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>The duration of the media stream. Unit: seconds. 86,400 seconds is equivalent to 24 hours.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>Indicates whether the media stream is encrypted. Valid values:</p>
         * <br>
         * <p>*   **0**: The media stream is not encrypted.</p>
         * <p>*   **1**: The media stream is encrypted.</p>
         */
        @NameInMap("Encrypt")
        public Long encrypt;

        /**
         * <p>The encryption type of the media stream. Valid values:</p>
         * <br>
         * <p>*   **AliyunVoDEncryption**: Alibaba Cloud proprietary cryptography</p>
         * <p>*   **HLSEncryption**: HTTP Live Streaming (HLS) encryption</p>
         * <br>
         * <p>>  If the encryption type is AliyunVoDEncryption, only ApsaraVideo Player SDK can be used to play videos.</p>
         */
        @NameInMap("EncryptType")
        public String encryptType;

        /**
         * <p>The format of the media stream.</p>
         * <br>
         * <p>*   If the media file is a video file, the valid values are **mp4** and **m3u8**.</p>
         * <p>*   If the media file is an audio-only file, the value is **mp3**.</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate of the media stream. Unit: frames per second.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The HDR type of the media stream. Valid values:</p>
         * <br>
         * <p>*   HDR</p>
         * <p>*   HDR10</p>
         * <p>*   HLG</p>
         * <p>*   DolbyVision</p>
         * <p>*   HDRVivid</p>
         * <p>*   SDR+</p>
         */
        @NameInMap("HDRType")
        public String HDRType;

        /**
         * <p>The height of the media stream. Unit: pixels.</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <p>The custom watermark information of the copyright watermark. This parameter is returned if you set `JobType` to `2`.</p>
         */
        @NameInMap("JobExt")
        public String jobExt;

        /**
         * <p>The job ID for transcoding the media stream. This ID uniquely identifies a media stream.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The type of the digital watermark. Valid values:</p>
         * <br>
         * <p>*   **1**: tracing watermark</p>
         * <p>*   **2**: copyright watermark</p>
         */
        @NameInMap("JobType")
        public Integer jobType;

        /**
         * <p>The time when the audio or video file was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The type of Narrowband HD transcoding. Valid values:</p>
         * <br>
         * <p>*   **0**: normal transcoding</p>
         * <p>*   **1.0**: Narrowband HD 1.0</p>
         * <p>*   **2.0**: Narrowband HD 2.0</p>
         * <br>
         * <p>This parameter is returned only when a quality that is available in the built-in Narrowband HD 1.0 transcoding template is specified. For more information, see the [Definition parameter in the TranscodeTemplate](~~52839~~) table.</p>
         */
        @NameInMap("NarrowBandType")
        public String narrowBandType;

        /**
         * <p>The playback URL of the media stream.</p>
         */
        @NameInMap("PlayURL")
        public String playURL;

        /**
         * <p>The size of the media stream. Unit: bytes.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The specifications of transcoded audio and video streams. For more information about the valid values, see [Output specifications](~~124671~~).</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <p>The status of the audio or video stream. Valid values:</p>
         * <br>
         * <p>*   **Normal**: The latest transcoded stream in each quality and format is in the Normal status.</p>
         * <p>*   **Invisible**: If multiple streams are transcoded in the same quality and format, the latest transcoded stream is in the Normal status and other streams are in the Invisible status.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the media stream. If the media stream is a video stream, the value is **video**. If the media stream is an audio-only stream, the value is **audio**.</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The ID of the watermark that is associated with the media stream.</p>
         */
        @NameInMap("WatermarkId")
        public String watermarkId;

        /**
         * <p>The width of the media stream. Unit: pixels.</p>
         */
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

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setJobExt(String jobExt) {
            this.jobExt = jobExt;
            return this;
        }
        public String getJobExt() {
            return this.jobExt;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetPlayInfoResponseBodyPlayInfoListPlayInfo setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
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
        /**
         * <p>The thumbnail URL of the audio or video file.</p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the audio or video file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The URL of the masked live comment data.</p>
         */
        @NameInMap("DanMuURL")
        public String danMuURL;

        /**
         * <p>The duration of the audio or video file. Unit: seconds.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The type of the media file. Valid values:</p>
         * <br>
         * <p>*   **video**</p>
         * <p>*   **audio**</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>The status of the audio or video file. For more information about the value range and description, see the [Status](~~52839~~) table.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage class of the audio or video file. Valid values:</p>
         * <br>
         * <p>*   **Standard**: All media resources are stored as Standard objects.</p>
         * <p>*   **IA**: All media resources are stored as IA objects.</p>
         * <p>*   **Archive**: All media resources are stored as Archive objects.</p>
         * <p>*   **ColdArchive**: All media resources are stored as Cold Archive objects.</p>
         * <p>*   **SourceIA**: Only the source files are IA objects.</p>
         * <p>*   **SourceArchive**: Only the source files are Archive objects.</p>
         * <p>*   **SourceColdArchive**: Only the source files are Cold Archive objects.</p>
         * <p>*   **Changing**: The storage class of the audio or video file is being changed.</p>
         * <p>*   **SourceChanging**: The storage class of the source file is being changed.</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The title of the audio or video file.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The ID of the media file.</p>
         */
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

        public GetPlayInfoResponseBodyVideoBase setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
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
