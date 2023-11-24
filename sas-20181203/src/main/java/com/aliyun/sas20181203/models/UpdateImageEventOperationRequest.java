// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateImageEventOperationRequest extends TeaModel {
    /**
     * <p>The ID of the alert handling rule.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The application scope of the rule. The value is in the JSON format. Valid values:</p>
     * <br>
     * <p>*   **type**</p>
     * <p>*   **value**</p>
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
