// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateScheduleRequest extends TeaModel {
    // 终止时间（UTC+8）。
    @NameInMap("EndTime")
    public Integer endTime;

    // 执行时间 (UTC+8)，为空立即执行。
    @NameInMap("ExecuteTime")
    public String executeTime;

    // 人群Id。
    @NameInMap("GroupId")
    public String groupId;

    // 触达计划名称。
    @NameInMap("Name")
    public String name;

    // 重复周期，按重复周期与重复周期单位执行。
    @NameInMap("RepeatCycle")
    public Integer repeatCycle;

    // 重复周期单位，若指定执行时间，则重复周期生效。
    // - 0: 从不（默认）。
    // - 1: 小时。
    // - 2: 天。
    // - 3: 周。
    // - 4: 月。
    @NameInMap("RepeatCycleUnit")
    public Integer repeatCycleUnit;

    // 重复次数。
    // - -1: 不设终止时间（默认）。
    // - 0: 不重复。
    // - N: 重复N次后终止。
    @NameInMap("RepeatTimes")
    public Integer repeatTimes;

    // 签名。
    @NameInMap("SignName")
    public String signName;

    // 签名Id，或指定签名。
    @NameInMap("SignatureId")
    public String signatureId;

    // 模板Code。
    @NameInMap("TemplateCode")
    public String templateCode;

    // 模板Id，或指定模板Code。
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
