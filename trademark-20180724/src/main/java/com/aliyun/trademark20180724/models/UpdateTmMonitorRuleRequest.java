// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateTmMonitorRuleRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("NotifyStatus")
    public java.util.List<Integer> notifyStatus;

    @NameInMap("RuleName")
    public String ruleName;

    public static UpdateTmMonitorRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTmMonitorRuleRequest self = new UpdateTmMonitorRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTmMonitorRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateTmMonitorRuleRequest setNotifyStatus(java.util.List<Integer> notifyStatus) {
        this.notifyStatus = notifyStatus;
        return this;
    }
    public java.util.List<Integer> getNotifyStatus() {
        return this.notifyStatus;
    }

    public UpdateTmMonitorRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
