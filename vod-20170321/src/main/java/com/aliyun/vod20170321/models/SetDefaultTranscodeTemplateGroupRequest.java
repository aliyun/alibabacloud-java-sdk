// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultTranscodeTemplateGroupRequest extends TeaModel {
    /**
     * <p>The ID of the transcoding template group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d58079958be8d*****b699ab7ab6e1bf</p>
     */
    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    public static SetDefaultTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultTranscodeTemplateGroupRequest self = new SetDefaultTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public SetDefaultTranscodeTemplateGroupRequest setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
        this.transcodeTemplateGroupId = transcodeTemplateGroupId;
        return this;
    }
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

}
