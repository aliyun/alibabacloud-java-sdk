// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAIStaffChatEventsResponseBody extends TeaModel {
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
     * <p>App Name.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-b</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>dynamic error message, used to replace <code>%s</code> in the <strong>ErrMessage</strong> error message.  </p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the request parameter <strong>DtsJobId</strong> is invalid.</p>
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
     * <p>returned object.</p>
     */
    @NameInMap("Module")
    public ListAIStaffChatEventsResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>error code</p>
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

    public static ListAIStaffChatEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIStaffChatEventsResponseBody self = new ListAIStaffChatEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIStaffChatEventsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAIStaffChatEventsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAIStaffChatEventsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAIStaffChatEventsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAIStaffChatEventsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAIStaffChatEventsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAIStaffChatEventsResponseBody setModule(ListAIStaffChatEventsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListAIStaffChatEventsResponseBodyModule getModule() {
        return this.module;
    }

    public ListAIStaffChatEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAIStaffChatEventsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAIStaffChatEventsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAIStaffChatEventsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAIStaffChatEventsResponseBodyModuleEvents extends TeaModel {
        /**
         * <p>error message.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Recorded\&quot;: False}</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>primary key</p>
         * 
         * <strong>example:</strong>
         * <p>10426</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>Website Name</p>
         * 
         * <strong>example:</strong>
         * <p>文章素材2026050704</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListAIStaffChatEventsResponseBodyModuleEvents build(java.util.Map<String, ?> map) throws Exception {
            ListAIStaffChatEventsResponseBodyModuleEvents self = new ListAIStaffChatEventsResponseBodyModuleEvents();
            return TeaModel.build(map, self);
        }

        public ListAIStaffChatEventsResponseBodyModuleEvents setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListAIStaffChatEventsResponseBodyModuleEvents setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListAIStaffChatEventsResponseBodyModuleEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAIStaffChatEventsResponseBodyModule extends TeaModel {
        /**
         * <p>Unique ID of the sentence</p>
         * 
         * <strong>example:</strong>
         * <p>chat-xrz3etcl2bsygwlx8g</p>
         */
        @NameInMap("ChatId")
        public String chatId;

        /**
         * <p>session ID</p>
         * 
         * <strong>example:</strong>
         * <p>872be9bc-3097-433d-b462-596202455102</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        /**
         * <p>object ID</p>
         */
        @NameInMap("Events")
        public java.util.List<ListAIStaffChatEventsResponseBodyModuleEvents> events;

        /**
         * <p>ID of the last SSE event</p>
         * 
         * <strong>example:</strong>
         * <p>event-21dd6124760a4a259ae33bbd878f6e20</p>
         */
        @NameInMap("LastEventId")
        public Integer lastEventId;

        public static ListAIStaffChatEventsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAIStaffChatEventsResponseBodyModule self = new ListAIStaffChatEventsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAIStaffChatEventsResponseBodyModule setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public ListAIStaffChatEventsResponseBodyModule setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public ListAIStaffChatEventsResponseBodyModule setEvents(java.util.List<ListAIStaffChatEventsResponseBodyModuleEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<ListAIStaffChatEventsResponseBodyModuleEvents> getEvents() {
            return this.events;
        }

        public ListAIStaffChatEventsResponseBodyModule setLastEventId(Integer lastEventId) {
            this.lastEventId = lastEventId;
            return this;
        }
        public Integer getLastEventId() {
            return this.lastEventId;
        }

    }

}
