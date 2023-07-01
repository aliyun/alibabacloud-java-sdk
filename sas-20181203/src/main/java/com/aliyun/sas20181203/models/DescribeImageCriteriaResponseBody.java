// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageCriteriaResponseBody extends TeaModel {
    /**
     * <p>The list of the search conditions.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<DescribeImageCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCriteriaResponseBody self = new DescribeImageCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageCriteriaResponseBody setCriteriaList(java.util.List<DescribeImageCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<DescribeImageCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public DescribeImageCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageCriteriaResponseBodyCriteriaList extends TeaModel {
        /**
         * <p>The name of the search condition.</p>
         * <p>- **tag**: the tag of the image</p>
         * <p>- **digest**: the digest of the image</p>
         * <p>- **vulStatus**: the status of the vulnerability</p>
         * <p>- **alarmStatus**: the status of the alert</p>
         * <p>- **riskStatus**: the status of the risk</p>
         * <p>- **registryType**: the type of the image repository</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <p>- **input**: The search condition needs to be specified.</p>
         * <p>- **select**: The search condition is an option that can be selected from the drop-down list.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The values of the search condition. This parameter is returned only if the value of Type is select.</p>
         * <p>> If the value of **Type** is **input**, the value of this parameter is an empty string.</p>
         */
        @NameInMap("Values")
        public String values;

        public static DescribeImageCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCriteriaResponseBodyCriteriaList self = new DescribeImageCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribeImageCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImageCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
