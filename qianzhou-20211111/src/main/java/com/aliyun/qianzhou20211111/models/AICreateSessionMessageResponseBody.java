// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class AICreateSessionMessageResponseBody extends TeaModel {
    @NameInMap("answer")
    public String answer;

    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public String data;

    @NameInMap("msg")
    public String msg;

    @NameInMap("reference")
    public java.util.List<AICreateSessionMessageResponseBodyReference> reference;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("session_id")
    public String sessionId;

    public static AICreateSessionMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AICreateSessionMessageResponseBody self = new AICreateSessionMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public AICreateSessionMessageResponseBody setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public AICreateSessionMessageResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AICreateSessionMessageResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AICreateSessionMessageResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AICreateSessionMessageResponseBody setReference(java.util.List<AICreateSessionMessageResponseBodyReference> reference) {
        this.reference = reference;
        return this;
    }
    public java.util.List<AICreateSessionMessageResponseBodyReference> getReference() {
        return this.reference;
    }

    public AICreateSessionMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AICreateSessionMessageResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class AICreateSessionMessageResponseBodyReference extends TeaModel {
        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        public static AICreateSessionMessageResponseBodyReference build(java.util.Map<String, ?> map) throws Exception {
            AICreateSessionMessageResponseBodyReference self = new AICreateSessionMessageResponseBodyReference();
            return TeaModel.build(map, self);
        }

        public AICreateSessionMessageResponseBodyReference setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public AICreateSessionMessageResponseBodyReference setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
