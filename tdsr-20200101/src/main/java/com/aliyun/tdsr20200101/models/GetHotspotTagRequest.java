// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotTagRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
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
     * <strong>example:</strong>
     * <p>344794c32937474a9c59eb130936****</p>
     */
    @NameInMap("PreviewToken")
    public String previewToken;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("SubSceneUuid")
    public String subSceneUuid;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetHotspotTagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotTagRequest self = new GetHotspotTagRequest();
        return TeaModel.build(map, self);
    }

    public GetHotspotTagRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetHotspotTagRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
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

}
