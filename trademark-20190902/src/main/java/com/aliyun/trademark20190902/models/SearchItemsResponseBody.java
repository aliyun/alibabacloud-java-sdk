// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SearchItemsResponseBody extends TeaModel {
    @NameInMap("Module")
    public SearchItemsResponseBodyModule module;

    public static SearchItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchItemsResponseBody self = new SearchItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchItemsResponseBody setModule(SearchItemsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public SearchItemsResponseBodyModule getModule() {
        return this.module;
    }

    public static class SearchItemsResponseBodyModuleDateItem extends TeaModel {
        @NameInMap("DetailViewObjectSourceDatum")
        public String detailViewObjectSourceDatum;

        @NameInMap("DetailViewObjectSourceType")
        public String detailViewObjectSourceType;

        public static SearchItemsResponseBodyModuleDateItem build(java.util.Map<String, ?> map) throws Exception {
            SearchItemsResponseBodyModuleDateItem self = new SearchItemsResponseBodyModuleDateItem();
            return TeaModel.build(map, self);
        }

        public SearchItemsResponseBodyModuleDateItem setDetailViewObjectSourceDatum(String detailViewObjectSourceDatum) {
            this.detailViewObjectSourceDatum = detailViewObjectSourceDatum;
            return this;
        }
        public String getDetailViewObjectSourceDatum() {
            return this.detailViewObjectSourceDatum;
        }

        public SearchItemsResponseBodyModuleDateItem setDetailViewObjectSourceType(String detailViewObjectSourceType) {
            this.detailViewObjectSourceType = detailViewObjectSourceType;
            return this;
        }
        public String getDetailViewObjectSourceType() {
            return this.detailViewObjectSourceType;
        }

    }

    public static class SearchItemsResponseBodyModuleDate extends TeaModel {
        @NameInMap("item")
        public java.util.List<SearchItemsResponseBodyModuleDateItem> item;

        public static SearchItemsResponseBodyModuleDate build(java.util.Map<String, ?> map) throws Exception {
            SearchItemsResponseBodyModuleDate self = new SearchItemsResponseBodyModuleDate();
            return TeaModel.build(map, self);
        }

        public SearchItemsResponseBodyModuleDate setItem(java.util.List<SearchItemsResponseBodyModuleDateItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<SearchItemsResponseBodyModuleDateItem> getItem() {
            return this.item;
        }

    }

    public static class SearchItemsResponseBodyModule extends TeaModel {
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        @NameInMap("Date")
        public SearchItemsResponseBodyModuleDate date;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalItemNum")
        public Integer totalItemNum;

        @NameInMap("TotalPageNum")
        public Integer totalPageNum;

        public static SearchItemsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            SearchItemsResponseBodyModule self = new SearchItemsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public SearchItemsResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public SearchItemsResponseBodyModule setDate(SearchItemsResponseBodyModuleDate date) {
            this.date = date;
            return this;
        }
        public SearchItemsResponseBodyModuleDate getDate() {
            return this.date;
        }

        public SearchItemsResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchItemsResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public SearchItemsResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
