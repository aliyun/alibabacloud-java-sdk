// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshFeatureRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    @NameInMap("Tracing")
    public Boolean tracing;

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

    @NameInMap("ClusterDomain")
    public String clusterDomain;

    @NameInMap("CustomizedZipkin")
    public Boolean customizedZipkin;

    @NameInMap("OutboundTrafficPolicy")
    public String outboundTrafficPolicy;

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

    public static UpdateMeshFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshFeatureRequest self = new UpdateMeshFeatureRequest();
        return TeaModel.build(map, self);
    }

}
