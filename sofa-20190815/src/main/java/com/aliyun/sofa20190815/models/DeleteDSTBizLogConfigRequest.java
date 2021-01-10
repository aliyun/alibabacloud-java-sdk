// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDSTBizLogConfigRequest extends TeaModel {
    @NameInMap("BizLogConfigId")
    public Long bizLogConfigId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDSTBizLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDSTBizLogConfigRequest self = new DeleteDSTBizLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDSTBizLogConfigRequest setBizLogConfigId(Long bizLogConfigId) {
        this.bizLogConfigId = bizLogConfigId;
        return this;
    }
    public Long getBizLogConfigId() {
        return this.bizLogConfigId;
    }

    public DeleteDSTBizLogConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
