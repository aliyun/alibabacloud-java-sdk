// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetMiniAppBindingResponseBody extends TeaModel {
    /**
     * <p>Request result.</p>
     */
    @NameInMap("Data")
    public GetMiniAppBindingResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMiniAppBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMiniAppBindingResponseBody self = new GetMiniAppBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMiniAppBindingResponseBody setData(GetMiniAppBindingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMiniAppBindingResponseBodyData getData() {
        return this.data;
    }

    public GetMiniAppBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMiniAppBindingResponseBodyData extends TeaModel {
        /**
         * <p>Authorization status</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AuthStatus")
        public String authStatus;

        /**
         * <p>Business ID</p>
         * 
         * <strong>example:</strong>
         * <p>WS20260206134402000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>ICP filing status</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IcpFiled")
        public Boolean icpFiled;

        /**
         * <p>Miniapp ID</p>
         * 
         * <strong>example:</strong>
         * <p>wx7f122a7d23fdxxxx</p>
         */
        @NameInMap("PlatformAppid")
        public String platformAppid;

        /**
         * <p>Preview QR code</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx">http://xxxx</a></p>
         */
        @NameInMap("PreviewQrCodeUrl")
        public String previewQrCodeUrl;

        /**
         * <p>Production QR code</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx">http://xxxx</a></p>
         */
        @NameInMap("ProductionQrCodeUrl")
        public String productionQrCodeUrl;

        /**
         * <p>Extension information</p>
         */
        @NameInMap("SettingValues")
        public java.util.Map<String, String> settingValues;

        public static GetMiniAppBindingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMiniAppBindingResponseBodyData self = new GetMiniAppBindingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMiniAppBindingResponseBodyData setAuthStatus(String authStatus) {
            this.authStatus = authStatus;
            return this;
        }
        public String getAuthStatus() {
            return this.authStatus;
        }

        public GetMiniAppBindingResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetMiniAppBindingResponseBodyData setIcpFiled(Boolean icpFiled) {
            this.icpFiled = icpFiled;
            return this;
        }
        public Boolean getIcpFiled() {
            return this.icpFiled;
        }

        public GetMiniAppBindingResponseBodyData setPlatformAppid(String platformAppid) {
            this.platformAppid = platformAppid;
            return this;
        }
        public String getPlatformAppid() {
            return this.platformAppid;
        }

        public GetMiniAppBindingResponseBodyData setPreviewQrCodeUrl(String previewQrCodeUrl) {
            this.previewQrCodeUrl = previewQrCodeUrl;
            return this;
        }
        public String getPreviewQrCodeUrl() {
            return this.previewQrCodeUrl;
        }

        public GetMiniAppBindingResponseBodyData setProductionQrCodeUrl(String productionQrCodeUrl) {
            this.productionQrCodeUrl = productionQrCodeUrl;
            return this;
        }
        public String getProductionQrCodeUrl() {
            return this.productionQrCodeUrl;
        }

        public GetMiniAppBindingResponseBodyData setSettingValues(java.util.Map<String, String> settingValues) {
            this.settingValues = settingValues;
            return this;
        }
        public java.util.Map<String, String> getSettingValues() {
            return this.settingValues;
        }

    }

}
