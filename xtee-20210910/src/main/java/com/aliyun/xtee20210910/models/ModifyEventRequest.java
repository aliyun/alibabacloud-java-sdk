// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyEventRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Version number (latest).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("bizVersion")
    public Integer bizVersion;

    /**
     * <p>Creation type</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <p>Event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_ambiby3420</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Event name.</p>
     * 
     * <strong>example:</strong>
     * <p>注册事件</p>
     */
    @NameInMap("eventName")
    public String eventName;

    /**
     * <p>Input parameters, JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;fieldCode\&quot;:\&quot;sessionId\&quot;,\&quot;description\&quot;:\&quot;会话ID\&quot;,\&quot;fieldRank\&quot;:0,\&quot;title\&quot;:\&quot;会话ID\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;,\&quot;fieldSource\&quot;:\&quot;DEFAULT\&quot;},{\&quot;fieldCode\&quot;:\&quot;tags\&quot;,\&quot;fieldRank\&quot;:1,\&quot;title\&quot;:\&quot;风险标签\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;,\&quot;fieldSource\&quot;:\&quot;DEFAULT\&quot;},{\&quot;fieldCode\&quot;:\&quot;score\&quot;,\&quot;fieldRank\&quot;:2,\&quot;title\&quot;:\&quot;风险分值\&quot;,\&quot;fieldType\&quot;:\&quot;DOUBLE\&quot;,\&quot;fieldSource\&quot;:\&quot;DEFAULT\&quot;},{\&quot;fieldCode\&quot;:\&quot;hitRules\&quot;,\&quot;fieldRank\&quot;:3,\&quot;title\&quot;:\&quot;命中策略\&quot;,\&quot;fieldType\&quot;:\&quot;STRING\&quot;,\&quot;fieldSource\&quot;:\&quot;DEFAULT\&quot;}]</p>
     */
    @NameInMap("inputFieldsStr")
    public String inputFieldsStr;

    /**
     * <p>Memo.</p>
     * 
     * <strong>example:</strong>
     * <p>备注</p>
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
     * <p>Template type</p>
     * 
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("templateType")
    public String templateType;

    public static ModifyEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventRequest self = new ModifyEventRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyEventRequest setBizVersion(Integer bizVersion) {
        this.bizVersion = bizVersion;
        return this;
    }
    public Integer getBizVersion() {
        return this.bizVersion;
    }

    public ModifyEventRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public ModifyEventRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public ModifyEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public ModifyEventRequest setInputFieldsStr(String inputFieldsStr) {
        this.inputFieldsStr = inputFieldsStr;
        return this;
    }
    public String getInputFieldsStr() {
        return this.inputFieldsStr;
    }

    public ModifyEventRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ModifyEventRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ModifyEventRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
