// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMqSofamqWarnRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("WarnId")
    public Long warnId;

    public static DeleteMqSofamqWarnRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqSofamqWarnRequest self = new DeleteMqSofamqWarnRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMqSofamqWarnRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteMqSofamqWarnRequest setWarnId(Long warnId) {
        this.warnId = warnId;
        return this;
    }
    public Long getWarnId() {
        return this.warnId;
    }

}
