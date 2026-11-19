// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261105.models;

import com.aliyun.tea.*;

public class ChatHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The response media types accepted by the client.</p>
     * 
     * <strong>example:</strong>
     * <p>application/json</p>
     */
    @NameInMap("Accept")
    public String accept;

    /**
     * <p>The compatible SSE selector header.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("X-DashScope-SSE")
    public String xDashScopeSSE;

    /**
     * <p>The AccessKey ID for the business gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-gateway-access</p>
     */
    @NameInMap("X-GW-Access")
    public String xGWAccess;

    /**
     * <p>The random string used for each call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c093adf9-287a-4684-982a-1aea5a248c2e</p>
     */
    @NameInMap("X-GW-Nonce")
    public String xGWNonce;

    /**
     * <p>The field naming protocol. Set to aliyun-roa to use lower camel case fields, or omit to use the legacy protocol. This header does not participate in HMAC signing.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-roa</p>
     */
    @NameInMap("X-GW-Protocol")
    public String xGWProtocol;

    /**
     * <p>The lowercase hexadecimal HMAC-SHA256 signature calculated based on the actual request bytes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0000000000000000000000000000000000000000000000000000000000000000</p>
     */
    @NameInMap("X-GW-Signature")
    public String xGWSignature;

    /**
     * <p>The current Unix millisecond timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1794787200000</p>
     */
    @NameInMap("X-GW-Timestamp")
    public String xGWTimestamp;

    /**
     * <p>The business request ID, which must be exactly the same as communication.requestId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>req-example-001</p>
     */
    @NameInMap("X-Request-Id")
    public String xRequestId;

    public static ChatHeaders build(java.util.Map<String, ?> map) throws Exception {
        ChatHeaders self = new ChatHeaders();
        return TeaModel.build(map, self);
    }

    public ChatHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ChatHeaders setAccept(String accept) {
        this.accept = accept;
        return this;
    }
    public String getAccept() {
        return this.accept;
    }

    public ChatHeaders setXDashScopeSSE(String xDashScopeSSE) {
        this.xDashScopeSSE = xDashScopeSSE;
        return this;
    }
    public String getXDashScopeSSE() {
        return this.xDashScopeSSE;
    }

    public ChatHeaders setXGWAccess(String xGWAccess) {
        this.xGWAccess = xGWAccess;
        return this;
    }
    public String getXGWAccess() {
        return this.xGWAccess;
    }

    public ChatHeaders setXGWNonce(String xGWNonce) {
        this.xGWNonce = xGWNonce;
        return this;
    }
    public String getXGWNonce() {
        return this.xGWNonce;
    }

    public ChatHeaders setXGWProtocol(String xGWProtocol) {
        this.xGWProtocol = xGWProtocol;
        return this;
    }
    public String getXGWProtocol() {
        return this.xGWProtocol;
    }

    public ChatHeaders setXGWSignature(String xGWSignature) {
        this.xGWSignature = xGWSignature;
        return this;
    }
    public String getXGWSignature() {
        return this.xGWSignature;
    }

    public ChatHeaders setXGWTimestamp(String xGWTimestamp) {
        this.xGWTimestamp = xGWTimestamp;
        return this;
    }
    public String getXGWTimestamp() {
        return this.xGWTimestamp;
    }

    public ChatHeaders setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }
    public String getXRequestId() {
        return this.xRequestId;
    }

}
