// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ClusterBaseParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // creator
    @NameInMap("creator")
    public String creator;

    // modifier
    @NameInMap("modifier")
    public String modifier;

    // product
    @NameInMap("product")
    public String product;

    // regionId
    @NameInMap("regionId")
    public String regionId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static ClusterBaseParam build(java.util.Map<String, ?> map) throws Exception {
        ClusterBaseParam self = new ClusterBaseParam();
        return TeaModel.build(map, self);
    }

    public ClusterBaseParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ClusterBaseParam setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ClusterBaseParam setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public ClusterBaseParam setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ClusterBaseParam setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ClusterBaseParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
