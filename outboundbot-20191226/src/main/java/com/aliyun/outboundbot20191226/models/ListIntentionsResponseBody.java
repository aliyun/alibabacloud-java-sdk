// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListIntentionsResponseBody extends TeaModel {
    /**
     * <p>The status code of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListIntentionsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned by the operation.</p>
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
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListIntentionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntentionsResponseBody self = new ListIntentionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntentionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIntentionsResponseBody setData(ListIntentionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIntentionsResponseBodyData getData() {
        return this.data;
    }

    public ListIntentionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIntentionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIntentionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIntentionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIntentionsResponseBodyDataIntentListRuleCheck extends TeaModel {
        /**
         * <p>The error message.</p>
         */
        @NameInMap("Error")
        public java.util.List<String> error;

        /**
         * <p>Indicates whether strict matching is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Strict")
        public Boolean strict;

        /**
         * <p>The expression value.</p>
         * 
         * <strong>example:</strong>
         * <p>know</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The warning message.</p>
         */
        @NameInMap("Warning")
        public java.util.List<String> warning;

        public static ListIntentionsResponseBodyDataIntentListRuleCheck build(java.util.Map<String, ?> map) throws Exception {
            ListIntentionsResponseBodyDataIntentListRuleCheck self = new ListIntentionsResponseBodyDataIntentListRuleCheck();
            return TeaModel.build(map, self);
        }

        public ListIntentionsResponseBodyDataIntentListRuleCheck setError(java.util.List<String> error) {
            this.error = error;
            return this;
        }
        public java.util.List<String> getError() {
            return this.error;
        }

        public ListIntentionsResponseBodyDataIntentListRuleCheck setStrict(Boolean strict) {
            this.strict = strict;
            return this;
        }
        public Boolean getStrict() {
            return this.strict;
        }

        public ListIntentionsResponseBodyDataIntentListRuleCheck setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ListIntentionsResponseBodyDataIntentListRuleCheck setWarning(java.util.List<String> warning) {
            this.warning = warning;
            return this;
        }
        public java.util.List<String> getWarning() {
            return this.warning;
        }

    }

    public static class ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctionsSwitch extends TeaModel {
        /**
         * <p>The condition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b9932604-08ae-4525-bbe5-c8cce3066070</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The clarification prompt label.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL_SUB_QUERY</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The condition name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试0609_20241021_101018_复制_复制_复制</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>PASSKEY</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The condition value.</p>
         * 
         * <strong>example:</strong>
         * <p>BASE_VALIDATE_FILTER_SWITCH</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctionsSwitch build(java.util.Map<String, ?> map) throws Exception {
            ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctionsSwitch self = new ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctionsSwitch();
            return TeaModel.build(map, self);
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctionsSwitch setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctionsSwitch setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctionsSwitch setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctionsSwitch setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctionsSwitch setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions extends TeaModel {
        /**
         * <p>The Alibaba Cloud function name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AliyunFunction")
        public String aliyunFunction;

        /**
         * <p>The Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AliyunService")
        public String aliyunService;

        /**
         * <p>The status code of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The clarification description.</p>
         * 
         * <strong>example:</strong>
         * <p>GA setup for HPC cn4-HPC-EndUserServer-GlobalAccelerator</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou.log.aliyuncs.com</p>
         */
        @NameInMap("EndPoint")
        public String endPoint;

        /**
         * <p>The clarification function.</p>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The function name.</p>
         * 
         * <strong>example:</strong>
         * <p>方欣云呼系统每日拨测_2024年11月</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameters.</p>
         */
        @NameInMap("Params")
        public java.util.Map<String, ?> params;

        /**
         * <p>The feature switch. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enabled.</li>
         * <li><strong>off</strong>: Disabled.</li>
         * </ul>
         */
        @NameInMap("Switch")
        public java.util.List<ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctionsSwitch> _switch;

        /**
         * <p>The clarification type.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions build(java.util.Map<String, ?> map) throws Exception {
            ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions self = new ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions();
            return TeaModel.build(map, self);
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions setAliyunFunction(String aliyunFunction) {
            this.aliyunFunction = aliyunFunction;
            return this;
        }
        public String getAliyunFunction() {
            return this.aliyunFunction;
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions setAliyunService(String aliyunService) {
            this.aliyunService = aliyunService;
            return this;
        }
        public String getAliyunService() {
            return this.aliyunService;
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions set_switch(java.util.List<ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctionsSwitch> _switch) {
            this._switch = _switch;
            return this;
        }
        public java.util.List<ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctionsSwitch> get_switch() {
            return this._switch;
        }

        public ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListIntentionsResponseBodyDataIntentListSlotTags extends TeaModel {
        /**
         * <p>The unique identifier of the intent utterance corresponding to the label.</p>
         * 
         * <strong>example:</strong>
         * <p>17448458</p>
         */
        @NameInMap("UserSayId")
        public String userSayId;

        /**
         * <p>The tagging result of the intent utterance corresponding to the label.</p>
         * 
         * <strong>example:</strong>
         * <p>Do you know xxxx?</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListIntentionsResponseBodyDataIntentListSlotTags build(java.util.Map<String, ?> map) throws Exception {
            ListIntentionsResponseBodyDataIntentListSlotTags self = new ListIntentionsResponseBodyDataIntentListSlotTags();
            return TeaModel.build(map, self);
        }

        public ListIntentionsResponseBodyDataIntentListSlotTags setUserSayId(String userSayId) {
            this.userSayId = userSayId;
            return this;
        }
        public String getUserSayId() {
            return this.userSayId;
        }

        public ListIntentionsResponseBodyDataIntentListSlotTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIntentionsResponseBodyDataIntentListSlot extends TeaModel {
        /**
         * <p>The clarification functions.</p>
         * <blockquote>
         * <p>Notice: 无效内容</p>
         * </blockquote>
         */
        @NameInMap("FeedbackFunctions")
        public java.util.List<ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions> feedbackFunctions;

        /**
         * <p>The feedback type.</p>
         * <blockquote>
         * <p>Notice: 无效内容</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FeedbackType")
        public String feedbackType;

        /**
         * <p>The unique identifier of the slot.</p>
         * 
         * <strong>example:</strong>
         * <p>9ec31b50-32b8-11eb-9478-19d2d885afdb</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the slot is an array. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsArray")
        public Boolean isArray;

        /**
         * <p>Indicates whether the slot is encrypted.</p>
         * <blockquote>
         * <p>Notice: 无效内容</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsEncrypt")
        public Boolean isEncrypt;

        /**
         * <p>Indicates whether the slot is interactive.</p>
         * <blockquote>
         * <p>Notice: 无效内容</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsInteractive")
        public Boolean isInteractive;

        /**
         * <p>Indicates whether the slot is required. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsNecessary")
        public Boolean isNecessary;

        /**
         * <p>The slot life span.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LifeSpan")
        public Integer lifeSpan;

        /**
         * <p>The slot name.</p>
         * 
         * <strong>example:</strong>
         * <p>know</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The slot clarification prompts.</p>
         */
        @NameInMap("Question")
        public java.util.List<String> question;

        /**
         * <p>The slot tagging labels.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListIntentionsResponseBodyDataIntentListSlotTags> tags;

        /**
         * <p>The slot tagging result.</p>
         * 
         * <strong>example:</strong>
         * <p>@知道</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListIntentionsResponseBodyDataIntentListSlot build(java.util.Map<String, ?> map) throws Exception {
            ListIntentionsResponseBodyDataIntentListSlot self = new ListIntentionsResponseBodyDataIntentListSlot();
            return TeaModel.build(map, self);
        }

        public ListIntentionsResponseBodyDataIntentListSlot setFeedbackFunctions(java.util.List<ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions> feedbackFunctions) {
            this.feedbackFunctions = feedbackFunctions;
            return this;
        }
        public java.util.List<ListIntentionsResponseBodyDataIntentListSlotFeedbackFunctions> getFeedbackFunctions() {
            return this.feedbackFunctions;
        }

        public ListIntentionsResponseBodyDataIntentListSlot setFeedbackType(String feedbackType) {
            this.feedbackType = feedbackType;
            return this;
        }
        public String getFeedbackType() {
            return this.feedbackType;
        }

        public ListIntentionsResponseBodyDataIntentListSlot setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListIntentionsResponseBodyDataIntentListSlot setIsArray(Boolean isArray) {
            this.isArray = isArray;
            return this;
        }
        public Boolean getIsArray() {
            return this.isArray;
        }

        public ListIntentionsResponseBodyDataIntentListSlot setIsEncrypt(Boolean isEncrypt) {
            this.isEncrypt = isEncrypt;
            return this;
        }
        public Boolean getIsEncrypt() {
            return this.isEncrypt;
        }

        public ListIntentionsResponseBodyDataIntentListSlot setIsInteractive(Boolean isInteractive) {
            this.isInteractive = isInteractive;
            return this;
        }
        public Boolean getIsInteractive() {
            return this.isInteractive;
        }

        public ListIntentionsResponseBodyDataIntentListSlot setIsNecessary(Boolean isNecessary) {
            this.isNecessary = isNecessary;
            return this;
        }
        public Boolean getIsNecessary() {
            return this.isNecessary;
        }

        public ListIntentionsResponseBodyDataIntentListSlot setLifeSpan(Integer lifeSpan) {
            this.lifeSpan = lifeSpan;
            return this;
        }
        public Integer getLifeSpan() {
            return this.lifeSpan;
        }

        public ListIntentionsResponseBodyDataIntentListSlot setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntentionsResponseBodyDataIntentListSlot setQuestion(java.util.List<String> question) {
            this.question = question;
            return this;
        }
        public java.util.List<String> getQuestion() {
            return this.question;
        }

        public ListIntentionsResponseBodyDataIntentListSlot setTags(java.util.List<ListIntentionsResponseBodyDataIntentListSlotTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListIntentionsResponseBodyDataIntentListSlotTags> getTags() {
            return this.tags;
        }

        public ListIntentionsResponseBodyDataIntentListSlot setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIntentionsResponseBodyDataIntentListUserSayUserSayData extends TeaModel {
        /**
         * <p>The unique identifier of the slot.</p>
         * 
         * <strong>example:</strong>
         * <p>9ec31b50-32b8-11eb-9478-19d2d885afdb</p>
         */
        @NameInMap("SlotId")
        public String slotId;

        /**
         * <p>The utterance text.</p>
         * 
         * <strong>example:</strong>
         * <p>know</p>
         */
        @NameInMap("Text")
        public String text;

        public static ListIntentionsResponseBodyDataIntentListUserSayUserSayData build(java.util.Map<String, ?> map) throws Exception {
            ListIntentionsResponseBodyDataIntentListUserSayUserSayData self = new ListIntentionsResponseBodyDataIntentListUserSayUserSayData();
            return TeaModel.build(map, self);
        }

        public ListIntentionsResponseBodyDataIntentListUserSayUserSayData setSlotId(String slotId) {
            this.slotId = slotId;
            return this;
        }
        public String getSlotId() {
            return this.slotId;
        }

        public ListIntentionsResponseBodyDataIntentListUserSayUserSayData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ListIntentionsResponseBodyDataIntentListUserSay extends TeaModel {
        /**
         * <p>The source ID.</p>
         * <blockquote>
         * <p>Notice: 无效内容</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("FromId")
        public String fromId;

        /**
         * <p>The utterance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17448458</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether strict matching is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Strict")
        public Boolean strict;

        /**
         * <p>The list of user utterances.</p>
         */
        @NameInMap("UserSayData")
        public java.util.List<ListIntentionsResponseBodyDataIntentListUserSayUserSayData> userSayData;

        public static ListIntentionsResponseBodyDataIntentListUserSay build(java.util.Map<String, ?> map) throws Exception {
            ListIntentionsResponseBodyDataIntentListUserSay self = new ListIntentionsResponseBodyDataIntentListUserSay();
            return TeaModel.build(map, self);
        }

        public ListIntentionsResponseBodyDataIntentListUserSay setFromId(String fromId) {
            this.fromId = fromId;
            return this;
        }
        public String getFromId() {
            return this.fromId;
        }

        public ListIntentionsResponseBodyDataIntentListUserSay setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListIntentionsResponseBodyDataIntentListUserSay setStrict(Boolean strict) {
            this.strict = strict;
            return this;
        }
        public Boolean getStrict() {
            return this.strict;
        }

        public ListIntentionsResponseBodyDataIntentListUserSay setUserSayData(java.util.List<ListIntentionsResponseBodyDataIntentListUserSayUserSayData> userSayData) {
            this.userSayData = userSayData;
            return this;
        }
        public java.util.List<ListIntentionsResponseBodyDataIntentListUserSayUserSayData> getUserSayData() {
            return this.userSayData;
        }

    }

    public static class ListIntentionsResponseBodyDataIntentList extends TeaModel {
        /**
         * <p>The intent alias.</p>
         */
        @NameInMap("Alias")
        public java.util.List<String> alias;

        /**
         * <p>The robot ID. [Deprecated]</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-n7QmzrUnNe</p>
         */
        @NameInMap("BotId")
        public Long botId;

        /**
         * <p>The robot name.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("BotName")
        public String botName;

        /**
         * <p>The dialog flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50099</p>
         */
        @NameInMap("DialogId")
        public String dialogId;

        /**
         * <p>The intent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10717802</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The language.</p>
         * <ul>
         * <li>English: en-us</li>
         * <li>Chinese: zh-cn</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-cn</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The intent name.</p>
         * 
         * <strong>example:</strong>
         * <p>Got it</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The LGF intent utterance expressions.</p>
         */
        @NameInMap("RuleCheck")
        public java.util.List<ListIntentionsResponseBodyDataIntentListRuleCheck> ruleCheck;

        /**
         * <p>The intent slot information.</p>
         */
        @NameInMap("Slot")
        public java.util.List<ListIntentionsResponseBodyDataIntentListSlot> slot;

        /**
         * <p>The table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>43258</p>
         */
        @NameInMap("TableId")
        public Long tableId;

        /**
         * <p>The intent type. Valid values:</p>
         * <ul>
         * <li>0: normal intent. </li>
         * <li>1: UNKNOWN. </li>
         * <li>2: TableQA intent. </li>
         * <li>3: generated from a standard intent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The list of user utterances.</p>
         */
        @NameInMap("UserSay")
        public java.util.List<ListIntentionsResponseBodyDataIntentListUserSay> userSay;

        public static ListIntentionsResponseBodyDataIntentList build(java.util.Map<String, ?> map) throws Exception {
            ListIntentionsResponseBodyDataIntentList self = new ListIntentionsResponseBodyDataIntentList();
            return TeaModel.build(map, self);
        }

        public ListIntentionsResponseBodyDataIntentList setAlias(java.util.List<String> alias) {
            this.alias = alias;
            return this;
        }
        public java.util.List<String> getAlias() {
            return this.alias;
        }

        public ListIntentionsResponseBodyDataIntentList setBotId(Long botId) {
            this.botId = botId;
            return this;
        }
        public Long getBotId() {
            return this.botId;
        }

        public ListIntentionsResponseBodyDataIntentList setBotName(String botName) {
            this.botName = botName;
            return this;
        }
        public String getBotName() {
            return this.botName;
        }

        public ListIntentionsResponseBodyDataIntentList setDialogId(String dialogId) {
            this.dialogId = dialogId;
            return this;
        }
        public String getDialogId() {
            return this.dialogId;
        }

        public ListIntentionsResponseBodyDataIntentList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIntentionsResponseBodyDataIntentList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListIntentionsResponseBodyDataIntentList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntentionsResponseBodyDataIntentList setRuleCheck(java.util.List<ListIntentionsResponseBodyDataIntentListRuleCheck> ruleCheck) {
            this.ruleCheck = ruleCheck;
            return this;
        }
        public java.util.List<ListIntentionsResponseBodyDataIntentListRuleCheck> getRuleCheck() {
            return this.ruleCheck;
        }

        public ListIntentionsResponseBodyDataIntentList setSlot(java.util.List<ListIntentionsResponseBodyDataIntentListSlot> slot) {
            this.slot = slot;
            return this;
        }
        public java.util.List<ListIntentionsResponseBodyDataIntentListSlot> getSlot() {
            return this.slot;
        }

        public ListIntentionsResponseBodyDataIntentList setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

        public ListIntentionsResponseBodyDataIntentList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListIntentionsResponseBodyDataIntentList setUserSay(java.util.List<ListIntentionsResponseBodyDataIntentListUserSay> userSay) {
            this.userSay = userSay;
            return this;
        }
        public java.util.List<ListIntentionsResponseBodyDataIntentListUserSay> getUserSay() {
            return this.userSay;
        }

    }

    public static class ListIntentionsResponseBodyData extends TeaModel {
        /**
         * <p>The robot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-n7QmzrUnNe</p>
         */
        @NameInMap("BotId")
        public String botId;

        /**
         * <p>The list of intents.</p>
         */
        @NameInMap("IntentList")
        public java.util.List<ListIntentionsResponseBodyDataIntentList> intentList;

        /**
         * <p>The message returned by the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ListIntentionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIntentionsResponseBodyData self = new ListIntentionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIntentionsResponseBodyData setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public ListIntentionsResponseBodyData setIntentList(java.util.List<ListIntentionsResponseBodyDataIntentList> intentList) {
            this.intentList = intentList;
            return this;
        }
        public java.util.List<ListIntentionsResponseBodyDataIntentList> getIntentList() {
            return this.intentList;
        }

        public ListIntentionsResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListIntentionsResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
