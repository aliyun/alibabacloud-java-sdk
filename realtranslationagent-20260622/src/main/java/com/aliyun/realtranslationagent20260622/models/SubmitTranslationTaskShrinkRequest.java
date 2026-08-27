// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class SubmitTranslationTaskShrinkRequest extends TeaModel {
    /**
     * <p>The API key that is the identity of the member accounts. You can obtain this from the RuiYiBao console.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>The task ID of a previously submitted translation task. Pass in this parameter when resubmitting a translation task.</p>
     * <ul>
     * <li>You must pass in either this parameter or TaskId.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f9c35b0453b</p>
     */
    @NameInMap("BaseTaskId")
    public String baseTaskId;

    /**
     * <p>The translation configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;SourceLanguage&quot;: &quot;zh&quot;,
     *         &quot;TargetLanguage&quot;: &quot;en&quot;,
     *         &quot;Style&quot;: &quot;minimal&quot;,
     *         &quot;Font&quot;: &quot;Arial&quot;
     *     }</p>
     */
    @NameInMap("Config")
    public String configShrink;

    /**
     * <p>The custom terms.</p>
     * <blockquote>
     * <p>Notice: Custom terms are for reference only. The actual translation results may differ. Refer to the final output as the definitive result.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;SourceTerm&quot;:&quot;dog&quot;, &quot;TargetTerm&quot;:&quot;dog&quot;}]</p>
     */
    @NameInMap("CustomTerms")
    public String customTermsShrink;

    /**
     * <p>The translation task ID.</p>
     * <ul>
     * <li>Obtained from the TaskId returned by UploadTranslationFile.</li>
     * <li>You must pass in either this parameter or BaseTaskId.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f9c35b0453b</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static SubmitTranslationTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranslationTaskShrinkRequest self = new SubmitTranslationTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTranslationTaskShrinkRequest setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public SubmitTranslationTaskShrinkRequest setBaseTaskId(String baseTaskId) {
        this.baseTaskId = baseTaskId;
        return this;
    }
    public String getBaseTaskId() {
        return this.baseTaskId;
    }

    public SubmitTranslationTaskShrinkRequest setConfigShrink(String configShrink) {
        this.configShrink = configShrink;
        return this;
    }
    public String getConfigShrink() {
        return this.configShrink;
    }

    public SubmitTranslationTaskShrinkRequest setCustomTermsShrink(String customTermsShrink) {
        this.customTermsShrink = customTermsShrink;
        return this;
    }
    public String getCustomTermsShrink() {
        return this.customTermsShrink;
    }

    public SubmitTranslationTaskShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
