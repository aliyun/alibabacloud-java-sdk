// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TemplateBody")
    @Validation(required = true)
    public String templateBody;

    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    @NameInMap("StackGroupName")
    @Validation(required = true)
    public String stackGroupName;

    @NameInMap("ChangeSetId")
    @Validation(required = true)
    public String changeSetId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("TemplateName")
    @Validation(required = true)
    public String templateName;

    @NameInMap("UpdateTime")
    @Validation(required = true)
    public String updateTime;

    @NameInMap("TemplateVersion")
    @Validation(required = true)
    public String templateVersion;

    @NameInMap("ShareType")
    @Validation(required = true)
    public String shareType;

    @NameInMap("OwnerId")
    @Validation(required = true)
    public String ownerId;

    @NameInMap("TemplateARN")
    @Validation(required = true)
    public String templateARN;

    @NameInMap("Permissions")
    @Validation(required = true)
    public java.util.List<GetTemplateResponsePermissions> permissions;

    public static GetTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponse self = new GetTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponse setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GetTemplateResponse setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetTemplateResponse setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateResponse setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public GetTemplateResponse setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public GetTemplateResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTemplateResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetTemplateResponse setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetTemplateResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetTemplateResponse setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public GetTemplateResponse setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public GetTemplateResponse setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetTemplateResponse setTemplateARN(String templateARN) {
        this.templateARN = templateARN;
        return this;
    }
    public String getTemplateARN() {
        return this.templateARN;
    }

    public GetTemplateResponse setPermissions(java.util.List<GetTemplateResponsePermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<GetTemplateResponsePermissions> getPermissions() {
        return this.permissions;
    }

    public static class GetTemplateResponsePermissions extends TeaModel {
        @NameInMap("ShareOption")
        @Validation(required = true)
        public String shareOption;

        @NameInMap("VersionOption")
        @Validation(required = true)
        public String versionOption;

        @NameInMap("TemplateVersion")
        @Validation(required = true)
        public String templateVersion;

        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        public static GetTemplateResponsePermissions build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponsePermissions self = new GetTemplateResponsePermissions();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponsePermissions setShareOption(String shareOption) {
            this.shareOption = shareOption;
            return this;
        }
        public String getShareOption() {
            return this.shareOption;
        }

        public GetTemplateResponsePermissions setVersionOption(String versionOption) {
            this.versionOption = versionOption;
            return this;
        }
        public String getVersionOption() {
            return this.versionOption;
        }

        public GetTemplateResponsePermissions setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public GetTemplateResponsePermissions setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
