// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class CreateAndAnalyzeNetworkPathResponseBody extends TeaModel {
    /**
     * <p>The ID of the task for analyzing network reachability that you initiated.</p>
     */
    @NameInMap("NetworkReachableAnalysisId")
    public String networkReachableAnalysisId;

    /**
     * <p>The protocol type.</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the source resource.</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source IP address.</p>
     */
    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    /**
     * <p>The source port.</p>
     */
    @NameInMap("SourcePort")
    public String sourcePort;

    /**
     * <p>The type of the source resource.</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The ID of the destination resource.</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The destination IP address.</p>
     */
    @NameInMap("TargetIpAddress")
    public String targetIpAddress;

    /**
     * <p>The destination port.</p>
     */
    @NameInMap("TargetPort")
    public String targetPort;

    /**
     * <p>The type of the destination resource.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static CreateAndAnalyzeNetworkPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAndAnalyzeNetworkPathResponseBody self = new CreateAndAnalyzeNetworkPathResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAndAnalyzeNetworkPathResponseBody setNetworkReachableAnalysisId(String networkReachableAnalysisId) {
        this.networkReachableAnalysisId = networkReachableAnalysisId;
        return this;
    }
    public String getNetworkReachableAnalysisId() {
        return this.networkReachableAnalysisId;
    }

    public CreateAndAnalyzeNetworkPathResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateAndAnalyzeNetworkPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAndAnalyzeNetworkPathResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateAndAnalyzeNetworkPathResponseBody setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    public CreateAndAnalyzeNetworkPathResponseBody setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }
    public String getSourcePort() {
        return this.sourcePort;
    }

    public CreateAndAnalyzeNetworkPathResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateAndAnalyzeNetworkPathResponseBody setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public CreateAndAnalyzeNetworkPathResponseBody setTargetIpAddress(String targetIpAddress) {
        this.targetIpAddress = targetIpAddress;
        return this;
    }
    public String getTargetIpAddress() {
        return this.targetIpAddress;
    }

    public CreateAndAnalyzeNetworkPathResponseBody setTargetPort(String targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public String getTargetPort() {
        return this.targetPort;
    }

    public CreateAndAnalyzeNetworkPathResponseBody setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
