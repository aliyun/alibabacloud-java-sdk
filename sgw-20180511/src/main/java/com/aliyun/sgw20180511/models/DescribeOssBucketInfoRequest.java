// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeOssBucketInfoRequest extends TeaModel {
    @NameInMap("BucketEndpoint")
    public String bucketEndpoint;

    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Type")
    public String type;

    public static DescribeOssBucketInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssBucketInfoRequest self = new DescribeOssBucketInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssBucketInfoRequest setBucketEndpoint(String bucketEndpoint) {
        this.bucketEndpoint = bucketEndpoint;
        return this;
    }
    public String getBucketEndpoint() {
        return this.bucketEndpoint;
    }

    public DescribeOssBucketInfoRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public DescribeOssBucketInfoRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeOssBucketInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeOssBucketInfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
