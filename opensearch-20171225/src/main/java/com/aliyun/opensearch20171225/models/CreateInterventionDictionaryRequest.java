// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateInterventionDictionaryRequest extends TeaModel {
    /**
     * <p>The type of the analyzer. Valid values:</p>
     * <ul>
     * <li>MODEL: model-based custom analyzer.</li>
     * <li>SYSTEM: system analyzer.</li>
     * <li>USER: custom analyzer.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM</p>
     */
    @NameInMap("analyzerType")
    public String analyzerType;

    /**
     * <p>The name of the intervention dictionary.</p>
     * 
     * <strong>example:</strong>
     * <p>ner_dict_ec</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The type of the intervention dictionary. Valid values:</p>
     * <ul>
     * <li>stopword: an intervention dictionary for stop word filtering.</li>
     * <li>synonym: an intervention dictionary for synonym configuration.</li>
     * <li>correction: an intervention dictionary for spelling correction.</li>
     * <li>category_prediction: an intervention dictionary for category prediction.</li>
     * <li>ner: an intervention dictionary for named entity recognition (NER).</li>
     * <li>term_weighting: an intervention dictionary for term weight analysis.</li>
     * <li>suggest_allowlist: a drop-down suggestion whitelist.</li>
     * <li>suggest_denylist: a drop-down suggestion blacklist.</li>
     * <li>hot_allowlist: a top search whitelist.</li>
     * <li>hot_denylist: a top search blacklist.</li>
     * <li>hint_allowlist: a hint whitelist.</li>
     * <li>hint_denylist: a hint blacklist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ner</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
