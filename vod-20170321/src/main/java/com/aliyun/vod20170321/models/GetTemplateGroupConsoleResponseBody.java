// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTemplateGroupConsoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateGroup")
    public GetTemplateGroupConsoleResponseBodyTemplateGroup templateGroup;

    public static GetTemplateGroupConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateGroupConsoleResponseBody self = new GetTemplateGroupConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateGroupConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateGroupConsoleResponseBody setTemplateGroup(GetTemplateGroupConsoleResponseBodyTemplateGroup templateGroup) {
        this.templateGroup = templateGroup;
        return this;
    }
    public GetTemplateGroupConsoleResponseBodyTemplateGroup getTemplateGroup() {
        return this.templateGroup;
    }

    public static class GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateAudio extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Remove")
        public String remove;

        @NameInMap("Samplerate")
        public String samplerate;

        public static GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateAudio build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateAudio self = new GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateAudio();
            return TeaModel.build(map, self);
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateAudio setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

    }

    public static class GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateContainer extends TeaModel {
        @NameInMap("Format")
        public String format;

        public static GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateContainer build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateContainer self = new GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateContainer();
            return TeaModel.build(map, self);
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateEncryptionConfig extends TeaModel {
        @NameInMap("DecryptKeyUri")
        public String decryptKeyUri;

        @NameInMap("EncryptType")
        public String encryptType;

        @NameInMap("KeyEncryptMethod")
        public String keyEncryptMethod;

        public static GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateEncryptionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateEncryptionConfig self = new GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateEncryptionConfig();
            return TeaModel.build(map, self);
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateEncryptionConfig setDecryptKeyUri(String decryptKeyUri) {
            this.decryptKeyUri = decryptKeyUri;
            return this;
        }
        public String getDecryptKeyUri() {
            return this.decryptKeyUri;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateEncryptionConfig setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateEncryptionConfig setKeyEncryptMethod(String keyEncryptMethod) {
            this.keyEncryptMethod = keyEncryptMethod;
            return this;
        }
        public String getKeyEncryptMethod() {
            return this.keyEncryptMethod;
        }

    }

    public static class GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        public static GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfigSegment self = new GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfig extends TeaModel {
        @NameInMap("Segment")
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfigSegment segment;

        public static GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfig self = new GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfig();
            return TeaModel.build(map, self);
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfig setSegment(GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig extends TeaModel {
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        @NameInMap("IsCheckReso")
        public String isCheckReso;

        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        @NameInMap("TransMode")
        public String transMode;

        public static GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig self = new GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig();
            return TeaModel.build(map, self);
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Crf")
        public String crf;

        @NameInMap("Crop")
        public String crop;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Height")
        public String height;

        @NameInMap("LongShortMode")
        public String longShortMode;

        @NameInMap("Maxrate")
        public String maxrate;

        @NameInMap("Pad")
        public String pad;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Preset")
        public String preset;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Remove")
        public String remove;

        @NameInMap("ScanMode")
        public String scanMode;

        @NameInMap("Width")
        public String width;

        public static GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo self = new GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo();
            return TeaModel.build(map, self);
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setLongShortMode(String longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }
        public String getLongShortMode() {
            return this.longShortMode;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate extends TeaModel {
        @NameInMap("Audio")
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateAudio audio;

        @NameInMap("Condition")
        public String condition;

        @NameInMap("Container")
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateContainer container;

        @NameInMap("Definition")
        public String definition;

        @NameInMap("Encrypt")
        public String encrypt;

        @NameInMap("EncryptionConfig")
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateEncryptionConfig encryptionConfig;

        @NameInMap("IsLocked")
        public String isLocked;

        @NameInMap("MediaDefinition")
        public String mediaDefinition;

        @NameInMap("MuxConfig")
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfig muxConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("NarrowBand")
        public String narrowBand;

        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TransConfig")
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig transConfig;

        @NameInMap("UseWaterMark")
        public String useWaterMark;

        @NameInMap("UserWaterMark")
        public String userWaterMark;

        @NameInMap("Video")
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo video;

        public static GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate self = new GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate();
            return TeaModel.build(map, self);
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setAudio(GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateAudio audio) {
            this.audio = audio;
            return this;
        }
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateAudio getAudio() {
            return this.audio;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setContainer(GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateContainer container) {
            this.container = container;
            return this;
        }
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateContainer getContainer() {
            return this.container;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setEncrypt(String encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public String getEncrypt() {
            return this.encrypt;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setEncryptionConfig(GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateEncryptionConfig encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateEncryptionConfig getEncryptionConfig() {
            return this.encryptionConfig;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setIsLocked(String isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public String getIsLocked() {
            return this.isLocked;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setMediaDefinition(String mediaDefinition) {
            this.mediaDefinition = mediaDefinition;
            return this;
        }
        public String getMediaDefinition() {
            return this.mediaDefinition;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setMuxConfig(GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setNarrowBand(String narrowBand) {
            this.narrowBand = narrowBand;
            return this;
        }
        public String getNarrowBand() {
            return this.narrowBand;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setTransConfig(GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateTransConfig getTransConfig() {
            return this.transConfig;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setUseWaterMark(String useWaterMark) {
            this.useWaterMark = useWaterMark;
            return this;
        }
        public String getUseWaterMark() {
            return this.useWaterMark;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setUserWaterMark(String userWaterMark) {
            this.userWaterMark = userWaterMark;
            return this;
        }
        public String getUserWaterMark() {
            return this.userWaterMark;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate setVideo(GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo video) {
            this.video = video;
            return this;
        }
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplateVideo getVideo() {
            return this.video;
        }

    }

    public static class GetTemplateGroupConsoleResponseBodyTemplateGroupTemplates extends TeaModel {
        @NameInMap("Template")
        public java.util.List<GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate> template;

        public static GetTemplateGroupConsoleResponseBodyTemplateGroupTemplates build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupConsoleResponseBodyTemplateGroupTemplates self = new GetTemplateGroupConsoleResponseBodyTemplateGroupTemplates();
            return TeaModel.build(map, self);
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplates setTemplate(java.util.List<GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<GetTemplateGroupConsoleResponseBodyTemplateGroupTemplatesTemplate> getTemplate() {
            return this.template;
        }

    }

    public static class GetTemplateGroupConsoleResponseBodyTemplateGroup extends TeaModel {
        @NameInMap("DefaultGroup")
        public String defaultGroup;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupSymbol")
        public String groupSymbol;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("IsLocked")
        public String isLocked;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("Templates")
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplates templates;

        @NameInMap("TranscodeMode")
        public String transcodeMode;

        public static GetTemplateGroupConsoleResponseBodyTemplateGroup build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateGroupConsoleResponseBodyTemplateGroup self = new GetTemplateGroupConsoleResponseBodyTemplateGroup();
            return TeaModel.build(map, self);
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroup setDefaultGroup(String defaultGroup) {
            this.defaultGroup = defaultGroup;
            return this;
        }
        public String getDefaultGroup() {
            return this.defaultGroup;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroup setGroupSymbol(String groupSymbol) {
            this.groupSymbol = groupSymbol;
            return this;
        }
        public String getGroupSymbol() {
            return this.groupSymbol;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroup setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroup setIsLocked(String isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public String getIsLocked() {
            return this.isLocked;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroup setTemplates(GetTemplateGroupConsoleResponseBodyTemplateGroupTemplates templates) {
            this.templates = templates;
            return this;
        }
        public GetTemplateGroupConsoleResponseBodyTemplateGroupTemplates getTemplates() {
            return this.templates;
        }

        public GetTemplateGroupConsoleResponseBodyTemplateGroup setTranscodeMode(String transcodeMode) {
            this.transcodeMode = transcodeMode;
            return this;
        }
        public String getTranscodeMode() {
            return this.transcodeMode;
        }

    }

}
