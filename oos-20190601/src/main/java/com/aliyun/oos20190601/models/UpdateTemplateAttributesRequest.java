// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateTemplateAttributesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;1319994761488600&quot;]</p>
     */
    @NameInMap("AccountIds")
    public String accountIds;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsFavorite")
    public Boolean isFavorite;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>Share</p>
     */
    @NameInMap("SharePermissionAction")
    public String sharePermissionAction;

    /**
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("ShareTemplateVersion")
    public String shareTemplateVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyTemplate</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static UpdateTemplateAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateAttributesRequest self = new UpdateTemplateAttributesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateAttributesRequest setAccountIds(String accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public String getAccountIds() {
        return this.accountIds;
    }

    public UpdateTemplateAttributesRequest setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }
    public Boolean getIsFavorite() {
        return this.isFavorite;
    }

    public UpdateTemplateAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTemplateAttributesRequest setSharePermissionAction(String sharePermissionAction) {
        this.sharePermissionAction = sharePermissionAction;
        return this;
    }
    public String getSharePermissionAction() {
        return this.sharePermissionAction;
    }

    public UpdateTemplateAttributesRequest setShareTemplateVersion(String shareTemplateVersion) {
        this.shareTemplateVersion = shareTemplateVersion;
        return this;
    }
    public String getShareTemplateVersion() {
        return this.shareTemplateVersion;
    }

    public UpdateTemplateAttributesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
