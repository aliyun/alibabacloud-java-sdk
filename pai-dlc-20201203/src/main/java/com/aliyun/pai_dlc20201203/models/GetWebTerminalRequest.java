// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetWebTerminalRequest extends TeaModel {
    /**
     * <p>Specifies whether to create a shareable link to access the container. Valid values:</p>
     * <ul>
     * <li>true: returns a shareable link to access the container. The link will expire after 30 seconds and can only be used once. After you access the container by using the link, other requests that use this link to access the container become invalid.</li>
     * <li>false: returns a common shareable link to access the container. If you use a common shareable link to access a container, Alibaba Cloud identity authentication is required. The link will expire after 30 seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsShared")
    public Boolean isShared;

    /**
     * <p>The pod UID.</p>
     * 
     * <strong>example:</strong>
     * <p>94a7cc7c-0033-48b5-85bd-71c63592c268</p>
     */
    @NameInMap("PodUid")
    public String podUid;

    public static GetWebTerminalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebTerminalRequest self = new GetWebTerminalRequest();
        return TeaModel.build(map, self);
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
