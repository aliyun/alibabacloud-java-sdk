// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class SplitVideoPartsRequest extends TeaModel {
    @NameInMap("MaxTime")
    public Integer maxTime;

    @NameInMap("MinTime")
    public Integer minTime;

    @NameInMap("Template")
    public String template;

    @NameInMap("VideoUrl")
    public String videoUrl;

    public static SplitVideoPartsRequest build(java.util.Map<String, ?> map) throws Exception {
        SplitVideoPartsRequest self = new SplitVideoPartsRequest();
        return TeaModel.build(map, self);
    }

    public SplitVideoPartsRequest setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public Integer getMaxTime() {
        return this.maxTime;
    }

    public SplitVideoPartsRequest setMinTime(Integer minTime) {
        this.minTime = minTime;
        return this;
    }
    public Integer getMinTime() {
        return this.minTime;
    }

    public SplitVideoPartsRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public SplitVideoPartsRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
