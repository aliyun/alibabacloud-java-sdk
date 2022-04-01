// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListKubeNativeResourcesParam extends TeaModel {
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

    // resourceTypePlural
    @NameInMap("resourceTypePlural")
    public String resourceTypePlural;

    public static ListKubeNativeResourcesParam build(java.util.Map<String, ?> map) throws Exception {
        ListKubeNativeResourcesParam self = new ListKubeNativeResourcesParam();
        return TeaModel.build(map, self);
    }

    public ListKubeNativeResourcesParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListKubeNativeResourcesParam setFieldSelector(String fieldSelector) {
        this.fieldSelector = fieldSelector;
        return this;
    }
    public String getFieldSelector() {
        return this.fieldSelector;
    }

    public ListKubeNativeResourcesParam setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public String getLabelSelector() {
        return this.labelSelector;
    }

    public ListKubeNativeResourcesParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListKubeNativeResourcesParam setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListKubeNativeResourcesParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListKubeNativeResourcesParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListKubeNativeResourcesParam setResourceTypePlural(String resourceTypePlural) {
        this.resourceTypePlural = resourceTypePlural;
        return this;
    }
    public String getResourceTypePlural() {
        return this.resourceTypePlural;
    }

}
