// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateImageEventOperationRequest extends TeaModel {
    /**
     * <p>The rule conditions. Specify a value in the JSON format. You can specify the following keys:</p>
     * <ul>
     * <li><strong>condition</strong>: the matching condition.</li>
     * <li><strong>type</strong>: the matching type.</li>
     * <li><strong>value</strong>: the matching value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;condition\&quot;: \&quot;MD5\&quot;, \&quot;type\&quot;: \&quot;equals\&quot;, \&quot;value\&quot;: \&quot;0083a31cc0083a31ccf7c10367a6e****\&quot;}]</p>
     */
    @NameInMap("Conditions")
    public String conditions;

    /**
     * <p>The ID of the alert handling rule. </p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeImageEventOperationPage~~">DescribeImageEventOperationPage</a> operation to query the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>814163</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The remarks that you want to add.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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

    /**
     * <p>The source of the whitelist. Valid values:</p>
     * <ul>
     * <li><strong>image</strong>: image.</li>
     * <li><strong>agentless</strong>: agentless detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
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
