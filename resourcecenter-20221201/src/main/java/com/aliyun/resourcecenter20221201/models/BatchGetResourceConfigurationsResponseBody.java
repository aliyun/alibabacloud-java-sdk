// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class BatchGetResourceConfigurationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F1CE0D52-32DA-531A-87A4-B9A5B68*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<BatchGetResourceConfigurationsResponseBodyResources> resources;

    public static BatchGetResourceConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetResourceConfigurationsResponseBody self = new BatchGetResourceConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetResourceConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetResourceConfigurationsResponseBody setResources(java.util.List<BatchGetResourceConfigurationsResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<BatchGetResourceConfigurationsResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class BatchGetResourceConfigurationsResponseBodyResourcesIpAddressAttributes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.168.1.2</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <strong>example:</strong>
         * <p>Ipv4</p>
         */
        @NameInMap("Version")
        public String version;

        public static BatchGetResourceConfigurationsResponseBodyResourcesIpAddressAttributes build(java.util.Map<String, ?> map) throws Exception {
            BatchGetResourceConfigurationsResponseBodyResourcesIpAddressAttributes self = new BatchGetResourceConfigurationsResponseBodyResourcesIpAddressAttributes();
            return TeaModel.build(map, self);
        }

        public BatchGetResourceConfigurationsResponseBodyResourcesIpAddressAttributes setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public BatchGetResourceConfigurationsResponseBodyResourcesIpAddressAttributes setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public BatchGetResourceConfigurationsResponseBodyResourcesIpAddressAttributes setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class BatchGetResourceConfigurationsResponseBodyResourcesTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test_value</p>
         */
        @NameInMap("Value")
        public String value;

        public static BatchGetResourceConfigurationsResponseBodyResourcesTags build(java.util.Map<String, ?> map) throws Exception {
            BatchGetResourceConfigurationsResponseBodyResourcesTags self = new BatchGetResourceConfigurationsResponseBodyResourcesTags();
            return TeaModel.build(map, self);
        }

        public BatchGetResourceConfigurationsResponseBodyResourcesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public BatchGetResourceConfigurationsResponseBodyResourcesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class BatchGetResourceConfigurationsResponseBodyResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>151266687691****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("Configuration")
        public java.util.Map<String, ?> configuration;

        /**
         * <strong>example:</strong>
         * <p>2021-06-30T09:20:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2021-07-30T09:20:08Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("IpAddressAttributes")
        public java.util.List<BatchGetResourceConfigurationsResponseBodyResourcesIpAddressAttributes> ipAddressAttributes;

        @NameInMap("IpAddresses")
        public java.util.List<String> ipAddresses;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>eip-wz9gdtce0q6h48h*****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Tags")
        public java.util.List<BatchGetResourceConfigurationsResponseBodyResourcesTags> tags;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static BatchGetResourceConfigurationsResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            BatchGetResourceConfigurationsResponseBodyResources self = new BatchGetResourceConfigurationsResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public BatchGetResourceConfigurationsResponseBodyResources setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public BatchGetResourceConfigurationsResponseBodyResources setConfiguration(java.util.Map<String, ?> configuration) {
            this.configuration = configuration;
            return this;
        }
        public java.util.Map<String, ?> getConfiguration() {
            return this.configuration;
        }

        public BatchGetResourceConfigurationsResponseBodyResources setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public BatchGetResourceConfigurationsResponseBodyResources setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public BatchGetResourceConfigurationsResponseBodyResources setIpAddressAttributes(java.util.List<BatchGetResourceConfigurationsResponseBodyResourcesIpAddressAttributes> ipAddressAttributes) {
            this.ipAddressAttributes = ipAddressAttributes;
            return this;
        }
        public java.util.List<BatchGetResourceConfigurationsResponseBodyResourcesIpAddressAttributes> getIpAddressAttributes() {
            return this.ipAddressAttributes;
        }

        public BatchGetResourceConfigurationsResponseBodyResources setIpAddresses(java.util.List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public java.util.List<String> getIpAddresses() {
            return this.ipAddresses;
        }

        public BatchGetResourceConfigurationsResponseBodyResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public BatchGetResourceConfigurationsResponseBodyResources setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public BatchGetResourceConfigurationsResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public BatchGetResourceConfigurationsResponseBodyResources setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public BatchGetResourceConfigurationsResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public BatchGetResourceConfigurationsResponseBodyResources setTags(java.util.List<BatchGetResourceConfigurationsResponseBodyResourcesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<BatchGetResourceConfigurationsResponseBodyResourcesTags> getTags() {
            return this.tags;
        }

        public BatchGetResourceConfigurationsResponseBodyResources setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
