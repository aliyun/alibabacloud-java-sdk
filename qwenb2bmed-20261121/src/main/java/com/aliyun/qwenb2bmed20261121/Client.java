// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261121;

import com.aliyun.tea.*;
import com.aliyun.qwenb2bmed20261121.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "QwenB2BMed";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("qwenb2bmed", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * <b>description</b> :
     * <h1>医疗 Agent 对话接入说明</h1>
     * <p>医疗 Agent 对话通过 UTF-8 JSON 接收文本和已开通的图片内容，提供一次完整 JSON 或 SSE 流式响应。</p>
     * <h2>1. 调用与鉴权</h2>
     * <table>
     * <thead>
     * <tr>
     * <th>项目</th>
     * <th>写法</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>产品与版本</td>
     * <td><code>QwenB2BMed / 2026-11-21</code></td>
     * </tr>
     * <tr>
     * <td>Action</td>
     * <td><code>MedicalAgentChat</code></td>
     * </tr>
     * <tr>
     * <td>方法和路径</td>
     * <td><code>POST /v1/api/medicalQa</code></td>
     * </tr>
     * <tr>
     * <td>域名</td>
     * <td>使用服务方提供的目标环境 POP Endpoint</td>
     * </tr>
     * <tr>
     * <td>RAM Action</td>
     * <td><code>qwenb2bmed:MedicalAgentChat</code></td>
     * </tr>
     * <tr>
     * <td>编码</td>
     * <td><code>Content-Type: application/octet-stream</code>，正文与签名使用同一份 UTF-8 字节</td>
     * </tr>
     * <tr>
     * <td>字段协议</td>
     * <td>小驼峰正文发送 <code>X-GW-Protocol: aliyun-roa</code></td>
     * </tr>
     * <tr>
     * <td>阿里云 POP ACS3 使用阿里云 AK/SK 或 STS 凭据。业务 HMAC 使用服务方发放的业务 AK/SK。选择器和媒体能力须获得相应授权。</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>请求头</td>
     * <td>类型</td>
     * </tr>
     * <tr>
     * <td>---</td>
     * <td>---</td>
     * </tr>
     * <tr>
     * <td><code>X-Request-Id</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Protocol</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Access</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Timestamp</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Nonce</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Signature</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>Accept</code>（标准 HTTP 请求头）</td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-DashScope-SSE</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td>每个请求都必须在正文中传入 JSON 布尔值 <code>params.responseStreaming</code>。传 <code>false</code> 返回完整 JSON，传 <code>true</code> 返回 SSE。即使设置了 <code>Accept</code> 或 <code>X-DashScope-SSE</code>，也须填写此字段。</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>POP 签名器生成 <code>Authorization</code>、<code>x-acs-action</code>、<code>x-acs-version</code>、<code>x-acs-date</code>、<code>x-acs-signature-nonce</code> 和 <code>x-acs-content-sha256</code>。使用 STS 时按签名器要求传安全令牌。业务 SK 与 POP SK 各自在本地用于签名。</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>业务签名的规范串依次为 METHOD、PATH、CANONICAL_QUERY、BODY_SHA256_HEX、TIMESTAMP、NONCE。各段用单个 LF 连接，末尾无额外 LF。无 query 时第三段留空。有 query 时使用实际请求的编码结果，按 <code>&amp;</code> 拆分、去空项、对整项排序并重新用 <code>&amp;</code> 连接。SHA-256 按实际发送的 UTF-8 正文字节计算。对规范串做 HMAC-SHA256，输出小写十六进制。使用本接口签名并发起请求的 Python 脚本见第 4 节末尾的「完整签名和调用示例」。</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h2>2. 请求字段与会话</h2>
     * <p>将下表中的业务对象序列化为 UTF-8 JSON 字节，并用这份字节计算业务签名。使用 HTTP 客户端时，以 <code>Content-Type: application/octet-stream</code> 将同一份字节直接写入 POST 正文。使用阿里云通用 OpenAPI SDK 时，将这些字节的可读流设置到 <code>OpenApiRequest.stream</code>，填写第 1 节的业务请求头，并指定第 1 节的 Action、Version、ROA 路径和方法。</p>
     * <pre><code class="language-ts">interface MedicalRequest {
     *   // 会话关联和已授权的业务身份。
     *   communication: {
     *     requestId: string;
     *     sessionId: string;
     *     historyOwner: \\&quot;CLIENT\\&quot; | \\&quot;GATEWAY\\&quot;;
     *     appId?: string;
     *     appScene?: string;
     *     userInfo?: { userId?: string; userIp?: string; userName?: string; deviceId?: string };
     *   };
     *   // 非空消息数组。最后一条是本轮 user。
     *   data: { messages: Array&lt;{ role: \\&quot;user\\&quot; | \\&quot;assistant\\&quot;; content: string | ContentBlock[] }&gt; };
     *   // 选择器和本次响应格式见下表。
     *   params: { directAgent?: \\&quot;med_qa\\&quot;; deepthink?: \\&quot;true\\&quot; | \\&quot;false\\&quot;; responseStreaming: boolean; outputAudio?: boolean; [name: string]: unknown };
     * }
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th>字段</th>
     * <th>类型</th>
     * <th>必填</th>
     * <th>默认值</th>
     * <th>说明</th>
     * <th>示例</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>communication</code></td>
     * <td>object</td>
     * <td>是</td>
     * <td>—</td>
     * <td>本轮请求、会话及客户身份。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.requestId</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td>1–128 位字母、数字、点、下划线、冒号或连字符。与请求头 <code>X-Request-Id</code> 完全一致，<code>gw-ingress-</code> 前缀为保留值。</td>
     * <td><code>&quot;med-req-001&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.sessionId</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td>1–512 位字母、数字、点、下划线、冒号或连字符。续聊复用。</td>
     * <td><code>&quot;med-session-001&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.historyOwner</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td><code>GATEWAY</code> 或 <code>CLIENT</code>。区分大小写，同一会话保持一致。</td>
     * <td><code>&quot;CLIENT&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.appId</code></td>
     * <td>string</td>
     * <td>条件填写</td>
     * <td>凭据的固定应用</td>
     * <td>填写已授权的值。显式值为非空字符串，最多 256 个 UTF-16 代码单元，首尾无空白且不含控制字符。</td>
     * <td><code>&quot;your-app-id&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.appScene</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户场景标记。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户提供的业务用户信息。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.userId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>按用户身份规则判断</td>
     * <td>按已开通的用户绑定填写。显式值为非空字符串，最多 256 个 UTF-16 代码单元，首尾无空白且不含控制字符。</td>
     * <td><code>&quot;user-001&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.userIp</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户声明的用户 IP。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.userName</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户侧用户名。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.deviceId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户侧设备标识，最多 256 个 UTF-16 代码单元。可省略；媒体请求实际填写时须非空白且不含控制字符。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>data</code></td>
     * <td>object</td>
     * <td>是</td>
     * <td>—</td>
     * <td>本轮对话数据。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>data.messages</code></td>
     * <td>array</td>
     * <td>是</td>
     * <td>—</td>
     * <td>非空。<code>GATEWAY</code> 仅传本轮一条 user。<code>CLIENT</code> 按 user、assistant 成对提供历史，最后追加本轮 user。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].role</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td><code>user</code> 或 <code>assistant</code>。</td>
     * <td><code>&quot;user&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].content</code></td>
     * <td>string 或 array</td>
     * <td>是</td>
     * <td>—</td>
     * <td>文本或第 3 节所列内容块。</td>
     * <td><code>&quot;体检报告中的血红蛋白这一项是什么意思？&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>params</code></td>
     * <td>object</td>
     * <td>是</td>
     * <td>无</td>
     * <td>含必填字段 responseStreaming，其他 Agent 参数按需填写。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>params.directAgent</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td><code>med_qa</code></td>
     * <td>显式填写时只接受 <code>med_qa</code>。</td>
     * <td><code>&quot;med_qa&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>params.deepthink</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>不主动开启</td>
     * <td>显式使用字符串 <code>&quot;true&quot;</code> 开启，使用字符串 <code>&quot;false&quot;</code> 关闭。</td>
     * <td><code>&quot;false&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>params.outputAudio</code></td>
     * <td>boolean</td>
     * <td>否</td>
     * <td>不主动请求</td>
     * <td>可选 JSON 布尔值。业务已开通 HTTP 音频输出时，true 请求合成音频，false 或省略时不主动请求。按当前响应格式读取 audioFrames 或 SSE 音频帧。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>params.responseStreaming</code></td>
     * <td>boolean</td>
     * <td>是</td>
     * <td>无</td>
     * <td>必须显式填写 JSON 布尔值。<code>false</code> 返回完整 JSON，<code>true</code> 返回 SSE。</td>
     * <td><code>false</code></td>
     * </tr>
     * <tr>
     * <td>省略 directAgent 时使用 med_qa，显式传入时也只能填 med_qa。支持深思的授权场景传字符串 &quot;true&quot; 开启，传 &quot;false&quot; 或省略时不主动开启。 扩展字段以已开通服务公布的参数为准。 <code>GATEWAY</code> 每轮提供一条本轮 user。 <code>CLIENT</code> 可携带按 user/assistant 配对的历史，最后附本轮 user。历史 assistant 只传文本。续聊保持 sessionId、historyOwner 和同一业务身份，新一轮可使用新的 requestId。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>正文顶层使用 <code>communication</code>、<code>data</code> 和 <code>params</code>，<code>data</code> 中使用 <code>messages</code>。消息对象包含 <code>role</code> 与 <code>content</code>，扩展业务参数放在 <code>params</code> 中。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h2>3. 文本和图片</h2>
     * <pre><code class="language-ts">type ContentBlock =
     *   | { type: \\&quot;text\\&quot;; text: string }
     *   | { type: \\&quot;image_url\\&quot;; imageUrl: string | { url: string } };
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th>字段</th>
     * <th>类型</th>
     * <th>填写条件</th>
     * <th>默认值</th>
     * <th>说明</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>content[].type</code></td>
     * <td>string</td>
     * <td>使用内容块时</td>
     * <td>—</td>
     * <td>文字填 <code>text</code>，图片填 <code>image_url</code>。</td>
     * </tr>
     * <tr>
     * <td><code>content[].text</code></td>
     * <td>string</td>
     * <td>文本块</td>
     * <td>—</td>
     * <td>要发送的文字。</td>
     * </tr>
     * <tr>
     * <td><code>content[].imageUrl</code></td>
     * <td>string 或 object</td>
     * <td>图片块</td>
     * <td>—</td>
     * <td>可访问的 HTTPS 图片地址或 Base64 Data URL。</td>
     * </tr>
     * <tr>
     * <td><code>content[].imageUrl.url</code></td>
     * <td>string</td>
     * <td>图片引用为对象时</td>
     * <td>—</td>
     * <td>对象只包含这个字段。</td>
     * </tr>
     * <tr>
     * <td>图片块填写 type=image_url；imageUrl 可直接传字符串，也可传仅含 url 的对象。imageUrl.url 支持服务可访问的 HTTPS 图片 URL 或完整 Base64 Data URL，例如 data:image/png;base64, 后接 PNG 文件的标准 Base64，JPEG 使用 data:image/jpeg;base64, 前缀。前缀所声明的 MIME 应与图片内容一致。 申请开通的媒体格式、图片数量和大小以实际服务约定为准。媒体块内保留 <code>image_url</code> 枚举，字段名使用 <code>imageUrl</code>。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>本医疗 API 当前公开的输入范围是文本和图片，内容块使用 <code>text</code> 或 <code>image_url</code>。这里的 HTTP 音频输出能力不代表支持音频输入；不要据此发送文件、音频或视频内容块。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>图片引用可填非空字符串或仅含 <code>url</code> 的对象；图片块不传额外的 fileName，文本块只用 type 和 text。<code>userInfo.deviceId</code> 可省略，媒体请求实际填写时须非空白且不含控制字符。图片来源、数量、尺寸和大小仍须满足客户已开通的服务范围。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h2>4. 完整请求正文示例</h2>
     * <p>示例使用已固定业务应用的凭据。需要显式应用身份时补充获准的 <code>communication.appId</code>，发送时将 <code>X-Request-Id</code> 设置为正文请求号。</p>
     * <h3>4.1 纯文本</h3>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-agent-text-001&quot;,
     *     &quot;sessionId&quot;: &quot;med-agent-text-001-session&quot;,
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;role&quot;: &quot;user&quot;,
     *         &quot;content&quot;: &quot;请解释报告中参考区间的含义。&quot;
     *       }
     *     ]
     *   },
     *   &quot;params&quot;: {
     *     &quot;responseStreaming&quot;: false
     *   }
     * }
     * </code></pre>
     * <h3>4.2 HTTPS 图片</h3>
     * <p>将示例地址替换为服务可访问的真实图片地址。</p>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-agent-url-001&quot;,
     *     &quot;sessionId&quot;: &quot;med-agent-url-001-session&quot;,
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;role&quot;: &quot;user&quot;,
     *         &quot;content&quot;: [
     *           {
     *             &quot;type&quot;: &quot;text&quot;,
     *             &quot;text&quot;: &quot;请描述图片中可见的内容。&quot;
     *           },
     *           {
     *             &quot;type&quot;: &quot;image_url&quot;,
     *             &quot;imageUrl&quot;: {
     *               &quot;url&quot;: &quot;https://example.com/medical-image.png&quot;
     *             }
     *           }
     *         ]
     *       }
     *     ]
     *   },
     *   &quot;params&quot;: {
     *     &quot;responseStreaming&quot;: false
     *   }
     * }
     * </code></pre>
     * <h3>4.3 Base64 图片</h3>
     * <p>下方使用一张合成 PNG 演示字段位置。实际请求使用自己的完整编码。</p>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-agent-base64-001&quot;,
     *     &quot;sessionId&quot;: &quot;med-agent-base64-001-session&quot;,
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;role&quot;: &quot;user&quot;,
     *         &quot;content&quot;: [
     *           {
     *             &quot;type&quot;: &quot;text&quot;,
     *             &quot;text&quot;: &quot;请描述图片中可见的内容。&quot;
     *           },
     *           {
     *             &quot;type&quot;: &quot;image_url&quot;,
     *             &quot;imageUrl&quot;: {
     *               &quot;url&quot;: &quot;data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAIAAAAlC+aJAAAAb0lEQVR4nO3PAQkAAAyEwO9feoshgnABdLep8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3IPanc8OLDQitxAAAAAElFTkSuQmCC&quot;
     *             }
     *           }
     *         ]
     *       }
     *     ]
     *   },
     *   &quot;params&quot;: {
     *     &quot;responseStreaming&quot;: false
     *   }
     * }
     * </code></pre>
     * <p>需要 SSE 时，在以上请求中使用 <code>&quot;responseStreaming&quot;: true</code>，并可使用 <code>Accept: text/event-stream</code>。获取完整 JSON 时，显式传入 <code>false</code>。</p>
     * <h4>完整签名和调用示例</h4>
     * <p>示例从环境变量读取 POP_HOST、两套凭据和可选的 APP_ID、BUSINESS_USER_ID、SESSION_ID。POP_HOST 只填服务方提供的域名，不填协议和路径。脚本发送一条文本请求。设置 STREAM=true 可读取 SSE。</p>
     * <pre><code class="language-python">import datetime, hashlib, hmac, http.client, json, os, secrets, time
     * def sha(data):
     *     return hashlib.sha256(data).hexdigest()
     * def mac(secret, value):
     *     return hmac.new(secret.encode(&quot;utf-8&quot;), value.encode(&quot;utf-8&quot;), hashlib.sha256).hexdigest()
     * host = os.environ[&quot;POP_HOST&quot;]
     * path = &quot;/v1/api/medicalQa&quot;
     * request_id = &quot;chat-&quot; + secrets.token_hex(12)
     * stream = os.environ.get(&quot;STREAM&quot;, &quot;false&quot;).lower() == &quot;true&quot;
     * communication = {
     *     &quot;requestId&quot;: request_id,
     *     &quot;sessionId&quot;: os.environ.get(&quot;SESSION_ID&quot;, &quot;session-&quot; + secrets.token_hex(12)),
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;,
     * }
     * if os.environ.get(&quot;APP_ID&quot;):
     *     communication[&quot;appId&quot;] = os.environ[&quot;APP_ID&quot;]
     * if os.environ.get(&quot;BUSINESS_USER_ID&quot;):
     *     communication[&quot;userInfo&quot;] = {&quot;userId&quot;: os.environ[&quot;BUSINESS_USER_ID&quot;]}
     * body = {
     *     &quot;communication&quot;: communication,
     *     &quot;data&quot;: {&quot;messages&quot;: [{&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;请解释报告中参考区间的含义。&quot;}]},
     *     &quot;params&quot;: {&quot;responseStreaming&quot;: stream},
     * }
     * payload = json.dumps(body, ensure_ascii=False, separators=(&quot;,&quot;, &quot;:&quot;)).encode(&quot;utf-8&quot;)
     * payload_hash = sha(payload)
     * timestamp, nonce = str(time.time_ns() // 1_000_000), secrets.token_hex(16)
     * gateway_string = &quot;\\n&quot;.join((&quot;POST&quot;, path, &quot;&quot;, payload_hash, timestamp, nonce))
     * headers = {
     *     &quot;host&quot;: host,
     *     &quot;content-type&quot;: &quot;application/octet-stream&quot;,
     *     &quot;accept&quot;: &quot;text/event-stream&quot; if stream else &quot;application/json&quot;,
     *     &quot;x-acs-action&quot;: &quot;MedicalAgentChat&quot;,
     *     &quot;x-acs-version&quot;: &quot;2026-11-21&quot;,
     *     &quot;x-acs-date&quot;: datetime.datetime.now(datetime.timezone.utc).strftime(&quot;%Y-%m-%dT%H:%M:%SZ&quot;),
     *     &quot;x-acs-signature-nonce&quot;: secrets.token_hex(16),
     *     &quot;x-acs-content-sha256&quot;: payload_hash,
     *     &quot;x-gw-protocol&quot;: &quot;aliyun-roa&quot;,
     *     &quot;x-request-id&quot;: request_id,
     *     &quot;x-gw-access&quot;: os.environ[&quot;GW_ACCESS_KEY_ID&quot;],
     *     &quot;x-gw-timestamp&quot;: timestamp,
     *     &quot;x-gw-nonce&quot;: nonce,
     *     &quot;x-gw-signature&quot;: mac(os.environ[&quot;GW_ACCESS_KEY_SECRET&quot;], gateway_string),
     * }
     * if os.environ.get(&quot;POP_SECURITY_TOKEN&quot;):
     *     headers[&quot;x-acs-security-token&quot;] = os.environ[&quot;POP_SECURITY_TOKEN&quot;]
     * signed_names = sorted(k for k in headers if k in (&quot;host&quot;, &quot;content-type&quot;) or k.startswith(&quot;x-acs-&quot;))
     * canonical_headers = &quot;&quot;.join(k + &quot;:&quot; + headers[k].strip() + &quot;\\n&quot; for k in signed_names)
     * signed_headers = &quot;;&quot;.join(signed_names)
     * canonical_request = &quot;\\n&quot;.join((&quot;POST&quot;, path, &quot;&quot;, canonical_headers, signed_headers, payload_hash))
     * pop_signature = mac(os.environ[&quot;POP_ACCESS_KEY_SECRET&quot;], &quot;ACS3-HMAC-SHA256\\n&quot; + sha(canonical_request.encode(&quot;utf-8&quot;)))
     * headers[&quot;authorization&quot;] = (
     *     &quot;ACS3-HMAC-SHA256 Credential=&quot; + os.environ[&quot;POP_ACCESS_KEY_ID&quot;]
     *     + &quot;,SignedHeaders=&quot; + signed_headers + &quot;,Signature=&quot; + pop_signature
     * )
     * connection = http.client.HTTPSConnection(host, timeout=120)
     * try:
     *     connection.request(&quot;POST&quot;, path, body=payload, headers=headers)
     *     response = connection.getresponse()
     *     print(&quot;HTTP&quot;, response.status, &quot;业务 RequestId:&quot;, request_id,
     *           &quot;POP RequestId:&quot;, response.getheader(&quot;x-acs-request-id&quot;))
     *     if &quot;text/event-stream&quot; in (response.getheader(&quot;content-type&quot;) or &quot;&quot;).lower():
     *         # 打印保留 SSE 空行；业务集成应按空行组装事件并检查 complete/error。
     *         while True:
     *             line = response.readline()
     *             if not line:
     *                 break
     *             print(line.decode(&quot;utf-8&quot;), end=&quot;&quot;)
     *     else:
     *         print(response.read().decode(&quot;utf-8&quot;))
     * finally:
     *     connection.close()
     * </code></pre>
     * <h2>5. 响应</h2>
     * <pre><code class="language-ts">interface MedicalResponse {
     *   requestId?: string;
     *   communication?: { requestId?: string; sessionId?: string; responseId?: number };
     *   data?: {
     *     messages?: Array&lt;{
     *       mimeType?: string;
     *       status?: string;
     *       content?: unknown;
     *       metaData?: {
     *         sourceSeq?: string; type?: string; barTitle?: string; content?: unknown;
     *         multiLoad?: Array&lt;{ type?: string; sourceSeq?: string; content?: unknown }&gt;;
     *       };
     *     }&gt;;
     *     // 可选业务调试信息，可为 null；内容以实际返回为准。
     *     debug?: unknown;
     *     extraInfo?: { inputResources?: Array&lt;{
     *       contentIndex?: number; type?: string; resourceId?: string; url?: string; fileName?: string;
     *     }&gt; };
     *   };
     *   audioFrames?: Array&lt;{
     *     type?: string; data?: string; last?: boolean; code?: string; message?: string; requestId?: string;
     *   }&gt;;
     *   errorCode?: string | number;
     *   errorMsg?: string;
     *   error?: { code?: string | number; message?: string; requestId?: string };
     * }
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th>字段</th>
     * <th>类型</th>
     * <th>是否总有</th>
     * <th>默认值</th>
     * <th>说明</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>requestId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>业务关联号。POP 请求号见 x-acs-request-id。</td>
     * </tr>
     * <tr>
     * <td><code>communication</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户请求、会话与业务响应帧的关联信息。</td>
     * </tr>
     * <tr>
     * <td><code>communication.requestId/sessionId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>与该业务请求及会话关联。</td>
     * </tr>
     * <tr>
     * <td><code>communication.responseId</code></td>
     * <td>integer</td>
     * <td>否</td>
     * <td>—</td>
     * <td>业务响应帧标识。完整 JSON 聚合时可为 0，SSE 按接收顺序处理，编号无需连续。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>正文、过程或卡片消息，依据 mimeType 解析。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].mimeType</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>消息内容或过程类型。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].status</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>该条消息状态。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].content</code></td>
     * <td>JSON</td>
     * <td>否</td>
     * <td>—</td>
     * <td>当前消息正文或结构化内容。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].metaData</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>可选的医疗检索进度或正文卡片信息，依据所在消息的 mimeType 解析。</td>
     * </tr>
     * <tr>
     * <td><code>metaData.sourceSeq/type/barTitle/content</code></td>
     * <td>string 或 JSON</td>
     * <td>否</td>
     * <td>—</td>
     * <td>sourceSeq 关联同一进度模块；type 区分模块，barTitle 为可选标题，content 为该类型的可选业务内容。</td>
     * </tr>
     * <tr>
     * <td><code>metaData.multiLoad</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>正文卡片列表，各项可含 type、sourceSeq 和任意 JSON 的 content；可为空或省略，不保证每轮生成。</td>
     * </tr>
     * <tr>
     * <td><code>data.debug</code></td>
     * <td>任意 JSON（含 null）</td>
     * <td>否</td>
     * <td>—</td>
     * <td>可选业务调试信息。是否返回、出现时机和内容按实际执行结果；不保证每轮或结束事件必有，也不用于判断业务完成。</td>
     * </tr>
     * <tr>
     * <td><code>data.extraInfo.inputResources</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>有结果时提供输入资源处理信息。各项可含 contentIndex、type、resourceId、url 和 fileName。</td>
     * </tr>
     * <tr>
     * <td><code>audioFrames</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>已开通对应输出时可能返回音频帧。各项可含 type、Base64 数据 data、末帧 last 或错误 code、message、requestId。</td>
     * </tr>
     * <tr>
     * <td><code>errorCode</code></td>
     * <td>string 或 number</td>
     * <td>否</td>
     * <td>—</td>
     * <td>0 表示业务成功。非 0 时读取 errorMsg 或 error，SSE 同时处理 error 事件。</td>
     * </tr>
     * <tr>
     * <td><code>errorMsg</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>服务返回的状态描述。</td>
     * </tr>
     * <tr>
     * <td><code>error</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>结构化业务错误，按 code 判断。</td>
     * </tr>
     * <tr>
     * <td>医疗 Agent 的过程消息与正文分开处理：SSE 中可能返回 <code>mimeType=bar/progress</code> 的消息，<code>metaData.sourceSeq</code> 关联同一模块的更新。资料检索模块的 <code>metaData.type</code> 可为 <code>bar_ref_source_inline</code>，其 <code>metaData.content</code> 可含 <code>query_list</code>（检索词数组）、<code>docs</code>（当前资料对象数组）和 <code>status</code>。这两个数组键按实际报文保留拼写。<code>docs</code> 中的字段随资料来源变化，可能为空，不要求每个对象都具备同一组字段。过程消息只按实际收到的内容展示，不保证每轮都有。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>正文可能包含 <code>[(sourceSeq)]</code> 卡片占位，与 <code>metaData.multiLoad</code> 中同一 <code>sourceSeq</code> 的卡片关联；卡片的 <code>type</code> 和 <code>content</code> 按实际返回解析，不能把普通资料列表自行当成正文卡片。遇到未支持的卡片类型，可跳过卡片并继续读取正文。一次完整 JSON 仍按 <code>data.messages</code> 读取应答，不能要求它复现 SSE 中的全部中间过程。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>一次完整 JSON 的成功示例</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><code>debug: null</code> 仅演示此可选字段的空值形状，不表示每次都会返回。客户端不应据此推定固定的调试子字段。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-agent-text-001&quot;,
     *     &quot;responseId&quot;: 0
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;mimeType&quot;: &quot;multi_load/iframe&quot;,
     *         &quot;status&quot;: &quot;complete&quot;,
     *         &quot;content&quot;: &quot;请结合报告上的参考区间理解各项指标。&quot;,
     *         &quot;metaData&quot;: {
     *           &quot;multiLoad&quot;: []
     *         }
     *       }
     *     ],
     *     &quot;debug&quot;: null
     *   },
     *   &quot;errorCode&quot;: 0,
     *   &quot;errorMsg&quot;: &quot;success&quot;
     * }
     * </code></pre>
     * <p>SSE 示例</p>
     * <pre><code class="language-text">data:{&quot;communication&quot;:{&quot;requestId&quot;:&quot;med-agent-text-001&quot;,&quot;responseId&quot;:0},&quot;data&quot;:{&quot;messages&quot;:[{&quot;mimeType&quot;:&quot;multi_load/iframe&quot;,&quot;status&quot;:&quot;processing&quot;,&quot;content&quot;:&quot;请结合报告上的参考区间。&quot;,&quot;metaData&quot;:{&quot;multiLoad&quot;:[]}}]},&quot;errorCode&quot;:0,&quot;errorMsg&quot;:&quot;success&quot;}
     * event:complete
     * data:{&quot;communication&quot;:{&quot;requestId&quot;:&quot;med-agent-text-001&quot;,&quot;responseId&quot;:1},&quot;data&quot;:{&quot;messages&quot;:[{&quot;mimeType&quot;:&quot;multi_load/iframe&quot;,&quot;status&quot;:&quot;complete&quot;,&quot;content&quot;:&quot;请结合报告上的参考区间理解各项指标。&quot;,&quot;metaData&quot;:{&quot;multiLoad&quot;:[]}}]},&quot;errorCode&quot;:0,&quot;errorMsg&quot;:&quot;success&quot;}
     * </code></pre>
     * <p>SSE 按空行分隔事件。complete 可能携带最终正文，也可能携带空对象，先处理其中已有的业务数据再结束。正文累计快照按更新替换，卡片按 sourceSeq 等业务标识处理。流内收到 error、断开且缺少正常终帧、或收到业务错误时按失败处理。HTTP 请求号与业务请求号分别记录，便于联调排查。</p>
     * <h2>6. 错误与重试</h2>
     * <p>先检查 HTTP 状态。HTTP 200 时继续检查业务 errorCode 或结构化 error，SSE 还要读取流内事件至 complete 或 error。流开始后的错误可在 HTTP 200 的连接中通过 event:error 返回。</p>
     * <table>
     * <thead>
     * <tr>
     * <th>状况</th>
     * <th>处理</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>INVALID_REQUEST</code>、<code>IMAGE_PROCESSING_ERROR</code>，HTTP 400</td>
     * <td>核对字段类型、会话、图片编码和媒体授权，修正请求。</td>
     * </tr>
     * <tr>
     * <td>POP 鉴权错误，或 <code>AUTH_INVALID_KEY</code>、<code>AUTH_INVALID_SIGNATURE</code>、<code>AUTH_TIMESTAMP_EXPIRED</code>、<code>AUTH_NONCE_REPLAY</code>，业务网关 HTTP 401</td>
     * <td>按对应认证层核对凭据、正文哈希、时间戳与 nonce。签名已过期或 nonce 已使用时，为新尝试重新签名。</td>
     * </tr>
     * <tr>
     * <td><code>DIRECT_AGENT_FORBIDDEN</code>、<code>AUTH_APP_FORBIDDEN</code>、<code>AUTH_URI_FORBIDDEN</code>，HTTP 403</td>
     * <td>核对应用身份、接口权限及已开通的模型或 Agent。</td>
     * </tr>
     * <tr>
     * <td><code>SESSION_ACCESS_DENIED</code>，HTTP 403</td>
     * <td>核对会话与当前业务身份的归属，保持续聊身份一致，不使用其他用户的会话。</td>
     * </tr>
     * <tr>
     * <td><code>ADMISSION_SERVICE_SUSPENDED</code>、<code>PLATFORM_ACCESS_DISABLED</code>、<code>AUTH_DISABLED</code>，HTTP 403</td>
     * <td>当前服务、接口或凭据不可用，联系服务方确认恢复或授权，勿持续重试。</td>
     * </tr>
     * <tr>
     * <td><code>PAYLOAD_TOO_LARGE</code>，HTTP 413</td>
     * <td>缩小正文或图片，按服务约定的大小、像素和资源限制重新提交。</td>
     * </tr>
     * <tr>
     * <td><code>SESSION_BUSY</code>、<code>SESSION_CONFLICT</code>，HTTP 409</td>
     * <td>等待在途请求结束，核对同一会话的身份和历史托管方后再调用。</td>
     * </tr>
     * <tr>
     * <td>限流、配额或下游短时不可用，HTTP 429</td>
     * <td>区分可恢复的限流与需要处理授权或配额的情况。适用重试时采用退避，有可用 Retry-After 时采用其秒数。</td>
     * </tr>
     * <tr>
     * <td><code>DOWNSTREAM_TIMEOUT</code>，HTTP 504，或流内错误、超时、断线</td>
     * <td>记录业务请求号和 POP 请求号。重试前核对原请求的执行情况，新尝试使用新的时间戳、nonce 和签名。</td>
     * </tr>
     * <tr>
     * <td>失败 JSON 示例</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code class="language-json">{
     *   &quot;error&quot;: {
     *     &quot;code&quot;: &quot;INVALID_REQUEST&quot;,
     *     &quot;message&quot;: &quot;请检查请求参数。&quot;,
     *     &quot;requestId&quot;: &quot;med-agent-text-001&quot;
     *   }
     * }
     * </code></pre>
     * <p>流开始后的错误示例</p>
     * <pre><code class="language-text">event:error
     * data:{&quot;communication&quot;:{&quot;requestId&quot;:&quot;med-agent-text-001&quot;},&quot;errorCode&quot;:&quot;DOWNSTREAM_TIMEOUT&quot;,&quot;errorMsg&quot;:&quot;downstream timeout&quot;}
     * </code></pre>
     * <p>新请求生成新的时间戳、nonce 和签名。请求号用于关联，重复使用同一个值可能再次执行请求。</p>
     * 
     * <b>summary</b> : 
     * <p>向千问医疗 Agent 提问并获取回答</p>
     * 
     * @param request MedicalAgentChatRequest
     * @param headers MedicalAgentChatHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return MedicalAgentChatResponse
     */
    public MedicalAgentChatResponse medicalAgentChatWithOptions(MedicalAgentChatRequest request, MedicalAgentChatHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xDashScopeSSE)) {
            realHeaders.put("X-DashScope-SSE", com.aliyun.teautil.Common.toJSONString(headers.xDashScopeSSE));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWAccess)) {
            realHeaders.put("X-GW-Access", com.aliyun.teautil.Common.toJSONString(headers.xGWAccess));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWNonce)) {
            realHeaders.put("X-GW-Nonce", com.aliyun.teautil.Common.toJSONString(headers.xGWNonce));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWProtocol)) {
            realHeaders.put("X-GW-Protocol", com.aliyun.teautil.Common.toJSONString(headers.xGWProtocol));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWSignature)) {
            realHeaders.put("X-GW-Signature", com.aliyun.teautil.Common.toJSONString(headers.xGWSignature));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWTimestamp)) {
            realHeaders.put("X-GW-Timestamp", com.aliyun.teautil.Common.toJSONString(headers.xGWTimestamp));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xRequestId)) {
            realHeaders.put("X-Request-Id", com.aliyun.teautil.Common.toJSONString(headers.xRequestId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MedicalAgentChat"),
            new TeaPair("version", "2026-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/api/medicalQa"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MedicalAgentChatResponse());
    }

    /**
     * <b>description</b> :
     * <h1>医疗 Agent 对话接入说明</h1>
     * <p>医疗 Agent 对话通过 UTF-8 JSON 接收文本和已开通的图片内容，提供一次完整 JSON 或 SSE 流式响应。</p>
     * <h2>1. 调用与鉴权</h2>
     * <table>
     * <thead>
     * <tr>
     * <th>项目</th>
     * <th>写法</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>产品与版本</td>
     * <td><code>QwenB2BMed / 2026-11-21</code></td>
     * </tr>
     * <tr>
     * <td>Action</td>
     * <td><code>MedicalAgentChat</code></td>
     * </tr>
     * <tr>
     * <td>方法和路径</td>
     * <td><code>POST /v1/api/medicalQa</code></td>
     * </tr>
     * <tr>
     * <td>域名</td>
     * <td>使用服务方提供的目标环境 POP Endpoint</td>
     * </tr>
     * <tr>
     * <td>RAM Action</td>
     * <td><code>qwenb2bmed:MedicalAgentChat</code></td>
     * </tr>
     * <tr>
     * <td>编码</td>
     * <td><code>Content-Type: application/octet-stream</code>，正文与签名使用同一份 UTF-8 字节</td>
     * </tr>
     * <tr>
     * <td>字段协议</td>
     * <td>小驼峰正文发送 <code>X-GW-Protocol: aliyun-roa</code></td>
     * </tr>
     * <tr>
     * <td>阿里云 POP ACS3 使用阿里云 AK/SK 或 STS 凭据。业务 HMAC 使用服务方发放的业务 AK/SK。选择器和媒体能力须获得相应授权。</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>请求头</td>
     * <td>类型</td>
     * </tr>
     * <tr>
     * <td>---</td>
     * <td>---</td>
     * </tr>
     * <tr>
     * <td><code>X-Request-Id</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Protocol</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Access</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Timestamp</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Nonce</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Signature</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>Accept</code>（标准 HTTP 请求头）</td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-DashScope-SSE</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td>每个请求都必须在正文中传入 JSON 布尔值 <code>params.responseStreaming</code>。传 <code>false</code> 返回完整 JSON，传 <code>true</code> 返回 SSE。即使设置了 <code>Accept</code> 或 <code>X-DashScope-SSE</code>，也须填写此字段。</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>POP 签名器生成 <code>Authorization</code>、<code>x-acs-action</code>、<code>x-acs-version</code>、<code>x-acs-date</code>、<code>x-acs-signature-nonce</code> 和 <code>x-acs-content-sha256</code>。使用 STS 时按签名器要求传安全令牌。业务 SK 与 POP SK 各自在本地用于签名。</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>业务签名的规范串依次为 METHOD、PATH、CANONICAL_QUERY、BODY_SHA256_HEX、TIMESTAMP、NONCE。各段用单个 LF 连接，末尾无额外 LF。无 query 时第三段留空。有 query 时使用实际请求的编码结果，按 <code>&amp;</code> 拆分、去空项、对整项排序并重新用 <code>&amp;</code> 连接。SHA-256 按实际发送的 UTF-8 正文字节计算。对规范串做 HMAC-SHA256，输出小写十六进制。使用本接口签名并发起请求的 Python 脚本见第 4 节末尾的「完整签名和调用示例」。</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h2>2. 请求字段与会话</h2>
     * <p>将下表中的业务对象序列化为 UTF-8 JSON 字节，并用这份字节计算业务签名。使用 HTTP 客户端时，以 <code>Content-Type: application/octet-stream</code> 将同一份字节直接写入 POST 正文。使用阿里云通用 OpenAPI SDK 时，将这些字节的可读流设置到 <code>OpenApiRequest.stream</code>，填写第 1 节的业务请求头，并指定第 1 节的 Action、Version、ROA 路径和方法。</p>
     * <pre><code class="language-ts">interface MedicalRequest {
     *   // 会话关联和已授权的业务身份。
     *   communication: {
     *     requestId: string;
     *     sessionId: string;
     *     historyOwner: \\&quot;CLIENT\\&quot; | \\&quot;GATEWAY\\&quot;;
     *     appId?: string;
     *     appScene?: string;
     *     userInfo?: { userId?: string; userIp?: string; userName?: string; deviceId?: string };
     *   };
     *   // 非空消息数组。最后一条是本轮 user。
     *   data: { messages: Array&lt;{ role: \\&quot;user\\&quot; | \\&quot;assistant\\&quot;; content: string | ContentBlock[] }&gt; };
     *   // 选择器和本次响应格式见下表。
     *   params: { directAgent?: \\&quot;med_qa\\&quot;; deepthink?: \\&quot;true\\&quot; | \\&quot;false\\&quot;; responseStreaming: boolean; outputAudio?: boolean; [name: string]: unknown };
     * }
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th>字段</th>
     * <th>类型</th>
     * <th>必填</th>
     * <th>默认值</th>
     * <th>说明</th>
     * <th>示例</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>communication</code></td>
     * <td>object</td>
     * <td>是</td>
     * <td>—</td>
     * <td>本轮请求、会话及客户身份。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.requestId</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td>1–128 位字母、数字、点、下划线、冒号或连字符。与请求头 <code>X-Request-Id</code> 完全一致，<code>gw-ingress-</code> 前缀为保留值。</td>
     * <td><code>&quot;med-req-001&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.sessionId</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td>1–512 位字母、数字、点、下划线、冒号或连字符。续聊复用。</td>
     * <td><code>&quot;med-session-001&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.historyOwner</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td><code>GATEWAY</code> 或 <code>CLIENT</code>。区分大小写，同一会话保持一致。</td>
     * <td><code>&quot;CLIENT&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.appId</code></td>
     * <td>string</td>
     * <td>条件填写</td>
     * <td>凭据的固定应用</td>
     * <td>填写已授权的值。显式值为非空字符串，最多 256 个 UTF-16 代码单元，首尾无空白且不含控制字符。</td>
     * <td><code>&quot;your-app-id&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.appScene</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户场景标记。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户提供的业务用户信息。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.userId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>按用户身份规则判断</td>
     * <td>按已开通的用户绑定填写。显式值为非空字符串，最多 256 个 UTF-16 代码单元，首尾无空白且不含控制字符。</td>
     * <td><code>&quot;user-001&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.userIp</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户声明的用户 IP。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.userName</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户侧用户名。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.deviceId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户侧设备标识，最多 256 个 UTF-16 代码单元。可省略；媒体请求实际填写时须非空白且不含控制字符。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>data</code></td>
     * <td>object</td>
     * <td>是</td>
     * <td>—</td>
     * <td>本轮对话数据。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>data.messages</code></td>
     * <td>array</td>
     * <td>是</td>
     * <td>—</td>
     * <td>非空。<code>GATEWAY</code> 仅传本轮一条 user。<code>CLIENT</code> 按 user、assistant 成对提供历史，最后追加本轮 user。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].role</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td><code>user</code> 或 <code>assistant</code>。</td>
     * <td><code>&quot;user&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].content</code></td>
     * <td>string 或 array</td>
     * <td>是</td>
     * <td>—</td>
     * <td>文本或第 3 节所列内容块。</td>
     * <td><code>&quot;体检报告中的血红蛋白这一项是什么意思？&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>params</code></td>
     * <td>object</td>
     * <td>是</td>
     * <td>无</td>
     * <td>含必填字段 responseStreaming，其他 Agent 参数按需填写。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>params.directAgent</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td><code>med_qa</code></td>
     * <td>显式填写时只接受 <code>med_qa</code>。</td>
     * <td><code>&quot;med_qa&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>params.deepthink</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>不主动开启</td>
     * <td>显式使用字符串 <code>&quot;true&quot;</code> 开启，使用字符串 <code>&quot;false&quot;</code> 关闭。</td>
     * <td><code>&quot;false&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>params.outputAudio</code></td>
     * <td>boolean</td>
     * <td>否</td>
     * <td>不主动请求</td>
     * <td>可选 JSON 布尔值。业务已开通 HTTP 音频输出时，true 请求合成音频，false 或省略时不主动请求。按当前响应格式读取 audioFrames 或 SSE 音频帧。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>params.responseStreaming</code></td>
     * <td>boolean</td>
     * <td>是</td>
     * <td>无</td>
     * <td>必须显式填写 JSON 布尔值。<code>false</code> 返回完整 JSON，<code>true</code> 返回 SSE。</td>
     * <td><code>false</code></td>
     * </tr>
     * <tr>
     * <td>省略 directAgent 时使用 med_qa，显式传入时也只能填 med_qa。支持深思的授权场景传字符串 &quot;true&quot; 开启，传 &quot;false&quot; 或省略时不主动开启。 扩展字段以已开通服务公布的参数为准。 <code>GATEWAY</code> 每轮提供一条本轮 user。 <code>CLIENT</code> 可携带按 user/assistant 配对的历史，最后附本轮 user。历史 assistant 只传文本。续聊保持 sessionId、historyOwner 和同一业务身份，新一轮可使用新的 requestId。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>正文顶层使用 <code>communication</code>、<code>data</code> 和 <code>params</code>，<code>data</code> 中使用 <code>messages</code>。消息对象包含 <code>role</code> 与 <code>content</code>，扩展业务参数放在 <code>params</code> 中。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h2>3. 文本和图片</h2>
     * <pre><code class="language-ts">type ContentBlock =
     *   | { type: \\&quot;text\\&quot;; text: string }
     *   | { type: \\&quot;image_url\\&quot;; imageUrl: string | { url: string } };
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th>字段</th>
     * <th>类型</th>
     * <th>填写条件</th>
     * <th>默认值</th>
     * <th>说明</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>content[].type</code></td>
     * <td>string</td>
     * <td>使用内容块时</td>
     * <td>—</td>
     * <td>文字填 <code>text</code>，图片填 <code>image_url</code>。</td>
     * </tr>
     * <tr>
     * <td><code>content[].text</code></td>
     * <td>string</td>
     * <td>文本块</td>
     * <td>—</td>
     * <td>要发送的文字。</td>
     * </tr>
     * <tr>
     * <td><code>content[].imageUrl</code></td>
     * <td>string 或 object</td>
     * <td>图片块</td>
     * <td>—</td>
     * <td>可访问的 HTTPS 图片地址或 Base64 Data URL。</td>
     * </tr>
     * <tr>
     * <td><code>content[].imageUrl.url</code></td>
     * <td>string</td>
     * <td>图片引用为对象时</td>
     * <td>—</td>
     * <td>对象只包含这个字段。</td>
     * </tr>
     * <tr>
     * <td>图片块填写 type=image_url；imageUrl 可直接传字符串，也可传仅含 url 的对象。imageUrl.url 支持服务可访问的 HTTPS 图片 URL 或完整 Base64 Data URL，例如 data:image/png;base64, 后接 PNG 文件的标准 Base64，JPEG 使用 data:image/jpeg;base64, 前缀。前缀所声明的 MIME 应与图片内容一致。 申请开通的媒体格式、图片数量和大小以实际服务约定为准。媒体块内保留 <code>image_url</code> 枚举，字段名使用 <code>imageUrl</code>。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>本医疗 API 当前公开的输入范围是文本和图片，内容块使用 <code>text</code> 或 <code>image_url</code>。这里的 HTTP 音频输出能力不代表支持音频输入；不要据此发送文件、音频或视频内容块。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>图片引用可填非空字符串或仅含 <code>url</code> 的对象；图片块不传额外的 fileName，文本块只用 type 和 text。<code>userInfo.deviceId</code> 可省略，媒体请求实际填写时须非空白且不含控制字符。图片来源、数量、尺寸和大小仍须满足客户已开通的服务范围。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h2>4. 完整请求正文示例</h2>
     * <p>示例使用已固定业务应用的凭据。需要显式应用身份时补充获准的 <code>communication.appId</code>，发送时将 <code>X-Request-Id</code> 设置为正文请求号。</p>
     * <h3>4.1 纯文本</h3>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-agent-text-001&quot;,
     *     &quot;sessionId&quot;: &quot;med-agent-text-001-session&quot;,
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;role&quot;: &quot;user&quot;,
     *         &quot;content&quot;: &quot;请解释报告中参考区间的含义。&quot;
     *       }
     *     ]
     *   },
     *   &quot;params&quot;: {
     *     &quot;responseStreaming&quot;: false
     *   }
     * }
     * </code></pre>
     * <h3>4.2 HTTPS 图片</h3>
     * <p>将示例地址替换为服务可访问的真实图片地址。</p>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-agent-url-001&quot;,
     *     &quot;sessionId&quot;: &quot;med-agent-url-001-session&quot;,
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;role&quot;: &quot;user&quot;,
     *         &quot;content&quot;: [
     *           {
     *             &quot;type&quot;: &quot;text&quot;,
     *             &quot;text&quot;: &quot;请描述图片中可见的内容。&quot;
     *           },
     *           {
     *             &quot;type&quot;: &quot;image_url&quot;,
     *             &quot;imageUrl&quot;: {
     *               &quot;url&quot;: &quot;https://example.com/medical-image.png&quot;
     *             }
     *           }
     *         ]
     *       }
     *     ]
     *   },
     *   &quot;params&quot;: {
     *     &quot;responseStreaming&quot;: false
     *   }
     * }
     * </code></pre>
     * <h3>4.3 Base64 图片</h3>
     * <p>下方使用一张合成 PNG 演示字段位置。实际请求使用自己的完整编码。</p>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-agent-base64-001&quot;,
     *     &quot;sessionId&quot;: &quot;med-agent-base64-001-session&quot;,
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;role&quot;: &quot;user&quot;,
     *         &quot;content&quot;: [
     *           {
     *             &quot;type&quot;: &quot;text&quot;,
     *             &quot;text&quot;: &quot;请描述图片中可见的内容。&quot;
     *           },
     *           {
     *             &quot;type&quot;: &quot;image_url&quot;,
     *             &quot;imageUrl&quot;: {
     *               &quot;url&quot;: &quot;data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAIAAAAlC+aJAAAAb0lEQVR4nO3PAQkAAAyEwO9feoshgnABdLep8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3IPanc8OLDQitxAAAAAElFTkSuQmCC&quot;
     *             }
     *           }
     *         ]
     *       }
     *     ]
     *   },
     *   &quot;params&quot;: {
     *     &quot;responseStreaming&quot;: false
     *   }
     * }
     * </code></pre>
     * <p>需要 SSE 时，在以上请求中使用 <code>&quot;responseStreaming&quot;: true</code>，并可使用 <code>Accept: text/event-stream</code>。获取完整 JSON 时，显式传入 <code>false</code>。</p>
     * <h4>完整签名和调用示例</h4>
     * <p>示例从环境变量读取 POP_HOST、两套凭据和可选的 APP_ID、BUSINESS_USER_ID、SESSION_ID。POP_HOST 只填服务方提供的域名，不填协议和路径。脚本发送一条文本请求。设置 STREAM=true 可读取 SSE。</p>
     * <pre><code class="language-python">import datetime, hashlib, hmac, http.client, json, os, secrets, time
     * def sha(data):
     *     return hashlib.sha256(data).hexdigest()
     * def mac(secret, value):
     *     return hmac.new(secret.encode(&quot;utf-8&quot;), value.encode(&quot;utf-8&quot;), hashlib.sha256).hexdigest()
     * host = os.environ[&quot;POP_HOST&quot;]
     * path = &quot;/v1/api/medicalQa&quot;
     * request_id = &quot;chat-&quot; + secrets.token_hex(12)
     * stream = os.environ.get(&quot;STREAM&quot;, &quot;false&quot;).lower() == &quot;true&quot;
     * communication = {
     *     &quot;requestId&quot;: request_id,
     *     &quot;sessionId&quot;: os.environ.get(&quot;SESSION_ID&quot;, &quot;session-&quot; + secrets.token_hex(12)),
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;,
     * }
     * if os.environ.get(&quot;APP_ID&quot;):
     *     communication[&quot;appId&quot;] = os.environ[&quot;APP_ID&quot;]
     * if os.environ.get(&quot;BUSINESS_USER_ID&quot;):
     *     communication[&quot;userInfo&quot;] = {&quot;userId&quot;: os.environ[&quot;BUSINESS_USER_ID&quot;]}
     * body = {
     *     &quot;communication&quot;: communication,
     *     &quot;data&quot;: {&quot;messages&quot;: [{&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;请解释报告中参考区间的含义。&quot;}]},
     *     &quot;params&quot;: {&quot;responseStreaming&quot;: stream},
     * }
     * payload = json.dumps(body, ensure_ascii=False, separators=(&quot;,&quot;, &quot;:&quot;)).encode(&quot;utf-8&quot;)
     * payload_hash = sha(payload)
     * timestamp, nonce = str(time.time_ns() // 1_000_000), secrets.token_hex(16)
     * gateway_string = &quot;\\n&quot;.join((&quot;POST&quot;, path, &quot;&quot;, payload_hash, timestamp, nonce))
     * headers = {
     *     &quot;host&quot;: host,
     *     &quot;content-type&quot;: &quot;application/octet-stream&quot;,
     *     &quot;accept&quot;: &quot;text/event-stream&quot; if stream else &quot;application/json&quot;,
     *     &quot;x-acs-action&quot;: &quot;MedicalAgentChat&quot;,
     *     &quot;x-acs-version&quot;: &quot;2026-11-21&quot;,
     *     &quot;x-acs-date&quot;: datetime.datetime.now(datetime.timezone.utc).strftime(&quot;%Y-%m-%dT%H:%M:%SZ&quot;),
     *     &quot;x-acs-signature-nonce&quot;: secrets.token_hex(16),
     *     &quot;x-acs-content-sha256&quot;: payload_hash,
     *     &quot;x-gw-protocol&quot;: &quot;aliyun-roa&quot;,
     *     &quot;x-request-id&quot;: request_id,
     *     &quot;x-gw-access&quot;: os.environ[&quot;GW_ACCESS_KEY_ID&quot;],
     *     &quot;x-gw-timestamp&quot;: timestamp,
     *     &quot;x-gw-nonce&quot;: nonce,
     *     &quot;x-gw-signature&quot;: mac(os.environ[&quot;GW_ACCESS_KEY_SECRET&quot;], gateway_string),
     * }
     * if os.environ.get(&quot;POP_SECURITY_TOKEN&quot;):
     *     headers[&quot;x-acs-security-token&quot;] = os.environ[&quot;POP_SECURITY_TOKEN&quot;]
     * signed_names = sorted(k for k in headers if k in (&quot;host&quot;, &quot;content-type&quot;) or k.startswith(&quot;x-acs-&quot;))
     * canonical_headers = &quot;&quot;.join(k + &quot;:&quot; + headers[k].strip() + &quot;\\n&quot; for k in signed_names)
     * signed_headers = &quot;;&quot;.join(signed_names)
     * canonical_request = &quot;\\n&quot;.join((&quot;POST&quot;, path, &quot;&quot;, canonical_headers, signed_headers, payload_hash))
     * pop_signature = mac(os.environ[&quot;POP_ACCESS_KEY_SECRET&quot;], &quot;ACS3-HMAC-SHA256\\n&quot; + sha(canonical_request.encode(&quot;utf-8&quot;)))
     * headers[&quot;authorization&quot;] = (
     *     &quot;ACS3-HMAC-SHA256 Credential=&quot; + os.environ[&quot;POP_ACCESS_KEY_ID&quot;]
     *     + &quot;,SignedHeaders=&quot; + signed_headers + &quot;,Signature=&quot; + pop_signature
     * )
     * connection = http.client.HTTPSConnection(host, timeout=120)
     * try:
     *     connection.request(&quot;POST&quot;, path, body=payload, headers=headers)
     *     response = connection.getresponse()
     *     print(&quot;HTTP&quot;, response.status, &quot;业务 RequestId:&quot;, request_id,
     *           &quot;POP RequestId:&quot;, response.getheader(&quot;x-acs-request-id&quot;))
     *     if &quot;text/event-stream&quot; in (response.getheader(&quot;content-type&quot;) or &quot;&quot;).lower():
     *         # 打印保留 SSE 空行；业务集成应按空行组装事件并检查 complete/error。
     *         while True:
     *             line = response.readline()
     *             if not line:
     *                 break
     *             print(line.decode(&quot;utf-8&quot;), end=&quot;&quot;)
     *     else:
     *         print(response.read().decode(&quot;utf-8&quot;))
     * finally:
     *     connection.close()
     * </code></pre>
     * <h2>5. 响应</h2>
     * <pre><code class="language-ts">interface MedicalResponse {
     *   requestId?: string;
     *   communication?: { requestId?: string; sessionId?: string; responseId?: number };
     *   data?: {
     *     messages?: Array&lt;{
     *       mimeType?: string;
     *       status?: string;
     *       content?: unknown;
     *       metaData?: {
     *         sourceSeq?: string; type?: string; barTitle?: string; content?: unknown;
     *         multiLoad?: Array&lt;{ type?: string; sourceSeq?: string; content?: unknown }&gt;;
     *       };
     *     }&gt;;
     *     // 可选业务调试信息，可为 null；内容以实际返回为准。
     *     debug?: unknown;
     *     extraInfo?: { inputResources?: Array&lt;{
     *       contentIndex?: number; type?: string; resourceId?: string; url?: string; fileName?: string;
     *     }&gt; };
     *   };
     *   audioFrames?: Array&lt;{
     *     type?: string; data?: string; last?: boolean; code?: string; message?: string; requestId?: string;
     *   }&gt;;
     *   errorCode?: string | number;
     *   errorMsg?: string;
     *   error?: { code?: string | number; message?: string; requestId?: string };
     * }
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th>字段</th>
     * <th>类型</th>
     * <th>是否总有</th>
     * <th>默认值</th>
     * <th>说明</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>requestId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>业务关联号。POP 请求号见 x-acs-request-id。</td>
     * </tr>
     * <tr>
     * <td><code>communication</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户请求、会话与业务响应帧的关联信息。</td>
     * </tr>
     * <tr>
     * <td><code>communication.requestId/sessionId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>与该业务请求及会话关联。</td>
     * </tr>
     * <tr>
     * <td><code>communication.responseId</code></td>
     * <td>integer</td>
     * <td>否</td>
     * <td>—</td>
     * <td>业务响应帧标识。完整 JSON 聚合时可为 0，SSE 按接收顺序处理，编号无需连续。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>正文、过程或卡片消息，依据 mimeType 解析。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].mimeType</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>消息内容或过程类型。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].status</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>该条消息状态。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].content</code></td>
     * <td>JSON</td>
     * <td>否</td>
     * <td>—</td>
     * <td>当前消息正文或结构化内容。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].metaData</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>可选的医疗检索进度或正文卡片信息，依据所在消息的 mimeType 解析。</td>
     * </tr>
     * <tr>
     * <td><code>metaData.sourceSeq/type/barTitle/content</code></td>
     * <td>string 或 JSON</td>
     * <td>否</td>
     * <td>—</td>
     * <td>sourceSeq 关联同一进度模块；type 区分模块，barTitle 为可选标题，content 为该类型的可选业务内容。</td>
     * </tr>
     * <tr>
     * <td><code>metaData.multiLoad</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>正文卡片列表，各项可含 type、sourceSeq 和任意 JSON 的 content；可为空或省略，不保证每轮生成。</td>
     * </tr>
     * <tr>
     * <td><code>data.debug</code></td>
     * <td>任意 JSON（含 null）</td>
     * <td>否</td>
     * <td>—</td>
     * <td>可选业务调试信息。是否返回、出现时机和内容按实际执行结果；不保证每轮或结束事件必有，也不用于判断业务完成。</td>
     * </tr>
     * <tr>
     * <td><code>data.extraInfo.inputResources</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>有结果时提供输入资源处理信息。各项可含 contentIndex、type、resourceId、url 和 fileName。</td>
     * </tr>
     * <tr>
     * <td><code>audioFrames</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>已开通对应输出时可能返回音频帧。各项可含 type、Base64 数据 data、末帧 last 或错误 code、message、requestId。</td>
     * </tr>
     * <tr>
     * <td><code>errorCode</code></td>
     * <td>string 或 number</td>
     * <td>否</td>
     * <td>—</td>
     * <td>0 表示业务成功。非 0 时读取 errorMsg 或 error，SSE 同时处理 error 事件。</td>
     * </tr>
     * <tr>
     * <td><code>errorMsg</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>服务返回的状态描述。</td>
     * </tr>
     * <tr>
     * <td><code>error</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>结构化业务错误，按 code 判断。</td>
     * </tr>
     * <tr>
     * <td>医疗 Agent 的过程消息与正文分开处理：SSE 中可能返回 <code>mimeType=bar/progress</code> 的消息，<code>metaData.sourceSeq</code> 关联同一模块的更新。资料检索模块的 <code>metaData.type</code> 可为 <code>bar_ref_source_inline</code>，其 <code>metaData.content</code> 可含 <code>query_list</code>（检索词数组）、<code>docs</code>（当前资料对象数组）和 <code>status</code>。这两个数组键按实际报文保留拼写。<code>docs</code> 中的字段随资料来源变化，可能为空，不要求每个对象都具备同一组字段。过程消息只按实际收到的内容展示，不保证每轮都有。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>正文可能包含 <code>[(sourceSeq)]</code> 卡片占位，与 <code>metaData.multiLoad</code> 中同一 <code>sourceSeq</code> 的卡片关联；卡片的 <code>type</code> 和 <code>content</code> 按实际返回解析，不能把普通资料列表自行当成正文卡片。遇到未支持的卡片类型，可跳过卡片并继续读取正文。一次完整 JSON 仍按 <code>data.messages</code> 读取应答，不能要求它复现 SSE 中的全部中间过程。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>一次完整 JSON 的成功示例</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><code>debug: null</code> 仅演示此可选字段的空值形状，不表示每次都会返回。客户端不应据此推定固定的调试子字段。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-agent-text-001&quot;,
     *     &quot;responseId&quot;: 0
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;mimeType&quot;: &quot;multi_load/iframe&quot;,
     *         &quot;status&quot;: &quot;complete&quot;,
     *         &quot;content&quot;: &quot;请结合报告上的参考区间理解各项指标。&quot;,
     *         &quot;metaData&quot;: {
     *           &quot;multiLoad&quot;: []
     *         }
     *       }
     *     ],
     *     &quot;debug&quot;: null
     *   },
     *   &quot;errorCode&quot;: 0,
     *   &quot;errorMsg&quot;: &quot;success&quot;
     * }
     * </code></pre>
     * <p>SSE 示例</p>
     * <pre><code class="language-text">data:{&quot;communication&quot;:{&quot;requestId&quot;:&quot;med-agent-text-001&quot;,&quot;responseId&quot;:0},&quot;data&quot;:{&quot;messages&quot;:[{&quot;mimeType&quot;:&quot;multi_load/iframe&quot;,&quot;status&quot;:&quot;processing&quot;,&quot;content&quot;:&quot;请结合报告上的参考区间。&quot;,&quot;metaData&quot;:{&quot;multiLoad&quot;:[]}}]},&quot;errorCode&quot;:0,&quot;errorMsg&quot;:&quot;success&quot;}
     * event:complete
     * data:{&quot;communication&quot;:{&quot;requestId&quot;:&quot;med-agent-text-001&quot;,&quot;responseId&quot;:1},&quot;data&quot;:{&quot;messages&quot;:[{&quot;mimeType&quot;:&quot;multi_load/iframe&quot;,&quot;status&quot;:&quot;complete&quot;,&quot;content&quot;:&quot;请结合报告上的参考区间理解各项指标。&quot;,&quot;metaData&quot;:{&quot;multiLoad&quot;:[]}}]},&quot;errorCode&quot;:0,&quot;errorMsg&quot;:&quot;success&quot;}
     * </code></pre>
     * <p>SSE 按空行分隔事件。complete 可能携带最终正文，也可能携带空对象，先处理其中已有的业务数据再结束。正文累计快照按更新替换，卡片按 sourceSeq 等业务标识处理。流内收到 error、断开且缺少正常终帧、或收到业务错误时按失败处理。HTTP 请求号与业务请求号分别记录，便于联调排查。</p>
     * <h2>6. 错误与重试</h2>
     * <p>先检查 HTTP 状态。HTTP 200 时继续检查业务 errorCode 或结构化 error，SSE 还要读取流内事件至 complete 或 error。流开始后的错误可在 HTTP 200 的连接中通过 event:error 返回。</p>
     * <table>
     * <thead>
     * <tr>
     * <th>状况</th>
     * <th>处理</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>INVALID_REQUEST</code>、<code>IMAGE_PROCESSING_ERROR</code>，HTTP 400</td>
     * <td>核对字段类型、会话、图片编码和媒体授权，修正请求。</td>
     * </tr>
     * <tr>
     * <td>POP 鉴权错误，或 <code>AUTH_INVALID_KEY</code>、<code>AUTH_INVALID_SIGNATURE</code>、<code>AUTH_TIMESTAMP_EXPIRED</code>、<code>AUTH_NONCE_REPLAY</code>，业务网关 HTTP 401</td>
     * <td>按对应认证层核对凭据、正文哈希、时间戳与 nonce。签名已过期或 nonce 已使用时，为新尝试重新签名。</td>
     * </tr>
     * <tr>
     * <td><code>DIRECT_AGENT_FORBIDDEN</code>、<code>AUTH_APP_FORBIDDEN</code>、<code>AUTH_URI_FORBIDDEN</code>，HTTP 403</td>
     * <td>核对应用身份、接口权限及已开通的模型或 Agent。</td>
     * </tr>
     * <tr>
     * <td><code>SESSION_ACCESS_DENIED</code>，HTTP 403</td>
     * <td>核对会话与当前业务身份的归属，保持续聊身份一致，不使用其他用户的会话。</td>
     * </tr>
     * <tr>
     * <td><code>ADMISSION_SERVICE_SUSPENDED</code>、<code>PLATFORM_ACCESS_DISABLED</code>、<code>AUTH_DISABLED</code>，HTTP 403</td>
     * <td>当前服务、接口或凭据不可用，联系服务方确认恢复或授权，勿持续重试。</td>
     * </tr>
     * <tr>
     * <td><code>PAYLOAD_TOO_LARGE</code>，HTTP 413</td>
     * <td>缩小正文或图片，按服务约定的大小、像素和资源限制重新提交。</td>
     * </tr>
     * <tr>
     * <td><code>SESSION_BUSY</code>、<code>SESSION_CONFLICT</code>，HTTP 409</td>
     * <td>等待在途请求结束，核对同一会话的身份和历史托管方后再调用。</td>
     * </tr>
     * <tr>
     * <td>限流、配额或下游短时不可用，HTTP 429</td>
     * <td>区分可恢复的限流与需要处理授权或配额的情况。适用重试时采用退避，有可用 Retry-After 时采用其秒数。</td>
     * </tr>
     * <tr>
     * <td><code>DOWNSTREAM_TIMEOUT</code>，HTTP 504，或流内错误、超时、断线</td>
     * <td>记录业务请求号和 POP 请求号。重试前核对原请求的执行情况，新尝试使用新的时间戳、nonce 和签名。</td>
     * </tr>
     * <tr>
     * <td>失败 JSON 示例</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code class="language-json">{
     *   &quot;error&quot;: {
     *     &quot;code&quot;: &quot;INVALID_REQUEST&quot;,
     *     &quot;message&quot;: &quot;请检查请求参数。&quot;,
     *     &quot;requestId&quot;: &quot;med-agent-text-001&quot;
     *   }
     * }
     * </code></pre>
     * <p>流开始后的错误示例</p>
     * <pre><code class="language-text">event:error
     * data:{&quot;communication&quot;:{&quot;requestId&quot;:&quot;med-agent-text-001&quot;},&quot;errorCode&quot;:&quot;DOWNSTREAM_TIMEOUT&quot;,&quot;errorMsg&quot;:&quot;downstream timeout&quot;}
     * </code></pre>
     * <p>新请求生成新的时间戳、nonce 和签名。请求号用于关联，重复使用同一个值可能再次执行请求。</p>
     * 
     * <b>summary</b> : 
     * <p>向千问医疗 Agent 提问并获取回答</p>
     * 
     * @param request MedicalAgentChatRequest
     * @return MedicalAgentChatResponse
     */
    public MedicalAgentChatResponse medicalAgentChat(MedicalAgentChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MedicalAgentChatHeaders headers = new MedicalAgentChatHeaders();
        return this.medicalAgentChatWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>医疗模型推理接入说明</h1>
     * <p>医疗模型推理通过 UTF-8 JSON 接收文本和已开通的图片内容，提供一次完整 JSON 或 SSE 流式响应。</p>
     * <h2>1. 调用与鉴权</h2>
     * <table>
     * <thead>
     * <tr>
     * <th>项目</th>
     * <th>写法</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>产品与版本</td>
     * <td><code>QwenB2BMed / 2026-11-21</code></td>
     * </tr>
     * <tr>
     * <td>Action</td>
     * <td><code>MedicalModelInference</code></td>
     * </tr>
     * <tr>
     * <td>方法和路径</td>
     * <td><code>POST /v1/api/directModel</code></td>
     * </tr>
     * <tr>
     * <td>域名</td>
     * <td>使用服务方提供的目标环境 POP Endpoint</td>
     * </tr>
     * <tr>
     * <td>RAM Action</td>
     * <td><code>qwenb2bmed:MedicalModelInference</code></td>
     * </tr>
     * <tr>
     * <td>编码</td>
     * <td><code>Content-Type: application/octet-stream</code>，正文与签名使用同一份 UTF-8 字节</td>
     * </tr>
     * <tr>
     * <td>字段协议</td>
     * <td>小驼峰正文发送 <code>X-GW-Protocol: aliyun-roa</code></td>
     * </tr>
     * <tr>
     * <td>阿里云 POP ACS3 使用阿里云 AK/SK 或 STS 凭据。业务 HMAC 使用服务方发放的业务 AK/SK。选择器和媒体能力须获得相应授权。</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>请求头</td>
     * <td>类型</td>
     * </tr>
     * <tr>
     * <td>---</td>
     * <td>---</td>
     * </tr>
     * <tr>
     * <td><code>X-Request-Id</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Protocol</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Access</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Timestamp</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Nonce</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Signature</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>Accept</code>（标准 HTTP 请求头）</td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-DashScope-SSE</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td>每个请求都必须在正文中传入 JSON 布尔值 <code>params.responseStreaming</code>。传 <code>false</code> 返回完整 JSON，传 <code>true</code> 返回 SSE。即使设置了 <code>Accept</code> 或 <code>X-DashScope-SSE</code>，也须填写此字段。</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>POP 签名器生成 <code>Authorization</code>、<code>x-acs-action</code>、<code>x-acs-version</code>、<code>x-acs-date</code>、<code>x-acs-signature-nonce</code> 和 <code>x-acs-content-sha256</code>。使用 STS 时按签名器要求传安全令牌。业务 SK 与 POP SK 各自在本地用于签名。</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>业务签名的规范串依次为 METHOD、PATH、CANONICAL_QUERY、BODY_SHA256_HEX、TIMESTAMP、NONCE。各段用单个 LF 连接，末尾无额外 LF。无 query 时第三段留空。有 query 时使用实际请求的编码结果，按 <code>&amp;</code> 拆分、去空项、对整项排序并重新用 <code>&amp;</code> 连接。SHA-256 按实际发送的 UTF-8 正文字节计算。对规范串做 HMAC-SHA256，输出小写十六进制。使用本接口签名并发起请求的 Python 脚本见第 4 节末尾的「完整签名和调用示例」。</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h2>2. 请求字段与会话</h2>
     * <p>将下表中的业务对象序列化为 UTF-8 JSON 字节，并用这份字节计算业务签名。使用 HTTP 客户端时，以 <code>Content-Type: application/octet-stream</code> 将同一份字节直接写入 POST 正文。使用阿里云通用 OpenAPI SDK 时，将这些字节的可读流设置到 <code>OpenApiRequest.stream</code>，填写第 1 节的业务请求头，并指定第 1 节的 Action、Version、ROA 路径和方法。</p>
     * <pre><code class="language-ts">interface MedicalRequest {
     *   // 会话关联和已授权的业务身份。
     *   communication: {
     *     requestId: string;
     *     sessionId: string;
     *     historyOwner: \\&quot;CLIENT\\&quot; | \\&quot;GATEWAY\\&quot;;
     *     appId?: string;
     *     appScene?: string;
     *     userInfo?: { userId?: string; userIp?: string; userName?: string; deviceId?: string };
     *   };
     *   // 非空消息数组。最后一条是本轮 user。
     *   data: { messages: Array&lt;{ role: \\&quot;user\\&quot; | \\&quot;assistant\\&quot;; content: string | ContentBlock[] }&gt; };
     *   // 选择器和本次响应格式见下表。
     *   params: { modelName: \\&quot;med_qwen4-vl-125\\&quot;; responseStreaming: boolean; outputAudio?: boolean; [name: string]: unknown };
     * }
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th>字段</th>
     * <th>类型</th>
     * <th>必填</th>
     * <th>默认值</th>
     * <th>说明</th>
     * <th>示例</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>communication</code></td>
     * <td>object</td>
     * <td>是</td>
     * <td>—</td>
     * <td>本轮请求、会话及客户身份。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.requestId</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td>1–128 位字母、数字、点、下划线、冒号或连字符。与请求头 <code>X-Request-Id</code> 完全一致，<code>gw-ingress-</code> 前缀为保留值。</td>
     * <td><code>&quot;med-req-001&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.sessionId</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td>1–512 位字母、数字、点、下划线、冒号或连字符。续聊复用。</td>
     * <td><code>&quot;med-session-001&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.historyOwner</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td><code>GATEWAY</code> 或 <code>CLIENT</code>。区分大小写，同一会话保持一致。</td>
     * <td><code>&quot;CLIENT&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.appId</code></td>
     * <td>string</td>
     * <td>条件填写</td>
     * <td>凭据的固定应用</td>
     * <td>填写已授权的值。显式值为非空字符串，最多 256 个 UTF-16 代码单元，首尾无空白且不含控制字符。</td>
     * <td><code>&quot;your-app-id&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.appScene</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户场景标记。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户提供的业务用户信息。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.userId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>按用户身份规则判断</td>
     * <td>按已开通的用户绑定填写。显式值为非空字符串，最多 256 个 UTF-16 代码单元，首尾无空白且不含控制字符。</td>
     * <td><code>&quot;user-001&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.userIp</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户声明的用户 IP。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.userName</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户侧用户名。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.deviceId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户侧设备标识，最多 256 个 UTF-16 代码单元。可省略；媒体请求实际填写时须非空白且不含控制字符。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>data</code></td>
     * <td>object</td>
     * <td>是</td>
     * <td>—</td>
     * <td>本轮对话数据。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>data.messages</code></td>
     * <td>array</td>
     * <td>是</td>
     * <td>—</td>
     * <td>非空。<code>GATEWAY</code> 仅传本轮一条 user。<code>CLIENT</code> 按 user、assistant 成对提供历史，最后追加本轮 user。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].role</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td><code>user</code> 或 <code>assistant</code>。</td>
     * <td><code>&quot;user&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].content</code></td>
     * <td>string 或 array</td>
     * <td>是</td>
     * <td>—</td>
     * <td>文本或第 3 节所列内容块。</td>
     * <td><code>&quot;体检报告中的血红蛋白这一项是什么意思？&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>params</code></td>
     * <td>object</td>
     * <td>是</td>
     * <td>—</td>
     * <td>模型选择和推理参数。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>params.modelName</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td>选择已开通的模型。值区分大小写，首尾无空白。当前版本为 <code>med_qwen4-vl-125</code>。</td>
     * <td><code>&quot;med_qwen4-vl-125&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>params.outputAudio</code></td>
     * <td>boolean</td>
     * <td>否</td>
     * <td>不主动请求</td>
     * <td>可选 JSON 布尔值。业务已开通 HTTP 音频输出时，true 请求合成音频，false 或省略时不主动请求。按当前响应格式读取 audioFrames 或 SSE 音频帧。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>params.responseStreaming</code></td>
     * <td>boolean</td>
     * <td>是</td>
     * <td>无</td>
     * <td>必须显式填写 JSON 布尔值。<code>false</code> 返回完整 JSON，<code>true</code> 返回 SSE。</td>
     * <td><code>false</code></td>
     * </tr>
     * <tr>
     * <td>modelName 填服务方为客户开通的模型选择器，当前版本为 med_qwen4-vl-125。本入口使用 modelName 选择模型，<code>params.directAgent</code> 会导致请求失败。当前公开的 med_qwen4-vl-125 模型服务执行非思考推理，按该模型已开通的文本和图像能力调用。 扩展字段以已开通服务公布的参数为准。 <code>GATEWAY</code> 每轮提供一条本轮 user。 <code>CLIENT</code> 可携带按 user/assistant 配对的历史，最后附本轮 user。历史 assistant 只传文本。续聊保持 sessionId、historyOwner 和同一业务身份，新一轮可使用新的 requestId。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>正文顶层使用 <code>communication</code>、<code>data</code> 和 <code>params</code>，<code>data</code> 中使用 <code>messages</code>。消息对象包含 <code>role</code> 与 <code>content</code>，扩展业务参数放在 <code>params</code> 中。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h2>3. 文本和图片</h2>
     * <pre><code class="language-ts">type ContentBlock =
     *   | { type: \\&quot;text\\&quot;; text: string }
     *   | { type: \\&quot;image_url\\&quot;; imageUrl: string | { url: string } };
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th>字段</th>
     * <th>类型</th>
     * <th>填写条件</th>
     * <th>默认值</th>
     * <th>说明</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>content[].type</code></td>
     * <td>string</td>
     * <td>使用内容块时</td>
     * <td>—</td>
     * <td>文字填 <code>text</code>，图片填 <code>image_url</code>。</td>
     * </tr>
     * <tr>
     * <td><code>content[].text</code></td>
     * <td>string</td>
     * <td>文本块</td>
     * <td>—</td>
     * <td>要发送的文字。</td>
     * </tr>
     * <tr>
     * <td><code>content[].imageUrl</code></td>
     * <td>string 或 object</td>
     * <td>图片块</td>
     * <td>—</td>
     * <td>可访问的 HTTPS 图片地址或 Base64 Data URL。</td>
     * </tr>
     * <tr>
     * <td><code>content[].imageUrl.url</code></td>
     * <td>string</td>
     * <td>图片引用为对象时</td>
     * <td>—</td>
     * <td>对象只包含这个字段。</td>
     * </tr>
     * <tr>
     * <td>图片块填写 type=image_url；imageUrl 可直接传字符串，也可传仅含 url 的对象。imageUrl.url 支持服务可访问的 HTTPS 图片 URL 或完整 Base64 Data URL，例如 data:image/png;base64, 后接 PNG 文件的标准 Base64，JPEG 使用 data:image/jpeg;base64, 前缀。前缀所声明的 MIME 应与图片内容一致。 申请开通的媒体格式、图片数量和大小以实际服务约定为准。媒体块内保留 <code>image_url</code> 枚举，字段名使用 <code>imageUrl</code>。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>本医疗 API 当前公开的输入范围是文本和图片，内容块使用 <code>text</code> 或 <code>image_url</code>。这里的 HTTP 音频输出能力不代表支持音频输入；不要据此发送文件、音频或视频内容块。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>图片引用可填非空字符串或仅含 <code>url</code> 的对象；图片块不传额外的 fileName，文本块只用 type 和 text。<code>userInfo.deviceId</code> 可省略，媒体请求实际填写时须非空白且不含控制字符。图片来源、数量、尺寸和大小仍须满足客户已开通的服务范围。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h2>4. 完整请求正文示例</h2>
     * <p>示例使用已固定业务应用的凭据。需要显式应用身份时补充获准的 <code>communication.appId</code>，发送时将 <code>X-Request-Id</code> 设置为正文请求号。</p>
     * <h3>4.1 纯文本</h3>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-model-text-001&quot;,
     *     &quot;sessionId&quot;: &quot;med-model-text-001-session&quot;,
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;role&quot;: &quot;user&quot;,
     *         &quot;content&quot;: &quot;请解释报告中参考区间的含义。&quot;
     *       }
     *     ]
     *   },
     *   &quot;params&quot;: {
     *     &quot;responseStreaming&quot;: false,
     *     &quot;modelName&quot;: &quot;med_qwen4-vl-125&quot;
     *   }
     * }
     * </code></pre>
     * <h3>4.2 HTTPS 图片</h3>
     * <p>将示例地址替换为服务可访问的真实图片地址。</p>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-model-url-001&quot;,
     *     &quot;sessionId&quot;: &quot;med-model-url-001-session&quot;,
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;role&quot;: &quot;user&quot;,
     *         &quot;content&quot;: [
     *           {
     *             &quot;type&quot;: &quot;text&quot;,
     *             &quot;text&quot;: &quot;请描述图片中可见的内容。&quot;
     *           },
     *           {
     *             &quot;type&quot;: &quot;image_url&quot;,
     *             &quot;imageUrl&quot;: {
     *               &quot;url&quot;: &quot;https://example.com/medical-image.png&quot;
     *             }
     *           }
     *         ]
     *       }
     *     ]
     *   },
     *   &quot;params&quot;: {
     *     &quot;responseStreaming&quot;: false,
     *     &quot;modelName&quot;: &quot;med_qwen4-vl-125&quot;
     *   }
     * }
     * </code></pre>
     * <h3>4.3 Base64 图片</h3>
     * <p>下方使用一张合成 PNG 演示字段位置。实际请求使用自己的完整编码。</p>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-model-base64-001&quot;,
     *     &quot;sessionId&quot;: &quot;med-model-base64-001-session&quot;,
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;role&quot;: &quot;user&quot;,
     *         &quot;content&quot;: [
     *           {
     *             &quot;type&quot;: &quot;text&quot;,
     *             &quot;text&quot;: &quot;请描述图片中可见的内容。&quot;
     *           },
     *           {
     *             &quot;type&quot;: &quot;image_url&quot;,
     *             &quot;imageUrl&quot;: {
     *               &quot;url&quot;: &quot;data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAIAAAAlC+aJAAAAb0lEQVR4nO3PAQkAAAyEwO9feoshgnABdLep8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3IPanc8OLDQitxAAAAAElFTkSuQmCC&quot;
     *             }
     *           }
     *         ]
     *       }
     *     ]
     *   },
     *   &quot;params&quot;: {
     *     &quot;responseStreaming&quot;: false,
     *     &quot;modelName&quot;: &quot;med_qwen4-vl-125&quot;
     *   }
     * }
     * </code></pre>
     * <p>需要 SSE 时，在以上请求中使用 <code>&quot;responseStreaming&quot;: true</code>，并可使用 <code>Accept: text/event-stream</code>。获取完整 JSON 时，显式传入 <code>false</code>。</p>
     * <h4>完整签名和调用示例</h4>
     * <p>示例从环境变量读取 POP_HOST、两套凭据和可选的 APP_ID、BUSINESS_USER_ID、SESSION_ID。POP_HOST 只填服务方提供的域名，不填协议和路径。脚本发送一条文本请求。设置 STREAM=true 可读取 SSE。</p>
     * <pre><code class="language-python">import datetime, hashlib, hmac, http.client, json, os, secrets, time
     * def sha(data):
     *     return hashlib.sha256(data).hexdigest()
     * def mac(secret, value):
     *     return hmac.new(secret.encode(&quot;utf-8&quot;), value.encode(&quot;utf-8&quot;), hashlib.sha256).hexdigest()
     * host = os.environ[&quot;POP_HOST&quot;]
     * path = &quot;/v1/api/directModel&quot;
     * request_id = &quot;chat-&quot; + secrets.token_hex(12)
     * stream = os.environ.get(&quot;STREAM&quot;, &quot;false&quot;).lower() == &quot;true&quot;
     * communication = {
     *     &quot;requestId&quot;: request_id,
     *     &quot;sessionId&quot;: os.environ.get(&quot;SESSION_ID&quot;, &quot;session-&quot; + secrets.token_hex(12)),
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;,
     * }
     * if os.environ.get(&quot;APP_ID&quot;):
     *     communication[&quot;appId&quot;] = os.environ[&quot;APP_ID&quot;]
     * if os.environ.get(&quot;BUSINESS_USER_ID&quot;):
     *     communication[&quot;userInfo&quot;] = {&quot;userId&quot;: os.environ[&quot;BUSINESS_USER_ID&quot;]}
     * body = {
     *     &quot;communication&quot;: communication,
     *     &quot;data&quot;: {&quot;messages&quot;: [{&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;请解释报告中参考区间的含义。&quot;}]},
     *     &quot;params&quot;: {&quot;modelName&quot;: &quot;med_qwen4-vl-125&quot;, &quot;responseStreaming&quot;: stream},
     * }
     * payload = json.dumps(body, ensure_ascii=False, separators=(&quot;,&quot;, &quot;:&quot;)).encode(&quot;utf-8&quot;)
     * payload_hash = sha(payload)
     * timestamp, nonce = str(time.time_ns() // 1_000_000), secrets.token_hex(16)
     * gateway_string = &quot;\\n&quot;.join((&quot;POST&quot;, path, &quot;&quot;, payload_hash, timestamp, nonce))
     * headers = {
     *     &quot;host&quot;: host,
     *     &quot;content-type&quot;: &quot;application/octet-stream&quot;,
     *     &quot;accept&quot;: &quot;text/event-stream&quot; if stream else &quot;application/json&quot;,
     *     &quot;x-acs-action&quot;: &quot;MedicalModelInference&quot;,
     *     &quot;x-acs-version&quot;: &quot;2026-11-21&quot;,
     *     &quot;x-acs-date&quot;: datetime.datetime.now(datetime.timezone.utc).strftime(&quot;%Y-%m-%dT%H:%M:%SZ&quot;),
     *     &quot;x-acs-signature-nonce&quot;: secrets.token_hex(16),
     *     &quot;x-acs-content-sha256&quot;: payload_hash,
     *     &quot;x-gw-protocol&quot;: &quot;aliyun-roa&quot;,
     *     &quot;x-request-id&quot;: request_id,
     *     &quot;x-gw-access&quot;: os.environ[&quot;GW_ACCESS_KEY_ID&quot;],
     *     &quot;x-gw-timestamp&quot;: timestamp,
     *     &quot;x-gw-nonce&quot;: nonce,
     *     &quot;x-gw-signature&quot;: mac(os.environ[&quot;GW_ACCESS_KEY_SECRET&quot;], gateway_string),
     * }
     * if os.environ.get(&quot;POP_SECURITY_TOKEN&quot;):
     *     headers[&quot;x-acs-security-token&quot;] = os.environ[&quot;POP_SECURITY_TOKEN&quot;]
     * signed_names = sorted(k for k in headers if k in (&quot;host&quot;, &quot;content-type&quot;) or k.startswith(&quot;x-acs-&quot;))
     * canonical_headers = &quot;&quot;.join(k + &quot;:&quot; + headers[k].strip() + &quot;\\n&quot; for k in signed_names)
     * signed_headers = &quot;;&quot;.join(signed_names)
     * canonical_request = &quot;\\n&quot;.join((&quot;POST&quot;, path, &quot;&quot;, canonical_headers, signed_headers, payload_hash))
     * pop_signature = mac(os.environ[&quot;POP_ACCESS_KEY_SECRET&quot;], &quot;ACS3-HMAC-SHA256\\n&quot; + sha(canonical_request.encode(&quot;utf-8&quot;)))
     * headers[&quot;authorization&quot;] = (
     *     &quot;ACS3-HMAC-SHA256 Credential=&quot; + os.environ[&quot;POP_ACCESS_KEY_ID&quot;]
     *     + &quot;,SignedHeaders=&quot; + signed_headers + &quot;,Signature=&quot; + pop_signature
     * )
     * connection = http.client.HTTPSConnection(host, timeout=120)
     * try:
     *     connection.request(&quot;POST&quot;, path, body=payload, headers=headers)
     *     response = connection.getresponse()
     *     print(&quot;HTTP&quot;, response.status, &quot;业务 RequestId:&quot;, request_id,
     *           &quot;POP RequestId:&quot;, response.getheader(&quot;x-acs-request-id&quot;))
     *     if &quot;text/event-stream&quot; in (response.getheader(&quot;content-type&quot;) or &quot;&quot;).lower():
     *         # 打印保留 SSE 空行；业务集成应按空行组装事件并检查 complete/error。
     *         while True:
     *             line = response.readline()
     *             if not line:
     *                 break
     *             print(line.decode(&quot;utf-8&quot;), end=&quot;&quot;)
     *     else:
     *         print(response.read().decode(&quot;utf-8&quot;))
     * finally:
     *     connection.close()
     * </code></pre>
     * <h2>5. 响应</h2>
     * <pre><code class="language-ts">interface MedicalResponse {
     *   requestId?: string;
     *   communication?: { requestId?: string; sessionId?: string; responseId?: number };
     *   data?: {
     *     messages?: Array&lt;{
     *       mimeType?: string;
     *       status?: string;
     *       content?: unknown;
     *       metaData?: {
     *         sourceSeq?: string; type?: string; barTitle?: string; content?: unknown;
     *         multiLoad?: Array&lt;{ type?: string; sourceSeq?: string; content?: unknown }&gt;;
     *       };
     *     }&gt;;
     *     // 可选业务调试信息，可为 null；内容以实际返回为准。
     *     debug?: unknown;
     *     extraInfo?: { inputResources?: Array&lt;{
     *       contentIndex?: number; type?: string; resourceId?: string; url?: string; fileName?: string;
     *     }&gt; };
     *   };
     *   audioFrames?: Array&lt;{
     *     type?: string; data?: string; last?: boolean; code?: string; message?: string; requestId?: string;
     *   }&gt;;
     *   errorCode?: string | number;
     *   errorMsg?: string;
     *   error?: { code?: string | number; message?: string; requestId?: string };
     * }
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th>字段</th>
     * <th>类型</th>
     * <th>是否总有</th>
     * <th>默认值</th>
     * <th>说明</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>requestId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>业务关联号。POP 请求号见 x-acs-request-id。</td>
     * </tr>
     * <tr>
     * <td><code>communication</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户请求、会话与业务响应帧的关联信息。</td>
     * </tr>
     * <tr>
     * <td><code>communication.requestId/sessionId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>与该业务请求及会话关联。</td>
     * </tr>
     * <tr>
     * <td><code>communication.responseId</code></td>
     * <td>integer</td>
     * <td>否</td>
     * <td>—</td>
     * <td>业务响应帧标识。完整 JSON 聚合时可为 0，SSE 按接收顺序处理，编号无需连续。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>正文、过程或卡片消息，依据 mimeType 解析。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].mimeType</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>消息内容或过程类型。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].status</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>该条消息状态。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].content</code></td>
     * <td>JSON</td>
     * <td>否</td>
     * <td>—</td>
     * <td>当前消息正文或结构化内容。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].metaData</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>可选的消息附加信息；当前模型不承诺返回医疗 Agent 的检索进度、来源列表或业务卡片。</td>
     * </tr>
     * <tr>
     * <td><code>metaData.sourceSeq/type/barTitle/content</code></td>
     * <td>string 或 JSON</td>
     * <td>否</td>
     * <td>—</td>
     * <td>存在时按实际返回的标识、类型、标题和内容解释；不是本模型接口的固定必返字段。</td>
     * </tr>
     * <tr>
     * <td><code>metaData.multiLoad</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>为兼容已有响应形状保留的可选列表，可为空或省略；当前模型不保证生成 Agent 业务卡片。</td>
     * </tr>
     * <tr>
     * <td><code>data.debug</code></td>
     * <td>任意 JSON（含 null）</td>
     * <td>否</td>
     * <td>—</td>
     * <td>可选业务调试信息。是否返回、出现时机和内容按实际执行结果；不保证每轮或结束事件必有，也不用于判断业务完成。</td>
     * </tr>
     * <tr>
     * <td><code>data.extraInfo.inputResources</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>有结果时提供输入资源处理信息。各项可含 contentIndex、type、resourceId、url 和 fileName。</td>
     * </tr>
     * <tr>
     * <td><code>audioFrames</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>已开通对应输出时可能返回音频帧。各项可含 type、Base64 数据 data、末帧 last 或错误 code、message、requestId。</td>
     * </tr>
     * <tr>
     * <td><code>errorCode</code></td>
     * <td>string 或 number</td>
     * <td>否</td>
     * <td>—</td>
     * <td>0 表示业务成功。非 0 时读取 errorMsg 或 error，SSE 同时处理 error 事件。</td>
     * </tr>
     * <tr>
     * <td><code>errorMsg</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>服务返回的状态描述。</td>
     * </tr>
     * <tr>
     * <td><code>error</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>结构化业务错误，按 code 判断。</td>
     * </tr>
     * <tr>
     * <td>当前医疗模型推理主要返回模型回答正文，按 <code>mimeType=multi_load/iframe</code> 读取 <code>content</code>；SSE 中正文可以累计快照更新，完整 JSON 返回聚合后的正文。不要由可选 <code>metaData</code> 字段推断本接口提供医疗 Agent 的检索过程、资料来源或业务卡片。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>一次完整 JSON 的成功示例</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><code>debug: null</code> 仅演示此可选字段的空值形状，不表示每次都会返回。客户端不应据此推定固定的调试子字段。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-model-text-001&quot;,
     *     &quot;responseId&quot;: 0
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;mimeType&quot;: &quot;multi_load/iframe&quot;,
     *         &quot;status&quot;: &quot;complete&quot;,
     *         &quot;content&quot;: &quot;请结合报告上的参考区间理解各项指标。&quot;,
     *         &quot;metaData&quot;: {
     *           &quot;multiLoad&quot;: []
     *         }
     *       }
     *     ],
     *     &quot;debug&quot;: null
     *   },
     *   &quot;errorCode&quot;: 0,
     *   &quot;errorMsg&quot;: &quot;success&quot;
     * }
     * </code></pre>
     * <p>SSE 示例</p>
     * <pre><code class="language-text">data:{&quot;communication&quot;:{&quot;requestId&quot;:&quot;med-model-text-001&quot;,&quot;responseId&quot;:0},&quot;data&quot;:{&quot;messages&quot;:[{&quot;mimeType&quot;:&quot;multi_load/iframe&quot;,&quot;status&quot;:&quot;processing&quot;,&quot;content&quot;:&quot;请结合报告上的参考区间。&quot;,&quot;metaData&quot;:{&quot;multiLoad&quot;:[]}}]},&quot;errorCode&quot;:0,&quot;errorMsg&quot;:&quot;success&quot;}
     * event:complete
     * data:{&quot;communication&quot;:{&quot;requestId&quot;:&quot;med-model-text-001&quot;,&quot;responseId&quot;:1},&quot;data&quot;:{&quot;messages&quot;:[{&quot;mimeType&quot;:&quot;multi_load/iframe&quot;,&quot;status&quot;:&quot;complete&quot;,&quot;content&quot;:&quot;请结合报告上的参考区间理解各项指标。&quot;,&quot;metaData&quot;:{&quot;multiLoad&quot;:[]}}]},&quot;errorCode&quot;:0,&quot;errorMsg&quot;:&quot;success&quot;}
     * </code></pre>
     * <p>SSE 按空行分隔事件。complete 可能携带最终正文，也可能携带空对象，先处理其中已有的业务数据再结束。正文累计快照按更新替换，不把快照重复拼接。流内收到 error、断开且缺少正常终帧、或收到业务错误时按失败处理。HTTP 请求号与业务请求号分别记录，便于联调排查。</p>
     * <h2>6. 错误与重试</h2>
     * <p>先检查 HTTP 状态。HTTP 200 时继续检查业务 errorCode 或结构化 error，SSE 还要读取流内事件至 complete 或 error。流开始后的错误可在 HTTP 200 的连接中通过 event:error 返回。</p>
     * <table>
     * <thead>
     * <tr>
     * <th>状况</th>
     * <th>处理</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>INVALID_REQUEST</code>、<code>IMAGE_PROCESSING_ERROR</code>，HTTP 400</td>
     * <td>核对字段类型、会话、图片编码和媒体授权，修正请求。</td>
     * </tr>
     * <tr>
     * <td>POP 鉴权错误，或 <code>AUTH_INVALID_KEY</code>、<code>AUTH_INVALID_SIGNATURE</code>、<code>AUTH_TIMESTAMP_EXPIRED</code>、<code>AUTH_NONCE_REPLAY</code>，业务网关 HTTP 401</td>
     * <td>按对应认证层核对凭据、正文哈希、时间戳与 nonce。签名已过期或 nonce 已使用时，为新尝试重新签名。</td>
     * </tr>
     * <tr>
     * <td><code>DIRECT_AGENT_FORBIDDEN</code>、<code>AUTH_APP_FORBIDDEN</code>、<code>AUTH_URI_FORBIDDEN</code>，HTTP 403</td>
     * <td>核对应用身份、接口权限及已开通的模型或 Agent。</td>
     * </tr>
     * <tr>
     * <td><code>SESSION_ACCESS_DENIED</code>，HTTP 403</td>
     * <td>核对会话与当前业务身份的归属，保持续聊身份一致，不使用其他用户的会话。</td>
     * </tr>
     * <tr>
     * <td><code>ADMISSION_SERVICE_SUSPENDED</code>、<code>PLATFORM_ACCESS_DISABLED</code>、<code>AUTH_DISABLED</code>，HTTP 403</td>
     * <td>当前服务、接口或凭据不可用，联系服务方确认恢复或授权，勿持续重试。</td>
     * </tr>
     * <tr>
     * <td><code>PAYLOAD_TOO_LARGE</code>，HTTP 413</td>
     * <td>缩小正文或图片，按服务约定的大小、像素和资源限制重新提交。</td>
     * </tr>
     * <tr>
     * <td><code>SESSION_BUSY</code>、<code>SESSION_CONFLICT</code>，HTTP 409</td>
     * <td>等待在途请求结束，核对同一会话的身份和历史托管方后再调用。</td>
     * </tr>
     * <tr>
     * <td>限流、配额或下游短时不可用，HTTP 429</td>
     * <td>区分可恢复的限流与需要处理授权或配额的情况。适用重试时采用退避，有可用 Retry-After 时采用其秒数。</td>
     * </tr>
     * <tr>
     * <td><code>DOWNSTREAM_TIMEOUT</code>，HTTP 504，或流内错误、超时、断线</td>
     * <td>记录业务请求号和 POP 请求号。重试前核对原请求的执行情况，新尝试使用新的时间戳、nonce 和签名。</td>
     * </tr>
     * <tr>
     * <td>失败 JSON 示例</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code class="language-json">{
     *   &quot;error&quot;: {
     *     &quot;code&quot;: &quot;INVALID_REQUEST&quot;,
     *     &quot;message&quot;: &quot;请检查请求参数。&quot;,
     *     &quot;requestId&quot;: &quot;med-model-text-001&quot;
     *   }
     * }
     * </code></pre>
     * <p>流开始后的错误示例</p>
     * <pre><code class="language-text">event:error
     * data:{&quot;communication&quot;:{&quot;requestId&quot;:&quot;med-model-text-001&quot;},&quot;errorCode&quot;:&quot;DOWNSTREAM_TIMEOUT&quot;,&quot;errorMsg&quot;:&quot;downstream timeout&quot;}
     * </code></pre>
     * <p>新请求生成新的时间戳、nonce 和签名。请求号用于关联，重复使用同一个值可能再次执行请求。</p>
     * 
     * <b>summary</b> : 
     * <p>指定医疗模型进行推理</p>
     * 
     * @param request MedicalModelInferenceRequest
     * @param headers MedicalModelInferenceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return MedicalModelInferenceResponse
     */
    public MedicalModelInferenceResponse medicalModelInferenceWithOptions(MedicalModelInferenceRequest request, MedicalModelInferenceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xDashScopeSSE)) {
            realHeaders.put("X-DashScope-SSE", com.aliyun.teautil.Common.toJSONString(headers.xDashScopeSSE));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWAccess)) {
            realHeaders.put("X-GW-Access", com.aliyun.teautil.Common.toJSONString(headers.xGWAccess));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWNonce)) {
            realHeaders.put("X-GW-Nonce", com.aliyun.teautil.Common.toJSONString(headers.xGWNonce));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWProtocol)) {
            realHeaders.put("X-GW-Protocol", com.aliyun.teautil.Common.toJSONString(headers.xGWProtocol));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWSignature)) {
            realHeaders.put("X-GW-Signature", com.aliyun.teautil.Common.toJSONString(headers.xGWSignature));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWTimestamp)) {
            realHeaders.put("X-GW-Timestamp", com.aliyun.teautil.Common.toJSONString(headers.xGWTimestamp));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xRequestId)) {
            realHeaders.put("X-Request-Id", com.aliyun.teautil.Common.toJSONString(headers.xRequestId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MedicalModelInference"),
            new TeaPair("version", "2026-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/api/directModel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MedicalModelInferenceResponse());
    }

    /**
     * <b>description</b> :
     * <h1>医疗模型推理接入说明</h1>
     * <p>医疗模型推理通过 UTF-8 JSON 接收文本和已开通的图片内容，提供一次完整 JSON 或 SSE 流式响应。</p>
     * <h2>1. 调用与鉴权</h2>
     * <table>
     * <thead>
     * <tr>
     * <th>项目</th>
     * <th>写法</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>产品与版本</td>
     * <td><code>QwenB2BMed / 2026-11-21</code></td>
     * </tr>
     * <tr>
     * <td>Action</td>
     * <td><code>MedicalModelInference</code></td>
     * </tr>
     * <tr>
     * <td>方法和路径</td>
     * <td><code>POST /v1/api/directModel</code></td>
     * </tr>
     * <tr>
     * <td>域名</td>
     * <td>使用服务方提供的目标环境 POP Endpoint</td>
     * </tr>
     * <tr>
     * <td>RAM Action</td>
     * <td><code>qwenb2bmed:MedicalModelInference</code></td>
     * </tr>
     * <tr>
     * <td>编码</td>
     * <td><code>Content-Type: application/octet-stream</code>，正文与签名使用同一份 UTF-8 字节</td>
     * </tr>
     * <tr>
     * <td>字段协议</td>
     * <td>小驼峰正文发送 <code>X-GW-Protocol: aliyun-roa</code></td>
     * </tr>
     * <tr>
     * <td>阿里云 POP ACS3 使用阿里云 AK/SK 或 STS 凭据。业务 HMAC 使用服务方发放的业务 AK/SK。选择器和媒体能力须获得相应授权。</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>请求头</td>
     * <td>类型</td>
     * </tr>
     * <tr>
     * <td>---</td>
     * <td>---</td>
     * </tr>
     * <tr>
     * <td><code>X-Request-Id</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Protocol</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Access</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Timestamp</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Nonce</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-GW-Signature</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>Accept</code>（标准 HTTP 请求头）</td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td><code>X-DashScope-SSE</code></td>
     * <td>string</td>
     * </tr>
     * <tr>
     * <td>每个请求都必须在正文中传入 JSON 布尔值 <code>params.responseStreaming</code>。传 <code>false</code> 返回完整 JSON，传 <code>true</code> 返回 SSE。即使设置了 <code>Accept</code> 或 <code>X-DashScope-SSE</code>，也须填写此字段。</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>POP 签名器生成 <code>Authorization</code>、<code>x-acs-action</code>、<code>x-acs-version</code>、<code>x-acs-date</code>、<code>x-acs-signature-nonce</code> 和 <code>x-acs-content-sha256</code>。使用 STS 时按签名器要求传安全令牌。业务 SK 与 POP SK 各自在本地用于签名。</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>业务签名的规范串依次为 METHOD、PATH、CANONICAL_QUERY、BODY_SHA256_HEX、TIMESTAMP、NONCE。各段用单个 LF 连接，末尾无额外 LF。无 query 时第三段留空。有 query 时使用实际请求的编码结果，按 <code>&amp;</code> 拆分、去空项、对整项排序并重新用 <code>&amp;</code> 连接。SHA-256 按实际发送的 UTF-8 正文字节计算。对规范串做 HMAC-SHA256，输出小写十六进制。使用本接口签名并发起请求的 Python 脚本见第 4 节末尾的「完整签名和调用示例」。</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h2>2. 请求字段与会话</h2>
     * <p>将下表中的业务对象序列化为 UTF-8 JSON 字节，并用这份字节计算业务签名。使用 HTTP 客户端时，以 <code>Content-Type: application/octet-stream</code> 将同一份字节直接写入 POST 正文。使用阿里云通用 OpenAPI SDK 时，将这些字节的可读流设置到 <code>OpenApiRequest.stream</code>，填写第 1 节的业务请求头，并指定第 1 节的 Action、Version、ROA 路径和方法。</p>
     * <pre><code class="language-ts">interface MedicalRequest {
     *   // 会话关联和已授权的业务身份。
     *   communication: {
     *     requestId: string;
     *     sessionId: string;
     *     historyOwner: \\&quot;CLIENT\\&quot; | \\&quot;GATEWAY\\&quot;;
     *     appId?: string;
     *     appScene?: string;
     *     userInfo?: { userId?: string; userIp?: string; userName?: string; deviceId?: string };
     *   };
     *   // 非空消息数组。最后一条是本轮 user。
     *   data: { messages: Array&lt;{ role: \\&quot;user\\&quot; | \\&quot;assistant\\&quot;; content: string | ContentBlock[] }&gt; };
     *   // 选择器和本次响应格式见下表。
     *   params: { modelName: \\&quot;med_qwen4-vl-125\\&quot;; responseStreaming: boolean; outputAudio?: boolean; [name: string]: unknown };
     * }
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th>字段</th>
     * <th>类型</th>
     * <th>必填</th>
     * <th>默认值</th>
     * <th>说明</th>
     * <th>示例</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>communication</code></td>
     * <td>object</td>
     * <td>是</td>
     * <td>—</td>
     * <td>本轮请求、会话及客户身份。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.requestId</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td>1–128 位字母、数字、点、下划线、冒号或连字符。与请求头 <code>X-Request-Id</code> 完全一致，<code>gw-ingress-</code> 前缀为保留值。</td>
     * <td><code>&quot;med-req-001&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.sessionId</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td>1–512 位字母、数字、点、下划线、冒号或连字符。续聊复用。</td>
     * <td><code>&quot;med-session-001&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.historyOwner</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td><code>GATEWAY</code> 或 <code>CLIENT</code>。区分大小写，同一会话保持一致。</td>
     * <td><code>&quot;CLIENT&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.appId</code></td>
     * <td>string</td>
     * <td>条件填写</td>
     * <td>凭据的固定应用</td>
     * <td>填写已授权的值。显式值为非空字符串，最多 256 个 UTF-16 代码单元，首尾无空白且不含控制字符。</td>
     * <td><code>&quot;your-app-id&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.appScene</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户场景标记。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户提供的业务用户信息。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.userId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>按用户身份规则判断</td>
     * <td>按已开通的用户绑定填写。显式值为非空字符串，最多 256 个 UTF-16 代码单元，首尾无空白且不含控制字符。</td>
     * <td><code>&quot;user-001&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.userIp</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户声明的用户 IP。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.userName</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户侧用户名。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>communication.userInfo.deviceId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户侧设备标识，最多 256 个 UTF-16 代码单元。可省略；媒体请求实际填写时须非空白且不含控制字符。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>data</code></td>
     * <td>object</td>
     * <td>是</td>
     * <td>—</td>
     * <td>本轮对话数据。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>data.messages</code></td>
     * <td>array</td>
     * <td>是</td>
     * <td>—</td>
     * <td>非空。<code>GATEWAY</code> 仅传本轮一条 user。<code>CLIENT</code> 按 user、assistant 成对提供历史，最后追加本轮 user。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].role</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td><code>user</code> 或 <code>assistant</code>。</td>
     * <td><code>&quot;user&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].content</code></td>
     * <td>string 或 array</td>
     * <td>是</td>
     * <td>—</td>
     * <td>文本或第 3 节所列内容块。</td>
     * <td><code>&quot;体检报告中的血红蛋白这一项是什么意思？&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>params</code></td>
     * <td>object</td>
     * <td>是</td>
     * <td>—</td>
     * <td>模型选择和推理参数。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>params.modelName</code></td>
     * <td>string</td>
     * <td>是</td>
     * <td>—</td>
     * <td>选择已开通的模型。值区分大小写，首尾无空白。当前版本为 <code>med_qwen4-vl-125</code>。</td>
     * <td><code>&quot;med_qwen4-vl-125&quot;</code></td>
     * </tr>
     * <tr>
     * <td><code>params.outputAudio</code></td>
     * <td>boolean</td>
     * <td>否</td>
     * <td>不主动请求</td>
     * <td>可选 JSON 布尔值。业务已开通 HTTP 音频输出时，true 请求合成音频，false 或省略时不主动请求。按当前响应格式读取 audioFrames 或 SSE 音频帧。</td>
     * <td>—</td>
     * </tr>
     * <tr>
     * <td><code>params.responseStreaming</code></td>
     * <td>boolean</td>
     * <td>是</td>
     * <td>无</td>
     * <td>必须显式填写 JSON 布尔值。<code>false</code> 返回完整 JSON，<code>true</code> 返回 SSE。</td>
     * <td><code>false</code></td>
     * </tr>
     * <tr>
     * <td>modelName 填服务方为客户开通的模型选择器，当前版本为 med_qwen4-vl-125。本入口使用 modelName 选择模型，<code>params.directAgent</code> 会导致请求失败。当前公开的 med_qwen4-vl-125 模型服务执行非思考推理，按该模型已开通的文本和图像能力调用。 扩展字段以已开通服务公布的参数为准。 <code>GATEWAY</code> 每轮提供一条本轮 user。 <code>CLIENT</code> 可携带按 user/assistant 配对的历史，最后附本轮 user。历史 assistant 只传文本。续聊保持 sessionId、historyOwner 和同一业务身份，新一轮可使用新的 requestId。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>正文顶层使用 <code>communication</code>、<code>data</code> 和 <code>params</code>，<code>data</code> 中使用 <code>messages</code>。消息对象包含 <code>role</code> 与 <code>content</code>，扩展业务参数放在 <code>params</code> 中。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h2>3. 文本和图片</h2>
     * <pre><code class="language-ts">type ContentBlock =
     *   | { type: \\&quot;text\\&quot;; text: string }
     *   | { type: \\&quot;image_url\\&quot;; imageUrl: string | { url: string } };
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th>字段</th>
     * <th>类型</th>
     * <th>填写条件</th>
     * <th>默认值</th>
     * <th>说明</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>content[].type</code></td>
     * <td>string</td>
     * <td>使用内容块时</td>
     * <td>—</td>
     * <td>文字填 <code>text</code>，图片填 <code>image_url</code>。</td>
     * </tr>
     * <tr>
     * <td><code>content[].text</code></td>
     * <td>string</td>
     * <td>文本块</td>
     * <td>—</td>
     * <td>要发送的文字。</td>
     * </tr>
     * <tr>
     * <td><code>content[].imageUrl</code></td>
     * <td>string 或 object</td>
     * <td>图片块</td>
     * <td>—</td>
     * <td>可访问的 HTTPS 图片地址或 Base64 Data URL。</td>
     * </tr>
     * <tr>
     * <td><code>content[].imageUrl.url</code></td>
     * <td>string</td>
     * <td>图片引用为对象时</td>
     * <td>—</td>
     * <td>对象只包含这个字段。</td>
     * </tr>
     * <tr>
     * <td>图片块填写 type=image_url；imageUrl 可直接传字符串，也可传仅含 url 的对象。imageUrl.url 支持服务可访问的 HTTPS 图片 URL 或完整 Base64 Data URL，例如 data:image/png;base64, 后接 PNG 文件的标准 Base64，JPEG 使用 data:image/jpeg;base64, 前缀。前缀所声明的 MIME 应与图片内容一致。 申请开通的媒体格式、图片数量和大小以实际服务约定为准。媒体块内保留 <code>image_url</code> 枚举，字段名使用 <code>imageUrl</code>。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>本医疗 API 当前公开的输入范围是文本和图片，内容块使用 <code>text</code> 或 <code>image_url</code>。这里的 HTTP 音频输出能力不代表支持音频输入；不要据此发送文件、音频或视频内容块。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>图片引用可填非空字符串或仅含 <code>url</code> 的对象；图片块不传额外的 fileName，文本块只用 type 和 text。<code>userInfo.deviceId</code> 可省略，媒体请求实际填写时须非空白且不含控制字符。图片来源、数量、尺寸和大小仍须满足客户已开通的服务范围。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h2>4. 完整请求正文示例</h2>
     * <p>示例使用已固定业务应用的凭据。需要显式应用身份时补充获准的 <code>communication.appId</code>，发送时将 <code>X-Request-Id</code> 设置为正文请求号。</p>
     * <h3>4.1 纯文本</h3>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-model-text-001&quot;,
     *     &quot;sessionId&quot;: &quot;med-model-text-001-session&quot;,
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;role&quot;: &quot;user&quot;,
     *         &quot;content&quot;: &quot;请解释报告中参考区间的含义。&quot;
     *       }
     *     ]
     *   },
     *   &quot;params&quot;: {
     *     &quot;responseStreaming&quot;: false,
     *     &quot;modelName&quot;: &quot;med_qwen4-vl-125&quot;
     *   }
     * }
     * </code></pre>
     * <h3>4.2 HTTPS 图片</h3>
     * <p>将示例地址替换为服务可访问的真实图片地址。</p>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-model-url-001&quot;,
     *     &quot;sessionId&quot;: &quot;med-model-url-001-session&quot;,
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;role&quot;: &quot;user&quot;,
     *         &quot;content&quot;: [
     *           {
     *             &quot;type&quot;: &quot;text&quot;,
     *             &quot;text&quot;: &quot;请描述图片中可见的内容。&quot;
     *           },
     *           {
     *             &quot;type&quot;: &quot;image_url&quot;,
     *             &quot;imageUrl&quot;: {
     *               &quot;url&quot;: &quot;https://example.com/medical-image.png&quot;
     *             }
     *           }
     *         ]
     *       }
     *     ]
     *   },
     *   &quot;params&quot;: {
     *     &quot;responseStreaming&quot;: false,
     *     &quot;modelName&quot;: &quot;med_qwen4-vl-125&quot;
     *   }
     * }
     * </code></pre>
     * <h3>4.3 Base64 图片</h3>
     * <p>下方使用一张合成 PNG 演示字段位置。实际请求使用自己的完整编码。</p>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-model-base64-001&quot;,
     *     &quot;sessionId&quot;: &quot;med-model-base64-001-session&quot;,
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;role&quot;: &quot;user&quot;,
     *         &quot;content&quot;: [
     *           {
     *             &quot;type&quot;: &quot;text&quot;,
     *             &quot;text&quot;: &quot;请描述图片中可见的内容。&quot;
     *           },
     *           {
     *             &quot;type&quot;: &quot;image_url&quot;,
     *             &quot;imageUrl&quot;: {
     *               &quot;url&quot;: &quot;data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAIAAAAlC+aJAAAAb0lEQVR4nO3PAQkAAAyEwO9feoshgnABdLep8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3I8QUNyPEFDcjxBQ3IPanc8OLDQitxAAAAAElFTkSuQmCC&quot;
     *             }
     *           }
     *         ]
     *       }
     *     ]
     *   },
     *   &quot;params&quot;: {
     *     &quot;responseStreaming&quot;: false,
     *     &quot;modelName&quot;: &quot;med_qwen4-vl-125&quot;
     *   }
     * }
     * </code></pre>
     * <p>需要 SSE 时，在以上请求中使用 <code>&quot;responseStreaming&quot;: true</code>，并可使用 <code>Accept: text/event-stream</code>。获取完整 JSON 时，显式传入 <code>false</code>。</p>
     * <h4>完整签名和调用示例</h4>
     * <p>示例从环境变量读取 POP_HOST、两套凭据和可选的 APP_ID、BUSINESS_USER_ID、SESSION_ID。POP_HOST 只填服务方提供的域名，不填协议和路径。脚本发送一条文本请求。设置 STREAM=true 可读取 SSE。</p>
     * <pre><code class="language-python">import datetime, hashlib, hmac, http.client, json, os, secrets, time
     * def sha(data):
     *     return hashlib.sha256(data).hexdigest()
     * def mac(secret, value):
     *     return hmac.new(secret.encode(&quot;utf-8&quot;), value.encode(&quot;utf-8&quot;), hashlib.sha256).hexdigest()
     * host = os.environ[&quot;POP_HOST&quot;]
     * path = &quot;/v1/api/directModel&quot;
     * request_id = &quot;chat-&quot; + secrets.token_hex(12)
     * stream = os.environ.get(&quot;STREAM&quot;, &quot;false&quot;).lower() == &quot;true&quot;
     * communication = {
     *     &quot;requestId&quot;: request_id,
     *     &quot;sessionId&quot;: os.environ.get(&quot;SESSION_ID&quot;, &quot;session-&quot; + secrets.token_hex(12)),
     *     &quot;historyOwner&quot;: &quot;GATEWAY&quot;,
     * }
     * if os.environ.get(&quot;APP_ID&quot;):
     *     communication[&quot;appId&quot;] = os.environ[&quot;APP_ID&quot;]
     * if os.environ.get(&quot;BUSINESS_USER_ID&quot;):
     *     communication[&quot;userInfo&quot;] = {&quot;userId&quot;: os.environ[&quot;BUSINESS_USER_ID&quot;]}
     * body = {
     *     &quot;communication&quot;: communication,
     *     &quot;data&quot;: {&quot;messages&quot;: [{&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;请解释报告中参考区间的含义。&quot;}]},
     *     &quot;params&quot;: {&quot;modelName&quot;: &quot;med_qwen4-vl-125&quot;, &quot;responseStreaming&quot;: stream},
     * }
     * payload = json.dumps(body, ensure_ascii=False, separators=(&quot;,&quot;, &quot;:&quot;)).encode(&quot;utf-8&quot;)
     * payload_hash = sha(payload)
     * timestamp, nonce = str(time.time_ns() // 1_000_000), secrets.token_hex(16)
     * gateway_string = &quot;\\n&quot;.join((&quot;POST&quot;, path, &quot;&quot;, payload_hash, timestamp, nonce))
     * headers = {
     *     &quot;host&quot;: host,
     *     &quot;content-type&quot;: &quot;application/octet-stream&quot;,
     *     &quot;accept&quot;: &quot;text/event-stream&quot; if stream else &quot;application/json&quot;,
     *     &quot;x-acs-action&quot;: &quot;MedicalModelInference&quot;,
     *     &quot;x-acs-version&quot;: &quot;2026-11-21&quot;,
     *     &quot;x-acs-date&quot;: datetime.datetime.now(datetime.timezone.utc).strftime(&quot;%Y-%m-%dT%H:%M:%SZ&quot;),
     *     &quot;x-acs-signature-nonce&quot;: secrets.token_hex(16),
     *     &quot;x-acs-content-sha256&quot;: payload_hash,
     *     &quot;x-gw-protocol&quot;: &quot;aliyun-roa&quot;,
     *     &quot;x-request-id&quot;: request_id,
     *     &quot;x-gw-access&quot;: os.environ[&quot;GW_ACCESS_KEY_ID&quot;],
     *     &quot;x-gw-timestamp&quot;: timestamp,
     *     &quot;x-gw-nonce&quot;: nonce,
     *     &quot;x-gw-signature&quot;: mac(os.environ[&quot;GW_ACCESS_KEY_SECRET&quot;], gateway_string),
     * }
     * if os.environ.get(&quot;POP_SECURITY_TOKEN&quot;):
     *     headers[&quot;x-acs-security-token&quot;] = os.environ[&quot;POP_SECURITY_TOKEN&quot;]
     * signed_names = sorted(k for k in headers if k in (&quot;host&quot;, &quot;content-type&quot;) or k.startswith(&quot;x-acs-&quot;))
     * canonical_headers = &quot;&quot;.join(k + &quot;:&quot; + headers[k].strip() + &quot;\\n&quot; for k in signed_names)
     * signed_headers = &quot;;&quot;.join(signed_names)
     * canonical_request = &quot;\\n&quot;.join((&quot;POST&quot;, path, &quot;&quot;, canonical_headers, signed_headers, payload_hash))
     * pop_signature = mac(os.environ[&quot;POP_ACCESS_KEY_SECRET&quot;], &quot;ACS3-HMAC-SHA256\\n&quot; + sha(canonical_request.encode(&quot;utf-8&quot;)))
     * headers[&quot;authorization&quot;] = (
     *     &quot;ACS3-HMAC-SHA256 Credential=&quot; + os.environ[&quot;POP_ACCESS_KEY_ID&quot;]
     *     + &quot;,SignedHeaders=&quot; + signed_headers + &quot;,Signature=&quot; + pop_signature
     * )
     * connection = http.client.HTTPSConnection(host, timeout=120)
     * try:
     *     connection.request(&quot;POST&quot;, path, body=payload, headers=headers)
     *     response = connection.getresponse()
     *     print(&quot;HTTP&quot;, response.status, &quot;业务 RequestId:&quot;, request_id,
     *           &quot;POP RequestId:&quot;, response.getheader(&quot;x-acs-request-id&quot;))
     *     if &quot;text/event-stream&quot; in (response.getheader(&quot;content-type&quot;) or &quot;&quot;).lower():
     *         # 打印保留 SSE 空行；业务集成应按空行组装事件并检查 complete/error。
     *         while True:
     *             line = response.readline()
     *             if not line:
     *                 break
     *             print(line.decode(&quot;utf-8&quot;), end=&quot;&quot;)
     *     else:
     *         print(response.read().decode(&quot;utf-8&quot;))
     * finally:
     *     connection.close()
     * </code></pre>
     * <h2>5. 响应</h2>
     * <pre><code class="language-ts">interface MedicalResponse {
     *   requestId?: string;
     *   communication?: { requestId?: string; sessionId?: string; responseId?: number };
     *   data?: {
     *     messages?: Array&lt;{
     *       mimeType?: string;
     *       status?: string;
     *       content?: unknown;
     *       metaData?: {
     *         sourceSeq?: string; type?: string; barTitle?: string; content?: unknown;
     *         multiLoad?: Array&lt;{ type?: string; sourceSeq?: string; content?: unknown }&gt;;
     *       };
     *     }&gt;;
     *     // 可选业务调试信息，可为 null；内容以实际返回为准。
     *     debug?: unknown;
     *     extraInfo?: { inputResources?: Array&lt;{
     *       contentIndex?: number; type?: string; resourceId?: string; url?: string; fileName?: string;
     *     }&gt; };
     *   };
     *   audioFrames?: Array&lt;{
     *     type?: string; data?: string; last?: boolean; code?: string; message?: string; requestId?: string;
     *   }&gt;;
     *   errorCode?: string | number;
     *   errorMsg?: string;
     *   error?: { code?: string | number; message?: string; requestId?: string };
     * }
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th>字段</th>
     * <th>类型</th>
     * <th>是否总有</th>
     * <th>默认值</th>
     * <th>说明</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>requestId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>业务关联号。POP 请求号见 x-acs-request-id。</td>
     * </tr>
     * <tr>
     * <td><code>communication</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>客户请求、会话与业务响应帧的关联信息。</td>
     * </tr>
     * <tr>
     * <td><code>communication.requestId/sessionId</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>与该业务请求及会话关联。</td>
     * </tr>
     * <tr>
     * <td><code>communication.responseId</code></td>
     * <td>integer</td>
     * <td>否</td>
     * <td>—</td>
     * <td>业务响应帧标识。完整 JSON 聚合时可为 0，SSE 按接收顺序处理，编号无需连续。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>正文、过程或卡片消息，依据 mimeType 解析。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].mimeType</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>消息内容或过程类型。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].status</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>该条消息状态。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].content</code></td>
     * <td>JSON</td>
     * <td>否</td>
     * <td>—</td>
     * <td>当前消息正文或结构化内容。</td>
     * </tr>
     * <tr>
     * <td><code>data.messages[].metaData</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>可选的消息附加信息；当前模型不承诺返回医疗 Agent 的检索进度、来源列表或业务卡片。</td>
     * </tr>
     * <tr>
     * <td><code>metaData.sourceSeq/type/barTitle/content</code></td>
     * <td>string 或 JSON</td>
     * <td>否</td>
     * <td>—</td>
     * <td>存在时按实际返回的标识、类型、标题和内容解释；不是本模型接口的固定必返字段。</td>
     * </tr>
     * <tr>
     * <td><code>metaData.multiLoad</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>为兼容已有响应形状保留的可选列表，可为空或省略；当前模型不保证生成 Agent 业务卡片。</td>
     * </tr>
     * <tr>
     * <td><code>data.debug</code></td>
     * <td>任意 JSON（含 null）</td>
     * <td>否</td>
     * <td>—</td>
     * <td>可选业务调试信息。是否返回、出现时机和内容按实际执行结果；不保证每轮或结束事件必有，也不用于判断业务完成。</td>
     * </tr>
     * <tr>
     * <td><code>data.extraInfo.inputResources</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>有结果时提供输入资源处理信息。各项可含 contentIndex、type、resourceId、url 和 fileName。</td>
     * </tr>
     * <tr>
     * <td><code>audioFrames</code></td>
     * <td>array</td>
     * <td>否</td>
     * <td>—</td>
     * <td>已开通对应输出时可能返回音频帧。各项可含 type、Base64 数据 data、末帧 last 或错误 code、message、requestId。</td>
     * </tr>
     * <tr>
     * <td><code>errorCode</code></td>
     * <td>string 或 number</td>
     * <td>否</td>
     * <td>—</td>
     * <td>0 表示业务成功。非 0 时读取 errorMsg 或 error，SSE 同时处理 error 事件。</td>
     * </tr>
     * <tr>
     * <td><code>errorMsg</code></td>
     * <td>string</td>
     * <td>否</td>
     * <td>—</td>
     * <td>服务返回的状态描述。</td>
     * </tr>
     * <tr>
     * <td><code>error</code></td>
     * <td>object</td>
     * <td>否</td>
     * <td>—</td>
     * <td>结构化业务错误，按 code 判断。</td>
     * </tr>
     * <tr>
     * <td>当前医疗模型推理主要返回模型回答正文，按 <code>mimeType=multi_load/iframe</code> 读取 <code>content</code>；SSE 中正文可以累计快照更新，完整 JSON 返回聚合后的正文。不要由可选 <code>metaData</code> 字段推断本接口提供医疗 Agent 的检索过程、资料来源或业务卡片。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>一次完整 JSON 的成功示例</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td><code>debug: null</code> 仅演示此可选字段的空值形状，不表示每次都会返回。客户端不应据此推定固定的调试子字段。</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code class="language-json">{
     *   &quot;communication&quot;: {
     *     &quot;requestId&quot;: &quot;med-model-text-001&quot;,
     *     &quot;responseId&quot;: 0
     *   },
     *   &quot;data&quot;: {
     *     &quot;messages&quot;: [
     *       {
     *         &quot;mimeType&quot;: &quot;multi_load/iframe&quot;,
     *         &quot;status&quot;: &quot;complete&quot;,
     *         &quot;content&quot;: &quot;请结合报告上的参考区间理解各项指标。&quot;,
     *         &quot;metaData&quot;: {
     *           &quot;multiLoad&quot;: []
     *         }
     *       }
     *     ],
     *     &quot;debug&quot;: null
     *   },
     *   &quot;errorCode&quot;: 0,
     *   &quot;errorMsg&quot;: &quot;success&quot;
     * }
     * </code></pre>
     * <p>SSE 示例</p>
     * <pre><code class="language-text">data:{&quot;communication&quot;:{&quot;requestId&quot;:&quot;med-model-text-001&quot;,&quot;responseId&quot;:0},&quot;data&quot;:{&quot;messages&quot;:[{&quot;mimeType&quot;:&quot;multi_load/iframe&quot;,&quot;status&quot;:&quot;processing&quot;,&quot;content&quot;:&quot;请结合报告上的参考区间。&quot;,&quot;metaData&quot;:{&quot;multiLoad&quot;:[]}}]},&quot;errorCode&quot;:0,&quot;errorMsg&quot;:&quot;success&quot;}
     * event:complete
     * data:{&quot;communication&quot;:{&quot;requestId&quot;:&quot;med-model-text-001&quot;,&quot;responseId&quot;:1},&quot;data&quot;:{&quot;messages&quot;:[{&quot;mimeType&quot;:&quot;multi_load/iframe&quot;,&quot;status&quot;:&quot;complete&quot;,&quot;content&quot;:&quot;请结合报告上的参考区间理解各项指标。&quot;,&quot;metaData&quot;:{&quot;multiLoad&quot;:[]}}]},&quot;errorCode&quot;:0,&quot;errorMsg&quot;:&quot;success&quot;}
     * </code></pre>
     * <p>SSE 按空行分隔事件。complete 可能携带最终正文，也可能携带空对象，先处理其中已有的业务数据再结束。正文累计快照按更新替换，不把快照重复拼接。流内收到 error、断开且缺少正常终帧、或收到业务错误时按失败处理。HTTP 请求号与业务请求号分别记录，便于联调排查。</p>
     * <h2>6. 错误与重试</h2>
     * <p>先检查 HTTP 状态。HTTP 200 时继续检查业务 errorCode 或结构化 error，SSE 还要读取流内事件至 complete 或 error。流开始后的错误可在 HTTP 200 的连接中通过 event:error 返回。</p>
     * <table>
     * <thead>
     * <tr>
     * <th>状况</th>
     * <th>处理</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>INVALID_REQUEST</code>、<code>IMAGE_PROCESSING_ERROR</code>，HTTP 400</td>
     * <td>核对字段类型、会话、图片编码和媒体授权，修正请求。</td>
     * </tr>
     * <tr>
     * <td>POP 鉴权错误，或 <code>AUTH_INVALID_KEY</code>、<code>AUTH_INVALID_SIGNATURE</code>、<code>AUTH_TIMESTAMP_EXPIRED</code>、<code>AUTH_NONCE_REPLAY</code>，业务网关 HTTP 401</td>
     * <td>按对应认证层核对凭据、正文哈希、时间戳与 nonce。签名已过期或 nonce 已使用时，为新尝试重新签名。</td>
     * </tr>
     * <tr>
     * <td><code>DIRECT_AGENT_FORBIDDEN</code>、<code>AUTH_APP_FORBIDDEN</code>、<code>AUTH_URI_FORBIDDEN</code>，HTTP 403</td>
     * <td>核对应用身份、接口权限及已开通的模型或 Agent。</td>
     * </tr>
     * <tr>
     * <td><code>SESSION_ACCESS_DENIED</code>，HTTP 403</td>
     * <td>核对会话与当前业务身份的归属，保持续聊身份一致，不使用其他用户的会话。</td>
     * </tr>
     * <tr>
     * <td><code>ADMISSION_SERVICE_SUSPENDED</code>、<code>PLATFORM_ACCESS_DISABLED</code>、<code>AUTH_DISABLED</code>，HTTP 403</td>
     * <td>当前服务、接口或凭据不可用，联系服务方确认恢复或授权，勿持续重试。</td>
     * </tr>
     * <tr>
     * <td><code>PAYLOAD_TOO_LARGE</code>，HTTP 413</td>
     * <td>缩小正文或图片，按服务约定的大小、像素和资源限制重新提交。</td>
     * </tr>
     * <tr>
     * <td><code>SESSION_BUSY</code>、<code>SESSION_CONFLICT</code>，HTTP 409</td>
     * <td>等待在途请求结束，核对同一会话的身份和历史托管方后再调用。</td>
     * </tr>
     * <tr>
     * <td>限流、配额或下游短时不可用，HTTP 429</td>
     * <td>区分可恢复的限流与需要处理授权或配额的情况。适用重试时采用退避，有可用 Retry-After 时采用其秒数。</td>
     * </tr>
     * <tr>
     * <td><code>DOWNSTREAM_TIMEOUT</code>，HTTP 504，或流内错误、超时、断线</td>
     * <td>记录业务请求号和 POP 请求号。重试前核对原请求的执行情况，新尝试使用新的时间戳、nonce 和签名。</td>
     * </tr>
     * <tr>
     * <td>失败 JSON 示例</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <pre><code class="language-json">{
     *   &quot;error&quot;: {
     *     &quot;code&quot;: &quot;INVALID_REQUEST&quot;,
     *     &quot;message&quot;: &quot;请检查请求参数。&quot;,
     *     &quot;requestId&quot;: &quot;med-model-text-001&quot;
     *   }
     * }
     * </code></pre>
     * <p>流开始后的错误示例</p>
     * <pre><code class="language-text">event:error
     * data:{&quot;communication&quot;:{&quot;requestId&quot;:&quot;med-model-text-001&quot;},&quot;errorCode&quot;:&quot;DOWNSTREAM_TIMEOUT&quot;,&quot;errorMsg&quot;:&quot;downstream timeout&quot;}
     * </code></pre>
     * <p>新请求生成新的时间戳、nonce 和签名。请求号用于关联，重复使用同一个值可能再次执行请求。</p>
     * 
     * <b>summary</b> : 
     * <p>指定医疗模型进行推理</p>
     * 
     * @param request MedicalModelInferenceRequest
     * @return MedicalModelInferenceResponse
     */
    public MedicalModelInferenceResponse medicalModelInference(MedicalModelInferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MedicalModelInferenceHeaders headers = new MedicalModelInferenceHeaders();
        return this.medicalModelInferenceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>调用医疗服务开通接口</h2>
     * <p>使用当前调用账号向医疗商品申请开通。首次接入时可先验证签名和请求格式，确认后再提交开通。</p>
     * <table>
     * <thead>
     * <tr>
     * <th>项目</th>
     * <th>取值</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>服务、操作、版本</td>
     * <td><code>QwenB2BMed</code>、<code>OpenService</code>、<code>2026-11-21</code></td>
     * </tr>
     * <tr>
     * <td>方法及路径</td>
     * <td><code>POST /v1/api/medical/openService</code>，使用接入时提供的医疗服务 HTTPS Endpoint</td>
     * </tr>
     * <tr>
     * <td>请求和响应</td>
     * <td><code>application/json</code>，响应一次返回 JSON</td>
     * </tr>
     * <tr>
     * <td>权限</td>
     * <td>调用身份具有 <code>qwenb2bmed:OpenService</code> 权限，业务访问凭据获准访问上述路径</td>
     * </tr>
     * </tbody></table>
     * <h3>请求与签名</h3>
     * <p>通过阿里云 OpenAPI SDK 或 ACS3 签名调用。直接发 HTTP 时，设置 <code>x-acs-action: OpenService</code> 和 <code>x-acs-version: 2026-11-21</code> 并按 OpenAPI 规则签名。另填 <code>X-Request-Id</code> 和四个 <code>X-GW-*</code> 业务签名头。阿里云凭证用于 OpenAPI 鉴权，接入时领取的业务 AK/SK 用于计算业务签名。两种密钥各自在调用端使用。
     * 以下 Python 代码演示如何为一次验证请求生成正文和业务请求头。把生成的 <code>body</code> 原样作为 HTTP 正文，再使用阿里云凭证完成 OpenAPI 签名。请求路径后不附加查询参数。</p>
     * <pre><code class="language-python">import hashlib
     * import hmac
     * import json
     * import os
     * import time
     * import uuid
     * path = &quot;/v1/api/medical/openService&quot;
     * payload = {&quot;openBenefits&quot;: False}
     * # 如果接入约定要求提供业务用户身份，签名前加入该字段。
     * # payload[&quot;communication&quot;] = {&quot;user_info&quot;: {&quot;user_id&quot;: &quot;customer-user-001&quot;}}
     * body = json.dumps(payload, ensure_ascii=False, separators=(&quot;,&quot;, &quot;:&quot;)).encode(&quot;utf-8&quot;)
     * timestamp = str(time.time_ns() // 1_000_000)
     * nonce = uuid.uuid4().hex
     * body_hash = hashlib.sha256(body).hexdigest()
     * canonical = &quot;\\n&quot;.join([&quot;POST&quot;, path, &quot;&quot;, body_hash, timestamp, nonce])
     * signature = hmac.new(os.environ[&quot;GW_SECRET_KEY&quot;].encode(&quot;utf-8&quot;),
     *                      canonical.encode(&quot;utf-8&quot;), hashlib.sha256).hexdigest()
     * headers = {
     *     &quot;Content-Type&quot;: &quot;application/json&quot;,
     *     &quot;X-Request-Id&quot;: uuid.uuid4().hex,
     *     &quot;X-GW-Access&quot;: os.environ[&quot;GW_ACCESS_KEY&quot;],
     *     &quot;X-GW-Timestamp&quot;: timestamp,
     *     &quot;X-GW-Nonce&quot;: nonce,
     *     &quot;X-GW-Signature&quot;: signature,
     * }
     * </code></pre>
     * <p>业务签名原文共有六行，第三行是空查询串，最后一行末尾没有换行。重发请求时生成新的时间戳、随机串和签名。业务用户 ID 使用接入约定的字段名 <code>communication.user_info.user_id</code>。服务开通归属由已认证的调用账号确定。</p>
     * <h3>验证、提交与判断结果</h3>
     * <p>仅验证调用时发送以下 JSON。成功响应为 <code>{&quot;status&quot;:&quot;TEST_OK&quot;}</code>。</p>
     * <pre><code class="language-json">{&quot;openBenefits&quot;:false}
     * </code></pre>
     * <p>提交实际开通时将 <code>openBenefits</code> 设为布尔值 <code>true</code>，按新正文重新签名。以下示例适用于需要业务用户身份的凭据。</p>
     * <pre><code class="language-json">{&quot;openBenefits&quot;:true,&quot;communication&quot;:{&quot;user_info&quot;:{&quot;user_id&quot;:&quot;customer-user-001&quot;}}}
     * </code></pre>
     * <p>订单已受理时，响应示例如下。</p>
     * <pre><code class="language-json">{&quot;status&quot;:&quot;OPENING&quot;,&quot;orderId&quot;:&quot;2000000000000001&quot;}
     * </code></pre>
     * <p>服务已确认开通时，响应示例如下。</p>
     * <pre><code class="language-json">{&quot;status&quot;:&quot;ACTIVE&quot;,&quot;orderId&quot;:&quot;2000000000000001&quot;,&quot;spInstanceId&quot;:&quot;sp-example-001&quot;}
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th><code>status</code></th>
     * <th>客户端处理</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>TEST_OK</code></td>
     * <td>此次调用验证成功。需要实际开通时，另行发送 <code>openBenefits=true</code>。</td>
     * </tr>
     * <tr>
     * <td><code>OPENING</code></td>
     * <td>订单已受理，保存 <code>orderId</code>，等待开通完成。</td>
     * </tr>
     * <tr>
     * <td><code>ACTIVE</code></td>
     * <td>医疗服务已确认开通。保存返回的订单号和实例 ID，可按授权调用医疗接口。</td>
     * </tr>
     * <tr>
     * <td><code>ORDER_UNKNOWN</code></td>
     * <td>服务暂时无法确认订单结果，保留请求关联号核实订单后再决定是否重新提交。</td>
     * </tr>
     * <tr>
     * <td><code>REJECTED</code></td>
     * <td>开通申请被拒绝，检查账号可用额度。</td>
     * </tr>
     * <tr>
     * <td><code>openBenefits=false</code> 仅验证本次请求，不能用于查询已有订单。再次发送 <code>openBenefits=true</code> 会再次发起开通操作。订单号、实例 ID 都按字符串保存。</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>开通千问医疗服务或验证调用配置</p>
     * 
     * @param request OpenServiceRequest
     * @param headers OpenServiceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenServiceResponse
     */
    public OpenServiceResponse openServiceWithOptions(OpenServiceRequest request, OpenServiceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.communication)) {
            body.put("communication", request.communication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openBenefits)) {
            body.put("openBenefits", request.openBenefits);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWAccess)) {
            realHeaders.put("X-GW-Access", com.aliyun.teautil.Common.toJSONString(headers.xGWAccess));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWNonce)) {
            realHeaders.put("X-GW-Nonce", com.aliyun.teautil.Common.toJSONString(headers.xGWNonce));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWSignature)) {
            realHeaders.put("X-GW-Signature", com.aliyun.teautil.Common.toJSONString(headers.xGWSignature));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWTimestamp)) {
            realHeaders.put("X-GW-Timestamp", com.aliyun.teautil.Common.toJSONString(headers.xGWTimestamp));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xRequestId)) {
            realHeaders.put("X-Request-Id", com.aliyun.teautil.Common.toJSONString(headers.xRequestId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenService"),
            new TeaPair("version", "2026-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/api/medical/openService"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenServiceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>调用医疗服务开通接口</h2>
     * <p>使用当前调用账号向医疗商品申请开通。首次接入时可先验证签名和请求格式，确认后再提交开通。</p>
     * <table>
     * <thead>
     * <tr>
     * <th>项目</th>
     * <th>取值</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>服务、操作、版本</td>
     * <td><code>QwenB2BMed</code>、<code>OpenService</code>、<code>2026-11-21</code></td>
     * </tr>
     * <tr>
     * <td>方法及路径</td>
     * <td><code>POST /v1/api/medical/openService</code>，使用接入时提供的医疗服务 HTTPS Endpoint</td>
     * </tr>
     * <tr>
     * <td>请求和响应</td>
     * <td><code>application/json</code>，响应一次返回 JSON</td>
     * </tr>
     * <tr>
     * <td>权限</td>
     * <td>调用身份具有 <code>qwenb2bmed:OpenService</code> 权限，业务访问凭据获准访问上述路径</td>
     * </tr>
     * </tbody></table>
     * <h3>请求与签名</h3>
     * <p>通过阿里云 OpenAPI SDK 或 ACS3 签名调用。直接发 HTTP 时，设置 <code>x-acs-action: OpenService</code> 和 <code>x-acs-version: 2026-11-21</code> 并按 OpenAPI 规则签名。另填 <code>X-Request-Id</code> 和四个 <code>X-GW-*</code> 业务签名头。阿里云凭证用于 OpenAPI 鉴权，接入时领取的业务 AK/SK 用于计算业务签名。两种密钥各自在调用端使用。
     * 以下 Python 代码演示如何为一次验证请求生成正文和业务请求头。把生成的 <code>body</code> 原样作为 HTTP 正文，再使用阿里云凭证完成 OpenAPI 签名。请求路径后不附加查询参数。</p>
     * <pre><code class="language-python">import hashlib
     * import hmac
     * import json
     * import os
     * import time
     * import uuid
     * path = &quot;/v1/api/medical/openService&quot;
     * payload = {&quot;openBenefits&quot;: False}
     * # 如果接入约定要求提供业务用户身份，签名前加入该字段。
     * # payload[&quot;communication&quot;] = {&quot;user_info&quot;: {&quot;user_id&quot;: &quot;customer-user-001&quot;}}
     * body = json.dumps(payload, ensure_ascii=False, separators=(&quot;,&quot;, &quot;:&quot;)).encode(&quot;utf-8&quot;)
     * timestamp = str(time.time_ns() // 1_000_000)
     * nonce = uuid.uuid4().hex
     * body_hash = hashlib.sha256(body).hexdigest()
     * canonical = &quot;\\n&quot;.join([&quot;POST&quot;, path, &quot;&quot;, body_hash, timestamp, nonce])
     * signature = hmac.new(os.environ[&quot;GW_SECRET_KEY&quot;].encode(&quot;utf-8&quot;),
     *                      canonical.encode(&quot;utf-8&quot;), hashlib.sha256).hexdigest()
     * headers = {
     *     &quot;Content-Type&quot;: &quot;application/json&quot;,
     *     &quot;X-Request-Id&quot;: uuid.uuid4().hex,
     *     &quot;X-GW-Access&quot;: os.environ[&quot;GW_ACCESS_KEY&quot;],
     *     &quot;X-GW-Timestamp&quot;: timestamp,
     *     &quot;X-GW-Nonce&quot;: nonce,
     *     &quot;X-GW-Signature&quot;: signature,
     * }
     * </code></pre>
     * <p>业务签名原文共有六行，第三行是空查询串，最后一行末尾没有换行。重发请求时生成新的时间戳、随机串和签名。业务用户 ID 使用接入约定的字段名 <code>communication.user_info.user_id</code>。服务开通归属由已认证的调用账号确定。</p>
     * <h3>验证、提交与判断结果</h3>
     * <p>仅验证调用时发送以下 JSON。成功响应为 <code>{&quot;status&quot;:&quot;TEST_OK&quot;}</code>。</p>
     * <pre><code class="language-json">{&quot;openBenefits&quot;:false}
     * </code></pre>
     * <p>提交实际开通时将 <code>openBenefits</code> 设为布尔值 <code>true</code>，按新正文重新签名。以下示例适用于需要业务用户身份的凭据。</p>
     * <pre><code class="language-json">{&quot;openBenefits&quot;:true,&quot;communication&quot;:{&quot;user_info&quot;:{&quot;user_id&quot;:&quot;customer-user-001&quot;}}}
     * </code></pre>
     * <p>订单已受理时，响应示例如下。</p>
     * <pre><code class="language-json">{&quot;status&quot;:&quot;OPENING&quot;,&quot;orderId&quot;:&quot;2000000000000001&quot;}
     * </code></pre>
     * <p>服务已确认开通时，响应示例如下。</p>
     * <pre><code class="language-json">{&quot;status&quot;:&quot;ACTIVE&quot;,&quot;orderId&quot;:&quot;2000000000000001&quot;,&quot;spInstanceId&quot;:&quot;sp-example-001&quot;}
     * </code></pre>
     * <table>
     * <thead>
     * <tr>
     * <th><code>status</code></th>
     * <th>客户端处理</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>TEST_OK</code></td>
     * <td>此次调用验证成功。需要实际开通时，另行发送 <code>openBenefits=true</code>。</td>
     * </tr>
     * <tr>
     * <td><code>OPENING</code></td>
     * <td>订单已受理，保存 <code>orderId</code>，等待开通完成。</td>
     * </tr>
     * <tr>
     * <td><code>ACTIVE</code></td>
     * <td>医疗服务已确认开通。保存返回的订单号和实例 ID，可按授权调用医疗接口。</td>
     * </tr>
     * <tr>
     * <td><code>ORDER_UNKNOWN</code></td>
     * <td>服务暂时无法确认订单结果，保留请求关联号核实订单后再决定是否重新提交。</td>
     * </tr>
     * <tr>
     * <td><code>REJECTED</code></td>
     * <td>开通申请被拒绝，检查账号可用额度。</td>
     * </tr>
     * <tr>
     * <td><code>openBenefits=false</code> 仅验证本次请求，不能用于查询已有订单。再次发送 <code>openBenefits=true</code> 会再次发起开通操作。订单号、实例 ID 都按字符串保存。</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>开通千问医疗服务或验证调用配置</p>
     * 
     * @param request OpenServiceRequest
     * @return OpenServiceResponse
     */
    public OpenServiceResponse openService(OpenServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OpenServiceHeaders headers = new OpenServiceHeaders();
        return this.openServiceWithOptions(request, headers, runtime);
    }
}
