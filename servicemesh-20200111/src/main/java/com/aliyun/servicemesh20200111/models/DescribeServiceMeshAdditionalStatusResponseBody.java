// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshAdditionalStatusResponseBody extends TeaModel {
    /**
     * <p>The cluster status.</p>
     */
    @NameInMap("ClusterStatus")
    public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus clusterStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11fd0027-c27e-41bb-a565-75583054****</p>
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
         * <p>Indicates whether the CLB instance is locked. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Locked")
        public Boolean locked;

        /**
         * <p>The billing method of the CLB instance. Valid values:</p>
         * <ul>
         * <li><code>PrePay</code>: subscription</li>
         * <li><code>PayOnDemand</code>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePay</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>Indicates whether the CLB instance is reused. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Reused")
        public Boolean reused;

        /**
         * <p>The check results of the number of backend servers of the CLB instance created for exposing Istio Pilot. Valid values:</p>
         * <ul>
         * <li><code>too_much</code>: An excessive number of backend servers are created.</li>
         * <li><code>num_exact</code>: A proper number of backend servers are created.</li>
         * <li><code>too_little</code>: The number of backend servers falls short.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>num_exact</p>
         */
        @NameInMap("SLBBackEndServerNumStatus")
        public String SLBBackEndServerNumStatus;

        /**
         * <p>The check results of the CLB instance. Valid values:</p>
         * <ul>
         * <li><code>exist</code>: The CLB instance exists.</li>
         * <li><code>not_exist</code>: The CLB instance does not exist.</li>
         * <li><code>conflict</code>: Conflicts are detected.</li>
         * <li><code>failed</code>: The check fails.</li>
         * <li><code>time_out</code>: The check times out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exist</p>
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
        /**
         * <p>Indicates whether the CLB instance is locked due to overdue payments. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Locked")
        public Boolean locked;

        /**
         * <p>The billing method of the CLB instance. Valid values:</p>
         * <ul>
         * <li><code>PrePay</code>: subscription</li>
         * <li><code>PayOnDemand</code> (default): pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayOnDemand</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>Indicates whether the CLB instance is reused. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The CLB instance is reused. Non-ASM listener configuration is detected in the listener configurations of the CLB instance.</li>
         * <li><code>false</code>: The CLB instance is not reused.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Reused")
        public Boolean reused;

        /**
         * <p>The check result of the number of backend servers of the CLB instance created for exposing Istio Pilot. Valid values:</p>
         * <ul>
         * <li><code>num_exact</code>: A proper number of backend servers are created.</li>
         * <li><code>too_much</code>: An excessive number of backend servers are created.</li>
         * <li><code>too_little</code>: The number of backend servers falls short.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>num_exact</p>
         */
        @NameInMap("SLBBackEndServerNumStatus")
        public String SLBBackEndServerNumStatus;

        /**
         * <p>The check result of the CLB instance. Valid values:</p>
         * <ul>
         * <li><code>exist</code>: The CLB instance exists.</li>
         * <li><code>not_exist</code>: The CLB instance does not exist.</li>
         * <li><code>time_out</code>: The check times out.</li>
         * <li><code>failed</code>: The CLB instance has expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exist</p>
         */
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
         * <p>Indicates whether the CLB instance is locked. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Locked")
        public Boolean locked;

        /**
         * <p>The billing method of the CLB instance. Valid values:</p>
         * <ul>
         * <li><code>PrePay</code>: subscription</li>
         * <li><code>PayOnDemand</code>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayOnDemand</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>Indicates whether the CLB instance is reused. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Reused")
        public Boolean reused;

        /**
         * <p>The check results of the number of backend servers of the CLB instance created for exposing Istio Pilot. Valid values:</p>
         * <ul>
         * <li><code>too_much</code>: An excessive number of backend servers are created.</li>
         * <li><code>num_exact</code>: A proper number of backend servers are created.</li>
         * <li><code>too_little</code>: The number of backend servers falls short.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>num_exact</p>
         */
        @NameInMap("SLBBackEndServerNumStatus")
        public String SLBBackEndServerNumStatus;

        /**
         * <p>The check results of the CLB instance. Valid values:</p>
         * <ul>
         * <li><code>exist</code>: The CLB instance exists.</li>
         * <li><code>not_exist</code>: The CLB instance does not exist.</li>
         * <li><code>conflict</code>: Conflicts are detected.</li>
         * <li><code>failed</code>: The check fails.</li>
         * <li><code>time_out</code>: The check times out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exist</p>
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
        /**
         * <p>Indicates whether access logs exist. Valid values:</p>
         * <ul>
         * <li><code>exist</code>: Access logs exist.</li>
         * <li><code>not_exist</code>: Access logs do not exist.</li>
         * <li><code>failed</code>: The check fails.</li>
         * <li><code>time_out</code>: The check times out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exist</p>
         */
        @NameInMap("AccessLogProjectStatus")
        public String accessLogProjectStatus;

        /**
         * <p>The check result of the EIP associated with the API server. Valid values:</p>
         * <ul>
         * <li><code>exist</code>: The EIP exists.</li>
         * <li><code>not_exist</code>: The EIP does not exist.</li>
         * <li><code>failed</code>: The check fails.</li>
         * <li><code>time_out</code>: The check times out.</li>
         * <li><code>not_in_use</code>: The EIP is not associated with the API Server.</li>
         * <li><code>locked</code>: The EIP is locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exist</p>
         */
        @NameInMap("ApiServerEIPStatus")
        public String apiServerEIPStatus;

        /**
         * <p>The check results of the CLB instance created for exposing the API server.</p>
         */
        @NameInMap("ApiServerLoadBalancerStatus")
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusApiServerLoadBalancerStatus apiServerLoadBalancerStatus;

        /**
         * <p>Indicates whether audit logs exist. Valid values:</p>
         * <ul>
         * <li><code>exist</code></li>
         * <li><code>not exist</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exist</p>
         */
        @NameInMap("AuditProjectStatus")
        public String auditProjectStatus;

        @NameInMap("CanaryPilotEIPStatus")
        public String canaryPilotEIPStatus;

        /**
         * <p>The check results of the CLB instance that is created for exposing Istio Pilot and used during canary release.</p>
         */
        @NameInMap("CanaryPilotLoadBalancerStatus")
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusCanaryPilotLoadBalancerStatus canaryPilotLoadBalancerStatus;

        /**
         * <p>Indicates whether control plane logs exist. Valid values:</p>
         * <ul>
         * <li><code>exist</code>: Control plane logs exist.</li>
         * <li><code>not_exist</code>: Control plane logs do not exist.</li>
         * <li><code>failed</code>: The check fails.</li>
         * <li><code>time_out</code>: The check times out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exist</p>
         */
        @NameInMap("ControlPlaneProjectStatus")
        public String controlPlaneProjectStatus;

        /**
         * <p>Indicates whether Logtail is installed in clusters on the data plane.</p>
         */
        @NameInMap("LogtailStatusRecord")
        public java.util.Map<String, ?> logtailStatusRecord;

        /**
         * <p>The check result of whether the EIP is associated with the API server. Valid values:</p>
         * <ul>
         * <li><code>exist</code>: The EIP exists.</li>
         * <li><code>not_exist</code>: The EIP does not exist.</li>
         * <li><code>failed</code>: The check fails.</li>
         * <li><code>time_out</code>: The check is timed out.</li>
         * <li><code>not_in_use</code>: The EIP is not associated with the API server.</li>
         * <li><code>locked</code>: The EIP is locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exist</p>
         */
        @NameInMap("PilotEIPStatus")
        public String pilotEIPStatus;

        /**
         * <p>The check results of the CLB instance created for exposing Istio Pilot.</p>
         */
        @NameInMap("PilotLoadBalancerStatus")
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus pilotLoadBalancerStatus;

        /**
         * <p>The status of the RAM OAuth application that is integrated with Mesh Topology. Valid values:</p>
         * <ul>
         * <li><code>exist</code>: The RAM OAuth application exists.</li>
         * <li><code>reused</code>: The RAM OAuth application is reused.</li>
         * <li><code>not_exist</code>: The RAM OAuth application does not exist.</li>
         * <li><code>failed</code>: The check fails.</li>
         * <li><code>time_out</code>: The check times out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>reused</p>
         */
        @NameInMap("RAMApplicationStatus")
        public String RAMApplicationStatus;

        /**
         * <p>Indicates whether the security group is reused. Valid values:</p>
         * <ul>
         * <li><code>reused</code>: The security group is reused.</li>
         * <li><code>not_reused</code>: The security group is not reused.</li>
         * <li><code>failed</code>: The check fails.</li>
         * <li><code>time_out</code>: The check times out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>reused</p>
         */
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

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setCanaryPilotEIPStatus(String canaryPilotEIPStatus) {
            this.canaryPilotEIPStatus = canaryPilotEIPStatus;
            return this;
        }
        public String getCanaryPilotEIPStatus() {
            return this.canaryPilotEIPStatus;
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

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setPilotEIPStatus(String pilotEIPStatus) {
            this.pilotEIPStatus = pilotEIPStatus;
            return this;
        }
        public String getPilotEIPStatus() {
            return this.pilotEIPStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setPilotLoadBalancerStatus(DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus pilotLoadBalancerStatus) {
            this.pilotLoadBalancerStatus = pilotLoadBalancerStatus;
            return this;
        }
        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatusPilotLoadBalancerStatus getPilotLoadBalancerStatus() {
            return this.pilotLoadBalancerStatus;
        }

        public DescribeServiceMeshAdditionalStatusResponseBodyClusterStatus setRAMApplicationStatus(String RAMApplicationStatus) {
            this.RAMApplicationStatus = RAMApplicationStatus;
            return this;
        }
        public String getRAMApplicationStatus() {
            return this.RAMApplicationStatus;
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
