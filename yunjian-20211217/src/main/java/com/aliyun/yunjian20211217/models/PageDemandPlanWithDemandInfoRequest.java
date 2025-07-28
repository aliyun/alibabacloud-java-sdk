// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class PageDemandPlanWithDemandInfoRequest extends TeaModel {
    @NameInMap("approvalStatus")
    public String approvalStatus;

    @NameInMap("createTimeEnd")
    public String createTimeEnd;

    @NameInMap("createTimeStart")
    public String createTimeStart;

    @NameInMap("creatorStaffId")
    public String creatorStaffId;

    @NameInMap("demandDeliveryStatus")
    public String demandDeliveryStatus;

    @NameInMap("demandId")
    public java.util.List<Long> demandId;

    @NameInMap("demandPlanId")
    public java.util.List<Long> demandPlanId;

    @NameInMap("demandPlanStatus")
    public String demandPlanStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("pageNum")
    public Integer pageNum;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("roCode")
    public String roCode;

    public static PageDemandPlanWithDemandInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        PageDemandPlanWithDemandInfoRequest self = new PageDemandPlanWithDemandInfoRequest();
        return TeaModel.build(map, self);
    }

    public PageDemandPlanWithDemandInfoRequest setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public PageDemandPlanWithDemandInfoRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public PageDemandPlanWithDemandInfoRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public PageDemandPlanWithDemandInfoRequest setCreatorStaffId(String creatorStaffId) {
        this.creatorStaffId = creatorStaffId;
        return this;
    }
    public String getCreatorStaffId() {
        return this.creatorStaffId;
    }

    public PageDemandPlanWithDemandInfoRequest setDemandDeliveryStatus(String demandDeliveryStatus) {
        this.demandDeliveryStatus = demandDeliveryStatus;
        return this;
    }
    public String getDemandDeliveryStatus() {
        return this.demandDeliveryStatus;
    }

    public PageDemandPlanWithDemandInfoRequest setDemandId(java.util.List<Long> demandId) {
        this.demandId = demandId;
        return this;
    }
    public java.util.List<Long> getDemandId() {
        return this.demandId;
    }

    public PageDemandPlanWithDemandInfoRequest setDemandPlanId(java.util.List<Long> demandPlanId) {
        this.demandPlanId = demandPlanId;
        return this;
    }
    public java.util.List<Long> getDemandPlanId() {
        return this.demandPlanId;
    }

    public PageDemandPlanWithDemandInfoRequest setDemandPlanStatus(String demandPlanStatus) {
        this.demandPlanStatus = demandPlanStatus;
        return this;
    }
    public String getDemandPlanStatus() {
        return this.demandPlanStatus;
    }

    public PageDemandPlanWithDemandInfoRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public PageDemandPlanWithDemandInfoRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public PageDemandPlanWithDemandInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageDemandPlanWithDemandInfoRequest setRoCode(String roCode) {
        this.roCode = roCode;
        return this;
    }
    public String getRoCode() {
        return this.roCode;
    }

}
