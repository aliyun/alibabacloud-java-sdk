// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class MarkResult extends TeaModel {
    @NameInMap("IsNeedVoteJudge")
    public Boolean isNeedVoteJudge;

    @NameInMap("MarkResult")
    public String markResult;

    @NameInMap("MarkResultId")
    public String markResultId;

    @NameInMap("MarkTime")
    public String markTime;

    @NameInMap("MarkTitle")
    public String markTitle;

    @NameInMap("Progress")
    public String progress;

    @NameInMap("QuestionId")
    public String questionId;

    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("UserMarkResultId")
    public String userMarkResultId;

    @NameInMap("Version")
    public String version;

    public static MarkResult build(java.util.Map<String, ?> map) throws Exception {
        MarkResult self = new MarkResult();
        return TeaModel.build(map, self);
    }

    public MarkResult setIsNeedVoteJudge(Boolean isNeedVoteJudge) {
        this.isNeedVoteJudge = isNeedVoteJudge;
        return this;
    }
    public Boolean getIsNeedVoteJudge() {
        return this.isNeedVoteJudge;
    }

    public MarkResult setMarkResult(String markResult) {
        this.markResult = markResult;
        return this;
    }
    public String getMarkResult() {
        return this.markResult;
    }

    public MarkResult setMarkResultId(String markResultId) {
        this.markResultId = markResultId;
        return this;
    }
    public String getMarkResultId() {
        return this.markResultId;
    }

    public MarkResult setMarkTime(String markTime) {
        this.markTime = markTime;
        return this;
    }
    public String getMarkTime() {
        return this.markTime;
    }

    public MarkResult setMarkTitle(String markTitle) {
        this.markTitle = markTitle;
        return this;
    }
    public String getMarkTitle() {
        return this.markTitle;
    }

    public MarkResult setProgress(String progress) {
        this.progress = progress;
        return this;
    }
    public String getProgress() {
        return this.progress;
    }

    public MarkResult setQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }
    public String getQuestionId() {
        return this.questionId;
    }

    public MarkResult setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public MarkResult setUserMarkResultId(String userMarkResultId) {
        this.userMarkResultId = userMarkResultId;
        return this;
    }
    public String getUserMarkResultId() {
        return this.userMarkResultId;
    }

    public MarkResult setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
