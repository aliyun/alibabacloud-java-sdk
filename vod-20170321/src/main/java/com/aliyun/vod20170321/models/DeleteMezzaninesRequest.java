// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMezzaninesRequest extends TeaModel {
    @NameInMap("Force")
    public Boolean force;

    @NameInMap("VideoIds")
    public String videoIds;

    public static DeleteMezzaninesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMezzaninesRequest self = new DeleteMezzaninesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMezzaninesRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteMezzaninesRequest setVideoIds(String videoIds) {
        this.videoIds = videoIds;
        return this;
    }
    public String getVideoIds() {
        return this.videoIds;
    }

}
