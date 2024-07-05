// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAttachedMediaInfoRequest extends TeaModel {
    /**
     * <p>The validity period of the URL of the auxiliary media asset. Unit: seconds.</p>
     * <blockquote>
     * <ul>
     * <li>If the OutputType parameter is set to <strong>cdn</strong>:<ul>
     * <li>The URL of the auxiliary media asset has a validity period only if URL signing is enabled. Otherwise, the URL of the auxiliary media asset is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: If you do not set this parameter, the default validity period that is specified in URL signing is used.</li>
     * </ul>
     * </li>
     * <li>If the OutputType parameter is set to <strong>oss</strong>:<ul>
     * <li>The URL of the auxiliary media asset has a validity period only if the permissions on the Object Storage Service (OSS) bucket are private. Otherwise, the URL of the auxiliary media asset is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: <strong>2592000</strong> (30 days). The maximum value is limited to reduce security risks of the origin.</li>
     * <li>Default value: If you do not set this parameter, the default value is <strong>3600</strong>.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The ID of the auxiliary media asset. Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eb1861d2c9a842340e989dd56****,0222e203cf80f9c22870a4d2c****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The type of the URL of the auxiliary media asset. Valid values:</p>
     * <ul>
     * <li><strong>oss</strong>: OSS URL</li>
     * <li><strong>cdn</strong> (default): Content Delivery Network (CDN) URL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
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
