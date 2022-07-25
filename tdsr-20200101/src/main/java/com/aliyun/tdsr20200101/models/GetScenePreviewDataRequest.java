// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewDataRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("PreviewToken")
    public String previewToken;

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
