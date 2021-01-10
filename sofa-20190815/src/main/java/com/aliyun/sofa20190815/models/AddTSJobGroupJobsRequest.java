// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddTSJobGroupJobsRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobIdList")
    public String jobIdList;

    public static AddTSJobGroupJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTSJobGroupJobsRequest self = new AddTSJobGroupJobsRequest();
        return TeaModel.build(map, self);
    }

    public AddTSJobGroupJobsRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public AddTSJobGroupJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddTSJobGroupJobsRequest setJobIdList(String jobIdList) {
        this.jobIdList = jobIdList;
        return this;
    }
    public String getJobIdList() {
        return this.jobIdList;
    }

}
