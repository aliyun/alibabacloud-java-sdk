// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetSampleConsistencyJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetSampleConsistencyJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSampleConsistencyJobRequest self = new GetSampleConsistencyJobRequest();
        return TeaModel.build(map, self);
    }

    public GetSampleConsistencyJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
