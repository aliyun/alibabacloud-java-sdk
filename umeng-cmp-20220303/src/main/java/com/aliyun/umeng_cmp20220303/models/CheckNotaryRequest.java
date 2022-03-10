// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_cmp20220303.models;

import com.aliyun.tea.*;

public class CheckNotaryRequest extends TeaModel {
    // A short description of struct
    @NameInMap("content")
    public String content;

    @NameInMap("txHash")
    public String txHash;

    public static CheckNotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckNotaryRequest self = new CheckNotaryRequest();
        return TeaModel.build(map, self);
    }

    public CheckNotaryRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CheckNotaryRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
