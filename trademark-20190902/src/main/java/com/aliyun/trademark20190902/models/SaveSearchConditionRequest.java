// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SaveSearchConditionRequest extends TeaModel {
    @NameInMap("ConditionContent")
    public String conditionContent;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TagName")
    public String tagName;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("Umid")
    public String umid;

    public static SaveSearchConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSearchConditionRequest self = new SaveSearchConditionRequest();
        return TeaModel.build(map, self);
    }

    public SaveSearchConditionRequest setConditionContent(String conditionContent) {
        this.conditionContent = conditionContent;
        return this;
    }
    public String getConditionContent() {
        return this.conditionContent;
    }

    public SaveSearchConditionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SaveSearchConditionRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public SaveSearchConditionRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public SaveSearchConditionRequest setUmid(String umid) {
        this.umid = umid;
        return this;
    }
    public String getUmid() {
        return this.umid;
    }

}
