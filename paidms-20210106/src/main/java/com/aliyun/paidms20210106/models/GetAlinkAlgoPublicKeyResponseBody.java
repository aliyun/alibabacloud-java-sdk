// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class GetAlinkAlgoPublicKeyResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAlinkAlgoPublicKeyResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAlinkAlgoPublicKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlinkAlgoPublicKeyResponseBody self = new GetAlinkAlgoPublicKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlinkAlgoPublicKeyResponseBody setData(GetAlinkAlgoPublicKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAlinkAlgoPublicKeyResponseBodyData getData() {
        return this.data;
    }

    public GetAlinkAlgoPublicKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAlinkAlgoPublicKeyResponseBodyData extends TeaModel {
        @NameInMap("AlinkUrl")
        public String alinkUrl;

        @NameInMap("PublicKeyStr")
        public String publicKeyStr;

        public static GetAlinkAlgoPublicKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAlinkAlgoPublicKeyResponseBodyData self = new GetAlinkAlgoPublicKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAlinkAlgoPublicKeyResponseBodyData setAlinkUrl(String alinkUrl) {
            this.alinkUrl = alinkUrl;
            return this;
        }
        public String getAlinkUrl() {
            return this.alinkUrl;
        }

        public GetAlinkAlgoPublicKeyResponseBodyData setPublicKeyStr(String publicKeyStr) {
            this.publicKeyStr = publicKeyStr;
            return this;
        }
        public String getPublicKeyStr() {
            return this.publicKeyStr;
        }

    }

}
