// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SyncRCKeyPairResponseBody extends TeaModel {
    @NameInMap("Data")
    public SyncRCKeyPairResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SyncRCKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncRCKeyPairResponseBody self = new SyncRCKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncRCKeyPairResponseBody setData(SyncRCKeyPairResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SyncRCKeyPairResponseBodyData getData() {
        return this.data;
    }

    public SyncRCKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SyncRCKeyPairResponseBodyData extends TeaModel {
        @NameInMap("IsSyncInfo")
        public Boolean isSyncInfo;

        public static SyncRCKeyPairResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyncRCKeyPairResponseBodyData self = new SyncRCKeyPairResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SyncRCKeyPairResponseBodyData setIsSyncInfo(Boolean isSyncInfo) {
            this.isSyncInfo = isSyncInfo;
            return this;
        }
        public Boolean getIsSyncInfo() {
            return this.isSyncInfo;
        }

    }

}
