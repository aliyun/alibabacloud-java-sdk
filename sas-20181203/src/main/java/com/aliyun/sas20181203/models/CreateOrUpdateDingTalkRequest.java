// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateDingTalkRequest extends TeaModel {
    /**
     * <p>The alerts for which you want the chatbot to send notifications. The value is a JSON array that contains the following fields:</p>
     * <ul>
     * <li><p><strong>type</strong>: the types of alerts. The valid values are listed in the &quot;Additional description of parameters&quot; section in this topic.</p>
     * </li>
     * <li><p><strong>configItemList</strong>: the list of check items. The value is a JSON array that contains the following fields:</p>
     * <ul>
     * <li><strong>key</strong>: the key of the check item.</li>
     * <li><strong>valueList</strong>: the values of the check item. The value of valueList is a JSON array.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about the value of this parameter, see the &quot;Addition description of parameters&quot; section in this topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;sas_analysis_online-sas-operation-log-sas-event-suspicious&quot;,&quot;configItemList&quot;:[{&quot;key&quot;:&quot;item_level&quot;,&quot;valueList&quot;:[&quot;all&quot;]},{&quot;key&quot;:&quot;event_type&quot;,&quot;valueList&quot;:[&quot;all&quot;]}]}]</p>
     */
    @NameInMap("ConfigList")
    public String configList;

    /**
     * <p>The language of the notifications. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("DingTalkLang")
    public String dingTalkLang;

    /**
     * <p>The IDs of asset groups for which you want the chatbot to send notifications. The value is a JSON array.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupStruct~~">DescribeGroupStruct</a> operation to query the IDs of asset groups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;10417151&quot;]</p>
     */
    @NameInMap("GroupIdList")
    public String groupIdList;

    /**
     * <p>The ID of the chatbot.</p>
     * <blockquote>
     * <p>You can call the <a href="https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-describedingtalk/?spm=a2c63.p38356.0.0.681e4360Qd1eb1">DescribeDingTalk</a> operation to query the IDs of chatbots.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1589</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The time interval at which the chatbot sends notifications.</p>
     * <blockquote>
     * <p>The value <strong>0</strong> indicates unlimited.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IntervalTime")
    public Long intervalTime;

    /**
     * <p>The name of the chatbot.</p>
     * <blockquote>
     * <p>The name of a chatbot must be 2 to 64 characters in length.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testNotify</p>
     */
    @NameInMap("RuleActionName")
    public String ruleActionName;

    /**
     * <p>The webhook URL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=XXX">https://oapi.dingtalk.com/robot/send?access_token=XXX</a></p>
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
