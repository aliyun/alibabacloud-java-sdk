// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceBaseInfoRequest extends TeaModel {
    /**
     * <p>The ID of the instance that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_138015630679****_BAAy1Hac</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsInstanceBaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceBaseInfoRequest self = new OnsInstanceBaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public OnsInstanceBaseInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
