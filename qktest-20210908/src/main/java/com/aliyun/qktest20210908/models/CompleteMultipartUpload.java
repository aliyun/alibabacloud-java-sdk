// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qktest20210908.models;

import com.aliyun.tea.*;

public class CompleteMultipartUpload extends TeaModel {
    // description
    @NameInMap("Part")
    public java.util.List<Part> part;

    public static CompleteMultipartUpload build(java.util.Map<String, ?> map) throws Exception {
        CompleteMultipartUpload self = new CompleteMultipartUpload();
        return TeaModel.build(map, self);
    }

    public CompleteMultipartUpload setPart(java.util.List<Part> part) {
        this.part = part;
        return this;
    }
    public java.util.List<Part> getPart() {
        return this.part;
    }

}
