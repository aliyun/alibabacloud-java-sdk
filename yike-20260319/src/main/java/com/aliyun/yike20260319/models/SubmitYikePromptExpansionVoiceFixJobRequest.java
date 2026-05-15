// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikePromptExpansionVoiceFixJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    @NameInMap("UserData")
    public String userData;

    public static SubmitYikePromptExpansionVoiceFixJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikePromptExpansionVoiceFixJobRequest self = new SubmitYikePromptExpansionVoiceFixJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitYikePromptExpansionVoiceFixJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitYikePromptExpansionVoiceFixJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
