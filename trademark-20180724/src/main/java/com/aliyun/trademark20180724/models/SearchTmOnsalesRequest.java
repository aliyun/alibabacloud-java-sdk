// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SearchTmOnsalesRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Classification")
    public String classification;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegisterNumber")
    public String registerNumber;

    @NameInMap("TmName")
    public String tmName;

    @NameInMap("TopSearch")
    public String topSearch;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("OrderPriceLeft")
    public Long orderPriceLeft;

    @NameInMap("OrderPriceRight")
    public Long orderPriceRight;

    @NameInMap("RegLeft")
    public Integer regLeft;

    @NameInMap("RegRight")
    public Integer regRight;

    @NameInMap("SortName")
    public String sortName;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("QueryAll")
    public Boolean queryAll;

    public static SearchTmOnsalesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTmOnsalesRequest self = new SearchTmOnsalesRequest();
        return TeaModel.build(map, self);
    }

    public SearchTmOnsalesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchTmOnsalesRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public SearchTmOnsalesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SearchTmOnsalesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public SearchTmOnsalesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchTmOnsalesRequest setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
        return this;
    }
    public String getRegisterNumber() {
        return this.registerNumber;
    }

    public SearchTmOnsalesRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public SearchTmOnsalesRequest setTopSearch(String topSearch) {
        this.topSearch = topSearch;
        return this;
    }
    public String getTopSearch() {
        return this.topSearch;
    }

    public SearchTmOnsalesRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SearchTmOnsalesRequest setOrderPriceLeft(Long orderPriceLeft) {
        this.orderPriceLeft = orderPriceLeft;
        return this;
    }
    public Long getOrderPriceLeft() {
        return this.orderPriceLeft;
    }

    public SearchTmOnsalesRequest setOrderPriceRight(Long orderPriceRight) {
        this.orderPriceRight = orderPriceRight;
        return this;
    }
    public Long getOrderPriceRight() {
        return this.orderPriceRight;
    }

    public SearchTmOnsalesRequest setRegLeft(Integer regLeft) {
        this.regLeft = regLeft;
        return this;
    }
    public Integer getRegLeft() {
        return this.regLeft;
    }

    public SearchTmOnsalesRequest setRegRight(Integer regRight) {
        this.regRight = regRight;
        return this;
    }
    public Integer getRegRight() {
        return this.regRight;
    }

    public SearchTmOnsalesRequest setSortName(String sortName) {
        this.sortName = sortName;
        return this;
    }
    public String getSortName() {
        return this.sortName;
    }

    public SearchTmOnsalesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public SearchTmOnsalesRequest setQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
        return this;
    }
    public Boolean getQueryAll() {
        return this.queryAll;
    }

}
