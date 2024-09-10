// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcHoneyPotCriteriaResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the search conditions.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<DescribeVpcHoneyPotCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>FCE38ADB-7361-4212-AD87-A4514E4DF925</p>
     */
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
        /**
         * <p>The name of the search condition.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcRegionId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <ul>
         * <li><strong>input</strong>: You must manually enter the search condition.</li>
         * <li><strong>select</strong>: You must select a search condition from the <strong>Values</strong> drop-down list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The values of the search condition. This parameter is returned only if the value of <strong>Type</strong> is <strong>select</strong>.</p>
         * <blockquote>
         * <p>If the value of <strong>Type</strong> is <strong>input</strong>, the value of this parameter is an empty string.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-2,eu-west-1</p>
         */
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
