// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfoRequest extends TeaModel {
    /**
     * <p>The expiration time of the image access URL. Unit: seconds.</p>
     * <ul>
     * <li>If OutputType is set to cdn:<ul>
     * <li>The image URL expires only if URL authentication is enabled. Otherwise, the URL is permanently valid.</li>
     * <li>Minimum value: 1.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: If this parameter is not specified, the default validity period configured for URL authentication is used.</li>
     * </ul>
     * </li>
     * <li>If OutputType is set to oss:<ul>
     * <li>The playback URL expires only if the storage permission is set to private. Otherwise, the URL is permanently valid.</li>
     * <li>Minimum value: 1.</li>
     * <li>Maximum value: To reduce security risks of the origin server, the maximum value is <strong>2592000</strong> (30 days) if the image is stored in an ApsaraVideo VOD bucket, and <strong>129600</strong> (36 hours) if the image is stored in a custom OSS bucket.</li>
     * <li>Default value: If this parameter is not specified, the value is 3600.</li>
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
     * <p>The image ID. You can obtain the image ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com/">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Images</strong> to view the ID.</li>
     * <li>Call the <a href="~~CreateUploadImage~~">CreateUploadImage</a> operation to obtain the upload URL and credential. The image ID is returned in the response.</li>
     * <li>Call the <a href="~~SearchMedia~~">SearchMedia</a> operation to query images. The image ID is returned in the response.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e34733b40b9a96ccf5c1ff6f69****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The type of the output image access URL. Valid values:</p>
     * <ul>
     * <li>oss: the back-to-origin URL.</li>
     * <li>cdn: the accelerated URL. This is the default value.</li>
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
