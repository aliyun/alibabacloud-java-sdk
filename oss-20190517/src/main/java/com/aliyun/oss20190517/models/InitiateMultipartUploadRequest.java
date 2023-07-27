// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InitiateMultipartUploadRequest extends TeaModel {
    /**
     * <p>The method used to encode the object name in the response. Only URL encoding is supported. The object name can contain characters encoded in UTF-8. However, the XML 1.0 standard cannot be used to parse specific control characters, such as characters whose ASCII values range from 0 to 10. You can configure the encoding-type parameter to encode object names that include characters that cannot be parsed by XML 1.0 in the response.</p>
     * <p><br>Default value: null</p>
     */
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
