// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteKubeNativeResourcesParam extends TeaModel {
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

    public static DeleteKubeNativeResourcesParam build(java.util.Map<String, ?> map) throws Exception {
        DeleteKubeNativeResourcesParam self = new DeleteKubeNativeResourcesParam();
        return TeaModel.build(map, self);
    }

    public DeleteKubeNativeResourcesParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteKubeNativeResourcesParam setFieldSelector(String fieldSelector) {
        this.fieldSelector = fieldSelector;
        return this;
    }
    public String getFieldSelector() {
        return this.fieldSelector;
    }

    public DeleteKubeNativeResourcesParam setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public String getLabelSelector() {
        return this.labelSelector;
    }

    public DeleteKubeNativeResourcesParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteKubeNativeResourcesParam setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteKubeNativeResourcesParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public DeleteKubeNativeResourcesParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public DeleteKubeNativeResourcesParam setResourceTypePlural(String resourceTypePlural) {
        this.resourceTypePlural = resourceTypePlural;
        return this;
    }
    public String getResourceTypePlural() {
        return this.resourceTypePlural;
    }

}
