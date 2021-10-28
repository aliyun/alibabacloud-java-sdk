// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ValidateExpressSyncConfigRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("BucketPrefix")
    public String bucketPrefix;

    @NameInMap("BucketRegion")
    public String bucketRegion;

    @NameInMap("Name")
    public String name;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ValidateExpressSyncConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateExpressSyncConfigRequest self = new ValidateExpressSyncConfigRequest();
        return TeaModel.build(map, self);
    }

    public ValidateExpressSyncConfigRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ValidateExpressSyncConfigRequest setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
        return this;
    }
    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    public ValidateExpressSyncConfigRequest setBucketRegion(String bucketRegion) {
        this.bucketRegion = bucketRegion;
        return this;
    }
    public String getBucketRegion() {
        return this.bucketRegion;
    }

    public ValidateExpressSyncConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ValidateExpressSyncConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
