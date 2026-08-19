// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteTranscodeTemplateGroupRequest extends TeaModel {
    /**
     * <p>Indicates whether to force delete the entire transcoding template group. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Force deletes the entire template group and all its transcoding templates.</li>
     * <li><strong>false</strong> (default): Deletes only the specified transcoding templates.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForceDelGroup")
    public String forceDelGroup;

    /**
     * <p>The ID of the transcoding template group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4c71a339fec*****152b4fa6f4527</p>
     */
    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    /**
     * <p>The IDs of the transcoding templates that you want to delete.</p>
     * <ul>
     * <li>Separate multiple IDs with commas (,).</li>
     * <li>A maximum of 10 template IDs are supported.</li>
     * <li>This parameter is required if the ForceDelGroup parameter is empty or set to false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;613702defdc4<em><strong><strong>6a3b94cace1129e&quot;,&quot;bfd6c90253a2</strong></strong></em>7fc054d7c5825&quot;]</p>
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
