// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetIpv4GatewayAttributeResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("Ipv4GatewayDescription")
    public String ipv4GatewayDescription;

    @NameInMap("Ipv4GatewayId")
    public String ipv4GatewayId;

    @NameInMap("Ipv4GatewayName")
    public String ipv4GatewayName;

    @NameInMap("Ipv4GatewayRouteTableId")
    public String ipv4GatewayRouteTableId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<GetIpv4GatewayAttributeResponseBodyTags> tags;

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
        @NameInMap("Key")
        public String key;

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
