// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotAnalysisResponseBody extends TeaModel {
    /**
     * <p>error code</p>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Returned Data</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;AliYunDun:1657494进程(1657494):根据提供的热点调用栈信息，热点主要集中在<code>__nanosleep_nocancel</code>以及相关的系统调用<code>SyS_nanosleep</code>上，这表明进程在等待特定的时间间隔。通常这是由于应用中存在长时间的睡眠或高频率的定时操作导致的，比如定时任务、心跳检测等。\n\n应用代码在需要定期执行某些检查或等待外部事件时会使用<code>nanosleep</code>来实现精确的延时控制。为了优化这种情况，可以考虑以下方案：\n- 评估是否可以减少定时任务的频率。\n- 使用条件变量替代单纯的睡眠等待，以响应更快的事件触发。\n- 如果是I/O密集型操作等待，考虑优化I/O路径或提升I/O效率。建议使用SysOM平台的IO诊断工具来进一步定位具体的I/O瓶颈。&quot;</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>Response message</p>
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

    /**
     * <p>Indicates whether the invocation is successful</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetHotspotAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotAnalysisResponseBody self = new GetHotspotAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotspotAnalysisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotspotAnalysisResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetHotspotAnalysisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotspotAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotspotAnalysisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
