// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitAIAppJobRequest extends TeaModel {
    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Ensures the idempotence of the request. Generate a parameter value from your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>***<em><strong>20b48fb04</strong></em></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The task inputs.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;InputPrompt&quot;: &quot;xxxx&quot;
     * }</p>
     */
    @NameInMap("Inputs")
    public String inputs;

    /**
     * <p>The custom fields.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Key\&quot;:\&quot;Value\&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitAIAppJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIAppJobRequest self = new SubmitAIAppJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIAppJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SubmitAIAppJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitAIAppJobRequest setInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    public String getInputs() {
        return this.inputs;
    }

    public SubmitAIAppJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
