// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateAnnotationMissionRequest extends TeaModel {
    /**
     * <p>The agent ID.</p>
     * <blockquote>
     * <p>You can obtain this value from the DescribeInstance operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1168702</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The business space key.</p>
     * <blockquote>
     * <p>You can obtain this value from the DescribeInstance operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>9137ab9c27044921860030adf8590ec4_p_outbound_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The data type of the annotation task.</p>
     * <ul>
     * <li>1: outbound call</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AnnotationMissionDataSourceType")
    public Integer annotationMissionDataSourceType;

    /**
     * <p>The annotation data source list.</p>
     * <blockquote>
     * <p>This parameter has the same function as AnnotationMissionDebugDataSourceListJsonString. Specify either one of them.</p>
     * </blockquote>
     */
    @NameInMap("AnnotationMissionDebugDataSourceList")
    public java.util.List<Integer> annotationMissionDebugDataSourceList;

    /**
     * <p>The debug data in JSON format.</p>
     * <blockquote>
     * <p>This parameter has the same function as AnnotationMissionDebugDataSourceList. Specify either one of them. The format is [1], [2], or [1,2]. You can specify multiple filter conditions in the array. The enum values for the filter conditions are as follows.</p>
     * </blockquote>
     * <ul>
     * <li>1: outbound call task</li>
     * <li>2: test task</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[1]</p>
     */
    @NameInMap("AnnotationMissionDebugDataSourceListJsonString")
    public String annotationMissionDebugDataSourceListJsonString;

    /**
     * <p>The name of the annotation task.</p>
     * 
     * <strong>example:</strong>
     * <p>CarSaleInquiry-AnnotationTask-20230506-112934</p>
     */
    @NameInMap("AnnotationMissionName")
    public String annotationMissionName;

    /**
     * <p>The robot ID.</p>
     * <blockquote>
     * <p>You can obtain this value from the DescribeScript operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-fqEnFZBYnb</p>
     */
    @NameInMap("ChatbotId")
    public String chatbotId;

    /**
     * <p>The end time for the call time filter.</p>
     * 
     * <strong>example:</strong>
     * <p>1682956800000</p>
     */
    @NameInMap("ConversationTimeEndFilter")
    public Long conversationTimeEndFilter;

    /**
     * <p>The start time for the call time filter.</p>
     * 
     * <strong>example:</strong>
     * <p>1683302400000</p>
     */
    @NameInMap("ConversationTimeStartFilter")
    public Long conversationTimeStartFilter;

    /**
     * <p>Specifies whether to exclude call records that have been annotated by other tasks. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExcludeOtherSession")
    public Boolean excludeOtherSession;

    /**
     * <p>Specifies whether the business ended normally.</p>
     * <blockquote>
     * <p>This parameter takes effect only when SessionEndReasonFilterList is not specified.</p>
     * <ul>
     * <li>true: normal call records</li>
     * <li>false: abnormal call records</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Finished")
    public Boolean finished;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bf3b51a5-e88a-4636-98b0-1a34725a085b</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The custom sampling quantity.</p>
     * <blockquote>
     * <p>This parameter takes effect only when SamplingType is set to 3. This parameter is required in that case. Otherwise, the creation fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SamplingCount")
    public Integer samplingCount;

    /**
     * <p>The sampling ratio.</p>
     * <blockquote>
     * <p>This parameter takes effect only when SamplingType is set to 2. This parameter is required in that case. Otherwise, the creation fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SamplingRate")
    public Integer samplingRate;

    /**
     * <p>The sampling type.</p>
     * <ul>
     * <li>1: full</li>
     * <li>2: percentage</li>
     * <li>3: custom quantity</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SamplingType")
    public Integer samplingType;

    /**
     * <p>The outbound call scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6236f21e-2e04-4dad-a47b-ae77e6a48325</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The call result status filter conditions.</p>
     * <blockquote>
     * <p>This parameter has the same function as SessionEndReasonFilterListJsonString. Specify either one of them.</p>
     * </blockquote>
     */
    @NameInMap("SessionEndReasonFilterList")
    public java.util.List<Integer> sessionEndReasonFilterList;

    /**
     * <p>The call result status filter conditions.</p>
     * <blockquote>
     * <p>This parameter has the same function as SessionEndReasonFilterList. Specify either one of them. The format is [1], [1,2], etc. You can specify multiple filter conditions in the array. The enum values for the filter conditions are as follows.</p>
     * </blockquote>
     * <p><strong>Call record filter enum values</strong></p>
     * <ul>
     * <li>1: normal completion</li>
     * <li>2: robot hung up after recognition rejection</li>
     * <li>3: hung up due to silence timeout</li>
     * <li>4: user hung up after recognition rejection</li>
     * <li>5: user hung up without reason</li>
     * <li>6: transferred to agent by intent match</li>
     * <li>7: transferred to agent by recognition rejection</li>
     * <li>8: no interaction on user side</li>
     * <li>9: system exception interruption</li>
     * <li>10: transferred to IVR by intent match</li>
     * <li>11: transferred to IVR by recognition rejection</li>
     * </ul>
     * 
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
