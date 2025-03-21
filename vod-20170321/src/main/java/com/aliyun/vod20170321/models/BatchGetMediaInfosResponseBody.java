// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchGetMediaInfosResponseBody extends TeaModel {
    /**
     * <p>The IDs of the media assets that do not support the operation typically because you are not authorized to perform the operation. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
     */
    @NameInMap("ForbiddenMediaIds")
    public java.util.List<String> forbiddenMediaIds;

    /**
     * <p>Details about media assets.</p>
     */
    @NameInMap("MediaInfos")
    public java.util.List<BatchGetMediaInfosResponseBodyMediaInfos> mediaInfos;

    /**
     * <p>The IDs of the media assets that do not exist.</p>
     */
    @NameInMap("NonExistMediaIds")
    public java.util.List<String> nonExistMediaIds;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>781111****</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The name of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>CateName</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The thumbnail URL of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com/****.jpg">https://example.aliyundoc.com/****.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the media asset was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-14T09:15:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun VOD Video Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the offline download feature is enabled. If you enable the offline download feature, users can download and play videos by using the ApsaraVideo Player on a local PC. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Configure download settings</a>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("DownloadSwitch")
        public String downloadSwitch;

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>7753d144efd74d6c45fe0570****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The time when the media asset was last updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-06-26T06:38:48Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The period of time in which the audio file remains in the restored state.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30T10:14:14Z</p>
         */
        @NameInMap("RestoreExpiration")
        public String restoreExpiration;

        /**
         * <p>The restoration status of the media asset. Valid values:</p>
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
         * <p>The array of video snapshot URLs.</p>
         */
        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        /**
         * <p>The status of the video. Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong></li>
         * <li><strong>UploadFail</strong></li>
         * <li><strong>UploadSucc</strong></li>
         * <li><strong>Transcoding</strong></li>
         * <li><strong>TranscodeFail</strong></li>
         * <li><strong>Blocked</strong></li>
         * <li><strong>Normal</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: All media assets are stored as Standard objects.</li>
         * <li><strong>IA</strong>: All media assets are stored as IA objects.</li>
         * <li><strong>Archive</strong>: All media assets are stored as Archive objects.</li>
         * <li><strong>ColdArchive</strong>: All media assets are stored as Cold Archive objects.</li>
         * <li><strong>SourceIA</strong>: Only the source files are IA objects.</li>
         * <li><strong>SourceArchive</strong>: Only the source files are Archive objects.</li>
         * <li><strong>SourceColdArchive</strong>: Only the source file is stored as a Cold Archive object.</li>
         * <li><strong>Changing</strong>: The storage class of the media asset is being changed.</li>
         * <li><strong>SourceChanging</strong>: The storage class of the media asset is being changed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The storage address of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>outin-***.oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The tags of the media asset. Separate tags with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>tag1,tag2</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The ID of the transcoding template group.</p>
         * 
         * <strong>example:</strong>
         * <p>b4039216985f4312a5382a4ed****</p>
         */
        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        /**
         * <p>The title of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun VOD Video Title</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The custom parameters.</p>
         * 
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
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>62.885</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The output layout of the audio channels. Valid values:</p>
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
         * <p>The number of sound tracks.</p>
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
         * <p>The time base of the encoder.</p>
         * 
         * <strong>example:</strong>
         * <p>1/44100</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The duration.</p>
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
         * <p>The sampling rate.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("SampleRate")
        public String sampleRate;

        /**
         * <p>The start time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base.</p>
         * 
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
         * <p>The average frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>30.0</p>
         */
        @NameInMap("AvgFPS")
        public String avgFPS;

        /**
         * <p>The bitrate of the file. Unit: Kbit/s.</p>
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
         * <p>The time base of the encoder.</p>
         * 
         * <strong>example:</strong>
         * <p>1/60</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The display aspect ratio (DAR).</p>
         * 
         * <strong>example:</strong>
         * <p>0:1</p>
         */
        @NameInMap("Dar")
        public String dar;

        /**
         * <p>The duration.</p>
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
         * <p>Indicates whether the video stream contains bidirectional frames (B-frames).</p>
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
         * <p>The sequence number of the video stream. The value identifies the position of the video stream in all video streams.</p>
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
         * <p>The pixel format of the video stream.</p>
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
         * <p>The rotation angle of the video. Valid values: [0,360).</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The sample aspect ratio (SAR).</p>
         * 
         * <strong>example:</strong>
         * <p>0:1</p>
         */
        @NameInMap("Sar")
        public String sar;

        /**
         * <p>The start time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000000</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        /**
         * <p>The horizontal resolution of the video.</p>
         * 
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
        /**
         * <p>The information about the audio stream.</p>
         */
        @NameInMap("AudioStreamList")
        public java.util.List<BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoAudioStreamList> audioStreamList;

        /**
         * <p>The bitrate of the file. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>771.2280</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The time when the source file was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
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
         * <p>The OSS URL of the source file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/27ffc438-164h67f57ef-0005-6884-51a-1****.mp4">http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/27ffc438-164h67f57ef-0005-6884-51a-1****.mp4</a></p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The frame rate of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>25.0000</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the file. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>540</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1f1a6fc03ca04814031b8a6559e****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The size of the file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>4096477</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The state of the file. Valid values:</p>
         * <ul>
         * <li><strong>Uploading</strong>: The file is being uploaded. This is the initial status.</li>
         * <li><strong>Normal</strong>: The file is uploaded.</li>
         * <li><strong>UploadFail</strong>: The file failed to be uploaded.</li>
         * <li><strong>Deleted</strong>: The file is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The information about the video streams.</p>
         */
        @NameInMap("VideoStreamList")
        public java.util.List<BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfoVideoStreamList> videoStreamList;

        /**
         * <p>The width of the file. Unit: pixels.</p>
         * 
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

    public static class BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList extends TeaModel {
        /**
         * <p>The color depth. This value is an integer.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("BitDepth")
        public Integer bitDepth;

        /**
         * <p>The bitrate of the media stream. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>450.878</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The short name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>h264</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The creation time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-18T07:37:15Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The quality of the video stream. Valid values:</p>
         * <ul>
         * <li><strong>FD</strong>: low definition</li>
         * <li><strong>LD</strong>: standard definition</li>
         * <li><strong>SD</strong>: high definition</li>
         * <li><strong>HD</strong>: ultra-high definition</li>
         * <li><strong>OD</strong>: original definition</li>
         * <li><strong>2K</strong></li>
         * <li><strong>4K</strong></li>
         * <li><strong>SQ</strong>: standard sound quality</li>
         * <li><strong>HQ</strong>: high sound quality</li>
         * <li><strong>AUTO</strong>: adaptive bitrate</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LD</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>The duration of the media stream. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>9.0464</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>Indicates whether the media stream was encrypted. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The media stream is not encrypted.</li>
         * <li><strong>1</strong>: The media stream is encrypted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Encrypt")
        public Long encrypt;

        /**
         * <p>The encryption type of the media stream. Valid values:</p>
         * <ul>
         * <li><strong>License</strong>: decryption on local devices.</li>
         * </ul>
         * <blockquote>
         * <p> If the encryption type is <strong>License</strong>, only ApsaraVideo Player SDK can be used to play videos.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>License</p>
         */
        @NameInMap("EncryptMode")
        public String encryptMode;

        /**
         * <p>The encryption type of the media stream. Valid values:</p>
         * <ul>
         * <li><strong>AliyunVoDEncryption</strong>: Alibaba Cloud proprietary cryptography</li>
         * <li><strong>HLSEncryption</strong>: HTTP Live Streaming (HLS) encryption</li>
         * </ul>
         * <blockquote>
         * <p> If the encryption type is AliyunVoDEncryption, only ApsaraVideo Player SDK can be used to play videos.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AliyunVoDEncryption</p>
         */
        @NameInMap("EncryptType")
        public String encryptType;

        /**
         * <p>The format of the media stream.</p>
         * <ul>
         * <li>If the media file is a video file, the valid values are <strong>mp4</strong> and <strong>m3u8</strong>.</li>
         * <li>If the media asset is an audio-only file, the value is <strong>mp3</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate of the media stream. Unit: frames per second (FPS).</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The HDR type of the media stream. Valid values:</p>
         * <ul>
         * <li>HDR</li>
         * <li>HDR10</li>
         * <li>HLG</li>
         * <li>DolbyVision</li>
         * <li>HDRVivid</li>
         * <li>SDR+</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HLG</p>
         */
        @NameInMap("HDRType")
        public String HDRType;

        /**
         * <p>The height of the media stream. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>640</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <p>The custom watermark information of the copyright watermark. This parameter is returned if you set <code>JobType</code> to <code>2</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>CopyrightMarkTest</p>
         */
        @NameInMap("JobExt")
        public String jobExt;

        /**
         * <p>The job ID for transcoding the media stream. This ID uniquely identifies a media stream.</p>
         * 
         * <strong>example:</strong>
         * <p>80e9c6580e754a798c3c19c59b16****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The type of the digital watermark. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: user-tracing watermark</li>
         * <li><strong>2</strong>: copyright watermark</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("JobType")
        public Integer jobType;

        /**
         * <p>The update time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-20T06:32:19Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The transcoding type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: regular transcoding</li>
         * <li><strong>1.0</strong>: Narrowband HD™ 1.0 transcoding</li>
         * <li><strong>2.0</strong>: Narrowband HD™ 2.0 transcoding</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NarrowBandType")
        public String narrowBandType;

        /**
         * <p>The playback URL of the video stream.</p>
         */
        @NameInMap("PlayURL")
        public String playURL;

        /**
         * <p>The size of the media stream. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>418112</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The specifications of transcoded audio and video streams. For more information about the valid values, see <a href="~~124671#section-6bv-l0g-opq~~">Output specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>H264.LD</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <p>The status of the audio or video stream. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The latest transcoded stream in each quality and format is in the Normal status.</li>
         * <li><strong>Invisible</strong>: If multiple streams are transcoded in the same quality and format, the latest transcoded stream is in the Normal status and other streams are in the Invisible status.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the media stream. If the media stream is a video stream, the value is <strong>video</strong>. If the media stream is an audio-only stream, the value is <strong>audio</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The ID of the transcoding template group.</p>
         * 
         * <strong>example:</strong>
         * <p>fb0716154b21a4ecb5b70a26ccc8****</p>
         */
        @NameInMap("TemplateGroupId")
        public String templateGroupId;

        /**
         * <p>The ID of the transcoding template.</p>
         * 
         * <strong>example:</strong>
         * <p>a86a4338dd2e83da45154004a541****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The ID of the watermark that is associated with the media stream.</p>
         * 
         * <strong>example:</strong>
         * <p>dgfn26457856****</p>
         */
        @NameInMap("WatermarkId")
        public String watermarkId;

        /**
         * <p>The width of the media stream. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>360</p>
         */
        @NameInMap("Width")
        public Long width;

        public static BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList self = new BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList();
            return TeaModel.build(map, self);
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setBitDepth(Integer bitDepth) {
            this.bitDepth = bitDepth;
            return this;
        }
        public Integer getBitDepth() {
            return this.bitDepth;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setEncrypt(Long encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public Long getEncrypt() {
            return this.encrypt;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setEncryptMode(String encryptMode) {
            this.encryptMode = encryptMode;
            return this;
        }
        public String getEncryptMode() {
            return this.encryptMode;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setHDRType(String HDRType) {
            this.HDRType = HDRType;
            return this;
        }
        public String getHDRType() {
            return this.HDRType;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setJobExt(String jobExt) {
            this.jobExt = jobExt;
            return this;
        }
        public String getJobExt() {
            return this.jobExt;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setNarrowBandType(String narrowBandType) {
            this.narrowBandType = narrowBandType;
            return this;
        }
        public String getNarrowBandType() {
            return this.narrowBandType;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setPlayURL(String playURL) {
            this.playURL = playURL;
            return this;
        }
        public String getPlayURL() {
            return this.playURL;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setTemplateGroupId(String templateGroupId) {
            this.templateGroupId = templateGroupId;
            return this;
        }
        public String getTemplateGroupId() {
            return this.templateGroupId;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

        public BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class BatchGetMediaInfosResponseBodyMediaInfos extends TeaModel {
        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>10a5fa364a5b71ef89246733a78e****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The basic information of the media asset.</p>
         */
        @NameInMap("MediaInfo")
        public BatchGetMediaInfosResponseBodyMediaInfosMediaInfo mediaInfo;

        /**
         * <p>The source file information.</p>
         */
        @NameInMap("MezzanineInfo")
        public BatchGetMediaInfosResponseBodyMediaInfosMezzanineInfo mezzanineInfo;

        /**
         * <p>The information about the audio or video stream.</p>
         */
        @NameInMap("PlayInfoList")
        public java.util.List<BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList> playInfoList;

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

        public BatchGetMediaInfosResponseBodyMediaInfos setPlayInfoList(java.util.List<BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList> playInfoList) {
            this.playInfoList = playInfoList;
            return this;
        }
        public java.util.List<BatchGetMediaInfosResponseBodyMediaInfosPlayInfoList> getPlayInfoList() {
            return this.playInfoList;
        }

    }

}
