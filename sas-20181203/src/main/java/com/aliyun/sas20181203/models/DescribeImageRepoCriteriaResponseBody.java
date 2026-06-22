// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoCriteriaResponseBody extends TeaModel {
    /**
     * <p>The list of supported search criteria for image repositories.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<DescribeImageRepoCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
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
         * <p>The name of the search criterion. Valid values:</p>
         * <ul>
         * <li><strong>instanceId</strong>: image instance ID.</li>
         * <li><strong>repoName</strong>: repository name.</li>
         * <li><strong>repoId</strong>: repository ID.</li>
         * <li><strong>repoNamespace</strong>: repository namespace.</li>
         * <li><strong>regionId</strong>: image region.</li>
         * <li><strong>vulStatus</strong>: whether vulnerabilities exist.</li>
         * <li><strong>alarmStatus</strong>: whether security alerts exist.</li>
         * <li><strong>hcStatus</strong>: whether baseline risks exist.</li>
         * <li><strong>riskStatus</strong>: whether risks exist.</li>
         * <li><strong>registryType</strong>: repository type.</li>
         * <li><strong>imageId</strong>: image ID.</li>
         * <li><strong>tag</strong>: image tag.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vulStatus</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the search criterion. Valid values:</p>
         * <ul>
         * <li><strong>input</strong>: requires manual input of the search field.</li>
         * <li><strong>select</strong>: requires selecting a subtype from a drop-down list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The available options when <strong>Type</strong> (the type of the search criterion) is <strong>select</strong> (selection type).</p>
         * <blockquote>
         * <p>When <strong>Type</strong> (the type of the search criterion) is <strong>input</strong> (input type), this parameter returns an empty value.</p>
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
