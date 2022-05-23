// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowProductListRequest extends TeaModel {
    // 用户编号
    @NameInMap("AliUid")
    public Long aliUid;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetFreeFlowProductListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowProductListRequest self = new GetFreeFlowProductListRequest();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowProductListRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetFreeFlowProductListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
