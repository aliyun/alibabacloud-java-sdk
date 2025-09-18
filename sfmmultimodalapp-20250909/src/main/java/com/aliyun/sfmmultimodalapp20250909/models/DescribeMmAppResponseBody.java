// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DescribeMmAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mm_xxxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>多模态应用xxxx</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ConversationConfig")
    public DescribeMmAppResponseBodyConversationConfig conversationConfig;

    /**
     * <strong>example:</strong>
     * <p>243433</p>
     */
    @NameInMap("CreateUserId")
    public String createUserId;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("CreateUserName")
    public String createUserName;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("ModelConfig")
    public DescribeMmAppResponseBodyModelConfig modelConfig;

    /**
     * <strong>example:</strong>
     * <p>56673435</p>
     */
    @NameInMap("ModifyUserId")
    public String modifyUserId;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("ModifyUserName")
    public String modifyUserName;

    /**
     * <strong>example:</strong>
     * <p>提示词xxxx</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PublishVersion")
    public Long publishVersion;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeMmAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMmAppResponseBody self = new DescribeMmAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMmAppResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeMmAppResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeMmAppResponseBody setConversationConfig(DescribeMmAppResponseBodyConversationConfig conversationConfig) {
        this.conversationConfig = conversationConfig;
        return this;
    }
    public DescribeMmAppResponseBodyConversationConfig getConversationConfig() {
        return this.conversationConfig;
    }

    public DescribeMmAppResponseBody setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public DescribeMmAppResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribeMmAppResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeMmAppResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeMmAppResponseBody setModelConfig(DescribeMmAppResponseBodyModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public DescribeMmAppResponseBodyModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public DescribeMmAppResponseBody setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
        return this;
    }
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    public DescribeMmAppResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeMmAppResponseBody setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public DescribeMmAppResponseBody setPublishVersion(Long publishVersion) {
        this.publishVersion = publishVersion;
        return this;
    }
    public Long getPublishVersion() {
        return this.publishVersion;
    }

    public DescribeMmAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMmAppResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeMmAppResponseBodyConversationConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("AsrModel")
        public String asrModel;

        @NameInMap("OpenAsr")
        public Boolean openAsr;

        @NameInMap("OpenTts")
        public Boolean openTts;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("TtsModel")
        public String ttsModel;

        public static DescribeMmAppResponseBodyConversationConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeMmAppResponseBodyConversationConfig self = new DescribeMmAppResponseBodyConversationConfig();
            return TeaModel.build(map, self);
        }

        public DescribeMmAppResponseBodyConversationConfig setAsrModel(String asrModel) {
            this.asrModel = asrModel;
            return this;
        }
        public String getAsrModel() {
            return this.asrModel;
        }

        public DescribeMmAppResponseBodyConversationConfig setOpenAsr(Boolean openAsr) {
            this.openAsr = openAsr;
            return this;
        }
        public Boolean getOpenAsr() {
            return this.openAsr;
        }

        public DescribeMmAppResponseBodyConversationConfig setOpenTts(Boolean openTts) {
            this.openTts = openTts;
            return this;
        }
        public Boolean getOpenTts() {
            return this.openTts;
        }

        public DescribeMmAppResponseBodyConversationConfig setTtsModel(String ttsModel) {
            this.ttsModel = ttsModel;
            return this;
        }
        public String getTtsModel() {
            return this.ttsModel;
        }

    }

    public static class DescribeMmAppResponseBodyModelConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HistoryLimit")
        public Integer historyLimit;

        /**
         * <strong>example:</strong>
         * <p>MMH</p>
         */
        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("OpenWebSearch")
        public Boolean openWebSearch;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("TextModal")
        public String textModal;

        public static DescribeMmAppResponseBodyModelConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeMmAppResponseBodyModelConfig self = new DescribeMmAppResponseBodyModelConfig();
            return TeaModel.build(map, self);
        }

        public DescribeMmAppResponseBodyModelConfig setHistoryLimit(Integer historyLimit) {
            this.historyLimit = historyLimit;
            return this;
        }
        public Integer getHistoryLimit() {
            return this.historyLimit;
        }

        public DescribeMmAppResponseBodyModelConfig setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public DescribeMmAppResponseBodyModelConfig setOpenWebSearch(Boolean openWebSearch) {
            this.openWebSearch = openWebSearch;
            return this;
        }
        public Boolean getOpenWebSearch() {
            return this.openWebSearch;
        }

        public DescribeMmAppResponseBodyModelConfig setTextModal(String textModal) {
            this.textModal = textModal;
            return this;
        }
        public String getTextModal() {
            return this.textModal;
        }

    }

}
