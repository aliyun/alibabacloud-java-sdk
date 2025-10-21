// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class CreatePolicyShrinkRequest extends TeaModel {
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

    /**
     * <p>Workspace ID</p>
     * 
     * <strong>example:</strong>
     * <p>608226</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static CreatePolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyShrinkRequest self = new CreatePolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyShrinkRequest setContentSafeModelInstanceId(Long contentSafeModelInstanceId) {
        this.contentSafeModelInstanceId = contentSafeModelInstanceId;
        return this;
    }
    public Long getContentSafeModelInstanceId() {
        return this.contentSafeModelInstanceId;
    }

    public CreatePolicyShrinkRequest setEnableSensitiveInputCheck(Integer enableSensitiveInputCheck) {
        this.enableSensitiveInputCheck = enableSensitiveInputCheck;
        return this;
    }
    public Integer getEnableSensitiveInputCheck() {
        return this.enableSensitiveInputCheck;
    }

    public CreatePolicyShrinkRequest setEnableSensitiveOutputCheck(Integer enableSensitiveOutputCheck) {
        this.enableSensitiveOutputCheck = enableSensitiveOutputCheck;
        return this;
    }
    public Integer getEnableSensitiveOutputCheck() {
        return this.enableSensitiveOutputCheck;
    }

    public CreatePolicyShrinkRequest setHarmfulCategoryConfigInfoListShrink(String harmfulCategoryConfigInfoListShrink) {
        this.harmfulCategoryConfigInfoListShrink = harmfulCategoryConfigInfoListShrink;
        return this;
    }
    public String getHarmfulCategoryConfigInfoListShrink() {
        return this.harmfulCategoryConfigInfoListShrink;
    }

    public CreatePolicyShrinkRequest setInputSafeAnswer(String inputSafeAnswer) {
        this.inputSafeAnswer = inputSafeAnswer;
        return this;
    }
    public String getInputSafeAnswer() {
        return this.inputSafeAnswer;
    }

    public CreatePolicyShrinkRequest setInputSafeAnswerSwitch(Integer inputSafeAnswerSwitch) {
        this.inputSafeAnswerSwitch = inputSafeAnswerSwitch;
        return this;
    }
    public Integer getInputSafeAnswerSwitch() {
        return this.inputSafeAnswerSwitch;
    }

    public CreatePolicyShrinkRequest setIsSidecarPolicy(Integer isSidecarPolicy) {
        this.isSidecarPolicy = isSidecarPolicy;
        return this;
    }
    public Integer getIsSidecarPolicy() {
        return this.isSidecarPolicy;
    }

    public CreatePolicyShrinkRequest setOutputSafeAnswer(String outputSafeAnswer) {
        this.outputSafeAnswer = outputSafeAnswer;
        return this;
    }
    public String getOutputSafeAnswer() {
        return this.outputSafeAnswer;
    }

    public CreatePolicyShrinkRequest setOutputSafeAnswerSwitch(Integer outputSafeAnswerSwitch) {
        this.outputSafeAnswerSwitch = outputSafeAnswerSwitch;
        return this;
    }
    public Integer getOutputSafeAnswerSwitch() {
        return this.outputSafeAnswerSwitch;
    }

    public CreatePolicyShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreatePolicyShrinkRequest setPromptAttackInfoShrink(String promptAttackInfoShrink) {
        this.promptAttackInfoShrink = promptAttackInfoShrink;
        return this;
    }
    public String getPromptAttackInfoShrink() {
        return this.promptAttackInfoShrink;
    }

    public CreatePolicyShrinkRequest setPromptAttackInfoListShrink(String promptAttackInfoListShrink) {
        this.promptAttackInfoListShrink = promptAttackInfoListShrink;
        return this;
    }
    public String getPromptAttackInfoListShrink() {
        return this.promptAttackInfoListShrink;
    }

    public CreatePolicyShrinkRequest setPromptAttackModelInstanceId(Long promptAttackModelInstanceId) {
        this.promptAttackModelInstanceId = promptAttackModelInstanceId;
        return this;
    }
    public Long getPromptAttackModelInstanceId() {
        return this.promptAttackModelInstanceId;
    }

    public CreatePolicyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePolicyShrinkRequest setRegularExpressListShrink(String regularExpressListShrink) {
        this.regularExpressListShrink = regularExpressListShrink;
        return this;
    }
    public String getRegularExpressListShrink() {
        return this.regularExpressListShrink;
    }

    public CreatePolicyShrinkRequest setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public CreatePolicyShrinkRequest setSensitiveConfigListShrink(String sensitiveConfigListShrink) {
        this.sensitiveConfigListShrink = sensitiveConfigListShrink;
        return this;
    }
    public String getSensitiveConfigListShrink() {
        return this.sensitiveConfigListShrink;
    }

    public CreatePolicyShrinkRequest setSensitiveTopicListShrink(String sensitiveTopicListShrink) {
        this.sensitiveTopicListShrink = sensitiveTopicListShrink;
        return this;
    }
    public String getSensitiveTopicListShrink() {
        return this.sensitiveTopicListShrink;
    }

    public CreatePolicyShrinkRequest setSensitiveTopicModelInstanceId(Long sensitiveTopicModelInstanceId) {
        this.sensitiveTopicModelInstanceId = sensitiveTopicModelInstanceId;
        return this;
    }
    public Long getSensitiveTopicModelInstanceId() {
        return this.sensitiveTopicModelInstanceId;
    }

    public CreatePolicyShrinkRequest setSensitiveWordListShrink(String sensitiveWordListShrink) {
        this.sensitiveWordListShrink = sensitiveWordListShrink;
        return this;
    }
    public String getSensitiveWordListShrink() {
        return this.sensitiveWordListShrink;
    }

    public CreatePolicyShrinkRequest setTopicConfigInfoListShrink(String topicConfigInfoListShrink) {
        this.topicConfigInfoListShrink = topicConfigInfoListShrink;
        return this;
    }
    public String getTopicConfigInfoListShrink() {
        return this.topicConfigInfoListShrink;
    }

    public CreatePolicyShrinkRequest setWordGroupInfoListShrink(String wordGroupInfoListShrink) {
        this.wordGroupInfoListShrink = wordGroupInfoListShrink;
        return this;
    }
    public String getWordGroupInfoListShrink() {
        return this.wordGroupInfoListShrink;
    }

    public CreatePolicyShrinkRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
