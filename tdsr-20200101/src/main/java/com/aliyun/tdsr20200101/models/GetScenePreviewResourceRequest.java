// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewResourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Draft")
    public Boolean draft;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2deb941b3e1****</p>
     */
    @NameInMap("PreviewToken")
    public String previewToken;

    public static GetScenePreviewResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScenePreviewResourceRequest self = new GetScenePreviewResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetScenePreviewResourceRequest setDraft(Boolean draft) {
        this.draft = draft;
        return this;
    }
    public Boolean getDraft() {
        return this.draft;
    }

    public GetScenePreviewResourceRequest setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
        return this;
    }
    public String getPreviewToken() {
        return this.previewToken;
    }

}
