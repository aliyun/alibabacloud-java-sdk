// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TranscodeTemplateGroupList")
    @Validation(required = true)
    public java.util.List<ListTranscodeTemplateGroupResponseTranscodeTemplateGroupList> transcodeTemplateGroupList;

    public static ListTranscodeTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTranscodeTemplateGroupResponse self = new ListTranscodeTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class ListTranscodeTemplateGroupResponseTranscodeTemplateGroupList extends TeaModel {
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

        @NameInMap("TranscodeTemplateGroupId")
        @Validation(required = true)
        public String transcodeTemplateGroupId;

        @NameInMap("TranscodeMode")
        @Validation(required = true)
        public String transcodeMode;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        public static ListTranscodeTemplateGroupResponseTranscodeTemplateGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeTemplateGroupResponseTranscodeTemplateGroupList self = new ListTranscodeTemplateGroupResponseTranscodeTemplateGroupList();
            return TeaModel.build(map, self);
        }

    }

}
