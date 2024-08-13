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
     * <li>If you store the image in the VOD bucket, the maximum value of this parameter is <strong>2592000</strong> (30 days). If you store the image in an OSS bucket, the maximum value of this parameter is <strong>129600</strong> (36 hours). The maximum value is limited to reduce security risks of the origin.</li>
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
     * <p>The image IDs. Separate multiple IDs with commas (,). You can specify up to 20 image IDs. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com/">ApsaraVideo VOD console</a> and choose <strong>Media Files &gt; Images</strong> in the left-side navigation pane.</li>
     * <li>Obtain the value of ImageId from the response to the CreateUploadImage operation that you call to obtain the upload URL and credential.</li>
     * <li>Obtain the value of ImageId from the response to the <a href="~~SearchMedia~~">SearchMedia</a> operation after you upload images.</li>
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
