// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushLinkeBahamutWebapireleasesubmitreleasebyenvRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("ReleaseExternalId")
    public String releaseExternalId;

    @NameInMap("Type")
    public String type;

    public static PushLinkeBahamutWebapireleasesubmitreleasebyenvRequest build(java.util.Map<String, ?> map) throws Exception {
        PushLinkeBahamutWebapireleasesubmitreleasebyenvRequest self = new PushLinkeBahamutWebapireleasesubmitreleasebyenvRequest();
        return TeaModel.build(map, self);
    }

    public PushLinkeBahamutWebapireleasesubmitreleasebyenvRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public PushLinkeBahamutWebapireleasesubmitreleasebyenvRequest setReleaseExternalId(String releaseExternalId) {
        this.releaseExternalId = releaseExternalId;
        return this;
    }
    public String getReleaseExternalId() {
        return this.releaseExternalId;
    }

    public PushLinkeBahamutWebapireleasesubmitreleasebyenvRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
