// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMSDdsJobRequest extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteMSDdsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMSDdsJobRequest self = new DeleteMSDdsJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMSDdsJobRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public DeleteMSDdsJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
