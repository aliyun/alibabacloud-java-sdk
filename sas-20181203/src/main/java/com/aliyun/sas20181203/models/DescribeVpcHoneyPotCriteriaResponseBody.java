// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcHoneyPotCriteriaResponseBody extends TeaModel {
    // An array consisting of the search conditions that can be used to query honeypots.
    @NameInMap("CriteriaList")
    public java.util.List<DescribeVpcHoneyPotCriteriaResponseBodyCriteriaList> criteriaList;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVpcHoneyPotCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcHoneyPotCriteriaResponseBody self = new DescribeVpcHoneyPotCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcHoneyPotCriteriaResponseBody setCriteriaList(java.util.List<DescribeVpcHoneyPotCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<DescribeVpcHoneyPotCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public DescribeVpcHoneyPotCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVpcHoneyPotCriteriaResponseBodyCriteriaList extends TeaModel {
        // The name of the search condition.
        @NameInMap("Name")
        public String name;

        // The type of the search condition. Valid values:
        // 
        // *   **input**: You must manually enter the search condition.
        // *   **select**: You must select a search condition from the **Values** drop-down list.
        @NameInMap("Type")
        public String type;

        // The values of the search condition. This parameter is returned only if the value of **Type** is **select**.
        // 
        // >  If the value of **Type** is **input**, the value of this parameter is an empty string.
        @NameInMap("Values")
        public String values;

        public static DescribeVpcHoneyPotCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcHoneyPotCriteriaResponseBodyCriteriaList self = new DescribeVpcHoneyPotCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcHoneyPotCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVpcHoneyPotCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVpcHoneyPotCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
