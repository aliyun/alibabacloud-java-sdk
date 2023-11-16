// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterPluginInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListClusterPluginInfoResponseBodyData> data;

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
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("Installed")
        public Boolean installed;

        @NameInMap("MachineInternetIp")
        public String machineInternetIp;

        @NameInMap("MachineIntranetIp")
        public String machineIntranetIp;

        @NameInMap("MachineName")
        public String machineName;

        @NameInMap("MachineType")
        public Long machineType;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("PluginName")
        public String pluginName;

        @NameInMap("PluginVersion")
        public String pluginVersion;

        @NameInMap("Uuid")
        public String uuid;

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
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterStatus")
        public String clusterStatus;

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
