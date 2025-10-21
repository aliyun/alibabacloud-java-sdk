// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class UpdatePolicyShrinkRequest extends TeaModel {
    @NameInMap("ContentSafeModelInstanceId")
    public Long contentSafeModelInstanceId;

    @NameInMap("EnableSensitiveInputCheck")
    public Integer enableSensitiveInputCheck;

    @NameInMap("EnableSensitiveOutputCheck")
    public Integer enableSensitiveOutputCheck;

    /**
     * <p>List of harmful category configurations</p>
     */
    @NameInMap("HarmfulCategoryConfigInfoList")
    public String harmfulCategoryConfigInfoListShrink;

    @NameInMap("InputSafeAnswer")
    public String inputSafeAnswer;

    @NameInMap("InputSafeAnswerSwitch")
    public Integer inputSafeAnswerSwitch;

    @NameInMap("IsSidecarPolicy")
    public Integer isSidecarPolicy;

    @NameInMap("OutputSafeAnswer")
    public String outputSafeAnswer;

    @NameInMap("OutputSafeAnswerSwitch")
    public Integer outputSafeAnswerSwitch;

    /**
     * <p>Detection policy ID</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>Detection policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>testPolicy</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>Prompt attack detection result object</p>
     */
    @NameInMap("PromptAttackInfo")
    public String promptAttackInfoShrink;

    /**
     * <p>List of prompt attacks</p>
     */
    @NameInMap("PromptAttackInfoList")
    public String promptAttackInfoListShrink;

    @NameInMap("PromptAttackModelInstanceId")
    public Long promptAttackModelInstanceId;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RegularExpressList")
    public String regularExpressListShrink;

    @NameInMap("SceneType")
    public Integer sceneType;

    @NameInMap("SensitiveConfigList")
    public String sensitiveConfigListShrink;

    @NameInMap("SensitiveTopicList")
    public String sensitiveTopicListShrink;

    @NameInMap("SensitiveTopicModelInstanceId")
    public Long sensitiveTopicModelInstanceId;

    @NameInMap("SensitiveWordList")
    public String sensitiveWordListShrink;

    /**
     * <p>List of sensitive topics</p>
     */
    @NameInMap("TopicConfigInfoList")
    public String topicConfigInfoListShrink;

    /**
     * <p>List of keyword group objects</p>
     */
    @NameInMap("WordGroupInfoList")
    public String wordGroupInfoListShrink;

    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static UpdatePolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyShrinkRequest self = new UpdatePolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyShrinkRequest setContentSafeModelInstanceId(Long contentSafeModelInstanceId) {
        this.contentSafeModelInstanceId = contentSafeModelInstanceId;
        return this;
    }
    public Long getContentSafeModelInstanceId() {
        return this.contentSafeModelInstanceId;
    }

    public UpdatePolicyShrinkRequest setEnableSensitiveInputCheck(Integer enableSensitiveInputCheck) {
        this.enableSensitiveInputCheck = enableSensitiveInputCheck;
        return this;
    }
    public Integer getEnableSensitiveInputCheck() {
        return this.enableSensitiveInputCheck;
    }

    public UpdatePolicyShrinkRequest setEnableSensitiveOutputCheck(Integer enableSensitiveOutputCheck) {
        this.enableSensitiveOutputCheck = enableSensitiveOutputCheck;
        return this;
    }
    public Integer getEnableSensitiveOutputCheck() {
        return this.enableSensitiveOutputCheck;
    }

    public UpdatePolicyShrinkRequest setHarmfulCategoryConfigInfoListShrink(String harmfulCategoryConfigInfoListShrink) {
        this.harmfulCategoryConfigInfoListShrink = harmfulCategoryConfigInfoListShrink;
        return this;
    }
    public String getHarmfulCategoryConfigInfoListShrink() {
        return this.harmfulCategoryConfigInfoListShrink;
    }

    public UpdatePolicyShrinkRequest setInputSafeAnswer(String inputSafeAnswer) {
        this.inputSafeAnswer = inputSafeAnswer;
        return this;
    }
    public String getInputSafeAnswer() {
        return this.inputSafeAnswer;
    }

    public UpdatePolicyShrinkRequest setInputSafeAnswerSwitch(Integer inputSafeAnswerSwitch) {
        this.inputSafeAnswerSwitch = inputSafeAnswerSwitch;
        return this;
    }
    public Integer getInputSafeAnswerSwitch() {
        return this.inputSafeAnswerSwitch;
    }

    public UpdatePolicyShrinkRequest setIsSidecarPolicy(Integer isSidecarPolicy) {
        this.isSidecarPolicy = isSidecarPolicy;
        return this;
    }
    public Integer getIsSidecarPolicy() {
        return this.isSidecarPolicy;
    }

    public UpdatePolicyShrinkRequest setOutputSafeAnswer(String outputSafeAnswer) {
        this.outputSafeAnswer = outputSafeAnswer;
        return this;
    }
    public String getOutputSafeAnswer() {
        return this.outputSafeAnswer;
    }

    public UpdatePolicyShrinkRequest setOutputSafeAnswerSwitch(Integer outputSafeAnswerSwitch) {
        this.outputSafeAnswerSwitch = outputSafeAnswerSwitch;
        return this;
    }
    public Integer getOutputSafeAnswerSwitch() {
        return this.outputSafeAnswerSwitch;
    }

    public UpdatePolicyShrinkRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public UpdatePolicyShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public UpdatePolicyShrinkRequest setPromptAttackInfoShrink(String promptAttackInfoShrink) {
        this.promptAttackInfoShrink = promptAttackInfoShrink;
        return this;
    }
    public String getPromptAttackInfoShrink() {
        return this.promptAttackInfoShrink;
    }

    public UpdatePolicyShrinkRequest setPromptAttackInfoListShrink(String promptAttackInfoListShrink) {
        this.promptAttackInfoListShrink = promptAttackInfoListShrink;
        return this;
    }
    public String getPromptAttackInfoListShrink() {
        return this.promptAttackInfoListShrink;
    }

    public UpdatePolicyShrinkRequest setPromptAttackModelInstanceId(Long promptAttackModelInstanceId) {
        this.promptAttackModelInstanceId = promptAttackModelInstanceId;
        return this;
    }
    public Long getPromptAttackModelInstanceId() {
        return this.promptAttackModelInstanceId;
    }

    public UpdatePolicyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePolicyShrinkRequest setRegularExpressListShrink(String regularExpressListShrink) {
        this.regularExpressListShrink = regularExpressListShrink;
        return this;
    }
    public String getRegularExpressListShrink() {
        return this.regularExpressListShrink;
    }

    public UpdatePolicyShrinkRequest setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public UpdatePolicyShrinkRequest setSensitiveConfigListShrink(String sensitiveConfigListShrink) {
        this.sensitiveConfigListShrink = sensitiveConfigListShrink;
        return this;
    }
    public String getSensitiveConfigListShrink() {
        return this.sensitiveConfigListShrink;
    }

    public UpdatePolicyShrinkRequest setSensitiveTopicListShrink(String sensitiveTopicListShrink) {
        this.sensitiveTopicListShrink = sensitiveTopicListShrink;
        return this;
    }
    public String getSensitiveTopicListShrink() {
        return this.sensitiveTopicListShrink;
    }

    public UpdatePolicyShrinkRequest setSensitiveTopicModelInstanceId(Long sensitiveTopicModelInstanceId) {
        this.sensitiveTopicModelInstanceId = sensitiveTopicModelInstanceId;
        return this;
    }
    public Long getSensitiveTopicModelInstanceId() {
        return this.sensitiveTopicModelInstanceId;
    }

    public UpdatePolicyShrinkRequest setSensitiveWordListShrink(String sensitiveWordListShrink) {
        this.sensitiveWordListShrink = sensitiveWordListShrink;
        return this;
    }
    public String getSensitiveWordListShrink() {
        return this.sensitiveWordListShrink;
    }

    public UpdatePolicyShrinkRequest setTopicConfigInfoListShrink(String topicConfigInfoListShrink) {
        this.topicConfigInfoListShrink = topicConfigInfoListShrink;
        return this;
    }
    public String getTopicConfigInfoListShrink() {
        return this.topicConfigInfoListShrink;
    }

    public UpdatePolicyShrinkRequest setWordGroupInfoListShrink(String wordGroupInfoListShrink) {
        this.wordGroupInfoListShrink = wordGroupInfoListShrink;
        return this;
    }
    public String getWordGroupInfoListShrink() {
        return this.wordGroupInfoListShrink;
    }

    public UpdatePolicyShrinkRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
