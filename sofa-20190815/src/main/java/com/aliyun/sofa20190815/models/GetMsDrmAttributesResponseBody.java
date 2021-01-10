// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsDrmAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("DrmAttribute")
    public GetMsDrmAttributesResponseBodyDrmAttribute drmAttribute;

    public static GetMsDrmAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMsDrmAttributesResponseBody self = new GetMsDrmAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMsDrmAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMsDrmAttributesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMsDrmAttributesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetMsDrmAttributesResponseBody setDrmAttribute(GetMsDrmAttributesResponseBodyDrmAttribute drmAttribute) {
        this.drmAttribute = drmAttribute;
        return this;
    }
    public GetMsDrmAttributesResponseBodyDrmAttribute getDrmAttribute() {
        return this.drmAttribute;
    }

    public static class GetMsDrmAttributesResponseBodyDrmAttributeParent extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceDomain")
        public String resourceDomain;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceVersion")
        public String resourceVersion;

        @NameInMap("Type")
        public String type;

        public static GetMsDrmAttributesResponseBodyDrmAttributeParent build(java.util.Map<String, ?> map) throws Exception {
            GetMsDrmAttributesResponseBodyDrmAttributeParent self = new GetMsDrmAttributesResponseBodyDrmAttributeParent();
            return TeaModel.build(map, self);
        }

        public GetMsDrmAttributesResponseBodyDrmAttributeParent setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetMsDrmAttributesResponseBodyDrmAttributeParent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMsDrmAttributesResponseBodyDrmAttributeParent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMsDrmAttributesResponseBodyDrmAttributeParent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMsDrmAttributesResponseBodyDrmAttributeParent setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetMsDrmAttributesResponseBodyDrmAttributeParent setResourceDomain(String resourceDomain) {
            this.resourceDomain = resourceDomain;
            return this;
        }
        public String getResourceDomain() {
            return this.resourceDomain;
        }

        public GetMsDrmAttributesResponseBodyDrmAttributeParent setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetMsDrmAttributesResponseBodyDrmAttributeParent setResourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }
        public String getResourceVersion() {
            return this.resourceVersion;
        }

        public GetMsDrmAttributesResponseBodyDrmAttributeParent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMsDrmAttributesResponseBodyDrmAttribute extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Parent")
        public GetMsDrmAttributesResponseBodyDrmAttributeParent parent;

        public static GetMsDrmAttributesResponseBodyDrmAttribute build(java.util.Map<String, ?> map) throws Exception {
            GetMsDrmAttributesResponseBodyDrmAttribute self = new GetMsDrmAttributesResponseBodyDrmAttribute();
            return TeaModel.build(map, self);
        }

        public GetMsDrmAttributesResponseBodyDrmAttribute setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public GetMsDrmAttributesResponseBodyDrmAttribute setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetMsDrmAttributesResponseBodyDrmAttribute setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMsDrmAttributesResponseBodyDrmAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMsDrmAttributesResponseBodyDrmAttribute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMsDrmAttributesResponseBodyDrmAttribute setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetMsDrmAttributesResponseBodyDrmAttribute setParent(GetMsDrmAttributesResponseBodyDrmAttributeParent parent) {
            this.parent = parent;
            return this;
        }
        public GetMsDrmAttributesResponseBodyDrmAttributeParent getParent() {
            return this.parent;
        }

    }

}
