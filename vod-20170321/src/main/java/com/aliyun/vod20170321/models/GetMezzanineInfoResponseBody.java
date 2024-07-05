// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMezzanineInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the source file.</p>
     */
    @NameInMap("Mezzanine")
    public GetMezzanineInfoResponseBodyMezzanine mezzanine;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
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
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>62.885</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The output layout of the sound channels. Valid values:</p>
         * <ul>
         * <li><strong>mono</strong></li>
         * <li><strong>stereo</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mono</p>
         */
        @NameInMap("ChannelLayout")
        public String channelLayout;

        /**
         * <p>The number of sound channels.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The full name of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>AAC (Advanced Audio Coding)</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The tag of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>0x6134706d</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4a</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <p>The codec time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1/44100</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The duration of the audio file.</p>
         * 
         * <strong>example:</strong>
         * <p>3.227574</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The sequence number of the audio stream. The value indicates the position of the audio stream in all audio streams.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>und</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The total number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <p>The sampling format.</p>
         * 
         * <strong>example:</strong>
         * <p>fltp</p>
         */
        @NameInMap("SampleFmt")
        public String sampleFmt;

        /**
         * <p>The sampling rate of the audio stream.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("SampleRate")
        public String sampleRate;

        /**
         * <p>The beginning of the time range during which the data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base of the audio stream.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000000</p>
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
         * <p>The average frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>30.0</p>
         */
        @NameInMap("AvgFPS")
        public String avgFPS;

        /**
         * <p>The bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The full name of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>h264</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The tag of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>0x31637661</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>avc1</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <p>The codec time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1/60</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The display aspect ratio (DAR) of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>0:1</p>
         */
        @NameInMap("Dar")
        public String dar;

        /**
         * <p>The duration of the audio file.</p>
         * 
         * <strong>example:</strong>
         * <p>3.166667</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The frame rate of the output file.</p>
         * 
         * <strong>example:</strong>
         * <p>30.0</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The HDR type of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>HDR</p>
         */
        @NameInMap("HDRType")
        public String HDRType;

        /**
         * <p>Indicates whether the video stream contains B-frames.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HasBFrames")
        public String hasBFrames;

        /**
         * <p>The height of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>320</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The sequence number of the video stream. The value indicates the position of the video stream in all video streams.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>und</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The codec level.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The total number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <p>The pixel format.</p>
         * 
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The codec profile.</p>
         * 
         * <strong>example:</strong>
         * <p>Main</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The rotation angle of the video. Valid values: <strong>[0,360)</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The sample aspect ratio (SAR) of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>0:1</p>
         */
        @NameInMap("Sar")
        public String sar;

        /**
         * <p>The beginning of the time range during which the data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base of the audio stream.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000000</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        /**
         * <p>The width of the video in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>568</p>
         */
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
         * <p>The codec time base.</p>
         */
        @NameInMap("AudioStreamList")
        public java.util.List<GetMezzanineInfoResponseBodyMezzanineAudioStreamList> audioStreamList;

        /**
         * <p>The bitrate of the file. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>771.2280</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The time when the file was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-14T09:15:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The duration of the file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>42.4930</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>27ffc438-164h67f57ef-0005-6884-51a-1****.mp4</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/27ffc438-164h67f57ef-0005-6884-51a-1****.mp4">http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/27ffc438-164h67f57ef-0005-6884-51a-1****.mp4</a></p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The frame rate of the file. Unit: frames per second.</p>
         * 
         * <strong>example:</strong>
         * <p>25.0000</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the file. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>540</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <p>The type of the mezzanine file URL. Valid values:</p>
         * <ul>
         * <li><strong>oss</strong>: OSS URL</li>
         * <li><strong>cdn</strong> (default): CDN URL</li>
         * </ul>
         * <blockquote>
         * <p>If you specify an OSS URL for the video stream, the video stream must be in the MP4 format.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("OutputType")
        public String outputType;

        /**
         * <p>The period of time in which the object remains in the restored state.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30T10:14:14Z</p>
         */
        @NameInMap("RestoreExpiration")
        public String restoreExpiration;

        /**
         * <p>The restoration status of the audio or video file. Valid values:</p>
         * <ul>
         * <li><strong>Processing</strong></li>
         * <li><strong>Success</strong></li>
         * <li><strong>Failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("RestoreStatus")
        public String restoreStatus;

        /**
         * <p>The size of the file. Unit: byte.</p>
         * 
         * <strong>example:</strong>
         * <p>4096477</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The status of the file. Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong>: The file is being uploaded. This is the initial status.</li>
         * <li><strong>Normal</strong>: The file is uploaded.</li>
         * <li><strong>UploadFail</strong>: The file fails to be uploaded.</li>
         * <li><strong>Deleted</strong>: The file is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage class of the audio file. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: All media resources are stored as Standard objects.</li>
         * <li><strong>IA</strong>: All media resources are stored as IA objects.</li>
         * <li><strong>Archive</strong>: All media resources are stored as Archive objects.</li>
         * <li><strong>ColdArchive</strong>: All media resources are stored as Cold Archive objects.</li>
         * <li><strong>SourceIA</strong>: Only the source files are IA objects.</li>
         * <li><strong>SourceArchive</strong>: Only the source files are Archive objects.</li>
         * <li><strong>SourceColdArchive</strong>: Only the source files are Cold Archive objects.</li>
         * <li><strong>Changing</strong>: The storage class of the audio file is being changed.</li>
         * <li><strong>SourceChanging</strong>: The storage class of the source file is being changed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The ID of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>1f1a6fc03ca04814031b8a6559e****</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        /**
         * <p>The HDR type of the video stream.</p>
         */
        @NameInMap("VideoStreamList")
        public java.util.List<GetMezzanineInfoResponseBodyMezzanineVideoStreamList> videoStreamList;

        /**
         * <p>The width of the file. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>960</p>
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
