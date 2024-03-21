// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SearchSimilarityRequest extends TeaModel {
    @NameInMap("Classifications")
    public java.util.Map<String, ?> classifications;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NameUriList")
    public java.util.List<SearchSimilarityRequestNameUriList> nameUriList;

    @NameInMap("SearchType")
    public String searchType;

    @NameInMap("ShowDetail")
    public Boolean showDetail;

    @NameInMap("SimilarGroups")
    public java.util.Map<String, ?> similarGroups;

    @NameInMap("Sorter")
    public String sorter;

    @NameInMap("Umid")
    public String umid;

    public static SearchSimilarityRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchSimilarityRequest self = new SearchSimilarityRequest();
        return TeaModel.build(map, self);
    }

    public SearchSimilarityRequest setClassifications(java.util.Map<String, ?> classifications) {
        this.classifications = classifications;
        return this;
    }
    public java.util.Map<String, ?> getClassifications() {
        return this.classifications;
    }

    public SearchSimilarityRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchSimilarityRequest setNameUriList(java.util.List<SearchSimilarityRequestNameUriList> nameUriList) {
        this.nameUriList = nameUriList;
        return this;
    }
    public java.util.List<SearchSimilarityRequestNameUriList> getNameUriList() {
        return this.nameUriList;
    }

    public SearchSimilarityRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public SearchSimilarityRequest setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
        return this;
    }
    public Boolean getShowDetail() {
        return this.showDetail;
    }

    public SearchSimilarityRequest setSimilarGroups(java.util.Map<String, ?> similarGroups) {
        this.similarGroups = similarGroups;
        return this;
    }
    public java.util.Map<String, ?> getSimilarGroups() {
        return this.similarGroups;
    }

    public SearchSimilarityRequest setSorter(String sorter) {
        this.sorter = sorter;
        return this;
    }
    public String getSorter() {
        return this.sorter;
    }

    public SearchSimilarityRequest setUmid(String umid) {
        this.umid = umid;
        return this;
    }
    public String getUmid() {
        return this.umid;
    }

    public static class SearchSimilarityRequestNameUriList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Uri")
        public String uri;

        public static SearchSimilarityRequestNameUriList build(java.util.Map<String, ?> map) throws Exception {
            SearchSimilarityRequestNameUriList self = new SearchSimilarityRequestNameUriList();
            return TeaModel.build(map, self);
        }

        public SearchSimilarityRequestNameUriList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchSimilarityRequestNameUriList setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
