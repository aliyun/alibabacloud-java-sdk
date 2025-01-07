// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSearchConditionResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the filter conditions.</p>
     */
    @NameInMap("ConditionList")
    public java.util.List<DescribeSearchConditionResponseBodyConditionList> conditionList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3AEC47AF-8CFA-485E-AC9A-3A8ABC06EA7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSearchConditionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchConditionResponseBody self = new DescribeSearchConditionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSearchConditionResponseBody setConditionList(java.util.List<DescribeSearchConditionResponseBodyConditionList> conditionList) {
        this.conditionList = conditionList;
        return this;
    }
    public java.util.List<DescribeSearchConditionResponseBodyConditionList> getConditionList() {
        return this.conditionList;
    }

    public DescribeSearchConditionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSearchConditionResponseBodyConditionList extends TeaModel {
        /**
         * <p>The type of the filter condition. Valid values:</p>
         * <ul>
         * <li><strong>system</strong>: default filter conditions.</li>
         * <li><strong>user</strong>: custom filter conditions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("ConditionType")
        public String conditionType;

        /**
         * <p>The filter condition. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>filterParams</strong>: the parameters of the filter condition. The value of this field is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>labelKey</strong>: the key for rendering.</p>
         * </li>
         * <li><p><strong>label</strong>: the display name.</p>
         * </li>
         * <li><p><strong>value</strong>: the value of the filter condition. The value of this field is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>name</strong>: the name of the filter item.</li>
         * <li><strong>value</strong>: the value of the filter item.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>LogicalExp</strong>: the logical relationship among the filter conditions. Valid values:</p>
         * <ul>
         * <li><strong>AND</strong>: The filter conditions are evaluated by using a logical <strong>AND</strong>.</li>
         * <li><strong>OR</strong>: The filter conditions are evaluated by using a logical <strong>OR</strong>.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> If the value of <strong>ConditionType</strong> is <strong>system</strong>, <strong>labelKey</strong> is returned. The labelKey field is used only for internationalization rendering.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;filterParams\&quot;:[{\&quot;labelKey\&quot;:\&quot;a|b\&quot;,\&quot;value\&quot;:\&quot;{\\\&quot;name\\\&quot;:\\\&quot;sadsasd\\\&quot;,\\\&quot;value\\\&quot;:\\\&quot;dasdsdas\\\&quot;}\&quot;}],\&quot;LogicalExp\&quot;:\&quot;OR\&quot;}</p>
         */
        @NameInMap("FilterConditions")
        public String filterConditions;

        /**
         * <p>The filter condition name.</p>
         * 
         * <strong>example:</strong>
         * <p>StopMachine</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The key of the filter condition name.</p>
         * 
         * <strong>example:</strong>
         * <p>stop_machine</p>
         */
        @NameInMap("NameKey")
        public String nameKey;

        public static DescribeSearchConditionResponseBodyConditionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSearchConditionResponseBodyConditionList self = new DescribeSearchConditionResponseBodyConditionList();
            return TeaModel.build(map, self);
        }

        public DescribeSearchConditionResponseBodyConditionList setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public DescribeSearchConditionResponseBodyConditionList setFilterConditions(String filterConditions) {
            this.filterConditions = filterConditions;
            return this;
        }
        public String getFilterConditions() {
            return this.filterConditions;
        }

        public DescribeSearchConditionResponseBodyConditionList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSearchConditionResponseBodyConditionList setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

    }

}
