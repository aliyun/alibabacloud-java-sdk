// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListPartsRequest extends TeaModel {
    @NameInMap("encoding-type")
    public String encodingType;

    @NameInMap("max-parts")
    public Long maxParts;

    @NameInMap("part-number-marker")
    public Long partNumberMarker;

    @NameInMap("uploadId")
    public String uploadId;

    public static ListPartsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPartsRequest self = new ListPartsRequest();
        return TeaModel.build(map, self);
    }

    public ListPartsRequest setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public ListPartsRequest setMaxParts(Long maxParts) {
        this.maxParts = maxParts;
        return this;
    }
    public Long getMaxParts() {
        return this.maxParts;
    }

    public ListPartsRequest setPartNumberMarker(Long partNumberMarker) {
        this.partNumberMarker = partNumberMarker;
        return this;
    }
    public Long getPartNumberMarker() {
        return this.partNumberMarker;
    }

    public ListPartsRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
