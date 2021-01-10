// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ApplySidecarCertResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ApplySidecarCertResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Success")
    public Boolean success;

    public static ApplySidecarCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplySidecarCertResponseBody self = new ApplySidecarCertResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplySidecarCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplySidecarCertResponseBody setData(ApplySidecarCertResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ApplySidecarCertResponseBodyData getData() {
        return this.data;
    }

    public ApplySidecarCertResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ApplySidecarCertResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplySidecarCertResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplySidecarCertResponseBodyData extends TeaModel {
        @NameInMap("RootCert")
        public String rootCert;

        @NameInMap("CertChain")
        public String certChain;

        public static ApplySidecarCertResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplySidecarCertResponseBodyData self = new ApplySidecarCertResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplySidecarCertResponseBodyData setRootCert(String rootCert) {
            this.rootCert = rootCert;
            return this;
        }
        public String getRootCert() {
            return this.rootCert;
        }

        public ApplySidecarCertResponseBodyData setCertChain(String certChain) {
            this.certChain = certChain;
            return this;
        }
        public String getCertChain() {
            return this.certChain;
        }

    }

}
