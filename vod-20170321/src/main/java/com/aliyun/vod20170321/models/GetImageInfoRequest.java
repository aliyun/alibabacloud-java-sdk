// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfoRequest extends TeaModel {
    /**
     * <p>The validity period of the image URL. Unit: seconds.</p>
     * <blockquote>
     * <ul>
     * <li>If the OutputType parameter is set to <strong>cdn</strong>:<ul>
     * <li>The image URL has a validity period only if URL signing is enabled. Otherwise, the image URL is permanently valid.</li>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: If you do not set this parameter, the default validity period that is specified in URL signing is used.</li>
     * </ul>
     * </li>
     * <li>If the OutputType parameter is set to <strong>oss</strong>:<ul>
     * <li>The image URL has a validity period only if the permissions on the Object Storage Service (OSS) bucket are private. Otherwise, the image URL is permanently valid.</li>
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
     * <p>The ID of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e34733b40b9a96ccf5c1ff6f69****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The type of the image URL. Valid values:</p>
     * <ul>
     * <li><strong>oss</strong>: OSS URL</li>
     * <li><strong>cdn</strong> (default): Content Delivery Network (CDN) URL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn</p>
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
