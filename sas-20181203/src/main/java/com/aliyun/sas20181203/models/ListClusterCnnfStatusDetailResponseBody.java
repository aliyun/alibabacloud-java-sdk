// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterCnnfStatusDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListClusterCnnfStatusDetailResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterCnnfStatusDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterCnnfStatusDetailResponseBody self = new ListClusterCnnfStatusDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterCnnfStatusDetailResponseBody setData(java.util.List<ListClusterCnnfStatusDetailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClusterCnnfStatusDetailResponseBodyData> getData() {
        return this.data;
    }

    public ListClusterCnnfStatusDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterCnnfStatusDetailResponseBodyData extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Installed")
        public Boolean installed;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("InvalidType")
        public String invalidType;

        @NameInMap("MachineName")
        public String machineName;

        @NameInMap("MachineType")
        public Integer machineType;

        @NameInMap("PluginName")
        public String pluginName;

        @NameInMap("PluginVersion")
        public String pluginVersion;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uuid")
        public String uuid;

        public static ListClusterCnnfStatusDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClusterCnnfStatusDetailResponseBodyData self = new ListClusterCnnfStatusDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClusterCnnfStatusDetailResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClusterCnnfStatusDetailResponseBodyData setInstalled(Boolean installed) {
            this.installed = installed;
            return this;
        }
        public Boolean getInstalled() {
            return this.installed;
        }

        public ListClusterCnnfStatusDetailResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListClusterCnnfStatusDetailResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListClusterCnnfStatusDetailResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListClusterCnnfStatusDetailResponseBodyData setInvalidType(String invalidType) {
            this.invalidType = invalidType;
            return this;
        }
        public String getInvalidType() {
            return this.invalidType;
        }

        public ListClusterCnnfStatusDetailResponseBodyData setMachineName(String machineName) {
            this.machineName = machineName;
            return this;
        }
        public String getMachineName() {
            return this.machineName;
        }

        public ListClusterCnnfStatusDetailResponseBodyData setMachineType(Integer machineType) {
            this.machineType = machineType;
            return this;
        }
        public Integer getMachineType() {
            return this.machineType;
        }

        public ListClusterCnnfStatusDetailResponseBodyData setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public ListClusterCnnfStatusDetailResponseBodyData setPluginVersion(String pluginVersion) {
            this.pluginVersion = pluginVersion;
            return this;
        }
        public String getPluginVersion() {
            return this.pluginVersion;
        }

        public ListClusterCnnfStatusDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterCnnfStatusDetailResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
