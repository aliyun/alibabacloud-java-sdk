// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261121.models;

import com.aliyun.tea.*;

public class MedicalModelInferenceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>可选。请求 SSE 时可填 enable。正文中必须显式填写 JSON 布尔值 params.responseStreaming；true 返回 SSE，false 返回完整 JSON。</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("X-DashScope-SSE")
    public String xDashScopeSSE;

    /**
     * <p>接入时领取的业务 Access Key ID，用于识别调用方。阿里云调用凭证按 SDK 的要求单独配置。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-ak-87019a070b49c9fc</p>
     */
    @NameInMap("X-GW-Access")
    public String xGWAccess;

    /**
     * <p>每次发送时重新生成的随机串，例如 UUID。重试时也要重新生成 nonce、时间戳和签名。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b46a9f08-fe98-4dd3-8885-405c4d032e02</p>
     */
    @NameInMap("X-GW-Nonce")
    public String xGWNonce;

    /**
     * <p>本文示例固定传 aliyun-roa，使用小驼峰格式的请求和响应。此请求头不参与业务签名。</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-roa</p>
     */
    @NameInMap("X-GW-Protocol")
    public String xGWProtocol;

    /**
     * <p>使用接入时领取的业务签名密钥（SK）对六段内容计算 HMAC-SHA256。依次为 HTTP 方法（大写）、请求路径、规范化查询串、实际发送正文的 SHA-256 小写十六进制、X-GW-Timestamp、X-GW-Nonce。以换行连接，末尾不加换行；无查询参数时第三段保留为空。查询串按 &amp; 拆分并去除空项，按原始参数项字典序排序后以 &amp; 拼接，不解码。签名传 64 个小写十六进制字符。正文用 UTF-8 序列化一次，用同一份字节签名和发送，SK 仅用于本地计算。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>234ad5ad03406bc34b605b3d59746563420d58cb4cdcd2979b677790551a7278</p>
     */
    @NameInMap("X-GW-Signature")
    public String xGWSignature;

    /**
     * <p>发送请求时的 Unix 毫秒时间戳，使用十进制字符串。签名和请求头使用同一个值。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1794996000000</p>
     */
    @NameInMap("X-GW-Timestamp")
    public String xGWTimestamp;

    /**
     * <p>本次业务请求的关联号，单值，与 communication.requestId 完全相同。允许 1 至 128 个字母、数字或 . _ : - 字符，gw-ingress- 前缀保留给服务诊断。</p>
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

    public MedicalModelInferenceHeaders setXDashScopeSSE(String xDashScopeSSE) {
        this.xDashScopeSSE = xDashScopeSSE;
        return this;
    }
    public String getXDashScopeSSE() {
        return this.xDashScopeSSE;
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
