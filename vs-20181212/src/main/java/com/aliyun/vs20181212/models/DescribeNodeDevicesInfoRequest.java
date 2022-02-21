// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeNodeDevicesInfoRequest extends TeaModel {
    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeNodeDevicesInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeDevicesInfoRequest self = new DescribeNodeDevicesInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodeDevicesInfoRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public DescribeNodeDevicesInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
