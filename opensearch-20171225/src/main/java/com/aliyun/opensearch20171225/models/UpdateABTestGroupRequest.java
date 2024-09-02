// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestGroupRequest extends TeaModel {
    /**
     * <p>The request body. For more information, see <a href="https://help.aliyun.com/document_detail/178935.html">ABTestGroup</a>.</p>
     */
    @NameInMap("body")
    public ABTestGroup body;

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

    public static UpdateABTestGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestGroupRequest self = new UpdateABTestGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateABTestGroupRequest setBody(ABTestGroup body) {
        this.body = body;
        return this;
    }
    public ABTestGroup getBody() {
        return this.body;
    }

    public UpdateABTestGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
