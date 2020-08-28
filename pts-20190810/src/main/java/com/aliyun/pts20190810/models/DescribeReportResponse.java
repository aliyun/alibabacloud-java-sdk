// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeReportResponse extends TeaModel {
    @NameInMap("AverageConcurrency")
    @Validation(required = true)
    public Integer averageConcurrency;

    @NameInMap("AvgBw")
    @Validation(required = true)
    public Long avgBw;

    @NameInMap("SuccessRateReq")
    @Validation(required = true)
    public Double successRateReq;

    @NameInMap("EndTimeTS")
    @Validation(required = true)
    public Long endTimeTS;

    @NameInMap("StartTimeTS")
    @Validation(required = true)
    public Long startTimeTS;

    @NameInMap("TotalAgents")
    @Validation(required = true)
    public Integer totalAgents;

    @NameInMap("RequestCount")
    @Validation(required = true)
    public Long requestCount;

    @NameInMap("RpsLimit")
    @Validation(required = true)
    public Long rpsLimit;

    @NameInMap("AliveAgents")
    @Validation(required = true)
    public Integer aliveAgents;

    @NameInMap("MaxTps")
    @Validation(required = true)
    public Long maxTps;

    @NameInMap("ConcurrencyLimit")
    @Validation(required = true)
    public Long concurrencyLimit;

    @NameInMap("MaxConcurrency")
    @Validation(required = true)
    public Long maxConcurrency;

    @NameInMap("SceneDeleted")
    @Validation(required = true)
    public Boolean sceneDeleted;

    @NameInMap("Duration")
    @Validation(required = true)
    public String duration;

    @NameInMap("MaxBw")
    @Validation(required = true)
    public Long maxBw;

    @NameInMap("Vum")
    @Validation(required = true)
    public Long vum;

    @NameInMap("FailCountBiz")
    @Validation(required = true)
    public Long failCountBiz;

    @NameInMap("FailCountReq")
    @Validation(required = true)
    public Long failCountReq;

    @NameInMap("SuccessRateBiz")
    @Validation(required = true)
    public Double successRateBiz;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ReportView")
    @Validation(required = true)
    public String reportView;

    @NameInMap("ChargeType")
    @Validation(required = true)
    public String chargeType;

    @NameInMap("AgentsLocations")
    @Validation(required = true)
    public String agentsLocations;

    @NameInMap("Relations")
    @Validation(required = true)
    public java.util.List<DescribeReportResponseRelations> relations;

    @NameInMap("SceneSnapshot")
    @Validation(required = true)
    public DescribeReportResponseSceneSnapshot sceneSnapshot;

    public static DescribeReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportResponse self = new DescribeReportResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeReportResponseRelationsNodes extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Config")
        @Validation(required = true)
        public java.util.Map<String, ?> config;

        public static DescribeReportResponseRelationsNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeReportResponseRelationsNodes self = new DescribeReportResponseRelationsNodes();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeReportResponseRelations extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Disabled")
        @Validation(required = true)
        public Boolean disabled;

        @NameInMap("Headers")
        @Validation(required = true)
        public java.util.Map<String, ?> headers;

        @NameInMap("RelationTestConfig")
        @Validation(required = true)
        public java.util.Map<String, ?> relationTestConfig;

        @NameInMap("Nodes")
        @Validation(required = true)
        public java.util.List<DescribeReportResponseRelationsNodes> nodes;

        public static DescribeReportResponseRelations build(java.util.Map<String, ?> map) throws Exception {
            DescribeReportResponseRelations self = new DescribeReportResponseRelations();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeReportResponseSceneSnapshot extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("SceneName")
        @Validation(required = true)
        public String sceneName;

        @NameInMap("TestConfig")
        @Validation(required = true)
        public String testConfig;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("ExecStatus")
        @Validation(required = true)
        public String execStatus;

        public static DescribeReportResponseSceneSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeReportResponseSceneSnapshot self = new DescribeReportResponseSceneSnapshot();
            return TeaModel.build(map, self);
        }

    }

}
