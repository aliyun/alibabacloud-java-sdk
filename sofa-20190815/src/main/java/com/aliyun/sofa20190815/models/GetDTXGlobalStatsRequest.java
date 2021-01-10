// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXGlobalStatsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDTXGlobalStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDTXGlobalStatsRequest self = new GetDTXGlobalStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetDTXGlobalStatsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
