// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHybridProxyPolicyResponseBody extends TeaModel {
    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The data collection configurations of the proxy cluster.</p>
     */
    @NameInMap("PolicyList")
    public java.util.List<DescribeHybridProxyPolicyResponseBodyPolicyList> policyList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7A1B40A-7EED-55A0-BCBC-2F83A486F0AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHybridProxyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridProxyPolicyResponseBody self = new DescribeHybridProxyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridProxyPolicyResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeHybridProxyPolicyResponseBody setPolicyList(java.util.List<DescribeHybridProxyPolicyResponseBodyPolicyList> policyList) {
        this.policyList = policyList;
        return this;
    }
    public java.util.List<DescribeHybridProxyPolicyResponseBodyPolicyList> getPolicyList() {
        return this.policyList;
    }

    public DescribeHybridProxyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHybridProxyPolicyResponseBodyPolicyListInfo extends TeaModel {
        /**
         * <p>The value of the policy configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The name of the file. After you configure a blocking policy, the blocked data is written to the file.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The type of the policy that you configured. Valid values:</p>
         * <ul>
         * <li><strong>file</strong></li>
         * <li><strong>net</strong></li>
         * <li><strong>process</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeHybridProxyPolicyResponseBodyPolicyListInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridProxyPolicyResponseBodyPolicyListInfo self = new DescribeHybridProxyPolicyResponseBodyPolicyListInfo();
            return TeaModel.build(map, self);
        }

        public DescribeHybridProxyPolicyResponseBodyPolicyListInfo setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeHybridProxyPolicyResponseBodyPolicyListInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeHybridProxyPolicyResponseBodyPolicyListInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeHybridProxyPolicyResponseBodyPolicyList extends TeaModel {
        /**
         * <p>The information about the policy.</p>
         */
        @NameInMap("Info")
        public java.util.List<DescribeHybridProxyPolicyResponseBodyPolicyListInfo> info;

        /**
         * <p>The type of the policy. Valid values:</p>
         * <ul>
         * <li><strong>limitFrequency</strong></li>
         * <li><strong>limitBandWidth</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>limitBandWidth</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeHybridProxyPolicyResponseBodyPolicyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridProxyPolicyResponseBodyPolicyList self = new DescribeHybridProxyPolicyResponseBodyPolicyList();
            return TeaModel.build(map, self);
        }

        public DescribeHybridProxyPolicyResponseBodyPolicyList setInfo(java.util.List<DescribeHybridProxyPolicyResponseBodyPolicyListInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<DescribeHybridProxyPolicyResponseBodyPolicyListInfo> getInfo() {
            return this.info;
        }

        public DescribeHybridProxyPolicyResponseBodyPolicyList setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
