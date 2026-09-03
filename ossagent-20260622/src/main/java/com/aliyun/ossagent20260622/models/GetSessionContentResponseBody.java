// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossagent20260622.models;

import com.aliyun.tea.*;

public class GetSessionContentResponseBody extends TeaModel {
    /**
     * <p>The conversation text content.</p>
     */
    @NameInMap("content")
    public java.util.List<GetSessionContentResponseBodyContent> content;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>UUID</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>UUID</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static GetSessionContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSessionContentResponseBody self = new GetSessionContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSessionContentResponseBody setContent(java.util.List<GetSessionContentResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<GetSessionContentResponseBodyContent> getContent() {
        return this.content;
    }

    public GetSessionContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSessionContentResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class GetSessionContentResponseBodyContentAgentContents extends TeaModel {
        /**
         * <p>The detailed conversation chunk content. All chunks compose the complete response.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;id\&quot;:\&quot;16aa7737-9e6a-4500-abd2-96c5f17d1188\&quot;,\&quot;object\&quot;:\&quot;chat.completion.chunk\&quot;,\&quot;created\&quot;:1788408524,\&quot;model\&quot;:\&quot;oss-agent\&quot;,\&quot;choices\&quot;:[{\&quot;index\&quot;:0,\&quot;delta\&quot;:{\&quot;role\&quot;:\&quot;assistant\&quot;,\&quot;content\&quot;:\&quot;，Hello， I am OSS Agent\&quot;}}]}</p>
         */
        @NameInMap("agentContent")
        public String agentContent;

        /**
         * <p>The time when the content was generated, in the yyyy-MM-dd HH:mm:ss,SSS format.</p>
         * 
         * <strong>example:</strong>
         * <p>1774577589</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        public static GetSessionContentResponseBodyContentAgentContents build(java.util.Map<String, ?> map) throws Exception {
            GetSessionContentResponseBodyContentAgentContents self = new GetSessionContentResponseBodyContentAgentContents();
            return TeaModel.build(map, self);
        }

        public GetSessionContentResponseBodyContentAgentContents setAgentContent(String agentContent) {
            this.agentContent = agentContent;
            return this;
        }
        public String getAgentContent() {
            return this.agentContent;
        }

        public GetSessionContentResponseBodyContentAgentContents setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetSessionContentResponseBodyContent extends TeaModel {
        /**
         * <p>The detailed conversation content.</p>
         */
        @NameInMap("agentContents")
        public java.util.List<GetSessionContentResponseBodyContentAgentContents> agentContents;

        /**
         * <p>The time when the session occurred, in the yyyy-MM-dd HH:mm:ss,SSS format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-03 04:08:30,637</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        /**
         * <p>Indicates whether tool confirmation is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("toolConfirm")
        public Boolean toolConfirm;

        /**
         * <p>The user content of the first message in the session.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;Hi OSS\&quot;}]</p>
         */
        @NameInMap("userContent")
        public String userContent;

        public static GetSessionContentResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetSessionContentResponseBodyContent self = new GetSessionContentResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetSessionContentResponseBodyContent setAgentContents(java.util.List<GetSessionContentResponseBodyContentAgentContents> agentContents) {
            this.agentContents = agentContents;
            return this;
        }
        public java.util.List<GetSessionContentResponseBodyContentAgentContents> getAgentContents() {
            return this.agentContents;
        }

        public GetSessionContentResponseBodyContent setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetSessionContentResponseBodyContent setToolConfirm(Boolean toolConfirm) {
            this.toolConfirm = toolConfirm;
            return this;
        }
        public Boolean getToolConfirm() {
            return this.toolConfirm;
        }

        public GetSessionContentResponseBodyContent setUserContent(String userContent) {
            this.userContent = userContent;
            return this;
        }
        public String getUserContent() {
            return this.userContent;
        }

    }

}
