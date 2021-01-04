// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class BindZoneVpcRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Vpcs")
    public java.util.List<BindZoneVpcRequestVpcs> vpcs;

    public static BindZoneVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        BindZoneVpcRequest self = new BindZoneVpcRequest();
        return TeaModel.build(map, self);
    }

    public BindZoneVpcRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public BindZoneVpcRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
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

    public static class BindZoneVpcRequestVpcs extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("RegionId")
        public String regionId;

        public static BindZoneVpcRequestVpcs build(java.util.Map<String, ?> map) throws Exception {
            BindZoneVpcRequestVpcs self = new BindZoneVpcRequestVpcs();
            return TeaModel.build(map, self);
        }

        public BindZoneVpcRequestVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public BindZoneVpcRequestVpcs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
