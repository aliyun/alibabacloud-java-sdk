// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateRecommendEventRuleRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("eventName")
    public String eventName;

    @NameInMap("recommendRuleIdsStr")
    public String recommendRuleIdsStr;

    @NameInMap("regId")
    public String regId;

    @NameInMap("taskId")
    public Long taskId;

    public static CreateRecommendEventRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecommendEventRuleRequest self = new CreateRecommendEventRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecommendEventRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateRecommendEventRuleRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public CreateRecommendEventRuleRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public CreateRecommendEventRuleRequest setRecommendRuleIdsStr(String recommendRuleIdsStr) {
        this.recommendRuleIdsStr = recommendRuleIdsStr;
        return this;
    }
    public String getRecommendRuleIdsStr() {
        return this.recommendRuleIdsStr;
    }

    public CreateRecommendEventRuleRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateRecommendEventRuleRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
