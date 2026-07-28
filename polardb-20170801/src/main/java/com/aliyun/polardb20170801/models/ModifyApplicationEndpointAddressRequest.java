// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationEndpointAddressRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The endpoint ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The network type of the endpoint address. Valid values: </p>
     * <ul>
     * <li><strong>Public</strong>: public network.</li>
     * <li><strong>Private</strong>: private network.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <p>The new endpoint prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>xg06iror0l</p>
     */
    @NameInMap("NewConnectionStringPrefix")
    public String newConnectionStringPrefix;

    /**
     * <p>The list of new ports.</p>
     */
    @NameInMap("NewPorts")
    public java.util.List<ModifyApplicationEndpointAddressRequestNewPorts> newPorts;

    public static ModifyApplicationEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationEndpointAddressRequest self = new ModifyApplicationEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationEndpointAddressRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyApplicationEndpointAddressRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ModifyApplicationEndpointAddressRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public ModifyApplicationEndpointAddressRequest setNewConnectionStringPrefix(String newConnectionStringPrefix) {
        this.newConnectionStringPrefix = newConnectionStringPrefix;
        return this;
    }
    public String getNewConnectionStringPrefix() {
        return this.newConnectionStringPrefix;
    }

    public ModifyApplicationEndpointAddressRequest setNewPorts(java.util.List<ModifyApplicationEndpointAddressRequestNewPorts> newPorts) {
        this.newPorts = newPorts;
        return this;
    }
    public java.util.List<ModifyApplicationEndpointAddressRequestNewPorts> getNewPorts() {
        return this.newPorts;
    }

    public static class ModifyApplicationEndpointAddressRequestNewPorts extends TeaModel {
        /**
         * <p>The new port value.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("NewPort")
        public Integer newPort;

        /**
         * <p>The old port value.</p>
         * 
         * <strong>example:</strong>
         * <p>18789</p>
         */
        @NameInMap("OldPort")
        public Integer oldPort;

        /**
         * <p>The port name.</p>
         * 
         * <strong>example:</strong>
         * <p>polarclaw</p>
         */
        @NameInMap("PortName")
        public String portName;

        public static ModifyApplicationEndpointAddressRequestNewPorts build(java.util.Map<String, ?> map) throws Exception {
            ModifyApplicationEndpointAddressRequestNewPorts self = new ModifyApplicationEndpointAddressRequestNewPorts();
            return TeaModel.build(map, self);
        }

        public ModifyApplicationEndpointAddressRequestNewPorts setNewPort(Integer newPort) {
            this.newPort = newPort;
            return this;
        }
        public Integer getNewPort() {
            return this.newPort;
        }

        public ModifyApplicationEndpointAddressRequestNewPorts setOldPort(Integer oldPort) {
            this.oldPort = oldPort;
            return this;
        }
        public Integer getOldPort() {
            return this.oldPort;
        }

        public ModifyApplicationEndpointAddressRequestNewPorts setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

    }

}
