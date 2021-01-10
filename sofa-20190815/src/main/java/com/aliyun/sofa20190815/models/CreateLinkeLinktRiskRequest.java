// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktRiskRequest extends TeaModel {
    @NameInMap("AssignedTo")
    public String assignedTo;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("ExpectedCompletionDate")
    public Long expectedCompletionDate;

    @NameInMap("Level")
    public String level;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Region")
    public String region;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Title")
    public String title;

    @NameInMap("CcRepeatList")
    public java.util.List<String> ccRepeatList;

    public static CreateLinkeLinktRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktRiskRequest self = new CreateLinkeLinktRiskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktRiskRequest setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    public String getAssignedTo() {
        return this.assignedTo;
    }

    public CreateLinkeLinktRiskRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateLinkeLinktRiskRequest setExpectedCompletionDate(Long expectedCompletionDate) {
        this.expectedCompletionDate = expectedCompletionDate;
        return this;
    }
    public Long getExpectedCompletionDate() {
        return this.expectedCompletionDate;
    }

    public CreateLinkeLinktRiskRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public CreateLinkeLinktRiskRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public CreateLinkeLinktRiskRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateLinkeLinktRiskRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateLinkeLinktRiskRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateLinkeLinktRiskRequest setCcRepeatList(java.util.List<String> ccRepeatList) {
        this.ccRepeatList = ccRepeatList;
        return this;
    }
    public java.util.List<String> getCcRepeatList() {
        return this.ccRepeatList;
    }

}
