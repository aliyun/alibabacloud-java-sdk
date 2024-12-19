// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchGetMediaInfosResponseBody extends TeaModel {
    @NameInMap("ForbiddenMediaIds")
    public java.util.List<String> forbiddenMediaIds;

    @NameInMap("MediaInfos")
    public java.util.List<BatchGetMediaInfosResponseBodyMediaInfos> mediaInfos;

    @NameInMap("NonExistMediaIds")
    public java.util.List<String> nonExistMediaIds;

    /**
     * <strong>example:</strong>
     * <p>9E290613-04F4-47F4-795D30732077****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchGetMediaInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetMediaInfosResponseBody self = new BatchGetMediaInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetMediaInfosResponseBody setForbiddenMediaIds(java.util.List<String> forbiddenMediaIds) {
        this.forbiddenMediaIds = forbiddenMediaIds;
        return this;
    }
    public java.util.List<String> getForbiddenMediaIds() {
        return this.forbiddenMediaIds;
    }

    public BatchGetMediaInfosResponseBody setMediaInfos(java.util.List<BatchGetMediaInfosResponseBodyMediaInfos> mediaInfos) {
        this.mediaInfos = mediaInfos;
        return this;
    }
    public java.util.List<BatchGetMediaInfosResponseBodyMediaInfos> getMediaInfos() {
        return this.mediaInfos;
    }

    public BatchGetMediaInfosResponseBody setNonExistMediaIds(java.util.List<String> nonExistMediaIds) {
        this.nonExistMediaIds = nonExistMediaIds;
        return this;
    }
    public java.util.List<String> getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    public BatchGetMediaInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchGetMediaInfosResponseBodyMediaInfosMediaInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>781111****</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com/****.jpg">https://example.aliyundoc.com/****.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <strong>example:</strong>
         * <p>2017-11-14T09:15:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("DownloadSwitch")
        public String downloadSwitch;

        /**
         * <strong>example:</strong>
         * <p>7753d144efd74d6c45fe0570****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>2017-06-26T06:38:48Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <strong>example:</strong>
         * <p>2023-03-30T10:14:14Z</p>
         */
        @NameInMap("RestoreExpiration")
        public String restoreExpiration;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("RestoreStatus")
        public String restoreStatus;

        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <strong>example:</strong>
         * <p>outin-***.oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("Tags")
        public String tags;

        /**
         * <strong>example:</strong>
         * <p>b4039216985f4312a5382a4ed****</p>
         */
        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>{&quot;Extend&quot;:&quot;xxx&quot;,&quot;MessageCallback&quot;:&quot;xxx&quot;}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static BatchGetMediaInfosResponseBodyMediaInfosMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            BatchGetMediaInfosResponseBodyMediaInfosMediaInfo self = new BatchGetMediaInfosResponseBodyMediaInfosMediaInfo();
            return TeaModel.build(map, self);
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setDownloadSwitch(String downloadSwitch) {
            this.downloadSwitch = downloadSwitch;
            return this;
        }
        public String getDownloadSwitch() {
            return this.downloadSwitch;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setRestoreExpiration(String restoreExpiration) {
            this.restoreExpiration = restoreExpiration;
            return this;
        }
        public String getRestoreExpiration() {
            return this.restoreExpiration;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setRestoreStatus(String restoreStatus) {
            this.restoreStatus = restoreStatus;
            return this;
        }
        public String getRestoreStatus() {
            return this.restoreStatus;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setSnapshots(java.util.List<String> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<String> getSnapshots() {
            return this.snapshots;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setTemplateGroupId(String templateGroupId) {
            this.templateGroupId = templateGroupId;
            return this;
        }
        public String getTemplateGroupId() {
            return this.templateGroupId;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>62.885</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <strong>example:</strong>
         * <p>mono</p>
         */
        @NameInMap("ChannelLayout")
        public String channelLayout;

        /**
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>3.227574</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <strong>example:</strong>
         * <p>und</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

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
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>0.000000</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        public static BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList self = new BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList();
            return TeaModel.build(map, self);
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30.0</p>
         */
        @NameInMap("AvgFPS")
        public String avgFPS;

        /**
         * <strong>example:</strong>
         * <p>500</p>
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
         * <p>0x31637661</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <strong>example:</strong>
         * <p>avc1</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <strong>example:</strong>
         * <p>1/60</p>
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
         * <p>3.166667</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>30.0</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <strong>example:</strong>
         * <p>HDR</p>
         */
        @NameInMap("HDRType")
        public String HDRType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HasBFrames")
        public String hasBFrames;

        /**
         * <strong>example:</strong>
         * <p>320</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <strong>example:</strong>
         * <p>und</p>
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
         * <p>0</p>
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
         * <p>Main</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <strong>example:</strong>
         * <p>90</p>
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
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>0.000000</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        /**
         * <strong>example:</strong>
         * <p>568</p>
         */
        @NameInMap("Width")
        public String width;

        public static BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList self = new BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList();
            return TeaModel.build(map, self);
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setHDRType(String HDRType) {
            this.HDRType = HDRType;
            return this;
        }
        public String getHDRType() {
            return this.HDRType;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo extends TeaModel {
        @NameInMap("AudioStreamList")
        public java.util.List<BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList> audioStreamList;

        /**
         * <strong>example:</strong>
         * <p>771.2280</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <strong>example:</strong>
         * <p>2017-11-14T09:15:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>42.4930</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>27ffc438-164h67f57ef-0005-6884-51a-1****.mp4</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/27ffc438-164h67f57ef-0005-6884-51a-1****.mp4">http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/27ffc438-164h67f57ef-0005-6884-51a-1****.mp4</a></p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <strong>example:</strong>
         * <p>25.0000</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <strong>example:</strong>
         * <p>540</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <strong>example:</strong>
         * <p>1f1a6fc03ca04814031b8a6559e****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>4096477</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("VideoStreamList")
        public java.util.List<BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList> videoStreamList;

        /**
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("Width")
        public Long width;

        public static BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo build(java.util.Map<String, ?> map) throws Exception {
            BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo self = new BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo();
            return TeaModel.build(map, self);
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo setAudioStreamList(java.util.List<BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList> audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public java.util.List<BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList> getAudioStreamList() {
            return this.audioStreamList;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo setVideoStreamList(java.util.List<BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList> videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public java.util.List<BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList> getVideoStreamList() {
            return this.videoStreamList;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class BatchGetMediaInfosResponseBodyMediaInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10a5fa364a5b71ef89246733a78e****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaInfo")
        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo mediaInfo;

        @NameInMap("MezzanineInfo")
        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo mezzanineInfo;

        public static BatchGetMediaInfosResponseBodyMediaInfos build(java.util.Map<String, ?> map) throws Exception {
            BatchGetMediaInfosResponseBodyMediaInfos self = new BatchGetMediaInfosResponseBodyMediaInfos();
            return TeaModel.build(map, self);
        }

        public BatchGetMediaInfosResponseBodyMediaInfos setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public BatchGetMediaInfosResponseBodyMediaInfos setMediaInfo(BatchGetMediaInfosResponseBodyMediaInfosMediaInfo mediaInfo) {
            this.mediaInfo = mediaInfo;
            return this;
        }
        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo getMediaInfo() {
            return this.mediaInfo;
        }

        public BatchGetMediaInfosResponseBodyMediaInfos setMezzanineInfo(BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo mezzanineInfo) {
            this.mezzanineInfo = mezzanineInfo;
            return this;
        }
        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo getMezzanineInfo() {
            return this.mezzanineInfo;
        }

    }

}
