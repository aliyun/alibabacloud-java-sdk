// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppConversationResponseBody extends TeaModel {
    /**
     * <p>access denied details</p>
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
     * <p>dewuApp</p>
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
     * <p>dynamic error message, used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> error message.  </p>
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
     * <p>returned error parameters</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>response Data</p>
     */
    @NameInMap("Module")
    public GetAppConversationResponseBodyModule module;

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

    public static GetAppConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppConversationResponseBody self = new GetAppConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppConversationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppConversationResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppConversationResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppConversationResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppConversationResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppConversationResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppConversationResponseBody setModule(GetAppConversationResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppConversationResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppConversationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppConversationResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppConversationResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppConversationResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppConversationResponseBodyModule extends TeaModel {
        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>12343131221311</p>
         */
        @NameInMap("AliyunPk")
        public String aliyunPk;

        /**
         * <p>bot ID</p>
         * 
         * <strong>example:</strong>
         * <p>Zero2</p>
         */
        @NameInMap("BotId")
        public String botId;

        /**
         * <p>Chat record</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ChatNum")
        public Integer chatNum;

        /**
         * <p>session id</p>
         * 
         * <strong>example:</strong>
         * <p>872be9bc-3097-433d-b462-596202455102</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        /**
         * <p>Creation Time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Update Time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-29T10:34:13Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>Extension information (in JSON string format)</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;appId\&quot;:\&quot;WS20260507200853000001\&quot;,\&quot;inputTokens\&quot;:1411,\&quot;outputTokens\&quot;:51}</p>
         */
        @NameInMap("MetaData")
        public String metaData;

        /**
         * <p>Section ID of the checklist item.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("SectionId")
        public String sectionId;

        /**
         * <p>site ID, which can be obtained by invoking the <a href="~~ListSites~~">ListSites</a> API.</p>
         * 
         * <strong>example:</strong>
         * <p>865181640657408</p>
         */
        @NameInMap("SiteId")
        public String siteId;

        /**
         * <p>Current point, equivalent to news title</p>
         * 
         * <strong>example:</strong>
         * <p>Feel Like Makin\&quot; Love</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>用户id</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetAppConversationResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppConversationResponseBodyModule self = new GetAppConversationResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppConversationResponseBodyModule setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public GetAppConversationResponseBodyModule setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public GetAppConversationResponseBodyModule setChatNum(Integer chatNum) {
            this.chatNum = chatNum;
            return this;
        }
        public Integer getChatNum() {
            return this.chatNum;
        }

        public GetAppConversationResponseBodyModule setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public GetAppConversationResponseBodyModule setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetAppConversationResponseBodyModule setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetAppConversationResponseBodyModule setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public GetAppConversationResponseBodyModule setSectionId(String sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public String getSectionId() {
            return this.sectionId;
        }

        public GetAppConversationResponseBodyModule setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public GetAppConversationResponseBodyModule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetAppConversationResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
