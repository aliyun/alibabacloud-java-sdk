// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateAnnotationMissionShrinkRequest extends TeaModel {
    /**
     * <p>The agent ID.</p>
     * <blockquote>
     * <p>You can obtain this ID from the \<code>DescribeInstance\\</code> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1168702</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The workspace key.</p>
     * <blockquote>
     * <p>You can obtain this key from the \<code>DescribeInstance\\</code> operation.</p>
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
     * <li>1: Outbound call</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AnnotationMissionDataSourceType")
    public Integer annotationMissionDataSourceType;

    /**
     * <p>The list of annotation data sources.</p>
     * <blockquote>
     * <p>This parameter has the same function as \<code>AnnotationMissionDebugDataSourceListJsonString\\</code>. You can specify either of them.</p>
     * </blockquote>
     */
    @NameInMap("AnnotationMissionDebugDataSourceList")
    public String annotationMissionDebugDataSourceListShrink;

    /**
     * <p>The JSON string for the test data.</p>
     * <blockquote>
     * <p>This parameter has the same function as \<code>AnnotationMissionDebugDataSourceList\\</code>. You can specify either of them. The format is \<code>[1]\\</code>, \<code>[2]\\</code>, or \<code>[1,2]\\</code>. You can specify multiple filter conditions in the array. The enumeration values are as follows:</p>
     * </blockquote>
     * <ul>
     * <li><p>1: Outbound call task</p>
     * </li>
     * <li><p>2: Test task</p>
     * </li>
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
     * <p>询问卖车-标注任务-20230506-112934</p>
     */
    @NameInMap("AnnotationMissionName")
    public String annotationMissionName;

    /**
     * <p>The bot ID.</p>
     * <blockquote>
     * <p>You can obtain this ID from the \<code>DescribeScript\\</code> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-fqEnFZBYnb</p>
     */
    @NameInMap("ChatbotId")
    public String chatbotId;

    /**
     * <p>The end time for filtering calls.</p>
     * 
     * <strong>example:</strong>
     * <p>1682956800000</p>
     */
    @NameInMap("ConversationTimeEndFilter")
    public Long conversationTimeEndFilter;

    /**
     * <p>The start time for filtering calls.</p>
     * 
     * <strong>example:</strong>
     * <p>1683302400000</p>
     */
    @NameInMap("ConversationTimeStartFilter")
    public Long conversationTimeStartFilter;

    /**
     * <p>Specifies whether to exclude call records that have been annotated in other tasks. If you do not specify this parameter, the default value is \<code>false\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExcludeOtherSession")
    public Boolean excludeOtherSession;

    /**
     * <p>Indicates whether the business process ended normally.</p>
     * <blockquote>
     * <p>This parameter takes effect only when \<code>SessionEndReasonFilterList\\</code> is not specified.</p>
     * <ul>
     * <li><p>\<code>true\\</code>: The call record is normal.</p>
     * </li>
     * <li><p>\<code>false\\</code>: The call did not end normally.</p>
     * </li>
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
     * <p>The custom sampling amount.</p>
     * <blockquote>
     * <p>This parameter is required and takes effect only when \<code>SamplingType\\</code> is set to 3. Otherwise, the task fails to be created.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SamplingCount")
    public Integer samplingCount;

    /**
     * <p>The sampling percentage.</p>
     * <blockquote>
     * <p>This parameter is required and takes effect only when \<code>SamplingType\\</code> is set to 2. Otherwise, the task fails to be created.</p>
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
     * <li><p>1: Full data</p>
     * </li>
     * <li><p>2: Percentage</p>
     * </li>
     * <li><p>3: Custom amount</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SamplingType")
    public Integer samplingType;

    /**
     * <p>The outbound scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6236f21e-2e04-4dad-a47b-ae77e6a48325</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The filter condition for call completion statuses.</p>
     * <blockquote>
     * <p>This parameter has the same function as \<code>SessionEndReasonFilterListJsonString\\</code>. You can specify either of them.</p>
     * </blockquote>
     */
    @NameInMap("SessionEndReasonFilterList")
    public java.util.List<Integer> sessionEndReasonFilterList;

    /**
     * <p>The filter condition for call completion statuses.</p>
     * <blockquote>
     * <p>This parameter has the same function as \<code>SessionEndReasonFilterList\\</code>. You can specify either of them. The format is \<code>[1]\\</code> or \<code>[1,2]\\</code>. You can specify multiple filter conditions in the array. The enumeration values for the filter conditions are as follows.</p>
     * </blockquote>
     * <p><strong>Enumeration values for filtering call records</strong></p>
     * <ul>
     * <li><p>1: The call ended normally.</p>
     * </li>
     * <li><p>2: The bot hung up after a recognition failure.</p>
     * </li>
     * <li><p>3: The call was hung up due to a silence timeout.</p>
     * </li>
     * <li><p>4: The user hung up after a recognition failure.</p>
     * </li>
     * <li><p>5: The user hung up for no reason.</p>
     * </li>
     * <li><p>6: The call was transferred to a manual agent after an intent was hit.</p>
     * </li>
     * <li><p>7: The call was transferred to a manual agent after a recognition failure.</p>
     * </li>
     * <li><p>8: No interaction from the user.</p>
     * </li>
     * <li><p>9: The call was interrupted by a system exception.</p>
     * </li>
     * <li><p>10: The call was transferred to an IVR after an intent was hit.</p>
     * </li>
     * <li><p>11: The call was transferred to an IVR after a recognition failure.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[1]</p>
     */
    @NameInMap("SessionEndReasonFilterListJsonString")
    public String sessionEndReasonFilterListJsonString;

    public static CreateAnnotationMissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAnnotationMissionShrinkRequest self = new CreateAnnotationMissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAnnotationMissionShrinkRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreateAnnotationMissionShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateAnnotationMissionShrinkRequest setAnnotationMissionDataSourceType(Integer annotationMissionDataSourceType) {
        this.annotationMissionDataSourceType = annotationMissionDataSourceType;
        return this;
    }
    public Integer getAnnotationMissionDataSourceType() {
        return this.annotationMissionDataSourceType;
    }

    public CreateAnnotationMissionShrinkRequest setAnnotationMissionDebugDataSourceListShrink(String annotationMissionDebugDataSourceListShrink) {
        this.annotationMissionDebugDataSourceListShrink = annotationMissionDebugDataSourceListShrink;
        return this;
    }
    public String getAnnotationMissionDebugDataSourceListShrink() {
        return this.annotationMissionDebugDataSourceListShrink;
    }

    public CreateAnnotationMissionShrinkRequest setAnnotationMissionDebugDataSourceListJsonString(String annotationMissionDebugDataSourceListJsonString) {
        this.annotationMissionDebugDataSourceListJsonString = annotationMissionDebugDataSourceListJsonString;
        return this;
    }
    public String getAnnotationMissionDebugDataSourceListJsonString() {
        return this.annotationMissionDebugDataSourceListJsonString;
    }

    public CreateAnnotationMissionShrinkRequest setAnnotationMissionName(String annotationMissionName) {
        this.annotationMissionName = annotationMissionName;
        return this;
    }
    public String getAnnotationMissionName() {
        return this.annotationMissionName;
    }

    public CreateAnnotationMissionShrinkRequest setChatbotId(String chatbotId) {
        this.chatbotId = chatbotId;
        return this;
    }
    public String getChatbotId() {
        return this.chatbotId;
    }

    public CreateAnnotationMissionShrinkRequest setConversationTimeEndFilter(Long conversationTimeEndFilter) {
        this.conversationTimeEndFilter = conversationTimeEndFilter;
        return this;
    }
    public Long getConversationTimeEndFilter() {
        return this.conversationTimeEndFilter;
    }

    public CreateAnnotationMissionShrinkRequest setConversationTimeStartFilter(Long conversationTimeStartFilter) {
        this.conversationTimeStartFilter = conversationTimeStartFilter;
        return this;
    }
    public Long getConversationTimeStartFilter() {
        return this.conversationTimeStartFilter;
    }

    public CreateAnnotationMissionShrinkRequest setExcludeOtherSession(Boolean excludeOtherSession) {
        this.excludeOtherSession = excludeOtherSession;
        return this;
    }
    public Boolean getExcludeOtherSession() {
        return this.excludeOtherSession;
    }

    public CreateAnnotationMissionShrinkRequest setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }
    public Boolean getFinished() {
        return this.finished;
    }

    public CreateAnnotationMissionShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAnnotationMissionShrinkRequest setSamplingCount(Integer samplingCount) {
        this.samplingCount = samplingCount;
        return this;
    }
    public Integer getSamplingCount() {
        return this.samplingCount;
    }

    public CreateAnnotationMissionShrinkRequest setSamplingRate(Integer samplingRate) {
        this.samplingRate = samplingRate;
        return this;
    }
    public Integer getSamplingRate() {
        return this.samplingRate;
    }

    public CreateAnnotationMissionShrinkRequest setSamplingType(Integer samplingType) {
        this.samplingType = samplingType;
        return this;
    }
    public Integer getSamplingType() {
        return this.samplingType;
    }

    public CreateAnnotationMissionShrinkRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public CreateAnnotationMissionShrinkRequest setSessionEndReasonFilterList(java.util.List<Integer> sessionEndReasonFilterList) {
        this.sessionEndReasonFilterList = sessionEndReasonFilterList;
        return this;
    }
    public java.util.List<Integer> getSessionEndReasonFilterList() {
        return this.sessionEndReasonFilterList;
    }

    public CreateAnnotationMissionShrinkRequest setSessionEndReasonFilterListJsonString(String sessionEndReasonFilterListJsonString) {
        this.sessionEndReasonFilterListJsonString = sessionEndReasonFilterListJsonString;
        return this;
    }
    public String getSessionEndReasonFilterListJsonString() {
        return this.sessionEndReasonFilterListJsonString;
    }

}
