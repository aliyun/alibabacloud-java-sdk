// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateImageEventOperationRequest extends TeaModel {
    @NameInMap("Conditions")
    public String conditions;

    /**
     * <p>The ID of the alert handling rule.</p>
     * 
     * <strong>example:</strong>
     * <p>814163</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Note")
    public String note;

    /**
     * <p>The application scope of the rule. The value is in the JSON format. Valid values:</p>
     * <ul>
     * <li><strong>type</strong></li>
     * <li><strong>value</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;type\&quot;: \&quot;repo\&quot;, \&quot;value\&quot;: \&quot;test-aaa/shenzhen-repo-01\&quot;}</p>
     */
    @NameInMap("Scenarios")
    public String scenarios;

    @NameInMap("Source")
    public String source;

    public static UpdateImageEventOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageEventOperationRequest self = new UpdateImageEventOperationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageEventOperationRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public UpdateImageEventOperationRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateImageEventOperationRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public UpdateImageEventOperationRequest setScenarios(String scenarios) {
        this.scenarios = scenarios;
        return this;
    }
    public String getScenarios() {
        return this.scenarios;
    }

    public UpdateImageEventOperationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
