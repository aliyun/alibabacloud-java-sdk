// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class OperatorBasicInfo extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Oid")
    public String oid;

    @NameInMap("Param")
    public OperatorBasicInfoParam param;

    @NameInMap("QualityCheckType")
    public Integer qualityCheckType;

    @NameInMap("Type")
    public String type;

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

    public static class OperatorBasicInfoParam extends TeaModel {
        @NameInMap("AnswerThreshold")
        public String answerThreshold;

        @NameInMap("AntModelInfo")
        public java.util.Map<String, String> antModelInfo;

        @NameInMap("Average")
        public Boolean average;

        @NameInMap("BeginType")
        public String beginType;

        @NameInMap("BotId")
        public String botId;

        @NameInMap("Case_sensitive")
        public Boolean caseSensitive;

        @NameInMap("CategoryPathCode")
        public String categoryPathCode;

        @NameInMap("CheckFirstSentence")
        public Boolean checkFirstSentence;

        @NameInMap("CheckType")
        public Integer checkType;

        @NameInMap("CompareOperator")
        public String compareOperator;

        @NameInMap("ContextChatMatch")
        public Boolean contextChatMatch;

        @NameInMap("CustomerParam")
        public JudgeNodeMetaDesc customerParam;

        @NameInMap("DelayTime")
        public Integer delayTime;

        @NameInMap("Different_role")
        public Boolean differentRole;

        @NameInMap("EndType")
        public String endType;

        @NameInMap("Excludes")
        public java.util.List<String> excludes;

        @NameInMap("From")
        public Integer from;

        @NameInMap("From_end")
        public Boolean fromEnd;

        @NameInMap("Hit_time")
        public Integer hitTime;

        @NameInMap("In_sentence")
        public Boolean inSentence;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("IntervalEnd")
        public Integer intervalEnd;

        @NameInMap("KeywordExtension")
        public Integer keywordExtension;

        @NameInMap("KeywordMatchSize")
        public Integer keywordMatchSize;

        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        @NameInMap("KnowledgeInfo")
        public String knowledgeInfo;

        @NameInMap("KnowledgeSentenceNum")
        public Integer knowledgeSentenceNum;

        @NameInMap("KnowledgeTargetId")
        public String knowledgeTargetId;

        @NameInMap("KnowledgeTargetName")
        public String knowledgeTargetName;

        @NameInMap("KnowledgeTargetType")
        public Integer knowledgeTargetType;

        @NameInMap("LgfSentences")
        public java.util.List<String> lgfSentences;

        @NameInMap("MaxEmotionChangeValue")
        public Integer maxEmotionChangeValue;

        @NameInMap("MinWordSize")
        public Integer minWordSize;

        @NameInMap("Near_dialogue")
        public Boolean nearDialogue;

        @NameInMap("NotRegex")
        public String notRegex;

        @NameInMap("Phrase")
        public String phrase;

        @NameInMap("Pkey")
        public String pkey;

        @NameInMap("Poutput_type")
        public Integer poutputType;

        @NameInMap("Pvalues")
        public java.util.List<String> pvalues;

        @NameInMap("QuestionThreshold")
        public String questionThreshold;

        @NameInMap("References")
        public java.util.List<String> references;

        @NameInMap("Regex")
        public String regex;

        @NameInMap("RoleId")
        public Integer roleId;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("Similarity_threshold")
        public Double similarityThreshold;

        @NameInMap("SimilarlySentences")
        public java.util.List<String> similarlySentences;

        @NameInMap("Synonyms")
        public java.util.Map<String, java.util.List<String>> synonyms;

        @NameInMap("Target")
        public Integer target;

        @NameInMap("Target_role")
        public String targetRole;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("UseEasAlgorithm")
        public Boolean useEasAlgorithm;

        @NameInMap("Velocity")
        public Double velocity;

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

        public OperatorBasicInfoParam setLgfSentences(java.util.List<String> lgfSentences) {
            this.lgfSentences = lgfSentences;
            return this;
        }
        public java.util.List<String> getLgfSentences() {
            return this.lgfSentences;
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
