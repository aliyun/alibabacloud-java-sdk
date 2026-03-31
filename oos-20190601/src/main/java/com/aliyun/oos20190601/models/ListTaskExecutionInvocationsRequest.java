// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTaskExecutionInvocationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>exec-a10749813b3xxxxx.t0001</p>
     */
    @NameInMap("TaskExecutionId")
    public String taskExecutionId;

    public static ListTaskExecutionInvocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskExecutionInvocationsRequest self = new ListTaskExecutionInvocationsRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskExecutionInvocationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTaskExecutionInvocationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTaskExecutionInvocationsRequest setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
        return this;
    }
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

}
