// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListObjectsRequest extends TeaModel {
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

    public static ListObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListObjectsRequest self = new ListObjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListObjectsRequest setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public ListObjectsRequest setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public ListObjectsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListObjectsRequest setMaxKeys(Long maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    public ListObjectsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
