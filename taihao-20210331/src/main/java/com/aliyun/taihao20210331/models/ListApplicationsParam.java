// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListApplicationsParam extends TeaModel {
    // applicationNameList
    @NameInMap("applicationNameList")
    public java.util.List<String> applicationNameList;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // orderBy
    @NameInMap("orderBy")
    public java.util.List<String> orderBy;

    // pageNumber
    @NameInMap("pageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Long pageSize;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // sort
    @NameInMap("sort")
    public String sort;

    public static ListApplicationsParam build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsParam self = new ListApplicationsParam();
        return TeaModel.build(map, self);
    }

    public ListApplicationsParam setApplicationNameList(java.util.List<String> applicationNameList) {
        this.applicationNameList = applicationNameList;
        return this;
    }
    public java.util.List<String> getApplicationNameList() {
        return this.applicationNameList;
    }

    public ListApplicationsParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListApplicationsParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListApplicationsParam setOrderBy(java.util.List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public java.util.List<String> getOrderBy() {
        return this.orderBy;
    }

    public ListApplicationsParam setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationsParam setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApplicationsParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListApplicationsParam setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
