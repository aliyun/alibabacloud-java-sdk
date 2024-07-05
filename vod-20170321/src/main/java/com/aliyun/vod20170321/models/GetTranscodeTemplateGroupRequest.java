// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTemplateGroupRequest extends TeaModel {
    /**
     * <p>The ID of the transcoding template group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a591f697c7167*****6ae1502142d0</p>
     */
    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    public static GetTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTemplateGroupRequest self = new GetTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetTranscodeTemplateGroupRequest setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
        this.transcodeTemplateGroupId = transcodeTemplateGroupId;
        return this;
    }
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

}
