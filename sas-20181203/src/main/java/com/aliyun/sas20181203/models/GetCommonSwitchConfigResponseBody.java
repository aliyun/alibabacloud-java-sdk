// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCommonSwitchConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetCommonSwitchConfigResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCommonSwitchConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCommonSwitchConfigResponseBody self = new GetCommonSwitchConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCommonSwitchConfigResponseBody setData(GetCommonSwitchConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCommonSwitchConfigResponseBodyData getData() {
        return this.data;
    }

    public GetCommonSwitchConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCommonSwitchConfigResponseBodyData extends TeaModel {
        @NameInMap("TargetDefault")
        public String targetDefault;

        @NameInMap("TargetSyncStatus")
        public String targetSyncStatus;

        public static GetCommonSwitchConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCommonSwitchConfigResponseBodyData self = new GetCommonSwitchConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCommonSwitchConfigResponseBodyData setTargetDefault(String targetDefault) {
            this.targetDefault = targetDefault;
            return this;
        }
        public String getTargetDefault() {
            return this.targetDefault;
        }

        public GetCommonSwitchConfigResponseBodyData setTargetSyncStatus(String targetSyncStatus) {
            this.targetSyncStatus = targetSyncStatus;
            return this;
        }
        public String getTargetSyncStatus() {
            return this.targetSyncStatus;
        }

    }

}
