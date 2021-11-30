// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListMultipartUploadsRequest extends TeaModel {
    @NameInMap("delimiter")
    public String delimiter;

    @NameInMap("encoding-type")
    public String encodingType;

    @NameInMap("key-marker")
    public String keyMarker;

    @NameInMap("max-uploads")
    public String maxUploads;

    @NameInMap("prefix")
    public String prefix;

    @NameInMap("upload-id-marker")
    public String uploadIdMarker;

    public static ListMultipartUploadsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultipartUploadsRequest self = new ListMultipartUploadsRequest();
        return TeaModel.build(map, self);
    }

    public ListMultipartUploadsRequest setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public ListMultipartUploadsRequest setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public ListMultipartUploadsRequest setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
        return this;
    }
    public String getKeyMarker() {
        return this.keyMarker;
    }

    public ListMultipartUploadsRequest setMaxUploads(String maxUploads) {
        this.maxUploads = maxUploads;
        return this;
    }
    public String getMaxUploads() {
        return this.maxUploads;
    }

    public ListMultipartUploadsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListMultipartUploadsRequest setUploadIdMarker(String uploadIdMarker) {
        this.uploadIdMarker = uploadIdMarker;
        return this;
    }
    public String getUploadIdMarker() {
        return this.uploadIdMarker;
    }

}
