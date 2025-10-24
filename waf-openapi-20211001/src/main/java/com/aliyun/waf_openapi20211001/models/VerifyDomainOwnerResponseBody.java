// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class VerifyDomainOwnerResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F35F45B0-5D6B-4238-BE02-A62D****E840</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The verification result.</p>
     */
    @NameInMap("VerifyResult")
    public VerifyDomainOwnerResponseBodyVerifyResult verifyResult;

    public static VerifyDomainOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyDomainOwnerResponseBody self = new VerifyDomainOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyDomainOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyDomainOwnerResponseBody setVerifyResult(VerifyDomainOwnerResponseBodyVerifyResult verifyResult) {
        this.verifyResult = verifyResult;
        return this;
    }
    public VerifyDomainOwnerResponseBodyVerifyResult getVerifyResult() {
        return this.verifyResult;
    }

    public static class VerifyDomainOwnerResponseBodyVerifyResult extends TeaModel {
        /**
         * <p>The reasons why the verification fails. Valid values:</p>
         * <ul>
         * <li>DnsTxtVerifyFailed: The DNS TXT record and the domain name do not match.</li>
         * <li>DnsServerError: The DNS server is abnormal.</li>
         * <li>VerifyFileNotExist: The verification file does not exist.</li>
         * <li>VerifyDomainNotAccess: The access to the domain name failed.</li>
         * <li>FileContentVerifyFailed: The content of the verification file and the domain name do not match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DnsTxtVerifyFailed</p>
         */
        @NameInMap("FailCode")
        public String failCode;

        /**
         * <p>The verification result. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The verification succeeds.</li>
         * <li><strong>false</strong>: The verification fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Result")
        public Boolean result;

        public static VerifyDomainOwnerResponseBodyVerifyResult build(java.util.Map<String, ?> map) throws Exception {
            VerifyDomainOwnerResponseBodyVerifyResult self = new VerifyDomainOwnerResponseBodyVerifyResult();
            return TeaModel.build(map, self);
        }

        public VerifyDomainOwnerResponseBodyVerifyResult setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public VerifyDomainOwnerResponseBodyVerifyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
