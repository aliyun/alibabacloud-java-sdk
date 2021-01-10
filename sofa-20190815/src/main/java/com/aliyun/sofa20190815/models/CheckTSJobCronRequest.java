// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckTSJobCronRequest extends TeaModel {
    @NameInMap("Cron")
    public String cron;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CheckTSJobCronRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckTSJobCronRequest self = new CheckTSJobCronRequest();
        return TeaModel.build(map, self);
    }

    public CheckTSJobCronRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public CheckTSJobCronRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
