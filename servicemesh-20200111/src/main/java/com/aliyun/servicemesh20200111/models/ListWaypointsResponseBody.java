// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListWaypointsResponseBody extends TeaModel {
    @NameInMap("Continue")
    public String _continue;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of waypoint proxy configurations.</p>
     */
    @NameInMap("Waypoints")
    public java.util.List<ListWaypointsResponseBodyWaypoints> waypoints;

    public static ListWaypointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWaypointsResponseBody self = new ListWaypointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWaypointsResponseBody set_continue(String _continue) {
        this._continue = _continue;
        return this;
    }
    public String get_continue() {
        return this._continue;
    }

    public ListWaypointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWaypointsResponseBody setWaypoints(java.util.List<ListWaypointsResponseBodyWaypoints> waypoints) {
        this.waypoints = waypoints;
        return this;
    }
    public java.util.List<ListWaypointsResponseBodyWaypoints> getWaypoints() {
        return this.waypoints;
    }

    public static class ListWaypointsResponseBodyWaypoints extends TeaModel {
        /**
         * <p>Indicates whether Horizontal Pod Autoscaling (HPA) is enabled.</p>
         */
        @NameInMap("HPAEnabled")
        public String HPAEnabled;

        /**
         * <p>The maximum number of waypoint proxy pods when HPA is enabled.</p>
         */
        @NameInMap("HPAMaxReplicas")
        public String HPAMaxReplicas;

        /**
         * <p>The minimum number of waypoint proxy pods when HPA is enabled.</p>
         */
        @NameInMap("HPAMinReplicas")
        public String HPAMinReplicas;

        /**
         * <p>The expected CPU utilization when HPA is enabled.</p>
         */
        @NameInMap("HPATargetCPU")
        public String HPATargetCPU;

        /**
         * <p>The expected memory usage when HPA is enabled.</p>
         */
        @NameInMap("HPATargetMemory")
        public String HPATargetMemory;

        /**
         * <p>The maximum number of CPU cores that are available to the waypoint proxy pods.</p>
         */
        @NameInMap("LimitCPU")
        public String limitCPU;

        /**
         * <p>The maximum size of the memory that is available to the waypoint proxy pods.</p>
         */
        @NameInMap("LimitMemory")
        public String limitMemory;

        /**
         * <p>The name of the gateway resource corresponding to the waypoint proxy. If the waypoint proxy takes effect on a service account, the name is the service account name. If the waypoint proxy takes effect for the entire namespace, the name is "namespace".</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Indicates whether waypoint proxy pods are deployed based on Elastic Container Instance (ECI).</p>
         */
        @NameInMap("PreferECI")
        public String preferECI;

        /**
         * <p>The number of waypoint proxy pods.</p>
         */
        @NameInMap("Replicas")
        public String replicas;

        /**
         * <p>The number of CPU cores requested by the waypoint proxy pods.</p>
         */
        @NameInMap("RequestCPU")
        public String requestCPU;

        /**
         * <p>The size of the memory requested by the waypoint proxy pods.</p>
         */
        @NameInMap("RequestMemory")
        public String requestMemory;

        /**
         * <p>The service account on which the waypoint proxy takes effect. If this parameter is not specified, the waypoint proxy takes effect for the entire namespace.</p>
         */
        @NameInMap("ServiceAccount")
        public String serviceAccount;

        public static ListWaypointsResponseBodyWaypoints build(java.util.Map<String, ?> map) throws Exception {
            ListWaypointsResponseBodyWaypoints self = new ListWaypointsResponseBodyWaypoints();
            return TeaModel.build(map, self);
        }

        public ListWaypointsResponseBodyWaypoints setHPAEnabled(String HPAEnabled) {
            this.HPAEnabled = HPAEnabled;
            return this;
        }
        public String getHPAEnabled() {
            return this.HPAEnabled;
        }

        public ListWaypointsResponseBodyWaypoints setHPAMaxReplicas(String HPAMaxReplicas) {
            this.HPAMaxReplicas = HPAMaxReplicas;
            return this;
        }
        public String getHPAMaxReplicas() {
            return this.HPAMaxReplicas;
        }

        public ListWaypointsResponseBodyWaypoints setHPAMinReplicas(String HPAMinReplicas) {
            this.HPAMinReplicas = HPAMinReplicas;
            return this;
        }
        public String getHPAMinReplicas() {
            return this.HPAMinReplicas;
        }

        public ListWaypointsResponseBodyWaypoints setHPATargetCPU(String HPATargetCPU) {
            this.HPATargetCPU = HPATargetCPU;
            return this;
        }
        public String getHPATargetCPU() {
            return this.HPATargetCPU;
        }

        public ListWaypointsResponseBodyWaypoints setHPATargetMemory(String HPATargetMemory) {
            this.HPATargetMemory = HPATargetMemory;
            return this;
        }
        public String getHPATargetMemory() {
            return this.HPATargetMemory;
        }

        public ListWaypointsResponseBodyWaypoints setLimitCPU(String limitCPU) {
            this.limitCPU = limitCPU;
            return this;
        }
        public String getLimitCPU() {
            return this.limitCPU;
        }

        public ListWaypointsResponseBodyWaypoints setLimitMemory(String limitMemory) {
            this.limitMemory = limitMemory;
            return this;
        }
        public String getLimitMemory() {
            return this.limitMemory;
        }

        public ListWaypointsResponseBodyWaypoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWaypointsResponseBodyWaypoints setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListWaypointsResponseBodyWaypoints setPreferECI(String preferECI) {
            this.preferECI = preferECI;
            return this;
        }
        public String getPreferECI() {
            return this.preferECI;
        }

        public ListWaypointsResponseBodyWaypoints setReplicas(String replicas) {
            this.replicas = replicas;
            return this;
        }
        public String getReplicas() {
            return this.replicas;
        }

        public ListWaypointsResponseBodyWaypoints setRequestCPU(String requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }
        public String getRequestCPU() {
            return this.requestCPU;
        }

        public ListWaypointsResponseBodyWaypoints setRequestMemory(String requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }
        public String getRequestMemory() {
            return this.requestMemory;
        }

        public ListWaypointsResponseBodyWaypoints setServiceAccount(String serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public String getServiceAccount() {
            return this.serviceAccount;
        }

    }

}
