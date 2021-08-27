// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeResponseBody extends TeaModel {
    @NameInMap("SupportDriftDetection")
    public Boolean supportDriftDetection;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    @NameInMap("Attributes")
    public java.util.Map<String, ?> attributes;

    public static GetResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeResponseBody self = new GetResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeResponseBody setSupportDriftDetection(Boolean supportDriftDetection) {
        this.supportDriftDetection = supportDriftDetection;
        return this;
    }
    public Boolean getSupportDriftDetection() {
        return this.supportDriftDetection;
    }

    public GetResourceTypeResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceTypeResponseBody setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public GetResourceTypeResponseBody setAttributes(java.util.Map<String, ?> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, ?> getAttributes() {
        return this.attributes;
    }

}
