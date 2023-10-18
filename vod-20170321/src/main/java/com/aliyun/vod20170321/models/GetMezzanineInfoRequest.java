// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMezzanineInfoRequest extends TeaModel {
    /**
     * <p>The type of additional information. Separate multiple values with commas (,). By default, only the basic information is returned. Valid values:</p>
     * <br>
     * <p>*   **video**: video stream information</p>
     * <p>*   **audio**: audio stream information</p>
     */
    @NameInMap("AdditionType")
    public String additionType;

    /**
     * <p>The validity period of the mezzanine file URL. Unit: seconds. Default value: **1800**. Minimum value: **1**.</p>
     * <br>
     * <p>*   If the OutputType parameter is set to **cdn**:</p>
     * <br>
     * <p>    *   The mezzanine file URL has a validity period only if URL signing is enabled. Otherwise, the mezzanine file URL is permanently valid.</p>
     * <p>    *   Minimum value: **1**.</p>
     * <p>    *   Maximum Value: unlimited.</p>
     * <p>    *   Default value: If you do not set this parameter, the default validity period that is specified in URL signing is used.</p>
     * <br>
     * <p><!----></p>
     * <br>
     * <p>*   If the OutputType parameter is set to **oss**:</p>
     * <br>
     * <p>    *   The mezzanine file URL has a validity period only if the permissions on the Object Storage Service (OSS) bucket are private. Otherwise, the mezzanine file URL is permanently valid.</p>
     * <p>    *   Minimum value: **1**.</p>
     * <p>    *   Maximum value: **2592000** (30 days). The maximum value is limited to reduce security risks of the origin.</p>
     * <p>    *   Default value: If you do not set this parameter, the default value is **3600**.</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The type of the mezzanine file URL. Valid values:</p>
     * <br>
     * <p>- **oss**: OSS URL</p>
     * <p>- **cdn** (default): Content Delivery Network (CDN) URL</p>
     * <br>
     * <p>> If the mezzanine file is stored in a bucket of the in type, only an OSS URL is returned.</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>The ID of the video.</p>
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
