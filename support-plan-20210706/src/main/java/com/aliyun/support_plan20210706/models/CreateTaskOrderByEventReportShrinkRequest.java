// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CreateTaskOrderByEventReportShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Business")
    public String business;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>小二</p>
     */
    @NameInMap("CreateRealName")
    public String createRealName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1830426056957812</p>
     */
    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("EventBody")
    public String eventBodyShrink;

    @NameInMap("Extinfo")
    public String extinfoShrink;

    /**
     * <strong>example:</strong>
     * <p>紧急性原因描述</p>
     */
    @NameInMap("ImportantDesc")
    public String importantDesc;

    /**
     * <strong>example:</strong>
     * <p>123,456</p>
     */
    @NameInMap("JoinChildGroupUserIds")
    public String joinChildGroupUserIds;

    /**
     * <strong>example:</strong>
     * <p>监控集如：视频业务的质量监控 123</p>
     */
    @NameInMap("MonitorCongregation")
    public String monitorCongregation;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cid+lUpHxTIXt7DYqJDcpVxlA==</p>
     */
    @NameInMap("OpenGroupId")
    public String openGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3270</p>
     */
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
