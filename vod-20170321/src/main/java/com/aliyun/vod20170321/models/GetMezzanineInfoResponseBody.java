// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMezzanineInfoResponseBody extends TeaModel {
    /**
     * <p>The time base.</p>
     */
    @NameInMap("Mezzanine")
    public GetMezzanineInfoResponseBodyMezzanine mezzanine;

    /**
     * <p>The codec time base.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMezzanineInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMezzanineInfoResponseBody self = new GetMezzanineInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMezzanineInfoResponseBody setMezzanine(GetMezzanineInfoResponseBodyMezzanine mezzanine) {
        this.mezzanine = mezzanine;
        return this;
    }
    public GetMezzanineInfoResponseBodyMezzanine getMezzanine() {
        return this.mezzanine;
    }

    public GetMezzanineInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMezzanineInfoResponseBodyMezzanineAudioStreamList extends TeaModel {
        /**
         * <p>The information about the video stream.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The target frame rate.</p>
         */
        @NameInMap("ChannelLayout")
        public String channelLayout;

        /**
         * <p>The width of the video resolution.</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The time when the file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The duration of the video stream.</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The sequence number of the audio stream, which specifies the position of the audio stream in all audio streams.</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag of the codec format.</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <p>The full name of the codec format.</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The short name of the codec format.</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The bitrate of the file. Unit: Kbit/s.</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The codec profile.</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <p>The status of the file. Valid values:</p>
         * <br>
         * <p>*   **Uploading**: The file is being uploaded. This is the initial status.</p>
         * <p>*   **Normal**: The file is uploaded.</p>
         * <p>*   **UploadFail**: The file fails to be uploaded.</p>
         * <p>*   **Deleted**: The file is deleted.</p>
         */
        @NameInMap("SampleFmt")
        public String sampleFmt;

        /**
         * <p>The size of the file. Unit: byte.</p>
         */
        @NameInMap("SampleRate")
        public String sampleRate;

        /**
         * <p>The sample rate.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The ID of the video.</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        public static GetMezzanineInfoResponseBodyMezzanineAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            GetMezzanineInfoResponseBodyMezzanineAudioStreamList self = new GetMezzanineInfoResponseBodyMezzanineAudioStreamList();
            return TeaModel.build(map, self);
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMezzanineInfoResponseBodyMezzanineAudioStreamList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class GetMezzanineInfoResponseBodyMezzanineVideoStreamList extends TeaModel {
        /**
         * <p>The beginning of the time range that was queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("AvgFPS")
        public String avgFPS;

        /**
         * <p>The URL of the file.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The codec time base.</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the codec format.</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>Queries the information about the mezzanine file of an audio or video. The information includes the mezzanine file URL, resolution, and bitrate of the audio or video.</p>
         */
        @NameInMap("Dar")
        public String dar;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("HDRType")
        public String HDRType;

        /**
         * <p>The rotation angle of the video. Valid values: **\[0, 360)**.</p>
         */
        @NameInMap("HasBFrames")
        public String hasBFrames;

        /**
         * <p>The number of sound channels.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The sequence number of the video stream, which indicates the position of the video stream in all video streams.</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The information about the audio stream.</p>
         */
        @NameInMap("Lang")
        public String lang;

        @NameInMap("Level")
        public String level;

        /**
         * <p>The time base.</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <p>The short name of the codec format.</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The duration of the audio stream.</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The width of the file. Unit: pixel.</p>
         */
        @NameInMap("Sar")
        public String sar;

        /**
         * <p>The height of the file. Unit: pixel.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The pixel format.</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        @NameInMap("Width")
        public String width;

        public static GetMezzanineInfoResponseBodyMezzanineVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            GetMezzanineInfoResponseBodyMezzanineVideoStreamList self = new GetMezzanineInfoResponseBodyMezzanineVideoStreamList();
            return TeaModel.build(map, self);
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setHDRType(String HDRType) {
            this.HDRType = HDRType;
            return this;
        }
        public String getHDRType() {
            return this.HDRType;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public GetMezzanineInfoResponseBodyMezzanineVideoStreamList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetMezzanineInfoResponseBodyMezzanine extends TeaModel {
        /**
         * <p>The language.</p>
         */
        @NameInMap("AudioStreamList")
        public java.util.List<GetMezzanineInfoResponseBodyMezzanineAudioStreamList> audioStreamList;

        /**
         * <p>The type of the mezzanine file URL. Valid values:</p>
         * <br>
         * <p>- **oss**: OSS URL</p>
         * <p>- **cdn** (default): Content Delivery Network (CDN) URL</p>
         * <br>
         * <p>> If the mezzanine file is stored in a bucket of the in type, only an OSS URL is returned.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The information about the mezzanine file.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The type of additional information. Separate multiple values with commas (,). By default, only the basic information is returned. Valid values:</p>
         * <br>
         * <p>*   **video**: video stream information</p>
         * <p>*   **audio**: audio stream information</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The language.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The beginning of the time range that was queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The sample aspect ratio.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the video resolution.</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <p>The total number of frames.</p>
         */
        @NameInMap("OutputType")
        public String outputType;

        @NameInMap("RestoreExpiration")
        public String restoreExpiration;

        @NameInMap("RestoreStatus")
        public String restoreStatus;

        /**
         * <p>The duration of the file. Unit: seconds.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The validity period of the mezzanine file URL. Unit: seconds. Default value: **1800**. Minimum value: **1**.</p>
         * <br>
         * <p>*   If the OutputType parameter is set to **cdn**:</p>
         * <br>
         * <p>    *   The mezzanine file URL has a validity period only if URL signing is enabled. Otherwise, the mezzanine file URL is permanently valid.</p>
         * <p>    *   Minimum value: **1**.</p>
         * <p>    *   Maximum Value: unlimited.</p>
         * <p>    *   Default value: If you do not set this parameter, the default validity period that is specified in URL signing is used.</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>*   If the OutputType parameter is set to **oss**:</p>
         * <br>
         * <p>    *   The mezzanine file URL has a validity period only if the permissions on the Object Storage Service (OSS) bucket are private. Otherwise, the mezzanine file URL is permanently valid.</p>
         * <p>    *   Minimum value: **1**.</p>
         * <p>    *   Maximum value: **2592000** (30 days). The maximum value is limited to reduce security risks of the origin.</p>
         * <p>    *   Default value: If you do not set this parameter, the default value is **3600**.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The average frame rate.</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        /**
         * <p>The output layout of the sound channels. Valid values:</p>
         * <br>
         * <p>*   **mono**: mono sound channel</p>
         * <p>*   **stereo**: two sound channels</p>
         */
        @NameInMap("VideoStreamList")
        public java.util.List<GetMezzanineInfoResponseBodyMezzanineVideoStreamList> videoStreamList;

        /**
         * <p>The tag of the codec format.</p>
         */
        @NameInMap("Width")
        public Long width;

        public static GetMezzanineInfoResponseBodyMezzanine build(java.util.Map<String, ?> map) throws Exception {
            GetMezzanineInfoResponseBodyMezzanine self = new GetMezzanineInfoResponseBodyMezzanine();
            return TeaModel.build(map, self);
        }

        public GetMezzanineInfoResponseBodyMezzanine setAudioStreamList(java.util.List<GetMezzanineInfoResponseBodyMezzanineAudioStreamList> audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public java.util.List<GetMezzanineInfoResponseBodyMezzanineAudioStreamList> getAudioStreamList() {
            return this.audioStreamList;
        }

        public GetMezzanineInfoResponseBodyMezzanine setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMezzanineInfoResponseBodyMezzanine setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetMezzanineInfoResponseBodyMezzanine setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMezzanineInfoResponseBodyMezzanine setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetMezzanineInfoResponseBodyMezzanine setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public GetMezzanineInfoResponseBodyMezzanine setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetMezzanineInfoResponseBodyMezzanine setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public GetMezzanineInfoResponseBodyMezzanine setOutputType(String outputType) {
            this.outputType = outputType;
            return this;
        }
        public String getOutputType() {
            return this.outputType;
        }

        public GetMezzanineInfoResponseBodyMezzanine setRestoreExpiration(String restoreExpiration) {
            this.restoreExpiration = restoreExpiration;
            return this;
        }
        public String getRestoreExpiration() {
            return this.restoreExpiration;
        }

        public GetMezzanineInfoResponseBodyMezzanine setRestoreStatus(String restoreStatus) {
            this.restoreStatus = restoreStatus;
            return this;
        }
        public String getRestoreStatus() {
            return this.restoreStatus;
        }

        public GetMezzanineInfoResponseBodyMezzanine setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetMezzanineInfoResponseBodyMezzanine setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMezzanineInfoResponseBodyMezzanine setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public GetMezzanineInfoResponseBodyMezzanine setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public GetMezzanineInfoResponseBodyMezzanine setVideoStreamList(java.util.List<GetMezzanineInfoResponseBodyMezzanineVideoStreamList> videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public java.util.List<GetMezzanineInfoResponseBodyMezzanineVideoStreamList> getVideoStreamList() {
            return this.videoStreamList;
        }

        public GetMezzanineInfoResponseBodyMezzanine setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

}
