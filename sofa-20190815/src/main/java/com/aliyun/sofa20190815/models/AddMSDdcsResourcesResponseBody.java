// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSDdcsResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resource")
    public AddMSDdcsResourcesResponseBodyResource resource;

    public static AddMSDdcsResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMSDdcsResourcesResponseBody self = new AddMSDdcsResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMSDdcsResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMSDdcsResourcesResponseBody setResource(AddMSDdcsResourcesResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public AddMSDdcsResourcesResponseBodyResource getResource() {
        return this.resource;
    }

    public static class AddMSDdcsResourcesResponseBodyResourceAttributes extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Desc")
        public String desc;

        public static AddMSDdcsResourcesResponseBodyResourceAttributes build(java.util.Map<String, ?> map) throws Exception {
            AddMSDdcsResourcesResponseBodyResourceAttributes self = new AddMSDdcsResourcesResponseBodyResourceAttributes();
            return TeaModel.build(map, self);
        }

        public AddMSDdcsResourcesResponseBodyResourceAttributes setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public AddMSDdcsResourcesResponseBodyResourceAttributes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddMSDdcsResourcesResponseBodyResourceAttributes setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public AddMSDdcsResourcesResponseBodyResourceAttributes setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

    public static class AddMSDdcsResourcesResponseBodyResource extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Region")
        public String region;

        @NameInMap("Attributes")
        public java.util.List<AddMSDdcsResourcesResponseBodyResourceAttributes> attributes;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Desc")
        public String desc;

        public static AddMSDdcsResourcesResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            AddMSDdcsResourcesResponseBodyResource self = new AddMSDdcsResourcesResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public AddMSDdcsResourcesResponseBodyResource setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public AddMSDdcsResourcesResponseBodyResource setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public AddMSDdcsResourcesResponseBodyResource setAttributes(java.util.List<AddMSDdcsResourcesResponseBodyResourceAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<AddMSDdcsResourcesResponseBodyResourceAttributes> getAttributes() {
            return this.attributes;
        }

        public AddMSDdcsResourcesResponseBodyResource setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddMSDdcsResourcesResponseBodyResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AddMSDdcsResourcesResponseBodyResource setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public AddMSDdcsResourcesResponseBodyResource setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

}
