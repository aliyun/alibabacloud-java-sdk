// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetIpv4GatewayAttributeResponseBody extends TeaModel {
    /**
     * <p>The time when the IPv4 gateway was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-24T09:02:36Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates whether the IPv4 gateway is activated. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The IPv4 gateway is activated.</p>
     * </li>
     * <li><p><strong>false</strong>: The IPv4 gateway is not activated.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The description of the IPv4 gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>new</p>
     */
    @NameInMap("Ipv4GatewayDescription")
    public String ipv4GatewayDescription;

    /**
     * <p>The instance ID of the IPv4 gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv4gw-5tsnc6s4ogsedtp3k****</p>
     */
    @NameInMap("Ipv4GatewayId")
    public String ipv4GatewayId;

    /**
     * <p>The name of the IPv4 gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Ipv4GatewayName")
    public String ipv4GatewayName;

    /**
     * <p>The ID of the route table associated with the IPv4 gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-5ts0ohchwkp3dydt2****</p>
     */
    @NameInMap("Ipv4GatewayRouteTableId")
    public String ipv4GatewayRouteTableId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7F79A919-6FE9-50C4-967B-45705E1F9C38</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the IPv4 gateway belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the IPv4 gateway instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Creating</strong>: The IPv4 gateway is being created.</p>
     * </li>
     * <li><p><strong>Created</strong>: The IPv4 gateway is created and available.</p>
     * </li>
     * <li><p><strong>Modifying</strong>: The IPv4 gateway is being modified.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: The IPv4 gateway is being deleted.</p>
     * </li>
     * <li><p><strong>Deleted</strong>: The IPv4 gateway is deleted.</p>
     * </li>
     * <li><p><strong>Activating</strong>: The IPv4 gateway is being activated.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Created</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetIpv4GatewayAttributeResponseBodyTags> tags;

    /**
     * <p>The ID of the VPC associated with the IPv4 gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-5tsrxlw7dv074gci4****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static GetIpv4GatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIpv4GatewayAttributeResponseBody self = new GetIpv4GatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIpv4GatewayAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetIpv4GatewayAttributeResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetIpv4GatewayAttributeResponseBody setIpv4GatewayDescription(String ipv4GatewayDescription) {
        this.ipv4GatewayDescription = ipv4GatewayDescription;
        return this;
    }
    public String getIpv4GatewayDescription() {
        return this.ipv4GatewayDescription;
    }

    public GetIpv4GatewayAttributeResponseBody setIpv4GatewayId(String ipv4GatewayId) {
        this.ipv4GatewayId = ipv4GatewayId;
        return this;
    }
    public String getIpv4GatewayId() {
        return this.ipv4GatewayId;
    }

    public GetIpv4GatewayAttributeResponseBody setIpv4GatewayName(String ipv4GatewayName) {
        this.ipv4GatewayName = ipv4GatewayName;
        return this;
    }
    public String getIpv4GatewayName() {
        return this.ipv4GatewayName;
    }

    public GetIpv4GatewayAttributeResponseBody setIpv4GatewayRouteTableId(String ipv4GatewayRouteTableId) {
        this.ipv4GatewayRouteTableId = ipv4GatewayRouteTableId;
        return this;
    }
    public String getIpv4GatewayRouteTableId() {
        return this.ipv4GatewayRouteTableId;
    }

    public GetIpv4GatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIpv4GatewayAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetIpv4GatewayAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetIpv4GatewayAttributeResponseBody setTags(java.util.List<GetIpv4GatewayAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetIpv4GatewayAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetIpv4GatewayAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class GetIpv4GatewayAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetIpv4GatewayAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetIpv4GatewayAttributeResponseBodyTags self = new GetIpv4GatewayAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetIpv4GatewayAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetIpv4GatewayAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
