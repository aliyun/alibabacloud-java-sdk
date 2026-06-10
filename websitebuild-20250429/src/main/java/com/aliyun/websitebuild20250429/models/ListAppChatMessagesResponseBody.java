// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppChatMessagesResponseBody extends TeaModel {
    /**
     * <p>permission denied information</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>is retry allowed</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>App name.</p>
     * 
     * <strong>example:</strong>
     * <p>dewuApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>dynamic error message used to replace <code>%s</code> in the <strong>ErrMessage</strong> error message.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>returned error parameters</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Number of results per query.</p>
     * <p>Value range: 10 to 100. Default Value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Response data</p>
     */
    @NameInMap("Module")
    public java.util.List<ListAppChatMessagesResponseBodyModule> module;

    /**
     * <p>Token for starting the next query. It is empty when there is no next query.</p>
     * 
     * <strong>example:</strong>
     * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.EROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>abnormal message</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListAppChatMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppChatMessagesResponseBody self = new ListAppChatMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppChatMessagesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAppChatMessagesResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAppChatMessagesResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppChatMessagesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAppChatMessagesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAppChatMessagesResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAppChatMessagesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppChatMessagesResponseBody setModule(java.util.List<ListAppChatMessagesResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<ListAppChatMessagesResponseBodyModule> getModule() {
        return this.module;
    }

    public ListAppChatMessagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppChatMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppChatMessagesResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAppChatMessagesResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAppChatMessagesResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAppChatMessagesResponseBodyModule extends TeaModel {
        /**
         * <p>Bot ID</p>
         * 
         * <strong>example:</strong>
         * <p>Zero2</p>
         */
        @NameInMap("BotId")
        public String botId;

        /**
         * <p>Unique ID of a single message</p>
         * 
         * <strong>example:</strong>
         * <p>chat-xrz3etcl2bsygwlx8g</p>
         */
        @NameInMap("ChatId")
        public String chatId;

        /**
         * <p>Current chat status</p>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("ChatStatus")
        public String chatStatus;

        /**
         * <p>ID of the data class API being invoked.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;code\&quot;: \&quot;200\&quot;, \&quot;success\&quot;: True, \&quot;content\&quot;: True, \&quot;requestId\&quot;: \&quot;028993DE-097E-5F4E-AC48-64A2D5ED5F30\&quot;, \&quot;businessError\&quot;: False, \&quot;message\&quot;: \&quot;success\&quot;, \&quot;httpStatusCode\&quot;: 200}</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Content type</p>
         * 
         * <strong>example:</strong>
         * <p>image/png</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>Session ID</p>
         * 
         * <strong>example:</strong>
         * <p>872be9bc-3097-433d-b462-596202455102</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        /**
         * <p>Creation Time</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>1740479834</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Updated At</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-28T02:25:41Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>Message ID</p>
         * 
         * <strong>example:</strong>
         * <p>ee60f5a6-88ca-4074-ad37-515f065bbbd2</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>Business extension metadata (in Map format, must be a JSON string)</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;appId\&quot;:\&quot;WS20260506101154000001\&quot;,\&quot;inputTokens\&quot;:1148,\&quot;outputTokens\&quot;:60}</p>
         */
        @NameInMap("MetaData")
        public String metaData;

        /**
         * <p>Region ordinal number. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("No")
        public Integer no;

        /**
         * <p>Indicates the role of the participant in the conversation. Valid values include:</p>
         * <ul>
         * <li><p>user: User</p>
         * </li>
         * <li><p>assistant: Assistant</p>
         * </li>
         * <li><p>system: System</p>
         * </li>
         * <li><p>function: Function</p>
         * </li>
         * <li><p>plugin: Plugin</p>
         * </li>
         * <li><p>tool: Tool</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LoC</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Section ID of the checklist item.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("SectionId")
        public String sectionId;

        /**
         * <p>Site ID, which can be obtained by invoking the <a href="~~ListSites~~">ListSites</a> API.</p>
         * 
         * <strong>example:</strong>
         * <p>865181640657408</p>
         */
        @NameInMap("SiteId")
        public String siteId;

        /**
         * <p>File type</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAppChatMessagesResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAppChatMessagesResponseBodyModule self = new ListAppChatMessagesResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAppChatMessagesResponseBodyModule setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public ListAppChatMessagesResponseBodyModule setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public ListAppChatMessagesResponseBodyModule setChatStatus(String chatStatus) {
            this.chatStatus = chatStatus;
            return this;
        }
        public String getChatStatus() {
            return this.chatStatus;
        }

        public ListAppChatMessagesResponseBodyModule setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAppChatMessagesResponseBodyModule setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListAppChatMessagesResponseBodyModule setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public ListAppChatMessagesResponseBodyModule setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListAppChatMessagesResponseBodyModule setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListAppChatMessagesResponseBodyModule setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListAppChatMessagesResponseBodyModule setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public ListAppChatMessagesResponseBodyModule setNo(Integer no) {
            this.no = no;
            return this;
        }
        public Integer getNo() {
            return this.no;
        }

        public ListAppChatMessagesResponseBodyModule setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListAppChatMessagesResponseBodyModule setSectionId(String sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public String getSectionId() {
            return this.sectionId;
        }

        public ListAppChatMessagesResponseBodyModule setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public ListAppChatMessagesResponseBodyModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
