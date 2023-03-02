// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAttachedMediaInfoRequest extends TeaModel {
    /**
     * <p>The validity period of the URL of the auxiliary media asset. Unit: seconds.</p>
     * <p>> *   If the OutputType parameter is set to **cdn**:</p>
     * <p>>     *   The URL of the auxiliary media asset has a validity period only if URL signing is enabled. Otherwise, the URL of the auxiliary media asset is permanently valid.</p>
     * <p>>     *   Minimum value: **1**.</p>
     * <p>>     *   Maximum value: unlimited.</p>
     * <p>>     *   Default value: If you do not set this parameter, the default validity period that is specified in URL signing is used.</p>
     * <p>> *   If the OutputType parameter is set to **oss**:</p>
     * <p>>     *   The URL of the auxiliary media asset has a validity period only if the permissions on the Object Storage Service (OSS) bucket are private. Otherwise, the URL of the auxiliary media asset is permanently valid.</p>
     * <p>>     *   Minimum value: **1**.</p>
     * <p>>     *   Maximum value: **2592000** (30 days). The maximum value is limited to reduce security risks of the origin.</p>
     * <p>>     *   Default value: If you do not set this parameter, the default value is **3600**.</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The ID of the auxiliary media asset. Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified.</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The type of the URL of the auxiliary media asset. Valid values:</p>
     * <p>*   **oss**: OSS URL</p>
     * <p>*   **cdn** (default): Content Delivery Network (CDN) URL</p>
     */
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
