// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClustersParam extends TeaModel {
    // clusterIdList
    @NameInMap("clusterIdList")
    public java.util.List<String> clusterIdList;

    // clusterName
    @NameInMap("clusterName")
    public String clusterName;

    // clusterTypes
    @NameInMap("clusterTypes")
    public java.util.List<String> clusterTypes;

    // iaaSTypes
    @NameInMap("iaaSTypes")
    public java.util.List<String> iaaSTypes;

    // pageSize
    @NameInMap("maxResults")
    public Integer maxResults;

    // pageNumber
    @NameInMap("nextToken")
    public String nextToken;

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

    // paymentTypeList
    @NameInMap("paymentTypeList")
    public java.util.List<String> paymentTypeList;

    // queryEndTime
    @NameInMap("queryEndTime")
    public Long queryEndTime;

    // queryStartTime
    @NameInMap("queryStartTime")
    public Long queryStartTime;

    // resourceGroupIds
    @NameInMap("resourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // sort
    @NameInMap("sort")
    public String sort;

    // statusList
    @NameInMap("statusList")
    public java.util.List<String> statusList;

    public static ListClustersParam build(java.util.Map<String, ?> map) throws Exception {
        ListClustersParam self = new ListClustersParam();
        return TeaModel.build(map, self);
    }

    public ListClustersParam setClusterIdList(java.util.List<String> clusterIdList) {
        this.clusterIdList = clusterIdList;
        return this;
    }
    public java.util.List<String> getClusterIdList() {
        return this.clusterIdList;
    }

    public ListClustersParam setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ListClustersParam setClusterTypes(java.util.List<String> clusterTypes) {
        this.clusterTypes = clusterTypes;
        return this;
    }
    public java.util.List<String> getClusterTypes() {
        return this.clusterTypes;
    }

    public ListClustersParam setIaaSTypes(java.util.List<String> iaaSTypes) {
        this.iaaSTypes = iaaSTypes;
        return this;
    }
    public java.util.List<String> getIaaSTypes() {
        return this.iaaSTypes;
    }

    public ListClustersParam setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListClustersParam setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListClustersParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListClustersParam setOrderBy(java.util.List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public java.util.List<String> getOrderBy() {
        return this.orderBy;
    }

    public ListClustersParam setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClustersParam setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClustersParam setPaymentTypeList(java.util.List<String> paymentTypeList) {
        this.paymentTypeList = paymentTypeList;
        return this;
    }
    public java.util.List<String> getPaymentTypeList() {
        return this.paymentTypeList;
    }

    public ListClustersParam setQueryEndTime(Long queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }
    public Long getQueryEndTime() {
        return this.queryEndTime;
    }

    public ListClustersParam setQueryStartTime(Long queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }
    public Long getQueryStartTime() {
        return this.queryStartTime;
    }

    public ListClustersParam setResourceGroupIds(java.util.List<String> resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public ListClustersParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListClustersParam setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListClustersParam setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}
