// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The paginated list of scripts.</p>
     */
    @NameInMap("Scripts")
    public ListScriptsResponseBodyScripts scripts;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
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

    public static class ListScriptsResponseBodyScriptsListNluProfile extends TeaModel {
        /**
         * <p>The function name.</p>
         * 
         * <strong>example:</strong>
         * <p>sanfang_test</p>
         */
        @NameInMap("FcFunction")
        public String fcFunction;

        /**
         * <p>The URL of the function trigger.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://sanfang_test-xxxxxx.cn-shanghai-vpc.fcapp.run">http://sanfang_test-xxxxxx.cn-shanghai-vpc.fcapp.run</a></p>
         */
        @NameInMap("FcHttpTriggerUrl")
        public String fcHttpTriggerUrl;

        /**
         * <p>The function region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("FcRegion")
        public String fcRegion;

        public static ListScriptsResponseBodyScriptsListNluProfile build(java.util.Map<String, ?> map) throws Exception {
            ListScriptsResponseBodyScriptsListNluProfile self = new ListScriptsResponseBodyScriptsListNluProfile();
            return TeaModel.build(map, self);
        }

        public ListScriptsResponseBodyScriptsListNluProfile setFcFunction(String fcFunction) {
            this.fcFunction = fcFunction;
            return this;
        }
        public String getFcFunction() {
            return this.fcFunction;
        }

        public ListScriptsResponseBodyScriptsListNluProfile setFcHttpTriggerUrl(String fcHttpTriggerUrl) {
            this.fcHttpTriggerUrl = fcHttpTriggerUrl;
            return this;
        }
        public String getFcHttpTriggerUrl() {
            return this.fcHttpTriggerUrl;
        }

        public ListScriptsResponseBodyScriptsListNluProfile setFcRegion(String fcRegion) {
            this.fcRegion = fcRegion;
            return this;
        }
        public String getFcRegion() {
            return this.fcRegion;
        }

    }

    public static class ListScriptsResponseBodyScriptsList extends TeaModel {
        /**
         * <p>The agent access key.</p>
         * 
         * <strong>example:</strong>
         * <p>14791f5f226b4878b3d9b676a0291234</p>
         */
        @NameInMap("AgentKey")
        public String agentKey;

        /**
         * <p>Indicates whether the agent is an LLM agent.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AgentLlm")
        public Boolean agentLlm;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1578965079000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The debug status.</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFTED</p>
         */
        @NameInMap("DebugStatus")
        public String debugStatus;

        /**
         * <p>Indicates whether emotion detection is enabled. This parameter is always false for LLM-based scripts.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EmotionEnable")
        public Boolean emotionEnable;

        /**
         * <p>The industry.</p>
         * 
         * <strong>example:</strong>
         * <p>金融</p>
         */
        @NameInMap("Industry")
        public String industry;

        /**
         * <p>Indicates whether the debug version of the script is a draft.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDebugDrafted")
        public Boolean isDebugDrafted;

        /**
         * <p>Indicates whether the script is a draft.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDrafted")
        public Boolean isDrafted;

        /**
         * <p>Indicates whether the script is for a preset scene.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsPreset")
        public Boolean isPreset;

        /**
         * <p>Indicates whether long wait is enabled. This parameter is always false for LLM-based scripts.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LongWaitEnable")
        public Boolean longWaitEnable;

        /**
         * <p>Indicates whether mini playback is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MiniPlaybackEnable")
        public Boolean miniPlaybackEnable;

        /**
         * <p>Indicates whether graceful barge-in is enabled. This parameter is always false for LLM-based scripts.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NewBargeInEnable")
        public Boolean newBargeInEnable;

        /**
         * <p>The NLU access type, which is set to Managed for LLM scenarios and is empty for small model scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>空或者Managed</p>
         */
        @NameInMap("NluAccessType")
        public String nluAccessType;

        /**
         * <p>The NLU engine, which is set to Prompts for LLM scenarios and is empty for small model scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>空或者Prompts</p>
         */
        @NameInMap("NluEngine")
        public String nluEngine;

        /**
         * <p>The Function Compute configuration for function calling mode.</p>
         */
        @NameInMap("NluProfile")
        public ListScriptsResponseBodyScriptsListNluProfile nluProfile;

        /**
         * <p>The rejection reason.</p>
         * 
         * <strong>example:</strong>
         * <p>话术用语不合规</p>
         */
        @NameInMap("RejectReason")
        public String rejectReason;

        /**
         * <p>The scene.</p>
         * 
         * <strong>example:</strong>
         * <p>电销</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The script description.</p>
         * 
         * <strong>example:</strong>
         * <p>电话销售话术</p>
         */
        @NameInMap("ScriptDescription")
        public String scriptDescription;

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8d6a6e41-8093-49af-a9d1-0281878758ac</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The script name.</p>
         * 
         * <strong>example:</strong>
         * <p>电话销售话术</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <p>The script status.</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1578965079000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1160195</p>
         */
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

        public ListScriptsResponseBodyScriptsList setNluProfile(ListScriptsResponseBodyScriptsListNluProfile nluProfile) {
            this.nluProfile = nluProfile;
            return this;
        }
        public ListScriptsResponseBodyScriptsListNluProfile getNluProfile() {
            return this.nluProfile;
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
        /**
         * <p>The list of scripts.</p>
         */
        @NameInMap("List")
        public java.util.List<ListScriptsResponseBodyScriptsList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of scripts.</p>
         * 
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
