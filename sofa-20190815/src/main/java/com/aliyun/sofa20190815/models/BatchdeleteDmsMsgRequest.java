// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchdeleteDmsMsgRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static BatchdeleteDmsMsgRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteDmsMsgRequest self = new BatchdeleteDmsMsgRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteDmsMsgRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BatchdeleteDmsMsgRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
