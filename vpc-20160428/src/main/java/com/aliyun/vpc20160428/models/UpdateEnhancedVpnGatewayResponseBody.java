// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateEnhancedVpnGatewayResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPropagate")
    public Boolean autoPropagate;

    /**
     * <strong>example:</strong>
     * <p>1492753580000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>vsw-p0w95ql6tmr2ludkt****</p>
     */
    @NameInMap("DisasterRecoveryVSwitchId")
    public String disasterRecoveryVSwitchId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableBgp")
    public Boolean enableBgp;

    @NameInMap("EniInstanceIds")
    public UpdateEnhancedVpnGatewayResponseBodyEniInstanceIds eniInstanceIds;

    /**
     * <strong>example:</strong>
     * <p>Enhanced.SiteToSite</p>
     */
    @NameInMap("GatewayType")
    public String gatewayType;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B457</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmzs372yg****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>{&quot;VpnEnableBgp&quot;: true}</p>
     */
    @NameInMap("Tag")
    public String tag;

    @NameInMap("Tags")
    public UpdateEnhancedVpnGatewayResponseBodyTags tags;

    /**
     * <strong>example:</strong>
     * <p>vsw-bp1y9ovl1cu9ou4tv****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>vpc-bp1ub1yt9cvakoel****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <strong>example:</strong>
     * <p>vpn-bp1q8bgx4xnkm2ogj****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    /**
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("VpnType")
    public String vpnType;

    public static UpdateEnhancedVpnGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnhancedVpnGatewayResponseBody self = new UpdateEnhancedVpnGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEnhancedVpnGatewayResponseBody setAutoPropagate(Boolean autoPropagate) {
        this.autoPropagate = autoPropagate;
        return this;
    }
    public Boolean getAutoPropagate() {
        return this.autoPropagate;
    }

    public UpdateEnhancedVpnGatewayResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public UpdateEnhancedVpnGatewayResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEnhancedVpnGatewayResponseBody setDisasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
        this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
        return this;
    }
    public String getDisasterRecoveryVSwitchId() {
        return this.disasterRecoveryVSwitchId;
    }

    public UpdateEnhancedVpnGatewayResponseBody setEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }
    public Boolean getEnableBgp() {
        return this.enableBgp;
    }

    public UpdateEnhancedVpnGatewayResponseBody setEniInstanceIds(UpdateEnhancedVpnGatewayResponseBodyEniInstanceIds eniInstanceIds) {
        this.eniInstanceIds = eniInstanceIds;
        return this;
    }
    public UpdateEnhancedVpnGatewayResponseBodyEniInstanceIds getEniInstanceIds() {
        return this.eniInstanceIds;
    }

    public UpdateEnhancedVpnGatewayResponseBody setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public UpdateEnhancedVpnGatewayResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEnhancedVpnGatewayResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public UpdateEnhancedVpnGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEnhancedVpnGatewayResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateEnhancedVpnGatewayResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateEnhancedVpnGatewayResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public UpdateEnhancedVpnGatewayResponseBody setTags(UpdateEnhancedVpnGatewayResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public UpdateEnhancedVpnGatewayResponseBodyTags getTags() {
        return this.tags;
    }

    public UpdateEnhancedVpnGatewayResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public UpdateEnhancedVpnGatewayResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public UpdateEnhancedVpnGatewayResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public UpdateEnhancedVpnGatewayResponseBody setVpnType(String vpnType) {
        this.vpnType = vpnType;
        return this;
    }
    public String getVpnType() {
        return this.vpnType;
    }

    public static class UpdateEnhancedVpnGatewayResponseBodyEniInstanceIds extends TeaModel {
        @NameInMap("EniInstanceId")
        public java.util.List<String> eniInstanceId;

        public static UpdateEnhancedVpnGatewayResponseBodyEniInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnhancedVpnGatewayResponseBodyEniInstanceIds self = new UpdateEnhancedVpnGatewayResponseBodyEniInstanceIds();
            return TeaModel.build(map, self);
        }

        public UpdateEnhancedVpnGatewayResponseBodyEniInstanceIds setEniInstanceId(java.util.List<String> eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public java.util.List<String> getEniInstanceId() {
            return this.eniInstanceId;
        }

    }

    public static class UpdateEnhancedVpnGatewayResponseBodyTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateEnhancedVpnGatewayResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnhancedVpnGatewayResponseBodyTagsTag self = new UpdateEnhancedVpnGatewayResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public UpdateEnhancedVpnGatewayResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateEnhancedVpnGatewayResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateEnhancedVpnGatewayResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<UpdateEnhancedVpnGatewayResponseBodyTagsTag> tag;

        public static UpdateEnhancedVpnGatewayResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnhancedVpnGatewayResponseBodyTags self = new UpdateEnhancedVpnGatewayResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public UpdateEnhancedVpnGatewayResponseBodyTags setTag(java.util.List<UpdateEnhancedVpnGatewayResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<UpdateEnhancedVpnGatewayResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
