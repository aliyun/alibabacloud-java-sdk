// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMezzanineInfoRequest extends TeaModel {
    /**
     * <p>The ID of the video.</p>
     */
    @NameInMap("AdditionType")
    public String additionType;

    /**
     * <p>The type of the mezzanine file URL. Valid values:</p>
     * <br>
     * <p>- **oss**: OSS URL</p>
     * <p>- **cdn** (default): CDN URL</p>
     * <br>
     * <p>> If you specify an OSS URL for the video stream, the video stream must be in the MP4 format.</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The frame rate of the file. Unit: frames per second.</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>The operation that you want to perform. Set the value to **GetMezzanineInfo**.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static GetMezzanineInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMezzanineInfoRequest self = new GetMezzanineInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMezzanineInfoRequest setAdditionType(String additionType) {
        this.additionType = additionType;
        return this;
    }
    public String getAdditionType() {
        return this.additionType;
    }

    public GetMezzanineInfoRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public GetMezzanineInfoRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public GetMezzanineInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
