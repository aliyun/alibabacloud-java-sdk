// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class IPConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>办公网出口地址</p>
     */
    @NameInMap("description")
    public String description;

    /**
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
