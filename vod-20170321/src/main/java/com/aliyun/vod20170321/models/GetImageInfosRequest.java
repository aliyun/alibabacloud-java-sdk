// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfosRequest extends TeaModel {
    /**
     * <p>The time when the image URL expires. Unit: seconds.</p>
     * <ul>
     * <li><p>If the OutputType parameter is set to cdn:</p>
     * <ul>
     * <li>This parameter takes effect only if URL authentication is enabled. Otherwise, the image URL does not expire.</li>
     * <li>Minimum value: 1.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: The default validity period that is specified in URL authentication is used.</li>
     * </ul>
     * </li>
     * <li><p>If the OutputType parameter is set to oss:</p>
     * <ul>
     * <li>This parameter takes effect only when the ACL of the Object Storage Service (OSS) bucket is private. Otherwise, the image URL does not expire.</li>
     * <li>Minimum value: 1.</li>
     * <li>Maximum value: 2592000 (30 days). This limit is imposed to reduce security risks of the origin server.</li>
     * <li>Default value: 3600.</li>
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
     * <p>The image IDs. Separate multiple IDs with commas (,). You can specify a maximum of 20 image IDs. You can use one of the following methods to obtain the image ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com/">ApsaraVideo VOD console</a> and choose Media Files &gt; Images in the left-side navigation pane. This method is applicable to images that are uploaded by using the ApsaraVideo VOD console.</li>
     * <li>Obtain the value of ImageId from the response to the <a href="https://help.aliyun.com/document_detail/436544.html">CreateUploadImage</a> operation that you call to obtain the upload URL and credential.</li>
     * <li>Obtain the value of ImageId from the response to the <a href="https://help.aliyun.com/document_detail/436559.html">SearchMedia</a> operation after you upload images.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bbc65bba53fed90de118a7849****,594228cdd14b4d069fc17a8c4a****</p>
     */
    @NameInMap("ImageIds")
    public String imageIds;

    /**
     * <p>The type of the output image URL. Valid values:</p>
     * <ul>
     * <li>oss: OSS URL</li>
     * <li>cdn: CDN URL</li>
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
