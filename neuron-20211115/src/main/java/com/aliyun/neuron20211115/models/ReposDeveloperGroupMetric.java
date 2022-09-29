// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ReposDeveloperGroupMetric extends TeaModel {
    @NameInMap("addLines")
    public Long addLines;

    @NameInMap("commentLines")
    public Long commentLines;

    @NameInMap("commitCnt")
    public Long commitCnt;

    @NameInMap("delLines")
    public Long delLines;

    @NameInMap("modLines")
    public Long modLines;

    @NameInMap("showName")
    public String showName;

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
