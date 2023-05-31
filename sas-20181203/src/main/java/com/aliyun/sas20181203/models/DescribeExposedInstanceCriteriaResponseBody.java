// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceCriteriaResponseBody extends TeaModel {
    /**
     * <p>The search conditions that are used to search for exposed assets.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<DescribeExposedInstanceCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The name of the search condition.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <br>
         * <p>*   **input**: You must configure the search condition.</p>
         * <p>*   **select**: You must select a search condition from the **Values** list.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the search condition. This parameter is returned only when the value of the **Type** parameter is **select**.</p>
         * <br>
         * <p>>  If the value of the **Type** parameter is **input**, this parameter is empty.</p>
         */
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
