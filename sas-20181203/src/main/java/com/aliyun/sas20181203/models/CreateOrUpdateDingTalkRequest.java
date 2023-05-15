// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateDingTalkRequest extends TeaModel {
    @NameInMap("ConfigList")
    public String configList;

    @NameInMap("DingTalkLang")
    public String dingTalkLang;

    @NameInMap("GroupIdList")
    public String groupIdList;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IntervalTime")
    public Long intervalTime;

    @NameInMap("RuleActionName")
    public String ruleActionName;

    @NameInMap("SendUrl")
    public String sendUrl;

    public static CreateOrUpdateDingTalkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateDingTalkRequest self = new CreateOrUpdateDingTalkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateDingTalkRequest setConfigList(String configList) {
        this.configList = configList;
        return this;
    }
    public String getConfigList() {
        return this.configList;
    }

    public CreateOrUpdateDingTalkRequest setDingTalkLang(String dingTalkLang) {
        this.dingTalkLang = dingTalkLang;
        return this;
    }
    public String getDingTalkLang() {
        return this.dingTalkLang;
    }

    public CreateOrUpdateDingTalkRequest setGroupIdList(String groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }
    public String getGroupIdList() {
        return this.groupIdList;
    }

    public CreateOrUpdateDingTalkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateOrUpdateDingTalkRequest setIntervalTime(Long intervalTime) {
        this.intervalTime = intervalTime;
        return this;
    }
    public Long getIntervalTime() {
        return this.intervalTime;
    }

    public CreateOrUpdateDingTalkRequest setRuleActionName(String ruleActionName) {
        this.ruleActionName = ruleActionName;
        return this;
    }
    public String getRuleActionName() {
        return this.ruleActionName;
    }

    public CreateOrUpdateDingTalkRequest setSendUrl(String sendUrl) {
        this.sendUrl = sendUrl;
        return this;
    }
    public String getSendUrl() {
        return this.sendUrl;
    }

}
