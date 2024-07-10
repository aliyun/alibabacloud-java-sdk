// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListInstancesMetricsOutput extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("metricsList")
    public java.util.List<InstanceMetricInfo> metricsList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListInstancesMetricsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesMetricsOutput self = new ListInstancesMetricsOutput();
        return TeaModel.build(map, self);
    }

    public ListInstancesMetricsOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesMetricsOutput setMetricsList(java.util.List<InstanceMetricInfo> metricsList) {
        this.metricsList = metricsList;
        return this;
    }
    public java.util.List<InstanceMetricInfo> getMetricsList() {
        return this.metricsList;
    }

    public ListInstancesMetricsOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesMetricsOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesMetricsOutput setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
