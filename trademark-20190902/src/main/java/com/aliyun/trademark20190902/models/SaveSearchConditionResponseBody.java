// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SaveSearchConditionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ConditionContent")
    public String conditionContent;

    @NameInMap("ConditionId")
    public Long conditionId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TagName")
    public String tagName;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("Umid")
    public String umid;

    @NameInMap("UserId")
    public Long userId;

    public static SaveSearchConditionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSearchConditionResponseBody self = new SaveSearchConditionResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSearchConditionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveSearchConditionResponseBody setConditionContent(String conditionContent) {
        this.conditionContent = conditionContent;
        return this;
    }
    public String getConditionContent() {
        return this.conditionContent;
    }

    public SaveSearchConditionResponseBody setConditionId(Long conditionId) {
        this.conditionId = conditionId;
        return this;
    }
    public Long getConditionId() {
        return this.conditionId;
    }

    public SaveSearchConditionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveSearchConditionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSearchConditionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SaveSearchConditionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveSearchConditionResponseBody setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public SaveSearchConditionResponseBody setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public SaveSearchConditionResponseBody setUmid(String umid) {
        this.umid = umid;
        return this;
    }
    public String getUmid() {
        return this.umid;
    }

    public SaveSearchConditionResponseBody setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
