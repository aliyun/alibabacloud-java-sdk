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
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413****</p>
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
         * <ul>
         * <li><strong>add</strong>: By default, the switch is turned on for newly added servers.</li>
         * <li><strong>del</strong>: By default, the switch is turned off for newly added servers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("TargetDefault")
        public String targetDefault;

        /**
         * <p>The status of the synchronization. Valid values:</p>
         * <ul>
         * <li><strong>sync</strong>: The modifications are being synchronized.</li>
         * <li><strong>valid</strong>: The modifications has taken effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>valid</p>
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
