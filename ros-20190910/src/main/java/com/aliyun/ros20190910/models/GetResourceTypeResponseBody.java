// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeResponseBody extends TeaModel {
    /**
     * <p>The type of the resource.</p>
     */
    @NameInMap("Attributes")
    public java.util.Map<String, ?> attributes;

    /**
     * <p>The creation time. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The default version ID.</p>
     * <br>
     * <p>> This parameter is returned only if the resource type is queried.</p>
     */
    @NameInMap("DefaultVersionId")
    public String defaultVersionId;

    /**
     * <p>The description of the resource type.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The entity type. Valid values:</p>
     * <br>
     * <p>*   Resource: regular resource. For more information, see [Resources](https://help.aliyun.com/document_detail/28863.html).</p>
     * <p>*   DataSource: DataSource resource. For more information, see [DataSource resources](https://help.aliyun.com/document_detail/404753.html).</p>
     * <p>*   module: module.</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>Indicates whether the version is the default version. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>> This parameter is returned only if a specific version of the resource type is queried.</p>
     */
    @NameInMap("IsDefaultVersion")
    public Boolean isDefaultVersion;

    /**
     * <p>The latest version ID.</p>
     * <br>
     * <p>> This parameter is returned only if the resource type is queried.</p>
     */
    @NameInMap("LatestVersionId")
    public String latestVersionId;

    /**
     * <p>Indicates whether the resource supports drift detection. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true: Drift detection is supported.</p>
     * <p>*   false: Drift detection is not supported.</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>The provider of the resource type. Valid values:</p>
     * <br>
     * <p>*   ROS: The resource type is provided by Resource Orchestration Service (ROS).</p>
     * <p>*   Self: The resource type is provided by you.</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The attributes of the resource.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The properties of the resource.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Indicates whether the resource supports scratch detection. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true: Scratch detection is supported.</p>
     * <p>*   false: Scratch detection is not supported.</p>
     */
    @NameInMap("SupportDriftDetection")
    public Boolean supportDriftDetection;

    /**
     * <p>The entity type. Valid values:</p>
     * <br>
     * <p>*   Resource: resources other than DataSource resources. For more information, see [Resources](https://help.aliyun.com/document_detail/28863.html).</p>
     * <p>*   DataSource: DataSource resources.</p>
     */
    @NameInMap("SupportScratchDetection")
    public Boolean supportScratchDetection;

    /**
     * <p>The template content in the module.</p>
     * <br>
     * <p>> This parameter is returned only if a specific version of the resource type is queried.</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The total number of versions.</p>
     * <br>
     * <p>> This parameter is returned only if the resource type is queried.</p>
     */
    @NameInMap("TotalVersionCount")
    public Integer totalVersionCount;

    /**
     * <p>The update time. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeResponseBody self = new GetResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeResponseBody setAttributes(java.util.Map<String, ?> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, ?> getAttributes() {
        return this.attributes;
    }

    public GetResourceTypeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetResourceTypeResponseBody setDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
        return this;
    }
    public String getDefaultVersionId() {
        return this.defaultVersionId;
    }

    public GetResourceTypeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetResourceTypeResponseBody setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetResourceTypeResponseBody setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
        return this;
    }
    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    public GetResourceTypeResponseBody setLatestVersionId(String latestVersionId) {
        this.latestVersionId = latestVersionId;
        return this;
    }
    public String getLatestVersionId() {
        return this.latestVersionId;
    }

    public GetResourceTypeResponseBody setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public GetResourceTypeResponseBody setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public GetResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceTypeResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetResourceTypeResponseBody setSupportDriftDetection(Boolean supportDriftDetection) {
        this.supportDriftDetection = supportDriftDetection;
        return this;
    }
    public Boolean getSupportDriftDetection() {
        return this.supportDriftDetection;
    }

    public GetResourceTypeResponseBody setSupportScratchDetection(Boolean supportScratchDetection) {
        this.supportScratchDetection = supportScratchDetection;
        return this;
    }
    public Boolean getSupportScratchDetection() {
        return this.supportScratchDetection;
    }

    public GetResourceTypeResponseBody setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GetResourceTypeResponseBody setTotalVersionCount(Integer totalVersionCount) {
        this.totalVersionCount = totalVersionCount;
        return this;
    }
    public Integer getTotalVersionCount() {
        return this.totalVersionCount;
    }

    public GetResourceTypeResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
