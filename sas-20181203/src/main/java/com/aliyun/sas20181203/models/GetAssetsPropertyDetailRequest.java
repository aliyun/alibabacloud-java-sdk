// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyDetailRequest extends TeaModel {
    @NameInMap("Biz")
    public String biz;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ItemName")
    public String itemName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SearchCriteriaList")
    public java.util.List<GetAssetsPropertyDetailRequestSearchCriteriaList> searchCriteriaList;

    @NameInMap("Uuid")
    public String uuid;

    public static GetAssetsPropertyDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetsPropertyDetailRequest self = new GetAssetsPropertyDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetsPropertyDetailRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public GetAssetsPropertyDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAssetsPropertyDetailRequest setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public GetAssetsPropertyDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetAssetsPropertyDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAssetsPropertyDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public GetAssetsPropertyDetailRequest setSearchCriteriaList(java.util.List<GetAssetsPropertyDetailRequestSearchCriteriaList> searchCriteriaList) {
        this.searchCriteriaList = searchCriteriaList;
        return this;
    }
    public java.util.List<GetAssetsPropertyDetailRequestSearchCriteriaList> getSearchCriteriaList() {
        return this.searchCriteriaList;
    }

    public GetAssetsPropertyDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class GetAssetsPropertyDetailRequestSearchCriteriaList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static GetAssetsPropertyDetailRequestSearchCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            GetAssetsPropertyDetailRequestSearchCriteriaList self = new GetAssetsPropertyDetailRequestSearchCriteriaList();
            return TeaModel.build(map, self);
        }

        public GetAssetsPropertyDetailRequestSearchCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAssetsPropertyDetailRequestSearchCriteriaList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
