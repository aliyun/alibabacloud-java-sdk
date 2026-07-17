// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateInterventionDictionaryRequest extends TeaModel {
    /**
     * <p>The type of the analyzer. Valid values:</p>
     * <ul>
     * <li><p>MODEL: a model-based custom analyzer.</p>
     * </li>
     * <li><p>SYSTEM: a system analyzer.</p>
     * </li>
     * <li><p>USER: a custom analyzer.</p>
     * </li>
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
     * <li><p>stopword: an intervention dictionary for stop word filtering.</p>
     * </li>
     * <li><p>synonym: an intervention dictionary for synonym configuration.</p>
     * </li>
     * <li><p>correction: an intervention dictionary for spelling correction.</p>
     * </li>
     * <li><p>category_prediction: an intervention dictionary for category prediction.</p>
     * </li>
     * <li><p>ner: an intervention dictionary for Named Entity Recognition (NER).</p>
     * </li>
     * <li><p>term_weighting: an intervention dictionary for term weight analysis.</p>
     * </li>
     * <li><p>suggest_allowlist: a drop-down suggestion whitelist.</p>
     * </li>
     * <li><p>suggest_denylist: a drop-down suggestion blacklist.</p>
     * </li>
     * <li><p>hot_allowlist: a top search whitelist.</p>
     * </li>
     * <li><p>hot_denylist: a top search blacklist.</p>
     * </li>
     * <li><p>hint_allowlist: a hint whitelist.</p>
     * </li>
     * <li><p>hint_denylist: a hint blacklist.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ner</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Specifies whether to perform a dry run. The default value is false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Validates the request parameters but does not create the intervention dictionary.</p>
     * </li>
     * <li><p><strong>false</strong>: Validates the request parameters and creates the intervention dictionary.</p>
     * </li>
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
