// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PublishHotspotRequest extends TeaModel {
    @NameInMap("ParamTag")
    public String paramTag;

    @NameInMap("SubSceneUuid")
    public String subSceneUuid;

    public static PublishHotspotRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishHotspotRequest self = new PublishHotspotRequest();
        return TeaModel.build(map, self);
    }

    public PublishHotspotRequest setParamTag(String paramTag) {
        this.paramTag = paramTag;
        return this;
    }
    public String getParamTag() {
        return this.paramTag;
    }

    public PublishHotspotRequest setSubSceneUuid(String subSceneUuid) {
        this.subSceneUuid = subSceneUuid;
        return this;
    }
    public String getSubSceneUuid() {
        return this.subSceneUuid;
    }

}
