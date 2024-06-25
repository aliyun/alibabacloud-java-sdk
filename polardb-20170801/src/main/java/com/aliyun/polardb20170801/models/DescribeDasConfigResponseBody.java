// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDasConfigResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>593AE1C5-B70C-463F-9207-074639******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("StorageUpperBound")
    public Long storageUpperBound;

    public static DescribeDasConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDasConfigResponseBody self = new DescribeDasConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDasConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDasConfigResponseBody setStorageAutoScale(String storageAutoScale) {
        this.storageAutoScale = storageAutoScale;
        return this;
    }
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    public DescribeDasConfigResponseBody setStorageUpperBound(Long storageUpperBound) {
        this.storageUpperBound = storageUpperBound;
        return this;
    }
    public Long getStorageUpperBound() {
        return this.storageUpperBound;
    }

}
