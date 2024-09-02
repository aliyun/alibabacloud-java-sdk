// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestExperimentRequest extends TeaModel {
    /**
     * <p>The request body. For more information, see <a href="https://help.aliyun.com/document_detail/173617.html">ABTestExperiment</a>.</p>
     */
    @NameInMap("body")
    public ABTestExperiment body;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li>true: performs only a dry run. No endpoint is created. The system checks whether your AccessKey is valid, whether Resource Access Management (RAM) users are authorized, and whether the required parameters are set.</li>
     * <li>false (default): creates an endpoint immediately.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static UpdateABTestExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestExperimentRequest self = new UpdateABTestExperimentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateABTestExperimentRequest setBody(ABTestExperiment body) {
        this.body = body;
        return this;
    }
    public ABTestExperiment getBody() {
        return this.body;
    }

    public UpdateABTestExperimentRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
