// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeJMeterSceneResponse extends TeaModel {
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
    public DescribeJMeterSceneResponseScene scene;

    public static DescribeJMeterSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJMeterSceneResponse self = new DescribeJMeterSceneResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeJMeterSceneResponseSceneCondition extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Isp")
        @Validation(required = true)
        public String isp;

        @NameInMap("Amount")
        @Validation(required = true)
        public Integer amount;

        public static DescribeJMeterSceneResponseSceneCondition build(java.util.Map<String, ?> map) throws Exception {
            DescribeJMeterSceneResponseSceneCondition self = new DescribeJMeterSceneResponseSceneCondition();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeJMeterSceneResponseScenePlan extends TeaModel {
        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("LastActive")
        @Validation(required = true)
        public Long lastActive;

        @NameInMap("Vum")
        @Validation(required = true)
        public Long vum;

        @NameInMap("HasReport")
        @Validation(required = true)
        public Boolean hasReport;

        @NameInMap("VumWeight")
        @Validation(required = true)
        public Long vumWeight;

        @NameInMap("BeginTime")
        @Validation(required = true)
        public Long beginTime;

        public static DescribeJMeterSceneResponseScenePlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeJMeterSceneResponseScenePlan self = new DescribeJMeterSceneResponseScenePlan();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeJMeterSceneResponseScene extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Pool")
        @Validation(required = true)
        public String pool;

        @NameInMap("JMeterVersion")
        @Validation(required = true)
        public String JMeterVersion;

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

        @NameInMap("FileList")
        @Validation(required = true)
        public String fileList;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("SceneId")
        @Validation(required = true)
        public String sceneId;

        @NameInMap("ConditionSatisfiedExactly")
        @Validation(required = true)
        public Boolean conditionSatisfiedExactly;

        @NameInMap("SyncTimerType")
        @Validation(required = true)
        public String syncTimerType;

        @NameInMap("Steps")
        @Validation(required = true)
        public Integer steps;

        @NameInMap("ConstantThroughputTimerType")
        @Validation(required = true)
        public String constantThroughputTimerType;

        @NameInMap("EnvironmentId")
        @Validation(required = true)
        public String environmentId;

        @NameInMap("Condition")
        @Validation(required = true)
        public java.util.List<DescribeJMeterSceneResponseSceneCondition> condition;

        @NameInMap("Plan")
        @Validation(required = true)
        public DescribeJMeterSceneResponseScenePlan plan;

        public static DescribeJMeterSceneResponseScene build(java.util.Map<String, ?> map) throws Exception {
            DescribeJMeterSceneResponseScene self = new DescribeJMeterSceneResponseScene();
            return TeaModel.build(map, self);
        }

    }

}
