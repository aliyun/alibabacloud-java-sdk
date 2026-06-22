// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetBackupAutoConfigStatusResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetBackupAutoConfigStatusResponseBodyData data;

    /**
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request. You can use the ID to troubleshoot issues.</p>
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
         * <p>Indicates whether the managed service supports configuring anti-ransomware backup policies. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Not supported.</li>
         * <li><strong>true</strong>: Supported.</li>
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
