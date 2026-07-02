// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAlertItemsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li><code>code == Success</code> indicates that the authorization is successful.</li>
     * <li>Other status codes indicate that the authorization failed. Check the <code>message</code> field for the detailed fault message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;NODE&quot;: {
     *       &quot;饱和度&quot;: [
     *         &quot;节点CPU使用率检测&quot;,
     *         &quot;节点内核态CPU使用检测&quot;,
     *         &quot;节点软中断CPU使用检测&quot;,
     *         &quot;节点内存使用检测&quot;,
     *         &quot;节点内核内存使用检测&quot;,
     *         &quot;节点文件描述符使用检测&quot;,
     *         &quot;节点根文件系统使用检测&quot;,
     *         &quot;节点cgroup泄漏检测&quot;,
     *         &quot;节点Sockets使用检测&quot;,
     *         &quot;节点TCP内存使用检测&quot;
     *       ],
     *       &quot;延时&quot;: [
     *         &quot;节点调度延时检测&quot;,
     *         &quot;节点网络延时检测&quot;,
     *         &quot;节点磁盘写入延迟检测&quot;,
     *         &quot;节点磁盘读取延迟检测&quot;
     *       ],
     *       &quot;负载&quot;: [
     *         &quot;节点磁盘IO流量检测&quot;,
     *         &quot;节点load average检测&quot;
     *       ],
     *       &quot;错误&quot;: [
     *         &quot;节点网络丢包检测&quot;,
     *         &quot;节点OOM夯机预测及检测&quot;
     *       ]
     *     },
     *     &quot;POD&quot;: {
     *       &quot;饱和度&quot;: [
     *         &quot;Pod内存使用检测&quot;,
     *         &quot;Pod CPU使用率检测&quot;
     *       ],
     *       &quot;错误&quot;: [
     *         &quot;Pod CPU限流检测&quot;,
     *         &quot;Pod OOM事件检测&quot;
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
     * <li>Otherwise, this field contains the request error information.</li>
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
