// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfosRequest extends TeaModel {
    /**
     * <p>The validity period of the image access URL. Unit: seconds.</p>
     * <ul>
     * <li>If OutputType is set to cdn:<ul>
     * <li>The image URL expires only if URL signing is enabled. Otherwise, the URL is permanently valid.</li>
     * <li>Minimum value: 1.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: If this parameter is not specified, the default validity period specified in URL signing is used.</li>
     * </ul>
     * </li>
     * <li>If OutputType is set to oss:<ul>
     * <li>The image URL expires only if the storage permission is set to private. Otherwise, the URL is permanently valid.</li>
     * <li>Minimum value: 1.</li>
     * <li>Maximum value: To reduce security risks to the origin server, the maximum value is <strong>2592000</strong> (30 days) if the image is stored in a bucket managed by ApsaraVideo VOD, and <strong>129600</strong> (36 hours) if the image is stored in your own OSS bucket.</li>
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
     * <p>The list of image IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs are supported. You can obtain image IDs by using the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com/">ApsaraVideo VOD console</a> and choose <strong>Media Files &gt; Images</strong> to view the IDs.</li>
     * <li>Obtain the IDs from the response when you call <a href="~~CreateUploadImage~~">CreateUploadImage</a> to obtain the upload URL and credential.</li>
     * <li>Obtain the IDs from the response when you call <a href="~~SearchMedia~~">SearchMedia</a> to query images.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bbc65bba53fed90de118a7849****,594228cdd14b4d069fc17a8c4a****</p>
     */
    @NameInMap("ImageIds")
    public String imageIds;

    /**
     * <p>The type of the image access URL to return. Valid values:</p>
     * <ul>
     * <li>oss: the storage address.</li>
     * <li>cdn (default): the CDN-accelerated URL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    public static GetImageInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageInfosRequest self = new GetImageInfosRequest();
        return TeaModel.build(map, self);
    }

    public GetImageInfosRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public GetImageInfosRequest setImageIds(String imageIds) {
        this.imageIds = imageIds;
        return this;
    }
    public String getImageIds() {
        return this.imageIds;
    }

    public GetImageInfosRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

}
