// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeScopeDataRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("Category")
    public String category;

    @NameInMap("CodeList")
    public String codeList;

    @NameInMap("Factor")
    public String factor;

    @NameInMap("GroupBy")
    public String groupBy;

    @NameInMap("IdList")
    public String idList;

    @NameInMap("Item")
    public String item;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NeedTotalCount")
    public Boolean needTotalCount;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OrderDirection")
    public String orderDirection;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("ParentCode")
    public String parentCode;

    @NameInMap("ParentId")
    public Long parentId;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("RegionNameEn")
    public String regionNameEn;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    @NameInMap("SearchValue")
    public String searchValue;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("Uid")
    public String uid;

    public static SafeScopeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        SafeScopeDataRequest self = new SafeScopeDataRequest();
        return TeaModel.build(map, self);
    }

    public SafeScopeDataRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SafeScopeDataRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public SafeScopeDataRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public SafeScopeDataRequest setCodeList(String codeList) {
        this.codeList = codeList;
        return this;
    }
    public String getCodeList() {
        return this.codeList;
    }

    public SafeScopeDataRequest setFactor(String factor) {
        this.factor = factor;
        return this;
    }
    public String getFactor() {
        return this.factor;
    }

    public SafeScopeDataRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public SafeScopeDataRequest setIdList(String idList) {
        this.idList = idList;
        return this;
    }
    public String getIdList() {
        return this.idList;
    }

    public SafeScopeDataRequest setItem(String item) {
        this.item = item;
        return this;
    }
    public String getItem() {
        return this.item;
    }

    public SafeScopeDataRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SafeScopeDataRequest setNeedTotalCount(Boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    public SafeScopeDataRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public SafeScopeDataRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public SafeScopeDataRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public SafeScopeDataRequest setParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }
    public String getParentCode() {
        return this.parentCode;
    }

    public SafeScopeDataRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public SafeScopeDataRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SafeScopeDataRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public SafeScopeDataRequest setRegionNameEn(String regionNameEn) {
        this.regionNameEn = regionNameEn;
        return this;
    }
    public String getRegionNameEn() {
        return this.regionNameEn;
    }

    public SafeScopeDataRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public SafeScopeDataRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

    public SafeScopeDataRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public SafeScopeDataRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
