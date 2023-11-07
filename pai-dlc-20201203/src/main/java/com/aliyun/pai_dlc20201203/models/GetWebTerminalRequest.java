// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetWebTerminalRequest extends TeaModel {
    @NameInMap("IsShared")
    public Boolean isShared;

    /**
     * <p>Pod UID。</p>
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
