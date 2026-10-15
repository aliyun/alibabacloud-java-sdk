// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class TranslateChannelDraftRequest extends TeaModel {
    /**
     * <p>The ID of the channel draft.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>draft-789</p>
     */
    @NameInMap("DraftId")
    public String draftId;

    public static TranslateChannelDraftRequest build(java.util.Map<String, ?> map) throws Exception {
        TranslateChannelDraftRequest self = new TranslateChannelDraftRequest();
        return TeaModel.build(map, self);
    }

    public TranslateChannelDraftRequest setDraftId(String draftId) {
        this.draftId = draftId;
        return this;
    }
    public String getDraftId() {
        return this.draftId;
    }

}
