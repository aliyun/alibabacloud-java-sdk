// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceCriteriaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CriteriaList")
    public java.util.List<DescribeExposedInstanceCriteriaResponseBodyCriteriaList> criteriaList;

    public static DescribeExposedInstanceCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceCriteriaResponseBody self = new DescribeExposedInstanceCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExposedInstanceCriteriaResponseBody setCriteriaList(java.util.List<DescribeExposedInstanceCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<DescribeExposedInstanceCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public static class DescribeExposedInstanceCriteriaResponseBodyCriteriaList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        @NameInMap("Values")
        public String values;

        public static DescribeExposedInstanceCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedInstanceCriteriaResponseBodyCriteriaList self = new DescribeExposedInstanceCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribeExposedInstanceCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeExposedInstanceCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
