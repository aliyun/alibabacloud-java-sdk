// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    @NameInMap("ChangeSetId")
    public String changeSetId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("Interface")
    public String _interface;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("Permissions")
    public java.util.List<GetTemplateResponseBodyPermissions> permissions;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ShareType")
    public String shareType;

    @NameInMap("StackGroupName")
    public String stackGroupName;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("Tags")
    public java.util.List<GetTemplateResponseBodyTags> tags;

    @NameInMap("TemplateARN")
    public String templateARN;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public GetTemplateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetTemplateResponseBody set_interface(String _interface) {
        this._interface = _interface;
        return this;
    }
    public String get_interface() {
        return this._interface;
    }

    public GetTemplateResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetTemplateResponseBody setPermissions(java.util.List<GetTemplateResponseBodyPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<GetTemplateResponseBodyPermissions> getPermissions() {
        return this.permissions;
    }

    public GetTemplateResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetTemplateResponseBody setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public GetTemplateResponseBody setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public GetTemplateResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetTemplateResponseBody setTags(java.util.List<GetTemplateResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetTemplateResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetTemplateResponseBody setTemplateARN(String templateARN) {
        this.templateARN = templateARN;
        return this;
    }
    public String getTemplateARN() {
        return this.templateARN;
    }

    public GetTemplateResponseBody setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GetTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetTemplateResponseBody setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public GetTemplateResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetTemplateResponseBodyPermissions extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("ShareOption")
        public String shareOption;

        @NameInMap("ShareSource")
        public String shareSource;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("VersionOption")
        public String versionOption;

        public static GetTemplateResponseBodyPermissions build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyPermissions self = new GetTemplateResponseBodyPermissions();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyPermissions setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetTemplateResponseBodyPermissions setShareOption(String shareOption) {
            this.shareOption = shareOption;
            return this;
        }
        public String getShareOption() {
            return this.shareOption;
        }

        public GetTemplateResponseBodyPermissions setShareSource(String shareSource) {
            this.shareSource = shareSource;
            return this;
        }
        public String getShareSource() {
            return this.shareSource;
        }

        public GetTemplateResponseBodyPermissions setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public GetTemplateResponseBodyPermissions setVersionOption(String versionOption) {
            this.versionOption = versionOption;
            return this;
        }
        public String getVersionOption() {
            return this.versionOption;
        }

    }

    public static class GetTemplateResponseBodyTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetTemplateResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyTags self = new GetTemplateResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTemplateResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
