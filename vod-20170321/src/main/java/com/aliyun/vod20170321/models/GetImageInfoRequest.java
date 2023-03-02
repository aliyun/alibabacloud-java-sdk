// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfoRequest extends TeaModel {
    /**
     * <p>The validity period of the image URL. Unit: seconds.</p>
     * <br>
     * <p>> *   If the OutputType parameter is set to **cdn**:</p>
     * <p>>     *   The image URL has a validity period only if URL signing is enabled. Otherwise, the image URL is permanently valid.</p>
     * <p>>     *   Minimum value: **1**.</p>
     * <p>>     *   Maximum value: unlimited.</p>
     * <p>>     *   Default value: If you do not set this parameter, the default validity period that is specified in URL signing is used.</p>
     * <p>> *   If the OutputType parameter is set to **oss**:</p>
     * <p>>     *   The image URL has a validity period only if the permissions on the Object Storage Service (OSS) bucket are private. Otherwise, the image URL is permanently valid.</p>
     * <p>>     *   Minimum value: **1**.</p>
     * <p>>     *   Maximum value: **2592000** (30 days). The maximum value is limited to reduce security risks of the origin.</p>
     * <p>>     *   Default value: If you do not set this parameter, the default value is **3600**.</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The ID of the image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The type of the image URL. Valid values:</p>
     * <br>
     * <p>*   **oss**: OSS URL</p>
     * <p>*   **cdn** (default): Content Delivery Network (CDN) URL</p>
     */
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
