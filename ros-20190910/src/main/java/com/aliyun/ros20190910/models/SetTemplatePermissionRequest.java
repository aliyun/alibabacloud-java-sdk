// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetTemplatePermissionRequest extends TeaModel {
    @NameInMap("ShareOption")
    public String shareOption;

    @NameInMap("VersionOption")
    public String versionOption;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    public static SetTemplatePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetTemplatePermissionRequest self = new SetTemplatePermissionRequest();
        return TeaModel.build(map, self);
    }

    public SetTemplatePermissionRequest setShareOption(String shareOption) {
        this.shareOption = shareOption;
        return this;
    }
    public String getShareOption() {
        return this.shareOption;
    }

    public SetTemplatePermissionRequest setVersionOption(String versionOption) {
        this.versionOption = versionOption;
        return this;
    }
    public String getVersionOption() {
        return this.versionOption;
    }

    public SetTemplatePermissionRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public SetTemplatePermissionRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SetTemplatePermissionRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

}
