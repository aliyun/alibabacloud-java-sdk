// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMezzaninesRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcibly delete the mezzanine file. Default value: **false**.</p>
     * <br>
     * <p>> If a video is delivered without transcoding or is asynchronously transcoded, the mezzanine file of the video is used for original-quality playback. By default, the mezzanine file of the video cannot be deleted. To forcibly delete the mezzanine file, set this parameter to **true**.</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The list of video IDs. A maximum of 20 video IDs can be specified at a time. Separate multiple IDs with commas (,).</p>
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
