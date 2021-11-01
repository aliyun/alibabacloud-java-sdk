// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotSceneDataRequest extends TeaModel {
    // 自定义oss域名（可为cdn域名）
    @NameInMap("Domain")
    public String domain;

    // 是否开启自用资源访问
    @NameInMap("Enabled")
    public Boolean enabled;

    // 预览token
    @NameInMap("PreviewToken")
    public String previewToken;

    // 0 未发布， 1 已发布
    @NameInMap("Type")
    public Long type;

    public static GetHotspotSceneDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotSceneDataRequest self = new GetHotspotSceneDataRequest();
        return TeaModel.build(map, self);
    }

    public GetHotspotSceneDataRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetHotspotSceneDataRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetHotspotSceneDataRequest setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
        return this;
    }
    public String getPreviewToken() {
        return this.previewToken;
    }

    public GetHotspotSceneDataRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
