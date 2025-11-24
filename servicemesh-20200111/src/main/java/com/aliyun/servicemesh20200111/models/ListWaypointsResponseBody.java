// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListWaypointsResponseBody extends TeaModel {
    /**
     * <p>Base64 encoded string. If it is empty, it means that all waypoints have been obtained; if it is not empty, this value should be included in the next list, and you can continue to obtain it from the offset that ends this time.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ2IjoibWV0YS5rOHMuaW8vdjEiLCJydiI6MjY4Njc5Miwic3RhcnQiOiJkZWZhdWx0L2Jvb2tpbmZvLXByb2R1Y3RwYWdlXHUwMDAwIn0</p>
     */
    @NameInMap("Continue")
    public String _continue;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configurations of waypoint proxies.</p>
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
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HPAEnabled")
        public String HPAEnabled;

        /**
         * <p>The maximum number of waypoint proxy pods when HPA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("HPAMaxReplicas")
        public String HPAMaxReplicas;

        /**
         * <p>The minimum number of waypoint proxy pods when HPA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HPAMinReplicas")
        public String HPAMinReplicas;

        /**
         * <p>The expected CPU utilization when HPA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>93</p>
         */
        @NameInMap("HPATargetCPU")
        public String HPATargetCPU;

        /**
         * <p>The expected memory usage when HPA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>91</p>
         */
        @NameInMap("HPATargetMemory")
        public String HPATargetMemory;

        /**
         * <p>The maximum amount of CPU resources that are available to the waypoint proxy pods.</p>
         * 
         * <strong>example:</strong>
         * <p>2000m</p>
         */
        @NameInMap("LimitCPU")
        public String limitCPU;

        /**
         * <p>The maximum amount of memory resources that are available to the waypoint proxy pods.</p>
         * 
         * <strong>example:</strong>
         * <p>1024Mi</p>
         */
        @NameInMap("LimitMemory")
        public String limitMemory;

        /**
         * <p>The name of the gateway resource for the waypoint proxy. If the waypoint proxy applies to a service account, the name is the service account name. If the waypoint proxy applies to the entire namespace, the name is <code>namespace</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Indicates whether waypoint proxy pods are preferentially scheduled to elastic container instances.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PreferECI")
        public String preferECI;

        /**
         * <p>The number of waypoint proxy pods.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Replicas")
        public String replicas;

        /**
         * <p>The amount of CPU resources requested by the waypoint proxy pods.</p>
         * 
         * <strong>example:</strong>
         * <p>100m</p>
         */
        @NameInMap("RequestCPU")
        public String requestCPU;

        /**
         * <p>The amount of memory resources requested by the waypoint proxy pods.</p>
         * 
         * <strong>example:</strong>
         * <p>128Mi</p>
         */
        @NameInMap("RequestMemory")
        public String requestMemory;

        /**
         * <p>The service account to which the waypoint proxy applies. If no value is returned for this parameter, the waypoint proxy applies to the entire namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>bookinfo-productpage</p>
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
