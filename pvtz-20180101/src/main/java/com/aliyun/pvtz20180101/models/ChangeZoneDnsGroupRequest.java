// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class ChangeZoneDnsGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see How to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>85456erer657cfgfg3437</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The logical location of the built-in authoritative module in which the zone is added. Valid values:</p>
     * <ul>
     * <li>Normal zone: regular module</li>
     * <li>Fast Zone: acceleration module</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL_ZONE</p>
     */
    @NameInMap("DnsGroup")
    public String dnsGroup;

    /**
     * <p>The global ID of the zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0cff188756b1d4579b25e54b66cb830</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ChangeZoneDnsGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeZoneDnsGroupRequest self = new ChangeZoneDnsGroupRequest();
        return TeaModel.build(map, self);
    }

    public ChangeZoneDnsGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ChangeZoneDnsGroupRequest setDnsGroup(String dnsGroup) {
        this.dnsGroup = dnsGroup;
        return this;
    }
    public String getDnsGroup() {
        return this.dnsGroup;
    }

    public ChangeZoneDnsGroupRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
