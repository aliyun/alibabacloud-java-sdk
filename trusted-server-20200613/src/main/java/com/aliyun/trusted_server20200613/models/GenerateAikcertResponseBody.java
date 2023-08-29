// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class GenerateAikcertResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public GenerateAikcertResponseBodyData data;

    public static GenerateAikcertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAikcertResponseBody self = new GenerateAikcertResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAikcertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateAikcertResponseBody setData(GenerateAikcertResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateAikcertResponseBodyData getData() {
        return this.data;
    }

    public static class GenerateAikcertResponseBodyData extends TeaModel {
        @NameInMap("dataCredentialBlob")
        public String dataCredentialBlob;

        @NameInMap("keyCredentialBlob")
        public String keyCredentialBlob;

        public static GenerateAikcertResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateAikcertResponseBodyData self = new GenerateAikcertResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateAikcertResponseBodyData setDataCredentialBlob(String dataCredentialBlob) {
            this.dataCredentialBlob = dataCredentialBlob;
            return this;
        }
        public String getDataCredentialBlob() {
            return this.dataCredentialBlob;
        }

        public GenerateAikcertResponseBodyData setKeyCredentialBlob(String keyCredentialBlob) {
            this.keyCredentialBlob = keyCredentialBlob;
            return this;
        }
        public String getKeyCredentialBlob() {
            return this.keyCredentialBlob;
        }

    }

}
