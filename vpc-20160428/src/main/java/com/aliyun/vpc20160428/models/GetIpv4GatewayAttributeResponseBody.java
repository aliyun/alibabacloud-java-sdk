// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetIpv4GatewayAttributeResponseBody extends TeaModel {
    /**
     * <p>The time when the IPv4 gateway was created.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates whether the IPv4 gateway is activated. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The description of the IPv4 gateway.</p>
     */
    @NameInMap("Ipv4GatewayDescription")
    public String ipv4GatewayDescription;

    /**
     * <p>The ID of the IPv4 gateway.</p>
     */
    @NameInMap("Ipv4GatewayId")
    public String ipv4GatewayId;

    /**
     * <p>The name of the IPv4 gateway.</p>
     */
    @NameInMap("Ipv4GatewayName")
    public String ipv4GatewayName;

    /**
     * <p>The ID of the route table associated with the IPv4 gateway.</p>
     */
    @NameInMap("Ipv4GatewayRouteTableId")
    public String ipv4GatewayRouteTableId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the IPv4 gateway belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the IPv4 gateway. Valid values:</p>
     * <br>
     * <p>*   **Creating**</p>
     * <p>*   **Created**</p>
     * <p>*   **Modifying**</p>
     * <p>*   **Deleting**</p>
     * <p>*   **Deleted**</p>
     * <p>*   **Activating**</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetIpv4GatewayAttributeResponseBodyTags> tags;

    /**
     * <p>The ID of the VPC with which the IPv4 gateway is associated.</p>
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
         * <p>The key of tag N added to the resource.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the resource.</p>
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
