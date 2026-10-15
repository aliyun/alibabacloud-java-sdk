// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RewriteChannelTitleRequest extends TeaModel {
    /**
     * <p>The channel draft ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7c80359e-835d-4871-a971-8400d008828b</p>
     */
    @NameInMap("DraftId")
    public String draftId;

    /**
     * <p>The user personalization requirement in free text. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("UserRequirement")
    public String userRequirement;

    public static RewriteChannelTitleRequest build(java.util.Map<String, ?> map) throws Exception {
        RewriteChannelTitleRequest self = new RewriteChannelTitleRequest();
        return TeaModel.build(map, self);
    }

    public RewriteChannelTitleRequest setDraftId(String draftId) {
        this.draftId = draftId;
        return this;
    }
    public String getDraftId() {
        return this.draftId;
    }

    public RewriteChannelTitleRequest setUserRequirement(String userRequirement) {
        this.userRequirement = userRequirement;
        return this;
    }
    public String getUserRequirement() {
        return this.userRequirement;
    }

}
