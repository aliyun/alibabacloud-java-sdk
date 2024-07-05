// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMezzanineInfoRequest extends TeaModel {
    /**
     * <p>The type of additional information. Separate multiple values with commas (,). By default, only the basic information is returned. Valid values:</p>
     * <ul>
     * <li><strong>video</strong>: video stream information</li>
     * <li><strong>audio</strong>: audio stream information</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("AdditionType")
    public String additionType;

    /**
     * <p>The validity period of the mezzanine file URL. Unit: seconds. Default value: <strong>1800</strong>. Minimum value: <strong>1</strong>.</p>
     * <ul>
     * <li><p>If the OutputType parameter is set to <strong>cdn</strong>:</p>
     * <ul>
     * <li>The mezzanine file URL has a validity period only if URL signing is enabled. Otherwise, the mezzanine file URL is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum Value: unlimited.</li>
     * <li>Default value: If you do not set this parameter, the default validity period that is specified in URL signing is used.</li>
     * </ul>
     * </li>
     * </ul>
     * <!---->
     * 
     * <ul>
     * <li><p>If the OutputType parameter is set to <strong>oss</strong>:</p>
     * <ul>
     * <li>The mezzanine file URL has a validity period only if the permissions on the Object Storage Service (OSS) bucket are private. Otherwise, the mezzanine file URL is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: <strong>2592000</strong> (30 days). The maximum value is limited to reduce security risks of the origin.</li>
     * <li>Default value: If you do not set this parameter, the default value is <strong>3600</strong>.</li>
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
     * <p>The type of the mezzanine file URL. Valid values:</p>
     * <ul>
     * <li><strong>oss</strong>: OSS URL</li>
     * <li><strong>cdn</strong> (default): Content Delivery Network (CDN) URL</li>
     * </ul>
     * <blockquote>
     * <p>If the mezzanine file is stored in a bucket of the in type, only an OSS URL is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>The ID of the video.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1f1a6fc03ca04814031b8a6559e****</p>
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
