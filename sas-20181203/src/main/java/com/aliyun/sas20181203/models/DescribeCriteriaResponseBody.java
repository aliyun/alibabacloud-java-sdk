// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCriteriaResponseBody extends TeaModel {
    // An array that consists of the filter conditions.
    @NameInMap("CriteriaList")
    public java.util.List<DescribeCriteriaResponseBodyCriteriaList> criteriaList;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCriteriaResponseBody self = new DescribeCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCriteriaResponseBody setCriteriaList(java.util.List<DescribeCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<DescribeCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public DescribeCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCriteriaResponseBodyCriteriaList extends TeaModel {
        // The structured attribute values of the assets that match the keyword. The value of this parameter is in the JSON format and contains the following fields:
        // 
        // *   **vendor**: providers
        // *   **regionIds**: IDs of supported regions
        @NameInMap("MultiValues")
        public String multiValues;

        // The name of the filter condition.
        @NameInMap("Name")
        public String name;

        // The type of the filter condition. Valid values:
        // 
        // *   **input**: The filter condition needs to be specified.
        // *   **select**: The filter condition is an option that can be selected from the drop-down list.
        @NameInMap("Type")
        public String type;

        // The attribute values of the assets that match the keyword.
        @NameInMap("Values")
        public String values;

        public static DescribeCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCriteriaResponseBodyCriteriaList self = new DescribeCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribeCriteriaResponseBodyCriteriaList setMultiValues(String multiValues) {
            this.multiValues = multiValues;
            return this;
        }
        public String getMultiValues() {
            return this.multiValues;
        }

        public DescribeCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
