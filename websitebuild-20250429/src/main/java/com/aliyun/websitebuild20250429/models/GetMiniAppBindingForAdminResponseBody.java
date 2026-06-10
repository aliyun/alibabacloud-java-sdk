// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetMiniAppBindingForAdminResponseBody extends TeaModel {
    /**
     * <p>Request result.</p>
     */
    @NameInMap("Data")
    public GetMiniAppBindingForAdminResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMiniAppBindingForAdminResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMiniAppBindingForAdminResponseBody self = new GetMiniAppBindingForAdminResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMiniAppBindingForAdminResponseBody setData(GetMiniAppBindingForAdminResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMiniAppBindingForAdminResponseBodyData getData() {
        return this.data;
    }

    public GetMiniAppBindingForAdminResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMiniAppBindingForAdminResponseBodyData extends TeaModel {
        /**
         * <p>Authorization status</p>
         * 
         * <strong>example:</strong>
         * <p>AUTHORIZED</p>
         */
        @NameInMap("AuthStatus")
        public String authStatus;

        /**
         * <p>Business ID</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250801004817000002</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>Miniapp ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("PlatformAppid")
        public String platformAppid;

        public static GetMiniAppBindingForAdminResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMiniAppBindingForAdminResponseBodyData self = new GetMiniAppBindingForAdminResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMiniAppBindingForAdminResponseBodyData setAuthStatus(String authStatus) {
            this.authStatus = authStatus;
            return this;
        }
        public String getAuthStatus() {
            return this.authStatus;
        }

        public GetMiniAppBindingForAdminResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetMiniAppBindingForAdminResponseBodyData setPlatformAppid(String platformAppid) {
            this.platformAppid = platformAppid;
            return this;
        }
        public String getPlatformAppid() {
            return this.platformAppid;
        }

    }

}
