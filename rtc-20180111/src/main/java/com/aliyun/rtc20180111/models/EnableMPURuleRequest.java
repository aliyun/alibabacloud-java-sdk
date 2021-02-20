// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class EnableMPURuleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static EnableMPURuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMPURuleRequest self = new EnableMPURuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableMPURuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableMPURuleRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public EnableMPURuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public EnableMPURuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
