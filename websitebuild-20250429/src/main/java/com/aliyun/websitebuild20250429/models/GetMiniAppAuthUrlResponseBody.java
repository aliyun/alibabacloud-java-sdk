// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetMiniAppAuthUrlResponseBody extends TeaModel {
    /**
     * <p>The request result.</p>
     */
    @NameInMap("Data")
    public GetMiniAppAuthUrlResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMiniAppAuthUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMiniAppAuthUrlResponseBody self = new GetMiniAppAuthUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMiniAppAuthUrlResponseBody setData(GetMiniAppAuthUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMiniAppAuthUrlResponseBodyData getData() {
        return this.data;
    }

    public GetMiniAppAuthUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMiniAppAuthUrlResponseBodyData extends TeaModel {
        /**
         * <p>The authorization URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://nschiper.oneclick.accounts.logi.com/identity/oauth2/token">https://nschiper.oneclick.accounts.logi.com/identity/oauth2/token</a></p>
         */
        @NameInMap("AuthUrl")
        public String authUrl;

        public static GetMiniAppAuthUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMiniAppAuthUrlResponseBodyData self = new GetMiniAppAuthUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMiniAppAuthUrlResponseBodyData setAuthUrl(String authUrl) {
            this.authUrl = authUrl;
            return this;
        }
        public String getAuthUrl() {
            return this.authUrl;
        }

    }

}
