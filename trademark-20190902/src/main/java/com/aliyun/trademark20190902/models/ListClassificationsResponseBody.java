// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListClassificationsResponseBody extends TeaModel {
    @NameInMap("Classifications")
    public ListClassificationsResponseBodyClassifications classifications;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListClassificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClassificationsResponseBody self = new ListClassificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClassificationsResponseBody setClassifications(ListClassificationsResponseBodyClassifications classifications) {
        this.classifications = classifications;
        return this;
    }
    public ListClassificationsResponseBodyClassifications getClassifications() {
        return this.classifications;
    }

    public ListClassificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClassificationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListClassificationsResponseBodyClassificationsClassification extends TeaModel {
        @NameInMap("ClassificationCode")
        public String classificationCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("OfficialCode")
        public String officialCode;

        @NameInMap("ParentCode")
        public String parentCode;

        public static ListClassificationsResponseBodyClassificationsClassification build(java.util.Map<String, ?> map) throws Exception {
            ListClassificationsResponseBodyClassificationsClassification self = new ListClassificationsResponseBodyClassificationsClassification();
            return TeaModel.build(map, self);
        }

        public ListClassificationsResponseBodyClassificationsClassification setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

        public ListClassificationsResponseBodyClassificationsClassification setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public ListClassificationsResponseBodyClassificationsClassification setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListClassificationsResponseBodyClassificationsClassification setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public ListClassificationsResponseBodyClassificationsClassification setOfficialCode(String officialCode) {
            this.officialCode = officialCode;
            return this;
        }
        public String getOfficialCode() {
            return this.officialCode;
        }

        public ListClassificationsResponseBodyClassificationsClassification setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

    }

    public static class ListClassificationsResponseBodyClassifications extends TeaModel {
        @NameInMap("Classification")
        public java.util.List<ListClassificationsResponseBodyClassificationsClassification> classification;

        public static ListClassificationsResponseBodyClassifications build(java.util.Map<String, ?> map) throws Exception {
            ListClassificationsResponseBodyClassifications self = new ListClassificationsResponseBodyClassifications();
            return TeaModel.build(map, self);
        }

        public ListClassificationsResponseBodyClassifications setClassification(java.util.List<ListClassificationsResponseBodyClassificationsClassification> classification) {
            this.classification = classification;
            return this;
        }
        public java.util.List<ListClassificationsResponseBodyClassificationsClassification> getClassification() {
            return this.classification;
        }

    }

}
