// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobAppsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InvokeType")
    public String invokeType;

    @NameInMap("TriggerType")
    public String triggerType;

    public static QueryTSJobAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobAppsRequest self = new QueryTSJobAppsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSJobAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSJobAppsRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public QueryTSJobAppsRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
