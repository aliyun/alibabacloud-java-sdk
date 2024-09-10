// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSearchConditionResponseBody extends TeaModel {
    @NameInMap("ConditionList")
    public java.util.List<DescribeSearchConditionResponseBodyConditionList> conditionList;

    /**
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
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("ConditionType")
        public String conditionType;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;filterParams\&quot;:[{\&quot;labelKey\&quot;:\&quot;a|b\&quot;,\&quot;value\&quot;:\&quot;{\\\&quot;name\\\&quot;:\\\&quot;sadsasd\\\&quot;,\\\&quot;value\\\&quot;:\\\&quot;dasdsdas\\\&quot;}\&quot;}],\&quot;LogicalExp\&quot;:\&quot;OR\&quot;}</p>
         */
        @NameInMap("FilterConditions")
        public String filterConditions;

        /**
         * <strong>example:</strong>
         * <p>StopMachine</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
