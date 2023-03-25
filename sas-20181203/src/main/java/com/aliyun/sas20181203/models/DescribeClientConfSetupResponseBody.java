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
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The tag that is added to the configuration.</p>
         */
        @NameInMap("StrategyTag")
        public String strategyTag;

        /**
         * <p>The value of the tag. Valid values:</p>
         * <br>
         * <p>*   major</p>
         * <p>*   advanced</p>
         * <p>*   basic</p>
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
