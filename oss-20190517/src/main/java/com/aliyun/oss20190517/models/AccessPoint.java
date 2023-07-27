// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class AccessPoint extends TeaModel {
    @NameInMap("AccessPointName")
    public String accessPointName;

    @NameInMap("Alias")
    public String alias;

    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("NetworkOrigin")
    public String networkOrigin;

    @NameInMap("Status")
    public String status;

    @NameInMap("VpcConfiguration")
    public AccessPointVpcConfiguration vpcConfiguration;

    public static AccessPoint build(java.util.Map<String, ?> map) throws Exception {
        AccessPoint self = new AccessPoint();
        return TeaModel.build(map, self);
    }

    public AccessPoint setAccessPointName(String accessPointName) {
        this.accessPointName = accessPointName;
        return this;
    }
    public String getAccessPointName() {
        return this.accessPointName;
    }

    public AccessPoint setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public AccessPoint setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public AccessPoint setNetworkOrigin(String networkOrigin) {
        this.networkOrigin = networkOrigin;
        return this;
    }
    public String getNetworkOrigin() {
        return this.networkOrigin;
    }

    public AccessPoint setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AccessPoint setVpcConfiguration(AccessPointVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
        return this;
    }
    public AccessPointVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

}
