// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    /**
     * <p>The content of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;FormatVersion: OOS-2019-06-01\nDescription:\n  en:  Creates an ECS image\n  zh-cn: 创建一个ECS镜像\n  name-en: Create Image\n  name-zh-cn: 创建镜像\n  categories:\n    - image_manage\n    - application_manage\nParameters:\n  regionId:\n    Type: String\n    Label:\n      en: RegionId\n      zh-cn: 地域ID\n    AssociationProperty: RegionId\n    Default: \&quot;{{ ACS::RegionId }}\&quot;\n  instanceId:\n    Label:\n      en: InstanceId\n      zh-cn: ECS实例ID\n    Type: String\n    AssociationProperty: ALIYUN::ECS::Instance::InstanceId\n    AssociationPropertyMetadata:\n      RegionId: regionId\n  imageName:\n    Label:\n      en: ImageName\n      zh-cn: 新镜像的名称\n    Type: String\n    Description:\n      en: &lt;p class=\&quot;p\&quot;&gt;Note:</p> &lt;ul class=\&quot;ul\&quot;&gt; &lt;li class=\&quot;li\&quot;&gt;Length is 2<del>128 English or Chinese characters</li> &lt;li class=\&quot;li\&quot;&gt;&lt;font color=\&quot;red\&quot;&gt;must start with big or small letters or Chinese, not http:// and https://. </font></li> &lt;li class=\&quot;li\&quot;&gt;Can contain numbers, colons (:), underscores (_), or dashes (-). </li> </ul>\n      zh-cn: &lt;p class=\&quot;p\&quot;&gt;注意：</p> &lt;ul class=\&quot;ul\&quot;&gt; &lt;li class=\&quot;li\&quot;&gt;长度为2</del>128个英文或中文字符</li> &lt;li class=\&quot;li\&quot;&gt;&lt;font color=\&quot;red\&quot;&gt;必须以大小字母或中文开头，不能以http://和https://开头。</font></li> &lt;li class=\&quot;li\&quot;&gt;可以包含数字、半角冒号（:）、下划线（_）或者短划线（-）。</li> </ul>\n  tags:\n    Label:\n      en: Tags\n      zh-cn: 镜像标签\n    Type: Json\n    AssociationProperty: Tags\n    AssociationPropertyMetadata:\n      ShowSystem: false\n    Default: []\n  OOSAssumeRole:\n    Label:\n      en: OOSAssumeRole\n      zh-cn: OOS扮演的RAM角色\n    Type: String\n    Default: OOSServiceRole\nRamRole: \&quot;{{ OOSAssumeRole }}\&quot;\nTasks:\n- Name: createImage\n  Action: ACS::ECS::CreateImage\n  Description:\n    en: Create new image with the specified image name and instance ID\n    zh-cn: 通过指定实例ID和镜像名称创建新的镜像\n  Properties:\n    regionId: \&quot;{{ regionId }}\&quot;\n    imageName: \&quot;{{ imageName }}_<em>on</em>{{ ACS::ExecutionId }}<em>at</em>{{ Acs::CurrentDate }}\&quot;\n    instanceId: \&quot;{{ instanceId }}\&quot;\n    tags: \&quot;{{tags}}\&quot;\n  Outputs:\n    imageId:\n      ValueSelector: imageId\n      Type: String\nOutputs:\n  imageId:\n    Type: String\n    Value: \&quot;{{ createImage.imageId }}\&quot;\nMetadata:\n  ALIYUN::OOS::Interface:\n    ParameterGroups:\n      - Parameters:\n          - regionId\n          - instanceId\n        Label:\n          default:\n            zh-cn: 选择实例\n            en: Select Ecs Instances\n      - Parameters:\n          - imageName\n          - tags\n        Label:\n          default:\n            zh-cn: 镜像设置\n            en: Image Configure\n      - Parameters:\n          - OOSAssumeRole\n        Label:\n          default:\n            zh-cn: 高级选项\n            en: Control Options&quot;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5BBE2663-A18E-5261-9BBB-F4832F5294D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metadata of the template.</p>
     */
    @NameInMap("Template")
    public GetTemplateResponseBodyTemplate template;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setTemplate(GetTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public GetTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class GetTemplateResponseBodyTemplate extends TeaModel {
        /**
         * <p>The creator of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;en\&quot;: \&quot;Creates an ECS image\&quot;, \&quot;zh-cn\&quot;: \&quot;创建一个ECS镜像\&quot;, \&quot;name-en\&quot;: \&quot;Create Image\&quot;, \&quot;name-zh-cn\&quot;: \&quot;创建镜像\&quot;, \&quot;categories\&quot;: [\&quot;image_manage\&quot;, \&quot;application_manage\&quot;]}&quot;</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the template was configured with a trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasTrigger")
        public Boolean hasTrigger;

        /**
         * <p>The SHA-256 value of the template content.</p>
         * 
         * <strong>example:</strong>
         * <p>40fb5e3e08ef6c8a499ff7cd8441194f518028ad08338a84cb70c023a64576f1</p>
         */
        @NameInMap("Hash")
        public String hash;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The share type of the template. The share type of a user-created template is <strong>Private</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;k2&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The format of the template. The system automatically determines whether the format is JSON or YAML.</p>
         * 
         * <strong>example:</strong>
         * <p>YAML</p>
         */
        @NameInMap("TemplateFormat")
        public String templateFormat;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>t-4bdb1745c171401883a2</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-ECS-CreateImage</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The type of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Automation</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The version of the template. The name of the version consists of the letter v and a number. The number starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>v15</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The user who last updated the template.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the template was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-26T08:37:07Z</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        /**
         * <p>The name of the version of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>version15</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        public static GetTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyTemplate self = new GetTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyTemplate setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetTemplateResponseBodyTemplate setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetTemplateResponseBodyTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTemplateResponseBodyTemplate setHasTrigger(Boolean hasTrigger) {
            this.hasTrigger = hasTrigger;
            return this;
        }
        public Boolean getHasTrigger() {
            return this.hasTrigger;
        }

        public GetTemplateResponseBodyTemplate setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public GetTemplateResponseBodyTemplate setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetTemplateResponseBodyTemplate setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public GetTemplateResponseBodyTemplate setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetTemplateResponseBodyTemplate setTemplateFormat(String templateFormat) {
            this.templateFormat = templateFormat;
            return this;
        }
        public String getTemplateFormat() {
            return this.templateFormat;
        }

        public GetTemplateResponseBodyTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetTemplateResponseBodyTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetTemplateResponseBodyTemplate setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public GetTemplateResponseBodyTemplate setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public GetTemplateResponseBodyTemplate setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public GetTemplateResponseBodyTemplate setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public GetTemplateResponseBodyTemplate setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

}
