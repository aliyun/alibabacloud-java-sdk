// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_cmp20220303.models;

import com.aliyun.tea.*;

public class UploadNotaryRequest extends TeaModel {
    // A short description of struct
    @NameInMap("content")
    public String content;

    public static UploadNotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadNotaryRequest self = new UploadNotaryRequest();
        return TeaModel.build(map, self);
    }

    public UploadNotaryRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
