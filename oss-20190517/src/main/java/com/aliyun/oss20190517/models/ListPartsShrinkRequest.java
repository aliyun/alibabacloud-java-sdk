// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListPartsShrinkRequest extends TeaModel {
    @NameInMap("encoding-type")
    public String encodingTypeShrink;

    @NameInMap("max-parts")
    public Long maxParts;

    @NameInMap("part-number-marker")
    public Long partNumberMarker;

    @NameInMap("uploadId")
    public String uploadId;

    public static ListPartsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPartsShrinkRequest self = new ListPartsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPartsShrinkRequest setEncodingTypeShrink(String encodingTypeShrink) {
        this.encodingTypeShrink = encodingTypeShrink;
        return this;
    }
    public String getEncodingTypeShrink() {
        return this.encodingTypeShrink;
    }

    public ListPartsShrinkRequest setMaxParts(Long maxParts) {
        this.maxParts = maxParts;
        return this;
    }
    public Long getMaxParts() {
        return this.maxParts;
    }

    public ListPartsShrinkRequest setPartNumberMarker(Long partNumberMarker) {
        this.partNumberMarker = partNumberMarker;
        return this;
    }
    public Long getPartNumberMarker() {
        return this.partNumberMarker;
    }

    public ListPartsShrinkRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
