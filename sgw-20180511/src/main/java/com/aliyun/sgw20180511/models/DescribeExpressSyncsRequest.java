// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeExpressSyncsRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("BucketPrefix")
    public String bucketPrefix;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeExpressSyncsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressSyncsRequest self = new DescribeExpressSyncsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressSyncsRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public DescribeExpressSyncsRequest setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
        return this;
    }
    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    public DescribeExpressSyncsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
