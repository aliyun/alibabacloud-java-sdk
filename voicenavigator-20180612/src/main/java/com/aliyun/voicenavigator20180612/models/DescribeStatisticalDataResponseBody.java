// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeStatisticalDataResponseBody extends TeaModel {
    @NameInMap("TotalDialoguePassRate")
    public String totalDialoguePassRate;

    @NameInMap("TotalKnowledgeHitRate")
    public String totalKnowledgeHitRate;

    @NameInMap("TotalResolutionRate")
    public String totalResolutionRate;

    @NameInMap("TotalValidAnswerRate")
    public String totalValidAnswerRate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResolvedQuestionTotalNum")
    public Long resolvedQuestionTotalNum;

    @NameInMap("ConversationTotalNum")
    public Long conversationTotalNum;

    @NameInMap("StatisticalDataReports")
    public java.util.List<DescribeStatisticalDataResponseBodyStatisticalDataReports> statisticalDataReports;

    public static DescribeStatisticalDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatisticalDataResponseBody self = new DescribeStatisticalDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStatisticalDataResponseBody setTotalDialoguePassRate(String totalDialoguePassRate) {
        this.totalDialoguePassRate = totalDialoguePassRate;
        return this;
    }
    public String getTotalDialoguePassRate() {
        return this.totalDialoguePassRate;
    }

    public DescribeStatisticalDataResponseBody setTotalKnowledgeHitRate(String totalKnowledgeHitRate) {
        this.totalKnowledgeHitRate = totalKnowledgeHitRate;
        return this;
    }
    public String getTotalKnowledgeHitRate() {
        return this.totalKnowledgeHitRate;
    }

    public DescribeStatisticalDataResponseBody setTotalResolutionRate(String totalResolutionRate) {
        this.totalResolutionRate = totalResolutionRate;
        return this;
    }
    public String getTotalResolutionRate() {
        return this.totalResolutionRate;
    }

    public DescribeStatisticalDataResponseBody setTotalValidAnswerRate(String totalValidAnswerRate) {
        this.totalValidAnswerRate = totalValidAnswerRate;
        return this;
    }
    public String getTotalValidAnswerRate() {
        return this.totalValidAnswerRate;
    }

    public DescribeStatisticalDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStatisticalDataResponseBody setResolvedQuestionTotalNum(Long resolvedQuestionTotalNum) {
        this.resolvedQuestionTotalNum = resolvedQuestionTotalNum;
        return this;
    }
    public Long getResolvedQuestionTotalNum() {
        return this.resolvedQuestionTotalNum;
    }

    public DescribeStatisticalDataResponseBody setConversationTotalNum(Long conversationTotalNum) {
        this.conversationTotalNum = conversationTotalNum;
        return this;
    }
    public Long getConversationTotalNum() {
        return this.conversationTotalNum;
    }

    public DescribeStatisticalDataResponseBody setStatisticalDataReports(java.util.List<DescribeStatisticalDataResponseBodyStatisticalDataReports> statisticalDataReports) {
        this.statisticalDataReports = statisticalDataReports;
        return this;
    }
    public java.util.List<DescribeStatisticalDataResponseBodyStatisticalDataReports> getStatisticalDataReports() {
        return this.statisticalDataReports;
    }

    public static class DescribeStatisticalDataResponseBodyStatisticalDataReports extends TeaModel {
        @NameInMap("KnowledgeHitRate")
        public String knowledgeHitRate;

        @NameInMap("ResolvedQuestionNum")
        public Integer resolvedQuestionNum;

        @NameInMap("ResolutionRate")
        public String resolutionRate;

        @NameInMap("StatisticalDate")
        public String statisticalDate;

        @NameInMap("TotalConversationNum")
        public Integer totalConversationNum;

        @NameInMap("ValidAnswerRate")
        public String validAnswerRate;

        @NameInMap("DialoguePassRate")
        public String dialoguePassRate;

        public static DescribeStatisticalDataResponseBodyStatisticalDataReports build(java.util.Map<String, ?> map) throws Exception {
            DescribeStatisticalDataResponseBodyStatisticalDataReports self = new DescribeStatisticalDataResponseBodyStatisticalDataReports();
            return TeaModel.build(map, self);
        }

        public DescribeStatisticalDataResponseBodyStatisticalDataReports setKnowledgeHitRate(String knowledgeHitRate) {
            this.knowledgeHitRate = knowledgeHitRate;
            return this;
        }
        public String getKnowledgeHitRate() {
            return this.knowledgeHitRate;
        }

        public DescribeStatisticalDataResponseBodyStatisticalDataReports setResolvedQuestionNum(Integer resolvedQuestionNum) {
            this.resolvedQuestionNum = resolvedQuestionNum;
            return this;
        }
        public Integer getResolvedQuestionNum() {
            return this.resolvedQuestionNum;
        }

        public DescribeStatisticalDataResponseBodyStatisticalDataReports setResolutionRate(String resolutionRate) {
            this.resolutionRate = resolutionRate;
            return this;
        }
        public String getResolutionRate() {
            return this.resolutionRate;
        }

        public DescribeStatisticalDataResponseBodyStatisticalDataReports setStatisticalDate(String statisticalDate) {
            this.statisticalDate = statisticalDate;
            return this;
        }
        public String getStatisticalDate() {
            return this.statisticalDate;
        }

        public DescribeStatisticalDataResponseBodyStatisticalDataReports setTotalConversationNum(Integer totalConversationNum) {
            this.totalConversationNum = totalConversationNum;
            return this;
        }
        public Integer getTotalConversationNum() {
            return this.totalConversationNum;
        }

        public DescribeStatisticalDataResponseBodyStatisticalDataReports setValidAnswerRate(String validAnswerRate) {
            this.validAnswerRate = validAnswerRate;
            return this;
        }
        public String getValidAnswerRate() {
            return this.validAnswerRate;
        }

        public DescribeStatisticalDataResponseBodyStatisticalDataReports setDialoguePassRate(String dialoguePassRate) {
            this.dialoguePassRate = dialoguePassRate;
            return this;
        }
        public String getDialoguePassRate() {
            return this.dialoguePassRate;
        }

    }

}
