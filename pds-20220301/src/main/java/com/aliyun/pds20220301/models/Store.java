// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Store extends TeaModel {
    @NameInMap("base_path")
    public String basePath;

    @NameInMap("bucket")
    public String bucket;

    @NameInMap("endpoint")
    public String endpoint;

    @NameInMap("location")
    public String location;

    @NameInMap("ownership")
    public String ownership;

    @NameInMap("role_arn")
    public String roleArn;

    @NameInMap("store_id")
    public String storeId;

    @NameInMap("type")
    public String type;

    public static Store build(java.util.Map<String, ?> map) throws Exception {
        Store self = new Store();
        return TeaModel.build(map, self);
    }

    public Store setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public Store setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public Store setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public Store setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public Store setOwnership(String ownership) {
        this.ownership = ownership;
        return this;
    }
    public String getOwnership() {
        return this.ownership;
    }

    public Store setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public Store setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public Store setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
