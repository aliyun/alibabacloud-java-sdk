// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class ListMmAppResponseBody extends TeaModel {
    @NameInMap("AppInfoList")
    public java.util.List<ListMmAppResponseBodyAppInfoList> appInfoList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListMmAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMmAppResponseBody self = new ListMmAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMmAppResponseBody setAppInfoList(java.util.List<ListMmAppResponseBodyAppInfoList> appInfoList) {
        this.appInfoList = appInfoList;
        return this;
    }
    public java.util.List<ListMmAppResponseBodyAppInfoList> getAppInfoList() {
        return this.appInfoList;
    }

    public ListMmAppResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMmAppResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMmAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMmAppResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMmAppResponseBodyAppInfoListConversationConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AsrModel")
        public String asrModel;

        @NameInMap("OpenAsr")
        public Boolean openAsr;

        @NameInMap("OpenTts")
        public Boolean openTts;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("TtsModel")
        public String ttsModel;

        public static ListMmAppResponseBodyAppInfoListConversationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMmAppResponseBodyAppInfoListConversationConfig self = new ListMmAppResponseBodyAppInfoListConversationConfig();
            return TeaModel.build(map, self);
        }

        public ListMmAppResponseBodyAppInfoListConversationConfig setAsrModel(String asrModel) {
            this.asrModel = asrModel;
            return this;
        }
        public String getAsrModel() {
            return this.asrModel;
        }

        public ListMmAppResponseBodyAppInfoListConversationConfig setOpenAsr(Boolean openAsr) {
            this.openAsr = openAsr;
            return this;
        }
        public Boolean getOpenAsr() {
            return this.openAsr;
        }

        public ListMmAppResponseBodyAppInfoListConversationConfig setOpenTts(Boolean openTts) {
            this.openTts = openTts;
            return this;
        }
        public Boolean getOpenTts() {
            return this.openTts;
        }

        public ListMmAppResponseBodyAppInfoListConversationConfig setTtsModel(String ttsModel) {
            this.ttsModel = ttsModel;
            return this;
        }
        public String getTtsModel() {
            return this.ttsModel;
        }

    }

    public static class ListMmAppResponseBodyAppInfoListModelConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HistoryLimit")
        public String historyLimit;

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
         * <p>xxx</p>
         */
        @NameInMap("TextModal")
        public String textModal;

        public static ListMmAppResponseBodyAppInfoListModelConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMmAppResponseBodyAppInfoListModelConfig self = new ListMmAppResponseBodyAppInfoListModelConfig();
            return TeaModel.build(map, self);
        }

        public ListMmAppResponseBodyAppInfoListModelConfig setHistoryLimit(String historyLimit) {
            this.historyLimit = historyLimit;
            return this;
        }
        public String getHistoryLimit() {
            return this.historyLimit;
        }

        public ListMmAppResponseBodyAppInfoListModelConfig setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ListMmAppResponseBodyAppInfoListModelConfig setOpenWebSearch(Boolean openWebSearch) {
            this.openWebSearch = openWebSearch;
            return this;
        }
        public Boolean getOpenWebSearch() {
            return this.openWebSearch;
        }

        public ListMmAppResponseBodyAppInfoListModelConfig setTextModal(String textModal) {
            this.textModal = textModal;
            return this;
        }
        public String getTextModal() {
            return this.textModal;
        }

    }

    public static class ListMmAppResponseBodyAppInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mm_xxxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>多模态</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ConversationConfig")
        public ListMmAppResponseBodyAppInfoListConversationConfig conversationConfig;

        /**
         * <strong>example:</strong>
         * <p>454564</p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
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
        public ListMmAppResponseBodyAppInfoListModelConfig modelConfig;

        /**
         * <strong>example:</strong>
         * <p>56445</p>
         */
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ModifyUserName")
        public String modifyUserName;

        /**
         * <strong>example:</strong>
         * <p>提示词</p>
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
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static ListMmAppResponseBodyAppInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListMmAppResponseBodyAppInfoList self = new ListMmAppResponseBodyAppInfoList();
            return TeaModel.build(map, self);
        }

        public ListMmAppResponseBodyAppInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListMmAppResponseBodyAppInfoList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMmAppResponseBodyAppInfoList setConversationConfig(ListMmAppResponseBodyAppInfoListConversationConfig conversationConfig) {
            this.conversationConfig = conversationConfig;
            return this;
        }
        public ListMmAppResponseBodyAppInfoListConversationConfig getConversationConfig() {
            return this.conversationConfig;
        }

        public ListMmAppResponseBodyAppInfoList setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListMmAppResponseBodyAppInfoList setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListMmAppResponseBodyAppInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMmAppResponseBodyAppInfoList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMmAppResponseBodyAppInfoList setModelConfig(ListMmAppResponseBodyAppInfoListModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public ListMmAppResponseBodyAppInfoListModelConfig getModelConfig() {
            return this.modelConfig;
        }

        public ListMmAppResponseBodyAppInfoList setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListMmAppResponseBodyAppInfoList setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public ListMmAppResponseBodyAppInfoList setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public ListMmAppResponseBodyAppInfoList setPublishVersion(Long publishVersion) {
            this.publishVersion = publishVersion;
            return this;
        }
        public Long getPublishVersion() {
            return this.publishVersion;
        }

        public ListMmAppResponseBodyAppInfoList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
