// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>151266687691****</p>
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
     * 
     * <strong>example:</strong>
     * <p>2021-06-30T09:20:08Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time when the resource expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-30T09:20:08Z</p>
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
     * <blockquote>
     * <p>Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.</p>
     * </blockquote>
     */
    @NameInMap("IpAddresses")
    public java.util.List<String> ipAddresses;

    /**
     * <p>The region ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F1CE0D52-32DA-531A-87A4-B9A5B68D5D8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmv4k****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-uf6978gdqbi****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The type of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::VPC::VSwitch</p>
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
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-k</p>
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
         * 
         * <strong>example:</strong>
         * <p>192.168.1.2</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong>: the Internet</li>
         * <li><strong>Private</strong>: internal network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>Ipv4</p>
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
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test-value</p>
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
