// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListPodsRequest extends TeaModel {
    @NameInMap("DeployOrderId")
    public Long deployOrderId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResultList")
    public java.util.List<Integer> resultList;

    @NameInMap("StatusList")
    public java.util.List<Integer> statusList;

    public static ListPodsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPodsRequest self = new ListPodsRequest();
        return TeaModel.build(map, self);
    }

    public ListPodsRequest setDeployOrderId(Long deployOrderId) {
        this.deployOrderId = deployOrderId;
        return this;
    }
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

    public ListPodsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPodsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPodsRequest setResultList(java.util.List<Integer> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<Integer> getResultList() {
        return this.resultList;
    }

    public ListPodsRequest setStatusList(java.util.List<Integer> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<Integer> getStatusList() {
        return this.statusList;
    }

}
