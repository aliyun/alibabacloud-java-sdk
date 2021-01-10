// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveTSJobGroupJobsRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobIdList")
    public String jobIdList;

    public static RemoveTSJobGroupJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTSJobGroupJobsRequest self = new RemoveTSJobGroupJobsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTSJobGroupJobsRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public RemoveTSJobGroupJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveTSJobGroupJobsRequest setJobIdList(String jobIdList) {
        this.jobIdList = jobIdList;
        return this;
    }
    public String getJobIdList() {
        return this.jobIdList;
    }

}
