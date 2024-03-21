// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SearchItemsRequest extends TeaModel {
    @NameInMap("ExcludedTags")
    public String excludedTags;

    @NameInMap("ExcludedUids")
    public String excludedUids;

    @NameInMap("FeedsType")
    public Boolean feedsType;

    @NameInMap("IntCls")
    public String intCls;

    @NameInMap("Keywords")
    public String keywords;

    @NameInMap("Mock")
    public Boolean mock;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PriceLeft")
    public String priceLeft;

    @NameInMap("PriceRight")
    public String priceRight;

    @NameInMap("Products")
    public String products;

    @NameInMap("RegisterNumber")
    public String registerNumber;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("SortType")
    public Integer sortType;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("TrademarkNameLength")
    public Integer trademarkNameLength;

    @NameInMap("TrademarkNameType")
    public String trademarkNameType;

    @NameInMap("UmId")
    public String umId;

    public static SearchItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchItemsRequest self = new SearchItemsRequest();
        return TeaModel.build(map, self);
    }

    public SearchItemsRequest setExcludedTags(String excludedTags) {
        this.excludedTags = excludedTags;
        return this;
    }
    public String getExcludedTags() {
        return this.excludedTags;
    }

    public SearchItemsRequest setExcludedUids(String excludedUids) {
        this.excludedUids = excludedUids;
        return this;
    }
    public String getExcludedUids() {
        return this.excludedUids;
    }

    public SearchItemsRequest setFeedsType(Boolean feedsType) {
        this.feedsType = feedsType;
        return this;
    }
    public Boolean getFeedsType() {
        return this.feedsType;
    }

    public SearchItemsRequest setIntCls(String intCls) {
        this.intCls = intCls;
        return this;
    }
    public String getIntCls() {
        return this.intCls;
    }

    public SearchItemsRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public SearchItemsRequest setMock(Boolean mock) {
        this.mock = mock;
        return this;
    }
    public Boolean getMock() {
        return this.mock;
    }

    public SearchItemsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public SearchItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchItemsRequest setPriceLeft(String priceLeft) {
        this.priceLeft = priceLeft;
        return this;
    }
    public String getPriceLeft() {
        return this.priceLeft;
    }

    public SearchItemsRequest setPriceRight(String priceRight) {
        this.priceRight = priceRight;
        return this;
    }
    public String getPriceRight() {
        return this.priceRight;
    }

    public SearchItemsRequest setProducts(String products) {
        this.products = products;
        return this;
    }
    public String getProducts() {
        return this.products;
    }

    public SearchItemsRequest setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
        return this;
    }
    public String getRegisterNumber() {
        return this.registerNumber;
    }

    public SearchItemsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public SearchItemsRequest setSortType(Integer sortType) {
        this.sortType = sortType;
        return this;
    }
    public Integer getSortType() {
        return this.sortType;
    }

    public SearchItemsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public SearchItemsRequest setTrademarkNameLength(Integer trademarkNameLength) {
        this.trademarkNameLength = trademarkNameLength;
        return this;
    }
    public Integer getTrademarkNameLength() {
        return this.trademarkNameLength;
    }

    public SearchItemsRequest setTrademarkNameType(String trademarkNameType) {
        this.trademarkNameType = trademarkNameType;
        return this;
    }
    public String getTrademarkNameType() {
        return this.trademarkNameType;
    }

    public SearchItemsRequest setUmId(String umId) {
        this.umId = umId;
        return this;
    }
    public String getUmId() {
        return this.umId;
    }

}
