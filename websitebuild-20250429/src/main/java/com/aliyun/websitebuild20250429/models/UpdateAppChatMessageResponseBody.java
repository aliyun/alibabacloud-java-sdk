// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppChatMessageResponseBody extends TeaModel {
    /**
     * <p>Detailed reason for access denial.</p>
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
     * <p>spring-cloud-b</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>dynamic code; not currently used. Please ignore.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>dynamic error message, used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> error message.  </p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the provided request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>faulty parameters</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The returned object.</p>
     */
    @NameInMap("Module")
    public UpdateAppChatMessageResponseBodyModule module;

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
     * <p>SYSTEM.ERROR</p>
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
     * <p>is processed synchronously</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static UpdateAppChatMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppChatMessageResponseBody self = new UpdateAppChatMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppChatMessageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateAppChatMessageResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public UpdateAppChatMessageResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateAppChatMessageResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public UpdateAppChatMessageResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public UpdateAppChatMessageResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public UpdateAppChatMessageResponseBody setModule(UpdateAppChatMessageResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public UpdateAppChatMessageResponseBodyModule getModule() {
        return this.module;
    }

    public UpdateAppChatMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAppChatMessageResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public UpdateAppChatMessageResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public UpdateAppChatMessageResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class UpdateAppChatMessageResponseBodyModule extends TeaModel {
        /**
         * <p>Bot ID</p>
         * 
         * <strong>example:</strong>
         * <p>Zero2</p>
         */
        @NameInMap("BotId")
        public String botId;

        /**
         * <p>The ID of the chat.</p>
         * 
         * <strong>example:</strong>
         * <p>53467af9-8c4e-4498-9032-1f26978007f8</p>
         */
        @NameInMap("ChatId")
        public String chatId;

        /**
         * <p>Current conversation status</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ChatStatus")
        public String chatStatus;

        /**
         * <p>The ID of the data class API being invoked.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;code\&quot;: \&quot;200\&quot;, \&quot;success\&quot;: True, \&quot;content\&quot;: True, \&quot;requestId\&quot;: \&quot;4AF53F7B-FEA9-5966-B0F8-BAF9A1EEFE34\&quot;, \&quot;businessError\&quot;: False, \&quot;message\&quot;: \&quot;success\&quot;, \&quot;httpStatusCode\&quot;: 200}</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Content type.</p>
         * 
         * <strong>example:</strong>
         * <p>image/png</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>Session ID.</p>
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
         * <p>Updated At.</p>
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
         * <p>471791769135220858</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>Business extension metadata (in Map format, must be a JSON string)</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;appId\&quot;:\&quot;WS20260418211121000001\&quot;,\&quot;inputTokens\&quot;:273,\&quot;outputTokens\&quot;:1}</p>
         */
        @NameInMap("MetaData")
        public String metaData;

        /**
         * <p>The probability of not wearing a mask, not wearing a uniform, or not wearing a hat.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("No")
        public Integer no;

        /**
         * <p>Indicates the role of a conversation participant. Valid values include:</p>
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

        public static UpdateAppChatMessageResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppChatMessageResponseBodyModule self = new UpdateAppChatMessageResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public UpdateAppChatMessageResponseBodyModule setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public UpdateAppChatMessageResponseBodyModule setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public UpdateAppChatMessageResponseBodyModule setChatStatus(String chatStatus) {
            this.chatStatus = chatStatus;
            return this;
        }
        public String getChatStatus() {
            return this.chatStatus;
        }

        public UpdateAppChatMessageResponseBodyModule setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateAppChatMessageResponseBodyModule setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public UpdateAppChatMessageResponseBodyModule setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public UpdateAppChatMessageResponseBodyModule setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public UpdateAppChatMessageResponseBodyModule setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public UpdateAppChatMessageResponseBodyModule setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public UpdateAppChatMessageResponseBodyModule setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public UpdateAppChatMessageResponseBodyModule setNo(Integer no) {
            this.no = no;
            return this;
        }
        public Integer getNo() {
            return this.no;
        }

        public UpdateAppChatMessageResponseBodyModule setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public UpdateAppChatMessageResponseBodyModule setSectionId(String sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public String getSectionId() {
            return this.sectionId;
        }

        public UpdateAppChatMessageResponseBodyModule setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public UpdateAppChatMessageResponseBodyModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
