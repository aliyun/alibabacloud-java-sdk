// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobDetailRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<QueryOutboundJobDetailRecordResponseBodyData> data;

    @NameInMap("ExtData")
    public java.util.Map<String, String> extData;

    @NameInMap("Message")
    public String message;

    @NameInMap("TotalItems")
    public Integer totalItems;

    public static QueryOutboundJobDetailRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobDetailRecordResponseBody self = new QueryOutboundJobDetailRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobDetailRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOutboundJobDetailRecordResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryOutboundJobDetailRecordResponseBody setData(java.util.List<QueryOutboundJobDetailRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOutboundJobDetailRecordResponseBodyData> getData() {
        return this.data;
    }

    public QueryOutboundJobDetailRecordResponseBody setExtData(java.util.Map<String, String> extData) {
        this.extData = extData;
        return this;
    }
    public java.util.Map<String, String> getExtData() {
        return this.extData;
    }

    public QueryOutboundJobDetailRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOutboundJobDetailRecordResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public static class QueryOutboundJobDetailRecordResponseBodyData extends TeaModel {
        @NameInMap("BatchNo")
        public String batchNo;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizOrderId")
        public Long bizOrderId;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("BuyerId")
        public Long buyerId;

        @NameInMap("CallTime")
        public String callTime;

        @NameInMap("DataType")
        public Integer dataType;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("ExtraParams")
        public String extraParams;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("MobileNo")
        public String mobileNo;

        @NameInMap("PlayComplete")
        public Integer playComplete;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("Reserve1")
        public Integer reserve1;

        @NameInMap("Reserve2")
        public Long reserve2;

        @NameInMap("Reserve4")
        public String reserve4;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StoreName")
        public String storeName;

        @NameInMap("SubBizOrder")
        public Long subBizOrder;

        // tenant Id
        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("YunTaskId")
        public String yunTaskId;

        public static QueryOutboundJobDetailRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOutboundJobDetailRecordResponseBodyData self = new QueryOutboundJobDetailRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOutboundJobDetailRecordResponseBodyData setBatchNo(String batchNo) {
            this.batchNo = batchNo;
            return this;
        }
        public String getBatchNo() {
            return this.batchNo;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setBizOrderId(Long bizOrderId) {
            this.bizOrderId = bizOrderId;
            return this;
        }
        public Long getBizOrderId() {
            return this.bizOrderId;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setBuyerId(Long buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public Long getBuyerId() {
            return this.buyerId;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setCallTime(String callTime) {
            this.callTime = callTime;
            return this;
        }
        public String getCallTime() {
            return this.callTime;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setDataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }
        public Integer getDataType() {
            return this.dataType;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setExtraParams(String extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public String getExtraParams() {
            return this.extraParams;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setMobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
            return this;
        }
        public String getMobileNo() {
            return this.mobileNo;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setPlayComplete(Integer playComplete) {
            this.playComplete = playComplete;
            return this;
        }
        public Integer getPlayComplete() {
            return this.playComplete;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setReserve1(Integer reserve1) {
            this.reserve1 = reserve1;
            return this;
        }
        public Integer getReserve1() {
            return this.reserve1;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setReserve2(Long reserve2) {
            this.reserve2 = reserve2;
            return this;
        }
        public Long getReserve2() {
            return this.reserve2;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setReserve4(String reserve4) {
            this.reserve4 = reserve4;
            return this;
        }
        public String getReserve4() {
            return this.reserve4;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }
        public String getStoreName() {
            return this.storeName;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setSubBizOrder(Long subBizOrder) {
            this.subBizOrder = subBizOrder;
            return this;
        }
        public Long getSubBizOrder() {
            return this.subBizOrder;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryOutboundJobDetailRecordResponseBodyData setYunTaskId(String yunTaskId) {
            this.yunTaskId = yunTaskId;
            return this;
        }
        public String getYunTaskId() {
            return this.yunTaskId;
        }

    }

}
