// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMqSofamqWarnRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("WarnId")
    public Long warnId;

    public static EnableMqSofamqWarnRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMqSofamqWarnRequest self = new EnableMqSofamqWarnRequest();
        return TeaModel.build(map, self);
    }

    public EnableMqSofamqWarnRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableMqSofamqWarnRequest setWarnId(Long warnId) {
        this.warnId = warnId;
        return this;
    }
    public Long getWarnId() {
        return this.warnId;
    }

}
