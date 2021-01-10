// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsTaskMetricsRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDWSSubsTaskMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsTaskMetricsRequest self = new GetDWSSubsTaskMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsTaskMetricsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDWSSubsTaskMetricsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
