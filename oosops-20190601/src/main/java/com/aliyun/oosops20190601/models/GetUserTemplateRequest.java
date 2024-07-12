// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetUserTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static GetUserTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserTemplateRequest self = new GetUserTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetUserTemplateRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetUserTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetUserTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetUserTemplateRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
