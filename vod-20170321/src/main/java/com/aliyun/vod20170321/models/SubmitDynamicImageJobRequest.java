// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobRequest extends TeaModel {
    // The ID of the animated image template.
    @NameInMap("DynamicImageTemplateId")
    public String dynamicImageTemplateId;

    // The parameters used for overriding. The value is a JSON-formatted string. For more information, see the "OverrideParams" section of the [Media processing parameters](~~98618~~) topic. The parameters are used to replace the parameters in the animated image template. For more information, see the [Basic data types](~~52839~~) topic.
    @NameInMap("OverrideParams")
    public String overrideParams;

    // The ID of the video.
    @NameInMap("VideoId")
    public String videoId;

    public static SubmitDynamicImageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicImageJobRequest self = new SubmitDynamicImageJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDynamicImageJobRequest setDynamicImageTemplateId(String dynamicImageTemplateId) {
        this.dynamicImageTemplateId = dynamicImageTemplateId;
        return this;
    }
    public String getDynamicImageTemplateId() {
        return this.dynamicImageTemplateId;
    }

    public SubmitDynamicImageJobRequest setOverrideParams(String overrideParams) {
        this.overrideParams = overrideParams;
        return this;
    }
    public String getOverrideParams() {
        return this.overrideParams;
    }

    public SubmitDynamicImageJobRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
