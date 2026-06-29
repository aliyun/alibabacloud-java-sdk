// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class MarkResult extends TeaModel {
    /**
     * <p>Indicates whether voting is required. Valid values:  </p>
     * <ul>
     * <li>True: Yes  </li>
     * <li>False: No</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IsNeedVoteJudge")
    public Boolean isNeedVoteJudge;

    /**
     * <p>Question result.</p>
     * 
     * <strong>example:</strong>
     * <p>b</p>
     */
    @NameInMap("MarkResult")
    public String markResult;

    /**
     * <p>Question ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1500***849089597440</p>
     */
    @NameInMap("MarkResultId")
    public String markResultId;

    /**
     * <p>Annotation time.</p>
     * 
     * <strong>example:</strong>
     * <p>Mon Mar 07 17:02:48 CST 2022</p>
     */
    @NameInMap("MarkTime")
    public String markTime;

    /**
     * <p>Question name.</p>
     * 
     * <strong>example:</strong>
     * <p>单选</p>
     */
    @NameInMap("MarkTitle")
    public String markTitle;

    /**
     * <p>Progress. The return value is either None or data of JSON type. It includes:  </p>
     * <ul>
     * <li>Total: total number of results.  </li>
     * <li>Finished: number of completed results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Progress")
    public String progress;

    /**
     * <p>Attached question.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QuestionId")
    public String questionId;

    /**
     * <p>Result type. Valid values:  </p>
     * <ul>
     * <li>RADIO: Radio  </li>
     * <li>SLOT: Segment  </li>
     * <li>INPUT: Fill-in-the-blank  </li>
     * <li>CHECKBOX: Multiple Choice</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RADIO</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>User annotation result ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1500***849358032896</p>
     */
    @NameInMap("UserMarkResultId")
    public String userMarkResultId;

    /**
     * <p>Version.</p>
     * 
     * <strong>example:</strong>
     * <p>1646643768468</p>
     */
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
