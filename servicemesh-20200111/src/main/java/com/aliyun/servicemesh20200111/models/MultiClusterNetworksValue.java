// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class MultiClusterNetworksValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>network1</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableGateway")
    public Boolean enableGateway;

    /**
     * <strong>example:</strong>
     * <p>8.16x.1x.1x:15443</p>
     */
    @NameInMap("CustomGatewayAddress")
    public String customGatewayAddress;

    /**
     * <strong>example:</strong>
     * <p>asm-cross-network-ccb37ff104***</p>
     */
    @NameInMap("GatewayName")
    public String gatewayName;

    public static MultiClusterNetworksValue build(java.util.Map<String, ?> map) throws Exception {
        MultiClusterNetworksValue self = new MultiClusterNetworksValue();
        return TeaModel.build(map, self);
    }

    public MultiClusterNetworksValue setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public MultiClusterNetworksValue setEnableGateway(Boolean enableGateway) {
        this.enableGateway = enableGateway;
        return this;
    }
    public Boolean getEnableGateway() {
        return this.enableGateway;
    }

    public MultiClusterNetworksValue setCustomGatewayAddress(String customGatewayAddress) {
        this.customGatewayAddress = customGatewayAddress;
        return this;
    }
    public String getCustomGatewayAddress() {
        return this.customGatewayAddress;
    }

    public MultiClusterNetworksValue setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

}
