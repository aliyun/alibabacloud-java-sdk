// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractFilmVideoRequest extends TeaModel {
    @NameInMap("VideoUrl")
    public String videoUrl;

    @NameInMap("Length")
    public Integer length;

    public static AbstractFilmVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        AbstractFilmVideoRequest self = new AbstractFilmVideoRequest();
        return TeaModel.build(map, self);
    }

    public AbstractFilmVideoRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public AbstractFilmVideoRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

}
