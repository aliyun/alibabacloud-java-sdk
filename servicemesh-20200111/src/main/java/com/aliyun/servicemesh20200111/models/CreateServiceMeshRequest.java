// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateServiceMeshRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("IstioVersion")
    public String istioVersion;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("ApiServerPublicEip")
    public Boolean apiServerPublicEip;

    @NameInMap("PilotPublicEip")
    public Boolean pilotPublicEip;

    @NameInMap("Tracing")
    public Boolean tracing;

    @NameInMap("Name")
    public String name;

    @NameInMap("VSwitches")
    public String vSwitches;

    @NameInMap("TraceSampling")
    public Double traceSampling;

    @NameInMap("LocalityLoadBalancing")
    public Boolean localityLoadBalancing;

    @NameInMap("Telemetry")
    public Boolean telemetry;

    @NameInMap("OpenAgentPolicy")
    public Boolean openAgentPolicy;

    @NameInMap("OPALogLevel")
    public String OPALogLevel;

    @NameInMap("OPARequestCPU")
    public String OPARequestCPU;

    @NameInMap("OPARequestMemory")
    public String OPARequestMemory;

    @NameInMap("OPALimitCPU")
    public String OPALimitCPU;

    @NameInMap("OPALimitMemory")
    public String OPALimitMemory;

    @NameInMap("EnableAudit")
    public Boolean enableAudit;

    @NameInMap("AuditProject")
    public String auditProject;

    @NameInMap("ProxyRequestCPU")
    public String proxyRequestCPU;

    @NameInMap("ProxyRequestMemory")
    public String proxyRequestMemory;

    @NameInMap("ProxyLimitCPU")
    public String proxyLimitCPU;

    @NameInMap("ProxyLimitMemory")
    public String proxyLimitMemory;

    @NameInMap("IncludeIPRanges")
    public String includeIPRanges;

    @NameInMap("ExcludeIPRanges")
    public String excludeIPRanges;

    @NameInMap("ExcludeOutboundPorts")
    public String excludeOutboundPorts;

    @NameInMap("ExcludeInboundPorts")
    public String excludeInboundPorts;

    public static CreateServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceMeshRequest self = new CreateServiceMeshRequest();
        return TeaModel.build(map, self);
    }

}
