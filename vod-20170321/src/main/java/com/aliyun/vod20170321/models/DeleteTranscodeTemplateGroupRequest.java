// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteTranscodeTemplateGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcibly delete the entire transcoding template group. Valid values:</p>
     * <br>
     * <p>*   **true**: deletes the entire transcoding template group and its transcoding templates.</p>
     * <p>*   **false**: removes the specified transcoding templates from the transcoding template group. This is the default value.</p>
     */
    @NameInMap("ForceDelGroup")
    public String forceDelGroup;

    /**
     * <p>The ID of the transcoding template group.</p>
     */
    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    /**
     * <p>The IDs of the transcoding templates that you want to remove.</p>
     * <br>
     * <p>*   Separate multiple IDs with commas (,).</p>
     * <p>*   You can specify a maximum of 10 IDs.</p>
     */
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
