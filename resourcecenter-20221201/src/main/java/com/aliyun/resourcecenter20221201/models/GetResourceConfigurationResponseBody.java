// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationResponseBody extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Configuration")
    public java.util.Map<String, ?> configuration;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("IpAddresses")
    public java.util.List<String> ipAddresses;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tags")
    public java.util.List<GetResourceConfigurationResponseBodyTags> tags;

    @NameInMap("ZoneId")
    public String zoneId;

    public static GetResourceConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceConfigurationResponseBody self = new GetResourceConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceConfigurationResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetResourceConfigurationResponseBody setConfiguration(java.util.Map<String, ?> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.Map<String, ?> getConfiguration() {
        return this.configuration;
    }

    public GetResourceConfigurationResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetResourceConfigurationResponseBody setIpAddresses(java.util.List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }
    public java.util.List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    public GetResourceConfigurationResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetResourceConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceConfigurationResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetResourceConfigurationResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetResourceConfigurationResponseBody setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public GetResourceConfigurationResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetResourceConfigurationResponseBody setTags(java.util.List<GetResourceConfigurationResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetResourceConfigurationResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetResourceConfigurationResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class GetResourceConfigurationResponseBodyTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetResourceConfigurationResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetResourceConfigurationResponseBodyTags self = new GetResourceConfigurationResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetResourceConfigurationResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetResourceConfigurationResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
