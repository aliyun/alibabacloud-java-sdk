// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateScheduleRequest extends TeaModel {
    @NameInMap("AISendEndDate")
    public String AISendEndDate;

    @NameInMap("AISendStartDate")
    public String AISendStartDate;

    /**
     * <p>终止时间（UTC+8）。</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>执行时间 (UTC+8)，为空立即执行。</p>
     */
    @NameInMap("ExecuteTime")
    public String executeTime;

    /**
     * <p>人群ID。</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>触达计划名称。</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>重复周期，按重复周期与重复周期单位执行。</p>
     */
    @NameInMap("RepeatCycle")
    public Integer repeatCycle;

    /**
     * <p>重复周期单位，若指定执行时间，则重复周期生效。</p>
     * <p>- 0: 从不（默认）。</p>
     * <p>- 1: 小时。</p>
     * <p>- 2: 天。</p>
     * <p>- 3: 周。</p>
     * <p>- 4: 月。</p>
     */
    @NameInMap("RepeatCycleUnit")
    public Integer repeatCycleUnit;

    /**
     * <p>重复次数。</p>
     * <p>- 0: 不设终止时间（默认）。</p>
     * <p>- N: 重复N次后终止。</p>
     */
    @NameInMap("RepeatTimes")
    public Integer repeatTimes;

    /**
     * <p>签名。</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>签名ID，或指定签名。</p>
     */
    @NameInMap("SignatureId")
    public String signatureId;

    /**
     * <p>模板Code。</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>模板ID，或指定模板Code。</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleRequest self = new CreateScheduleRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleRequest setAISendEndDate(String AISendEndDate) {
        this.AISendEndDate = AISendEndDate;
        return this;
    }
    public String getAISendEndDate() {
        return this.AISendEndDate;
    }

    public CreateScheduleRequest setAISendStartDate(String AISendStartDate) {
        this.AISendStartDate = AISendStartDate;
        return this;
    }
    public String getAISendStartDate() {
        return this.AISendStartDate;
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

    public CreateScheduleRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
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
