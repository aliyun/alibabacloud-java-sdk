// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCommonSwitchConfigResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetCommonSwitchConfigResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>Specifies whether to turn on the switch for newly added servers. Valid values:</p>
         * <br>
         * <p>*   **add**: By default, the switch is turned on for newly added servers.</p>
         * <p>*   **del**: By default, the switch is turned off for newly added servers.</p>
         */
        @NameInMap("TargetDefault")
        public String targetDefault;

        /**
         * <p>The status of the synchronization. Valid values:</p>
         * <br>
         * <p>*   **sync**: The modifications are being synchronized.</p>
         * <p>*   **valid**: The modifications has taken effect.</p>
         */
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
