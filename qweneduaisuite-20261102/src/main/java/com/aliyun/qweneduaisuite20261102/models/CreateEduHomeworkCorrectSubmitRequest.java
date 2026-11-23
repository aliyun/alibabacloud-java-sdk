// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class CreateEduHomeworkCorrectSubmitRequest extends TeaModel {
    /**
     * <p>Specifies whether to correct the image distortion. Default value: <code>true</code>. If you set this parameter to <code>false</code>, the image is not corrected, <code>dewarp_url</code> returns the original image, and the coordinates are based on <code>dewarp_url</code>.</p>
     */
    @NameInMap("dewarp")
    public Boolean dewarp;

    /**
     * <p>The pure Base64-encoded string of the image, excluding the <code>data:</code> prefix and MIME declaration. The encoded size cannot exceed 15 MB. If both parameters are specified, <code>image_base64</code> takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>The pure Base64-encoded string of the image, excluding the data: prefix and MIME declaration. The encoded size cannot exceed 15 MB. If both parameters are specified, image_base64 takes precedence</p>
     */
    @NameInMap("imageBase64")
    public String imageBase64;

    /**
     * <p>The publicly accessible HTTP or HTTPS URL of the image. The server downloads the image from this URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/homework.jpg">https://example.com/homework.jpg</a></p>
     */
    @NameInMap("imageUrl")
    public String imageUrl;

    /**
     * <p>The request ID on the caller side. Use a UUID for reconciliation and troubleshooting. If this parameter is not specified, the server generates a request ID and returns it in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>req-20261116-0001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateEduHomeworkCorrectSubmitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEduHomeworkCorrectSubmitRequest self = new CreateEduHomeworkCorrectSubmitRequest();
        return TeaModel.build(map, self);
    }

    public CreateEduHomeworkCorrectSubmitRequest setDewarp(Boolean dewarp) {
        this.dewarp = dewarp;
        return this;
    }
    public Boolean getDewarp() {
        return this.dewarp;
    }

    public CreateEduHomeworkCorrectSubmitRequest setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }
    public String getImageBase64() {
        return this.imageBase64;
    }

    public CreateEduHomeworkCorrectSubmitRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateEduHomeworkCorrectSubmitRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
