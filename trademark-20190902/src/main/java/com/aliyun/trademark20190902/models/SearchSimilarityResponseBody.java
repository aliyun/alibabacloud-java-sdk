// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SearchSimilarityResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<SearchSimilarityResponseBodyDataList> dataList;

    @NameInMap("RequestId")
    public String requestId;

    public static SearchSimilarityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchSimilarityResponseBody self = new SearchSimilarityResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchSimilarityResponseBody setDataList(java.util.List<SearchSimilarityResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<SearchSimilarityResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public SearchSimilarityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupListDetailList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        @NameInMap("Rate")
        public Integer rate;

        @NameInMap("TmNumber")
        public String tmNumber;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("Uri")
        public String uri;

        public static SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupListDetailList build(java.util.Map<String, ?> map) throws Exception {
            SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupListDetailList self = new SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupListDetailList();
            return TeaModel.build(map, self);
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupListDetailList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupListDetailList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupListDetailList setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupListDetailList setTmNumber(String tmNumber) {
            this.tmNumber = tmNumber;
            return this;
        }
        public String getTmNumber() {
            return this.tmNumber;
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupListDetailList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupListDetailList setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupList extends TeaModel {
        @NameInMap("DetailList")
        public java.util.List<SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupListDetailList> detailList;

        @NameInMap("Rate")
        public Integer rate;

        @NameInMap("SimilarGroup")
        public String similarGroup;

        @NameInMap("SimilarGroupName")
        public String similarGroupName;

        public static SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupList build(java.util.Map<String, ?> map) throws Exception {
            SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupList self = new SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupList();
            return TeaModel.build(map, self);
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupList setDetailList(java.util.List<SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupListDetailList> detailList) {
            this.detailList = detailList;
            return this;
        }
        public java.util.List<SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupListDetailList> getDetailList() {
            return this.detailList;
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupList setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupList setSimilarGroup(String similarGroup) {
            this.similarGroup = similarGroup;
            return this;
        }
        public String getSimilarGroup() {
            return this.similarGroup;
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupList setSimilarGroupName(String similarGroupName) {
            this.similarGroupName = similarGroupName;
            return this;
        }
        public String getSimilarGroupName() {
            return this.similarGroupName;
        }

    }

    public static class SearchSimilarityResponseBodyDataListClassificationSimilarityList extends TeaModel {
        @NameInMap("Classification")
        public Integer classification;

        @NameInMap("ClassificationName")
        public String classificationName;

        @NameInMap("Rate")
        public Integer rate;

        @NameInMap("SimilarGroupList")
        public java.util.List<SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupList> similarGroupList;

        public static SearchSimilarityResponseBodyDataListClassificationSimilarityList build(java.util.Map<String, ?> map) throws Exception {
            SearchSimilarityResponseBodyDataListClassificationSimilarityList self = new SearchSimilarityResponseBodyDataListClassificationSimilarityList();
            return TeaModel.build(map, self);
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityList setClassification(Integer classification) {
            this.classification = classification;
            return this;
        }
        public Integer getClassification() {
            return this.classification;
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityList setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityList setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public SearchSimilarityResponseBodyDataListClassificationSimilarityList setSimilarGroupList(java.util.List<SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupList> similarGroupList) {
            this.similarGroupList = similarGroupList;
            return this;
        }
        public java.util.List<SearchSimilarityResponseBodyDataListClassificationSimilarityListSimilarGroupList> getSimilarGroupList() {
            return this.similarGroupList;
        }

    }

    public static class SearchSimilarityResponseBodyDataList extends TeaModel {
        @NameInMap("ClassificationSimilarityList")
        public java.util.List<SearchSimilarityResponseBodyDataListClassificationSimilarityList> classificationSimilarityList;

        @NameInMap("Name")
        public String name;

        @NameInMap("Uri")
        public String uri;

        public static SearchSimilarityResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            SearchSimilarityResponseBodyDataList self = new SearchSimilarityResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public SearchSimilarityResponseBodyDataList setClassificationSimilarityList(java.util.List<SearchSimilarityResponseBodyDataListClassificationSimilarityList> classificationSimilarityList) {
            this.classificationSimilarityList = classificationSimilarityList;
            return this;
        }
        public java.util.List<SearchSimilarityResponseBodyDataListClassificationSimilarityList> getClassificationSimilarityList() {
            return this.classificationSimilarityList;
        }

        public SearchSimilarityResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchSimilarityResponseBodyDataList setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
