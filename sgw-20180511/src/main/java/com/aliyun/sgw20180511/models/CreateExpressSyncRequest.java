// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateExpressSyncRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("BucketPrefix")
    public String bucketPrefix;

    @NameInMap("BucketRegion")
    public String bucketRegion;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateExpressSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressSyncRequest self = new CreateExpressSyncRequest();
        return TeaModel.build(map, self);
    }

    public CreateExpressSyncRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public CreateExpressSyncRequest setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
        return this;
    }
    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    public CreateExpressSyncRequest setBucketRegion(String bucketRegion) {
        this.bucketRegion = bucketRegion;
        return this;
    }
    public String getBucketRegion() {
        return this.bucketRegion;
    }

    public CreateExpressSyncRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExpressSyncRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExpressSyncRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
