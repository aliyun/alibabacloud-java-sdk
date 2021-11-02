// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMezzanineInfoResponseBody extends TeaModel {
    @NameInMap("Mezzanine")
    public GetMezzanineInfoResponseBodyMezzanine mezzanine;

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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("SampleFmt")
        public String sampleFmt;

        @NameInMap("SampleRate")
        public String sampleRate;

        @NameInMap("StartTime")
        public String startTime;

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
        @NameInMap("AvgFPS")
        public String avgFPS;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Dar")
        public String dar;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("HasBFrames")
        public String hasBFrames;

        @NameInMap("Height")
        public String height;

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Level")
        public String level;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("Sar")
        public String sar;

        @NameInMap("StartTime")
        public String startTime;

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
        @NameInMap("AudioStreamList")
        public java.util.List<GetMezzanineInfoResponseBodyMezzanineAudioStreamList> audioStreamList;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileURL")
        public String fileURL;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Height")
        public Long height;

        @NameInMap("OutputType")
        public String outputType;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Status")
        public String status;

        @NameInMap("VideoId")
        public String videoId;

        @NameInMap("VideoStreamList")
        public java.util.List<GetMezzanineInfoResponseBodyMezzanineVideoStreamList> videoStreamList;

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
