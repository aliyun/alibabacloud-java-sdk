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
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
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
         * <ul>
         * <li><strong>tag</strong>: the tag of the image</li>
         * <li><strong>digest</strong>: the digest of the image</li>
         * <li><strong>vulStatus</strong>: the status of the vulnerability</li>
         * <li><strong>alarmStatus</strong>: the status of the alert</li>
         * <li><strong>riskStatus</strong>: the status of the risk</li>
         * <li><strong>registryType</strong>: the type of the image repository</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vulStatus</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <ul>
         * <li><strong>input</strong>: The search condition needs to be specified.</li>
         * <li><strong>select</strong>: The search condition is an option that can be selected from the drop-down list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The values of the search condition. This parameter is returned only if the value of Type is select.</p>
         * <blockquote>
         * <p>If the value of <strong>Type</strong> is <strong>input</strong>, the value of this parameter is an empty string.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NO,YES</p>
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
