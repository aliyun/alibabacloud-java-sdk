// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetAccessPointResult extends TeaModel {
    @NameInMap("AccessPointArn")
    public String accessPointArn;

    @NameInMap("AccessPointName")
    public String accessPointName;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Alias")
    public String alias;

    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("Endpoints")
    public Endpoints endpoints;

    @NameInMap("InternalEndpoint")
    public String internalEndpoint;

    @NameInMap("NetworkOrigin")
    public String networkOrigin;

    @NameInMap("Status")
    public String status;

    @NameInMap("VpcConfiguration")
    public AccessPointVpcConfiguration vpcConfiguration;

    public static GetAccessPointResult build(java.util.Map<String, ?> map) throws Exception {
        GetAccessPointResult self = new GetAccessPointResult();
        return TeaModel.build(map, self);
    }

    public GetAccessPointResult setAccessPointArn(String accessPointArn) {
        this.accessPointArn = accessPointArn;
        return this;
    }
    public String getAccessPointArn() {
        return this.accessPointArn;
    }

    public GetAccessPointResult setAccessPointName(String accessPointName) {
        this.accessPointName = accessPointName;
        return this;
    }
    public String getAccessPointName() {
        return this.accessPointName;
    }

    public GetAccessPointResult setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetAccessPointResult setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public GetAccessPointResult setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public GetAccessPointResult setEndpoints(Endpoints endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public Endpoints getEndpoints() {
        return this.endpoints;
    }

    public GetAccessPointResult setInternalEndpoint(String internalEndpoint) {
        this.internalEndpoint = internalEndpoint;
        return this;
    }
    public String getInternalEndpoint() {
        return this.internalEndpoint;
    }

    public GetAccessPointResult setNetworkOrigin(String networkOrigin) {
        this.networkOrigin = networkOrigin;
        return this;
    }
    public String getNetworkOrigin() {
        return this.networkOrigin;
    }

    public GetAccessPointResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAccessPointResult setVpcConfiguration(AccessPointVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
        return this;
    }
    public AccessPointVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    public static class Endpoints extends TeaModel {
        @NameInMap("PublicEndpoint")
        public String publicEndpoint;

        public static Endpoints build(java.util.Map<String, ?> map) throws Exception {
            Endpoints self = new Endpoints();
            return TeaModel.build(map, self);
        }

        public Endpoints setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

    }

}
