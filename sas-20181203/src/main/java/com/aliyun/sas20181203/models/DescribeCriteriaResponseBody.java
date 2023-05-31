// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCriteriaResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the filter conditions.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<DescribeCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The structured attribute values of the assets that match the keyword. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <br>
         * <p>*   **vendor**: providers</p>
         * <p>*   **regionIds**: IDs of supported regions</p>
         */
        @NameInMap("MultiValues")
        public String multiValues;

        /**
         * <p>The name of the filter condition.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the filter condition. Valid values:</p>
         * <br>
         * <p>*   **input**: The filter condition needs to be specified.</p>
         * <p>*   **select**: The filter condition is an option that can be selected from the drop-down list.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The attribute values of the assets that match the keyword.</p>
         */
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
