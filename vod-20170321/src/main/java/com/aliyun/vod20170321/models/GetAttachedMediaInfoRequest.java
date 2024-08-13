// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAttachedMediaInfoRequest extends TeaModel {
    /**
     * <p>The validity period of the URL. Unit: seconds.</p>
     * <ul>
     * <li><p>If you set the OutputType parameter to <strong>cdn</strong>:</p>
     * <ul>
     * <li>The URL of the auxiliary media asset has a validity period only if URL signing is enabled. Otherwise, the URL of the auxiliary media asset is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: If you do not set this parameter, the default validity period that is specified in URL signing is used.</li>
     * </ul>
     * </li>
     * <li><p>If you set the OutputType parameter to <strong>oss</strong>:</p>
     * <ul>
     * <li>The URL of the auxiliary media asset has a validity period only if the permissions on the Object Storage Service (OSS) bucket are private. Otherwise, the URL of the auxiliary media asset is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>The maximum value for a media asset stored in the VOD bucket is <strong>2592000</strong> (30 days) and the maximum value for a media asset stored in an OSS bucket is <strong>129600</strong> (36 hours). The maximum value is limited to reduce security risks of the origin.</li>
     * <li>Default value: If you do not set this parameter, the default value <strong>3600</strong> is used.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The ID of the auxiliary media asset.</p>
     * <ul>
     * <li>Separate multiple IDs with commas (,). You can specify up to 20 IDs.</li>
     * <li>You can obtain the ID from the response to the <a href="~~CreateUploadAttachedMedia~~">CreateUploadAttachedMedia</a> operation that you call to obtain the upload URL and credential.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eb1861d2c9a842340e989dd56****,0222e203cf80f9c22870a4d2c****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The type of the media asset URL. Valid values:</p>
     * <ul>
     * <li><strong>oss</strong></li>
     * <li><strong>cdn</strong> (default)</li>
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
