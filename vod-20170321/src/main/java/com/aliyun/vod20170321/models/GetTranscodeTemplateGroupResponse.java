// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TranscodeTemplateGroup")
    @Validation(required = true)
    public GetTranscodeTemplateGroupResponseTranscodeTemplateGroup transcodeTemplateGroup;

    public static GetTranscodeTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTemplateGroupResponse self = new GetTranscodeTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class GetTranscodeTemplateGroupResponseTranscodeTemplateGroupTranscodeTemplateList extends TeaModel {
        @NameInMap("TranscodeTemplateId")
        @Validation(required = true)
        public String transcodeTemplateId;

        @NameInMap("Video")
        @Validation(required = true)
        public String video;

        @NameInMap("Audio")
        @Validation(required = true)
        public String audio;

        @NameInMap("Container")
        @Validation(required = true)
        public String container;

        @NameInMap("MuxConfig")
        @Validation(required = true)
        public String muxConfig;

        @NameInMap("TransConfig")
        @Validation(required = true)
        public String transConfig;

        @NameInMap("Definition")
        @Validation(required = true)
        public String definition;

        @NameInMap("EncryptSetting")
        @Validation(required = true)
        public String encryptSetting;

        @NameInMap("PackageSetting")
        @Validation(required = true)
        public String packageSetting;

        @NameInMap("SubtitleList")
        @Validation(required = true)
        public String subtitleList;

        @NameInMap("OpeningList")
        @Validation(required = true)
        public String openingList;

        @NameInMap("TailSlateList")
        @Validation(required = true)
        public String tailSlateList;

        @NameInMap("TemplateName")
        @Validation(required = true)
        public String templateName;

        @NameInMap("TranscodeFileRegular")
        @Validation(required = true)
        public String transcodeFileRegular;

        @NameInMap("Clip")
        @Validation(required = true)
        public String clip;

        @NameInMap("Rotate")
        @Validation(required = true)
        public String rotate;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("UserData")
        @Validation(required = true)
        public String userData;

        @NameInMap("WatermarkIds")
        @Validation(required = true)
        public java.util.List<String> watermarkIds;

        public static GetTranscodeTemplateGroupResponseTranscodeTemplateGroupTranscodeTemplateList build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeTemplateGroupResponseTranscodeTemplateGroupTranscodeTemplateList self = new GetTranscodeTemplateGroupResponseTranscodeTemplateGroupTranscodeTemplateList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTranscodeTemplateGroupResponseTranscodeTemplateGroup extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public String isDefault;

        @NameInMap("Locked")
        @Validation(required = true)
        public String locked;

        @NameInMap("TranscodeMode")
        @Validation(required = true)
        public String transcodeMode;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("TranscodeTemplateGroupId")
        @Validation(required = true)
        public String transcodeTemplateGroupId;

        @NameInMap("TranscodeTemplateList")
        @Validation(required = true)
        public java.util.List<GetTranscodeTemplateGroupResponseTranscodeTemplateGroupTranscodeTemplateList> transcodeTemplateList;

        public static GetTranscodeTemplateGroupResponseTranscodeTemplateGroup build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeTemplateGroupResponseTranscodeTemplateGroup self = new GetTranscodeTemplateGroupResponseTranscodeTemplateGroup();
            return TeaModel.build(map, self);
        }

    }

}
