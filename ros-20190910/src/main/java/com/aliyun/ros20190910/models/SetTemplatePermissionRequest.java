// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetTemplatePermissionRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud accounts with or from which you want to share or unshare the template.\
     * Valid values of N: 1, 2, 3, 4, and 5.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter cannot be set to the ID of the Alibaba Cloud account that owns the template, or the RAM users of this Alibaba Cloud account.</li>
     * <li>When ShareOption is set to CancelSharing, you can unshare the template from all the specified Alibaba Cloud accounts by using an asterisk (\*).</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>The sharing option.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ShareToAccounts: shares the template with other Alibaba Cloud accounts.</li>
     * <li>CancelSharing: unshares the template.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ShareToAccounts</p>
     */
    @NameInMap("ShareOption")
    public String shareOption;

    /**
     * <p>The ID of the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The version of the shared template. This parameter takes effect only if you set ShareOption to ShareToAccounts and set VersionOption to Specified.</p>
     * <p>Valid values: v1 to v100.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    /**
     * <p>The version option for the shared template. This parameter takes effect only if you set ShareOption to ShareToAccounts.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>AllVersions (default): shares all versions of the template.</li>
     * <li>Latest: shares only the latest version of template. When the version of the template is updated, ROS updates the shared version to the latest version.</li>
     * <li>Current: shares only the current version of the template. When the version of the template is updated, ROS does not update the shared version.</li>
     * <li>Specified: shares only the specified version of the template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Specified</p>
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
