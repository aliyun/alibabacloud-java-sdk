// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class GetAlinkAlgoInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAlinkAlgoInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAlinkAlgoInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlinkAlgoInfoResponseBody self = new GetAlinkAlgoInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlinkAlgoInfoResponseBody setData(GetAlinkAlgoInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAlinkAlgoInfoResponseBodyData getData() {
        return this.data;
    }

    public GetAlinkAlgoInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAlinkAlgoInfoResponseBodyData extends TeaModel {
        @NameInMap("AlinkUrl")
        public String alinkUrl;

        @NameInMap("NeedTrans")
        public Boolean needTrans;

        @NameInMap("PublicKeyStr")
        public String publicKeyStr;

        public static GetAlinkAlgoInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAlinkAlgoInfoResponseBodyData self = new GetAlinkAlgoInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAlinkAlgoInfoResponseBodyData setAlinkUrl(String alinkUrl) {
            this.alinkUrl = alinkUrl;
            return this;
        }
        public String getAlinkUrl() {
            return this.alinkUrl;
        }

        public GetAlinkAlgoInfoResponseBodyData setNeedTrans(Boolean needTrans) {
            this.needTrans = needTrans;
            return this;
        }
        public Boolean getNeedTrans() {
            return this.needTrans;
        }

        public GetAlinkAlgoInfoResponseBodyData setPublicKeyStr(String publicKeyStr) {
            this.publicKeyStr = publicKeyStr;
            return this;
        }
        public String getPublicKeyStr() {
            return this.publicKeyStr;
        }

    }

}
