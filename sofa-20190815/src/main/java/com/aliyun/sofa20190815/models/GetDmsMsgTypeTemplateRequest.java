// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDmsMsgTypeTemplateRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDmsMsgTypeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDmsMsgTypeTemplateRequest self = new GetDmsMsgTypeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetDmsMsgTypeTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
