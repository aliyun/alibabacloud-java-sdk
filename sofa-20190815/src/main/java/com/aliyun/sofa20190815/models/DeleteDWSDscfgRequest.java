// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDWSDscfgRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDWSDscfgRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDWSDscfgRequest self = new DeleteDWSDscfgRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDWSDscfgRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteDWSDscfgRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
