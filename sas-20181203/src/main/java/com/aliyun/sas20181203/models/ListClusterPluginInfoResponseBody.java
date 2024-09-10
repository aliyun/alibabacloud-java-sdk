// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterPluginInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the plug-in.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListClusterPluginInfoResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterPluginInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterPluginInfoResponseBody self = new ListClusterPluginInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterPluginInfoResponseBody setData(java.util.List<ListClusterPluginInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClusterPluginInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListClusterPluginInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterPluginInfoResponseBodyDataNodePluginInfoList extends TeaModel {
        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>kenerl not support</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>kenerl not support</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Indicates whether the plug-in is installed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Installed")
        public Boolean installed;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>100.100.XXX.XX</p>
         */
        @NameInMap("MachineInternetIp")
        public String machineInternetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>10.XXX.XXX.XX</p>
         */
        @NameInMap("MachineIntranetIp")
        public String machineIntranetIp;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>npznas05</p>
         */
        @NameInMap("MachineName")
        public String machineName;

        /**
         * <p>The type of the instance. Valid values include:</p>
         * <ul>
         * <li><strong>ecs</strong>: Elastic Compute Service (ECS) instance</li>
         * <li><strong>slb</strong>: Server Load Balancer (SLB) instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("MachineType")
        public Long machineType;

        /**
         * <p>Indicates whether the Security Center agent is online. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> If the Security Center agent of the server is offline, Security Center does not protect the server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The name of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>alihips</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>The version of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>1.3.1</p>
         */
        @NameInMap("PluginVersion")
        public String pluginVersion;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>bc563d2b-2a3d-411b-8bbe-d75b8d3c****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>tpp-cn-2r42njq4y001</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static ListClusterPluginInfoResponseBodyDataNodePluginInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterPluginInfoResponseBodyDataNodePluginInfoList self = new ListClusterPluginInfoResponseBodyDataNodePluginInfoList();
            return TeaModel.build(map, self);
        }

        public ListClusterPluginInfoResponseBodyDataNodePluginInfoList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListClusterPluginInfoResponseBodyDataNodePluginInfoList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListClusterPluginInfoResponseBodyDataNodePluginInfoList setInstalled(Boolean installed) {
            this.installed = installed;
            return this;
        }
        public Boolean getInstalled() {
            return this.installed;
        }

        public ListClusterPluginInfoResponseBodyDataNodePluginInfoList setMachineInternetIp(String machineInternetIp) {
            this.machineInternetIp = machineInternetIp;
            return this;
        }
        public String getMachineInternetIp() {
            return this.machineInternetIp;
        }

        public ListClusterPluginInfoResponseBodyDataNodePluginInfoList setMachineIntranetIp(String machineIntranetIp) {
            this.machineIntranetIp = machineIntranetIp;
            return this;
        }
        public String getMachineIntranetIp() {
            return this.machineIntranetIp;
        }

        public ListClusterPluginInfoResponseBodyDataNodePluginInfoList setMachineName(String machineName) {
            this.machineName = machineName;
            return this;
        }
        public String getMachineName() {
            return this.machineName;
        }

        public ListClusterPluginInfoResponseBodyDataNodePluginInfoList setMachineType(Long machineType) {
            this.machineType = machineType;
            return this;
        }
        public Long getMachineType() {
            return this.machineType;
        }

        public ListClusterPluginInfoResponseBodyDataNodePluginInfoList setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListClusterPluginInfoResponseBodyDataNodePluginInfoList setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public ListClusterPluginInfoResponseBodyDataNodePluginInfoList setPluginVersion(String pluginVersion) {
            this.pluginVersion = pluginVersion;
            return this;
        }
        public String getPluginVersion() {
            return this.pluginVersion;
        }

        public ListClusterPluginInfoResponseBodyDataNodePluginInfoList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListClusterPluginInfoResponseBodyDataNodePluginInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListClusterPluginInfoResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c8ca91e0907d94efaba7fb0827eb9****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>lmftest</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li>1: normal</li>
         * <li>2: abnormal</li>
         * <li>3: offline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ABNORMAL</p>
         */
        @NameInMap("ClusterStatus")
        public String clusterStatus;

        /**
         * <p>The plug-ins.</p>
         */
        @NameInMap("NodePluginInfoList")
        public java.util.List<ListClusterPluginInfoResponseBodyDataNodePluginInfoList> nodePluginInfoList;

        public static ListClusterPluginInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClusterPluginInfoResponseBodyData self = new ListClusterPluginInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClusterPluginInfoResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClusterPluginInfoResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListClusterPluginInfoResponseBodyData setClusterStatus(String clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        public ListClusterPluginInfoResponseBodyData setNodePluginInfoList(java.util.List<ListClusterPluginInfoResponseBodyDataNodePluginInfoList> nodePluginInfoList) {
            this.nodePluginInfoList = nodePluginInfoList;
            return this;
        }
        public java.util.List<ListClusterPluginInfoResponseBodyDataNodePluginInfoList> getNodePluginInfoList() {
            return this.nodePluginInfoList;
        }

    }

}
