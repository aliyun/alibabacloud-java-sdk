// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetAgentConversationTimelineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;seq&quot;:1,&quot;type&quot;:&quot;user&quot;}]</p>
     */
    @NameInMap("items")
    public Object items;

    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("replayCursor")
    public Long replayCursor;

    /**
     * <strong>example:</strong>
     * <p>{&quot;run_01&quot;:&quot;up&quot;}</p>
     */
    @NameInMap("responseFeedback")
    public Object responseFeedback;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;id&quot;:&quot;run_01&quot;,&quot;modelId&quot;:&quot;qwen3-coder&quot;}]</p>
     */
    @NameInMap("runs")
    public Object runs;

    /**
     * <strong>example:</strong>
     * <p>events</p>
     */
    @NameInMap("source")
    public String source;

    public static GetAgentConversationTimelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentConversationTimelineResponseBody self = new GetAgentConversationTimelineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentConversationTimelineResponseBody setItems(Object items) {
        this.items = items;
        return this;
    }
    public Object getItems() {
        return this.items;
    }

    public GetAgentConversationTimelineResponseBody setReplayCursor(Long replayCursor) {
        this.replayCursor = replayCursor;
        return this;
    }
    public Long getReplayCursor() {
        return this.replayCursor;
    }

    public GetAgentConversationTimelineResponseBody setResponseFeedback(Object responseFeedback) {
        this.responseFeedback = responseFeedback;
        return this;
    }
    public Object getResponseFeedback() {
        return this.responseFeedback;
    }

    public GetAgentConversationTimelineResponseBody setRuns(Object runs) {
        this.runs = runs;
        return this;
    }
    public Object getRuns() {
        return this.runs;
    }

    public GetAgentConversationTimelineResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
