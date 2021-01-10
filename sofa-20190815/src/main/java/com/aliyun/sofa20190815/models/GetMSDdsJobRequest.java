// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMSDdsJobRequest extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetMSDdsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMSDdsJobRequest self = new GetMSDdsJobRequest();
        return TeaModel.build(map, self);
    }

    public GetMSDdsJobRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public GetMSDdsJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
