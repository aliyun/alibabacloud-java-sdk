// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAIStaffChatMessagesResponseBody extends TeaModel {
    /**
     * <p>The access denied details.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retry is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic message. This parameter is not in use. Ignore it.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public ListAIStaffChatMessagesResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListAIStaffChatMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIStaffChatMessagesResponseBody self = new ListAIStaffChatMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIStaffChatMessagesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAIStaffChatMessagesResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAIStaffChatMessagesResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAIStaffChatMessagesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAIStaffChatMessagesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAIStaffChatMessagesResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAIStaffChatMessagesResponseBody setModule(ListAIStaffChatMessagesResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListAIStaffChatMessagesResponseBodyModule getModule() {
        return this.module;
    }

    public ListAIStaffChatMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAIStaffChatMessagesResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAIStaffChatMessagesResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAIStaffChatMessagesResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAIStaffChatMessagesResponseBodyModuleMessages extends TeaModel {
        /**
         * <p>The bot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Zero2</p>
         */
        @NameInMap("BotId")
        public String botId;

        /**
         * <p>The ID of the current conversation turn.</p>
         * 
         * <strong>example:</strong>
         * <p>54a0bfa0-41bd-4e96-acd9-fb13c0474452</p>
         */
        @NameInMap("ChatId")
        public String chatId;

        /**
         * <p>The current conversation status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ChatStatus")
        public String chatStatus;

        /**
         * <p>The ID of the data API operation that is called.</p>
         * 
         * <strong>example:</strong>
         * <p>domain cnamen<a href="http://www.buyhao8.com">www.buyhao8.com</a> <a href="http://www.buyhao8.com.a1.initrr.comn">www.buyhao8.com.a1.initrr.comn</a></p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The content type.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-675163021891846144</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1723532098</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1591339051000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1dafa033-e72b-44c2-99b7-bc202c5b6198</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The business extension metadata in Map format. The value must be a JSON string.</p>
         */
        @NameInMap("MetaData")
        public java.util.Map<String, ?> metaData;

        /**
         * <p>The role of the conversation participant. Valid values:</p>
         * <ul>
         * <li><p>user: User.</p>
         * </li>
         * <li><p>assistant: Assistant.</p>
         * </li>
         * <li><p>system: System.</p>
         * </li>
         * <li><p>function: Function.</p>
         * </li>
         * <li><p>plugin: Plugin.</p>
         * </li>
         * <li><p>tool: Tool.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The section ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>324</p>
         */
        @NameInMap("SectionId")
        public String sectionId;

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>928636774795776</p>
         */
        @NameInMap("SiteId")
        public String siteId;

        /**
         * <p>The file type.</p>
         * 
         * <strong>example:</strong>
         * <p>SINGLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAIStaffChatMessagesResponseBodyModuleMessages build(java.util.Map<String, ?> map) throws Exception {
            ListAIStaffChatMessagesResponseBodyModuleMessages self = new ListAIStaffChatMessagesResponseBodyModuleMessages();
            return TeaModel.build(map, self);
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setChatStatus(String chatStatus) {
            this.chatStatus = chatStatus;
            return this;
        }
        public String getChatStatus() {
            return this.chatStatus;
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setMetaData(java.util.Map<String, ?> metaData) {
            this.metaData = metaData;
            return this;
        }
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setSectionId(String sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public String getSectionId() {
            return this.sectionId;
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public ListAIStaffChatMessagesResponseBodyModuleMessages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAIStaffChatMessagesResponseBodyModule extends TeaModel {
        /**
         * <p>The sender type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>ADMIN</strong>: System.</li>
         * <li><strong>CUSTOMER</strong>: Visitor.</li>
         * <li><strong>AGENT</strong>: Agent.</li>
         * </ul>
         */
        @NameInMap("Messages")
        public java.util.List<ListAIStaffChatMessagesResponseBodyModuleMessages> messages;

        public static ListAIStaffChatMessagesResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAIStaffChatMessagesResponseBodyModule self = new ListAIStaffChatMessagesResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAIStaffChatMessagesResponseBodyModule setMessages(java.util.List<ListAIStaffChatMessagesResponseBodyModuleMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<ListAIStaffChatMessagesResponseBodyModuleMessages> getMessages() {
            return this.messages;
        }

    }

}
