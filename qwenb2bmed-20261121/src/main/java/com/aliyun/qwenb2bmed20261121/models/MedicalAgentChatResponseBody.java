// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261121.models;

import com.aliyun.tea.*;

public class MedicalAgentChatResponseBody extends TeaModel {
    /**
     * <p>可选的聚合音频帧列表。若返回音频，正常帧可含 type=audio、Base64 字符串 data 和布尔值 last，正常末帧的 data 可为空字符串。失败帧可含 type=error、code、requestId、last 和可选 message。各帧字段依类型而定。</p>
     */
    @NameInMap("audioFrames")
    public java.util.List<MedicalAgentChatResponseBodyAudioFrames> audioFrames;

    /**
     * <p>关联原请求及会话的标识。</p>
     */
    @NameInMap("communication")
    public MedicalAgentChatResponseBodyCommunication communication;

    /**
     * <p>本次应答的业务数据，正文位于 messages。</p>
     */
    @NameInMap("data")
    public MedicalAgentChatResponseBodyData data;

    /**
     * <p>可选的结构化错误信息。返回时读取 code、message 和 requestId。</p>
     */
    @NameInMap("error")
    public MedicalAgentChatResponseBodyError error;

    /**
     * <p>业务状态码。0 表示业务成功，非 0 时结合 errorMsg 或 error 查看原因。流式还应处理 event:error。</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errorCode")
    public Object errorCode;

    /**
     * <p>业务状态的文字说明。失败时用于辅助排查，程序分支应依据状态码。</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>可选的业务请求 ID。联系支持时可同时提供响应头 x-acs-request-id 中的阿里云请求 ID。</p>
     * 
     * <strong>example:</strong>
     * <p>med-req-001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static MedicalAgentChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MedicalAgentChatResponseBody self = new MedicalAgentChatResponseBody();
        return TeaModel.build(map, self);
    }

    public MedicalAgentChatResponseBody setAudioFrames(java.util.List<MedicalAgentChatResponseBodyAudioFrames> audioFrames) {
        this.audioFrames = audioFrames;
        return this;
    }
    public java.util.List<MedicalAgentChatResponseBodyAudioFrames> getAudioFrames() {
        return this.audioFrames;
    }

    public MedicalAgentChatResponseBody setCommunication(MedicalAgentChatResponseBodyCommunication communication) {
        this.communication = communication;
        return this;
    }
    public MedicalAgentChatResponseBodyCommunication getCommunication() {
        return this.communication;
    }

    public MedicalAgentChatResponseBody setData(MedicalAgentChatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MedicalAgentChatResponseBodyData getData() {
        return this.data;
    }

    public MedicalAgentChatResponseBody setError(MedicalAgentChatResponseBodyError error) {
        this.error = error;
        return this;
    }
    public MedicalAgentChatResponseBodyError getError() {
        return this.error;
    }

    public MedicalAgentChatResponseBody setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Object getErrorCode() {
        return this.errorCode;
    }

    public MedicalAgentChatResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public MedicalAgentChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MedicalAgentChatResponseBodyAudioFrames extends TeaModel {
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
         * <p>AAEC</p>
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
         * <p>音频生成失败</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>用于关联音频错误与本次业务请求。</p>
         * 
         * <strong>example:</strong>
         * <p>med-req-001</p>
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

        public static MedicalAgentChatResponseBodyAudioFrames build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyAudioFrames self = new MedicalAgentChatResponseBodyAudioFrames();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyAudioFrames setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public MedicalAgentChatResponseBodyAudioFrames setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public MedicalAgentChatResponseBodyAudioFrames setLast(Boolean last) {
            this.last = last;
            return this;
        }
        public Boolean getLast() {
            return this.last;
        }

        public MedicalAgentChatResponseBodyAudioFrames setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MedicalAgentChatResponseBodyAudioFrames setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public MedicalAgentChatResponseBodyAudioFrames setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MedicalAgentChatResponseBodyCommunication extends TeaModel {
        /**
         * <p>对应请求中的 communication.requestId，便于匹配并发请求。</p>
         * 
         * <strong>example:</strong>
         * <p>med-req-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>业务响应帧标识。一次完整 JSON 聚合时可为 0。SSE 按事件到达顺序处理，responseId 无需连续。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("responseId")
        public Long responseId;

        /**
         * <p>对应请求中的 communication.sessionId。</p>
         * 
         * <strong>example:</strong>
         * <p>med-session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        public static MedicalAgentChatResponseBodyCommunication build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyCommunication self = new MedicalAgentChatResponseBodyCommunication();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyCommunication setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public MedicalAgentChatResponseBodyCommunication setResponseId(Long responseId) {
            this.responseId = responseId;
            return this;
        }
        public Long getResponseId() {
            return this.responseId;
        }

        public MedicalAgentChatResponseBodyCommunication setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class MedicalAgentChatResponseBodyDataExtraInfoInputResources extends TeaModel {
        /**
         * <p>原请求本轮 content 数组的索引，从 0 开始。文本块也占用索引。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("contentIndex")
        public Integer contentIndex;

        /**
         * <p>上游提供时返回资源文件名。</p>
         * 
         * <strong>example:</strong>
         * <p>report.png</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>返回的输入资源标识，存在时可用于在业务记录中引用该资源。</p>
         * 
         * <strong>example:</strong>
         * <p>ws_123</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>资源类型，例如图片引用。</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>返回的资源访问地址。客户端按实际返回值使用。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/report.png">https://example.com/report.png</a></p>
         */
        @NameInMap("url")
        public String url;

        public static MedicalAgentChatResponseBodyDataExtraInfoInputResources build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyDataExtraInfoInputResources self = new MedicalAgentChatResponseBodyDataExtraInfoInputResources();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyDataExtraInfoInputResources setContentIndex(Integer contentIndex) {
            this.contentIndex = contentIndex;
            return this;
        }
        public Integer getContentIndex() {
            return this.contentIndex;
        }

        public MedicalAgentChatResponseBodyDataExtraInfoInputResources setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public MedicalAgentChatResponseBodyDataExtraInfoInputResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public MedicalAgentChatResponseBodyDataExtraInfoInputResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public MedicalAgentChatResponseBodyDataExtraInfoInputResources setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class MedicalAgentChatResponseBodyDataExtraInfo extends TeaModel {
        /**
         * <p>可选的资源信息数组，通过 contentIndex 与请求中的内容块对应。未返回资源信息时可省略。</p>
         */
        @NameInMap("inputResources")
        public java.util.List<MedicalAgentChatResponseBodyDataExtraInfoInputResources> inputResources;

        public static MedicalAgentChatResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyDataExtraInfo self = new MedicalAgentChatResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyDataExtraInfo setInputResources(java.util.List<MedicalAgentChatResponseBodyDataExtraInfoInputResources> inputResources) {
            this.inputResources = inputResources;
            return this;
        }
        public java.util.List<MedicalAgentChatResponseBodyDataExtraInfoInputResources> getInputResources() {
            return this.inputResources;
        }

    }

    public static class MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad extends TeaModel {
        /**
         * <p>可选，结构随卡片类型变化。图文卡片可含资源列表。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;list&quot;:[{&quot;image_url&quot;:&quot;<a href="https://example.com/image.jpg%22,%22image_width%22:%22800%22,%22image_height%22:%22600%22%7D%5D%7D">https://example.com/image.jpg&quot;,&quot;image_width&quot;:&quot;800&quot;,&quot;image_height&quot;:&quot;600&quot;}]}</a></p>
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

        public static MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad self = new MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad setSourceSeq(String sourceSeq) {
            this.sourceSeq = sourceSeq;
            return this;
        }
        public String getSourceSeq() {
            return this.sourceSeq;
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MedicalAgentChatResponseBodyDataMessagesMetaData extends TeaModel {
        /**
         * <p>状态栏进度消息可返回的标题。</p>
         * 
         * <strong>example:</strong>
         * <p>问题分析中</p>
         */
        @NameInMap("barTitle")
        public String barTitle;

        /**
         * <p>结构由元数据类型决定。bar_thinking 可含 body、status；bar_ref_source_inline 可含 query_list、docs、status。检索词与资料数组可能为空，资料对象字段随来源变化。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;body&quot;:&quot;正在分析用户的问题。&quot;,&quot;status&quot;:&quot;processing&quot;}</p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>正文卡片列表，可为空或省略。正文中的 [(sourceSeq)] 与相同 sourceSeq 的卡片关联，卡片 type 和 content 按实际返回解析，不把普通资料列表自行当作卡片。</p>
         */
        @NameInMap("multiLoad")
        public java.util.List<MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad> multiLoad;

        /**
         * <p>用于关联同一进度模块或正文卡片的可选标识，按实际值匹配状态更新。</p>
         * 
         * <strong>example:</strong>
         * <p>bar_thinking_1</p>
         */
        @NameInMap("sourceSeq")
        public String sourceSeq;

        /**
         * <p>用于区分进度模块，例如实际返回的 bar_thinking 或 bar_ref_source_inline；不保证每轮都有这些模块。</p>
         * 
         * <strong>example:</strong>
         * <p>bar_thinking</p>
         */
        @NameInMap("type")
        public String type;

        public static MedicalAgentChatResponseBodyDataMessagesMetaData build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyDataMessagesMetaData self = new MedicalAgentChatResponseBodyDataMessagesMetaData();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaData setBarTitle(String barTitle) {
            this.barTitle = barTitle;
            return this;
        }
        public String getBarTitle() {
            return this.barTitle;
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaData setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaData setMultiLoad(java.util.List<MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad> multiLoad) {
            this.multiLoad = multiLoad;
            return this;
        }
        public java.util.List<MedicalAgentChatResponseBodyDataMessagesMetaDataMultiLoad> getMultiLoad() {
            return this.multiLoad;
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaData setSourceSeq(String sourceSeq) {
            this.sourceSeq = sourceSeq;
            return this;
        }
        public String getSourceSeq() {
            return this.sourceSeq;
        }

        public MedicalAgentChatResponseBodyDataMessagesMetaData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MedicalAgentChatResponseBodyDataMessages extends TeaModel {
        /**
         * <p>消息正文，具体结构随 mimeType 变化。流式快照可能包含到当前为止的完整正文，收到新快照时更新原内容，避免重复拼接。</p>
         * 
         * <strong>example:</strong>
         * <p>血红蛋白用于携带氧气。解读报告时可结合报告上的参考范围。</p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>可选的医疗进度或正文卡片信息，按所在消息的 mimeType 与实际返回类型解析。只需要正文时可忽略展示字段。</p>
         */
        @NameInMap("metaData")
        public MedicalAgentChatResponseBodyDataMessagesMetaData metaData;

        /**
         * <p>该消息的内容类型，用于选择解析和展示方式。multi_load/iframe 表示正文；遇到应用不支持的类型，可跳过该消息。</p>
         * 
         * <strong>example:</strong>
         * <p>multi_load/iframe</p>
         */
        @NameInMap("mimeType")
        public String mimeType;

        /**
         * <p>当前消息的处理状态。complete 表示这条消息已完成；流式请求是否结束以 SSE 结束事件为准。</p>
         * 
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("status")
        public String status;

        public static MedicalAgentChatResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyDataMessages self = new MedicalAgentChatResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyDataMessages setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public MedicalAgentChatResponseBodyDataMessages setMetaData(MedicalAgentChatResponseBodyDataMessagesMetaData metaData) {
            this.metaData = metaData;
            return this;
        }
        public MedicalAgentChatResponseBodyDataMessagesMetaData getMetaData() {
            return this.metaData;
        }

        public MedicalAgentChatResponseBodyDataMessages setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

        public MedicalAgentChatResponseBodyDataMessages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class MedicalAgentChatResponseBodyData extends TeaModel {
        /**
         * <p>可选业务调试信息，可为任意 JSON 值（含 null）。是否返回、返回时机和内容按实际执行结果，不保证每轮或结束事件必有；不用于判断业务完成。</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("debug")
        public Object debug;

        /**
         * <p>响应的可选补充信息。使用图片等资源时可读取 inputResources 中返回的对应资源信息。</p>
         */
        @NameInMap("extraInfo")
        public MedicalAgentChatResponseBodyDataExtraInfo extraInfo;

        /**
         * <p>当前响应中的消息列表。读取消息的 mimeType、status 和 content。完整正文可通过 mimeType=multi_load/iframe 且 status=complete 的消息取得。</p>
         */
        @NameInMap("messages")
        public java.util.List<MedicalAgentChatResponseBodyDataMessages> messages;

        public static MedicalAgentChatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyData self = new MedicalAgentChatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyData setDebug(Object debug) {
            this.debug = debug;
            return this;
        }
        public Object getDebug() {
            return this.debug;
        }

        public MedicalAgentChatResponseBodyData setExtraInfo(MedicalAgentChatResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public MedicalAgentChatResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public MedicalAgentChatResponseBodyData setMessages(java.util.List<MedicalAgentChatResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<MedicalAgentChatResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

    }

    public static class MedicalAgentChatResponseBodyError extends TeaModel {
        /**
         * <p>业务错误码，客户端可根据此字段判断错误类型。</p>
         * 
         * <strong>example:</strong>
         * <p>INVALID_REQUEST</p>
         */
        @NameInMap("code")
        public Object code;

        /**
         * <p>错误原因的文字说明，便于排查后调整请求。</p>
         * 
         * <strong>example:</strong>
         * <p>请求参数无效</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>失败请求的业务请求 ID，联系支持时可一并提供。</p>
         * 
         * <strong>example:</strong>
         * <p>med-req-001</p>
         */
        @NameInMap("requestId")
        public String requestId;

        public static MedicalAgentChatResponseBodyError build(java.util.Map<String, ?> map) throws Exception {
            MedicalAgentChatResponseBodyError self = new MedicalAgentChatResponseBodyError();
            return TeaModel.build(map, self);
        }

        public MedicalAgentChatResponseBodyError setCode(Object code) {
            this.code = code;
            return this;
        }
        public Object getCode() {
            return this.code;
        }

        public MedicalAgentChatResponseBodyError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MedicalAgentChatResponseBodyError setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
