// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayInfoResponseBody extends TeaModel {
    /**
     * <p>The height of the media stream. Unit: pixels.</p>
     */
    @NameInMap("PlayInfoList")
    public GetPlayInfoResponseBodyPlayInfoList playInfoList;

    /**
     * <p>The information about the audio or video stream.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The width of the media stream. Unit: pixels.</p>
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
        @NameInMap("BitDepth")
        public Integer bitDepth;

        /**
         * <p>The format of the media stream. Separate multiple formats with commas (,). Valid values:</p>
         * <br>
         * <p>*   **mp4**</p>
         * <p>*   **m3u8**</p>
         * <p>*   **mp3**</p>
         * <p>*   **mpd**</p>
         * <br>
         * <p>> By default, ApsaraVideo VOD returns video streams in all the preceding formats. However, video streams in the MPD format are returned only if the MPD container format is specified in the transcoding template. For more information, see the [Container parameter in the TranscodeTemplate](~~52839~~) table.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The status of the media stream. Valid values:</p>
         * <br>
         * <p>*   **Normal**</p>
         * <p>*   **Invisible**</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The color depth. This value must be an integer.</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>The encryption type of the media stream. Valid values:</p>
         * <br>
         * <p>*   **AliyunVoDEncryption**: Alibaba Cloud proprietary cryptography</p>
         * <p>*   **HLSEncryption**: HTTP Live Streaming (HLS) encryption</p>
         * <br>
         * <p>> If the encryption type is**AliyunVoDEncryption**, only ApsaraVideo Player SDK can be used to play videos.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The status of the audio or video file. For more information about the value range and description, see the [Status](~~52839~~) table.</p>
         */
        @NameInMap("Encrypt")
        public Long encrypt;

        /**
         * <p>The title of the audio or video file.</p>
         */
        @NameInMap("EncryptType")
        public String encryptType;

        /**
         * <p>Queries the playback URL of a video or audio file by its ID.</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The type of the output URL. Default value: oss. Valid values:</p>
         * <br>
         * <p>*   **oss**</p>
         * <p>*   **cdn**</p>
         */
        @NameInMap("Fps")
        public String fps;

        @NameInMap("HDRType")
        public String HDRType;

        /**
         * <p>The returned result.</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <p>The type of the media file. Valid values:</p>
         * <br>
         * <p>*   **video**</p>
         * <p>*   **audio**</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The validity period of the playback URL. Unit: seconds.</p>
         * <br>
         * <p>*   If the OutputType parameter is set to **cdn**:</p>
         * <br>
         * <p>    *   This parameter takes effect only if URL authentication is enabled. Otherwise, the playback URL does not expire.</p>
         * <p>    *   Minimum value: **1**.</p>
         * <p>    *   Maximum value: unlimited.</p>
         * <p>    *   Default value: The default validity period that is specified in URL authentication is used.</p>
         * <br>
         * <p>*   If the OutputType parameter is set to **oss**:</p>
         * <br>
         * <p>    *   This parameter takes effect only when the ACL of the Object Storage Service (OSS) bucket is private. Otherwise, the playback URL does not expire.</p>
         * <p>    *   Minimum value: **1**.</p>
         * <p>    *   Maximum value: **2592000** (30 days). This limit is imposed to reduce security risks of the origin server.</p>
         * <p>    *   Default value: **3600**.</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The type of the data to return. Default value: Single. Valid values:</p>
         * <br>
         * <p>*   **Single**: Only one latest transcoded stream is returned for each quality and format.</p>
         * <p>*   **Multiple**: All transcoded streams are returned for each quality and format.</p>
         */
        @NameInMap("NarrowBandType")
        public String narrowBandType;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("PlayURL")
        public String playURL;

        /**
         * <p>The custom playback configuration. The value is a JSON string. For more information, see [PlayConfig](~~86952~~).</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   If you do not specify PlayConfig or `PlayDomain` in PlayConfig, the default domain name configured in ApsaraVideo VOD is used in this operation. If no default domain name is configured, the domain names are queried in reverse chronological order based on the time when the domain names were modified. The domain name that was last modified is used as the streaming domain name. To prevent domain name issues, we recommend that you specify the default streaming domain name. You can log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com) and choose **Configuration Management** > **Media Management** > **Storage** > **Manage** > **Origin Domain Name** to set the default streaming domain name.</p>
         * <br>
         * <p>*   If the `EncryptType` parameter in PlayConfig is set to `AliyunVoDEncryption`, the playback URL of the stream encrypted by using proprietary cryptography is not returned to ensure video security. If you want to return such URL, you must set the `ResultType` parameter to `Multiple`.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The size of the media stream. Unit: bytes.</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <p>The specifications of transcoded audio and video streams. For more information about the valid values, see [Output specifications](~~124671~~).</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The bitrate of the media stream. Unit: Kbit/s.</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The quality of the video stream. Separate multiple qualities with commas (,). Valid values:</p>
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
         * <br>
         * <p>> By default, ApsaraVideo VOD returns video streams in all preceding qualities. However, video streams for adaptive bitrate streaming are returned only if the PackageSetting parameter is specified in the transcoding template. For more information, see the [PackageSetting parameter in the TranscodeTemplate](~~52839~~) table.</p>
         */
        @NameInMap("WatermarkId")
        public String watermarkId;

        /**
         * <p>Indicates whether the video stream was encrypted. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
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
        /**
         * <p>ApsaraVideo VOD</p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The type of the media stream. Separate multiple types with commas (,). Valid values:</p>
         * <br>
         * <p>*   **video**</p>
         * <p>*   **audio**</p>
         * <br>
         * <p>By default, video and audio streams are returned.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The time when the audio or video file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("DanMuURL")
        public String danMuURL;

        /**
         * <p>The ID of the watermark that is associated with the media stream.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The ID of the audio or video file. You can use one of the following methods to obtain the ID of the file:</p>
         * <br>
         * <p>*   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, you can view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</p>
         * <p>*   Obtain the value of the VideoId parameter when you call the [CreateUploadVideo](~~55407~~) operation to upload files.</p>
         * <p>*   Obtain the value of the VideoId parameter by calling the [SearchMedia](~~86044~~) operation. This method is applicable to files that have been uploaded.</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>The thumbnail URL of the audio or video file.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The format of the media stream.</p>
         * <br>
         * <p>*   If the media file is a video file, the valid values are **mp4** and **m3u8**.</p>
         * <p>*   If the media file is an audio-only file, the value is **mp3**.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The type of the media stream. If the media stream is a video stream, the value is **video**. If the media stream is an audio-only stream, the value is **audio**.</p>
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
