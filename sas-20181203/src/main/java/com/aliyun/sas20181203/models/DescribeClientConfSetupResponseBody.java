// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClientConfSetupResponseBody extends TeaModel {
    /**
     * <p>The configurations of the Security Center agent.</p>
     */
    @NameInMap("ClientConf")
    public DescribeClientConfSetupResponseBodyClientConf clientConf;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>151F6EB6-D5F3-417A-AF7B-4D84975D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClientConfSetupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientConfSetupResponseBody self = new DescribeClientConfSetupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClientConfSetupResponseBody setClientConf(DescribeClientConfSetupResponseBodyClientConf clientConf) {
        this.clientConf = clientConf;
        return this;
    }
    public DescribeClientConfSetupResponseBodyClientConf getClientConf() {
        return this.clientConf;
    }

    public DescribeClientConfSetupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClientConfSetupResponseBodyClientConf extends TeaModel {
        /**
         * <p>The configurations of the usage for the Security Center agent.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mem&quot;:&quot;200&quot;,&quot;cpu&quot;:&quot;10&quot;,&quot;cpu_all&quot;:&quot;0&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The tag that is added to the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>machineResource</p>
         */
        @NameInMap("StrategyTag")
        public String strategyTag;

        /**
         * <p>The value of the tag. Valid values:</p>
         * <ul>
         * <li>major</li>
         * <li>advanced</li>
         * <li>basic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>major</p>
         */
        @NameInMap("StrategyTagValue")
        public String strategyTagValue;

        public static DescribeClientConfSetupResponseBodyClientConf build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientConfSetupResponseBodyClientConf self = new DescribeClientConfSetupResponseBodyClientConf();
            return TeaModel.build(map, self);
        }

        public DescribeClientConfSetupResponseBodyClientConf setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeClientConfSetupResponseBodyClientConf setStrategyTag(String strategyTag) {
            this.strategyTag = strategyTag;
            return this;
        }
        public String getStrategyTag() {
            return this.strategyTag;
        }

        public DescribeClientConfSetupResponseBodyClientConf setStrategyTagValue(String strategyTagValue) {
            this.strategyTagValue = strategyTagValue;
            return this;
        }
        public String getStrategyTagValue() {
            return this.strategyTagValue;
        }

    }

}
