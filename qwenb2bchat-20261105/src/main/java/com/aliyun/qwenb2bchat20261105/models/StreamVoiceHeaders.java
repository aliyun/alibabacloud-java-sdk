// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261105.models;

import com.aliyun.tea.*;

public class StreamVoiceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>业务网关 Access Key ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-gateway-access</p>
     */
    @NameInMap("X-GW-Access")
    public String xGWAccess;

    /**
     * <p>每次调用使用的随机串</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c093adf9-287a-4684-982a-1aea5a248c2e</p>
     */
    @NameInMap("X-GW-Nonce")
    public String xGWNonce;

    /**
     * <p>小驼峰回源协议固定传 aliyun-roa，省略时为旧协议；不参与 HMAC 签名</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-roa</p>
     */
    @NameInMap("X-GW-Protocol")
    public String xGWProtocol;

    /**
     * <p>按实际请求字节计算的 HMAC-SHA256 小写十六进制签名</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0000000000000000000000000000000000000000000000000000000000000000</p>
     */
    @NameInMap("X-GW-Signature")
    public String xGWSignature;

    /**
     * <p>当前 Unix 毫秒时间戳</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1794787200000</p>
     */
    @NameInMap("X-GW-Timestamp")
    public String xGWTimestamp;

    /**
     * <p>可选的 WebSocket 握手关联号，每轮业务 ID 使用 run-task 帧中的 communication.requestId</p>
     * 
     * <strong>example:</strong>
     * <p>ws-example-001</p>
     */
    @NameInMap("X-Request-Id")
    public String xRequestId;

    public static StreamVoiceHeaders build(java.util.Map<String, ?> map) throws Exception {
        StreamVoiceHeaders self = new StreamVoiceHeaders();
        return TeaModel.build(map, self);
    }

    public StreamVoiceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public StreamVoiceHeaders setXGWAccess(String xGWAccess) {
        this.xGWAccess = xGWAccess;
        return this;
    }
    public String getXGWAccess() {
        return this.xGWAccess;
    }

    public StreamVoiceHeaders setXGWNonce(String xGWNonce) {
        this.xGWNonce = xGWNonce;
        return this;
    }
    public String getXGWNonce() {
        return this.xGWNonce;
    }

    public StreamVoiceHeaders setXGWProtocol(String xGWProtocol) {
        this.xGWProtocol = xGWProtocol;
        return this;
    }
    public String getXGWProtocol() {
        return this.xGWProtocol;
    }

    public StreamVoiceHeaders setXGWSignature(String xGWSignature) {
        this.xGWSignature = xGWSignature;
        return this;
    }
    public String getXGWSignature() {
        return this.xGWSignature;
    }

    public StreamVoiceHeaders setXGWTimestamp(String xGWTimestamp) {
        this.xGWTimestamp = xGWTimestamp;
        return this;
    }
    public String getXGWTimestamp() {
        return this.xGWTimestamp;
    }

    public StreamVoiceHeaders setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }
    public String getXRequestId() {
        return this.xRequestId;
    }

}
