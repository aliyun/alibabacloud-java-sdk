// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ServiceMesh")
    @Validation(required = true)
    public DescribeServiceMeshDetailResponseServiceMesh serviceMesh;

    public static DescribeServiceMeshDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshDetailResponse self = new DescribeServiceMeshDetailResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeServiceMeshDetailResponseServiceMeshEndpoints extends TeaModel {
        @NameInMap("IntranetApiServerEndpoint")
        @Validation(required = true)
        public String intranetApiServerEndpoint;

        @NameInMap("IntranetPilotEndpoint")
        @Validation(required = true)
        public String intranetPilotEndpoint;

        @NameInMap("PublicApiServerEndpoint")
        @Validation(required = true)
        public String publicApiServerEndpoint;

        @NameInMap("PublicPilotEndpoint")
        @Validation(required = true)
        public String publicPilotEndpoint;

        public static DescribeServiceMeshDetailResponseServiceMeshEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshEndpoints self = new DescribeServiceMeshDetailResponseServiceMeshEndpoints();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ServiceMeshId")
        @Validation(required = true)
        public String serviceMeshId;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        public static DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo self = new DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer extends TeaModel {
        @NameInMap("ApiServerLoadbalancerId")
        @Validation(required = true)
        public String apiServerLoadbalancerId;

        @NameInMap("ApiServerPublicEip")
        @Validation(required = true)
        public Boolean apiServerPublicEip;

        @NameInMap("PilotPublicEip")
        @Validation(required = true)
        public Boolean pilotPublicEip;

        @NameInMap("PilotPublicLoadbalancerId")
        @Validation(required = true)
        public String pilotPublicLoadbalancerId;

        public static DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer self = new DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigPilot extends TeaModel {
        @NameInMap("TraceSampling")
        @Validation(required = true)
        public Double traceSampling;

        public static DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigPilot build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigPilot self = new DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigPilot();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA extends TeaModel {
        @NameInMap("Enabled")
        @Validation(required = true)
        public Boolean enabled;

        @NameInMap("LogLevel")
        @Validation(required = true)
        public String logLevel;

        @NameInMap("RequestCPU")
        @Validation(required = true)
        public String requestCPU;

        @NameInMap("RequestMemory")
        @Validation(required = true)
        public String requestMemory;

        @NameInMap("LimitCPU")
        @Validation(required = true)
        public String limitCPU;

        @NameInMap("LimitMemory")
        @Validation(required = true)
        public String limitMemory;

        public static DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA self = new DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit extends TeaModel {
        @NameInMap("Enabled")
        @Validation(required = true)
        public Boolean enabled;

        @NameInMap("Project")
        @Validation(required = true)
        public String project;

        public static DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit self = new DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy extends TeaModel {
        @NameInMap("ClusterDomain")
        @Validation(required = true)
        public String clusterDomain;

        @NameInMap("RequestCPU")
        @Validation(required = true)
        public String requestCPU;

        @NameInMap("RequestMemory")
        @Validation(required = true)
        public String requestMemory;

        @NameInMap("LimitCPU")
        @Validation(required = true)
        public String limitCPU;

        @NameInMap("LimitMemory")
        @Validation(required = true)
        public String limitMemory;

        public static DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy self = new DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig extends TeaModel {
        @NameInMap("EnableLocalityLB")
        @Validation(required = true)
        public Boolean enableLocalityLB;

        @NameInMap("Telemetry")
        @Validation(required = true)
        public Boolean telemetry;

        @NameInMap("Tracing")
        @Validation(required = true)
        public Boolean tracing;

        @NameInMap("CustomizedZipkin")
        @Validation(required = true)
        public Boolean customizedZipkin;

        @NameInMap("OutboundTrafficPolicy")
        @Validation(required = true)
        public String outboundTrafficPolicy;

        @NameInMap("IncludeIPRanges")
        @Validation(required = true)
        public String includeIPRanges;

        @NameInMap("Pilot")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigPilot pilot;

        @NameInMap("OPA")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigOPA OPA;

        @NameInMap("Audit")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigAudit audit;

        @NameInMap("Proxy")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfigProxy proxy;

        public static DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig self = new DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpecNetwork extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitches")
        @Validation(required = true)
        public java.util.List<String> vSwitches;

        public static DescribeServiceMeshDetailResponseServiceMeshSpecNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpecNetwork self = new DescribeServiceMeshDetailResponseServiceMeshSpecNetwork();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMeshSpec extends TeaModel {
        @NameInMap("LoadBalancer")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecLoadBalancer loadBalancer;

        @NameInMap("MeshConfig")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecMeshConfig meshConfig;

        @NameInMap("Network")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpecNetwork network;

        public static DescribeServiceMeshDetailResponseServiceMeshSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMeshSpec self = new DescribeServiceMeshDetailResponseServiceMeshSpec();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshDetailResponseServiceMesh extends TeaModel {
        @NameInMap("Endpoints")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshEndpoints endpoints;

        @NameInMap("ServiceMeshInfo")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshServiceMeshInfo serviceMeshInfo;

        @NameInMap("Spec")
        @Validation(required = true)
        public DescribeServiceMeshDetailResponseServiceMeshSpec spec;

        @NameInMap("Clusters")
        @Validation(required = true)
        public java.util.List<String> clusters;

        public static DescribeServiceMeshDetailResponseServiceMesh build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshDetailResponseServiceMesh self = new DescribeServiceMeshDetailResponseServiceMesh();
            return TeaModel.build(map, self);
        }

    }

}
