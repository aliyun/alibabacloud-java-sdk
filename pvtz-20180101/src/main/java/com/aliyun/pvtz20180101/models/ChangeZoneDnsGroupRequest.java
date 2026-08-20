// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class ChangeZoneDnsGroupRequest extends TeaModel {
    /**
     * <p>A client token that is used to ensure the idempotence of the request. Generate a unique value for this parameter on your client. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see How to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>85456erer657cfgfg3437</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The built-in authoritative DNS group.</p>
     * <ul>
     * <li><p>Standard zone group: NORMAL_ZONE</p>
     * </li>
     * <li><p>Acceleration zone group: FAST_ZONE</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>Starting from April 30, 2025 (UTC+8), when new users of Alibaba Cloud DNS PrivateZone create a zone, the zone is set to an acceleration zone by default.</p>
     * </blockquote>
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
