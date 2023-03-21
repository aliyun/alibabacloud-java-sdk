// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoCriteriaResponseBody extends TeaModel {
    @NameInMap("CriteriaList")
    public java.util.List<DescribeImageRepoCriteriaResponseBodyCriteriaList> criteriaList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageRepoCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRepoCriteriaResponseBody self = new DescribeImageRepoCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageRepoCriteriaResponseBody setCriteriaList(java.util.List<DescribeImageRepoCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<DescribeImageRepoCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public DescribeImageRepoCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageRepoCriteriaResponseBodyCriteriaList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public String values;

        public static DescribeImageRepoCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageRepoCriteriaResponseBodyCriteriaList self = new DescribeImageRepoCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribeImageRepoCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageRepoCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImageRepoCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
