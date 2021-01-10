// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeTTSConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeTTSConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTTSConfigRequest self = new DescribeTTSConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTTSConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
