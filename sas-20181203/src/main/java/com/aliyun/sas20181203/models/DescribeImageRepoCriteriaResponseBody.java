// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoCriteriaResponseBody extends TeaModel {
    /**
     * <p>An array consisting of the filter conditions that are supported by the image repository.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<DescribeImageRepoCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageRepoCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRepoCriteriaResponseBody self = new DescribeImageRepoCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageRepoCriteriaResponseBody setCriteriaList(java.util.List<DescribeImageRepoCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<DescribeImageRepoCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public DescribeImageRepoCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageRepoCriteriaResponseBodyCriteriaList extends TeaModel {
        /**
         * <p>The name of the filter condition. Valid values:</p>
         * <br>
         * <p>*   **instanceId**: the ID of the image instance.</p>
         * <p>*   **repoName**: the name of the image repository.</p>
         * <p>*   **repoId**: the ID of the image repository.</p>
         * <p>*   **repoNamespace**: the namespace of the image repository.</p>
         * <p>*   **regionId**: the region of the image.</p>
         * <p>*   **vulStatus**: indicates whether vulnerabilities exist.</p>
         * <p>*   **alarmStatus**: indicates whether security alerts exist.</p>
         * <p>*   **hcStatus**: indicates whether baseline risks exist.</p>
         * <p>*   **riskStatus**: indicates whether risks exist.</p>
         * <p>*   **registryType**: the type of the image repository.</p>
         * <p>*   **ImageId**: the ID of the image.</p>
         * <p>*   **tag**: the tag of the image</p>
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
         * <p>The value of the filter condition. This parameter is returned only if the value of **Type** is **select**.</p>
         * <br>
         * <p>> If the value of **Type** is **input**, the value of this parameter is an empty string.</p>
         */
        @NameInMap("Values")
        public String values;

        public static DescribeImageRepoCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageRepoCriteriaResponseBodyCriteriaList self = new DescribeImageRepoCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribeImageRepoCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageRepoCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImageRepoCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
