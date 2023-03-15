// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeResponseBody extends TeaModel {
    /**
     * <p>The attributes of the resource.</p>
     */
    @NameInMap("Attributes")
    public java.util.Map<String, ?> attributes;

    /**
     * <p>The entity type. Valid values:</p>
     * <br>
     * <p>*   Resource: resources other than DataSource resources. For more information, see [Resources](~~28863~~).</p>
     * <p>*   DataSource: DataSource resources.</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The properties of the resource.</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the resource.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Indicates whether the resource supports drift detection. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true: Drift detection is supported.</p>
     * <p>*   false: Drift detection is not supported.</p>
     */
    @NameInMap("SupportDriftDetection")
    public Boolean supportDriftDetection;

    /**
     * <p>Indicates whether the resource supports scratch detection. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true: Scratch detection is supported.</p>
     * <p>*   false: Scratch detection is not supported.</p>
     */
    @NameInMap("SupportScratchDetection")
    public Boolean supportScratchDetection;

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

    public GetResourceTypeResponseBody setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetResourceTypeResponseBody setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
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

}
