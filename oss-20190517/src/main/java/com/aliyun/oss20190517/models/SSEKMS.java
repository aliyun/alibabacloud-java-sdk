// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class SSEKMS extends TeaModel {
    // The CMK used in the SSE-KMS encryption method
    @NameInMap("KeyId")
    public String keyId;

    public static SSEKMS build(java.util.Map<String, ?> map) throws Exception {
        SSEKMS self = new SSEKMS();
        return TeaModel.build(map, self);
    }

    public SSEKMS setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
