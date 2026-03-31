// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecRulesResponseBody extends TeaModel {
    /**
     * <p>The policies.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApisecRulesResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeApisecRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecRulesResponseBody self = new DescribeApisecRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecRulesResponseBody setData(java.util.List<DescribeApisecRulesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApisecRulesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApisecRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisecRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisecRulesResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>34933</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The details of the policy. The value is a string that consists of multiple parameters in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;ext&quot;: &quot;Date&quot;,
         *     &quot;regex&quot;: &quot;-&quot;,
         *     &quot;code&quot;: &quot;2009&quot;,
         *     &quot;level&quot;: &quot;S1&quot;,
         *     &quot;origin&quot;: &quot;default&quot;,
         *     &quot;name&quot;: &quot;2009&quot;
         * }</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The type of the policy. Valid values:</p>
         * <ul>
         * <li><strong>risk</strong>: risk detection</li>
         * <li><strong>event</strong>: security event</li>
         * <li><strong>sensitive_word</strong>: sensitive data</li>
         * <li><strong>auth_flag</strong>: authentication credential</li>
         * <li><strong>api_tag</strong>: business purpose</li>
         * <li><strong>desensitization</strong>: data masking</li>
         * <li><strong>whitelist</strong>: whitelist</li>
         * <li><strong>recognition</strong>: API recognition</li>
         * <li><strong>offline_api</strong>: lifecycle management</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>risk</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the policy was updated. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1721095301</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeApisecRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecRulesResponseBodyData self = new DescribeApisecRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecRulesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeApisecRulesResponseBodyData setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public DescribeApisecRulesResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public DescribeApisecRulesResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeApisecRulesResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
