// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeJMeterSceneRunningStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Scene")
    @Validation(required = true)
    public DescribeJMeterSceneRunningStatusResponseScene scene;

    public static DescribeJMeterSceneRunningStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJMeterSceneRunningStatusResponse self = new DescribeJMeterSceneRunningStatusResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeJMeterSceneRunningStatusResponseScene extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Pool")
        @Validation(required = true)
        public String pool;

        @NameInMap("JmeterVersion")
        @Validation(required = true)
        public String jmeterVersion;

        @NameInMap("Concurrency")
        @Validation(required = true)
        public Integer concurrency;

        @NameInMap("RampUp")
        @Validation(required = true)
        public Integer rampUp;

        @NameInMap("HoldFor")
        @Validation(required = true)
        public Integer holdFor;

        @NameInMap("UseIterations")
        @Validation(required = true)
        public Boolean useIterations;

        @NameInMap("Iterations")
        @Validation(required = true)
        public Integer iterations;

        @NameInMap("MaxConcurrencyPerAgent")
        @Validation(required = true)
        public Integer maxConcurrencyPerAgent;

        @NameInMap("SpecifyAgentCount")
        @Validation(required = true)
        public Boolean specifyAgentCount;

        @NameInMap("AgentCount")
        @Validation(required = true)
        public Integer agentCount;

        @NameInMap("SplitCsv")
        @Validation(required = true)
        public Boolean splitCsv;

        @NameInMap("TestFile")
        @Validation(required = true)
        public String testFile;

        @NameInMap("Plan")
        @Validation(required = true)
        public String plan;

        @NameInMap("Steps")
        @Validation(required = true)
        public Integer steps;

        public static DescribeJMeterSceneRunningStatusResponseScene build(java.util.Map<String, ?> map) throws Exception {
            DescribeJMeterSceneRunningStatusResponseScene self = new DescribeJMeterSceneRunningStatusResponseScene();
            return TeaModel.build(map, self);
        }

    }

}
