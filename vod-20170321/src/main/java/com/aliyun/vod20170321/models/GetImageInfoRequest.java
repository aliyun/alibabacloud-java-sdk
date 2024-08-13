// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfoRequest extends TeaModel {
    /**
     * <p>The time when the image URL expires. Unit: seconds.</p>
     * <ul>
     * <li><p>If you set OutputType to cdn:</p>
     * <ul>
     * <li>This parameter takes effect only if URL authentication is enabled. Otherwise, the image URL does not expire.</li>
     * <li>Minimum value: 1.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: If you leave this parameter empty, the default validity period that is specified in URL signing is used.</li>
     * </ul>
     * </li>
     * <li><p>If you set OutputType to oss:</p>
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
     * <p>The ID of the image. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com/">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose Media Files &gt; Image. On the Image page, view the image ID.</li>
     * <li>Obtain the image ID from the response to the <a href="~~CreateUploadImage~~">CreateUploadImage</a> operation that you call to obtain the upload URL and credential.</li>
     * <li>Obtain the image ID from the response to the <a href="~~SearchMedia~~">SearchMedia</a> operation that you call to query the image.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e34733b40b9a96ccf5c1ff6f69****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

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
