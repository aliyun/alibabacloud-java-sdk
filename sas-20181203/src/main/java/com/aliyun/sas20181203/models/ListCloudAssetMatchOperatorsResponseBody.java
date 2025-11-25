// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudAssetMatchOperatorsResponseBody extends TeaModel {
    /**
     * <p>List of operator types</p>
     */
    @NameInMap("MatchTypeOperators")
    public java.util.List<ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperators> matchTypeOperators;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C699E4E4-F2F4-58FC-A949-457FFE59****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCloudAssetMatchOperatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAssetMatchOperatorsResponseBody self = new ListCloudAssetMatchOperatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudAssetMatchOperatorsResponseBody setMatchTypeOperators(java.util.List<ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperators> matchTypeOperators) {
        this.matchTypeOperators = matchTypeOperators;
        return this;
    }
    public java.util.List<ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperators> getMatchTypeOperators() {
        return this.matchTypeOperators;
    }

    public ListCloudAssetMatchOperatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudAssetMatchOperatorsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperatorsMatchOperators extends TeaModel {
        /**
         * <p>Operation data types. Values: </p>
         * <ul>
         * <li>LIST type:</li>
         * </ul>
         * <ol>
         * <li>For Name as LIST_CONTAINS, the value is: LIST </li>
         * <li>For Name as LIST_LENGTH_GT, the value is: PRIMITIVE </li>
         * <li>For Name as LIST_LENGTH_LT, the value is: PRIMITIVE </li>
         * <li>For Name as LIST_NOT_CONTAINS, the value is: LIST</li>
         * </ol>
         * <ul>
         * <li>STRING type:</li>
         * </ul>
         * <ol>
         * <li>For Name as STRING_NOT_IN, the value is: LIST </li>
         * <li>For Name as STRING_EQ, the value is: PRIMITIVE </li>
         * <li>For Name as STRING_IN, the value is: LIST </li>
         * <li>For Name as STRING_NOT_EQ, the value is: PRIMITIVE</li>
         * </ol>
         * <ul>
         * <li>BOOLEAN type:</li>
         * </ul>
         * <ol>
         * <li>For Name as BOOLEAN_NOT_IN, the value is: LIST </li>
         * <li>For Name as BOOLEAN_EQ, the value is: PRIMITIVE </li>
         * <li>For Name as BOOLEAN_IN, the value is: LIST </li>
         * <li>For Name as BOOLEAN_NOT_EQ, the value is: PRIMITIVE</li>
         * </ol>
         * <ul>
         * <li>FLOAT type:</li>
         * </ul>
         * <ol>
         * <li>For Name as FLOAT_NOT_IN, the value is: LIST </li>
         * <li>For Name as FLOAT_EQ, the value is: PRIMITIVE </li>
         * <li>For Name as FLOAT_IN, the value is: LIST </li>
         * <li>For Name as FLOAT_NOT_EQ, the value is: PRIMITIVE </li>
         * <li>For Name as FLOAT_GT, the value is: PRIMITIVE </li>
         * <li>For Name as FLOAT_GTE, the value is: PRIMITIVE </li>
         * <li>For Name as FLOAT_LT, the value is: PRIMITIVE </li>
         * <li>For Name as FLOAT_LTE, the value is: PRIMITIVE</li>
         * </ol>
         * <ul>
         * <li>DOUBLE type:</li>
         * </ul>
         * <ol>
         * <li>For Name as DOUBLE_NOT_IN, the value is: LIST </li>
         * <li>For Name as DOUBLE_EQ, the value is: PRIMITIVE </li>
         * <li>For Name as DOUBLE_IN, the value is: LIST </li>
         * <li>For Name as DOUBLE_NOT_EQ, the value is: PRIMITIVE </li>
         * <li>For Name as DOUBLE_GT, the value is: PRIMITIVE </li>
         * <li>For Name as DOUBLE_GTE, the value is: PRIMITIVE </li>
         * <li>For Name as DOUBLE_LT, the value is: PRIMITIVE 8. For Name as DOUBLE_LTE, the value is: PRIMITIVE</li>
         * </ol>
         * <ul>
         * <li>INTEGER type:</li>
         * </ul>
         * <ol>
         * <li>For Name as INTEGER_NOT_IN, the value is: LIST </li>
         * <li>For Name as INTEGER_EQ, the value is: PRIMITIVE </li>
         * <li>For Name as INTEGER_IN, the value is: LIST </li>
         * <li>For Name as INTEGER_NOT_EQ, the value is: PRIMITIVE </li>
         * <li>For Name as INTEGER_GT, the value is: PRIMITIVE </li>
         * <li>For Name as INTEGER_GTE, the value is: PRIMITIVE </li>
         * <li>For Name as INTEGER_LT, the value is: PRIMITIVE </li>
         * <li>For Name as INTEGER_LTE, the value is: PRIMITIVE</li>
         * </ol>
         * <ul>
         * <li>LONG type:</li>
         * </ul>
         * <ol>
         * <li>For Name as LONG_NOT_IN, the value is: LIST </li>
         * <li>For Name as LONG_EQ, the value is: PRIMITIVE </li>
         * <li>For Name as LONG_IN, the value is: LIST </li>
         * <li>For Name as LONG_NOT_EQ, the value is: PRIMITIVE </li>
         * <li>For Name as LONG_GT, the value is: PRIMITIVE </li>
         * <li>For Name as LONG_GTE, the value is: PRIMITIVE </li>
         * <li>For Name as LONG_LT, the value is: PRIMITIVE </li>
         * <li>For Name as LONG_LTE, the value is: PRIMITIVE</li>
         * </ol>
         * <ul>
         * <li>INTEGER type (repeated):</li>
         * </ul>
         * <ol>
         * <li>For Name as INTEGER_NOT_IN, the value is: LIST </li>
         * <li>For Name as INTEGER_EQ, the value is: PRIMITIVE </li>
         * <li>For Name as INTEGER_IN, the value is: LIST </li>
         * <li>For Name as INTEGER_NOT_EQ, the value is: PRIMITIVE </li>
         * <li>For Name as INTEGER_GT, the value is: PRIMITIVE </li>
         * <li>For Name as INTEGER_GTE, the value is: PRIMITIVE </li>
         * <li>For Name as INTEGER_LT, the value is: PRIMITIVE </li>
         * <li>For Name as INTEGER_LTE, the value is: PRIMITIVE</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>PRIMITIVE</p>
         */
        @NameInMap("InputPattern")
        public String inputPattern;

        /**
         * <p>Unique name of the operator. Values: - LIST type: </p>
         * <ol>
         * <li>LIST_CONTAINS: contains </li>
         * <li>LIST_LENGTH_GT: length greater than </li>
         * <li>LIST_LENGTH_LT: length less than </li>
         * <li>LIST_NOT_CONTAINS: does not contain</li>
         * </ol>
         * <ul>
         * <li>STRING type:</li>
         * </ul>
         * <ol>
         * <li>STRING_NOT_IN: not in list </li>
         * <li>STRING_EQ: equals </li>
         * <li>STRING_IN: in list </li>
         * <li>STRING_NOT_EQ: not equal</li>
         * </ol>
         * <ul>
         * <li>BOOLEAN type:</li>
         * </ul>
         * <ol>
         * <li>BOOLEAN_NOT_IN: not in list </li>
         * <li>BOOLEAN_EQ: equals </li>
         * <li>BOOLEAN_IN: in list </li>
         * <li>BOOLEAN_NOT_EQ: not equal</li>
         * </ol>
         * <ul>
         * <li>FLOAT type: 1. FLOAT_NOT_IN: not in list</li>
         * </ul>
         * <ol start="2">
         * <li>FLOAT_EQ: equals 3. FLOAT_IN: in list </li>
         * <li>FLOAT_NOT_EQ: not equal </li>
         * <li>FLOAT_GT: greater than </li>
         * <li>FLOAT_GTE: greater than or equal to </li>
         * <li>FLOAT_LT: less than </li>
         * <li>FLOAT_LTE: less than or equal to</li>
         * </ol>
         * <ul>
         * <li>DOUBLE type:</li>
         * </ul>
         * <ol>
         * <li>DOUBLE_NOT_IN: not in list </li>
         * <li>DOUBLE_EQ: equals </li>
         * <li>DOUBLE_IN: in list </li>
         * <li>DOUBLE_NOT_EQ: not equal </li>
         * <li>DOUBLE_GT: greater than </li>
         * <li>DOUBLE_GTE: greater than or equal to 7
         * . DOUBLE_LT: less than </li>
         * <li>DOUBLE_LTE: less than or equal to</li>
         * </ol>
         * <ul>
         * <li>INTEGER type:</li>
         * </ul>
         * <ol>
         * <li>INTEGER_NOT_IN: not in list </li>
         * <li>INTEGER_EQ: equals </li>
         * <li>INTEGER_IN: in list </li>
         * <li>INTEGER_NOT_EQ: not equal </li>
         * <li>INTEGER_GT: greater than </li>
         * <li>INTEGER_GTE: greater than or equal to </li>
         * <li>INTEGER_LT: less than </li>
         * <li>INTEGER_LTE: less than or equal to</li>
         * </ol>
         * <ul>
         * <li>LONG type:</li>
         * </ul>
         * <ol>
         * <li>LONG_NOT_IN: not in list </li>
         * <li>LONG_EQ: equals </li>
         * <li>LONG_IN: in list </li>
         * <li>LONG_NOT_EQ: not equal </li>
         * <li>LONG_GT: greater than </li>
         * <li>LONG_GTE: greater than or equal to </li>
         * <li>LONG_LT: less than </li>
         * <li>LONG_LTE: less than or equal to<details></li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>LIST_CONTAINS</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Operator display name. Values: - For LIST type: </p>
         * <ol>
         * <li>Contains: includes </li>
         * <li>SizeGreaterThan: size greater than </li>
         * <li>SizeLessThan: size less than </li>
         * <li>NotContains: does not include</li>
         * </ol>
         * <ul>
         * <li>For STRING type:</li>
         * </ul>
         * <ol>
         * <li>NotIn: not in the list </li>
         * <li>Equals: equals </li>
         * <li>In: in the list </li>
         * <li>NotEquals: does not equal</li>
         * </ol>
         * <ul>
         * <li>For BOOLEAN type:</li>
         * </ul>
         * <ol>
         * <li>NotIn: not in the list </li>
         * <li>Equals: equals </li>
         * <li>In: in the list </li>
         * <li>NotEquals: does not equal</li>
         * </ol>
         * <ul>
         * <li>For FLOAT type:</li>
         * </ul>
         * <ol>
         * <li>NotIn: not in the list </li>
         * <li>Equals: equals </li>
         * <li>In: in the list </li>
         * <li>NotEquals: does not equal </li>
         * <li><blockquote>
         * <p>: greater than </p>
         * </blockquote>
         * </li>
         * <li><blockquote>
         * <p>=: greater than or equal to </p>
         * </blockquote>
         * </li>
         * <li>&lt;: less than </li>
         * <li>&lt;=: less than or equal to</li>
         * </ol>
         * <ul>
         * <li>For DOUBLE type:</li>
         * </ul>
         * <ol>
         * <li>NotIn: not in the list </li>
         * <li>Equals: equals </li>
         * <li>In: in the list </li>
         * <li>NotEquals: does not equal </li>
         * <li><blockquote>
         * <p>: greater than </p>
         * </blockquote>
         * </li>
         * <li><blockquote>
         * <p>=: greater than or equal to </p>
         * </blockquote>
         * </li>
         * <li>&lt;: less than </li>
         * <li>&lt;=: less than or equal to (Note: There seems to be a repetition here, likely meant to be \&quot;&lt;=\&quot; for \&quot;less than or equal to\&quot;)</li>
         * </ol>
         * <ul>
         * <li>For INTEGER type:</li>
         * </ul>
         * <ol>
         * <li>NotIn: not in the list </li>
         * <li>Equals: equals </li>
         * <li>In: in the list </li>
         * <li>NotEquals: does not equal </li>
         * <li><blockquote>
         * <p>: greater than </p>
         * </blockquote>
         * </li>
         * <li><blockquote>
         * <p>=: greater than or equal to </p>
         * </blockquote>
         * </li>
         * <li>&lt;: less than </li>
         * <li>&lt;=: less than or equal to</li>
         * </ol>
         * <ul>
         * <li>For LONG type:</li>
         * </ul>
         * <ol>
         * <li>NotIn: not in the list </li>
         * <li>Equals: equals </li>
         * <li>In: in the list </li>
         * <li>NotEquals: does not equal </li>
         * <li><blockquote>
         * <p>: greater than </p>
         * </blockquote>
         * </li>
         * <li><blockquote>
         * <p>=: greater than or equal to </p>
         * </blockquote>
         * </li>
         * <li>&lt;: less than </li>
         * <li>&lt;=: less than or equal to</li>
         * </ol>
         * <ul>
         * <li>For INTEGER type (repeated):</li>
         * </ul>
         * <ol>
         * <li>NotIn: not in the list </li>
         * <li>Equals: equals </li>
         * <li>In: in the list </li>
         * <li>NotEquals: does not equal </li>
         * <li><blockquote>
         * <p>: greater than </p>
         * </blockquote>
         * </li>
         * <li><blockquote>
         * <p>=: greater than or equal to </p>
         * </blockquote>
         * </li>
         * <li>&lt;: less than </li>
         * <li>&lt;=: less than or equal to</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>Contains</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>Operator value. Options: - For LIST type: </p>
         * <ol>
         * <li>CONTAINS: contains </li>
         * <li>LENGTH_GT: length greater than </li>
         * <li>LENGTH_LT: length less than </li>
         * <li>NOT_CONTAINS: does not contain</li>
         * </ol>
         * <ul>
         * <li>For STRING type:</li>
         * </ul>
         * <ol>
         * <li>NOT_IN: not in the list </li>
         * <li>EQ: equals </li>
         * <li>IN: in the list </li>
         * <li>NOT_EQ: does not equal</li>
         * </ol>
         * <ul>
         * <li>For BOOLEAN type:</li>
         * </ul>
         * <ol>
         * <li>NOT_IN: not in the list </li>
         * <li>EQ: equals </li>
         * <li>IN: in the list </li>
         * <li>NOT_EQ: does not equal</li>
         * </ol>
         * <ul>
         * <li>For FLOAT type:</li>
         * </ul>
         * <ol>
         * <li>NOT_IN: not in the list </li>
         * <li>EQ: equals </li>
         * <li>IN: in the list </li>
         * <li>NOT_EQ: does not equal </li>
         * <li>GT: greater than </li>
         * <li>GTE: greater than or equal to </li>
         * <li>LT: less than </li>
         * <li>LTE: less than or equal to</li>
         * </ol>
         * <ul>
         * <li>For DOUBLE type:</li>
         * </ul>
         * <ol>
         * <li>NOT_IN: not in the list </li>
         * <li>EQ: equals </li>
         * <li>IN: in the list </li>
         * <li>NOT_EQ: does not equal </li>
         * <li>GT: greater than </li>
         * <li>GTE: greater than or equal to </li>
         * <li>LT: less than </li>
         * <li>LTE: less than or equal to</li>
         * </ol>
         * <ul>
         * <li>For INTEGER type:</li>
         * </ul>
         * <ol>
         * <li>NOT_IN: not in the list </li>
         * <li>EQ: equals </li>
         * <li>IN: in the list </li>
         * <li>NOT_EQ: does not equal </li>
         * <li>GT: greater than </li>
         * <li>GTE: greater than or equal to </li>
         * <li>LT: less than </li>
         * <li>LTE: less than or equal to</li>
         * </ol>
         * <ul>
         * <li>For LONG type:</li>
         * </ul>
         * <ol>
         * <li>NOT_IN: not in the list </li>
         * <li>EQ: equals </li>
         * <li>IN: in the list </li>
         * <li>NOT_EQ: does not equal </li>
         * <li>GT: greater than </li>
         * <li>GTE: greater than or equal to </li>
         * <li>LT: less than </li>
         * <li>LTE: less than or equal to</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>CONTAINS</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperatorsMatchOperators build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperatorsMatchOperators self = new ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperatorsMatchOperators();
            return TeaModel.build(map, self);
        }

        public ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperatorsMatchOperators setInputPattern(String inputPattern) {
            this.inputPattern = inputPattern;
            return this;
        }
        public String getInputPattern() {
            return this.inputPattern;
        }

        public ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperatorsMatchOperators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperatorsMatchOperators setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperatorsMatchOperators setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperators extends TeaModel {
        /**
         * <p>List of operators</p>
         */
        @NameInMap("MatchOperators")
        public java.util.List<ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperatorsMatchOperators> matchOperators;

        /**
         * <p>The type used by the operator. Values:</p>
         * <ul>
         * <li>LIST </li>
         * <li>MAP </li>
         * <li>STRING </li>
         * <li>BOOLEAN </li>
         * <li>FLOAT </li>
         * <li>DOUBLE </li>
         * <li>INTEGER </li>
         * <li>LONG</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LIST</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperators build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperators self = new ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperators();
            return TeaModel.build(map, self);
        }

        public ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperators setMatchOperators(java.util.List<ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperatorsMatchOperators> matchOperators) {
            this.matchOperators = matchOperators;
            return this;
        }
        public java.util.List<ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperatorsMatchOperators> getMatchOperators() {
            return this.matchOperators;
        }

        public ListCloudAssetMatchOperatorsResponseBodyMatchTypeOperators setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
