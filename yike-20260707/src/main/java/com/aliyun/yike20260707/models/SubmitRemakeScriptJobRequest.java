// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitRemakeScriptJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;ComprehensionResult&quot;: &quot;<a href="http://xxxx.json">http://xxxx.json</a>&quot;,
     *     &quot;Product&quot;:
     *     {
     *         &quot;OriginalProductName&quot;: &quot;xxxx&quot;,
     *         &quot;NewProduct&quot;:
     *         {
     *             &quot;ProductName&quot;: &quot;xxxx&quot;,
     *             &quot;Description&quot;: &quot;xxxx&quot;,
     *             &quot;ProductImages&quot;:
     *             [
     *                 &quot;<a href="https://xxxx.png">https://xxxx.png</a>&quot;,
     *                 &quot;<a href="https://xxxx.png">https://xxxx.png</a>&quot;,
     *                 &quot;<a href="https://xxxx.png">https://xxxx.png</a>&quot;
     *             ],
     *             &quot;ProductKnowledge&quot;: &quot;xxxx&quot;
     *         }
     *     },
     *     &quot;Avatar&quot;:
     *     {
     *         &quot;NewAvatarImages&quot;:
     *         [
     *             &quot;<a href="https://xxxx.png">https://xxxx.png</a>&quot;
     *         ],
     *         &quot;OriginalAvatarName&quot;: &quot;xxxx&quot;
     *     },
     *     &quot;VoiceoverLanguage&quot;: &quot;zh&quot;
     * }</p>
     */
    @NameInMap("RemakeParams")
    public String remakeParams;

    /**
     * <strong>example:</strong>
     * <p>faithful-remake</p>
     */
    @NameInMap("RemakeType")
    public String remakeType;

    /**
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitRemakeScriptJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitRemakeScriptJobRequest self = new SubmitRemakeScriptJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitRemakeScriptJobRequest setRemakeParams(String remakeParams) {
        this.remakeParams = remakeParams;
        return this;
    }
    public String getRemakeParams() {
        return this.remakeParams;
    }

    public SubmitRemakeScriptJobRequest setRemakeType(String remakeType) {
        this.remakeType = remakeType;
        return this;
    }
    public String getRemakeType() {
        return this.remakeType;
    }

    public SubmitRemakeScriptJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
