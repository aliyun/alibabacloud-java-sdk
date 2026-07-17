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
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p>true: Performs a dry run. The system checks if the AccessKey is valid, if the RAM user is authorized, and if all required parameters are specified. The test group is not updated.</p>
     * </li>
     * <li><p>false (default): Sends the request to update the test group.</p>
     * </li>
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
