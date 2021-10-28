// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeSharesBucketInfoForExpressSyncRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("BucketRegion")
    public String bucketRegion;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeSharesBucketInfoForExpressSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSharesBucketInfoForExpressSyncRequest self = new DescribeSharesBucketInfoForExpressSyncRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSharesBucketInfoForExpressSyncRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public DescribeSharesBucketInfoForExpressSyncRequest setBucketRegion(String bucketRegion) {
        this.bucketRegion = bucketRegion;
        return this;
    }
    public String getBucketRegion() {
        return this.bucketRegion;
    }

    public DescribeSharesBucketInfoForExpressSyncRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
