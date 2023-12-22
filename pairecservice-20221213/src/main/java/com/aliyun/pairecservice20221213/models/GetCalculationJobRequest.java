// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetCalculationJobRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetCalculationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCalculationJobRequest self = new GetCalculationJobRequest();
        return TeaModel.build(map, self);
    }

    public GetCalculationJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
