// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDTXAppsBiztypeRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDTXAppsBiztypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDTXAppsBiztypeRequest self = new DeleteDTXAppsBiztypeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDTXAppsBiztypeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DeleteDTXAppsBiztypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
