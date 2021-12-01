// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CreateTaskOrderByEventReportShrinkRequest extends TeaModel {
    // 告警所属业务
    @NameInMap("Business")
    public String business;

    // 提交人姓名
    @NameInMap("CreateRealName")
    public String createRealName;

    // 提交人userId
    @NameInMap("CreateUserId")
    public String createUserId;

    // 告警描述
    @NameInMap("EventBody")
    public String eventBodyShrink;

    // 扩展信息
    @NameInMap("Extinfo")
    public String extinfoShrink;

    // 当eventLevel为warn时，必传
    @NameInMap("ImportantDesc")
    public String importantDesc;

    // 建单入群人员
    @NameInMap("JoinChildGroupUserIds")
    public String joinChildGroupUserIds;

    // 监控集如：视频业务的质量监控
    @NameInMap("MonitorCongregation")
    public String monitorCongregation;

    // 告警关联主群id
    @NameInMap("OpenGroupId")
    public String openGroupId;

    // 问题分类
    @NameInMap("ProductType")
    public String productType;

    public static CreateTaskOrderByEventReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskOrderByEventReportShrinkRequest self = new CreateTaskOrderByEventReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskOrderByEventReportShrinkRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public CreateTaskOrderByEventReportShrinkRequest setCreateRealName(String createRealName) {
        this.createRealName = createRealName;
        return this;
    }
    public String getCreateRealName() {
        return this.createRealName;
    }

    public CreateTaskOrderByEventReportShrinkRequest setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public CreateTaskOrderByEventReportShrinkRequest setEventBodyShrink(String eventBodyShrink) {
        this.eventBodyShrink = eventBodyShrink;
        return this;
    }
    public String getEventBodyShrink() {
        return this.eventBodyShrink;
    }

    public CreateTaskOrderByEventReportShrinkRequest setExtinfoShrink(String extinfoShrink) {
        this.extinfoShrink = extinfoShrink;
        return this;
    }
    public String getExtinfoShrink() {
        return this.extinfoShrink;
    }

    public CreateTaskOrderByEventReportShrinkRequest setImportantDesc(String importantDesc) {
        this.importantDesc = importantDesc;
        return this;
    }
    public String getImportantDesc() {
        return this.importantDesc;
    }

    public CreateTaskOrderByEventReportShrinkRequest setJoinChildGroupUserIds(String joinChildGroupUserIds) {
        this.joinChildGroupUserIds = joinChildGroupUserIds;
        return this;
    }
    public String getJoinChildGroupUserIds() {
        return this.joinChildGroupUserIds;
    }

    public CreateTaskOrderByEventReportShrinkRequest setMonitorCongregation(String monitorCongregation) {
        this.monitorCongregation = monitorCongregation;
        return this;
    }
    public String getMonitorCongregation() {
        return this.monitorCongregation;
    }

    public CreateTaskOrderByEventReportShrinkRequest setOpenGroupId(String openGroupId) {
        this.openGroupId = openGroupId;
        return this;
    }
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public CreateTaskOrderByEventReportShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
