// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterCnnfStatusDetailResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the protection status of the container firewall.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListClusterCnnfStatusDetailResponseBodyData> data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>64329F40-5C94-51D3-A400-37AA7BAC****</p>
     */
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
        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c8ca91e0907d94efaba7fb0827eb9****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>Indicates whether the container firewall plug-in is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Installed")
        public Boolean installed;

        /**
         * <p>The ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp180bogui4fc0z4****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The public IP address of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10.42.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The cause why the plug-in is invalid. Valid values:</p>
         * <ul>
         * <li><strong>PLUGIN_OFFLINE</strong>: The plug-in is offline.</li>
         * <li><strong>PLUGIN_NOT_INSTALLED</strong>: The plug-in is not installed.</li>
         * <li><strong>PLUGIN_INVALID_VERSION</strong>: The version of the plug-in is invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PLUGIN_OFFLINE</p>
         */
        @NameInMap("InvalidType")
        public String invalidType;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>security</p>
         */
        @NameInMap("MachineName")
        public String machineName;

        /**
         * <p>The machine type of the instance. The value is fixed as <strong>ecs</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("MachineType")
        public Integer machineType;

        /**
         * <p>The name of the plug-in. The value is fixed as <strong>alinet</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>alinet</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>The version of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>3.3</p>
         */
        @NameInMap("PluginVersion")
        public String pluginVersion;

        /**
         * <p>The online status of the plug-in. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: The plug-in is offline.</li>
         * <li><strong>true</strong>: The plug-in is online.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The UUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
         */
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
