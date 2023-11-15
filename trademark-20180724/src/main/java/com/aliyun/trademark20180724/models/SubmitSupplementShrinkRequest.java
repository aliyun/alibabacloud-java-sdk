// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SubmitSupplementShrinkRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Id")
    public Long id;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("UploadOssKeyList")
    public String uploadOssKeyListShrink;

    public static SubmitSupplementShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSupplementShrinkRequest self = new SubmitSupplementShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSupplementShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SubmitSupplementShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SubmitSupplementShrinkRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public SubmitSupplementShrinkRequest setUploadOssKeyListShrink(String uploadOssKeyListShrink) {
        this.uploadOssKeyListShrink = uploadOssKeyListShrink;
        return this;
    }
    public String getUploadOssKeyListShrink() {
        return this.uploadOssKeyListShrink;
    }

}
