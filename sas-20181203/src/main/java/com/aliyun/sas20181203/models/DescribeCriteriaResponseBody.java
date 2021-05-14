// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCriteriaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CriteriaList")
    public java.util.List<DescribeCriteriaResponseBodyCriteriaList> criteriaList;

    public static DescribeCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCriteriaResponseBody self = new DescribeCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCriteriaResponseBody setCriteriaList(java.util.List<DescribeCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<DescribeCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public static class DescribeCriteriaResponseBodyCriteriaList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        @NameInMap("Values")
        public String values;

        public static DescribeCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCriteriaResponseBodyCriteriaList self = new DescribeCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribeCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
