// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadLinkeLinktAttachmentRequest extends TeaModel {
    @NameInMap("Filename")
    public String filename;

    @NameInMap("StoredFilename")
    public String storedFilename;

    @NameInMap("TargetResource")
    public String targetResource;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("Url")
    public String url;

    public static UploadLinkeLinktAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadLinkeLinktAttachmentRequest self = new UploadLinkeLinktAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public UploadLinkeLinktAttachmentRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public UploadLinkeLinktAttachmentRequest setStoredFilename(String storedFilename) {
        this.storedFilename = storedFilename;
        return this;
    }
    public String getStoredFilename() {
        return this.storedFilename;
    }

    public UploadLinkeLinktAttachmentRequest setTargetResource(String targetResource) {
        this.targetResource = targetResource;
        return this;
    }
    public String getTargetResource() {
        return this.targetResource;
    }

    public UploadLinkeLinktAttachmentRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public UploadLinkeLinktAttachmentRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
