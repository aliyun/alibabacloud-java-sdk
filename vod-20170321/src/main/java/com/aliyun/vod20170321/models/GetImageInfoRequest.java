// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfoRequest extends TeaModel {
    // The validity period of the image URL. Unit: seconds.
    // 
    // > *   If the OutputType parameter is set to **cdn**:
    // >     *   The image URL has a validity period only if URL signing is enabled. Otherwise, the image URL is permanently valid.
    // >     *   Minimum value: **1**.
    // >     *   Maximum value: unlimited.
    // >     *   Default value: If you do not set this parameter, the default validity period that is specified in URL signing is used.
    // > *   If the OutputType parameter is set to **oss**:
    // >     *   The image URL has a validity period only if the permissions on the Object Storage Service (OSS) bucket are private. Otherwise, the image URL is permanently valid.
    // >     *   Minimum value: **1**.
    // >     *   Maximum value: **2592000** (30 days). The maximum value is limited to reduce security risks of the origin.
    // >     *   Default value: If you do not set this parameter, the default value is **3600**.
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    // The ID of the image.
    @NameInMap("ImageId")
    public String imageId;

    // The type of the image URL. Valid values:
    // 
    // *   **oss**: OSS URL
    // *   **cdn** (default): Content Delivery Network (CDN) URL
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
