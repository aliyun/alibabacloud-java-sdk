// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class VerifyMessageResponseBody extends TeaModel {
    @NameInMap("Data")
    public VerifyMessageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static VerifyMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyMessageResponseBody self = new VerifyMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyMessageResponseBody setData(VerifyMessageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyMessageResponseBodyData getData() {
        return this.data;
    }

    public VerifyMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VerifyMessageResponseBodyDataImaVerificationResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TcbObsolete")
        public java.util.List<String> tcbObsolete;

        @NameInMap("Untrusted")
        public java.util.List<String> untrusted;

        public static VerifyMessageResponseBodyDataImaVerificationResult build(java.util.Map<String, ?> map) throws Exception {
            VerifyMessageResponseBodyDataImaVerificationResult self = new VerifyMessageResponseBodyDataImaVerificationResult();
            return TeaModel.build(map, self);
        }

        public VerifyMessageResponseBodyDataImaVerificationResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public VerifyMessageResponseBodyDataImaVerificationResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public VerifyMessageResponseBodyDataImaVerificationResult setTcbObsolete(java.util.List<String> tcbObsolete) {
            this.tcbObsolete = tcbObsolete;
            return this;
        }
        public java.util.List<String> getTcbObsolete() {
            return this.tcbObsolete;
        }

        public VerifyMessageResponseBodyDataImaVerificationResult setUntrusted(java.util.List<String> untrusted) {
            this.untrusted = untrusted;
            return this;
        }
        public java.util.List<String> getUntrusted() {
            return this.untrusted;
        }

    }

    public static class VerifyMessageResponseBodyDataPcrVerificationResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TcbObsolete")
        public java.util.List<String> tcbObsolete;

        @NameInMap("Untrusted")
        public java.util.List<String> untrusted;

        public static VerifyMessageResponseBodyDataPcrVerificationResult build(java.util.Map<String, ?> map) throws Exception {
            VerifyMessageResponseBodyDataPcrVerificationResult self = new VerifyMessageResponseBodyDataPcrVerificationResult();
            return TeaModel.build(map, self);
        }

        public VerifyMessageResponseBodyDataPcrVerificationResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public VerifyMessageResponseBodyDataPcrVerificationResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public VerifyMessageResponseBodyDataPcrVerificationResult setTcbObsolete(java.util.List<String> tcbObsolete) {
            this.tcbObsolete = tcbObsolete;
            return this;
        }
        public java.util.List<String> getTcbObsolete() {
            return this.tcbObsolete;
        }

        public VerifyMessageResponseBodyDataPcrVerificationResult setUntrusted(java.util.List<String> untrusted) {
            this.untrusted = untrusted;
            return this;
        }
        public java.util.List<String> getUntrusted() {
            return this.untrusted;
        }

    }

    public static class VerifyMessageResponseBodyData extends TeaModel {
        @NameInMap("ImaVerificationResult")
        public VerifyMessageResponseBodyDataImaVerificationResult imaVerificationResult;

        @NameInMap("PcrVerificationResult")
        public VerifyMessageResponseBodyDataPcrVerificationResult pcrVerificationResult;

        public static VerifyMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyMessageResponseBodyData self = new VerifyMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyMessageResponseBodyData setImaVerificationResult(VerifyMessageResponseBodyDataImaVerificationResult imaVerificationResult) {
            this.imaVerificationResult = imaVerificationResult;
            return this;
        }
        public VerifyMessageResponseBodyDataImaVerificationResult getImaVerificationResult() {
            return this.imaVerificationResult;
        }

        public VerifyMessageResponseBodyData setPcrVerificationResult(VerifyMessageResponseBodyDataPcrVerificationResult pcrVerificationResult) {
            this.pcrVerificationResult = pcrVerificationResult;
            return this;
        }
        public VerifyMessageResponseBodyDataPcrVerificationResult getPcrVerificationResult() {
            return this.pcrVerificationResult;
        }

    }

}
