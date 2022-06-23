// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectUploadUrlRequest extends TeaModel {
    @NameInMap("HashKeyList")
    public java.util.List<String> hashKeyList;

    @NameInMap("Type")
    public Integer type;

    public static CreateFileDetectUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileDetectUploadUrlRequest self = new CreateFileDetectUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileDetectUploadUrlRequest setHashKeyList(java.util.List<String> hashKeyList) {
        this.hashKeyList = hashKeyList;
        return this;
    }
    public java.util.List<String> getHashKeyList() {
        return this.hashKeyList;
    }

    public CreateFileDetectUploadUrlRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
