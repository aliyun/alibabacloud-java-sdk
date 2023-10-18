// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTemplateGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
         * <p>The transcoding configurations of the audio stream. The value is a JSON-formatted string.</p>
         */
        @NameInMap("Audio")
        public String audio;

        /**
         * <p>The clipping configurations of the video. The value is a JSON-formatted string. For example, you can set this parameter if you want to extract 5 seconds of content from a video to generate a new video.</p>
         */
        @NameInMap("Clip")
        public String clip;

        /**
         * <p>The format of the container used to encapsulate audio and video streams. The value is a JSON-formatted string.</p>
         */
        @NameInMap("Container")
        public String container;

        @NameInMap("CopyrightMark")
        public String copyrightMark;

        /**
         * <p>Valid values for the definition of a common transcoding template:</p>
         * <p>*   **LD**: low definition.</p>
         * <p>*   **SD**: standard definition.</p>
         * <p>*   **HD**: high definition.</p>
         * <p>*   **FHD**: ultra high definition.</p>
         * <p>*   **OD**: original quality.</p>
         * <p>*   **2K**</p>
         * <p>*   **4K**</p>
         * <p>*   **SQ**: standard sound quality.</p>
         * <p>*   **HQ**: high sound quality.</p>
         * <br>
         * <p>Valid values for the definition of a Narrowband HD™ 1.0 transcoding template:</p>
         * <p>*   **LD-NBV1**: low definition.</p>
         * <p>*   **SD-NBV1**: standard definition.</p>
         * <p>*   **HD-NBV1**: high definition.</p>
         * <p>*   **FHD-NBV1**: ultra high definition.</p>
         * <p>*   **2K-NBV1**</p>
         * <p>*   **4K-NBV1**</p>
         * <p>>*   You cannot modify the definition of transcoding templates.</p>
         * <p>>*   You cannot modify the system parameters, such as the video resolution, audio resolution, and bitrate, of Narrowband HD™ 1.0 transcoding templates.</p>
         * <p>>*   You can create only Narrowband HD™ 1.0 transcoding templates that support the FLV, M3U8 (HLS), and MP4 output formats.</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>The encryption configuration used for transcoding.</p>
         */
        @NameInMap("EncryptSetting")
        public String encryptSetting;

        /**
         * <p>The transcoding segment configurations. This parameter must be returned if HTTP-Live-Streaming (HLS) encryption is used. The value is a JSON-formatted string.</p>
         */
        @NameInMap("MuxConfig")
        public String muxConfig;

        /**
         * <p>The packaging configurations. Only HLS packaging and DASH packaging are supported. The value is a JSON-formatted string.</p>
         */
        @NameInMap("PackageSetting")
        public String packageSetting;

        /**
         * <p>The video rotation identifier. It is used to control the image rotation angle. For example, if you set this parameter to 180, the video image is turned upside down. Valid values: `0 to 360`.</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The subtitle configurations. The value is a JSON-formatted string.</p>
         */
        @NameInMap("SubtitleList")
        public String subtitleList;

        /**
         * <p>The name of the transcoding template.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TraceMark")
        public String traceMark;

        /**
         * <p>The conditional transcoding configurations. This parameter can be used if you want to determine the basic logic based on the bitrate and resolution of the mezzanine file before the video is transcoded. The value is a JSON-formatted string.</p>
         */
        @NameInMap("TransConfig")
        public String transConfig;

        /**
         * <p>The custom output path of transcoded files.</p>
         */
        @NameInMap("TranscodeFileRegular")
        public String transcodeFileRegular;

        /**
         * <p>The ID of the transcoding template.</p>
         */
        @NameInMap("TranscodeTemplateId")
        public String transcodeTemplateId;

        /**
         * <p>The type of the template. Valid values:</p>
         * <p>*   **Normal**: a common transcoding template. This is the default value. The PackageSetting parameter cannot be set for this type of template.</p>
         * <p>*   **VideoPackage**: a video stream package template. If this type of template is used, ApsaraVideo VOD transcodes a video into video streams in different bitrates and packages these video streams with a file. The PackageSetting parameter must be set for this type of template.</p>
         * <p>*   **SubtitlePackage**: a subtitle package template. If this type of template is used, ApsaraVideo VOD adds the subtitle information to the output file generated by packaging the multi-bitrate video streams of the corresponding video. You must set the PackageSetting parameter for a subtitle package template and associate the subtitle package template with a video stream package template. A template group can contain only one subtitle package template.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The transcoding configurations of the video stream. The value is a JSON-formatted string.</p>
         */
        @NameInMap("Video")
        public String video;

        /**
         * <p>The ID of the associated watermark.</p>
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
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the template group was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the template group is the default one. Valid values:</p>
         * <p>*   **Default**: The template group is the default one.</p>
         * <p>*   **NotDefault**: The template group is not the default one.</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>Indicates whether the template group is locked. Valid values:</p>
         * <p>*   **Disabled**: The template group is not locked.</p>
         * <p>*   **Enabled**: The template group is locked.</p>
         */
        @NameInMap("Locked")
        public String locked;

        /**
         * <p>The time when the template group was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The name of the template group.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the transcoding template group.</p>
         */
        @NameInMap("TranscodeTemplateGroupId")
        public String transcodeTemplateGroupId;

        /**
         * <p>The configurations of the transcoding templates.</p>
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
