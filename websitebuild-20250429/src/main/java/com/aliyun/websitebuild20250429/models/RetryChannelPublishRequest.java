// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RetryChannelPublishRequest extends TeaModel {
    /**
     * <p>The channel draft ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>draft-789</p>
     */
    @NameInMap("DraftId")
    public String draftId;

    public static RetryChannelPublishRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryChannelPublishRequest self = new RetryChannelPublishRequest();
        return TeaModel.build(map, self);
    }

    public RetryChannelPublishRequest setDraftId(String draftId) {
        this.draftId = draftId;
        return this;
    }
    public String getDraftId() {
        return this.draftId;
    }

}
