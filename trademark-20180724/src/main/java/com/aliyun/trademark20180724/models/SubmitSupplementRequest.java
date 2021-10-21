// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SubmitSupplementRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("UploadOssKeyList")
    public java.util.Map<String, ?> uploadOssKeyList;

    @NameInMap("Content")
    public String content;

    public static SubmitSupplementRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSupplementRequest self = new SubmitSupplementRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSupplementRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SubmitSupplementRequest setUploadOssKeyList(java.util.Map<String, ?> uploadOssKeyList) {
        this.uploadOssKeyList = uploadOssKeyList;
        return this;
    }
    public java.util.Map<String, ?> getUploadOssKeyList() {
        return this.uploadOssKeyList;
    }

    public SubmitSupplementRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
