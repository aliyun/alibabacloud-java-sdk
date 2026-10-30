// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAlertItemsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If <code>code == Success</code>, the authorization is successful.</li>
     * <li>Other status codes indicate authorization failure. If authorization fails, check the <code>message</code> field for detailed error messages.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;NODE&quot;: {
     *       &quot;Saturation&quot;: [
     *         &quot;Node CPU utilization detection&quot;,
     *         &quot;Node kernel-mode CPU utilization detection&quot;,
     *         &quot;Node softirq CPU utilization detection&quot;,
     *         &quot;Node memory usage detection&quot;,
     *         &quot;Node kernel memory usage detection&quot;,
     *         &quot;Node file descriptor usage detection&quot;,
     *         &quot;Node root file system usage detection&quot;,
     *         &quot;Node cgroup leak detection&quot;,
     *         &quot;Node socket usage detection&quot;,
     *         &quot;Node TCP memory usage detection&quot;
     *       ],
     *       &quot;Latency&quot;: [
     *         &quot;Node scheduling latency detection&quot;,
     *         &quot;Node network latency detection&quot;,
     *         &quot;Node disk write latency detection&quot;,
     *         &quot;Node disk read latency detection&quot;
     *       ],
     *       &quot;Load&quot;: [
     *         &quot;Node disk I/O traffic detection&quot;,
     *         &quot;Node load average detection&quot;
     *       ],
     *       &quot;Errors&quot;: [
     *         &quot;Node network packet loss detection&quot;,
     *         &quot;Node OOM stall prediction and detection&quot;
     *       ]
     *     },
     *     &quot;POD&quot;: {
     *       &quot;Saturation&quot;: [
     *         &quot;Pod memory usage detection&quot;,
     *         &quot;Pod CPU utilization detection&quot;
     *       ],
     *       &quot;Errors&quot;: [
     *         &quot;Pod CPU throttling detection&quot;,
     *         &quot;Pod OOM event detection&quot;
     *       ]
     *     }
     * }</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListAlertItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertItemsResponseBody self = new ListAlertItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAlertItemsResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ListAlertItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlertItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
