// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateInterventionDictionaryRequest extends TeaModel {
    /**
     * <p>The type of the analyzer. Valid values:</p>
     * <br>
     * <p>*   MODEL: model-based custom analyzer.</p>
     * <p>*   SYSTEM: system analyzer.</p>
     * <p>*   USER: custom analyzer.</p>
     */
    @NameInMap("analyzerType")
    public String analyzerType;

    /**
     * <p>The name of the intervention dictionary.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The type of the intervention dictionary. Valid values:</p>
     * <br>
     * <p>*   stopword: an intervention dictionary for stop word filtering.</p>
     * <p>*   synonym: an intervention dictionary for synonym configuration.</p>
     * <p>*   correction: an intervention dictionary for spelling correction.</p>
     * <p>*   category_prediction: an intervention dictionary for category prediction.</p>
     * <p>*   ner: an intervention dictionary for named entity recognition (NER).</p>
     * <p>*   term_weighting: an intervention dictionary for term weight analysis.</p>
     * <p>*   suggest_allowlist: a drop-down suggestion whitelist.</p>
     * <p>*   suggest_denylist: a drop-down suggestion blacklist.</p>
     * <p>*   hot_allowlist: a top search whitelist.</p>
     * <p>*   hot_denylist: a top search blacklist.</p>
     * <p>*   hint_allowlist: a hint whitelist.</p>
     * <p>*   hint_denylist: a hint blacklist.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Default value: false.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateInterventionDictionaryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInterventionDictionaryRequest self = new CreateInterventionDictionaryRequest();
        return TeaModel.build(map, self);
    }

    public CreateInterventionDictionaryRequest setAnalyzerType(String analyzerType) {
        this.analyzerType = analyzerType;
        return this;
    }
    public String getAnalyzerType() {
        return this.analyzerType;
    }

    public CreateInterventionDictionaryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateInterventionDictionaryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateInterventionDictionaryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
