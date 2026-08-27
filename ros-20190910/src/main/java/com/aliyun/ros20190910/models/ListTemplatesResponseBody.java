// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    /**
     * <p>The page number of the template list.<br> The value starts from 1.<br></p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C3A8413B-1F16-4DED-AC3E-61A00718DE8A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of templates.</p>
     */
    @NameInMap("Templates")
    public java.util.List<ListTemplatesResponseBodyTemplates> templates;

    /**
     * <p>The total number of templates.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResponseBody self = new ListTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplatesResponseBody setTemplates(java.util.List<ListTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ListTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public ListTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTemplatesResponseBodyTemplatesTags extends TeaModel {
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

        public static ListTemplatesResponseBodyTemplatesTags build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyTemplatesTags self = new ListTemplatesResponseBodyTemplatesTags();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyTemplatesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTemplatesResponseBodyTemplatesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTemplatesResponseBodyTemplates extends TeaModel {
        /**
         * <p>The supplementary information about the public template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;DeploymentDuration&quot;:null,&quot;Title&quot;:&quot;Self-Built_ElasticSearch_Snapshot_Saved_To_OSS&quot;,&quot;Labels&quot;:{&quot;ResourceTypes&quot;:[&quot;ALIYUN::ECS::Instance&quot;,&quot;ALIYUN::ECS::SecurityGroup&quot;,&quot;ALIYUN::ECS::VPC&quot;,&quot;ALIYUN::ECS::VSwitch&quot;,&quot;ALIYUN::OSS::Bucket&quot;,&quot;ALIYUN::ROS::WaitCondition&quot;,&quot;ALIYUN::ROS::WaitConditionHandle&quot;],&quot;DeployTypes&quot;:[&quot;ROS&quot;],&quot;ApplicationScenes&quot;:[&quot;other&quot;]},&quot;Provider&quot;:&quot;ROS&quot;,&quot;Categories&quot;:[&quot;Solution&quot;]}</p>
         */
        @NameInMap("AdditionalInfo")
        public java.util.Map<String, ?> additionalInfo;

        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-15T08:17:14.000000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>test-description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the Alibaba Cloud account to which the template belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>151266687691****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The share type of the template.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Private: The template is owned by the user.</p>
         * </li>
         * <li><p>Shared: The template is shared by other users.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The tags of the template.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTemplatesResponseBodyTemplatesTags> tags;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ros:<em>:151266687691</em><em><strong>:template/a52f81be-496f-4e1c-a286-8852ab54</strong></em>*</p>
         */
        @NameInMap("TemplateARN")
        public String templateARN;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>4d4f5aa2-3260-4e47-863b-763fbb12****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The URL of the template.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ros-public-templates.oss-cn-hangzhou.aliyuncs.com/demo.yml">https://ros-public-templates.oss-cn-hangzhou.aliyuncs.com/demo.yml</a></p>
         */
        @NameInMap("TemplateUrl")
        public String templateUrl;

        /**
         * <p>The name of the latest version of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The time when the template was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-15T08:17:14.000000</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyTemplates self = new ListTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyTemplates setAdditionalInfo(java.util.Map<String, ?> additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }
        public java.util.Map<String, ?> getAdditionalInfo() {
            return this.additionalInfo;
        }

        public ListTemplatesResponseBodyTemplates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTemplatesResponseBodyTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTemplatesResponseBodyTemplates setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListTemplatesResponseBodyTemplates setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListTemplatesResponseBodyTemplates setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public ListTemplatesResponseBodyTemplates setTags(java.util.List<ListTemplatesResponseBodyTemplatesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTemplatesResponseBodyTemplatesTags> getTags() {
            return this.tags;
        }

        public ListTemplatesResponseBodyTemplates setTemplateARN(String templateARN) {
            this.templateARN = templateARN;
            return this;
        }
        public String getTemplateARN() {
            return this.templateARN;
        }

        public ListTemplatesResponseBodyTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListTemplatesResponseBodyTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListTemplatesResponseBodyTemplates setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }
        public String getTemplateUrl() {
            return this.templateUrl;
        }

        public ListTemplatesResponseBodyTemplates setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListTemplatesResponseBodyTemplates setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
