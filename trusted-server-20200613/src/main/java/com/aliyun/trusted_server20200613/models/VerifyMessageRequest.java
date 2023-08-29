// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class VerifyMessageRequest extends TeaModel {
    @NameInMap("FileData")
    public String fileData;

    public static VerifyMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyMessageRequest self = new VerifyMessageRequest();
        return TeaModel.build(map, self);
    }

    public VerifyMessageRequest setFileData(String fileData) {
        this.fileData = fileData;
        return this;
    }
    public String getFileData() {
        return this.fileData;
    }

}
