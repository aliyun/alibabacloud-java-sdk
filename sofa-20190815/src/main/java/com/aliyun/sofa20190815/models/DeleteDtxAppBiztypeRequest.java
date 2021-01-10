// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDtxAppBiztypeRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDtxAppBiztypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDtxAppBiztypeRequest self = new DeleteDtxAppBiztypeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDtxAppBiztypeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DeleteDtxAppBiztypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
