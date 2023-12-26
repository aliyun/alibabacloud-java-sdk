// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The configurations of the resource.</p>
     */
    @NameInMap("Configuration")
    public java.util.Map<String, ?> configuration;

    /**
     * <p>The time when the resource was created.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time when the resource expires.</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The attributes of the IP address.</p>
     */
    @NameInMap("IpAddressAttributes")
    public java.util.List<GetResourceConfigurationResponseBodyIpAddressAttributes> ipAddressAttributes;

    /**
     * <p>The IP addresses.</p>
     * <br>
     * <p>> Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.</p>
     */
    @NameInMap("IpAddresses")
    public java.util.List<String> ipAddresses;

    /**
     * <p>The region ID of the resource.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the resource belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the resource.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name of the resource.</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The type of the resource.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetResourceConfigurationResponseBodyTags> tags;

    /**
     * <p>The zone ID of the resource.</p>
     */
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

    public GetResourceConfigurationResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GetResourceConfigurationResponseBody setIpAddressAttributes(java.util.List<GetResourceConfigurationResponseBodyIpAddressAttributes> ipAddressAttributes) {
        this.ipAddressAttributes = ipAddressAttributes;
        return this;
    }
    public java.util.List<GetResourceConfigurationResponseBodyIpAddressAttributes> getIpAddressAttributes() {
        return this.ipAddressAttributes;
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

    public static class GetResourceConfigurationResponseBodyIpAddressAttributes extends TeaModel {
        /**
         * <p>The IP address.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The network type. Valid values:</p>
         * <br>
         * <p>*   **Public**: the Internet</p>
         * <p>*   **Private**: internal network</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The version.</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetResourceConfigurationResponseBodyIpAddressAttributes build(java.util.Map<String, ?> map) throws Exception {
            GetResourceConfigurationResponseBodyIpAddressAttributes self = new GetResourceConfigurationResponseBodyIpAddressAttributes();
            return TeaModel.build(map, self);
        }

        public GetResourceConfigurationResponseBodyIpAddressAttributes setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public GetResourceConfigurationResponseBodyIpAddressAttributes setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetResourceConfigurationResponseBodyIpAddressAttributes setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetResourceConfigurationResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
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
