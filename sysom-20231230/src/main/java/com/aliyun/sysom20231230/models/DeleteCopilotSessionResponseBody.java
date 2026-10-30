// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class DeleteCopilotSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public DeleteCopilotSessionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5BC79EF5-798B-5499-9683-4E14EBBBF712</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteCopilotSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCopilotSessionResponseBody self = new DeleteCopilotSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCopilotSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteCopilotSessionResponseBody setData(DeleteCopilotSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteCopilotSessionResponseBodyData getData() {
        return this.data;
    }

    public DeleteCopilotSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteCopilotSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteCopilotSessionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("deleted")
        public Boolean deleted;

        /**
         * <strong>example:</strong>
         * <p>c356bc310e4345c3a602a2912322ad21</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        public static DeleteCopilotSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteCopilotSessionResponseBodyData self = new DeleteCopilotSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteCopilotSessionResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public DeleteCopilotSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
