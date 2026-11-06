// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetWebTerminalRequest extends TeaModel {
    /**
     * <p>The name of the container. If this parameter is not specified, the WebTerminal of the primary container is accessed.</p>
     * 
     * <strong>example:</strong>
     * <p>sidecar-test</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>Specifies whether to create a shareable link for accessing the container. Valid values:</p>
     * <ul>
     * <li>true: Returns a shareable link for accessing the container. The link expires after 30 seconds and can be used only once. After the container is accessed through this link, subsequent requests to access the container by using the same link become invalid.</li>
     * <li>false: Returns a regular link for accessing the container. Alibaba Cloud identity verification is required when you use the link. The link expires after 30 seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsShared")
    public Boolean isShared;

    /**
     * <p>The Pod UID.</p>
     * 
     * <strong>example:</strong>
     * <p>94a7cc7c-0033-48b5-85bd-71c63592****</p>
     */
    @NameInMap("PodUid")
    public String podUid;

    public static GetWebTerminalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebTerminalRequest self = new GetWebTerminalRequest();
        return TeaModel.build(map, self);
    }

    public GetWebTerminalRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public GetWebTerminalRequest setIsShared(Boolean isShared) {
        this.isShared = isShared;
        return this;
    }
    public Boolean getIsShared() {
        return this.isShared;
    }

    public GetWebTerminalRequest setPodUid(String podUid) {
        this.podUid = podUid;
        return this;
    }
    public String getPodUid() {
        return this.podUid;
    }

}
