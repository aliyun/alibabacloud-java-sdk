// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DialogueResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Feedback")
    public DialogueResponseBodyFeedback feedback;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DialogueResponseBody self = new DialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public DialogueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DialogueResponseBody setFeedback(DialogueResponseBodyFeedback feedback) {
        this.feedback = feedback;
        return this;
    }
    public DialogueResponseBodyFeedback getFeedback() {
        return this.feedback;
    }

    public DialogueResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DialogueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DialogueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DialogueResponseBodyFeedback extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>broadcast</p>
         */
        @NameInMap("Action")
        public String action;

        @NameInMap("ActionParams")
        public String actionParams;

        @NameInMap("Content")
        public String content;

        /**
         * <p>已废弃</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("ContentParams")
        public String contentParams;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Interruptible")
        public Boolean interruptible;

        public static DialogueResponseBodyFeedback build(java.util.Map<String, ?> map) throws Exception {
            DialogueResponseBodyFeedback self = new DialogueResponseBodyFeedback();
            return TeaModel.build(map, self);
        }

        public DialogueResponseBodyFeedback setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DialogueResponseBodyFeedback setActionParams(String actionParams) {
            this.actionParams = actionParams;
            return this;
        }
        public String getActionParams() {
            return this.actionParams;
        }

        public DialogueResponseBodyFeedback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DialogueResponseBodyFeedback setContentParams(String contentParams) {
            this.contentParams = contentParams;
            return this;
        }
        public String getContentParams() {
            return this.contentParams;
        }

        public DialogueResponseBodyFeedback setInterruptible(Boolean interruptible) {
            this.interruptible = interruptible;
            return this;
        }
        public Boolean getInterruptible() {
            return this.interruptible;
        }

    }

}
