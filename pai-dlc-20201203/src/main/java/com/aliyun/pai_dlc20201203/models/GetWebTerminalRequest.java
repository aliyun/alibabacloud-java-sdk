// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetWebTerminalRequest extends TeaModel {
    /**
     * <p>Specifies whether to create a shared link for accessing the container. Valid values:</p>
     * <ul>
     * <li>true: Returns a shared link for accessing the container. The link expires after 30 seconds and can be used only once. After someone accesses the container through this link, subsequent requests using the same link are invalid.</li>
     * <li>false: Returns a regular link for accessing the container. Alibaba Cloud identity authentication is required when using this link. The link expires after 30 seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsShared")
    public Boolean isShared;

    /**
     * <p>Pod UID。</p>
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
