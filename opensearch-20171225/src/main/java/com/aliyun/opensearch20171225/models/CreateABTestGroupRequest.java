// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestGroupRequest extends TeaModel {
    /**
     * <p>The request body. For more information, see <a href="https://help.aliyun.com/document_detail/178935.html">ABTestGroup</a>.</p>
     */
    @NameInMap("body")
    public ABTestGroup body;

    /**
     * <p>Specifies whether to check the validity of the input parameters. The default value is false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: checks only the validity of the input parameters.</p>
     * </li>
     * <li><p><strong>false</strong>: checks the validity of the input parameters and creates an attribution configuration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateABTestGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestGroupRequest self = new CreateABTestGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateABTestGroupRequest setBody(ABTestGroup body) {
        this.body = body;
        return this;
    }
    public ABTestGroup getBody() {
        return this.body;
    }

    public CreateABTestGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
