// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListComponentInstancesParam extends TeaModel {
    // applicationNameList
    @NameInMap("applicationNameList")
    public java.util.List<String> applicationNameList;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // componentNameList
    @NameInMap("componentNameList")
    public java.util.List<String> componentNameList;

    // componentStatusList
    @NameInMap("componentStatusList")
    public java.util.List<String> componentStatusList;

    // nodeIdList
    @NameInMap("nodeIdList")
    public java.util.List<String> nodeIdList;

    // nodeNameList
    @NameInMap("nodeNameList")
    public java.util.List<String> nodeNameList;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // pageNumber
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Integer pageSize;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static ListComponentInstancesParam build(java.util.Map<String, ?> map) throws Exception {
        ListComponentInstancesParam self = new ListComponentInstancesParam();
        return TeaModel.build(map, self);
    }

    public ListComponentInstancesParam setApplicationNameList(java.util.List<String> applicationNameList) {
        this.applicationNameList = applicationNameList;
        return this;
    }
    public java.util.List<String> getApplicationNameList() {
        return this.applicationNameList;
    }

    public ListComponentInstancesParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListComponentInstancesParam setComponentNameList(java.util.List<String> componentNameList) {
        this.componentNameList = componentNameList;
        return this;
    }
    public java.util.List<String> getComponentNameList() {
        return this.componentNameList;
    }

    public ListComponentInstancesParam setComponentStatusList(java.util.List<String> componentStatusList) {
        this.componentStatusList = componentStatusList;
        return this;
    }
    public java.util.List<String> getComponentStatusList() {
        return this.componentStatusList;
    }

    public ListComponentInstancesParam setNodeIdList(java.util.List<String> nodeIdList) {
        this.nodeIdList = nodeIdList;
        return this;
    }
    public java.util.List<String> getNodeIdList() {
        return this.nodeIdList;
    }

    public ListComponentInstancesParam setNodeNameList(java.util.List<String> nodeNameList) {
        this.nodeNameList = nodeNameList;
        return this;
    }
    public java.util.List<String> getNodeNameList() {
        return this.nodeNameList;
    }

    public ListComponentInstancesParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListComponentInstancesParam setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListComponentInstancesParam setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListComponentInstancesParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
