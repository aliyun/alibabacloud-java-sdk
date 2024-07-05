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
     * <p>The information about the transcoding template group.</p>
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
         * <p>The transcoding configurations of the audio stream. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Codec\&quot;:\&quot;AAC\&quot;,\&quot;Remove\&quot;:\&quot;false\&quot;,\&quot;Bitrate\&quot;:\&quot;44\&quot;,\&quot;Samplerate\&quot;:\&quot;32000\&quot;,\&quot;Channels\&quot;:\&quot;2\&quot;,\&quot;Profile\&quot;:\&quot;aac_low\&quot;}</p>
         */
        @NameInMap("Audio")
        public String audio;

        /**
         * <p>The clipping configurations of the video. The value is a JSON string. For example, this parameter is returned if you extract 5 seconds of content from a video to generate a new video.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;TimeSpan\&quot;:{\&quot;Seek\&quot;:\&quot;1\&quot;,\&quot;Duration\&quot;:\&quot;5\&quot;}</p>
         */
        @NameInMap("Clip")
        public String clip;

        /**
         * <p>The format of the container used to encapsulate audio and video streams. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Format&quot;:&quot;m3u8&quot;</p>
         */
        @NameInMap("Container")
        public String container;

        /**
         * <p>The content of the copyright watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Content&quot;: &quot;test&quot;
         * }</p>
         */
        @NameInMap("CopyrightMark")
        public String copyrightMark;

        /**
         * <p>Valid values for the definition of a common transcoding template:</p>
         * <ul>
         * <li><strong>LD</strong>: low definition.</li>
         * <li><strong>SD</strong>: standard definition.</li>
         * <li><strong>HD</strong>: high definition.</li>
         * <li><strong>FHD</strong>: ultra high definition.</li>
         * <li><strong>OD</strong>: original quality.</li>
         * <li><strong>2K</strong></li>
         * <li><strong>4K</strong></li>
         * <li><strong>SQ</strong>: standard sound quality.</li>
         * <li><strong>HQ</strong>: high sound quality.</li>
         * </ul>
         * <p>Valid values for the definition of a Narrowband HD™ 1.0 transcoding template:</p>
         * <ul>
         * <li><strong>LD-NBV1</strong>: low definition.</li>
         * <li><strong>SD-NBV1</strong>: standard definition.</li>
         * <li><strong>HD-NBV1</strong>: high definition.</li>
         * <li><strong>FHD-NBV1</strong>: ultra high definition.</li>
         * <li><strong>2K-NBV1</strong></li>
         * <li><strong>4K-NBV1</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You cannot change the definition of a transcoding template.</li>
         * <li>You cannot modify the system parameters, such as the video resolution, audio resolution, and bitrate, of Narrowband HD™ 1.0 transcoding templates.</li>
         * <li>You can create only Narrowband HD™ 1.0 transcoding templates that support the FLV, M3U8 (HLS), and MP4 output formats.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SD</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>The encryption configuration for transcoding.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;EncryptType&quot;:&quot;Private&quot;</p>
         */
        @NameInMap("EncryptSetting")
        public String encryptSetting;

        /**
         * <p>The transcoding segment configurations. This parameter must be returned if HTTP-Live-Streaming (HLS) encryption is used. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Segment&quot;: { &quot;Duration&quot;:&quot;6&quot; }</p>
         */
        @NameInMap("MuxConfig")
        public String muxConfig;

        /**
         * <p>The packaging configuration. Only HLS packaging and DASH packaging are supported. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;PackageType&quot;:&quot;HLSPackage&quot;,&quot;PackageConfig&quot;:{   &quot;BandWidth&quot;:&quot;900000&quot;  }</p>
         */
        @NameInMap("PackageSetting")
        public String packageSetting;

        /**
         * <p>The video rotation identifier. It is used to control the image rotation angle. For example, if you set this parameter to 180, the video image is turned upside down. Valid values: <code>[0,360]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The subtitle configurations. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;SubtitleUrl&quot;:&quot;<a href="http://outin-test.oss-cn-shanghai.aliyuncs.com/subtitles/c737fece-14f1-4364-b107-d5f7f8edde0e.ass%22,%22CharEncode%22:%22utf-8%22%7D%5D">http://outin-test.oss-cn-shanghai.aliyuncs.com/subtitles/c737fece-14f1-4364-b107-d5f7f8edde0e.ass&quot;,&quot;CharEncode&quot;:&quot;utf-8&quot;}]</a></p>
         */
        @NameInMap("SubtitleList")
        public String subtitleList;

        /**
         * <p>The name of the transcoding template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The content of the tracing watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Enable&quot;: true
         * }</p>
         */
        @NameInMap("TraceMark")
        public String traceMark;

        /**
         * <p>The conditional transcoding configurations. This parameter can be used if you want to determine the basic logic based on the bitrate and resolution of the source file before the video is transcoded. The value is a JSON-formatted string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;IsCheckReso&quot;:&quot;true&quot;,&quot;IsCheckResoFail&quot;:&quot;false&quot;,&quot;IsCheckVideoBitrate&quot;:&quot;false&quot;,&quot;IsCheckVideoBitrateFail&quot;:&quot;false&quot;,&quot;IsCheckAudioBitrate&quot;:&quot;false&quot;,&quot;IsCheckAudioBitrateFail&quot;:&quot;false&quot;}</p>
         */
        @NameInMap("TransConfig")
        public String transConfig;

        /**
         * <p>The custom path used to store the output files.</p>
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
         * <p>The type of the transcoding template. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong> (default): a common transcoding template. The PackageSetting parameter cannot be set for this type of template.</li>
         * <li><strong>VideoPackage</strong>: a video stream package template. If this type of template is used, ApsaraVideo VOD transcodes a video into video streams in different bitrates and packages these video streams with a file. The PackageSetting parameter must be set for this type of template.</li>
         * <li><strong>SubtitlePackage</strong>: a subtitle package template. If this type of template is used, ApsaraVideo VOD adds the subtitle information to the output file generated by packaging the multi-bitrate video streams of the corresponding video without transcoding. You must set the PackageSetting parameter for a subtitle package template and associate the subtitle package template with a video stream package template. A template group can contain only one subtitle package template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The transcoding configurations of the video stream. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Bitrate&quot;:&quot;900&quot;,&quot;Width&quot;:&quot;960&quot;,&quot;Remove&quot;:&quot;false&quot;,&quot;Fps&quot;:&quot;30&quot;}</p>
         */
        @NameInMap("Video")
        public String video;

        /**
         * <p>The IDs of the associated watermarks.</p>
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
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the transcoding template group was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-12T10:20:51Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the template group is the default one. Valid values:</p>
         * <ul>
         * <li><strong>Default</strong></li>
         * <li><strong>NotDefault</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotDefault</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>Indicates whether the transcoding template group is locked. Valid values:</p>
         * <ul>
         * <li><strong>Disabled</strong>: The template group is not locked.</li>
         * <li><strong>Enabled</strong>: The template group is locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Locked")
        public String locked;

        /**
         * <p>The time when the transcoding template group was last modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-12T11:20:51Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The name of the transcoding template group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the transcoding template group.</p>
         * 
         * <strong>example:</strong>
         * <p>a59b11f697c716*****6ae1502142d0</p>
         */
        @NameInMap("TranscodeTemplateGroupId")
        public String transcodeTemplateGroupId;

        /**
         * <p>The information about the transcoding templates.</p>
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
