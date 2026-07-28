// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationEndpointAddressShrinkRequest extends TeaModel {
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
    public String newPortsShrink;

    public static ModifyApplicationEndpointAddressShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationEndpointAddressShrinkRequest self = new ModifyApplicationEndpointAddressShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationEndpointAddressShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyApplicationEndpointAddressShrinkRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ModifyApplicationEndpointAddressShrinkRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public ModifyApplicationEndpointAddressShrinkRequest setNewConnectionStringPrefix(String newConnectionStringPrefix) {
        this.newConnectionStringPrefix = newConnectionStringPrefix;
        return this;
    }
    public String getNewConnectionStringPrefix() {
        return this.newConnectionStringPrefix;
    }

    public ModifyApplicationEndpointAddressShrinkRequest setNewPortsShrink(String newPortsShrink) {
        this.newPortsShrink = newPortsShrink;
        return this;
    }
    public String getNewPortsShrink() {
        return this.newPortsShrink;
    }

}
