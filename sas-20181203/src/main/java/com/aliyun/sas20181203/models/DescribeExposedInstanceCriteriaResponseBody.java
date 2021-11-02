// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceCriteriaResponseBody extends TeaModel {
    @NameInMap("CriteriaList")
    public java.util.List<DescribeExposedInstanceCriteriaResponseBodyCriteriaList> criteriaList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExposedInstanceCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceCriteriaResponseBody self = new DescribeExposedInstanceCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceCriteriaResponseBody setCriteriaList(java.util.List<DescribeExposedInstanceCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<DescribeExposedInstanceCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public DescribeExposedInstanceCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeExposedInstanceCriteriaResponseBodyCriteriaList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public String values;

        public static DescribeExposedInstanceCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedInstanceCriteriaResponseBodyCriteriaList self = new DescribeExposedInstanceCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribeExposedInstanceCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExposedInstanceCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeExposedInstanceCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
