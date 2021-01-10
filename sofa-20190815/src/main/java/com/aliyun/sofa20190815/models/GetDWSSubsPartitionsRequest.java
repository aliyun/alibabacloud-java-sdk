// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsPartitionsRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDWSSubsPartitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsPartitionsRequest self = new GetDWSSubsPartitionsRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsPartitionsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDWSSubsPartitionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
