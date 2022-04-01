// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListKubeCustomerResourcesParam extends TeaModel {
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

    // fieldSelector
    @NameInMap("fieldSelector")
    public String fieldSelector;

    // labelSelector
    @NameInMap("labelSelector")
    public String labelSelector;

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

    public static ListKubeCustomerResourcesParam build(java.util.Map<String, ?> map) throws Exception {
        ListKubeCustomerResourcesParam self = new ListKubeCustomerResourcesParam();
        return TeaModel.build(map, self);
    }

    public ListKubeCustomerResourcesParam setApiGroup(String apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }
    public String getApiGroup() {
        return this.apiGroup;
    }

    public ListKubeCustomerResourcesParam setApiPlural(String apiPlural) {
        this.apiPlural = apiPlural;
        return this;
    }
    public String getApiPlural() {
        return this.apiPlural;
    }

    public ListKubeCustomerResourcesParam setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ListKubeCustomerResourcesParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListKubeCustomerResourcesParam setFieldSelector(String fieldSelector) {
        this.fieldSelector = fieldSelector;
        return this;
    }
    public String getFieldSelector() {
        return this.fieldSelector;
    }

    public ListKubeCustomerResourcesParam setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public String getLabelSelector() {
        return this.labelSelector;
    }

    public ListKubeCustomerResourcesParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListKubeCustomerResourcesParam setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListKubeCustomerResourcesParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListKubeCustomerResourcesParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
