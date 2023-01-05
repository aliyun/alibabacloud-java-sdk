// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyGlobalQuestionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DialogueQuestionId")
    public String dialogueQuestionId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyGlobalQuestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalQuestionResponseBody self = new ModifyGlobalQuestionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalQuestionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyGlobalQuestionResponseBody setDialogueQuestionId(String dialogueQuestionId) {
        this.dialogueQuestionId = dialogueQuestionId;
        return this;
    }
    public String getDialogueQuestionId() {
        return this.dialogueQuestionId;
    }

    public ModifyGlobalQuestionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyGlobalQuestionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyGlobalQuestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyGlobalQuestionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
