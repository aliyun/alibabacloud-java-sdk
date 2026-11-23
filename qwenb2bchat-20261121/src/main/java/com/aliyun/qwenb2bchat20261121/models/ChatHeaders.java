// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261121.models;

import com.aliyun.tea.*;

public class ChatHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>可选。完整 JSON 可传 application/json，SSE 可传 text/event-stream。客户端必须在正文中以布尔值 params.responseStreaming 指定响应格式。</p>
     * 
     * <strong>example:</strong>
     * <p>application/json</p>
     */
    @NameInMap("Accept")
    public String accept;

    /**
     * <p>可选。enable 表示 SSE。每次请求须在正文中显式填写布尔参数 params.responseStreaming。本头不替代 X-GW-Protocol 或 X-GW 签名。</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("X-DashScope-SSE")
    public String xDashScopeSSE;

    /**
     * <p>必填，服务方发放的业务网关 AK，用于识别租户和业务凭据，不是用于 POP 鉴权的阿里云 AK。每次只传一个非空值；业务 SK 只在客户端用于计算签名，不随请求发送。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-gateway-access</p>
     */
    @NameInMap("X-GW-Access")
    public String xGWAccess;

    /**
     * <p>必填，每次尝试唯一且非空的随机串，例如 UUID；不可重放旧签名。重试重新生成 nonce、时间戳及签名。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c093adf9-287a-4684-982a-1aea5a248c2e</p>
     */
    @NameInMap("X-GW-Nonce")
    public String xGWNonce;

    /**
     * <p>本文小驼峰请求与响应必须显式传 aliyun-roa，且只传一次。省略选择旧协议，不能直接照搬小驼峰正文。此头不参与业务 HMAC，不代替 POP 鉴权或 X-GW-* 业务签名。</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-roa</p>
     */
    @NameInMap("X-GW-Protocol")
    public String xGWProtocol;

    /**
     * <p>必填，使用业务网关 SK 计算的 64 位小写十六进制 HMAC-SHA256。六段按 LF 连接且无末尾换行：METHOD、PATH、CANONICAL_QUERY、BODY_SHA256_HEX、TIMESTAMP、NONCE。原始 query 按 &amp; 分项去空、字典序排序，不 decode/re-encode；正文按实际发送的 UTF-8 字节摘要。具体双签名示例见接口说明。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0000000000000000000000000000000000000000000000000000000000000000</p>
     */
    @NameInMap("X-GW-Signature")
    public String xGWSignature;

    /**
     * <p>必填，当前 Unix 毫秒时间戳的数字字符串；有效时间窗按凭据配置。签名规范串与本头使用完全相同的字符串。每次重试重新生成时间戳、nonce 和签名。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1794787200000</p>
     */
    @NameInMap("X-GW-Timestamp")
    public String xGWTimestamp;

    /**
     * <p>必填，恰好一个，须与 communication.requestId 完全一致。格式 [A-Za-z0-9._:-]{1,128}，不得用保留前缀 gw-ingress-。例如 chat-20261118-001；这是业务关联号，不保证重复请求只执行一次。</p>
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
