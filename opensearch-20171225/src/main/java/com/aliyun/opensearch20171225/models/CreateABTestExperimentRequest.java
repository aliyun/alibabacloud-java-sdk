// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestExperimentRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public ABTestExperiment body;

    /**
     * <p>Specifies whether to perform a dry run. The default value is false. Valid values:</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The system checks the validity of the request parameters.</p>
     * </li>
     * <li><p><strong>false</strong>: The system checks the validity of the request parameters and creates the experiment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateABTestExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestExperimentRequest self = new CreateABTestExperimentRequest();
        return TeaModel.build(map, self);
    }

    public CreateABTestExperimentRequest setBody(ABTestExperiment body) {
        this.body = body;
        return this;
    }
    public ABTestExperiment getBody() {
        return this.body;
    }

    public CreateABTestExperimentRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
