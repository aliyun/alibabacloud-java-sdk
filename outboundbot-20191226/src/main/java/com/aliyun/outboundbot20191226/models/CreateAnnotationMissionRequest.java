// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateAnnotationMissionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1168702</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>9137ab9c27044921860030adf8590ec4_p_outbound_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AnnotationMissionDataSourceType")
    public Integer annotationMissionDataSourceType;

    @NameInMap("AnnotationMissionDebugDataSourceList")
    public java.util.List<Integer> annotationMissionDebugDataSourceList;

    /**
     * <strong>example:</strong>
     * <p>[1]</p>
     */
    @NameInMap("AnnotationMissionDebugDataSourceListJsonString")
    public String annotationMissionDebugDataSourceListJsonString;

    @NameInMap("AnnotationMissionName")
    public String annotationMissionName;

    /**
     * <strong>example:</strong>
     * <p>chatbot-cn-fqEnFZBYnb</p>
     */
    @NameInMap("ChatbotId")
    public String chatbotId;

    /**
     * <strong>example:</strong>
     * <p>1682956800000</p>
     */
    @NameInMap("ConversationTimeEndFilter")
    public Long conversationTimeEndFilter;

    /**
     * <strong>example:</strong>
     * <p>1683302400000</p>
     */
    @NameInMap("ConversationTimeStartFilter")
    public Long conversationTimeStartFilter;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExcludeOtherSession")
    public Boolean excludeOtherSession;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Finished")
    public Boolean finished;

    /**
     * <strong>example:</strong>
     * <p>bf3b51a5-e88a-4636-98b0-1a34725a085b</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SamplingCount")
    public Integer samplingCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SamplingRate")
    public Integer samplingRate;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SamplingType")
    public Integer samplingType;

    /**
     * <strong>example:</strong>
     * <p>6236f21e-2e04-4dad-a47b-ae77e6a48325</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    @NameInMap("SessionEndReasonFilterList")
    public java.util.List<Integer> sessionEndReasonFilterList;

    /**
     * <strong>example:</strong>
     * <p>[1]</p>
     */
    @NameInMap("SessionEndReasonFilterListJsonString")
    public String sessionEndReasonFilterListJsonString;

    public static CreateAnnotationMissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAnnotationMissionRequest self = new CreateAnnotationMissionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAnnotationMissionRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreateAnnotationMissionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateAnnotationMissionRequest setAnnotationMissionDataSourceType(Integer annotationMissionDataSourceType) {
        this.annotationMissionDataSourceType = annotationMissionDataSourceType;
        return this;
    }
    public Integer getAnnotationMissionDataSourceType() {
        return this.annotationMissionDataSourceType;
    }

    public CreateAnnotationMissionRequest setAnnotationMissionDebugDataSourceList(java.util.List<Integer> annotationMissionDebugDataSourceList) {
        this.annotationMissionDebugDataSourceList = annotationMissionDebugDataSourceList;
        return this;
    }
    public java.util.List<Integer> getAnnotationMissionDebugDataSourceList() {
        return this.annotationMissionDebugDataSourceList;
    }

    public CreateAnnotationMissionRequest setAnnotationMissionDebugDataSourceListJsonString(String annotationMissionDebugDataSourceListJsonString) {
        this.annotationMissionDebugDataSourceListJsonString = annotationMissionDebugDataSourceListJsonString;
        return this;
    }
    public String getAnnotationMissionDebugDataSourceListJsonString() {
        return this.annotationMissionDebugDataSourceListJsonString;
    }

    public CreateAnnotationMissionRequest setAnnotationMissionName(String annotationMissionName) {
        this.annotationMissionName = annotationMissionName;
        return this;
    }
    public String getAnnotationMissionName() {
        return this.annotationMissionName;
    }

    public CreateAnnotationMissionRequest setChatbotId(String chatbotId) {
        this.chatbotId = chatbotId;
        return this;
    }
    public String getChatbotId() {
        return this.chatbotId;
    }

    public CreateAnnotationMissionRequest setConversationTimeEndFilter(Long conversationTimeEndFilter) {
        this.conversationTimeEndFilter = conversationTimeEndFilter;
        return this;
    }
    public Long getConversationTimeEndFilter() {
        return this.conversationTimeEndFilter;
    }

    public CreateAnnotationMissionRequest setConversationTimeStartFilter(Long conversationTimeStartFilter) {
        this.conversationTimeStartFilter = conversationTimeStartFilter;
        return this;
    }
    public Long getConversationTimeStartFilter() {
        return this.conversationTimeStartFilter;
    }

    public CreateAnnotationMissionRequest setExcludeOtherSession(Boolean excludeOtherSession) {
        this.excludeOtherSession = excludeOtherSession;
        return this;
    }
    public Boolean getExcludeOtherSession() {
        return this.excludeOtherSession;
    }

    public CreateAnnotationMissionRequest setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }
    public Boolean getFinished() {
        return this.finished;
    }

    public CreateAnnotationMissionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAnnotationMissionRequest setSamplingCount(Integer samplingCount) {
        this.samplingCount = samplingCount;
        return this;
    }
    public Integer getSamplingCount() {
        return this.samplingCount;
    }

    public CreateAnnotationMissionRequest setSamplingRate(Integer samplingRate) {
        this.samplingRate = samplingRate;
        return this;
    }
    public Integer getSamplingRate() {
        return this.samplingRate;
    }

    public CreateAnnotationMissionRequest setSamplingType(Integer samplingType) {
        this.samplingType = samplingType;
        return this;
    }
    public Integer getSamplingType() {
        return this.samplingType;
    }

    public CreateAnnotationMissionRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public CreateAnnotationMissionRequest setSessionEndReasonFilterList(java.util.List<Integer> sessionEndReasonFilterList) {
        this.sessionEndReasonFilterList = sessionEndReasonFilterList;
        return this;
    }
    public java.util.List<Integer> getSessionEndReasonFilterList() {
        return this.sessionEndReasonFilterList;
    }

    public CreateAnnotationMissionRequest setSessionEndReasonFilterListJsonString(String sessionEndReasonFilterListJsonString) {
        this.sessionEndReasonFilterListJsonString = sessionEndReasonFilterListJsonString;
        return this;
    }
    public String getSessionEndReasonFilterListJsonString() {
        return this.sessionEndReasonFilterListJsonString;
    }

}
