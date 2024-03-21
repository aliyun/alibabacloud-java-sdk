// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SubmitSupplementRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("SupplementId")
    public Long supplementId;

    @NameInMap("UserFiles")
    public java.util.Map<String, ?> userFiles;

    public static SubmitSupplementRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSupplementRequest self = new SubmitSupplementRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSupplementRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SubmitSupplementRequest setSupplementId(Long supplementId) {
        this.supplementId = supplementId;
        return this;
    }
    public Long getSupplementId() {
        return this.supplementId;
    }

    public SubmitSupplementRequest setUserFiles(java.util.Map<String, ?> userFiles) {
        this.userFiles = userFiles;
        return this;
    }
    public java.util.Map<String, ?> getUserFiles() {
        return this.userFiles;
    }

}
