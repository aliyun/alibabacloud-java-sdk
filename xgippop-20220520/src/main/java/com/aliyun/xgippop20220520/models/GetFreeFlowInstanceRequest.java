// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowInstanceRequest extends TeaModel {
    @NameInMap("Aliuid")
    public Long aliuid;

    // 应用ID
    @NameInMap("AppId")
    public String appId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ItemCode")
    public String itemCode;

    public static GetFreeFlowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowInstanceRequest self = new GetFreeFlowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowInstanceRequest setAliuid(Long aliuid) {
        this.aliuid = aliuid;
        return this;
    }
    public Long getAliuid() {
        return this.aliuid;
    }

    public GetFreeFlowInstanceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetFreeFlowInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetFreeFlowInstanceRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

}
