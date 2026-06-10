// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAgentProfileTemplateResponseBody extends TeaModel {
    /**
     * <p>API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public GetAgentProfileTemplateResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>API message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAgentProfileTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentProfileTemplateResponseBody self = new GetAgentProfileTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentProfileTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentProfileTemplateResponseBody setData(GetAgentProfileTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentProfileTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetAgentProfileTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAgentProfileTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentProfileTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentProfileTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentProfileTemplateResponseBodyData extends TeaModel {
        /**
         * <p>ID of the agent profile template.</p>
         * 
         * <strong>example:</strong>
         * <p>default-survey</p>
         */
        @NameInMap("AgentProfileTemplateId")
        public String agentProfileTemplateId;

        /**
         * <p>Time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1720766491000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Description of the agent profile template.</p>
         * 
         * <strong>example:</strong>
         * <p>说明</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Name of the agent profile template.</p>
         * 
         * <strong>example:</strong>
         * <p>问卷调查</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Agent profile template configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;name&quot;: &quot;promptSchema&quot;,
         *   &quot;properties&quot;: {
         *     &quot;name&quot;: {
         *       &quot;displayOrder&quot;: 1,
         *       &quot;displayName&quot;: &quot;名称&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;editorType&quot;: &quot;MENTIONS_TEXTAREA&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;placeholder&quot;: &quot;如：云小宝&quot;,
         *         &quot;rows&quot;: 1
         *       },
         *       &quot;group&quot;: &quot;人物与风格&quot;,
         *       &quot;maxLength&quot;: 100
         *     },
         *     &quot;gender&quot;: {
         *       &quot;displayOrder&quot;: 2,
         *       &quot;displayName&quot;: &quot;性别&quot;,
         *       &quot;description&quot;: &quot;此选项不会改变男女声音色，如需修改，请在【语音&amp;VUI】中的TTS音色模版中修改&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;editorType&quot;: &quot;SELECT&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;dataSource&quot;: [
         *           &quot;男&quot;,
         *           &quot;女&quot;,
         *           &quot;不指定&quot;
         *         ]
         *       },
         *       &quot;group&quot;: &quot;人物与风格&quot;,
         *       &quot;maxLength&quot;: 100
         *     },
         *     &quot;age&quot;: {
         *       &quot;displayOrder&quot;: 3,
         *       &quot;displayName&quot;: &quot;年龄&quot;,
         *       &quot;dataType&quot;: &quot;LONG&quot;,
         *       &quot;editorType&quot;: &quot;NUMBER&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;innerAfter&quot;: &quot;岁&quot;
         *       },
         *       &quot;group&quot;: &quot;人物与风格&quot;,
         *       &quot;maximum&quot;: 60,
         *       &quot;minimum&quot;: 18
         *     },
         *     &quot;role&quot;: {
         *       &quot;displayOrder&quot;: 3,
         *       &quot;displayName&quot;: &quot;身份&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;editorType&quot;: &quot;SELECTABLE_TAGS&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;mode&quot;: &quot;single&quot;,
         *         &quot;dataSource&quot;: [
         *           &quot;游戏推广员&quot;,
         *           &quot;活动运营员&quot;,
         *           &quot;医疗助理&quot;,
         *           &quot;审计专员&quot;,
         *           &quot;保险专员&quot;,
         *           &quot;行政助理&quot;
         *         ]
         *       },
         *       &quot;group&quot;: &quot;人物与风格&quot;,
         *       &quot;maxLength&quot;: 100
         *     },
         *     &quot;communicationStyle&quot;: {
         *       &quot;displayOrder&quot;: 4,
         *       &quot;displayName&quot;: &quot;沟通风格&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;editorType&quot;: &quot;SELECTABLE_TAGS&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;mode&quot;: &quot;multiple&quot;,
         *         &quot;dataSource&quot;: [
         *           &quot;亲切&quot;,
         *           &quot;自然&quot;,
         *           &quot;口语化&quot;,
         *           &quot;专业&quot;,
         *           &quot;活泼&quot;,
         *           &quot;严肃&quot;
         *         ]
         *       },
         *       &quot;group&quot;: &quot;人物与风格&quot;,
         *       &quot;maxLength&quot;: 100
         *     },
         *     &quot;goals&quot;: {
         *       &quot;displayOrder&quot;: 5,
         *       &quot;displayName&quot;: &quot;目标&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;editorType&quot;: &quot;MENTIONS_TEXTAREA&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;placeholder&quot;: &quot;描述此次呼叫的目的。例如，调研上次服务的满意度情况&quot;,
         *         &quot;rows&quot;: 5
         *       },
         *       &quot;group&quot;: &quot;业务描述&quot;,
         *       &quot;maxLength&quot;: 1000
         *     },
         *     &quot;background&quot;: {
         *       &quot;displayOrder&quot;: 7,
         *       &quot;displayName&quot;: &quot;背景&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;editorType&quot;: &quot;MENTIONS_TEXTAREA&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;placeholder&quot;: &quot;描述此次呼叫的背景，比如活动信息、FAQ等&quot;,
         *         &quot;rows&quot;: 10
         *       },
         *       &quot;group&quot;: &quot;业务描述&quot;,
         *       &quot;maxLength&quot;: 2000
         *     },
         *     &quot;openingPrompt&quot;: {
         *       &quot;displayOrder&quot;: 100,
         *       &quot;displayName&quot;: &quot;开场白&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;editorType&quot;: &quot;MENTIONS_TEXTAREA&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;placeholder&quot;: &quot;请输入开场白，支持变量&quot;,
         *         &quot;rows&quot;: 3,
         *         &quot;isAutoOptimizePrompt&quot;: true
         *       },
         *       &quot;group&quot;: &quot;业务描述&quot;,
         *       &quot;maxLength&quot;: 100,
         *       &quot;required&quot;: true
         *     },
         *     &quot;skills&quot;: {
         *       &quot;displayOrder&quot;: 9,
         *       &quot;displayName&quot;: &quot;技能&quot;,
         *       &quot;description&quot;: &quot;描述机器人能够执行的具体事项。例如\n<copy>技能1:核验用户身份\n技能2:进行活动推荐\n技能3:确认用户参与意向并礼貌挂机<copy>&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;editorType&quot;: &quot;MENTIONS_TEXTAREA&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;placeholder&quot;: &quot;描述机器人包含的能力\n例如：\n1.使用客服语气询问客户的产品满意度情况\n2.需要针对产品的易用性、性能、功能完善度、商品价格这4个纬度进行打分调研&quot;,
         *         &quot;rows&quot;: 5,
         *         &quot;isAutoOptimizePrompt&quot;: true,
         *         &quot;quickOptionsEnabled&quot;: true,
         *         &quot;apiPluginsEnabled&quot;: true
         *       },
         *       &quot;group&quot;: &quot;业务描述&quot;,
         *       &quot;maxLength&quot;: 1000
         *     },
         *     &quot;workflow&quot;: {
         *       &quot;displayOrder&quot;: 10,
         *       &quot;displayName&quot;: &quot;流程&quot;,
         *       &quot;description&quot;: &quot;描述机器人执行任务时，与客户交流的过程。例如\n<copy>根据预先设定的问题逻辑推进调研：\n1. 总体满意度：“首先，请问您对我们服务的整体满意度如何评价？非常满意、满意、一般、不满意还是非常不满意？”\n2. 服务亮点（若上一题为正面评价）：“很高兴听到您的满意！请问哪些方面让您感到特别满意呢？”\n3. 改进建议（若上一题为负面评价）：“非常抱歉给您带来了不便。您认为我们在哪方面可以做得更好？”\n4. 服务效率：“在服务响应速度和服务完成的时效性上，您的感受是怎样的？”\n5. 员工态度：“对于服务人员的专业度和态度，您有何评价？”\n6. 再次选择意愿：“基于此次体验，您未来是否会考虑再次使用我们的服务？”</copy>&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;editorType&quot;: &quot;MENTIONS_TEXTAREA&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;placeholder&quot;: &quot;描述工作流程&quot;,
         *         &quot;rows&quot;: 10,
         *         &quot;isAutoOptimizePrompt&quot;: true,
         *         &quot;quickOptionsEnabled&quot;: true,
         *         &quot;apiPluginsEnabled&quot;: true
         *       },
         *       &quot;group&quot;: &quot;业务描述&quot;,
         *       &quot;maxLength&quot;: 4000
         *     },
         *     &quot;constraint&quot;: {
         *       &quot;displayOrder&quot;: 11,
         *       &quot;displayName&quot;: &quot;约束&quot;,
         *       &quot;description&quot;: &quot;描述对话的约束或整体要求，例如\n<copy>你需要记住你的角色信息，并始终遵循。\n- 在整个通话过程中，保持语气的中立性和友好性，避免对受访者产生引导性影响。\n- 每轮对话不超过50个字，确保信息传达的高效性。\n- 严格遵守调研伦理，保证受访者信息的匿名性和隐私安全。\n- 避免在电话中深入讨论涉及个人隐私或具体服务细节的问题。\n- 用户询问的问题与目标或流程无关时， 请礼貌拒绝，并引导到目标问题上。\n- 只回复与本次任务相关的问题；对于不知道的问题，请不要胡乱回复，需要礼貌回复“不清楚”，并引导到目标问题上。</copy>&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;editorType&quot;: &quot;MENTIONS_TEXTAREA&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;placeholder&quot;: &quot;描述机器人交流过程中需要注意的问题，或异常情况下的回复参考\n例如：\n1.保持对话的专业客服行业专业术语和礼貌性，维护公司形象\n2.针对客服的情绪如不耐烦、生气等能够精准识别并及时停止调研&quot;,
         *         &quot;rows&quot;: 5,
         *         &quot;isAutoOptimizePrompt&quot;: true
         *       },
         *       &quot;group&quot;: &quot;业务描述&quot;,
         *       &quot;maxLength&quot;: 1000,
         *       &quot;defaultValue&quot;: &quot;- 当前时间：${currentTimeWithDayOfWeek}。\n- 星期和日期转换时，请用北京时间。\n- 如果不知道目标用户(客户)性别，则直接称呼目标用户(客户)姓名，不要尊称xx先生/女士。例如：不知道张三的性别，请直接称呼张三，不要称呼张三先生/女士。\n- 如果知道目标用户(客户)性别，直接称呼xx先生/女士。\n- 请严格按照流程步骤逐步执行，并确保所有步骤都已经执行，如果还存在没有执行的步骤，则需要再执行一次。&quot;
         *     },
         *     &quot;output&quot;: {
         *       &quot;displayOrder&quot;: 1000,
         *       &quot;displayName&quot;: &quot;输出&quot;,
         *       &quot;description&quot;: &quot;输出&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;editorType&quot;: &quot;MENTIONS_TEXTAREA&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;placeholder&quot;: &quot;- 无格式\n&quot;,
         *         &quot;rows&quot;: 10,
         *         &quot;isAutoOptimizePrompt&quot;: false
         *       },
         *       &quot;group&quot;: &quot;业务描述&quot;,
         *       &quot;maxLength&quot;: 2000,
         *       &quot;defaultValue&quot;: &quot;- 无格式\n&quot;,
         *       &quot;hidden&quot;: true
         *     },
         *     &quot;aiHangupOutput&quot;: {
         *       &quot;displayOrder&quot;: 1001,
         *       &quot;displayName&quot;: &quot;aiHangupOutput&quot;,
         *       &quot;description&quot;: &quot;aiHangupOutput&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;editorType&quot;: &quot;MENTIONS_TEXTAREA&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;placeholder&quot;: &quot;- 如果判断会话结束，则礼貌回复并追加#[HangUp]\n- 如果流程已执行完成，则礼貌回复并追加#[HangUp]\n- 如果大模型(机器人或者Bot)输出了再见，并且表示希望结束会话，则追加#[HangUp]&quot;,
         *         &quot;rows&quot;: 10,
         *         &quot;isAutoOptimizePrompt&quot;: false
         *       },
         *       &quot;group&quot;: &quot;业务描述&quot;,
         *       &quot;maxLength&quot;: 2000,
         *       &quot;defaultValue&quot;: &quot;- 如果判断会话结束，则礼貌回复并追加#[HangUp]\n- 如果流程已执行完成，则礼貌回复并追加#[HangUp]\n- 如果大模型(机器人或者Bot)输出了再见，并且表示希望结束会话，则追加#[HangUp]&quot;,
         *       &quot;hidden&quot;: true
         *     },
         *     &quot;aiSilenceTimeoutOutput&quot;: {
         *       &quot;displayOrder&quot;: 1002,
         *       &quot;displayName&quot;: &quot;aiSilenceTimeoutOutput&quot;,
         *       &quot;description&quot;: &quot;aiSilenceTimeoutOutput&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;editorType&quot;: &quot;MENTIONS_TEXTAREA&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;placeholder&quot;: &quot;- 如果用户没有说话，则礼貌回复用户。比如“抱歉，我听不到您讲话，请您再说一遍？“\n- 如果用户没有说话没有达到${aiSilenceTimeoutMaxCount}次，请不要结束会话，但需要进行礼貌回复。\n-如果用户没有说话达到${aiSilenceTimeoutMaxCount}次，则礼貌回复结束会话并追加#[HangUp]&quot;,
         *         &quot;rows&quot;: 10,
         *         &quot;isAutoOptimizePrompt&quot;: false
         *       },
         *       &quot;group&quot;: &quot;业务描述&quot;,
         *       &quot;maxLength&quot;: 2000,
         *       &quot;defaultValue&quot;: &quot;- 如果用户没有说话，则礼貌回复用户。比如“抱歉，我听不到您讲话，请您再说一遍？“\n- 如果用户没有说话没有达到${aiSilenceTimeoutMaxCount}次，请不要结束会话，但需要进行礼貌回复。\n-如果用户没有说话达到${aiSilenceTimeoutMaxCount}次，则礼貌回复结束会话并追加#[HangUp]&quot;,
         *       &quot;hidden&quot;: true
         *     }
         *   }
         * }</p>
         */
        @NameInMap("PromptSchema")
        public String promptSchema;

        /**
         * <p>Time when the template was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1720766491000</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetAgentProfileTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentProfileTemplateResponseBodyData self = new GetAgentProfileTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentProfileTemplateResponseBodyData setAgentProfileTemplateId(String agentProfileTemplateId) {
            this.agentProfileTemplateId = agentProfileTemplateId;
            return this;
        }
        public String getAgentProfileTemplateId() {
            return this.agentProfileTemplateId;
        }

        public GetAgentProfileTemplateResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAgentProfileTemplateResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgentProfileTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAgentProfileTemplateResponseBodyData setPromptSchema(String promptSchema) {
            this.promptSchema = promptSchema;
            return this;
        }
        public String getPromptSchema() {
            return this.promptSchema;
        }

        public GetAgentProfileTemplateResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
