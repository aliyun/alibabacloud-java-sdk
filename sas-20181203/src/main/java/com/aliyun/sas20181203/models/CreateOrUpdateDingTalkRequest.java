// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateDingTalkRequest extends TeaModel {
    /**
     * <p>The alerts for which you want the chatbot to send notifications. The value is a JSON array that contains the following fields:</p>
     * <br>
     * <p>*   **type**: the types of alerts. The valid values are listed in the "Additional description of parameters" section in this topic.</p>
     * <br>
     * <p>*   **configItemList**: the list of check items. The value is a JSON array that contains the following fields:</p>
     * <br>
     * <p>    *   **key**: the key of the check item.</p>
     * <p>    *   **valueList**: the values of the check item. The value of valueList is a JSON array.</p>
     * <br>
     * <p>> For more information about the value of this parameter, see the "Addition description of parameters" section in this topic.</p>
     */
    @NameInMap("ConfigList")
    public String configList;

    /**
     * <p>The language of the notifications. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("DingTalkLang")
    public String dingTalkLang;

    /**
     * <p>The IDs of asset groups for which you want the chatbot to send notifications. The value is a JSON array.</p>
     * <br>
     * <p>> You can call the [DescribeGroupStruct](~~DescribeGroupStruct~~) operation to query the IDs of asset groups.</p>
     */
    @NameInMap("GroupIdList")
    public String groupIdList;

    /**
     * <p>The ID of the chatbot.</p>
     * <br>
     * <p>> You can call the [DescribeDingTalk](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-describedingtalk/?spm=a2c63.p38356.0.0.681e4360Qd1eb1) operation to query the IDs of chatbots.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The time interval at which the chatbot sends notifications.</p>
     * <br>
     * <p>> The value **0** indicates unlimited.</p>
     */
    @NameInMap("IntervalTime")
    public Long intervalTime;

    /**
     * <p>The name of the chatbot.</p>
     * <br>
     * <p>> The name of a chatbot must be 2 to 64 characters in length.</p>
     */
    @NameInMap("RuleActionName")
    public String ruleActionName;

    /**
     * <p>The webhook URL.</p>
     */
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
