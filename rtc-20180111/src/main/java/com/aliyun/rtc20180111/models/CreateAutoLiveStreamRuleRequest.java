// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAutoLiveStreamRuleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("PlayDomain")
    public String playDomain;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("CallBack")
    public String callBack;

    public static CreateAutoLiveStreamRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoLiveStreamRuleRequest self = new CreateAutoLiveStreamRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoLiveStreamRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAutoLiveStreamRuleRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public CreateAutoLiveStreamRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAutoLiveStreamRuleRequest setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public CreateAutoLiveStreamRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateAutoLiveStreamRuleRequest setCallBack(String callBack) {
        this.callBack = callBack;
        return this;
    }
    public String getCallBack() {
        return this.callBack;
    }

}
