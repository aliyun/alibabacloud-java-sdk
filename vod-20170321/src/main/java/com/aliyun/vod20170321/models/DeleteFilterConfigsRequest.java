// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteFilterConfigsRequest extends TeaModel {
    @NameInMap("UuId")
    public String uuId;

    public static DeleteFilterConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilterConfigsRequest self = new DeleteFilterConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFilterConfigsRequest setUuId(String uuId) {
        this.uuId = uuId;
        return this;
    }
    public String getUuId() {
        return this.uuId;
    }

}
