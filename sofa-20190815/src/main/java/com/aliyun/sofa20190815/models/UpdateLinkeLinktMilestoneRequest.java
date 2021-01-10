// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktMilestoneRequest extends TeaModel {
    @NameInMap("ActualEndDate")
    public Long actualEndDate;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExpectEndDate")
    public Long expectEndDate;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Manager")
    public String manager;

    @NameInMap("MilestoneTarget")
    public String milestoneTarget;

    @NameInMap("Name")
    public String name;

    @NameInMap("Status")
    public String status;

    public static UpdateLinkeLinktMilestoneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktMilestoneRequest self = new UpdateLinkeLinktMilestoneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktMilestoneRequest setActualEndDate(Long actualEndDate) {
        this.actualEndDate = actualEndDate;
        return this;
    }
    public Long getActualEndDate() {
        return this.actualEndDate;
    }

    public UpdateLinkeLinktMilestoneRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLinkeLinktMilestoneRequest setExpectEndDate(Long expectEndDate) {
        this.expectEndDate = expectEndDate;
        return this;
    }
    public Long getExpectEndDate() {
        return this.expectEndDate;
    }

    public UpdateLinkeLinktMilestoneRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeLinktMilestoneRequest setManager(String manager) {
        this.manager = manager;
        return this;
    }
    public String getManager() {
        return this.manager;
    }

    public UpdateLinkeLinktMilestoneRequest setMilestoneTarget(String milestoneTarget) {
        this.milestoneTarget = milestoneTarget;
        return this;
    }
    public String getMilestoneTarget() {
        return this.milestoneTarget;
    }

    public UpdateLinkeLinktMilestoneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeLinktMilestoneRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
