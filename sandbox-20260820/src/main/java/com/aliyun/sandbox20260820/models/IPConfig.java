// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class IPConfig extends TeaModel {
    /**
     * <p>The description of the IP rule. The description can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Office network egress address</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The IPv4 address or CIDR block. IPv6 is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>203.0.113.25/32</p>
     */
    @NameInMap("ipAddress")
    public String ipAddress;

    public static IPConfig build(java.util.Map<String, ?> map) throws Exception {
        IPConfig self = new IPConfig();
        return TeaModel.build(map, self);
    }

    public IPConfig setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IPConfig setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

}
