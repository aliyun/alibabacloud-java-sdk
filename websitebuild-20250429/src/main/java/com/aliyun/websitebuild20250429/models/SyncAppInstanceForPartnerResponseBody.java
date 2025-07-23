// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SyncAppInstanceForPartnerResponseBody extends TeaModel {
    @NameInMap("Data")
    public SyncAppInstanceForPartnerResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SyncAppInstanceForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncAppInstanceForPartnerResponseBody self = new SyncAppInstanceForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncAppInstanceForPartnerResponseBody setData(SyncAppInstanceForPartnerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SyncAppInstanceForPartnerResponseBodyData getData() {
        return this.data;
    }

    public SyncAppInstanceForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SyncAppInstanceForPartnerResponseBodyDataAppInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>WD20250626114752000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        public static SyncAppInstanceForPartnerResponseBodyDataAppInstance build(java.util.Map<String, ?> map) throws Exception {
            SyncAppInstanceForPartnerResponseBodyDataAppInstance self = new SyncAppInstanceForPartnerResponseBodyDataAppInstance();
            return TeaModel.build(map, self);
        }

        public SyncAppInstanceForPartnerResponseBodyDataAppInstance setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

    public static class SyncAppInstanceForPartnerResponseBodyData extends TeaModel {
        @NameInMap("AppInstance")
        public SyncAppInstanceForPartnerResponseBodyDataAppInstance appInstance;

        public static SyncAppInstanceForPartnerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyncAppInstanceForPartnerResponseBodyData self = new SyncAppInstanceForPartnerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SyncAppInstanceForPartnerResponseBodyData setAppInstance(SyncAppInstanceForPartnerResponseBodyDataAppInstance appInstance) {
            this.appInstance = appInstance;
            return this;
        }
        public SyncAppInstanceForPartnerResponseBodyDataAppInstance getAppInstance() {
            return this.appInstance;
        }

    }

}
