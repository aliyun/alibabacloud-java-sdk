// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RefreshImportMetaResponseBody extends TeaModel {
    @NameInMap("Data")
    public RefreshImportMetaResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AE4F6C34-065F-45AA-B5DC-4B8D816F6305</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RefreshImportMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshImportMetaResponseBody self = new RefreshImportMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshImportMetaResponseBody setData(RefreshImportMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefreshImportMetaResponseBodyData getData() {
        return this.data;
    }

    public RefreshImportMetaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefreshImportMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshImportMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RefreshImportMetaResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        @NameInMap("SlinkTaskId")
        public String slinkTaskId;

        public static RefreshImportMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefreshImportMetaResponseBodyData self = new RefreshImportMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefreshImportMetaResponseBodyData setSlinkTaskId(String slinkTaskId) {
            this.slinkTaskId = slinkTaskId;
            return this;
        }
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

    }

}
