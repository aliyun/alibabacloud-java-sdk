// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceCriteriaResponseBody extends TeaModel {
    // The search conditions that are used to search for exposed assets.
    @NameInMap("CriteriaList")
    public java.util.List<DescribeExposedInstanceCriteriaResponseBodyCriteriaList> criteriaList;

    // The ID of the request, which is used to locate and troubleshoot issues.
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
        // The name of the search condition.
        @NameInMap("Name")
        public String name;

        // The type of the search condition. Valid values:
        // 
        // *   **input**: You must configure the search condition.
        // *   **select**: You must select a search condition from the **Values** list.
        @NameInMap("Type")
        public String type;

        // The value of the search condition. This parameter is returned only when the value of the **Type** parameter is **select**.
        // 
        // >  If the value of the **Type** parameter is **input**, this parameter is empty.
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
