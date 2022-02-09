// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class MergeInstanceDataRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static MergeInstanceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeInstanceDataRequest self = new MergeInstanceDataRequest();
        return TeaModel.build(map, self);
    }

    public MergeInstanceDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
