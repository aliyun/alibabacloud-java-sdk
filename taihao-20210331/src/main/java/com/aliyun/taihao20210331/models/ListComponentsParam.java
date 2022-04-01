// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListComponentsParam extends TeaModel {
    // applicationNameList
    @NameInMap("applicationNameList")
    public java.util.List<String> applicationNameList;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // componentNameList
    @NameInMap("componentNameList")
    public java.util.List<String> componentNameList;

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

    public static ListComponentsParam build(java.util.Map<String, ?> map) throws Exception {
        ListComponentsParam self = new ListComponentsParam();
        return TeaModel.build(map, self);
    }

    public ListComponentsParam setApplicationNameList(java.util.List<String> applicationNameList) {
        this.applicationNameList = applicationNameList;
        return this;
    }
    public java.util.List<String> getApplicationNameList() {
        return this.applicationNameList;
    }

    public ListComponentsParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListComponentsParam setComponentNameList(java.util.List<String> componentNameList) {
        this.componentNameList = componentNameList;
        return this;
    }
    public java.util.List<String> getComponentNameList() {
        return this.componentNameList;
    }

    public ListComponentsParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListComponentsParam setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListComponentsParam setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListComponentsParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
