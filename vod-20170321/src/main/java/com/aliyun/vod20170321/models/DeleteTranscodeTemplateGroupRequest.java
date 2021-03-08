// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteTranscodeTemplateGroupRequest extends TeaModel {
    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    @NameInMap("TranscodeTemplateIds")
    public String transcodeTemplateIds;

    @NameInMap("ForceDelGroup")
    public String forceDelGroup;

    public static DeleteTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTranscodeTemplateGroupRequest self = new DeleteTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTranscodeTemplateGroupRequest setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
        this.transcodeTemplateGroupId = transcodeTemplateGroupId;
        return this;
    }
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

    public DeleteTranscodeTemplateGroupRequest setTranscodeTemplateIds(String transcodeTemplateIds) {
        this.transcodeTemplateIds = transcodeTemplateIds;
        return this;
    }
    public String getTranscodeTemplateIds() {
        return this.transcodeTemplateIds;
    }

    public DeleteTranscodeTemplateGroupRequest setForceDelGroup(String forceDelGroup) {
        this.forceDelGroup = forceDelGroup;
        return this;
    }
    public String getForceDelGroup() {
        return this.forceDelGroup;
    }

}
