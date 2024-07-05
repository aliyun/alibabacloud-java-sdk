// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodStorageForAppResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The address of the VOD bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>out-****.oss-cn-shanghai.aliyuncs.com</p>
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
