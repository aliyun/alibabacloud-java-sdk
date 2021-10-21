// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeMarkApplicationsResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("Data")
    public QueryTradeMarkApplicationsResponseBodyData data;

    public static QueryTradeMarkApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeMarkApplicationsResponseBody self = new QueryTradeMarkApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTradeMarkApplicationsResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTradeMarkApplicationsResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public QueryTradeMarkApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTradeMarkApplicationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTradeMarkApplicationsResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTradeMarkApplicationsResponseBody setData(QueryTradeMarkApplicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTradeMarkApplicationsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassificationThirdClassifications extends TeaModel {
        @NameInMap("ClassificationName")
        public String classificationName;

        @NameInMap("ClassificationCode")
        public String classificationCode;

        public static QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassificationThirdClassifications build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassificationThirdClassifications self = new QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassificationThirdClassifications();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassificationThirdClassifications setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassificationThirdClassifications setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

    }

    public static class QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassification extends TeaModel {
        @NameInMap("ThirdClassifications")
        public java.util.List<QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassificationThirdClassifications> thirdClassifications;

        public static QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassification build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassification self = new QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassification();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassification setThirdClassifications(java.util.List<QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassificationThirdClassifications> thirdClassifications) {
            this.thirdClassifications = thirdClassifications;
            return this;
        }
        public java.util.List<QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassificationThirdClassifications> getThirdClassifications() {
            return this.thirdClassifications;
        }

    }

    public static class QueryTradeMarkApplicationsResponseBodyDataTmProducesFlags extends TeaModel {
        @NameInMap("Flags")
        public java.util.List<String> flags;

        public static QueryTradeMarkApplicationsResponseBodyDataTmProducesFlags build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationsResponseBodyDataTmProducesFlags self = new QueryTradeMarkApplicationsResponseBodyDataTmProducesFlags();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProducesFlags setFlags(java.util.List<String> flags) {
            this.flags = flags;
            return this;
        }
        public java.util.List<String> getFlags() {
            return this.flags;
        }

    }

    public static class QueryTradeMarkApplicationsResponseBodyDataTmProducesFirstClassification extends TeaModel {
        @NameInMap("ClassificationName")
        public String classificationName;

        @NameInMap("ClassificationCode")
        public String classificationCode;

        public static QueryTradeMarkApplicationsResponseBodyDataTmProducesFirstClassification build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationsResponseBodyDataTmProducesFirstClassification self = new QueryTradeMarkApplicationsResponseBodyDataTmProducesFirstClassification();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProducesFirstClassification setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProducesFirstClassification setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

    }

    public static class QueryTradeMarkApplicationsResponseBodyDataTmProducesRenewResponse extends TeaModel {
        @NameInMap("EngName")
        public String engName;

        @NameInMap("RegisterTime")
        public Long registerTime;

        @NameInMap("EngAddress")
        public String engAddress;

        @NameInMap("Address")
        public String address;

        @NameInMap("Name")
        public String name;

        @NameInMap("SubmitSbjtime")
        public Long submitSbjtime;

        public static QueryTradeMarkApplicationsResponseBodyDataTmProducesRenewResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationsResponseBodyDataTmProducesRenewResponse self = new QueryTradeMarkApplicationsResponseBodyDataTmProducesRenewResponse();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProducesRenewResponse setEngName(String engName) {
            this.engName = engName;
            return this;
        }
        public String getEngName() {
            return this.engName;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProducesRenewResponse setRegisterTime(Long registerTime) {
            this.registerTime = registerTime;
            return this;
        }
        public Long getRegisterTime() {
            return this.registerTime;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProducesRenewResponse setEngAddress(String engAddress) {
            this.engAddress = engAddress;
            return this;
        }
        public String getEngAddress() {
            return this.engAddress;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProducesRenewResponse setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProducesRenewResponse setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProducesRenewResponse setSubmitSbjtime(Long submitSbjtime) {
            this.submitSbjtime = submitSbjtime;
            return this;
        }
        public Long getSubmitSbjtime() {
            return this.submitSbjtime;
        }

    }

    public static class QueryTradeMarkApplicationsResponseBodyDataTmProduces extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("OrderPrice")
        public Float orderPrice;

        @NameInMap("SubmitAuditTime")
        public Long submitAuditTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("MaterialName")
        public String materialName;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("ServicePrice")
        public Float servicePrice;

        @NameInMap("TmIcon")
        public String tmIcon;

        @NameInMap("TmName")
        public String tmName;

        @NameInMap("MaterialId")
        public Long materialId;

        @NameInMap("SupplementId")
        public Long supplementId;

        @NameInMap("LoaUrl")
        public String loaUrl;

        @NameInMap("TmNumber")
        public String tmNumber;

        @NameInMap("Note")
        public String note;

        @NameInMap("SupplementStatus")
        public Integer supplementStatus;

        @NameInMap("PrincipalName")
        public Integer principalName;

        @NameInMap("TotalPrice")
        public Float totalPrice;

        @NameInMap("SubmitTime")
        public Long submitTime;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("ThirdClassification")
        public QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassification thirdClassification;

        @NameInMap("Flags")
        public QueryTradeMarkApplicationsResponseBodyDataTmProducesFlags flags;

        @NameInMap("FirstClassification")
        public QueryTradeMarkApplicationsResponseBodyDataTmProducesFirstClassification firstClassification;

        @NameInMap("RenewResponse")
        public QueryTradeMarkApplicationsResponseBodyDataTmProducesRenewResponse renewResponse;

        public static QueryTradeMarkApplicationsResponseBodyDataTmProduces build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationsResponseBodyDataTmProduces self = new QueryTradeMarkApplicationsResponseBodyDataTmProduces();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setOrderPrice(Float orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Float getOrderPrice() {
            return this.orderPrice;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setSubmitAuditTime(Long submitAuditTime) {
            this.submitAuditTime = submitAuditTime;
            return this;
        }
        public Long getSubmitAuditTime() {
            return this.submitAuditTime;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setMaterialName(String materialName) {
            this.materialName = materialName;
            return this;
        }
        public String getMaterialName() {
            return this.materialName;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setServicePrice(Float servicePrice) {
            this.servicePrice = servicePrice;
            return this;
        }
        public Float getServicePrice() {
            return this.servicePrice;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setTmIcon(String tmIcon) {
            this.tmIcon = tmIcon;
            return this;
        }
        public String getTmIcon() {
            return this.tmIcon;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setTmName(String tmName) {
            this.tmName = tmName;
            return this;
        }
        public String getTmName() {
            return this.tmName;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setMaterialId(Long materialId) {
            this.materialId = materialId;
            return this;
        }
        public Long getMaterialId() {
            return this.materialId;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setSupplementId(Long supplementId) {
            this.supplementId = supplementId;
            return this;
        }
        public Long getSupplementId() {
            return this.supplementId;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setTmNumber(String tmNumber) {
            this.tmNumber = tmNumber;
            return this;
        }
        public String getTmNumber() {
            return this.tmNumber;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setSupplementStatus(Integer supplementStatus) {
            this.supplementStatus = supplementStatus;
            return this;
        }
        public Integer getSupplementStatus() {
            return this.supplementStatus;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setPrincipalName(Integer principalName) {
            this.principalName = principalName;
            return this;
        }
        public Integer getPrincipalName() {
            return this.principalName;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setTotalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Float getTotalPrice() {
            return this.totalPrice;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setSubmitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public Long getSubmitTime() {
            return this.submitTime;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setThirdClassification(QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassification thirdClassification) {
            this.thirdClassification = thirdClassification;
            return this;
        }
        public QueryTradeMarkApplicationsResponseBodyDataTmProducesThirdClassification getThirdClassification() {
            return this.thirdClassification;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setFlags(QueryTradeMarkApplicationsResponseBodyDataTmProducesFlags flags) {
            this.flags = flags;
            return this;
        }
        public QueryTradeMarkApplicationsResponseBodyDataTmProducesFlags getFlags() {
            return this.flags;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setFirstClassification(QueryTradeMarkApplicationsResponseBodyDataTmProducesFirstClassification firstClassification) {
            this.firstClassification = firstClassification;
            return this;
        }
        public QueryTradeMarkApplicationsResponseBodyDataTmProducesFirstClassification getFirstClassification() {
            return this.firstClassification;
        }

        public QueryTradeMarkApplicationsResponseBodyDataTmProduces setRenewResponse(QueryTradeMarkApplicationsResponseBodyDataTmProducesRenewResponse renewResponse) {
            this.renewResponse = renewResponse;
            return this;
        }
        public QueryTradeMarkApplicationsResponseBodyDataTmProducesRenewResponse getRenewResponse() {
            return this.renewResponse;
        }

    }

    public static class QueryTradeMarkApplicationsResponseBodyData extends TeaModel {
        @NameInMap("TmProduces")
        public java.util.List<QueryTradeMarkApplicationsResponseBodyDataTmProduces> tmProduces;

        public static QueryTradeMarkApplicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationsResponseBodyData self = new QueryTradeMarkApplicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationsResponseBodyData setTmProduces(java.util.List<QueryTradeMarkApplicationsResponseBodyDataTmProduces> tmProduces) {
            this.tmProduces = tmProduces;
            return this;
        }
        public java.util.List<QueryTradeMarkApplicationsResponseBodyDataTmProduces> getTmProduces() {
            return this.tmProduces;
        }

    }

}
