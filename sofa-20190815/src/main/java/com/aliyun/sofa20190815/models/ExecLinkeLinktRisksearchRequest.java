// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktRisksearchRequest extends TeaModel {
    @NameInMap("AssignedTo")
    public String assignedTo;

    @NameInMap("Finished")
    public String finished;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Limit")
    public String limit;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Start")
    public String start;

    public static ExecLinkeLinktRisksearchRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktRisksearchRequest self = new ExecLinkeLinktRisksearchRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktRisksearchRequest setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    public String getAssignedTo() {
        return this.assignedTo;
    }

    public ExecLinkeLinktRisksearchRequest setFinished(String finished) {
        this.finished = finished;
        return this;
    }
    public String getFinished() {
        return this.finished;
    }

    public ExecLinkeLinktRisksearchRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ExecLinkeLinktRisksearchRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public ExecLinkeLinktRisksearchRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public ExecLinkeLinktRisksearchRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

}
