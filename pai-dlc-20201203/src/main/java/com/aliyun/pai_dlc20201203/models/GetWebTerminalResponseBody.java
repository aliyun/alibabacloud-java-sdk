// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetWebTerminalResponseBody extends TeaModel {
    /**
     * <p>The request ID which is used for diagnostics and Q\&amp;A.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The WebSocket URI for accessing the container. You must build a WebSocket client. For more information about the communication format, see the following code:</p>
     * <pre><code>ws = new WebSocket(
     *   `wss://xxxxx`,
     * );
     * ws.onopen = function open() {
     *   console.warn(\\&quot;connected\\&quot;);
     *   term.write(\\&quot;\\r\\&quot;);
     * };
     * 
     * ws.onclose = function close() {
     *   console.warn(\\&quot;disconnected\\&quot;);
     *   term.write(\\&quot;Connection closed\\&quot;);
     * };
     * 
     * // Return the following information in the backend.
     * ws.onmessage = function incoming(event) {
     *   const msg = JSON.parse(event.data);
     *   console.warn(msg);
     *   if (msg.operation === \\&quot;stdout\\&quot;) {
     *     term.write(msg.data);
     *   } else {
     *     console.warn(\\&quot;invalid msg operation: \\&quot; + msg);
     *   }
     * };
     * 
     * // Enter the following code in the console.
     * term.onData(data =&gt; {
     *   const msg = { operation: \\&quot;stdin\\&quot;, data: data };
     *   ws.send(JSON.stringify(msg));
     * });
     * 
     * term.onResize(size =&gt; {
     *   const msg = { operation: \\&quot;resize\\&quot;, cols: size.cols, rows: size.rows };
     *   ws.send(JSON.stringify(msg));
     * });
     * 
     * fitAddon.fit();
     * };
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>wss://*****</p>
     */
    @NameInMap("WebTerminalUrl")
    public String webTerminalUrl;

    public static GetWebTerminalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebTerminalResponseBody self = new GetWebTerminalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebTerminalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebTerminalResponseBody setWebTerminalUrl(String webTerminalUrl) {
        this.webTerminalUrl = webTerminalUrl;
        return this;
    }
    public String getWebTerminalUrl() {
        return this.webTerminalUrl;
    }

}
