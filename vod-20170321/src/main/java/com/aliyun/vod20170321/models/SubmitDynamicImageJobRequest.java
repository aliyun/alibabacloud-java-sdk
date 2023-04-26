// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobRequest extends TeaModel {
    /**
     * <p>The ID of the animated image template.</p>
     */
    @NameInMap("DynamicImageTemplateId")
    public String dynamicImageTemplateId;

    /**
     * <p>The ID of the animated image job.</p>
     */
    @NameInMap("OverrideParams")
    public String overrideParams;

    /**
     * <p>The returned data.</p>
     */
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
