// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    // 实例列表
    @NameInMap("Instances")
    public java.util.List<Instance> instances;

    // 当前页
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 每页返回的实例数
    @NameInMap("PageSize")
    public Long pageSize;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 符合条件的实例数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setInstances(java.util.List<Instance> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<Instance> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
