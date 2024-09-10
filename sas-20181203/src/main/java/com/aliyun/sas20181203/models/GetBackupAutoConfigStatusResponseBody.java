// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetBackupAutoConfigStatusResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetBackupAutoConfigStatusResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>898F7AA7-CECD-5EC7-AF4D-664C601B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetBackupAutoConfigStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBackupAutoConfigStatusResponseBody self = new GetBackupAutoConfigStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBackupAutoConfigStatusResponseBody setData(GetBackupAutoConfigStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBackupAutoConfigStatusResponseBodyData getData() {
        return this.data;
    }

    public GetBackupAutoConfigStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBackupAutoConfigStatusResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the anti-ransomware policy for servers can be automatically configured by the managed anti-ransomware feature. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanConfigAuto")
        public Boolean canConfigAuto;

        public static GetBackupAutoConfigStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBackupAutoConfigStatusResponseBodyData self = new GetBackupAutoConfigStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBackupAutoConfigStatusResponseBodyData setCanConfigAuto(Boolean canConfigAuto) {
            this.canConfigAuto = canConfigAuto;
            return this;
        }
        public Boolean getCanConfigAuto() {
            return this.canConfigAuto;
        }

    }

}
