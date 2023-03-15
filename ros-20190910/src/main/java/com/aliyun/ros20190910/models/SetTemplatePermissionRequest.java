// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetTemplatePermissionRequest extends TeaModel {
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>The sharing option.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   ShareToAccounts: shares the template with other Alibaba Cloud accounts.</p>
     * <p>*   CancelSharing: unshares the template.</p>
     */
    @NameInMap("ShareOption")
    public String shareOption;

    /**
     * <p>The ID of the template.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The version of the template that you want to share. This parameter takes effect when the ShareOption parameter is set to ShareToAccounts and the VersionOption parameter is set to Specified.</p>
     * <br>
     * <p>Valid values: v1 to v100.</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    /**
     * <p>The version option for template sharing. This parameter takes effect when the ShareOption parameter is set to ShareToAccounts.</p>
     * <br>
     * <p>Default value: AllVersions. Valid values:</p>
     * <br>
     * <p>*   AllVersions: shares all versions of the template.</p>
     * <p>*   Latest: shares only the latest version of the template. If the shared template is updated, the latest version of the template is shared with the destination account.</p>
     * <p>*   Current: shares only the current version of the template. The current version of the template is shared with the destination account even if the template is updated.</p>
     * <p>*   Specified: shares only one specific version of the template.</p>
     */
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
