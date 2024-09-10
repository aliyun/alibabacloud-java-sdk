// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateImageEventOperationRequest extends TeaModel {
    /**
     * <p>The ID of the alert handling rule.</p>
     * 
     * <strong>example:</strong>
     * <p>814163</p>
     */
    @NameInMap("Id")
    public Long id;

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

    public static UpdateImageEventOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageEventOperationRequest self = new UpdateImageEventOperationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageEventOperationRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateImageEventOperationRequest setScenarios(String scenarios) {
        this.scenarios = scenarios;
        return this;
    }
    public String getScenarios() {
        return this.scenarios;
    }

}
