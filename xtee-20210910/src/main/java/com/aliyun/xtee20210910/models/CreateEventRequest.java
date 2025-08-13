// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateEventRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Creation type</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <p>Event name.</p>
     * 
     * <strong>example:</strong>
     * <p>登录事件</p>
     */
    @NameInMap("eventName")
    public String eventName;

    /**
     * <p>Input parameters, JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;fieldCode&quot;:&quot;accountId&quot;,&quot;description&quot;:&quot;用户的账户ID，唯一标识一个账户的id&quot;,&quot;fieldRank&quot;:1,&quot;title&quot;:&quot;账户ID&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;hitRules&quot;,&quot;fieldRank&quot;:2,&quot;title&quot;:&quot;命中策略&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;age&quot;,&quot;description&quot;:&quot;&quot;,&quot;fieldRank&quot;:3,&quot;title&quot;:&quot;年龄&quot;,&quot;fieldType&quot;:&quot;INT&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;ip&quot;,&quot;description&quot;:&quot;IP地址&quot;,&quot;fieldRank&quot;:4,&quot;title&quot;:&quot;IP地址&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;tags&quot;,&quot;fieldRank&quot;:5,&quot;title&quot;:&quot;风险标签&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;score&quot;,&quot;fieldRank&quot;:6,&quot;title&quot;:&quot;风险分值&quot;,&quot;fieldType&quot;:&quot;DOUBLE&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;hitList&quot;,&quot;fieldRank&quot;:7}]</p>
     */
    @NameInMap("inputFieldsStr")
    public String inputFieldsStr;

    /**
     * <p>Memo information</p>
     * 
     * <strong>example:</strong>
     * <p>登录事件描述</p>
     */
    @NameInMap("memo")
    public String memo;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Input field template type</p>
     * 
     * <strong>example:</strong>
     * <p>register</p>
     */
    @NameInMap("templateCode")
    public String templateCode;

    /**
     * <p>Published template name.</p>
     * 
     * <strong>example:</strong>
     * <p>注册事件模版</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>Template type.</p>
     * 
     * <strong>example:</strong>
     * <p>TASK</p>
     */
    @NameInMap("templateType")
    public String templateType;

    public static CreateEventRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventRequest self = new CreateEventRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateEventRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public CreateEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public CreateEventRequest setInputFieldsStr(String inputFieldsStr) {
        this.inputFieldsStr = inputFieldsStr;
        return this;
    }
    public String getInputFieldsStr() {
        return this.inputFieldsStr;
    }

    public CreateEventRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateEventRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateEventRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public CreateEventRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateEventRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
