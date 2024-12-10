// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListQuotaWorkloadsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>42F23B58-3684-5443-848A-8DA81FF99712</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Workloads")
    public java.util.List<QueueInfo> workloads;

    public static ListQuotaWorkloadsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaWorkloadsResponseBody self = new ListQuotaWorkloadsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotaWorkloadsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQuotaWorkloadsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListQuotaWorkloadsResponseBody setWorkloads(java.util.List<QueueInfo> workloads) {
        this.workloads = workloads;
        return this;
    }
    public java.util.List<QueueInfo> getWorkloads() {
        return this.workloads;
    }

}
