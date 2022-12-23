// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteTranscodeTemplateGroupRequest extends TeaModel {
    // Specifies whether to forcibly delete the entire transcoding template group. Valid values:
    // 
    // *   **true**: deletes the entire transcoding template group and its transcoding templates.
    // *   **false**: removes the specified transcoding templates from the transcoding template group. This is the default value.
    @NameInMap("ForceDelGroup")
    public String forceDelGroup;

    // The ID of the transcoding template group.
    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    // The IDs of the transcoding templates that you want to remove.
    // 
    // *   Separate multiple IDs with commas (,).
    // *   You can specify a maximum of 10 IDs.
    @NameInMap("TranscodeTemplateIds")
    public String transcodeTemplateIds;

    public static DeleteTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTranscodeTemplateGroupRequest self = new DeleteTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTranscodeTemplateGroupRequest setForceDelGroup(String forceDelGroup) {
        this.forceDelGroup = forceDelGroup;
        return this;
    }
    public String getForceDelGroup() {
        return this.forceDelGroup;
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

}
