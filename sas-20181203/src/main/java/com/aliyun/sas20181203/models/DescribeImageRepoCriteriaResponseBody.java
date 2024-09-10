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
     * 
     * <strong>example:</strong>
     * <p>F35F45B0-5D6B-4238-BE02-A62D0760E840</p>
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
         * <p>The name of the search condition. Valid values:</p>
         * <ul>
         * <li><strong>instanceId</strong>: the ID of the image instance.</li>
         * <li><strong>repoName</strong>: the name of the image repository.</li>
         * <li><strong>repoId</strong>: the ID of the image repository.</li>
         * <li><strong>repoNamespace</strong>: the namespace of the image repository.</li>
         * <li><strong>regionId</strong>: the region in which the image resides.</li>
         * <li><strong>vulStatus</strong>: indicates whether vulnerabilities exist.</li>
         * <li><strong>alarmStatus</strong>: indicates whether security alerts exist.</li>
         * <li><strong>hcStatus</strong>: indicates whether baseline risks exist.</li>
         * <li><strong>riskStatus</strong>: indicates whether risks exist.</li>
         * <li><strong>registryType</strong>: the type of the image repository.</li>
         * <li><strong>ImageId</strong>: the image ID.</li>
         * <li><strong>tag</strong>: the image tag.</li>
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
         * <p>select</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The values of the search condition. This parameter is returned only if the value of <strong>Type</strong> is set to <strong>select</strong>.</p>
         * <blockquote>
         * <p>If the value of <strong>Type</strong> is set to <strong>input</strong>, the return value of this parameter is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NO,YES</p>
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
