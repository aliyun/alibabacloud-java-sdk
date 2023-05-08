// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshAdditionalStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the SLB instance is reused. Valid values:</p>
     * <br>
     * <p>*   `true`: The SLB instance is reused.</p>
     * <p>*   `false`: The SLB instance is not reused.</p>
     */
    @NameInMap("ClusterStatus")
    public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus clusterStatus;

    /**
     * <p>The check result of the number of SLB instances created for exposing the API server. Valid values:</p>
     * <br>
     * <p>*   `too_much`: An excessive number of SLB instances are created.</p>
     * <p>*   `num_exact`: A proper number of SLB instances are created.</p>
     * <p>*   `too_little`: The number of SLB instances falls short.</p>
     */
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
        /**
         * <p>The check result of the number of SLB instances created for exposing Istio Pilot. Valid values:</p>
         * <br>
         * <p>*   `too_much`: An excessive number of SLB instances are created.</p>
         * <p>*   `num_exact`: A proper number of SLB instances are created.</p>
         * <p>*   `too_little`: The number of SLB instances falls short.</p>
         */
        @NameInMap("Locked")
        public Boolean locked;

        /**
         * <p>Indicates whether the SLB instance is reused. Valid values:</p>
         * <br>
         * <p>*   `true`: The SLB instance is reused.</p>
         * <p>*   `false`: The SLB instance is not reused.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The check result of the SLB instance. Valid values:</p>
         * <br>
         * <p>*   `exist`: The SLB instance exists.</p>
         * <p>*   `not_exist`: The SLB instance does not exist.</p>
         * <p>*   `conflict`: Conflicts are detected.</p>
         * <p>*   `failed`: The check fails.</p>
         * <p>*   `time_out`: The check times out.</p>
         */
        @NameInMap("Reused")
        public Boolean reused;

        /**
         * <p>The check results of the SLB instances created for exposing Istio Pilot.</p>
         */
        @NameInMap("SLBBackEndServerNumStatus")
        public String SLBBackEndServerNumStatus;

        /**
         * <p>The billing method of the SLB instance. Valid values:</p>
         * <br>
         * <p>*   `PrePay`: subscription</p>
         * <p>*   `PayOnDemand`: pay-as-you-go</p>
         */
        @NameInMap("SLBExistStatus")
        public String SLBExistStatus;

        public static DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus self = new DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
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

    public static class DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusCanaryPilotLoadBalancerStatus extends TeaModel {
        @NameInMap("Locked")
        public Boolean locked;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Reused")
        public Boolean reused;

        @NameInMap("SLBBackEndServerNumStatus")
        public String SLBBackEndServerNumStatus;

        @NameInMap("SLBExistStatus")
        public String SLBExistStatus;

        public static DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusCanaryPilotLoadBalancerStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusCanaryPilotLoadBalancerStatus self = new DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusCanaryPilotLoadBalancerStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusCanaryPilotLoadBalancerStatus setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusCanaryPilotLoadBalancerStatus setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusCanaryPilotLoadBalancerStatus setReused(Boolean reused) {
            this.reused = reused;
            return this;
        }
        public Boolean getReused() {
            return this.reused;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusCanaryPilotLoadBalancerStatus setSLBBackEndServerNumStatus(String SLBBackEndServerNumStatus) {
            this.SLBBackEndServerNumStatus = SLBBackEndServerNumStatus;
            return this;
        }
        public String getSLBBackEndServerNumStatus() {
            return this.SLBBackEndServerNumStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusCanaryPilotLoadBalancerStatus setSLBExistStatus(String SLBExistStatus) {
            this.SLBExistStatus = SLBExistStatus;
            return this;
        }
        public String getSLBExistStatus() {
            return this.SLBExistStatus;
        }

    }

    public static class DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus extends TeaModel {
        /**
         * <p>The check result of control plane logs. Valid values:</p>
         * <br>
         * <p>*   `exist`: Control plane logs exist.</p>
         * <p>*   `not_exist`: Control plane logs do not exist.</p>
         * <p>*   `failed`: The check fails.</p>
         * <p>*   `time_out`: The check times out.</p>
         */
        @NameInMap("Locked")
        public Boolean locked;

        /**
         * <p>Indicates whether the security group is reused. Valid values:</p>
         * <br>
         * <p>*   `reused`: The security group is reused.</p>
         * <p>*   `not_reused`: The security group is not reused.</p>
         * <p>*   `failed`: The check fails.</p>
         * <p>*   `time_out`: The check times out.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The check results of the Logtail installation for clusters on the data plane.</p>
         */
        @NameInMap("Reused")
        public Boolean reused;

        /**
         * <p>The check result of audit logs. Valid values:</p>
         * <br>
         * <p>*   `exist`: Audit logs exist.</p>
         * <p>*   `not exist`: Audit logs do not exist.</p>
         */
        @NameInMap("SLBBackEndServerNumStatus")
        public String SLBBackEndServerNumStatus;

        /**
         * <p>The billing method of the SLB instance. Valid values:</p>
         * <br>
         * <p>*   `PrePay`: subscription</p>
         * <p>*   `PayOnDemand`: pay-as-you-go</p>
         */
        @NameInMap("SLBExistStatus")
        public String SLBExistStatus;

        public static DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus self = new DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
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

        /**
         * <p>Indicates whether the SLB instance is locked. Valid values:</p>
         * <br>
         * <p>*   `true`: The SLB instance is locked.</p>
         * <p>*   `false`: The SLB instance is not locked.</p>
         */
        @NameInMap("ApiServerLoadBalancerStatus")
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus apiServerLoadBalancerStatus;

        /**
         * <p>The check result of the EIP associated with the API server. Valid values:</p>
         * <br>
         * <p>*   `exist`: The EIP exists.</p>
         * <p>*   `not_exist`: The EIP does not exist.</p>
         * <p>*   `failed`: The check fails.</p>
         * <p>*   `time_out`: The check times out.</p>
         * <p>*   `not_in_use`: The EIP is not associated with the API Server.</p>
         * <p>*   `locked`: The EIP is locked.</p>
         */
        @NameInMap("AuditProjectStatus")
        public String auditProjectStatus;

        @NameInMap("CanaryPilotLoadBalancerStatus")
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusCanaryPilotLoadBalancerStatus canaryPilotLoadBalancerStatus;

        @NameInMap("ControlPlaneProjectStatus")
        public String controlPlaneProjectStatus;

        /**
         * <p>The check result of access logs. Valid values:</p>
         * <br>
         * <p>*   `exist`: Access logs exist.</p>
         * <p>*   `not_exist`: Access logs do not exist.</p>
         * <p>*   `failed`: The check fails.</p>
         * <p>*   `time_out`: The check times out.</p>
         */
        @NameInMap("LogtailStatusRecord")
        public java.util.Map<String, ?> logtailStatusRecord;

        /**
         * <p>Indicates whether the SLB instance is locked. Valid values:</p>
         * <br>
         * <p>*   `true`: The SLB instance is locked.</p>
         * <p>*   `false`: The SLB instance is not locked.</p>
         */
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

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setCanaryPilotLoadBalancerStatus(DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusCanaryPilotLoadBalancerStatus canaryPilotLoadBalancerStatus) {
            this.canaryPilotLoadBalancerStatus = canaryPilotLoadBalancerStatus;
            return this;
        }
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusCanaryPilotLoadBalancerStatus getCanaryPilotLoadBalancerStatus() {
            return this.canaryPilotLoadBalancerStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setControlPlaneProjectStatus(String controlPlaneProjectStatus) {
            this.controlPlaneProjectStatus = controlPlaneProjectStatus;
            return this;
        }
        public String getControlPlaneProjectStatus() {
            return this.controlPlaneProjectStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setLogtailStatusRecord(java.util.Map<String, ?> logtailStatusRecord) {
            this.logtailStatusRecord = logtailStatusRecord;
            return this;
        }
        public java.util.Map<String, ?> getLogtailStatusRecord() {
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
