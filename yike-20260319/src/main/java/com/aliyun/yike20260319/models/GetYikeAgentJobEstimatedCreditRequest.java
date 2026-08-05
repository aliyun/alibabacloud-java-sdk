// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeAgentJobEstimatedCreditRequest extends TeaModel {
    /**
     * <p>The name of the task submission operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SubmitYikeAvatarNarratorJob</p>
     */
    @NameInMap("JobAction")
    public String jobAction;

    /**
     * <p>The task request content. This is a JSON string and uses the same JobParams parameter as the task submission operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;TextType\&quot;:2,\&quot;TextContent\&quot;:\&quot;Today, Beijing held a press conference to announce plans to further optimize the city\&quot;s transportation network, including adding three new subway lines within the next three years....\&quot;,\&quot;AspectRatio\&quot;:\&quot;16:9\&quot;, \&quot;Resolution\&quot;:\&quot;720P\&quot;, \&quot;OutputLanguages\&quot;:[\&quot;CN\&quot;,\&quot;YUE\&quot;]&quot;}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    public static GetYikeAgentJobEstimatedCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        GetYikeAgentJobEstimatedCreditRequest self = new GetYikeAgentJobEstimatedCreditRequest();
        return TeaModel.build(map, self);
    }

    public GetYikeAgentJobEstimatedCreditRequest setJobAction(String jobAction) {
        this.jobAction = jobAction;
        return this;
    }
    public String getJobAction() {
        return this.jobAction;
    }

    public GetYikeAgentJobEstimatedCreditRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

}
