// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    @NameInMap("TemplateARN")
    public String templateARN;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("StackGroupName")
    public String stackGroupName;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("ChangeSetId")
    public String changeSetId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("Permissions")
    public java.util.List<GetTemplateResponseBodyPermissions> permissions;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("ShareType")
    public String shareType;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setTemplateARN(String templateARN) {
        this.templateARN = templateARN;
        return this;
    }
    public String getTemplateARN() {
        return this.templateARN;
    }

    public GetTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTemplateResponseBody setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public GetTemplateResponseBody setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public GetTemplateResponseBody setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GetTemplateResponseBody setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public GetTemplateResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetTemplateResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetTemplateResponseBody setPermissions(java.util.List<GetTemplateResponseBodyPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<GetTemplateResponseBodyPermissions> getPermissions() {
        return this.permissions;
    }

    public GetTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetTemplateResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public GetTemplateResponseBody setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public static class GetTemplateResponseBodyPermissions extends TeaModel {
        @NameInMap("VersionOption")
        public String versionOption;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("ShareOption")
        public String shareOption;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        public static GetTemplateResponseBodyPermissions build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyPermissions self = new GetTemplateResponseBodyPermissions();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyPermissions setVersionOption(String versionOption) {
            this.versionOption = versionOption;
            return this;
        }
        public String getVersionOption() {
            return this.versionOption;
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

        public GetTemplateResponseBodyPermissions setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

    }

}
