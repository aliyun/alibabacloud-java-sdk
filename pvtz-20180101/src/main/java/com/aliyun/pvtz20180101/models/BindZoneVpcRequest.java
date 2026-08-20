// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class BindZoneVpcRequest extends TeaModel {
    /**
     * <p>A client-generated token that is used to ensure the idempotence of the request. You can use the client to generate a unique token for the request. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6447728c8578e66aacf062d2df4446dc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><code>zh</code>: Chinese.</p>
     * </li>
     * <li><p><code>en</code>: English.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>en</code>.</p>
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
     * <p>127.0.XX.XX</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The VPCs.</p>
     * <blockquote>
     * <p>If you leave this parameter empty, all VPCs bound to the zone are unbound.</p>
     * </blockquote>
     */
    @NameInMap("Vpcs")
    public java.util.List<BindZoneVpcRequestVpcs> vpcs;

    /**
     * <p>The unique ID of the zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34d4031b63c527358b710a61346a****</p>
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
         * <p>The ID of the region where the VPC is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-f8zvrvr1payllgz38****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The type of the VPC. Valid values:</p>
         * <ul>
         * <li><p><strong>STANDARD</strong>: a standard VPC.</p>
         * </li>
         * <li><p><strong>EDS</strong>: an Elastic Desktop Service VPC.</p>
         * </li>
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
