// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SearchSimilarityShrinkRequest extends TeaModel {
    @NameInMap("Classifications")
    public String classificationsShrink;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NameUriList")
    public java.util.List<SearchSimilarityShrinkRequestNameUriList> nameUriList;

    @NameInMap("SearchType")
    public String searchType;

    @NameInMap("ShowDetail")
    public Boolean showDetail;

    @NameInMap("SimilarGroups")
    public String similarGroupsShrink;

    @NameInMap("Sorter")
    public String sorter;

    @NameInMap("Umid")
    public String umid;

    public static SearchSimilarityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchSimilarityShrinkRequest self = new SearchSimilarityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchSimilarityShrinkRequest setClassificationsShrink(String classificationsShrink) {
        this.classificationsShrink = classificationsShrink;
        return this;
    }
    public String getClassificationsShrink() {
        return this.classificationsShrink;
    }

    public SearchSimilarityShrinkRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchSimilarityShrinkRequest setNameUriList(java.util.List<SearchSimilarityShrinkRequestNameUriList> nameUriList) {
        this.nameUriList = nameUriList;
        return this;
    }
    public java.util.List<SearchSimilarityShrinkRequestNameUriList> getNameUriList() {
        return this.nameUriList;
    }

    public SearchSimilarityShrinkRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public SearchSimilarityShrinkRequest setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
        return this;
    }
    public Boolean getShowDetail() {
        return this.showDetail;
    }

    public SearchSimilarityShrinkRequest setSimilarGroupsShrink(String similarGroupsShrink) {
        this.similarGroupsShrink = similarGroupsShrink;
        return this;
    }
    public String getSimilarGroupsShrink() {
        return this.similarGroupsShrink;
    }

    public SearchSimilarityShrinkRequest setSorter(String sorter) {
        this.sorter = sorter;
        return this;
    }
    public String getSorter() {
        return this.sorter;
    }

    public SearchSimilarityShrinkRequest setUmid(String umid) {
        this.umid = umid;
        return this;
    }
    public String getUmid() {
        return this.umid;
    }

    public static class SearchSimilarityShrinkRequestNameUriList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Uri")
        public String uri;

        public static SearchSimilarityShrinkRequestNameUriList build(java.util.Map<String, ?> map) throws Exception {
            SearchSimilarityShrinkRequestNameUriList self = new SearchSimilarityShrinkRequestNameUriList();
            return TeaModel.build(map, self);
        }

        public SearchSimilarityShrinkRequestNameUriList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchSimilarityShrinkRequestNameUriList setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
