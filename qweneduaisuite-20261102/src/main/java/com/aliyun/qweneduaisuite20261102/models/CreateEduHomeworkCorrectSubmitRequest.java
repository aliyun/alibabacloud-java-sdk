// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class CreateEduHomeworkCorrectSubmitRequest extends TeaModel {
    /**
     * <p>Specifies whether to correct the image distortion.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dewarp")
    public Boolean dewarp;

    /**
     * <p>The Base64-encoded image.</p>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASABIAAD/4QCMRXhpZgAATU0AK...</p>
     */
    @NameInMap("imageBase64")
    public String imageBase64;

    /**
     * <p>The URL of the image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx/xxx.jpg">https://xxx/xxx.jpg</a></p>
     */
    @NameInMap("imageUrl")
    public String imageUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019F593F-D6EE-5F44-819A-6CDA127D1637</p>
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
