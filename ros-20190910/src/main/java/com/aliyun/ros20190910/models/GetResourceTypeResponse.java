// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeResponse extends TeaModel {
    @NameInMap("Attributes")
    @Validation(required = true)
    public java.util.Map<String, ?> attributes;

    @NameInMap("Properties")
    @Validation(required = true)
    public java.util.Map<String, ?> properties;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("SupportDriftDetection")
    @Validation(required = true)
    public Boolean supportDriftDetection;

    public static GetResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeResponse self = new GetResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeResponse setAttributes(java.util.Map<String, ?> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, ?> getAttributes() {
        return this.attributes;
    }

    public GetResourceTypeResponse setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public GetResourceTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceTypeResponse setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetResourceTypeResponse setSupportDriftDetection(Boolean supportDriftDetection) {
        this.supportDriftDetection = supportDriftDetection;
        return this;
    }
    public Boolean getSupportDriftDetection() {
        return this.supportDriftDetection;
    }

}
