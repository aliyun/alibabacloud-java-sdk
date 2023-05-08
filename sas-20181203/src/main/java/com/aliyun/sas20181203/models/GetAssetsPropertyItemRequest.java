// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyItemRequest extends TeaModel {
    @NameInMap("Biz")
    public String biz;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ForceFlush")
    public Boolean forceFlush;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchInfo")
    public String searchInfo;

    @NameInMap("SearchItem")
    public String searchItem;

    public static GetAssetsPropertyItemRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetsPropertyItemRequest self = new GetAssetsPropertyItemRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetsPropertyItemRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public GetAssetsPropertyItemRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAssetsPropertyItemRequest setForceFlush(Boolean forceFlush) {
        this.forceFlush = forceFlush;
        return this;
    }
    public Boolean getForceFlush() {
        return this.forceFlush;
    }

    public GetAssetsPropertyItemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetAssetsPropertyItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAssetsPropertyItemRequest setSearchInfo(String searchInfo) {
        this.searchInfo = searchInfo;
        return this;
    }
    public String getSearchInfo() {
        return this.searchInfo;
    }

    public GetAssetsPropertyItemRequest setSearchItem(String searchItem) {
        this.searchItem = searchItem;
        return this;
    }
    public String getSearchItem() {
        return this.searchItem;
    }

}
