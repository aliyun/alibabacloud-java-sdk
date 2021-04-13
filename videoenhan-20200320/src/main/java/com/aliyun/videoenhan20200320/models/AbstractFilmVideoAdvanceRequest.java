// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractFilmVideoAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("Length")
    public Integer length;

    public static AbstractFilmVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AbstractFilmVideoAdvanceRequest self = new AbstractFilmVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AbstractFilmVideoAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

    public AbstractFilmVideoAdvanceRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

}
