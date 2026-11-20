// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261116.models;

import com.aliyun.tea.*;

public class OpenServiceHeaders extends TeaModel {
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
     * <p>The random string for the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b46a9f08-fe98-4dd3-8885-405c4d032eff</p>
     */
    @NameInMap("X-GW-Nonce")
    public String xGWNonce;

    /**
     * <p>The business request signature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fe3241f17796f523d9df27138f9a22abaead6cc9d1b82bae4b45eedc0e1858d7</p>
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

    public static OpenServiceHeaders build(java.util.Map<String, ?> map) throws Exception {
        OpenServiceHeaders self = new OpenServiceHeaders();
        return TeaModel.build(map, self);
    }

    public OpenServiceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public OpenServiceHeaders setXGWAccess(String xGWAccess) {
        this.xGWAccess = xGWAccess;
        return this;
    }
    public String getXGWAccess() {
        return this.xGWAccess;
    }

    public OpenServiceHeaders setXGWNonce(String xGWNonce) {
        this.xGWNonce = xGWNonce;
        return this;
    }
    public String getXGWNonce() {
        return this.xGWNonce;
    }

    public OpenServiceHeaders setXGWSignature(String xGWSignature) {
        this.xGWSignature = xGWSignature;
        return this;
    }
    public String getXGWSignature() {
        return this.xGWSignature;
    }

    public OpenServiceHeaders setXGWTimestamp(String xGWTimestamp) {
        this.xGWTimestamp = xGWTimestamp;
        return this;
    }
    public String getXGWTimestamp() {
        return this.xGWTimestamp;
    }

    public OpenServiceHeaders setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }
    public String getXRequestId() {
        return this.xRequestId;
    }

}
