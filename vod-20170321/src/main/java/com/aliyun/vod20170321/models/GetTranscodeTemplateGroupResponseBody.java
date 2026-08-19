// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTemplateGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6730AC93-7B12-4B*****7F-49EE1FE8BC49</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The transcoding template group data.</p>
     */
    @NameInMap("TranscodeTemplateGroup")
    public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup transcodeTemplateGroup;

    public static GetTranscodeTemplateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTemplateGroupResponseBody self = new GetTranscodeTemplateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTranscodeTemplateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTranscodeTemplateGroupResponseBody setTranscodeTemplateGroup(GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup transcodeTemplateGroup) {
        this.transcodeTemplateGroup = transcodeTemplateGroup;
        return this;
    }
    public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup getTranscodeTemplateGroup() {
        return this.transcodeTemplateGroup;
    }

    public static class GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList extends TeaModel {
        /**
         * <p>The audio stream transcoding configuration parameters (JSON string).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Codec&quot;:&quot;AAC&quot;,&quot;Remove&quot;:&quot;false&quot;,&quot;Bitrate&quot;:&quot;44&quot;,&quot;Samplerate&quot;:&quot;32000&quot;,&quot;Channels&quot;:&quot;2&quot;,&quot;Profile&quot;:&quot;aac_low&quot;}</p>
         */
        @NameInMap("Audio")
        public String audio;

        /**
         * <p>The video clipping configuration (JSON string). For example, set this parameter if you want to extract 5 seconds of content from a video to generate a new video.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TimeSpan&quot;:{&quot;Seek&quot;:&quot;1&quot;,&quot;Duration&quot;:&quot;5&quot;}</p>
         */
        @NameInMap("Clip")
        public String clip;

        /**
         * <p>The container format for encapsulating audio and video streams (JSON string).</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Format&quot;:&quot;m3u8&quot;</p>
         */
        @NameInMap("Container")
        public String container;

        /**
         * <p>The copyright watermark information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;Content&quot;: &quot;Test copyright watermark text&quot;
         * }</p>
         */
        @NameInMap("CopyrightMark")
        public String copyrightMark;

        /**
         * <p>The definition mark for normal transcoding templates:</p>
         * <ul>
         * <li><strong>LD</strong> (low definition)</li>
         * <li><strong>SD</strong> (standard definition)</li>
         * <li><strong>HD</strong> (high definition)</li>
         * <li><strong>FHD</strong> (full high definition)</li>
         * <li><strong>OD</strong> (original definition, container format conversion)</li>
         * <li><strong>2K</strong></li>
         * <li><strong>4K</strong></li>
         * <li><strong>SQ</strong> (standard audio quality)</li>
         * <li><strong>HQ</strong> (high audio quality)</li>
         * </ul>
         * <p>The definition mark for Narrowband HD 1.0 built-in transcoding templates:</p>
         * <ul>
         * <li><strong>LD-NBV1</strong> (low definition)</li>
         * <li><strong>SD-NBV1</strong> (standard definition)</li>
         * <li><strong>HD-NBV1</strong> (high definition)</li>
         * <li><strong>FHD-NBV1</strong> (full high definition)</li>
         * <li><strong>2K-NBV1</strong></li>
         * <li><strong>4K-NBV1</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The definition mark of transcoding templates cannot be modified.</li>
         * <li>The audio and video resolution, bitrate, and other parameters of Narrowband HD 1.0 transcoding templates are built into the system and cannot be modified.</li>
         * <li>Narrowband HD 1.0 transcoding templates can only be created in FLV, M3U8 (HLS), or MP4 format.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SD</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>The transcoding encryption configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;EncryptType&quot;:&quot;Private&quot;</p>
         */
        @NameInMap("EncryptSetting")
        public String encryptSetting;

        /**
         * <p>The segment setting parameters for transcoding. Required for HLS (JSON string).</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Segment&quot;: { &quot;Duration&quot;:&quot;6&quot; }</p>
         */
        @NameInMap("MuxConfig")
        public String muxConfig;

        /**
         * <p>The packaging configuration. Only HLS adaptive bitrate streaming packaging and DASH packaging are supported (JSON string).</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;PackageType&quot;:&quot;HLSPackage&quot;,&quot;PackageConfig&quot;:{   &quot;BandWidth&quot;:&quot;900000&quot;  }</p>
         */
        @NameInMap("PackageSetting")
        public String packageSetting;

        /**
         * <p>The video rotation parameter. Controls the rotation angle of the video. For example, if set to 180, the video is flipped upside down. Value range: <code>[0,360]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The subtitle configuration (JSON string).</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;SubtitleUrl&quot;:&quot;<a href="http://outin-test.oss-cn-shanghai.aliyuncs.com/subtitles/c737fece-14f1-4364-b107-d5f7f8edde0e.ass%22,%22CharEncode%22:%22utf-8%22%7D%5D">http://outin-test.oss-cn-shanghai.aliyuncs.com/subtitles/c737fece-14f1-4364-b107-d5f7f8edde0e.ass&quot;,&quot;CharEncode&quot;:&quot;utf-8&quot;}]</a></p>
         */
        @NameInMap("SubtitleList")
        public String subtitleList;

        /**
         * <p>The transcoding template name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The tracing watermark information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Enable&quot;: true
         * }</p>
         */
        @NameInMap("TraceMark")
        public String traceMark;

        /**
         * <p>The conditional transcoding parameters. Set this parameter if you want to perform basic logic checks based on the bitrate or resolution of the source file before outputting the transcoded video (JSON string).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;IsCheckReso&quot;:&quot;true&quot;,&quot;IsCheckResoFail&quot;:&quot;false&quot;,&quot;IsCheckVideoBitrate&quot;:&quot;false&quot;,&quot;IsCheckVideoBitrateFail&quot;:&quot;false&quot;,&quot;IsCheckAudioBitrate&quot;:&quot;false&quot;,&quot;IsCheckAudioBitrateFail&quot;:&quot;false&quot;}</p>
         */
        @NameInMap("TransConfig")
        public String transConfig;

        /**
         * <p>The custom transcoding output path.</p>
         * 
         * <strong>example:</strong>
         * <p>{MediaId}/transcoce_1</p>
         */
        @NameInMap("TranscodeFileRegular")
        public String transcodeFileRegular;

        /**
         * <p>The transcoding template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>696d29a11erc057*****a3acc398d02f4</p>
         */
        @NameInMap("TranscodeTemplateId")
        public String transcodeTemplateId;

        /**
         * <p>The templatetype. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong> (default): a normal transcoding template. The PackageSetting parameter cannot be configured in Settings for this type of template.</li>
         * <li><strong>VideoPackage</strong>: a video stream packaging template. This type of template first transcodes and then builds adaptive bitrate streaming. The PackageSetting parameter must be configured in Settings for this type of template.</li>
         * <li><strong>SubtitlePackage</strong>: a subtitle packaging template. This type of template does not transcode but only builds the corresponding subtitle information into the adaptive bitrate streaming output file. The PackageSetting parameter must be configured in Settings for this type of template. This type of template cannot exist alone in a template group and must be configured together with a VideoPackage type template. Only one SubtitlePackage template can be configured in a template group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The video stream transcoding configuration parameters (JSON string).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Bitrate&quot;:&quot;900&quot;,&quot;Width&quot;:&quot;960&quot;,&quot;Remove&quot;:&quot;false&quot;,&quot;Fps&quot;:&quot;30&quot;}</p>
         */
        @NameInMap("Video")
        public String video;

        /**
         * <p>The IDs of associated image and text watermark templates.</p>
         */
        @NameInMap("WatermarkIds")
        public java.util.List<String> watermarkIds;

        public static GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList self = new GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList();
            return TeaModel.build(map, self);
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setAudio(String audio) {
            this.audio = audio;
            return this;
        }
        public String getAudio() {
            return this.audio;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setClip(String clip) {
            this.clip = clip;
            return this;
        }
        public String getClip() {
            return this.clip;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setCopyrightMark(String copyrightMark) {
            this.copyrightMark = copyrightMark;
            return this;
        }
        public String getCopyrightMark() {
            return this.copyrightMark;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setEncryptSetting(String encryptSetting) {
            this.encryptSetting = encryptSetting;
            return this;
        }
        public String getEncryptSetting() {
            return this.encryptSetting;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setMuxConfig(String muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public String getMuxConfig() {
            return this.muxConfig;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setPackageSetting(String packageSetting) {
            this.packageSetting = packageSetting;
            return this;
        }
        public String getPackageSetting() {
            return this.packageSetting;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setSubtitleList(String subtitleList) {
            this.subtitleList = subtitleList;
            return this;
        }
        public String getSubtitleList() {
            return this.subtitleList;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setTraceMark(String traceMark) {
            this.traceMark = traceMark;
            return this;
        }
        public String getTraceMark() {
            return this.traceMark;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setTransConfig(String transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public String getTransConfig() {
            return this.transConfig;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setTranscodeFileRegular(String transcodeFileRegular) {
            this.transcodeFileRegular = transcodeFileRegular;
            return this;
        }
        public String getTranscodeFileRegular() {
            return this.transcodeFileRegular;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setTranscodeTemplateId(String transcodeTemplateId) {
            this.transcodeTemplateId = transcodeTemplateId;
            return this;
        }
        public String getTranscodeTemplateId() {
            return this.transcodeTemplateId;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setVideo(String video) {
            this.video = video;
            return this;
        }
        public String getVideo() {
            return this.video;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList setWatermarkIds(java.util.List<String> watermarkIds) {
            this.watermarkIds = watermarkIds;
            return this;
        }
        public java.util.List<String> getWatermarkIds() {
            return this.watermarkIds;
        }

    }

    public static class GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the template group was created. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-12T10:20:51Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the template group is the default one. Valid values:</p>
         * <ul>
         * <li><strong>Default</strong>: The template group is the default one.</li>
         * <li><strong>NotDefault</strong>: The template group is not the default one.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotDefault</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>Indicates whether the template group is locked. Valid values:</p>
         * <ul>
         * <li><strong>Disabled</strong>: Not locked.</li>
         * <li><strong>Enabled</strong>: Locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Locked")
        public String locked;

        /**
         * <p>The time when the template group was last modified. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-12T11:20:51Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The name of the template group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The transcoding template group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a59b11f697c716*****6ae1502142d0</p>
         */
        @NameInMap("TranscodeTemplateGroupId")
        public String transcodeTemplateGroupId;

        /**
         * <p>The list of transcoding template configurations.</p>
         */
        @NameInMap("TranscodeTemplateList")
        public java.util.List<GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList> transcodeTemplateList;

        public static GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup self = new GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup();
            return TeaModel.build(map, self);
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup setLocked(String locked) {
            this.locked = locked;
            return this;
        }
        public String getLocked() {
            return this.locked;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }
        public String getTranscodeTemplateGroupId() {
            return this.transcodeTemplateGroupId;
        }

        public GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroup setTranscodeTemplateList(java.util.List<GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList> transcodeTemplateList) {
            this.transcodeTemplateList = transcodeTemplateList;
            return this;
        }
        public java.util.List<GetTranscodeTemplateGroupResponseBodyTranscodeTemplateGroupTranscodeTemplateList> getTranscodeTemplateList() {
            return this.transcodeTemplateList;
        }

    }

}
