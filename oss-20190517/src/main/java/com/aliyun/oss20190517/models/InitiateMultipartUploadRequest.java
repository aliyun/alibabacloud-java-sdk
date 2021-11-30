// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InitiateMultipartUploadRequest extends TeaModel {
    @NameInMap("encoding-type")
    public String encodingType;

    public static InitiateMultipartUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        InitiateMultipartUploadRequest self = new InitiateMultipartUploadRequest();
        return TeaModel.build(map, self);
    }

    public InitiateMultipartUploadRequest setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

}
