// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class StartAIDiffAnalysisResponseBody extends TeaModel {
    /**
     * <p>Status code  </p>
     * <ul>
     * <li><code>code == Success</code> indicates that authorization succeeded.  </li>
     * <li>Other status codes indicate that authorization failed. When authorization fails, view the <code>message</code> field to obtain detailed error information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>AI differential analysis result data</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;[
     *   {
     *       name: &quot;xxx&quot;, #算子名称
     *       before_time: 2, # 前者总耗时
     *       after_time: 4, # 后者总耗时
     *       time_diff: 2,  # 耗时差异
     *       before_time_perc: &quot;80%&quot;, # 前者总耗时百分比
     *       after_time_perc: &quot;23%&quot;, # 后者总耗时百分比
     *       time_perc_diff: &quot;-54%&quot;,  # 耗时差异
     *       before_count: 1, # 前者总调用差异
     *       after_count: 2,  # 后者总调用差异
     *       count_diff: 1,   # 调用差异
     *       before_count_perc: &quot;56%&quot;, # 前者总调用差异
     *       after_count_perc: &quot;32%&quot;,  # 后者总调用差异
     *       count_perc_diff: &quot;44%&quot;,   # 调用差异
     *   },
     *   {...}
     * ]&quot;</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>Error message description; empty if no error occurred</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
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

    public static StartAIDiffAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAIDiffAnalysisResponseBody self = new StartAIDiffAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAIDiffAnalysisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartAIDiffAnalysisResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public StartAIDiffAnalysisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartAIDiffAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
