// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMezzaninesRequest extends TeaModel {
    /**
     * <p>Deletes one or more mezzanine files at a time.</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The operation that you want to perform. Set the value to **DeleteMezzanines**.</p>
     */
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
