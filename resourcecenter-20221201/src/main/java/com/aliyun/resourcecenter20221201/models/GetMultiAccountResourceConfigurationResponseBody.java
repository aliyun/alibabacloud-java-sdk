// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountResourceConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the management account or member of the resource directory.</p>
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
    public java.util.List<GetMultiAccountResourceConfigurationResponseBodyIpAddressAttributes> ipAddressAttributes;

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
    public java.util.List<GetMultiAccountResourceConfigurationResponseBodyTags> tags;

    /**
     * <p>The zone ID of the resource.</p>
     */
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

    public GetMultiAccountResourceConfigurationResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GetMultiAccountResourceConfigurationResponseBody setIpAddressAttributes(java.util.List<GetMultiAccountResourceConfigurationResponseBodyIpAddressAttributes> ipAddressAttributes) {
        this.ipAddressAttributes = ipAddressAttributes;
        return this;
    }
    public java.util.List<GetMultiAccountResourceConfigurationResponseBodyIpAddressAttributes> getIpAddressAttributes() {
        return this.ipAddressAttributes;
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

    public static class GetMultiAccountResourceConfigurationResponseBodyIpAddressAttributes extends TeaModel {
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

        public static GetMultiAccountResourceConfigurationResponseBodyIpAddressAttributes build(java.util.Map<String, ?> map) throws Exception {
            GetMultiAccountResourceConfigurationResponseBodyIpAddressAttributes self = new GetMultiAccountResourceConfigurationResponseBodyIpAddressAttributes();
            return TeaModel.build(map, self);
        }

        public GetMultiAccountResourceConfigurationResponseBodyIpAddressAttributes setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public GetMultiAccountResourceConfigurationResponseBodyIpAddressAttributes setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetMultiAccountResourceConfigurationResponseBodyIpAddressAttributes setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetMultiAccountResourceConfigurationResponseBodyTags extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         */
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
