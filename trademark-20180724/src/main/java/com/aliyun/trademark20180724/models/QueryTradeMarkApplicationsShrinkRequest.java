// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeMarkApplicationsShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ClassificationCode")
    public String classificationCode;

    @NameInMap("Hidden")
    public Integer hidden;

    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("LogisticsNo")
    public String logisticsNo;

    @NameInMap("MaterialName")
    public String materialName;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductType")
    public Integer productType;

    @NameInMap("SortFiled")
    public String sortFiled;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("Specification")
    public Integer specification;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("StatusList")
    public String statusListShrink;

    @NameInMap("SupplementStatus")
    public Integer supplementStatus;

    @NameInMap("TmName")
    public String tmName;

    @NameInMap("TmNumber")
    public String tmNumber;

    @NameInMap("Type")
    public String type;

    public static QueryTradeMarkApplicationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeMarkApplicationsShrinkRequest self = new QueryTradeMarkApplicationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradeMarkApplicationsShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryTradeMarkApplicationsShrinkRequest setClassificationCode(String classificationCode) {
        this.classificationCode = classificationCode;
        return this;
    }
    public String getClassificationCode() {
        return this.classificationCode;
    }

    public QueryTradeMarkApplicationsShrinkRequest setHidden(Integer hidden) {
        this.hidden = hidden;
        return this;
    }
    public Integer getHidden() {
        return this.hidden;
    }

    public QueryTradeMarkApplicationsShrinkRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public QueryTradeMarkApplicationsShrinkRequest setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
        return this;
    }
    public String getLogisticsNo() {
        return this.logisticsNo;
    }

    public QueryTradeMarkApplicationsShrinkRequest setMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }
    public String getMaterialName() {
        return this.materialName;
    }

    public QueryTradeMarkApplicationsShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryTradeMarkApplicationsShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTradeMarkApplicationsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTradeMarkApplicationsShrinkRequest setProductType(Integer productType) {
        this.productType = productType;
        return this;
    }
    public Integer getProductType() {
        return this.productType;
    }

    public QueryTradeMarkApplicationsShrinkRequest setSortFiled(String sortFiled) {
        this.sortFiled = sortFiled;
        return this;
    }
    public String getSortFiled() {
        return this.sortFiled;
    }

    public QueryTradeMarkApplicationsShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public QueryTradeMarkApplicationsShrinkRequest setSpecification(Integer specification) {
        this.specification = specification;
        return this;
    }
    public Integer getSpecification() {
        return this.specification;
    }

    public QueryTradeMarkApplicationsShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryTradeMarkApplicationsShrinkRequest setStatusListShrink(String statusListShrink) {
        this.statusListShrink = statusListShrink;
        return this;
    }
    public String getStatusListShrink() {
        return this.statusListShrink;
    }

    public QueryTradeMarkApplicationsShrinkRequest setSupplementStatus(Integer supplementStatus) {
        this.supplementStatus = supplementStatus;
        return this;
    }
    public Integer getSupplementStatus() {
        return this.supplementStatus;
    }

    public QueryTradeMarkApplicationsShrinkRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public QueryTradeMarkApplicationsShrinkRequest setTmNumber(String tmNumber) {
        this.tmNumber = tmNumber;
        return this;
    }
    public String getTmNumber() {
        return this.tmNumber;
    }

    public QueryTradeMarkApplicationsShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
