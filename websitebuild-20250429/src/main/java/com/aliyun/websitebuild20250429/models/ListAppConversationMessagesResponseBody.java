// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppConversationMessagesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Module")
    public java.util.List<ListAppConversationMessagesResponseBodyModule> module;

    /**
     * <strong>example:</strong>
     * <p>FFh3Xqm+JgZ/U9Jyb7wdVr9LWk80Tghn5UZjbcWEVEderBcbVF+Y6PS0i8PpCL4PQZ3e0C9oEH0Asd4tJEuGtkl2WuKdiWZpEwadNydQdJPFM=</p>
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
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListAppConversationMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppConversationMessagesResponseBody self = new ListAppConversationMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppConversationMessagesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAppConversationMessagesResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAppConversationMessagesResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppConversationMessagesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAppConversationMessagesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAppConversationMessagesResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAppConversationMessagesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppConversationMessagesResponseBody setModule(java.util.List<ListAppConversationMessagesResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<ListAppConversationMessagesResponseBodyModule> getModule() {
        return this.module;
    }

    public ListAppConversationMessagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppConversationMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppConversationMessagesResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAppConversationMessagesResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAppConversationMessagesResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAppConversationMessagesResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Zero2</p>
         */
        @NameInMap("BotId")
        public String botId;

        /**
         * <strong>example:</strong>
         * <p>chat-xrz3etcl2bsygwlx8g</p>
         */
        @NameInMap("ChatId")
        public String chatId;

        /**
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("ChatStatus")
        public String chatStatus;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;DeviceName\&quot;: u\&quot;\u667a\u80fd\u63d2\u5ea716A\&quot;, \&quot;BlidMac\&quot;: \&quot;18bc5a53351c\&quot;, \&quot;DeviceModel\&quot;: \&quot;ABSP21-16M\&quot;, \&quot;DeviceCategory\&quot;: u\&quot;\u63d2\u5ea7\&quot;, \&quot;DeviceManufacturer\&quot;: \&quot;\&quot;, \&quot;DeviceType\&quot;: 140}</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>image/png</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <strong>example:</strong>
         * <p>872be9bc-3097-433d-b462-596202455102</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        /**
         * <strong>example:</strong>
         * <p>1740479834</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-08-28T02:25:41Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>5f9e88ce-f223-4447-a23e-cb574df6c97a</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;appId\&quot;:\&quot;WS20260507200853000001\&quot;,\&quot;inputTokens\&quot;:1411,\&quot;outputTokens\&quot;:51}</p>
         */
        @NameInMap("MetaData")
        public String metaData;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("No")
        public Integer no;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("SectionId")
        public String sectionId;

        /**
         * <strong>example:</strong>
         * <p>865181640657408</p>
         */
        @NameInMap("SiteId")
        public String siteId;

        /**
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAppConversationMessagesResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAppConversationMessagesResponseBodyModule self = new ListAppConversationMessagesResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAppConversationMessagesResponseBodyModule setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public ListAppConversationMessagesResponseBodyModule setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public ListAppConversationMessagesResponseBodyModule setChatStatus(String chatStatus) {
            this.chatStatus = chatStatus;
            return this;
        }
        public String getChatStatus() {
            return this.chatStatus;
        }

        public ListAppConversationMessagesResponseBodyModule setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAppConversationMessagesResponseBodyModule setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListAppConversationMessagesResponseBodyModule setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public ListAppConversationMessagesResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppConversationMessagesResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppConversationMessagesResponseBodyModule setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListAppConversationMessagesResponseBodyModule setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public ListAppConversationMessagesResponseBodyModule setNo(Integer no) {
            this.no = no;
            return this;
        }
        public Integer getNo() {
            return this.no;
        }

        public ListAppConversationMessagesResponseBodyModule setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListAppConversationMessagesResponseBodyModule setSectionId(String sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public String getSectionId() {
            return this.sectionId;
        }

        public ListAppConversationMessagesResponseBodyModule setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public ListAppConversationMessagesResponseBodyModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
