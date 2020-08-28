// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotTagRequest extends TeaModel {
    @NameInMap("PreviewToken")
    public String previewToken;

    @NameInMap("SubSceneUuid")
    public String subSceneUuid;

    @NameInMap("Type")
    public String type;

    public static GetHotspotTagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotTagRequest self = new GetHotspotTagRequest();
        return TeaModel.build(map, self);
    }

}
