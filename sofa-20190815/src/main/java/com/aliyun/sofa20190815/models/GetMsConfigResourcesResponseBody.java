// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsConfigResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Resource")
    public GetMsConfigResourcesResponseBodyResource resource;

    public static GetMsConfigResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMsConfigResourcesResponseBody self = new GetMsConfigResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMsConfigResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMsConfigResourcesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMsConfigResourcesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetMsConfigResourcesResponseBody setResource(GetMsConfigResourcesResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public GetMsConfigResourcesResponseBodyResource getResource() {
        return this.resource;
    }

    public static class GetMsConfigResourcesResponseBodyResourceAttributes extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        public static GetMsConfigResourcesResponseBodyResourceAttributes build(java.util.Map<String, ?> map) throws Exception {
            GetMsConfigResourcesResponseBodyResourceAttributes self = new GetMsConfigResourcesResponseBodyResourceAttributes();
            return TeaModel.build(map, self);
        }

        public GetMsConfigResourcesResponseBodyResourceAttributes setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public GetMsConfigResourcesResponseBodyResourceAttributes setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetMsConfigResourcesResponseBodyResourceAttributes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMsConfigResourcesResponseBodyResourceAttributes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class GetMsConfigResourcesResponseBodyResource extends TeaModel {
        @NameInMap("AppName")
        public String appName;

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

        @NameInMap("Attributes")
        public java.util.List<GetMsConfigResourcesResponseBodyResourceAttributes> attributes;

        public static GetMsConfigResourcesResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            GetMsConfigResourcesResponseBodyResource self = new GetMsConfigResourcesResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public GetMsConfigResourcesResponseBodyResource setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetMsConfigResourcesResponseBodyResource setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetMsConfigResourcesResponseBodyResource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMsConfigResourcesResponseBodyResource setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMsConfigResourcesResponseBodyResource setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetMsConfigResourcesResponseBodyResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetMsConfigResourcesResponseBodyResource setAttributes(java.util.List<GetMsConfigResourcesResponseBodyResourceAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<GetMsConfigResourcesResponseBodyResourceAttributes> getAttributes() {
            return this.attributes;
        }

    }

}
