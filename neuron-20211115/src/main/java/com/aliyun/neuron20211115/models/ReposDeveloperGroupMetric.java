// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ReposDeveloperGroupMetric extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>342</p>
     */
    @NameInMap("addLines")
    public Long addLines;

    /**
     * <strong>example:</strong>
     * <p>242</p>
     */
    @NameInMap("commentLines")
    public Long commentLines;

    /**
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("commitCnt")
    public Long commitCnt;

    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("delLines")
    public Long delLines;

    /**
     * <strong>example:</strong>
     * <p>129</p>
     */
    @NameInMap("modLines")
    public Long modLines;

    /**
     * <strong>example:</strong>
     * <p>旭坤</p>
     */
    @NameInMap("showName")
    public String showName;

    /**
     * <strong>example:</strong>
     * <p>64634</p>
     */
    @NameInMap("workNo")
    public String workNo;

    public static ReposDeveloperGroupMetric build(java.util.Map<String, ?> map) throws Exception {
        ReposDeveloperGroupMetric self = new ReposDeveloperGroupMetric();
        return TeaModel.build(map, self);
    }

    public ReposDeveloperGroupMetric setAddLines(Long addLines) {
        this.addLines = addLines;
        return this;
    }
    public Long getAddLines() {
        return this.addLines;
    }

    public ReposDeveloperGroupMetric setCommentLines(Long commentLines) {
        this.commentLines = commentLines;
        return this;
    }
    public Long getCommentLines() {
        return this.commentLines;
    }

    public ReposDeveloperGroupMetric setCommitCnt(Long commitCnt) {
        this.commitCnt = commitCnt;
        return this;
    }
    public Long getCommitCnt() {
        return this.commitCnt;
    }

    public ReposDeveloperGroupMetric setDelLines(Long delLines) {
        this.delLines = delLines;
        return this;
    }
    public Long getDelLines() {
        return this.delLines;
    }

    public ReposDeveloperGroupMetric setModLines(Long modLines) {
        this.modLines = modLines;
        return this;
    }
    public Long getModLines() {
        return this.modLines;
    }

    public ReposDeveloperGroupMetric setShowName(String showName) {
        this.showName = showName;
        return this;
    }
    public String getShowName() {
        return this.showName;
    }

    public ReposDeveloperGroupMetric setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

}
