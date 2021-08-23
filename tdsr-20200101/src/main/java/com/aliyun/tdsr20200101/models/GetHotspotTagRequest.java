// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotTagRequest extends TeaModel {
    @NameInMap("PreviewToken")
    public String previewToken;

    @NameInMap("SubSceneUuid")
    public String subSceneUuid;

    @NameInMap("Type")
    public String type;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("Domain")
    public String domain;

    public static GetHotspotTagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotTagRequest self = new GetHotspotTagRequest();
        return TeaModel.build(map, self);
    }

    public GetHotspotTagRequest setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
        return this;
    }
    public String getPreviewToken() {
        return this.previewToken;
    }

    public GetHotspotTagRequest setSubSceneUuid(String subSceneUuid) {
        this.subSceneUuid = subSceneUuid;
        return this;
    }
    public String getSubSceneUuid() {
        return this.subSceneUuid;
    }

    public GetHotspotTagRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetHotspotTagRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetHotspotTagRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
