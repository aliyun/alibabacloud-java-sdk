// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class BindZoneVpcRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6447728c8578e66aacf062d2df4446dc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The information about VPCs.</p>
     */
    @NameInMap("Vpcs")
    public java.util.List<BindZoneVpcRequestVpcs> vpcs;

    /**
     * <p>The global ID of the zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AgIDE0OQ_149</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static BindZoneVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        BindZoneVpcRequest self = new BindZoneVpcRequest();
        return TeaModel.build(map, self);
    }

    public BindZoneVpcRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public BindZoneVpcRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public BindZoneVpcRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public BindZoneVpcRequest setVpcs(java.util.List<BindZoneVpcRequestVpcs> vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public java.util.List<BindZoneVpcRequestVpcs> getVpcs() {
        return this.vpcs;
    }

    public BindZoneVpcRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class BindZoneVpcRequestVpcs extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The VPC ID. If you do not specify this parameter, the VPCs that are bound to the zone are unbound from the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>daily-vpc-id</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The type of the VPC. Valid values:</p>
         * <ul>
         * <li><strong>STANDARD</strong>: standard VPC</li>
         * <li><strong>EDS</strong>: Elastic Desktop Service (EDS) workspace VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("VpcType")
        public String vpcType;

        public static BindZoneVpcRequestVpcs build(java.util.Map<String, ?> map) throws Exception {
            BindZoneVpcRequestVpcs self = new BindZoneVpcRequestVpcs();
            return TeaModel.build(map, self);
        }

        public BindZoneVpcRequestVpcs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public BindZoneVpcRequestVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public BindZoneVpcRequestVpcs setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

    }

}
