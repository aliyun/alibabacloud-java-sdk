// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobsByGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>NoAnswer</p>
     */
    @NameInMap("JobFailureReason")
    public String jobFailureReason;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de48407d-309e-451a-81ec-6fb11f8fdbf3</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("JobStatus")
    public String jobStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListJobsByGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsByGroupRequest self = new ListJobsByGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsByGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListJobsByGroupRequest setJobFailureReason(String jobFailureReason) {
        this.jobFailureReason = jobFailureReason;
        return this;
    }
    public String getJobFailureReason() {
        return this.jobFailureReason;
    }

    public ListJobsByGroupRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public ListJobsByGroupRequest setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public ListJobsByGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsByGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
