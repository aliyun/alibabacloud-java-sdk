// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshAdditionalStatusResponseBody extends TeaModel {
    @NameInMap("ClusterStatus")
    public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus clusterStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceMeshAdditionalStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshAdditionalStatusResponseBody self = new DescribeServiceMeshAdditionalStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshAdditionalStatusResponseBody setClusterStatus(DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }
    public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus getClusterStatus() {
        return this.clusterStatus;
    }

    public DescribeServiceMeshAdditionalStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus extends TeaModel {
        @NameInMap("PayType")
        public String payType;

        @NameInMap("Reused")
        public Boolean reused;

        @NameInMap("SLBBackEndServerNumStatus")
        public String SLBBackEndServerNumStatus;

        @NameInMap("SLBExistStatus")
        public String SLBExistStatus;

        public static DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus self = new DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus setReused(Boolean reused) {
            this.reused = reused;
            return this;
        }
        public Boolean getReused() {
            return this.reused;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus setSLBBackEndServerNumStatus(String SLBBackEndServerNumStatus) {
            this.SLBBackEndServerNumStatus = SLBBackEndServerNumStatus;
            return this;
        }
        public String getSLBBackEndServerNumStatus() {
            return this.SLBBackEndServerNumStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus setSLBExistStatus(String SLBExistStatus) {
            this.SLBExistStatus = SLBExistStatus;
            return this;
        }
        public String getSLBExistStatus() {
            return this.SLBExistStatus;
        }

    }

    public static class DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus extends TeaModel {
        @NameInMap("PayType")
        public String payType;

        @NameInMap("Reused")
        public Boolean reused;

        @NameInMap("SLBBackEndServerNumStatus")
        public String SLBBackEndServerNumStatus;

        @NameInMap("SLBExistStatus")
        public String SLBExistStatus;

        public static DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus self = new DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus setReused(Boolean reused) {
            this.reused = reused;
            return this;
        }
        public Boolean getReused() {
            return this.reused;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus setSLBBackEndServerNumStatus(String SLBBackEndServerNumStatus) {
            this.SLBBackEndServerNumStatus = SLBBackEndServerNumStatus;
            return this;
        }
        public String getSLBBackEndServerNumStatus() {
            return this.SLBBackEndServerNumStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus setSLBExistStatus(String SLBExistStatus) {
            this.SLBExistStatus = SLBExistStatus;
            return this;
        }
        public String getSLBExistStatus() {
            return this.SLBExistStatus;
        }

    }

    public static class DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus extends TeaModel {
        @NameInMap("AccessLogProjectStatus")
        public String accessLogProjectStatus;

        @NameInMap("ApiServerEIPStatus")
        public String apiServerEIPStatus;

        @NameInMap("ApiServerLoadBalancerStatus")
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus apiServerLoadBalancerStatus;

        @NameInMap("AuditProjectStatus")
        public String auditProjectStatus;

        @NameInMap("ControlPlaneProjectStatus")
        public String controlPlaneProjectStatus;

        @NameInMap("LogtailStatusRecord")
        public java.util.Map<String, ClusterStatusLogtailStatusRecordValue> logtailStatusRecord;

        @NameInMap("PilotLoadBalancerStatus")
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus pilotLoadBalancerStatus;

        @NameInMap("SgStatus")
        public String sgStatus;

        public static DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus self = new DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setAccessLogProjectStatus(String accessLogProjectStatus) {
            this.accessLogProjectStatus = accessLogProjectStatus;
            return this;
        }
        public String getAccessLogProjectStatus() {
            return this.accessLogProjectStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setApiServerEIPStatus(String apiServerEIPStatus) {
            this.apiServerEIPStatus = apiServerEIPStatus;
            return this;
        }
        public String getApiServerEIPStatus() {
            return this.apiServerEIPStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setApiServerLoadBalancerStatus(DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus apiServerLoadBalancerStatus) {
            this.apiServerLoadBalancerStatus = apiServerLoadBalancerStatus;
            return this;
        }
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus getApiServerLoadBalancerStatus() {
            return this.apiServerLoadBalancerStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setAuditProjectStatus(String auditProjectStatus) {
            this.auditProjectStatus = auditProjectStatus;
            return this;
        }
        public String getAuditProjectStatus() {
            return this.auditProjectStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setControlPlaneProjectStatus(String controlPlaneProjectStatus) {
            this.controlPlaneProjectStatus = controlPlaneProjectStatus;
            return this;
        }
        public String getControlPlaneProjectStatus() {
            return this.controlPlaneProjectStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setLogtailStatusRecord(java.util.Map<String, ClusterStatusLogtailStatusRecordValue> logtailStatusRecord) {
            this.logtailStatusRecord = logtailStatusRecord;
            return this;
        }
        public java.util.Map<String, ClusterStatusLogtailStatusRecordValue> getLogtailStatusRecord() {
            return this.logtailStatusRecord;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setPilotLoadBalancerStatus(DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus pilotLoadBalancerStatus) {
            this.pilotLoadBalancerStatus = pilotLoadBalancerStatus;
            return this;
        }
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus getPilotLoadBalancerStatus() {
            return this.pilotLoadBalancerStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setSgStatus(String sgStatus) {
            this.sgStatus = sgStatus;
            return this;
        }
        public String getSgStatus() {
            return this.sgStatus;
        }

    }

}
