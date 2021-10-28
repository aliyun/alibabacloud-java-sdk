// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeOssBucketsRequest extends TeaModel {
    @NameInMap("BucketEndpoint")
    public String bucketEndpoint;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeOssBucketsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssBucketsRequest self = new DescribeOssBucketsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssBucketsRequest setBucketEndpoint(String bucketEndpoint) {
        this.bucketEndpoint = bucketEndpoint;
        return this;
    }
    public String getBucketEndpoint() {
        return this.bucketEndpoint;
    }

    public DescribeOssBucketsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
