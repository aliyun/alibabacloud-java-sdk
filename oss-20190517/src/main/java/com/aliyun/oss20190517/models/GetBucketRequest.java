// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketRequest extends TeaModel {
    @NameInMap("delimiter")
    public String delimiter;

    @NameInMap("encoding-type")
    public String encodingType;

    @NameInMap("marker")
    public String marker;

    @NameInMap("max-keys")
    public Long maxKeys;

    @NameInMap("prefix")
    public String prefix;

    public static GetBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBucketRequest self = new GetBucketRequest();
        return TeaModel.build(map, self);
    }

    public GetBucketRequest setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public GetBucketRequest setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public GetBucketRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public GetBucketRequest setMaxKeys(Long maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    public GetBucketRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
