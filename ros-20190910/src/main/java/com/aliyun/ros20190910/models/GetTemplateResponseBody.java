// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    /**
     * <p>Supplementary information for the public template.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;DeploymentDuration&quot;:null,&quot;Title&quot;:&quot;Self-Built_ElasticSearch_Snapshot_Saved_To_OSS&quot;,&quot;Labels&quot;:{&quot;ResourceTypes&quot;:[&quot;ALIYUN::ECS::Instance&quot;,&quot;ALIYUN::ECS::SecurityGroup&quot;,&quot;ALIYUN::ECS::VPC&quot;,&quot;ALIYUN::ECS::VSwitch&quot;,&quot;ALIYUN::OSS::Bucket&quot;,&quot;ALIYUN::ROS::WaitCondition&quot;,&quot;ALIYUN::ROS::WaitConditionHandle&quot;],&quot;DeployTypes&quot;:[&quot;ROS&quot;],&quot;ApplicationScenes&quot;:[&quot;其他&quot;]},&quot;Provider&quot;:&quot;ROS&quot;,&quot;Categories&quot;:[&quot;Solution&quot;]}</p>
     */
    @NameInMap("AdditionalInfo")
    public java.util.Map<String, ?> additionalInfo;

    /**
     * <p>The ID of the change set. This parameter is returned only if you specify ChangeSetId.</p>
     * 
     * <strong>example:</strong>
     * <p>e85abe0c-6528-43fb-ae93-fdf8de22****</p>
     */
    @NameInMap("ChangeSetId")
    public String changeSetId;

    /**
     * <p>The time when the template was created. This parameter is returned only if you specify TemplateId.</p>
     * <blockquote>
     * <ul>
     * <li>If you specify TemplateVersion, the creation time of the template whose version is specified by TemplateVersion is returned.</li>
     * <li>If you do not specify TemplateVersion, the creation time of the template whose version is the default version is returned.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-11-18T08:49:26</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the template. This parameter is returned only if you specify TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>ROS template for create ECS instance.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The description of the web UI in the ROS console.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Interface")
    public String _interface;

    /**
     * <p>The ID of the Alibaba Cloud account to which the template belongs. This parameter is returned only if you specify TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>151266687691****</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>Details of the sharing status of the template. This parameter is returned only if you specify TemplateId and set IncludePermission to Enabled.</p>
     * <blockquote>
     * <ul>
     * <li>If TemplateVersion is not specified or does not take effect, the details of the sharing status of the template whose version is the default version is returned.</li>
     * <li>If TemplateVersion is specified and takes effect, the details of the sharing status of the template whose version is specified by TemplateVersion is returned.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("Permissions")
    public java.util.List<GetTemplateResponseBodyPermissions> permissions;

    /**
     * <p>The region ID of the stack or stack group that uses the template. This parameter is returned only if you specify StackId, ChangeSetId, or StackGroupName.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The sharing type of the template. This parameter is returned only if you specify TemplateId.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Private: The template belongs to the template owner.</li>
     * <li>Shared: The template is shared by other users.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Private</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    /**
     * <p>The name of the stack group. This parameter is returned only if you specify StackGroupName.</p>
     * 
     * <strong>example:</strong>
     * <p>MyStackGroup</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The ID of the stack. This parameter is returned only if you specify StackId.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The tags of the template.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetTemplateResponseBodyTags> tags;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the template. This parameter is returned only if you specify TemplateId.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ros:<em>:151266687691</em><em><strong>:template/a52f81be-496f-4e1c-a286-8852ab54</strong></em>*</p>
     */
    @NameInMap("TemplateARN")
    public String templateARN;

    /**
     * <p>The content of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The ID of the template. This parameter is returned only if you specify TemplateId.</p>
     * <p>If the template is a shared template, the value of this parameter is the same as the value of TemplateARN.</p>
     * 
     * <strong>example:</strong>
     * <p>a52f81be-496f-4e1c-a286-8852ab54****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The name of the template. This parameter is returned only if you specify TemplateId.</p>
     * <blockquote>
     * <ul>
     * <li>If you specify TemplateVersion, the name of the template whose version is specified by TemplateVersion is returned.</li>
     * <li>If you not specify TemplateVersion, the name of the template whose version is the default version is returned.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MyTemplate</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The version of the template. This parameter is returned only if you specify TemplateId.\
     * If TemplateVersion is not specified or does not take effect, the default version is used.</p>
     * <p>If the template is a shared template, this parameter is returned only if you set VersionOption to AllVersions.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    /**
     * <p>The time when the template was last updated. This parameter is returned only if you specify TemplateId.</p>
     * <blockquote>
     * <ul>
     * <li>If you specify TemplateVersion, the last update time of the template whose version is specified by TemplateVersion is returned.</li>
     * <li>If you do not specify TemplateVersion, the last update time of the template whose version is the default version is returned.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-12-07T06:11:48</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setAdditionalInfo(java.util.Map<String, ?> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
    public java.util.Map<String, ?> getAdditionalInfo() {
        return this.additionalInfo;
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
        /**
         * <p>The ID of the Alibaba Cloud account with which the template is shared.</p>
         * 
         * <strong>example:</strong>
         * <p>142437958638****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The sharing option.</p>
         * <p>The value ShareToAccounts indicates that the template is shared with one or more Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>ShareToAccounts</p>
         */
        @NameInMap("ShareOption")
        public String shareOption;

        /**
         * <p>The service that is used for resource sharing. Valid values:</p>
         * <ul>
         * <li>ROS: Resources are shared from ROS by using the ROS console or calling the ROS API.</li>
         * <li>ResourceDirectory: Resources are shared with accounts in a resource directory from Resource Management by using the resource sharing feature.<blockquote>
         * <ul>
         * <li>The number of accounts with which resources are shared from ROS is independent of the number of accounts with which resources are shared from the resource directory.</li>
         * <li>The shared resources from ROS cannot override or overwrite the shared resources from the resource directory.</li>
         * <li>The shared resources from the resource directory can overwrite the shared resources from ROS.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROS</p>
         */
        @NameInMap("ShareSource")
        public String shareSource;

        /**
         * <p>The version of the shared template. This parameter is returned only if you set ShareOption to ShareToAccounts and set VersionOption to Specified or Current.</p>
         * <p>Valid values: v1 to v100.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The version option for the shared template. This parameter is returned only if you set ShareOption to ShareToAccounts.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AllVersions: All template versions are shared.</li>
         * <li>Latest: Only the latest template version is shared. When the version of the template is updated, Resource Orchestration Service (ROS) updates the shared version to the latest version.</li>
         * <li>Current: Only the latest template version is shared. When the version of the template is updated, ROS does not update the shared version.</li>
         * <li>Specified: Only the specified template version is shared.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AllVersions</p>
         */
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
        /**
         * <p>The tag key of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
