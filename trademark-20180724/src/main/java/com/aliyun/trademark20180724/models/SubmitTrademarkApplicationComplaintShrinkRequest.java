// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SubmitTrademarkApplicationComplaintShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Files")
    public String filesShrink;

    @NameInMap("Content")
    public String content;

    public static SubmitTrademarkApplicationComplaintShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTrademarkApplicationComplaintShrinkRequest self = new SubmitTrademarkApplicationComplaintShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTrademarkApplicationComplaintShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SubmitTrademarkApplicationComplaintShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public SubmitTrademarkApplicationComplaintShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
