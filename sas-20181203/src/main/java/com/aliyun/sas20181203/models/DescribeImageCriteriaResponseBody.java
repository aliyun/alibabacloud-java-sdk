// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageCriteriaResponseBody extends TeaModel {
    @NameInMap("CriteriaList")
    public java.util.List<DescribeImageCriteriaResponseBodyCriteriaList> criteriaList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCriteriaResponseBody self = new DescribeImageCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageCriteriaResponseBody setCriteriaList(java.util.List<DescribeImageCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<DescribeImageCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public DescribeImageCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageCriteriaResponseBodyCriteriaList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public String values;

        public static DescribeImageCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCriteriaResponseBodyCriteriaList self = new DescribeImageCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribeImageCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImageCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
