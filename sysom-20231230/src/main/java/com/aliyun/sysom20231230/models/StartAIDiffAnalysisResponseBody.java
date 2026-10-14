// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class StartAIDiffAnalysisResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If code is Success, the authorization is successful.</li>
     * <li>Other status codes indicate that the authorization has failed. Check the message field for the detailed fault information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The AI differential analysis result data.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;[
     *   {
     *       name: &quot;xxx&quot;, # Operator name
     *       before_time: 2, # Total time of the former
     *       after_time: 4, # Total time of the latter
     *       time_diff: 2,  # Time difference
     *       before_time_perc: &quot;80%&quot;, # Total time percentage of the former
     *       after_time_perc: &quot;23%&quot;, # Total time percentage of the latter
     *       time_perc_diff: &quot;-54%&quot;,  # Time percentage difference
     *       before_count: 1, # Total call count of the former
     *       after_count: 2,  # Total call count of the latter
     *       count_diff: 1,   # Call count difference
     *       before_count_perc: &quot;56%&quot;, # Total call percentage of the former
     *       after_count_perc: &quot;32%&quot;,  # Total call percentage of the latter
     *       count_perc_diff: &quot;44%&quot;,   # Call percentage difference
     *   },
     *   {...}
     * ]&quot;</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The error code description. This field is empty if no error occurs.</p>
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
