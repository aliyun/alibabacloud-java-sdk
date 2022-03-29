// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeUserDevicesRequest extends TeaModel {
    @NameInMap("EnsInstanceIds")
    public String ensInstanceIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ServerName")
    public String serverName;

    public static DescribeUserDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDevicesRequest self = new DescribeUserDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserDevicesRequest setEnsInstanceIds(String ensInstanceIds) {
        this.ensInstanceIds = ensInstanceIds;
        return this;
    }
    public String getEnsInstanceIds() {
        return this.ensInstanceIds;
    }

    public DescribeUserDevicesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUserDevicesRequest setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

}
