// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ContainerInfo extends TeaModel {
    /**
     * <p>The name of the main container.</p>
     * 
     * <strong>example:</strong>
     * <p>pytorch</p>
     */
    @NameInMap("MainContainer")
    public String mainContainer;

    /**
     * <p>The list of sidecar container names.</p>
     */
    @NameInMap("SidecarContainers")
    public java.util.List<String> sidecarContainers;

    public static ContainerInfo build(java.util.Map<String, ?> map) throws Exception {
        ContainerInfo self = new ContainerInfo();
        return TeaModel.build(map, self);
    }

    public ContainerInfo setMainContainer(String mainContainer) {
        this.mainContainer = mainContainer;
        return this;
    }
    public String getMainContainer() {
        return this.mainContainer;
    }

    public ContainerInfo setSidecarContainers(java.util.List<String> sidecarContainers) {
        this.sidecarContainers = sidecarContainers;
        return this;
    }
    public java.util.List<String> getSidecarContainers() {
        return this.sidecarContainers;
    }

}
