// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261116.models;

import com.aliyun.tea.*;

public class MedicalModelInferenceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The business AccessKey ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-ak-87019a070b49c9fc</p>
     */
    @NameInMap("X-GW-Access")
    public String xGWAccess;

    /**
     * <p>The random string for the current request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b46a9f08-fe98-4dd3-8885-405c4d032e02</p>
     */
    @NameInMap("X-GW-Nonce")
    public String xGWNonce;

    /**
     * <p>The format of the request and response fields.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-roa</p>
     */
    @NameInMap("X-GW-Protocol")
    public String xGWProtocol;

    /**
     * <p>The business request signature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>234ad5ad03406bc34b605b3d59746563420d58cb4cdcd2979b677790551a7278</p>
     */
    @NameInMap("X-GW-Signature")
    public String xGWSignature;

    /**
     * <p>The request timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1794996000000</p>
     */
    @NameInMap("X-GW-Timestamp")
    public String xGWTimestamp;

    /**
     * <p>The business request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>med-req-001</p>
     */
    @NameInMap("X-Request-Id")
    public String xRequestId;

    public static MedicalModelInferenceHeaders build(java.util.Map<String, ?> map) throws Exception {
        MedicalModelInferenceHeaders self = new MedicalModelInferenceHeaders();
        return TeaModel.build(map, self);
    }

    public MedicalModelInferenceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public MedicalModelInferenceHeaders setXGWAccess(String xGWAccess) {
        this.xGWAccess = xGWAccess;
        return this;
    }
    public String getXGWAccess() {
        return this.xGWAccess;
    }

    public MedicalModelInferenceHeaders setXGWNonce(String xGWNonce) {
        this.xGWNonce = xGWNonce;
        return this;
    }
    public String getXGWNonce() {
        return this.xGWNonce;
    }

    public MedicalModelInferenceHeaders setXGWProtocol(String xGWProtocol) {
        this.xGWProtocol = xGWProtocol;
        return this;
    }
    public String getXGWProtocol() {
        return this.xGWProtocol;
    }

    public MedicalModelInferenceHeaders setXGWSignature(String xGWSignature) {
        this.xGWSignature = xGWSignature;
        return this;
    }
    public String getXGWSignature() {
        return this.xGWSignature;
    }

    public MedicalModelInferenceHeaders setXGWTimestamp(String xGWTimestamp) {
        this.xGWTimestamp = xGWTimestamp;
        return this;
    }
    public String getXGWTimestamp() {
        return this.xGWTimestamp;
    }

    public MedicalModelInferenceHeaders setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }
    public String getXRequestId() {
        return this.xRequestId;
    }

}
