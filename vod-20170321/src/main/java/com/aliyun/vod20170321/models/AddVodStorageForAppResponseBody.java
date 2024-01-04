// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodStorageForAppResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The address of the VOD bucket.</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    public static AddVodStorageForAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVodStorageForAppResponseBody self = new AddVodStorageForAppResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVodStorageForAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddVodStorageForAppResponseBody setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

}
