// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyAgentProfileShrinkRequest extends TeaModel {
    /**
     * <p>Agent configuration ID</p>
     * <blockquote>
     * <p>Get the agent configuration ID for created scenarios from the ChatbotId return parameter of DescribeScript.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>37ca3ca1ac4b4e57adf3da5b5d939d04</p>
     */
    @NameInMap("AgentProfileId")
    public String agentProfileId;

    /**
     * <p>API plug-in configuration</p>
     * <blockquote>
     * <p>To bind multiple APIs, get the UUIDs of multiple APIs through ListApiPlugins and fill them in the format [{&quot;uuid&quot;:&quot;xxx&quot;},{&quot;uuid&quot;:&quot;xxxx&quot;&quot;},....].</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;uuid&quot;:&quot;a55d171da96c41a************&quot;},{&quot;uuid&quot;:&quot;d41a3e5195d1402********&quot;}]</p>
     */
    @NameInMap("ApiPluginJson")
    public String apiPluginJson;

    /**
     * <p>Description</p>
     * 
     * <strong>example:</strong>
     * <p>第一版本提交审核</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>FAQ category ID</p>
     */
    @NameInMap("FaqCategoryIds")
    public String faqCategoryIdsShrink;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Instruction configuration</p>
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;type&quot;: &quot;TransferToAgent&quot;,
     *     &quot;instructions&quot;: [{
     *         &quot;code&quot;: &quot;Transfer0&quot;,
     *         &quot;skillGroupId&quot;: &quot;testcode&quot;,
     *         &quot;skillGroupName&quot;: &quot;skillgroup&quot;
     *     }],
     *     &quot;timeoutEnable&quot;: false
     * }, {
     *     &quot;type&quot;: &quot;CollectNumber&quot;,
     *     &quot;instructions&quot;: [{
     *         &quot;code&quot;: &quot;DTMF0&quot;,
     *         &quot;name&quot;: &quot;收号测试&quot;,
     *         &quot;collectVoice&quot;: true,
     *         &quot;terminator&quot;: &quot;#&quot;
     *     }]
     * }]</p>
     */
    @NameInMap("InstructionJson")
    public String instructionJson;

    /**
     * <p>Label description</p>
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;name&quot;: &quot;是否满意&quot;,
     *     &quot;description&quot;: &quot;对介绍的游戏内容是否感兴趣&quot;,
     *     &quot;valueList&quot;: &quot;[\&quot;有兴趣\&quot;,\&quot;没兴趣\&quot;]&quot;
     * }]</p>
     */
    @NameInMap("LabelsJson")
    public String labelsJson;

    /**
     * <p>Model ID</p>
     * 
     * <strong>example:</strong>
     * <p>model_001</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>Model configuration</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ModelConfig")
    public String modelConfig;

    /**
     * <p>Prompt (Professional Mode)</p>
     * 
     * <strong>example:</strong>
     * <p>\n名称：安妮 \n身份：游戏推广员\n背景：通过电话向玩家宣传最新福利活动，确保每一位玩家都能及时掌握信息，享受游戏的乐趣。\n技能：作为游戏客服，向用户推荐限时游戏福利活动，强调福利亮点并告知参与流程。\n约束条件：你需要记住你是安妮，来自于热门游戏客服团队，专注于通过电话向玩家宣传最新福利活动。\n作为主动联系玩家的客服，需要根据玩家是否想了解活动的意图来选择是否介绍。\n保持通话的专业性，同时语言平易近人，确保玩家轻松理解活动内容。\n明确活动的起止时间，确保玩家不会混淆。\n强调活动的重点奖励和参与方式，提升玩家的参与兴趣。</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>Agent configuration</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;name&quot;: &quot;安妮&quot;,
     *     &quot;gender&quot;: &quot;女&quot;,
     *     &quot;age&quot;: 20,
     *     &quot;role&quot;: &quot;游戏推广员&quot;,
     *     &quot;communicationStyle&quot;: [&quot;亲切&quot;, &quot;口语化&quot;, &quot;活泼&quot;],
     *     &quot;goals&quot;: &quot;通过电话向玩家宣传最新福利活动，确保每一位玩家都能及时掌握信息，享受游戏的乐趣。&quot;,
     *     &quot;background&quot;: &quot;福利介绍\n从${开始时间}开始，直至${结束时间}结束，为期一周的时间里，我们精心准备了\&quot;限时寻宝\&quot;福利活动。只要您在这段时间内每日登录游戏，即可领取登录礼包，内含珍稀材料、能量药剂和限定外观奖励\n\n福利亮点\n本次活动的亮点在于，累积登录达到5天的玩家，将额外获得一份\&quot;神秘宝箱\&quot;，开启宝箱获得稀有宠物，将为您的战斗增添强大助力！千万别错过这次增强实力的绝佳机会。\n\n参与方式\n登录游戏后，在活动面板中找到\&quot;限时寻宝\&quot;，点击即可领取对应的奖励。记得每天上线，奖励不等人哦！&quot;,
     *     &quot;skills&quot;: &quot;作为游戏客服，向用户推荐限时游戏福利活动，强调福利亮点并告知参与流程。&quot;,
     *     &quot;workflow&quot;: &quot;1.亲切问候与自我介绍\n- 开场白：“尊敬的冒险者，您好！我是安妮，来自游戏客服团队。今天有幸与您连线，是想分享一项即将启动的独家福利活动，绝对会让您的探险之旅更加精彩纷呈！”\n- 确认玩家想了解活动后，再进行福利活动的介绍\n2.福利活动介绍\n3.强调福利亮点\n4.说明参与方式与提醒\n5.鼓励分享与反馈\n- 互动号召：“如果您觉得这个活动不错，不妨和您的公会伙伴或者游戏朋友分享这个好消息。同时，我们也非常欢迎您在活动结束后，通过游戏内置的反馈系统告诉我们您的体验感受和建议。”\n技能6: 礼貌结束通话\n- 结束语：“好了，尊敬的冒险者，以上就是这次活动的主要内容。希望您能在活动中满载而归，祝您在旅程中所向披靡！如果还有任何疑问，欢迎随时联系我们客服团队。感谢您的接听，期待再次为您服务，再见！”&quot;,
     *     &quot;constraint&quot;: &quot;你需要记住你是安妮，来自于热门游戏客服团队，专注于通过电话向玩家宣传最新福利活动。\n作为主动联系玩家的客服，需要根据玩家是否想了解活动的意图来选择是否介绍。\n保持通话的专业性，同时语言平易近人，确保玩家轻松理解活动内容。\n明确活动的起止时间，确保玩家不会混淆。\n强调活动的重点奖励和参与方式，提升玩家的参与兴趣。\n鼓励玩家间的互动和反馈，以促进游戏社区的活跃度。\n结束通话时保持礼貌，给玩家留下良好印象。\n用户询问的问题与目标或流程无关时， 请礼貌拒绝，并引导到目标问题上。\n对于不知道的问题，请不要胡乱回复，需要礼貌回复“不清楚”，并引导到目标问题上。&quot;,
     *     &quot;openingPrompt&quot;: &quot;尊敬的冒险者，您好！我是安妮，来自游戏客服团队。今天有幸与您连线，是想分享一项即将启动的独家福利活动，绝对会让您的探险之旅更加精彩纷呈！&quot;,
     *     &quot;output&quot;: &quot;&quot;,
     *     &quot;aiHangupOutput&quot;: &quot;&quot;,
     *     &quot;aiSilenceTimeoutOutput&quot;: &quot;&quot;
     * }</p>
     */
    @NameInMap("PromptJson")
    public String promptJson;

    /**
     * <p>Scenario</p>
     * 
     * <strong>example:</strong>
     * <p>测试场景</p>
     */
    @NameInMap("Scenario")
    public String scenario;

    /**
     * <p>Variable configuration</p>
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;name&quot;: &quot;开始时间&quot;,
     *     &quot;description&quot;: &quot;开始时间&quot;
     * }, {
     *     &quot;name&quot;: &quot;结束时间&quot;,
     *     &quot;description&quot;: &quot;结束时间&quot;
     * }]</p>
     */
    @NameInMap("VariablesJson")
    public String variablesJson;

    public static ModifyAgentProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgentProfileShrinkRequest self = new ModifyAgentProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAgentProfileShrinkRequest setAgentProfileId(String agentProfileId) {
        this.agentProfileId = agentProfileId;
        return this;
    }
    public String getAgentProfileId() {
        return this.agentProfileId;
    }

    public ModifyAgentProfileShrinkRequest setApiPluginJson(String apiPluginJson) {
        this.apiPluginJson = apiPluginJson;
        return this;
    }
    public String getApiPluginJson() {
        return this.apiPluginJson;
    }

    public ModifyAgentProfileShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAgentProfileShrinkRequest setFaqCategoryIdsShrink(String faqCategoryIdsShrink) {
        this.faqCategoryIdsShrink = faqCategoryIdsShrink;
        return this;
    }
    public String getFaqCategoryIdsShrink() {
        return this.faqCategoryIdsShrink;
    }

    public ModifyAgentProfileShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAgentProfileShrinkRequest setInstructionJson(String instructionJson) {
        this.instructionJson = instructionJson;
        return this;
    }
    public String getInstructionJson() {
        return this.instructionJson;
    }

    public ModifyAgentProfileShrinkRequest setLabelsJson(String labelsJson) {
        this.labelsJson = labelsJson;
        return this;
    }
    public String getLabelsJson() {
        return this.labelsJson;
    }

    public ModifyAgentProfileShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ModifyAgentProfileShrinkRequest setModelConfig(String modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public String getModelConfig() {
        return this.modelConfig;
    }

    public ModifyAgentProfileShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public ModifyAgentProfileShrinkRequest setPromptJson(String promptJson) {
        this.promptJson = promptJson;
        return this;
    }
    public String getPromptJson() {
        return this.promptJson;
    }

    public ModifyAgentProfileShrinkRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public ModifyAgentProfileShrinkRequest setVariablesJson(String variablesJson) {
        this.variablesJson = variablesJson;
        return this;
    }
    public String getVariablesJson() {
        return this.variablesJson;
    }

}
