// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfoRequest extends TeaModel {
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("OutputType")
    public String outputType;

    public static GetImageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageInfoRequest self = new GetImageInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetImageInfoRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public GetImageInfoRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetImageInfoRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

}
