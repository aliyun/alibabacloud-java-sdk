// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodStorageForAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
