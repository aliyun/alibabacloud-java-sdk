// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsStatsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDWSSubsStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsStatsRequest self = new GetDWSSubsStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsStatsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
