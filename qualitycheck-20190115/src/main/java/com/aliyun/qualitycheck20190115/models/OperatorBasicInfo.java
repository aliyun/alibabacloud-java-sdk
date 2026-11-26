// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class OperatorBasicInfo extends TeaModel {
    /**
     * <p>The primary key ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The operator name.</p>
     * 
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The primary key ID or the frontend-generated ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("Oid")
    public String oid;

    /**
     * <p>The operator parameters.</p>
     */
    @NameInMap("Param")
    public OperatorBasicInfoParam param;

    /**
     * <p>The quality check type. Valid values:</p>
     * <ul>
     * <li>0: Offline quality check.</li>
     * <li>1: Real-time quality check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("QualityCheckType")
    public Integer qualityCheckType;

    /**
     * <p>The operator type.</p>
     * 
     * <strong>example:</strong>
     * <p>HIT_ANY_KEYWORDS</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The user group.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("UserGroup")
    public String userGroup;

    public static OperatorBasicInfo build(java.util.Map<String, ?> map) throws Exception {
        OperatorBasicInfo self = new OperatorBasicInfo();
        return TeaModel.build(map, self);
    }

    public OperatorBasicInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public OperatorBasicInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OperatorBasicInfo setOid(String oid) {
        this.oid = oid;
        return this;
    }
    public String getOid() {
        return this.oid;
    }

    public OperatorBasicInfo setParam(OperatorBasicInfoParam param) {
        this.param = param;
        return this;
    }
    public OperatorBasicInfoParam getParam() {
        return this.param;
    }

    public OperatorBasicInfo setQualityCheckType(Integer qualityCheckType) {
        this.qualityCheckType = qualityCheckType;
        return this;
    }
    public Integer getQualityCheckType() {
        return this.qualityCheckType;
    }

    public OperatorBasicInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OperatorBasicInfo setUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }
    public String getUserGroup() {
        return this.userGroup;
    }

    public static class OperatorBasicInfoParamDimensions extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Checks whether impolite or non-standard opening remarks are used in customer service conversations, which affects service professionalism</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The quality check dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>Inappropriate opening remarks</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <p>The exclusion condition.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer service representatives must use the official standard dialect during service</p>
         */
        @NameInMap("ExcludeCondition")
        public String excludeCondition;

        /**
         * <p>The hit condition.</p>
         * 
         * <strong>example:</strong>
         * <p>Non-standard and impolite greetings such as &quot;Hey&quot; appear at the beginning of the conversation</p>
         */
        @NameInMap("IncludeCondition")
        public String includeCondition;

        public static OperatorBasicInfoParamDimensions build(java.util.Map<String, ?> map) throws Exception {
            OperatorBasicInfoParamDimensions self = new OperatorBasicInfoParamDimensions();
            return TeaModel.build(map, self);
        }

        public OperatorBasicInfoParamDimensions setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public OperatorBasicInfoParamDimensions setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public OperatorBasicInfoParamDimensions setExcludeCondition(String excludeCondition) {
            this.excludeCondition = excludeCondition;
            return this;
        }
        public String getExcludeCondition() {
            return this.excludeCondition;
        }

        public OperatorBasicInfoParamDimensions setIncludeCondition(String includeCondition) {
            this.includeCondition = includeCondition;
            return this;
        }
        public String getIncludeCondition() {
            return this.includeCondition;
        }

    }

    public static class OperatorBasicInfoParam extends TeaModel {
        /**
         * <p>The answer hit threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("AnswerThreshold")
        public String answerThreshold;

        /**
         * <p>The Ant model information.</p>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("AntModelInfo")
        public java.util.Map<String, String> antModelInfo;

        /**
         * <p>Specifies whether to calculate the average speech rate for the entire conversation during speech rate detection. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Average")
        public Boolean average;

        /**
         * <p>The start type for duration calculation in the duration operator. Specifies whether the calculation starts from the beginning of the recording or the beginning of a specific dialogue.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BeginType")
        public String beginType;

        /**
         * <p>The bot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-xxx</p>
         */
        @NameInMap("BotId")
        public String botId;

        /**
         * <p>Specifies whether the match is case-sensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Case_sensitive")
        public Boolean caseSensitive;

        /**
         * <p>The knowledge category path.</p>
         * 
         * <strong>example:</strong>
         * <p>Deprecated field</p>
         */
        @NameInMap("CategoryPathCode")
        public String categoryPathCode;

        /**
         * <p>Specifies whether to check the first sentence for silence detection.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CheckFirstSentence")
        public Boolean checkFirstSentence;

        /**
         * <p>The check type. Default value: 1. Valid values:</p>
         * <ul>
         * <li>1: Energy fluctuation between adjacent sentences.</li>
         * <li>2: Maximum energy span.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckType")
        public Integer checkType;

        /**
         * <p>The comparison operator. Valid values: gt: Greater than. lt: Less than.</p>
         * 
         * <strong>example:</strong>
         * <p>gt</p>
         */
        @NameInMap("CompareOperator")
        public String compareOperator;

        /**
         * <p>Specifies whether single-sentence matching is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ContextChatMatch")
        public Boolean contextChatMatch;

        /**
         * <p>The operator parameters for call variables.</p>
         */
        @NameInMap("CustomerParam")
        public JudgeNodeMetaDesc customerParam;

        /**
         * <p>The delay duration for the barge-in operator.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DelayTime")
        public Integer delayTime;

        /**
         * <p>Used for the time interval operator to determine the time interval. If set to true, the target sentence is excluded from the calculation if it is spoken by the same role as the current sentence.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Different_role")
        public Boolean differentRole;

        /**
         * <p>The quality check dimensions.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<OperatorBasicInfoParamDimensions> dimensions;

        /**
         * <p>The end type for duration calculation in the duration operator. Specifies whether the calculation ends at the end of the recording or the end of a specific dialogue.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EndType")
        public String endType;

        /**
         * <p>The dialogues excluded from the context repetition operator.</p>
         */
        @NameInMap("Excludes")
        public java.util.List<String> excludes;

        /**
         * <p>The number of preceding sentences to check for repetition in the context repetition operator. A value of 0 indicates all preceding sentences.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("From")
        public Integer from;

        /**
         * <p>Used for the time interval operator to determine the time interval. Specifies whether the time interval is calculated by subtracting the end time of the target sentence from the end time of the current sentence.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("From_end")
        public Boolean fromEnd;

        /**
         * <p>The hit condition.</p>
         * 
         * <strong>example:</strong>
         * <p>Hit condition</p>
         */
        @NameInMap("HitCondition")
        public String hitCondition;

        /**
         * <p>The number of repetitions for the context repetition operator.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Hit_time")
        public Integer hitTime;

        /**
         * <p>Specifies whether the rule applies to a single sentence or multiple sentences. Valid values: true: A single sentence. false: Multiple sentences.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("In_sentence")
        public Boolean inSentence;

        /**
         * <p>The start of the interval range.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The end of the interval range.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntervalEnd")
        public Integer intervalEnd;

        /**
         * <p>The keyword extension.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KeywordExtension")
        public Integer keywordExtension;

        /**
         * <p>The number of matched keywords.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KeywordMatchSize")
        public Integer keywordMatchSize;

        /**
         * <p>The keywords.</p>
         */
        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        /**
         * <p>The knowledge information.</p>
         * 
         * <strong>example:</strong>
         * <p>Place an order</p>
         */
        @NameInMap("KnowledgeInfo")
        public String knowledgeInfo;

        /**
         * <p>The number of sentences within which the answer is detected after a question is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KnowledgeSentenceNum")
        public Integer knowledgeSentenceNum;

        /**
         * <p>The knowledge category or knowledge ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KnowledgeTargetId")
        public String knowledgeTargetId;

        /**
         * <p>The knowledge category name or knowledge name.</p>
         * 
         * <strong>example:</strong>
         * <p>Order</p>
         */
        @NameInMap("KnowledgeTargetName")
        public String knowledgeTargetName;

        /**
         * <p>The knowledge target type. Valid values:</p>
         * <ul>
         * <li>0: Category.</li>
         * <li>1: Knowledge.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KnowledgeTargetType")
        public Integer knowledgeTargetType;

        /**
         * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>Deprecated field</p>
         */
        @NameInMap("Knowledges")
        public String knowledges;

        /**
         * <p>The LGF sentences.</p>
         */
        @NameInMap("LgfSentences")
        public java.util.List<String> lgfSentences;

        /**
         * <p>The large language model code.</p>
         * 
         * <strong>example:</strong>
         * <p>TYXM_PLUS</p>
         */
        @NameInMap("LlmModelCode")
        public String llmModelCode;

        /**
         * <p>The emotion change value. Default value: 3. Valid values: 1 to 9.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxEmotionChangeValue")
        public Integer maxEmotionChangeValue;

        /**
         * <p>The minimum number of words in a sentence. Sentences with fewer words than this value are not checked.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinWordSize")
        public Integer minWordSize;

        /**
         * <p>Specifies whether to use adjacent sentences spoken by different roles. Valid values: true: Uses adjacent sentences spoken by different roles. false: Uses the first sentences spoken by different roles to compare the response time. This is the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Near_dialogue")
        public Boolean nearDialogue;

        /**
         * <p>The excluded regular expression.</p>
         * 
         * <strong>example:</strong>
         * <p>Excellent.*</p>
         */
        @NameInMap("NotRegex")
        public String notRegex;

        /**
         * <p>The phrase.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello, may I ask</p>
         */
        @NameInMap("Phrase")
        public String phrase;

        /**
         * <p>The variable required for external properties.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Pkey")
        public String pkey;

        /**
         * <p>The poutput type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Poutput_type")
        public Integer poutputType;

        /**
         * <p>The model detection type.</p>
         */
        @NameInMap("Pvalues")
        public java.util.List<String> pvalues;

        /**
         * <p>The question hit threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("QuestionThreshold")
        public String questionThreshold;

        /**
         * <p>The references.</p>
         */
        @NameInMap("References")
        public java.util.List<String> references;

        /**
         * <p>The regular expression.</p>
         * 
         * <strong>example:</strong>
         * <p>Question.*</p>
         */
        @NameInMap("Regex")
        public String regex;

        /**
         * <p>The role used in the operator. Currently used for the context repetition operator and used together with target_role.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RoleId")
        public Integer roleId;

        /**
         * <p>The scene name.</p>
         * 
         * <strong>example:</strong>
         * <p>Polite language detection</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The similarity threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Similarity_threshold")
        public Double similarityThreshold;

        /**
         * <p>The similar questions.</p>
         */
        @NameInMap("SimilarlySentences")
        public java.util.List<String> similarlySentences;

        /**
         * <p>The synonyms.</p>
         * 
         * <strong>example:</strong>
         * <p>Deprecated field</p>
         */
        @NameInMap("Synonyms")
        public java.util.Map<String, java.util.List<String>> synonyms;

        /**
         * <p>Specifies the number of sentences before the current sentence to use as the target sentence. If the value is 0, the time interval is calculated by subtracting the start time of the current sentence from its end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Target")
        public Integer target;

        /**
         * <p>Used for the repetition operator. If the current sentence matches the regular expression, the matched part is searched in the preceding sentences spoken by the role specified by target_role.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent</p>
         */
        @NameInMap("Target_role")
        public String targetRole;

        /**
         * <p>The threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        /**
         * <p>Specifies whether the EAS algorithm is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseEasAlgorithm")
        public Boolean useEasAlgorithm;

        /**
         * <p>Used for the speech rate operator. Specifies the speech rate value per unit of time to determine whether the speech rate of the current sentence exceeds the specified value. The time unit depends on the time units of the passed start and end parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("Velocity")
        public Double velocity;

        /**
         * <p>Used for the speech rate operator. Specifies the speech rate value per minute to determine whether the speech rate of the current sentence exceeds the specified value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VelocityInMint")
        public Integer velocityInMint;

        public static OperatorBasicInfoParam build(java.util.Map<String, ?> map) throws Exception {
            OperatorBasicInfoParam self = new OperatorBasicInfoParam();
            return TeaModel.build(map, self);
        }

        public OperatorBasicInfoParam setAnswerThreshold(String answerThreshold) {
            this.answerThreshold = answerThreshold;
            return this;
        }
        public String getAnswerThreshold() {
            return this.answerThreshold;
        }

        public OperatorBasicInfoParam setAntModelInfo(java.util.Map<String, String> antModelInfo) {
            this.antModelInfo = antModelInfo;
            return this;
        }
        public java.util.Map<String, String> getAntModelInfo() {
            return this.antModelInfo;
        }

        public OperatorBasicInfoParam setAverage(Boolean average) {
            this.average = average;
            return this;
        }
        public Boolean getAverage() {
            return this.average;
        }

        public OperatorBasicInfoParam setBeginType(String beginType) {
            this.beginType = beginType;
            return this;
        }
        public String getBeginType() {
            return this.beginType;
        }

        public OperatorBasicInfoParam setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public OperatorBasicInfoParam setCaseSensitive(Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        public OperatorBasicInfoParam setCategoryPathCode(String categoryPathCode) {
            this.categoryPathCode = categoryPathCode;
            return this;
        }
        public String getCategoryPathCode() {
            return this.categoryPathCode;
        }

        public OperatorBasicInfoParam setCheckFirstSentence(Boolean checkFirstSentence) {
            this.checkFirstSentence = checkFirstSentence;
            return this;
        }
        public Boolean getCheckFirstSentence() {
            return this.checkFirstSentence;
        }

        public OperatorBasicInfoParam setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public OperatorBasicInfoParam setCompareOperator(String compareOperator) {
            this.compareOperator = compareOperator;
            return this;
        }
        public String getCompareOperator() {
            return this.compareOperator;
        }

        public OperatorBasicInfoParam setContextChatMatch(Boolean contextChatMatch) {
            this.contextChatMatch = contextChatMatch;
            return this;
        }
        public Boolean getContextChatMatch() {
            return this.contextChatMatch;
        }

        public OperatorBasicInfoParam setCustomerParam(JudgeNodeMetaDesc customerParam) {
            this.customerParam = customerParam;
            return this;
        }
        public JudgeNodeMetaDesc getCustomerParam() {
            return this.customerParam;
        }

        public OperatorBasicInfoParam setDelayTime(Integer delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Integer getDelayTime() {
            return this.delayTime;
        }

        public OperatorBasicInfoParam setDifferentRole(Boolean differentRole) {
            this.differentRole = differentRole;
            return this;
        }
        public Boolean getDifferentRole() {
            return this.differentRole;
        }

        public OperatorBasicInfoParam setDimensions(java.util.List<OperatorBasicInfoParamDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<OperatorBasicInfoParamDimensions> getDimensions() {
            return this.dimensions;
        }

        public OperatorBasicInfoParam setEndType(String endType) {
            this.endType = endType;
            return this;
        }
        public String getEndType() {
            return this.endType;
        }

        public OperatorBasicInfoParam setExcludes(java.util.List<String> excludes) {
            this.excludes = excludes;
            return this;
        }
        public java.util.List<String> getExcludes() {
            return this.excludes;
        }

        public OperatorBasicInfoParam setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public OperatorBasicInfoParam setFromEnd(Boolean fromEnd) {
            this.fromEnd = fromEnd;
            return this;
        }
        public Boolean getFromEnd() {
            return this.fromEnd;
        }

        public OperatorBasicInfoParam setHitCondition(String hitCondition) {
            this.hitCondition = hitCondition;
            return this;
        }
        public String getHitCondition() {
            return this.hitCondition;
        }

        public OperatorBasicInfoParam setHitTime(Integer hitTime) {
            this.hitTime = hitTime;
            return this;
        }
        public Integer getHitTime() {
            return this.hitTime;
        }

        public OperatorBasicInfoParam setInSentence(Boolean inSentence) {
            this.inSentence = inSentence;
            return this;
        }
        public Boolean getInSentence() {
            return this.inSentence;
        }

        public OperatorBasicInfoParam setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public OperatorBasicInfoParam setIntervalEnd(Integer intervalEnd) {
            this.intervalEnd = intervalEnd;
            return this;
        }
        public Integer getIntervalEnd() {
            return this.intervalEnd;
        }

        public OperatorBasicInfoParam setKeywordExtension(Integer keywordExtension) {
            this.keywordExtension = keywordExtension;
            return this;
        }
        public Integer getKeywordExtension() {
            return this.keywordExtension;
        }

        public OperatorBasicInfoParam setKeywordMatchSize(Integer keywordMatchSize) {
            this.keywordMatchSize = keywordMatchSize;
            return this;
        }
        public Integer getKeywordMatchSize() {
            return this.keywordMatchSize;
        }

        public OperatorBasicInfoParam setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        public OperatorBasicInfoParam setKnowledgeInfo(String knowledgeInfo) {
            this.knowledgeInfo = knowledgeInfo;
            return this;
        }
        public String getKnowledgeInfo() {
            return this.knowledgeInfo;
        }

        public OperatorBasicInfoParam setKnowledgeSentenceNum(Integer knowledgeSentenceNum) {
            this.knowledgeSentenceNum = knowledgeSentenceNum;
            return this;
        }
        public Integer getKnowledgeSentenceNum() {
            return this.knowledgeSentenceNum;
        }

        public OperatorBasicInfoParam setKnowledgeTargetId(String knowledgeTargetId) {
            this.knowledgeTargetId = knowledgeTargetId;
            return this;
        }
        public String getKnowledgeTargetId() {
            return this.knowledgeTargetId;
        }

        public OperatorBasicInfoParam setKnowledgeTargetName(String knowledgeTargetName) {
            this.knowledgeTargetName = knowledgeTargetName;
            return this;
        }
        public String getKnowledgeTargetName() {
            return this.knowledgeTargetName;
        }

        public OperatorBasicInfoParam setKnowledgeTargetType(Integer knowledgeTargetType) {
            this.knowledgeTargetType = knowledgeTargetType;
            return this;
        }
        public Integer getKnowledgeTargetType() {
            return this.knowledgeTargetType;
        }

        public OperatorBasicInfoParam setKnowledges(String knowledges) {
            this.knowledges = knowledges;
            return this;
        }
        public String getKnowledges() {
            return this.knowledges;
        }

        public OperatorBasicInfoParam setLgfSentences(java.util.List<String> lgfSentences) {
            this.lgfSentences = lgfSentences;
            return this;
        }
        public java.util.List<String> getLgfSentences() {
            return this.lgfSentences;
        }

        public OperatorBasicInfoParam setLlmModelCode(String llmModelCode) {
            this.llmModelCode = llmModelCode;
            return this;
        }
        public String getLlmModelCode() {
            return this.llmModelCode;
        }

        public OperatorBasicInfoParam setMaxEmotionChangeValue(Integer maxEmotionChangeValue) {
            this.maxEmotionChangeValue = maxEmotionChangeValue;
            return this;
        }
        public Integer getMaxEmotionChangeValue() {
            return this.maxEmotionChangeValue;
        }

        public OperatorBasicInfoParam setMinWordSize(Integer minWordSize) {
            this.minWordSize = minWordSize;
            return this;
        }
        public Integer getMinWordSize() {
            return this.minWordSize;
        }

        public OperatorBasicInfoParam setNearDialogue(Boolean nearDialogue) {
            this.nearDialogue = nearDialogue;
            return this;
        }
        public Boolean getNearDialogue() {
            return this.nearDialogue;
        }

        public OperatorBasicInfoParam setNotRegex(String notRegex) {
            this.notRegex = notRegex;
            return this;
        }
        public String getNotRegex() {
            return this.notRegex;
        }

        public OperatorBasicInfoParam setPhrase(String phrase) {
            this.phrase = phrase;
            return this;
        }
        public String getPhrase() {
            return this.phrase;
        }

        public OperatorBasicInfoParam setPkey(String pkey) {
            this.pkey = pkey;
            return this;
        }
        public String getPkey() {
            return this.pkey;
        }

        public OperatorBasicInfoParam setPoutputType(Integer poutputType) {
            this.poutputType = poutputType;
            return this;
        }
        public Integer getPoutputType() {
            return this.poutputType;
        }

        public OperatorBasicInfoParam setPvalues(java.util.List<String> pvalues) {
            this.pvalues = pvalues;
            return this;
        }
        public java.util.List<String> getPvalues() {
            return this.pvalues;
        }

        public OperatorBasicInfoParam setQuestionThreshold(String questionThreshold) {
            this.questionThreshold = questionThreshold;
            return this;
        }
        public String getQuestionThreshold() {
            return this.questionThreshold;
        }

        public OperatorBasicInfoParam setReferences(java.util.List<String> references) {
            this.references = references;
            return this;
        }
        public java.util.List<String> getReferences() {
            return this.references;
        }

        public OperatorBasicInfoParam setRegex(String regex) {
            this.regex = regex;
            return this;
        }
        public String getRegex() {
            return this.regex;
        }

        public OperatorBasicInfoParam setRoleId(Integer roleId) {
            this.roleId = roleId;
            return this;
        }
        public Integer getRoleId() {
            return this.roleId;
        }

        public OperatorBasicInfoParam setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public OperatorBasicInfoParam setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public OperatorBasicInfoParam setSimilarityThreshold(Double similarityThreshold) {
            this.similarityThreshold = similarityThreshold;
            return this;
        }
        public Double getSimilarityThreshold() {
            return this.similarityThreshold;
        }

        public OperatorBasicInfoParam setSimilarlySentences(java.util.List<String> similarlySentences) {
            this.similarlySentences = similarlySentences;
            return this;
        }
        public java.util.List<String> getSimilarlySentences() {
            return this.similarlySentences;
        }

        public OperatorBasicInfoParam setSynonyms(java.util.Map<String, java.util.List<String>> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getSynonyms() {
            return this.synonyms;
        }

        public OperatorBasicInfoParam setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

        public OperatorBasicInfoParam setTargetRole(String targetRole) {
            this.targetRole = targetRole;
            return this;
        }
        public String getTargetRole() {
            return this.targetRole;
        }

        public OperatorBasicInfoParam setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public OperatorBasicInfoParam setUseEasAlgorithm(Boolean useEasAlgorithm) {
            this.useEasAlgorithm = useEasAlgorithm;
            return this;
        }
        public Boolean getUseEasAlgorithm() {
            return this.useEasAlgorithm;
        }

        public OperatorBasicInfoParam setVelocity(Double velocity) {
            this.velocity = velocity;
            return this;
        }
        public Double getVelocity() {
            return this.velocity;
        }

        public OperatorBasicInfoParam setVelocityInMint(Integer velocityInMint) {
            this.velocityInMint = velocityInMint;
            return this;
        }
        public Integer getVelocityInMint() {
            return this.velocityInMint;
        }

    }

}
