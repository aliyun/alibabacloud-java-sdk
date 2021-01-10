// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktRiskRequest extends TeaModel {
    @NameInMap("AssignedTo")
    public String assignedTo;

    @NameInMap("Cc")
    public String cc;

    @NameInMap("ExpectedCompletionDate")
    public String expectedCompletionDate;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Level")
    public String level;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Status")
    public String status;

    @NameInMap("Title")
    public String title;

    public static UpdateLinkeLinktRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktRiskRequest self = new UpdateLinkeLinktRiskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktRiskRequest setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    public String getAssignedTo() {
        return this.assignedTo;
    }

    public UpdateLinkeLinktRiskRequest setCc(String cc) {
        this.cc = cc;
        return this;
    }
    public String getCc() {
        return this.cc;
    }

    public UpdateLinkeLinktRiskRequest setExpectedCompletionDate(String expectedCompletionDate) {
        this.expectedCompletionDate = expectedCompletionDate;
        return this;
    }
    public String getExpectedCompletionDate() {
        return this.expectedCompletionDate;
    }

    public UpdateLinkeLinktRiskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeLinktRiskRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public UpdateLinkeLinktRiskRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateLinkeLinktRiskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateLinkeLinktRiskRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
