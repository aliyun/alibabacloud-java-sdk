// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsAlertRuleSubscribeRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("MonitorTargetType")
    public String monitorTargetType;

    @NameInMap("SubscriptionTargetId")
    public String subscriptionTargetId;

    @NameInMap("SubscriptionTargetType")
    public String subscriptionTargetType;

    public static DeleteRmsAlertRuleSubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsAlertRuleSubscribeRequest self = new DeleteRmsAlertRuleSubscribeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRmsAlertRuleSubscribeRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public DeleteRmsAlertRuleSubscribeRequest setMonitorTargetType(String monitorTargetType) {
        this.monitorTargetType = monitorTargetType;
        return this;
    }
    public String getMonitorTargetType() {
        return this.monitorTargetType;
    }

    public DeleteRmsAlertRuleSubscribeRequest setSubscriptionTargetId(String subscriptionTargetId) {
        this.subscriptionTargetId = subscriptionTargetId;
        return this;
    }
    public String getSubscriptionTargetId() {
        return this.subscriptionTargetId;
    }

    public DeleteRmsAlertRuleSubscribeRequest setSubscriptionTargetType(String subscriptionTargetType) {
        this.subscriptionTargetType = subscriptionTargetType;
        return this;
    }
    public String getSubscriptionTargetType() {
        return this.subscriptionTargetType;
    }

}
