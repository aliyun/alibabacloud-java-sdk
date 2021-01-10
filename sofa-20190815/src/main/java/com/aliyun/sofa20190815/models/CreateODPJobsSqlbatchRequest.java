// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateODPJobsSqlbatchRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobJsonStr")
    public String jobJsonStr;

    public static CreateODPJobsSqlbatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateODPJobsSqlbatchRequest self = new CreateODPJobsSqlbatchRequest();
        return TeaModel.build(map, self);
    }

    public CreateODPJobsSqlbatchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateODPJobsSqlbatchRequest setJobJsonStr(String jobJsonStr) {
        this.jobJsonStr = jobJsonStr;
        return this;
    }
    public String getJobJsonStr() {
        return this.jobJsonStr;
    }

}
