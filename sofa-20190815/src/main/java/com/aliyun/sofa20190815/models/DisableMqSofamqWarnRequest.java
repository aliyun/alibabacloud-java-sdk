// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableMqSofamqWarnRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("WarnId")
    public Long warnId;

    public static DisableMqSofamqWarnRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableMqSofamqWarnRequest self = new DisableMqSofamqWarnRequest();
        return TeaModel.build(map, self);
    }

    public DisableMqSofamqWarnRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableMqSofamqWarnRequest setWarnId(Long warnId) {
        this.warnId = warnId;
        return this;
    }
    public Long getWarnId() {
        return this.warnId;
    }

}
