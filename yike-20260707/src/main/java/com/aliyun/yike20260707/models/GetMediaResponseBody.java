// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetMediaResponseBody extends TeaModel {
    @NameInMap("MediaInfo")
    public GetMediaResponseBodyMediaInfo mediaInfo;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaResponseBody self = new GetMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaResponseBody setMediaInfo(GetMediaResponseBodyMediaInfo mediaInfo) {
        this.mediaInfo = mediaInfo;
        return this;
    }
    public GetMediaResponseBodyMediaInfo getMediaInfo() {
        return this.mediaInfo;
    }

    public GetMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.0</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <strong>example:</strong>
         * <p>stereo</p>
         */
        @NameInMap("ChannelLayout")
        public String channelLayout;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <strong>example:</strong>
         * <p>AAC (Advanced Audio Coding)</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <strong>example:</strong>
         * <p>aac</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <strong>example:</strong>
         * <p>0x6134706d</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <strong>example:</strong>
         * <p>mp4a</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <strong>example:</strong>
         * <p>1/44100</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <strong>example:</strong>
         * <p>16.2</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <strong>example:</strong>
         * <p>fltp</p>
         */
        @NameInMap("SampleFmt")
        public String sampleFmt;

        /**
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("SampleRate")
        public String sampleRate;

        /**
         * <strong>example:</strong>
         * <p>2026-02-04T02:13:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>1/44100</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        public static GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList self = new GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>example.mp4</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>27007</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("FileStatus")
        public String fileStatus;

        /**
         * <strong>example:</strong>
         * <p>source_file</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("FormatName")
        public String formatName;

        /**
         * <strong>example:</strong>
         * <p>540</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:10Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("Width")
        public String width;

        public static GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo self = new GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SubRip Text</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <strong>example:</strong>
         * <p>srt</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <strong>example:</strong>
         * <p>unicode</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <strong>example:</strong>
         * <p>unicode</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <strong>example:</strong>
         * <p>29.97</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <strong>example:</strong>
         * <p>2025-03-07T01:30Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        public static GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList self = new GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>24.0</p>
         */
        @NameInMap("AvgFPS")
        public String avgFPS;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <strong>example:</strong>
         * <p>H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <strong>example:</strong>
         * <p>h264</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <strong>example:</strong>
         * <p>0x0000</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <strong>example:</strong>
         * <p>[0][0][0][0]</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <strong>example:</strong>
         * <p>1/48</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <strong>example:</strong>
         * <p>0:1</p>
         */
        @NameInMap("Dar")
        public String dar;

        /**
         * <strong>example:</strong>
         * <p>216.206706</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>24.0</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HasBFrames")
        public String hasBFrames;

        /**
         * <strong>example:</strong>
         * <p>540</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Nb_frames")
        public String nbFrames;

        /**
         * <strong>example:</strong>
         * <p>5184</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <strong>example:</strong>
         * <p>0:1</p>
         */
        @NameInMap("Sar")
        public String sar;

        /**
         * <strong>example:</strong>
         * <p>2025-08-04T12:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>1/12288</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        /**
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("Width")
        public String width;

        public static GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList self = new GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setNbFrames(String nbFrames) {
            this.nbFrames = nbFrames;
            return this;
        }
        public String getNbFrames() {
            return this.nbFrames;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetMediaResponseBodyMediaInfoFileInfoList extends TeaModel {
        @NameInMap("AudioStreamInfoList")
        public java.util.List<GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList> audioStreamInfoList;

        @NameInMap("FileBasicInfo")
        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo fileBasicInfo;

        @NameInMap("SubtitleStreamInfoList")
        public java.util.List<GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList> subtitleStreamInfoList;

        @NameInMap("VideoStreamInfoList")
        public java.util.List<GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList> videoStreamInfoList;

        public static GetMediaResponseBodyMediaInfoFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaResponseBodyMediaInfoFileInfoList self = new GetMediaResponseBodyMediaInfoFileInfoList();
            return TeaModel.build(map, self);
        }

        public GetMediaResponseBodyMediaInfoFileInfoList setAudioStreamInfoList(java.util.List<GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList> audioStreamInfoList) {
            this.audioStreamInfoList = audioStreamInfoList;
            return this;
        }
        public java.util.List<GetMediaResponseBodyMediaInfoFileInfoListAudioStreamInfoList> getAudioStreamInfoList() {
            return this.audioStreamInfoList;
        }

        public GetMediaResponseBodyMediaInfoFileInfoList setFileBasicInfo(GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public GetMediaResponseBodyMediaInfoFileInfoListFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        public GetMediaResponseBodyMediaInfoFileInfoList setSubtitleStreamInfoList(java.util.List<GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList> subtitleStreamInfoList) {
            this.subtitleStreamInfoList = subtitleStreamInfoList;
            return this;
        }
        public java.util.List<GetMediaResponseBodyMediaInfoFileInfoListSubtitleStreamInfoList> getSubtitleStreamInfoList() {
            return this.subtitleStreamInfoList;
        }

        public GetMediaResponseBodyMediaInfoFileInfoList setVideoStreamInfoList(java.util.List<GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList> videoStreamInfoList) {
            this.videoStreamInfoList = videoStreamInfoList;
            return this;
        }
        public java.util.List<GetMediaResponseBodyMediaInfoFileInfoListVideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

    }

    public static class GetMediaResponseBodyMediaInfoMediaBasicInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dtlive-vip.oss-cn-shanghai.aliyuncs.com/cover/4e88a055-75fc-4ff5-8b8a-f32224917514_open_live_cover.jpg">https://dtlive-vip.oss-cn-shanghai.aliyuncs.com/cover/4e88a055-75fc-4ff5-8b8a-f32224917514_open_live_cover.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1586676</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
         */
        @NameInMap("InputURL")
        public String inputURL;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>pitaya,prd-wuxi,248</p>
         */
        @NameInMap("MediaTags")
        public String mediaTags;

        /**
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:08Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Snapshots")
        public String snapshots;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("SpriteImages")
        public String spriteImages;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>T32</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("UploadSource")
        public String uploadSource;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetMediaResponseBodyMediaInfoMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaResponseBodyMediaInfoMediaBasicInfo self = new GetMediaResponseBodyMediaInfoMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setInputURL(String inputURL) {
            this.inputURL = inputURL;
            return this;
        }
        public String getInputURL() {
            return this.inputURL;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setSnapshots(String snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public String getSnapshots() {
            return this.snapshots;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setSpriteImages(String spriteImages) {
            this.spriteImages = spriteImages;
            return this;
        }
        public String getSpriteImages() {
            return this.spriteImages;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setUploadSource(String uploadSource) {
            this.uploadSource = uploadSource;
            return this;
        }
        public String getUploadSource() {
            return this.uploadSource;
        }

        public GetMediaResponseBodyMediaInfoMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class GetMediaResponseBodyMediaInfoMediaDynamicInfoDynamicMetaData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p>4614131</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetMediaResponseBodyMediaInfoMediaDynamicInfoDynamicMetaData build(java.util.Map<String, ?> map) throws Exception {
            GetMediaResponseBodyMediaInfoMediaDynamicInfoDynamicMetaData self = new GetMediaResponseBodyMediaInfoMediaDynamicInfoDynamicMetaData();
            return TeaModel.build(map, self);
        }

        public GetMediaResponseBodyMediaInfoMediaDynamicInfoDynamicMetaData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public GetMediaResponseBodyMediaInfoMediaDynamicInfoDynamicMetaData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetMediaResponseBodyMediaInfoMediaDynamicInfoDynamicMetaData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMediaResponseBodyMediaInfoMediaDynamicInfo extends TeaModel {
        @NameInMap("DynamicMetaData")
        public GetMediaResponseBodyMediaInfoMediaDynamicInfoDynamicMetaData dynamicMetaData;

        public static GetMediaResponseBodyMediaInfoMediaDynamicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaResponseBodyMediaInfoMediaDynamicInfo self = new GetMediaResponseBodyMediaInfoMediaDynamicInfo();
            return TeaModel.build(map, self);
        }

        public GetMediaResponseBodyMediaInfoMediaDynamicInfo setDynamicMetaData(GetMediaResponseBodyMediaInfoMediaDynamicInfoDynamicMetaData dynamicMetaData) {
            this.dynamicMetaData = dynamicMetaData;
            return this;
        }
        public GetMediaResponseBodyMediaInfoMediaDynamicInfoDynamicMetaData getDynamicMetaData() {
            return this.dynamicMetaData;
        }

    }

    public static class GetMediaResponseBodyMediaInfo extends TeaModel {
        @NameInMap("FileInfoList")
        public java.util.List<GetMediaResponseBodyMediaInfoFileInfoList> fileInfoList;

        @NameInMap("MediaBasicInfo")
        public GetMediaResponseBodyMediaInfoMediaBasicInfo mediaBasicInfo;

        @NameInMap("MediaDynamicInfo")
        public GetMediaResponseBodyMediaInfoMediaDynamicInfo mediaDynamicInfo;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static GetMediaResponseBodyMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaResponseBodyMediaInfo self = new GetMediaResponseBodyMediaInfo();
            return TeaModel.build(map, self);
        }

        public GetMediaResponseBodyMediaInfo setFileInfoList(java.util.List<GetMediaResponseBodyMediaInfoFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<GetMediaResponseBodyMediaInfoFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        public GetMediaResponseBodyMediaInfo setMediaBasicInfo(GetMediaResponseBodyMediaInfoMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public GetMediaResponseBodyMediaInfoMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public GetMediaResponseBodyMediaInfo setMediaDynamicInfo(GetMediaResponseBodyMediaInfoMediaDynamicInfo mediaDynamicInfo) {
            this.mediaDynamicInfo = mediaDynamicInfo;
            return this;
        }
        public GetMediaResponseBodyMediaInfoMediaDynamicInfo getMediaDynamicInfo() {
            return this.mediaDynamicInfo;
        }

        public GetMediaResponseBodyMediaInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
