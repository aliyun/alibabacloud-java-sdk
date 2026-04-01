// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SyncRCKeyPairResponseBody extends TeaModel {
    /**
     * <p>The details of the result.</p>
     */
    @NameInMap("Data")
    public SyncRCKeyPairResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>60478CCB-95EA-5D06-8A51-CAC83A316E9A</p>
     */
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
        /**
         * <p>Indicates whether the synchronization succeeded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
