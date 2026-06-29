// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTemplateQuestionsResponseBody extends TeaModel {
    /**
     * <p>Total amount of data under the current request conditions. This parameter is optional and does not need to be returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Details</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Details")
    public String details;

    /**
     * <p>error code</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Return message of the request</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>List of question configurations</p>
     */
    @NameInMap("QuestionConfigs")
    public java.util.List<QuestionPlugin> questionConfigs;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>90ABA848-AD74-1F6E-84BC-4182A7F1F29E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>is succeeded</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTemplateQuestionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateQuestionsResponseBody self = new GetTemplateQuestionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateQuestionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTemplateQuestionsResponseBody setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public GetTemplateQuestionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTemplateQuestionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTemplateQuestionsResponseBody setQuestionConfigs(java.util.List<QuestionPlugin> questionConfigs) {
        this.questionConfigs = questionConfigs;
        return this;
    }
    public java.util.List<QuestionPlugin> getQuestionConfigs() {
        return this.questionConfigs;
    }

    public GetTemplateQuestionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateQuestionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
