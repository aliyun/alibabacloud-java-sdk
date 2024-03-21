// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListTrademarkSearchForInnerRequest extends TeaModel {
    @NameInMap("ApplyBeginTime")
    public String applyBeginTime;

    @NameInMap("ApplyEndTime")
    public String applyEndTime;

    @NameInMap("Classification")
    public String classification;

    @NameInMap("IfPrecision")
    public Boolean ifPrecision;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Product")
    public String product;

    @NameInMap("SearchPreference")
    public String searchPreference;

    @NameInMap("SearchType")
    public String searchType;

    @NameInMap("Status")
    public String status;

    @NameInMap("Umid")
    public String umid;

    @NameInMap("UserId")
    public String userId;

    public static ListTrademarkSearchForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrademarkSearchForInnerRequest self = new ListTrademarkSearchForInnerRequest();
        return TeaModel.build(map, self);
    }

    public ListTrademarkSearchForInnerRequest setApplyBeginTime(String applyBeginTime) {
        this.applyBeginTime = applyBeginTime;
        return this;
    }
    public String getApplyBeginTime() {
        return this.applyBeginTime;
    }

    public ListTrademarkSearchForInnerRequest setApplyEndTime(String applyEndTime) {
        this.applyEndTime = applyEndTime;
        return this;
    }
    public String getApplyEndTime() {
        return this.applyEndTime;
    }

    public ListTrademarkSearchForInnerRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public ListTrademarkSearchForInnerRequest setIfPrecision(Boolean ifPrecision) {
        this.ifPrecision = ifPrecision;
        return this;
    }
    public Boolean getIfPrecision() {
        return this.ifPrecision;
    }

    public ListTrademarkSearchForInnerRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTrademarkSearchForInnerRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTrademarkSearchForInnerRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTrademarkSearchForInnerRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ListTrademarkSearchForInnerRequest setSearchPreference(String searchPreference) {
        this.searchPreference = searchPreference;
        return this;
    }
    public String getSearchPreference() {
        return this.searchPreference;
    }

    public ListTrademarkSearchForInnerRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public ListTrademarkSearchForInnerRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTrademarkSearchForInnerRequest setUmid(String umid) {
        this.umid = umid;
        return this;
    }
    public String getUmid() {
        return this.umid;
    }

    public ListTrademarkSearchForInnerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
