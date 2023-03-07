// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountResourceConfigurationResponseBody extends TeaModel {
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
    public java.util.List<GetMultiAccountResourceConfigurationResponseBodyTags> tags;

    @NameInMap("ZoneId")
    public String zoneId;

    public static GetMultiAccountResourceConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultiAccountResourceConfigurationResponseBody self = new GetMultiAccountResourceConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultiAccountResourceConfigurationResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetMultiAccountResourceConfigurationResponseBody setConfiguration(java.util.Map<String, ?> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.Map<String, ?> getConfiguration() {
        return this.configuration;
    }

    public GetMultiAccountResourceConfigurationResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetMultiAccountResourceConfigurationResponseBody setIpAddresses(java.util.List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }
    public java.util.List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    public GetMultiAccountResourceConfigurationResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetMultiAccountResourceConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultiAccountResourceConfigurationResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetMultiAccountResourceConfigurationResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetMultiAccountResourceConfigurationResponseBody setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public GetMultiAccountResourceConfigurationResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetMultiAccountResourceConfigurationResponseBody setTags(java.util.List<GetMultiAccountResourceConfigurationResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetMultiAccountResourceConfigurationResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetMultiAccountResourceConfigurationResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class GetMultiAccountResourceConfigurationResponseBodyTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetMultiAccountResourceConfigurationResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetMultiAccountResourceConfigurationResponseBodyTags self = new GetMultiAccountResourceConfigurationResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetMultiAccountResourceConfigurationResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetMultiAccountResourceConfigurationResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
