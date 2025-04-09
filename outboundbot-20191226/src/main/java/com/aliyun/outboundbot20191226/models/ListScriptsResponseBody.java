// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scripts")
    public ListScriptsResponseBodyScripts scripts;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScriptsResponseBody self = new ListScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScriptsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScriptsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListScriptsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScriptsResponseBody setScripts(ListScriptsResponseBodyScripts scripts) {
        this.scripts = scripts;
        return this;
    }
    public ListScriptsResponseBodyScripts getScripts() {
        return this.scripts;
    }

    public ListScriptsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListScriptsResponseBodyScriptsList extends TeaModel {
        @NameInMap("AgentKey")
        public String agentKey;

        @NameInMap("AgentLlm")
        public Boolean agentLlm;

        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>DRAFTED</p>
         */
        @NameInMap("DebugStatus")
        public String debugStatus;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EmotionEnable")
        public Boolean emotionEnable;

        @NameInMap("Industry")
        public String industry;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDebugDrafted")
        public Boolean isDebugDrafted;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDrafted")
        public Boolean isDrafted;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsPreset")
        public Boolean isPreset;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LongWaitEnable")
        public Boolean longWaitEnable;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MiniPlaybackEnable")
        public Boolean miniPlaybackEnable;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NewBargeInEnable")
        public Boolean newBargeInEnable;

        @NameInMap("NluAccessType")
        public String nluAccessType;

        @NameInMap("NluEngine")
        public String nluEngine;

        @NameInMap("RejectReason")
        public String rejectReason;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("ScriptDescription")
        public String scriptDescription;

        /**
         * <strong>example:</strong>
         * <p>8d6a6e41-8093-49af-a9d1-0281878758ac</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <strong>example:</strong>
         * <p>DRAFTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1578965079000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("agentId")
        public Long agentId;

        public static ListScriptsResponseBodyScriptsList build(java.util.Map<String, ?> map) throws Exception {
            ListScriptsResponseBodyScriptsList self = new ListScriptsResponseBodyScriptsList();
            return TeaModel.build(map, self);
        }

        public ListScriptsResponseBodyScriptsList setAgentKey(String agentKey) {
            this.agentKey = agentKey;
            return this;
        }
        public String getAgentKey() {
            return this.agentKey;
        }

        public ListScriptsResponseBodyScriptsList setAgentLlm(Boolean agentLlm) {
            this.agentLlm = agentLlm;
            return this;
        }
        public Boolean getAgentLlm() {
            return this.agentLlm;
        }

        public ListScriptsResponseBodyScriptsList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListScriptsResponseBodyScriptsList setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public ListScriptsResponseBodyScriptsList setEmotionEnable(Boolean emotionEnable) {
            this.emotionEnable = emotionEnable;
            return this;
        }
        public Boolean getEmotionEnable() {
            return this.emotionEnable;
        }

        public ListScriptsResponseBodyScriptsList setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public ListScriptsResponseBodyScriptsList setIsDebugDrafted(Boolean isDebugDrafted) {
            this.isDebugDrafted = isDebugDrafted;
            return this;
        }
        public Boolean getIsDebugDrafted() {
            return this.isDebugDrafted;
        }

        public ListScriptsResponseBodyScriptsList setIsDrafted(Boolean isDrafted) {
            this.isDrafted = isDrafted;
            return this;
        }
        public Boolean getIsDrafted() {
            return this.isDrafted;
        }

        public ListScriptsResponseBodyScriptsList setIsPreset(Boolean isPreset) {
            this.isPreset = isPreset;
            return this;
        }
        public Boolean getIsPreset() {
            return this.isPreset;
        }

        public ListScriptsResponseBodyScriptsList setLongWaitEnable(Boolean longWaitEnable) {
            this.longWaitEnable = longWaitEnable;
            return this;
        }
        public Boolean getLongWaitEnable() {
            return this.longWaitEnable;
        }

        public ListScriptsResponseBodyScriptsList setMiniPlaybackEnable(Boolean miniPlaybackEnable) {
            this.miniPlaybackEnable = miniPlaybackEnable;
            return this;
        }
        public Boolean getMiniPlaybackEnable() {
            return this.miniPlaybackEnable;
        }

        public ListScriptsResponseBodyScriptsList setNewBargeInEnable(Boolean newBargeInEnable) {
            this.newBargeInEnable = newBargeInEnable;
            return this;
        }
        public Boolean getNewBargeInEnable() {
            return this.newBargeInEnable;
        }

        public ListScriptsResponseBodyScriptsList setNluAccessType(String nluAccessType) {
            this.nluAccessType = nluAccessType;
            return this;
        }
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        public ListScriptsResponseBodyScriptsList setNluEngine(String nluEngine) {
            this.nluEngine = nluEngine;
            return this;
        }
        public String getNluEngine() {
            return this.nluEngine;
        }

        public ListScriptsResponseBodyScriptsList setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }
        public String getRejectReason() {
            return this.rejectReason;
        }

        public ListScriptsResponseBodyScriptsList setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListScriptsResponseBodyScriptsList setScriptDescription(String scriptDescription) {
            this.scriptDescription = scriptDescription;
            return this;
        }
        public String getScriptDescription() {
            return this.scriptDescription;
        }

        public ListScriptsResponseBodyScriptsList setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListScriptsResponseBodyScriptsList setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public ListScriptsResponseBodyScriptsList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListScriptsResponseBodyScriptsList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListScriptsResponseBodyScriptsList setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

    }

    public static class ListScriptsResponseBodyScripts extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListScriptsResponseBodyScriptsList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListScriptsResponseBodyScripts build(java.util.Map<String, ?> map) throws Exception {
            ListScriptsResponseBodyScripts self = new ListScriptsResponseBodyScripts();
            return TeaModel.build(map, self);
        }

        public ListScriptsResponseBodyScripts setList(java.util.List<ListScriptsResponseBodyScriptsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListScriptsResponseBodyScriptsList> getList() {
            return this.list;
        }

        public ListScriptsResponseBodyScripts setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListScriptsResponseBodyScripts setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListScriptsResponseBodyScripts setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
