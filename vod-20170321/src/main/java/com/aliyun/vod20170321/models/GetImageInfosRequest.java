// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfosRequest extends TeaModel {
    // The time when the image URL expires. Unit: seconds.
    // 
    // *   If the OutputType parameter is set to cdn:
    // 
    //     *   This parameter takes effect only if URL authentication is enabled. Otherwise, the image URL does not expire.
    //     *   Minimum value: 1.
    //     *   Maximum value: unlimited.
    //     *   Default value: The default validity period that is specified in URL authentication is used.
    // 
    // *   If the OutputType parameter is set to oss:
    // 
    //     *   This parameter takes effect only when the ACL of the Object Storage Service (OSS) bucket is private. Otherwise, the image URL does not expire.
    //     *   Minimum value: 1.
    //     *   Maximum value: 2592000 (30 days). This limit is imposed to reduce security risks of the origin server.
    //     *   Default value: 3600.
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    // The image IDs. Separate multiple IDs with commas (,). You can specify a maximum of 20 image IDs. You can use one of the following methods to obtain the image ID:
    // 
    // *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/) and choose Media Files > Images in the left-side navigation pane. This method is applicable to images that are uploaded by using the ApsaraVideo VOD console.
    // *   Obtain the value of ImageId from the response to the [CreateUploadImage](~~436544~~) operation that you call to obtain the upload URL and credential.
    // *   Obtain the value of ImageId from the response to the [SearchMedia](~~436559~~) operation after you upload images.
    @NameInMap("ImageIds")
    public String imageIds;

    // The type of the output image URL. Valid values:
    // 
    // *   oss: OSS URL
    // *   cdn: CDN URL
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
