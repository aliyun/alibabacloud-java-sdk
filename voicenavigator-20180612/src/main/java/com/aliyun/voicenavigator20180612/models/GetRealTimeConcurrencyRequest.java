// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class GetRealTimeConcurrencyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c112c168ed664c0a851f9ca72d2f7999</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRealTimeConcurrencyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealTimeConcurrencyRequest self = new GetRealTimeConcurrencyRequest();
        return TeaModel.build(map, self);
    }

    public GetRealTimeConcurrencyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
