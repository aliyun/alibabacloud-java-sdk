// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class UnderstandVideoContentAdvanceRequest extends TeaModel {
    @NameInMap("VideoURLObject")
    @Validation(required = true)
    public java.io.InputStream videoURLObject;

    @NameInMap("Async")
    public Boolean async;

    public static UnderstandVideoContentAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnderstandVideoContentAdvanceRequest self = new UnderstandVideoContentAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public UnderstandVideoContentAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

    public UnderstandVideoContentAdvanceRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

}
