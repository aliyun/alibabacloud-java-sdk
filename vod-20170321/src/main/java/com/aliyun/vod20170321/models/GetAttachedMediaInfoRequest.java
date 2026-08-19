// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAttachedMediaInfoRequest extends TeaModel {
    /**
     * <p>The validity period of the auxiliary media asset URL. Unit: seconds.</p>
     * <ul>
     * <li>If OutputType is set to <strong>cdn</strong>:<ul>
     * <li>The URL expires only if URL authentication is enabled. Otherwise, the URL is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: If you do not specify this parameter, the default validity period specified in URL authentication is used.</li>
     * </ul>
     * </li>
     * <li>If OutputType is set to <strong>oss</strong>:<ul>
     * <li>The URL expires only if the storage permission is set to private. Otherwise, the URL is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: To reduce security risks to the origin server, the maximum value is <strong>2592000</strong> (30 days) if the auxiliary media asset is stored in a bucket managed by ApsaraVideo VOD, and <strong>129600</strong> (36 hours) if the auxiliary media asset is stored in your own OSS bucket.</li>
     * <li>Default value: If you do not specify this parameter, the value is <strong>3600</strong>.</li>
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
     * <p>The auxiliary media asset IDs.</p>
     * <ul>
     * <li>Separate multiple IDs with commas (,). You can specify up to 20 IDs.</li>
     * <li>The IDs are returned after you call the <a href="~~CreateUploadAttachedMedia~~">CreateUploadAttachedMedia</a> operation to obtain the upload URL and credential for the auxiliary media asset.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eb1861d2c9a842340e989dd56****,0222e203cf80f9c22870a4d2c****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The type of the output URL. Valid values:</p>
     * <ul>
     * <li><strong>oss</strong>: the back-to-origin URL.</li>
     * <li><strong>cdn</strong> (default): the CDN-accelerated URL.</li>
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
