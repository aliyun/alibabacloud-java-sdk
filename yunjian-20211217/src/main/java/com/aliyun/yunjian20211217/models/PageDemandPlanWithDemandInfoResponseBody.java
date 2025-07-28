// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class PageDemandPlanWithDemandInfoResponseBody extends TeaModel {
    @NameInMap("data")
    public PageDemandPlanWithDemandInfoResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("traceId")
    public String traceId;

    public static PageDemandPlanWithDemandInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageDemandPlanWithDemandInfoResponseBody self = new PageDemandPlanWithDemandInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public PageDemandPlanWithDemandInfoResponseBody setData(PageDemandPlanWithDemandInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PageDemandPlanWithDemandInfoResponseBodyData getData() {
        return this.data;
    }

    public PageDemandPlanWithDemandInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageDemandPlanWithDemandInfoResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class PageDemandPlanWithDemandInfoResponseBodyDataData extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("accountName")
        public String accountName;

        @NameInMap("approvalNodeStatus")
        public String approvalNodeStatus;

        @NameInMap("approvalStatus")
        public String approvalStatus;

        @NameInMap("creator")
        public String creator;

        @NameInMap("deliveryPlanId")
        public String deliveryPlanId;

        @NameInMap("deliveryStatus")
        public String deliveryStatus;

        @NameInMap("demandDesc")
        public String demandDesc;

        @NameInMap("demandId")
        public Long demandId;

        @NameInMap("demandName")
        public String demandName;

        @NameInMap("demandPlanId")
        public Double demandPlanId;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("modifier")
        public String modifier;

        @NameInMap("requirementObjectCode")
        public String requirementObjectCode;

        @NameInMap("uid")
        public Long uid;

        public static PageDemandPlanWithDemandInfoResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            PageDemandPlanWithDemandInfoResponseBodyDataData self = new PageDemandPlanWithDemandInfoResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setApprovalNodeStatus(String approvalNodeStatus) {
            this.approvalNodeStatus = approvalNodeStatus;
            return this;
        }
        public String getApprovalNodeStatus() {
            return this.approvalNodeStatus;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setApprovalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setDeliveryPlanId(String deliveryPlanId) {
            this.deliveryPlanId = deliveryPlanId;
            return this;
        }
        public String getDeliveryPlanId() {
            return this.deliveryPlanId;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setDeliveryStatus(String deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
            return this;
        }
        public String getDeliveryStatus() {
            return this.deliveryStatus;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setDemandDesc(String demandDesc) {
            this.demandDesc = demandDesc;
            return this;
        }
        public String getDemandDesc() {
            return this.demandDesc;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setDemandId(Long demandId) {
            this.demandId = demandId;
            return this;
        }
        public Long getDemandId() {
            return this.demandId;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setDemandName(String demandName) {
            this.demandName = demandName;
            return this;
        }
        public String getDemandName() {
            return this.demandName;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setDemandPlanId(Double demandPlanId) {
            this.demandPlanId = demandPlanId;
            return this;
        }
        public Double getDemandPlanId() {
            return this.demandPlanId;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setRequirementObjectCode(String requirementObjectCode) {
            this.requirementObjectCode = requirementObjectCode;
            return this;
        }
        public String getRequirementObjectCode() {
            return this.requirementObjectCode;
        }

        public PageDemandPlanWithDemandInfoResponseBodyDataData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class PageDemandPlanWithDemandInfoResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<PageDemandPlanWithDemandInfoResponseBodyDataData> data;

        @NameInMap("pageNum")
        public Integer pageNum;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Long total;

        public static PageDemandPlanWithDemandInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PageDemandPlanWithDemandInfoResponseBodyData self = new PageDemandPlanWithDemandInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PageDemandPlanWithDemandInfoResponseBodyData setData(java.util.List<PageDemandPlanWithDemandInfoResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<PageDemandPlanWithDemandInfoResponseBodyDataData> getData() {
            return this.data;
        }

        public PageDemandPlanWithDemandInfoResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public PageDemandPlanWithDemandInfoResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public PageDemandPlanWithDemandInfoResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
