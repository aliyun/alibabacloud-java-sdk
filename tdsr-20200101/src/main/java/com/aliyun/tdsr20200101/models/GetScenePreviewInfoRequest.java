// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewInfoRequest extends TeaModel {
    // 模型token
    @NameInMap("ModelToken")
    public String modelToken;

    // 自定义oss域名（可为cdn域名）
    @NameInMap("Domain")
    public String domain;

    // 是否开启自用资源访问
    @NameInMap("Enabled")
    public Boolean enabled;

    public static GetScenePreviewInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScenePreviewInfoRequest self = new GetScenePreviewInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetScenePreviewInfoRequest setModelToken(String modelToken) {
        this.modelToken = modelToken;
        return this;
    }
    public String getModelToken() {
        return this.modelToken;
    }

    public GetScenePreviewInfoRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetScenePreviewInfoRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
