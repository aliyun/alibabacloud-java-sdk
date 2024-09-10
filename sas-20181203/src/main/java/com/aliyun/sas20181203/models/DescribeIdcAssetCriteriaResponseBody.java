// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIdcAssetCriteriaResponseBody extends TeaModel {
    /**
     * <p>The information about the asset search conditions.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<DescribeIdcAssetCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11C96623-E106-59C9-866D-A6C82911****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIdcAssetCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdcAssetCriteriaResponseBody self = new DescribeIdcAssetCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIdcAssetCriteriaResponseBody setCriteriaList(java.util.List<DescribeIdcAssetCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<DescribeIdcAssetCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public DescribeIdcAssetCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIdcAssetCriteriaResponseBodyCriteriaList extends TeaModel {
        /**
         * <p>The name of the search condition.</p>
         * 
         * <strong>example:</strong>
         * <p>scannedIp</p>
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
         * <p>select</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The attribute values of the assets that match the keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.*</p>
         */
        @NameInMap("Values")
        public String values;

        public static DescribeIdcAssetCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeIdcAssetCriteriaResponseBodyCriteriaList self = new DescribeIdcAssetCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribeIdcAssetCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeIdcAssetCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeIdcAssetCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
