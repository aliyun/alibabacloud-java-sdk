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
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p>true: Performs a dry run. The system checks if your AccessKey is valid, if the Resource Access Management (RAM) user is authorized, and if all required parameters are specified. The request is not sent.</p>
     * </li>
     * <li><p>false (default): Sends the request to update the experiment.</p>
     * </li>
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
