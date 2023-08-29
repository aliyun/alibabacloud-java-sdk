// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class ProduceAikcertResponseBody extends TeaModel {
    @NameInMap("Data")
    public ProduceAikcertResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ProduceAikcertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProduceAikcertResponseBody self = new ProduceAikcertResponseBody();
        return TeaModel.build(map, self);
    }

    public ProduceAikcertResponseBody setData(ProduceAikcertResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ProduceAikcertResponseBodyData getData() {
        return this.data;
    }

    public ProduceAikcertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ProduceAikcertResponseBodyData extends TeaModel {
        @NameInMap("DataCredentialBlob")
        public String dataCredentialBlob;

        @NameInMap("KeyCredentialBlob")
        public String keyCredentialBlob;

        public static ProduceAikcertResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ProduceAikcertResponseBodyData self = new ProduceAikcertResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ProduceAikcertResponseBodyData setDataCredentialBlob(String dataCredentialBlob) {
            this.dataCredentialBlob = dataCredentialBlob;
            return this;
        }
        public String getDataCredentialBlob() {
            return this.dataCredentialBlob;
        }

        public ProduceAikcertResponseBodyData setKeyCredentialBlob(String keyCredentialBlob) {
            this.keyCredentialBlob = keyCredentialBlob;
            return this;
        }
        public String getKeyCredentialBlob() {
            return this.keyCredentialBlob;
        }

    }

}
