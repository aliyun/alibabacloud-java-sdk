// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ConnectorRuntime extends TeaModel {
    /**
     * <p>Runtime mode</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>STAROPS_MANAGED</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>Plugin ID</p>
     * 
     * <strong>example:</strong>
     * <p>gitlab</p>
     */
    @NameInMap("pluginId")
    public String pluginId;

    /**
     * <p>Satellite ID</p>
     * 
     * <strong>example:</strong>
     * <p>satellite-private-runtime</p>
     */
    @NameInMap("satelliteId")
    public String satelliteId;

    public static ConnectorRuntime build(java.util.Map<String, ?> map) throws Exception {
        ConnectorRuntime self = new ConnectorRuntime();
        return TeaModel.build(map, self);
    }

    public ConnectorRuntime setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ConnectorRuntime setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public ConnectorRuntime setSatelliteId(String satelliteId) {
        this.satelliteId = satelliteId;
        return this;
    }
    public String getSatelliteId() {
        return this.satelliteId;
    }

}
