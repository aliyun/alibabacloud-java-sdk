// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotConfigRequest extends TeaModel {
    @NameInMap("PreviewToken")
    public String previewToken;

    @NameInMap("Type")
    public Long type;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("Domain")
    public String domain;

    public static GetHotspotConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotConfigRequest self = new GetHotspotConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetHotspotConfigRequest setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
        return this;
    }
    public String getPreviewToken() {
        return this.previewToken;
    }

    public GetHotspotConfigRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public GetHotspotConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetHotspotConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
