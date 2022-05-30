// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowUsageStatisticRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Month")
    public Long month;

    public static GetFreeFlowUsageStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowUsageStatisticRequest self = new GetFreeFlowUsageStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowUsageStatisticRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetFreeFlowUsageStatisticRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetFreeFlowUsageStatisticRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetFreeFlowUsageStatisticRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetFreeFlowUsageStatisticRequest setMonth(Long month) {
        this.month = month;
        return this;
    }
    public Long getMonth() {
        return this.month;
    }

}
