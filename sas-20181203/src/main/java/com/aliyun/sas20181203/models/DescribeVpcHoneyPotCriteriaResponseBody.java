// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcHoneyPotCriteriaResponseBody extends TeaModel {
    @NameInMap("CriteriaList")
    public java.util.List<DescribeVpcHoneyPotCriteriaResponseBodyCriteriaList> criteriaList;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

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
