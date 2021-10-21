// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SubmitTrademarkApplicationComplaintRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Files")
    public java.util.Map<String, ?> files;

    @NameInMap("Content")
    public String content;

    public static SubmitTrademarkApplicationComplaintRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTrademarkApplicationComplaintRequest self = new SubmitTrademarkApplicationComplaintRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTrademarkApplicationComplaintRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SubmitTrademarkApplicationComplaintRequest setFiles(java.util.Map<String, ?> files) {
        this.files = files;
        return this;
    }
    public java.util.Map<String, ?> getFiles() {
        return this.files;
    }

    public SubmitTrademarkApplicationComplaintRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
