// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>true/false</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2735913e96da44ea8c86f8e777c8****</p>
     */
    @NameInMap("PreviewToken")
    public String previewToken;

    /**
     * <strong>example:</strong>
     * <p>true/false</p>
     */
    @NameInMap("ShowTag")
    public Boolean showTag;

    public static GetScenePreviewDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScenePreviewDataRequest self = new GetScenePreviewDataRequest();
        return TeaModel.build(map, self);
    }

    public GetScenePreviewDataRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetScenePreviewDataRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetScenePreviewDataRequest setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
        return this;
    }
    public String getPreviewToken() {
        return this.previewToken;
    }

    public GetScenePreviewDataRequest setShowTag(Boolean showTag) {
        this.showTag = showTag;
        return this;
    }
    public Boolean getShowTag() {
        return this.showTag;
    }

}
