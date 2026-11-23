// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261121.models;

import com.aliyun.tea.*;

public class ChatResponseBody extends TeaModel {
    /**
     * <p>开通 HTTP 音频输出后，完整 JSON 可在 audioFrames 中返回音频帧。type 为 audio 时，data 为 Base64 音频数据，last 为布尔末帧标识。type 为 error 时可含 code、requestId 和 message。无音频时可为空或省略。</p>
     */
    @NameInMap("audioFrames")
    public java.util.List<ChatResponseBodyAudioFrames> audioFrames;

    /**
     * <p>用于关联响应帧与原业务请求和会话的信息。</p>
     */
    @NameInMap("communication")
    public ChatResponseBodyCommunication communication;

    /**
     * <p>可选业务对象，字段按实际响应出现。单帧 HTTP 音频响应的 data 也可能直接为 Base64 字符串；多态音频完整形状见接口说明。客户端不得假定固定字段全部存在。</p>
     */
    @NameInMap("data")
    public ChatResponseBodyData data;

    /**
     * <p>可选错误对象，出现时按失败处理。准备阶段可用错误HTTP状态+JSON返回；已识别业务错误可保留HTTP200，SSE首帧提交后用错误终帧表达。优先结合HTTP X-Request-Id关联。</p>
     */
    @NameInMap("error")
    public ChatResponseBodyError error;

    /**
     * <p>可选字符串或数值，成功业务响应可为数字0；非零或失败码按错误处理。未返回本字段不自动判失败，须综合 error、HTTP 和流终帧。</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errorCode")
    public Object errorCode;

    /**
     * <p>与响应顶层业务状态码对应的说明。</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>响应顶层可选的业务请求关联号。POP 请求号由响应头 x-acs-request-id 提供。</p>
     * 
     * <strong>example:</strong>
     * <p>req-example-001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatResponseBody self = new ChatResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatResponseBody setAudioFrames(java.util.List<ChatResponseBodyAudioFrames> audioFrames) {
        this.audioFrames = audioFrames;
        return this;
    }
    public java.util.List<ChatResponseBodyAudioFrames> getAudioFrames() {
        return this.audioFrames;
    }

    public ChatResponseBody setCommunication(ChatResponseBodyCommunication communication) {
        this.communication = communication;
        return this;
    }
    public ChatResponseBodyCommunication getCommunication() {
        return this.communication;
    }

    public ChatResponseBody setData(ChatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChatResponseBodyData getData() {
        return this.data;
    }

    public ChatResponseBody setError(ChatResponseBodyError error) {
        this.error = error;
        return this;
    }
    public ChatResponseBodyError getError() {
        return this.error;
    }

    public ChatResponseBody setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Object getErrorCode() {
        return this.errorCode;
    }

    public ChatResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChatResponseBodyAudioFrames extends TeaModel {
        /**
         * <p>音频处理失败时可能提供。</p>
         * 
         * <strong>example:</strong>
         * <p>DOWNSTREAM_ERROR</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>音频帧的 Base64 数据。末帧的值可以为空字符串。</p>
         * 
         * <strong>example:</strong>
         * <p>SUQz</p>
         */
        @NameInMap("data")
        public String data;

        /**
         * <p>true 表示本路音频的最后一帧。</p>
         */
        @NameInMap("last")
        public Boolean last;

        /**
         * <p>音频处理失败时按实际错误返回。</p>
         * 
         * <strong>example:</strong>
         * <p>语音合成暂不可用</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>用于关联音频错误与本次业务请求。</p>
         * 
         * <strong>example:</strong>
         * <p>req-example-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>audio 表示音频，error 表示处理失败。</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("type")
        public String type;

        public static ChatResponseBodyAudioFrames build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyAudioFrames self = new ChatResponseBodyAudioFrames();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyAudioFrames setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ChatResponseBodyAudioFrames setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ChatResponseBodyAudioFrames setLast(Boolean last) {
            this.last = last;
            return this;
        }
        public Boolean getLast() {
            return this.last;
        }

        public ChatResponseBodyAudioFrames setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ChatResponseBodyAudioFrames setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ChatResponseBodyAudioFrames setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ChatResponseBodyCommunication extends TeaModel {
        /**
         * <p>当前响应所属的业务请求 ID，返回时与请求中的 communication.requestId 一致。</p>
         * 
         * <strong>example:</strong>
         * <p>req-example-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>可选整数，业务响应帧标识；网关多帧聚合可为0。不代表可对所有网络帧排序的序列号，也不是会话或请求ID。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("responseId")
        public Long responseId;

        /**
         * <p>当前响应所属的客户会话 ID。</p>
         * 
         * <strong>example:</strong>
         * <p>session-example-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        public static ChatResponseBodyCommunication build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyCommunication self = new ChatResponseBodyCommunication();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyCommunication setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ChatResponseBodyCommunication setResponseId(Long responseId) {
            this.responseId = responseId;
            return this;
        }
        public Long getResponseId() {
            return this.responseId;
        }

        public ChatResponseBodyCommunication setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class ChatResponseBodyDataExtraInfoInputResources extends TeaModel {
        /**
         * <p>从零开始，按原始 content 数组计数，包含文本块。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("contentIndex")
        public Integer contentIndex;

        /**
         * <p>有文件名时返回。</p>
         * 
         * <strong>example:</strong>
         * <p>cat.png</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>本轮输入资源的标识，用于关联对应资源。</p>
         * 
         * <strong>example:</strong>
         * <p>ws_example_001</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>原始内容块对应的资源类型。</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>本轮输入资源的可访问地址。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cdn.example.com/uploads/cat.png">https://cdn.example.com/uploads/cat.png</a></p>
         */
        @NameInMap("url")
        public String url;

        public static ChatResponseBodyDataExtraInfoInputResources build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyDataExtraInfoInputResources self = new ChatResponseBodyDataExtraInfoInputResources();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyDataExtraInfoInputResources setContentIndex(Integer contentIndex) {
            this.contentIndex = contentIndex;
            return this;
        }
        public Integer getContentIndex() {
            return this.contentIndex;
        }

        public ChatResponseBodyDataExtraInfoInputResources setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ChatResponseBodyDataExtraInfoInputResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ChatResponseBodyDataExtraInfoInputResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ChatResponseBodyDataExtraInfoInputResources setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ChatResponseBodyDataExtraInfo extends TeaModel {
        /**
         * <p>仅在响应提供本轮输入资源处理结果时返回。</p>
         */
        @NameInMap("inputResources")
        public java.util.List<ChatResponseBodyDataExtraInfoInputResources> inputResources;

        public static ChatResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyDataExtraInfo self = new ChatResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyDataExtraInfo setInputResources(java.util.List<ChatResponseBodyDataExtraInfoInputResources> inputResources) {
            this.inputResources = inputResources;
            return this;
        }
        public java.util.List<ChatResponseBodyDataExtraInfoInputResources> getInputResources() {
            return this.inputResources;
        }

    }

    public static class ChatResponseBodyDataMessagesMetaDataMultiLoad extends TeaModel {
        /**
         * <p>可选，结构随卡片类型变化。图文卡片可含资源列表。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;list&quot;:[{&quot;imageUrl&quot;:&quot;<a href="https://images.example.com/cat.png%22%7D%5D%7D">https://images.example.com/cat.png&quot;}]}</a></p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>与正文中的卡片引用关联。相同标识代表同一卡片。</p>
         * 
         * <strong>example:</strong>
         * <p>image_waterfall_1</p>
         */
        @NameInMap("sourceSeq")
        public String sourceSeq;

        /**
         * <p>按类型选择卡片展示组件。</p>
         * 
         * <strong>example:</strong>
         * <p>image_waterfall</p>
         */
        @NameInMap("type")
        public String type;

        public static ChatResponseBodyDataMessagesMetaDataMultiLoad build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyDataMessagesMetaDataMultiLoad self = new ChatResponseBodyDataMessagesMetaDataMultiLoad();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyDataMessagesMetaDataMultiLoad setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public ChatResponseBodyDataMessagesMetaDataMultiLoad setSourceSeq(String sourceSeq) {
            this.sourceSeq = sourceSeq;
            return this;
        }
        public String getSourceSeq() {
            return this.sourceSeq;
        }

        public ChatResponseBodyDataMessagesMetaDataMultiLoad setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ChatResponseBodyDataMessagesMetaData extends TeaModel {
        /**
         * <p>用于展示当前过程的上下文标题。处理状态见对应消息的 status。</p>
         * 
         * <strong>example:</strong>
         * <p>问题分析</p>
         */
        @NameInMap("barTitle")
        public String barTitle;

        /**
         * <p>数据结构随模块类型变化。bar/progress 中，思考过程使用 body，工具和结束提示使用 title，过程中检索资料或图片分别使用 docs、images。完整键和示例见接入说明。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;body&quot;:&quot;正在分析问题&quot;,&quot;status&quot;:&quot;processing&quot;}</p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>与正文关联的结构化内容列表，例如图文卡片，按消息类型返回。</p>
         */
        @NameInMap("multiLoad")
        public java.util.List<ChatResponseBodyDataMessagesMetaDataMultiLoad> multiLoad;

        /**
         * <p>按本次请求和 sourceSeq 关联同一模块的更新。新的完整快照替换旧快照。</p>
         * 
         * <strong>example:</strong>
         * <p>thinking-1</p>
         */
        @NameInMap("sourceSeq")
        public String sourceSeq;

        /**
         * <p>例如 bar_thinking、bar_tool、bar_think_finish、bar_ref_source_inline 或 bar_image_inline。按实际类型选择展示组件。</p>
         * 
         * <strong>example:</strong>
         * <p>bar_thinking</p>
         */
        @NameInMap("type")
        public String type;

        public static ChatResponseBodyDataMessagesMetaData build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyDataMessagesMetaData self = new ChatResponseBodyDataMessagesMetaData();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyDataMessagesMetaData setBarTitle(String barTitle) {
            this.barTitle = barTitle;
            return this;
        }
        public String getBarTitle() {
            return this.barTitle;
        }

        public ChatResponseBodyDataMessagesMetaData setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public ChatResponseBodyDataMessagesMetaData setMultiLoad(java.util.List<ChatResponseBodyDataMessagesMetaDataMultiLoad> multiLoad) {
            this.multiLoad = multiLoad;
            return this;
        }
        public java.util.List<ChatResponseBodyDataMessagesMetaDataMultiLoad> getMultiLoad() {
            return this.multiLoad;
        }

        public ChatResponseBodyDataMessagesMetaData setSourceSeq(String sourceSeq) {
            this.sourceSeq = sourceSeq;
            return this;
        }
        public String getSourceSeq() {
            return this.sourceSeq;
        }

        public ChatResponseBodyDataMessagesMetaData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ChatResponseBodyDataMessages extends TeaModel {
        /**
         * <p>可选多态内容，按 mimeType 解析。multi_load/iframe 常为累计文本快照；后帧更新当前内容。过程、卡片按各自类型处理，不把任意 content 强转字符串。</p>
         * 
         * <strong>example:</strong>
         * <p>图片如下[(image_waterfall_1)]</p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>可选、可扩展的消息元数据。正文消息可通过 multiLoad 提供卡片；过程消息可按类型包含 sourceSeq、type、barTitle、content，用于关联和展示相应内容。</p>
         */
        @NameInMap("metaData")
        public ChatResponseBodyDataMessagesMetaData metaData;

        /**
         * <p>消息类型，按此值解析正文、进度及可选信号和追问。常见类型见接入说明。</p>
         * 
         * <strong>example:</strong>
         * <p>multi_load/iframe</p>
         */
        @NameInMap("mimeType")
        public String mimeType;

        /**
         * <p>可选消息状态，如 processing、complete；complete 只结束该消息，不替代 SSE event:complete。HTTP200 或单条消息complete都不足以判定整次流成功。</p>
         * 
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("status")
        public String status;

        public static ChatResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyDataMessages self = new ChatResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyDataMessages setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public ChatResponseBodyDataMessages setMetaData(ChatResponseBodyDataMessagesMetaData metaData) {
            this.metaData = metaData;
            return this;
        }
        public ChatResponseBodyDataMessagesMetaData getMetaData() {
            return this.metaData;
        }

        public ChatResponseBodyDataMessages setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

        public ChatResponseBodyDataMessages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ChatResponseBodyData extends TeaModel {
        /**
         * <p>可选业务调试信息，可省略或为 null。在支持的联调场景中可能包含 intentLabel；具体结构和返回时机按实际响应读取。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;intentLabel&quot;:&quot;image_search&quot;}</p>
         */
        @NameInMap("debug")
        public Object debug;

        /**
         * <p>业务响应附带的可选扩展信息。inputResources 是本轮输入资源的处理结果数组，元素可含 contentIndex、type、resourceId、url 和 fileName。contentIndex 是原始消息 content 数组的零起始下标，文本块也计数。</p>
         */
        @NameInMap("extraInfo")
        public ChatResponseBodyDataExtraInfo extraInfo;

        /**
         * <p>可选数组，可能含多条正文、过程或卡片消息。multi_load/iframe 文本为累计快照，不将每帧全文重复拼接；不要固定只取 messages[0]。</p>
         */
        @NameInMap("messages")
        public java.util.List<ChatResponseBodyDataMessages> messages;

        public static ChatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyData self = new ChatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyData setDebug(Object debug) {
            this.debug = debug;
            return this;
        }
        public Object getDebug() {
            return this.debug;
        }

        public ChatResponseBodyData setExtraInfo(ChatResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public ChatResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public ChatResponseBodyData setMessages(java.util.List<ChatResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<ChatResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

    }

    public static class ChatResponseBodyError extends TeaModel {
        /**
         * <p>可选的错误码，可为字符串或数值，表示服务或 Agent 的具体错误类型。程序应按 code 判断，不依赖 message 全文；数值业务码 500 不代表 HTTP 状态一定为 500。</p>
         * 
         * <strong>example:</strong>
         * <p>INVALID_REQUEST</p>
         */
        @NameInMap("code")
        public Object code;

        /**
         * <p>业务错误的说明文本。</p>
         * 
         * <strong>example:</strong>
         * <p>请求参数无效</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>失败调用的业务请求关联号，用于定位问题。</p>
         * 
         * <strong>example:</strong>
         * <p>req-example-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        public static ChatResponseBodyError build(java.util.Map<String, ?> map) throws Exception {
            ChatResponseBodyError self = new ChatResponseBodyError();
            return TeaModel.build(map, self);
        }

        public ChatResponseBodyError setCode(Object code) {
            this.code = code;
            return this;
        }
        public Object getCode() {
            return this.code;
        }

        public ChatResponseBodyError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ChatResponseBodyError setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
