// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ServiceMeshes")
    @Validation(required = true)
    public java.util.List<DescribeServiceMeshesResponseServiceMeshes> serviceMeshes;

    public static DescribeServiceMeshesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshesResponse self = new DescribeServiceMeshesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeServiceMeshesResponseServiceMeshesEndpoints extends TeaModel {
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

        @NameInMap("ReverseTunnelEndpoint")
        @Validation(required = true)
        public String reverseTunnelEndpoint;

        public static DescribeServiceMeshesResponseServiceMeshesEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesEndpoints self = new DescribeServiceMeshesResponseServiceMeshesEndpoints();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo extends TeaModel {
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

        public static DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo self = new DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer extends TeaModel {
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

        public static DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer self = new DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig extends TeaModel {
        @NameInMap("Mtls")
        @Validation(required = true)
        public Boolean mtls;

        @NameInMap("OutboundTrafficPolicy")
        @Validation(required = true)
        public String outboundTrafficPolicy;

        @NameInMap("StrictMtls")
        @Validation(required = true)
        public Boolean strictMtls;

        @NameInMap("Tracing")
        @Validation(required = true)
        public Boolean tracing;

        @NameInMap("Telemetry")
        @Validation(required = true)
        public Boolean telemetry;

        public static DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig self = new DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshesSpecNetwork extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitches")
        @Validation(required = true)
        public java.util.List<String> vSwitches;

        public static DescribeServiceMeshesResponseServiceMeshesSpecNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesSpecNetwork self = new DescribeServiceMeshesResponseServiceMeshesSpecNetwork();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshesSpec extends TeaModel {
        @NameInMap("LoadBalancer")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesSpecLoadBalancer loadBalancer;

        @NameInMap("MeshConfig")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesSpecMeshConfig meshConfig;

        @NameInMap("Network")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesSpecNetwork network;

        public static DescribeServiceMeshesResponseServiceMeshesSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshesSpec self = new DescribeServiceMeshesResponseServiceMeshesSpec();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceMeshesResponseServiceMeshes extends TeaModel {
        @NameInMap("Endpoints")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesEndpoints endpoints;

        @NameInMap("ServiceMeshInfo")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesServiceMeshInfo serviceMeshInfo;

        @NameInMap("Spec")
        @Validation(required = true)
        public DescribeServiceMeshesResponseServiceMeshesSpec spec;

        @NameInMap("Clusters")
        @Validation(required = true)
        public java.util.List<String> clusters;

        public static DescribeServiceMeshesResponseServiceMeshes build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshesResponseServiceMeshes self = new DescribeServiceMeshesResponseServiceMeshes();
            return TeaModel.build(map, self);
        }

    }

}
