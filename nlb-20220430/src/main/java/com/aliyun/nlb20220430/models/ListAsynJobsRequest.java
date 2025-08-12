// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListAsynJobsRequest extends TeaModel {
    /**
     * <p>The task IDs.</p>
     */
    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    public static ListAsynJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAsynJobsRequest self = new ListAsynJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListAsynJobsRequest setJobIds(java.util.List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

}
