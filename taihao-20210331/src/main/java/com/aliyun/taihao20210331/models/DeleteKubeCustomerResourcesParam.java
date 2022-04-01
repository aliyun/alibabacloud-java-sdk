// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteKubeCustomerResourcesParam extends TeaModel {
    // apiGroup
    @NameInMap("apiGroup")
    public String apiGroup;

    // apiPlural
    @NameInMap("apiPlural")
    public String apiPlural;

    // apiVersion
    @NameInMap("apiVersion")
    public String apiVersion;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // name
    @NameInMap("name")
    public String name;

    // namespace
    @NameInMap("namespace")
    public String namespace;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static DeleteKubeCustomerResourcesParam build(java.util.Map<String, ?> map) throws Exception {
        DeleteKubeCustomerResourcesParam self = new DeleteKubeCustomerResourcesParam();
        return TeaModel.build(map, self);
    }

    public DeleteKubeCustomerResourcesParam setApiGroup(String apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }
    public String getApiGroup() {
        return this.apiGroup;
    }

    public DeleteKubeCustomerResourcesParam setApiPlural(String apiPlural) {
        this.apiPlural = apiPlural;
        return this;
    }
    public String getApiPlural() {
        return this.apiPlural;
    }

    public DeleteKubeCustomerResourcesParam setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public DeleteKubeCustomerResourcesParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteKubeCustomerResourcesParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteKubeCustomerResourcesParam setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteKubeCustomerResourcesParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public DeleteKubeCustomerResourcesParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
