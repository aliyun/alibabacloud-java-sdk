// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktMilestoneRequest extends TeaModel {
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

    public static CreateLinkeLinktMilestoneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktMilestoneRequest self = new CreateLinkeLinktMilestoneRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktMilestoneRequest setActualEndDate(Long actualEndDate) {
        this.actualEndDate = actualEndDate;
        return this;
    }
    public Long getActualEndDate() {
        return this.actualEndDate;
    }

    public CreateLinkeLinktMilestoneRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLinkeLinktMilestoneRequest setExpectEndDate(Long expectEndDate) {
        this.expectEndDate = expectEndDate;
        return this;
    }
    public Long getExpectEndDate() {
        return this.expectEndDate;
    }

    public CreateLinkeLinktMilestoneRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeLinktMilestoneRequest setManager(String manager) {
        this.manager = manager;
        return this;
    }
    public String getManager() {
        return this.manager;
    }

    public CreateLinkeLinktMilestoneRequest setMilestoneTarget(String milestoneTarget) {
        this.milestoneTarget = milestoneTarget;
        return this;
    }
    public String getMilestoneTarget() {
        return this.milestoneTarget;
    }

    public CreateLinkeLinktMilestoneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeLinktMilestoneRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
