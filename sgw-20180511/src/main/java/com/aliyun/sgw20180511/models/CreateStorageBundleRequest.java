// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateStorageBundleRequest extends TeaModel {
    @NameInMap("BackendBucketRegionId")
    public String backendBucketRegionId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateStorageBundleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageBundleRequest self = new CreateStorageBundleRequest();
        return TeaModel.build(map, self);
    }

    public CreateStorageBundleRequest setBackendBucketRegionId(String backendBucketRegionId) {
        this.backendBucketRegionId = backendBucketRegionId;
        return this;
    }
    public String getBackendBucketRegionId() {
        return this.backendBucketRegionId;
    }

    public CreateStorageBundleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateStorageBundleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateStorageBundleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
