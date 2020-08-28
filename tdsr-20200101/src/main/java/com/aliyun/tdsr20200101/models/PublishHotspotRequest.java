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

}
