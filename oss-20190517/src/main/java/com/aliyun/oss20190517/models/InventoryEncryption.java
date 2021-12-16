// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InventoryEncryption extends TeaModel {
    // The container that stores the CMK used in the SSE-KMS encryption method
    @NameInMap("SSE-KMS")
    public SSEKMS SSEKMS;

    // The container that stores the information about the SSE-OSS encryption method
    @NameInMap("SSE-OSS")
    public SSEOSS SSEOSS;

    public static InventoryEncryption build(java.util.Map<String, ?> map) throws Exception {
        InventoryEncryption self = new InventoryEncryption();
        return TeaModel.build(map, self);
    }

    public InventoryEncryption setSSEKMS(SSEKMS SSEKMS) {
        this.SSEKMS = SSEKMS;
        return this;
    }
    public SSEKMS getSSEKMS() {
        return this.SSEKMS;
    }

    public InventoryEncryption setSSEOSS(SSEOSS SSEOSS) {
        this.SSEOSS = SSEOSS;
        return this;
    }
    public SSEOSS getSSEOSS() {
        return this.SSEOSS;
    }

}
