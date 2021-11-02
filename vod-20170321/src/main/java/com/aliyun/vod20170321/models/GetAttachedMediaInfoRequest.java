// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAttachedMediaInfoRequest extends TeaModel {
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    @NameInMap("MediaIds")
    public String mediaIds;

    @NameInMap("OutputType")
    public String outputType;

    public static GetAttachedMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAttachedMediaInfoRequest self = new GetAttachedMediaInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAttachedMediaInfoRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public GetAttachedMediaInfoRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public GetAttachedMediaInfoRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

}
