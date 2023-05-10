// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeResponseBody extends TeaModel {
    /**
     * <p>The properties of the resource.</p>
     */
    @NameInMap("Attributes")
    public java.util.Map<String, ?> attributes;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DefaultVersionId")
    public String defaultVersionId;

    @NameInMap("Description")
    public String description;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("IsDefaultVersion")
    public Boolean isDefaultVersion;

    @NameInMap("LatestVersionId")
    public String latestVersionId;

    /**
     * <p>Indicates whether the resource supports scratch detection. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true: Scratch detection is supported.</p>
     * <p>*   false: Scratch detection is not supported.</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The type of the resource.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the resource supports drift detection. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true: Drift detection is supported.</p>
     * <p>*   false: Drift detection is not supported.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The entity type. Valid values:</p>
     * <br>
     * <p>*   Resource: resources other than DataSource resources. For more information, see [Resources](~~28863~~).</p>
     * <p>*   DataSource: DataSource resources.</p>
     */
    @NameInMap("SupportDriftDetection")
    public Boolean supportDriftDetection;

    @NameInMap("SupportScratchDetection")
    public Boolean supportScratchDetection;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TotalVersionCount")
    public Integer totalVersionCount;

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
