// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateScheduleRequest extends TeaModel {
    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("ExecuteTime")
    public String executeTime;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RepeatCycle")
    public Integer repeatCycle;

    @NameInMap("RepeatCycleUnit")
    public Integer repeatCycleUnit;

    @NameInMap("RepeatTimes")
    public Integer repeatTimes;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("SignatureId")
    public String signatureId;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateId")
    public String templateId;

    public static CreateScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleRequest self = new CreateScheduleRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public CreateScheduleRequest setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
        return this;
    }
    public String getExecuteTime() {
        return this.executeTime;
    }

    public CreateScheduleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateScheduleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateScheduleRequest setRepeatCycle(Integer repeatCycle) {
        this.repeatCycle = repeatCycle;
        return this;
    }
    public Integer getRepeatCycle() {
        return this.repeatCycle;
    }

    public CreateScheduleRequest setRepeatCycleUnit(Integer repeatCycleUnit) {
        this.repeatCycleUnit = repeatCycleUnit;
        return this;
    }
    public Integer getRepeatCycleUnit() {
        return this.repeatCycleUnit;
    }

    public CreateScheduleRequest setRepeatTimes(Integer repeatTimes) {
        this.repeatTimes = repeatTimes;
        return this;
    }
    public Integer getRepeatTimes() {
        return this.repeatTimes;
    }

    public CreateScheduleRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateScheduleRequest setSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }
    public String getSignatureId() {
        return this.signatureId;
    }

    public CreateScheduleRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public CreateScheduleRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
