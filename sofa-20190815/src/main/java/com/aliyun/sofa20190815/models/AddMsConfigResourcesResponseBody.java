// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsConfigResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resource")
    public AddMsConfigResourcesResponseBodyResource resource;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static AddMsConfigResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMsConfigResourcesResponseBody self = new AddMsConfigResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMsConfigResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMsConfigResourcesResponseBody setResource(AddMsConfigResourcesResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public AddMsConfigResourcesResponseBodyResource getResource() {
        return this.resource;
    }

    public AddMsConfigResourcesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddMsConfigResourcesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class AddMsConfigResourcesResponseBodyResourceAttributes extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        public static AddMsConfigResourcesResponseBodyResourceAttributes build(java.util.Map<String, ?> map) throws Exception {
            AddMsConfigResourcesResponseBodyResourceAttributes self = new AddMsConfigResourcesResponseBodyResourceAttributes();
            return TeaModel.build(map, self);
        }

        public AddMsConfigResourcesResponseBodyResourceAttributes setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public AddMsConfigResourcesResponseBodyResourceAttributes setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public AddMsConfigResourcesResponseBodyResourceAttributes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddMsConfigResourcesResponseBodyResourceAttributes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class AddMsConfigResourcesResponseBodyResource extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Attributes")
        public java.util.List<AddMsConfigResourcesResponseBodyResourceAttributes> attributes;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceId")
        public String resourceId;

        public static AddMsConfigResourcesResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            AddMsConfigResourcesResponseBodyResource self = new AddMsConfigResourcesResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public AddMsConfigResourcesResponseBodyResource setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public AddMsConfigResourcesResponseBodyResource setAttributes(java.util.List<AddMsConfigResourcesResponseBodyResourceAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<AddMsConfigResourcesResponseBodyResourceAttributes> getAttributes() {
            return this.attributes;
        }

        public AddMsConfigResourcesResponseBodyResource setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public AddMsConfigResourcesResponseBodyResource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddMsConfigResourcesResponseBodyResource setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddMsConfigResourcesResponseBodyResource setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public AddMsConfigResourcesResponseBodyResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
