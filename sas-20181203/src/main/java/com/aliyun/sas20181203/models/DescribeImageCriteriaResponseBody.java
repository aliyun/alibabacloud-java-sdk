// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageCriteriaResponseBody extends TeaModel {
    /**
     * <p>The list of image query criteria.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<DescribeImageCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
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
         * <p>The name of the query criterion.</p>
         * <ul>
         * <li><strong>tag</strong>: image tag.</li>
         * <li><strong>digest</strong>: image digest.</li>
         * <li><strong>vulStatus</strong>: vulnerability status.</li>
         * <li><strong>alarmStatus</strong>: security alert status.</li>
         * <li><strong>riskStatus</strong>: risk status.</li>
         * <li><strong>registryType</strong>: image repository type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vulStatus</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the query criterion. Valid values:</p>
         * <ul>
         * <li><strong>input</strong>: requires manual input of the query field.</li>
         * <li><strong>select</strong>: requires selecting a subtype from a drop-down list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The available option values when <strong>Type</strong> (the type of the query criterion) is <strong>select</strong>.</p>
         * <blockquote>
         * <p>When <strong>Type</strong> (the type of the query criterion) is <strong>input</strong>, this parameter returns an empty value.</p>
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
