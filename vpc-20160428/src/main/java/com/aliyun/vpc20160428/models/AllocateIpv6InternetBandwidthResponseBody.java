// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateIpv6InternetBandwidthResponseBody extends TeaModel {
    /**
     * <p>The ID of the Internet bandwidth that you purchased for the IPv6 gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6bw-uf6hcyzu65v98v3du****</p>
     */
    @NameInMap("InternetBandwidthId")
    public String internetBandwidthId;

    /**
     * <p>The ID of the IPv6 address.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6-2zen5j4axcp5l5qyy****</p>
     */
    @NameInMap("Ipv6AddressId")
    public String ipv6AddressId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6972A26E-99B1-4367-9890-FBDEBB0F5E7D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateIpv6InternetBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpv6InternetBandwidthResponseBody self = new AllocateIpv6InternetBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateIpv6InternetBandwidthResponseBody setInternetBandwidthId(String internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
        return this;
    }
    public String getInternetBandwidthId() {
        return this.internetBandwidthId;
    }

    public AllocateIpv6InternetBandwidthResponseBody setIpv6AddressId(String ipv6AddressId) {
        this.ipv6AddressId = ipv6AddressId;
        return this;
    }
    public String getIpv6AddressId() {
        return this.ipv6AddressId;
    }

    public AllocateIpv6InternetBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
