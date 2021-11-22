// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetTemplatePermissionRequest extends TeaModel {
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    @NameInMap("ShareOption")
    public String shareOption;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("VersionOption")
    public String versionOption;

    public static SetTemplatePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetTemplatePermissionRequest self = new SetTemplatePermissionRequest();
        return TeaModel.build(map, self);
    }

    public SetTemplatePermissionRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public SetTemplatePermissionRequest setShareOption(String shareOption) {
        this.shareOption = shareOption;
        return this;
    }
    public String getShareOption() {
        return this.shareOption;
    }

    public SetTemplatePermissionRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SetTemplatePermissionRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public SetTemplatePermissionRequest setVersionOption(String versionOption) {
        this.versionOption = versionOption;
        return this;
    }
    public String getVersionOption() {
        return this.versionOption;
    }

}
