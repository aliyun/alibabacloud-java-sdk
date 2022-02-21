// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceGatewayRequest extends TeaModel {
    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("Expire")
    public Long expire;

    @NameInMap("Id")
    public String id;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDeviceGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceGatewayRequest self = new DescribeDeviceGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceGatewayRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DescribeDeviceGatewayRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public DescribeDeviceGatewayRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeDeviceGatewayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
