// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetRealtimeConcurrencyReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>85bf7efa-a07c-498a-850e-99a5849b8589</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>c62e6789-28a8-41db-941e-171a01d3b3b9</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetRealtimeConcurrencyReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeConcurrencyReportRequest self = new GetRealtimeConcurrencyReportRequest();
        return TeaModel.build(map, self);
    }

    public GetRealtimeConcurrencyReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRealtimeConcurrencyReportRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public GetRealtimeConcurrencyReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetRealtimeConcurrencyReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
