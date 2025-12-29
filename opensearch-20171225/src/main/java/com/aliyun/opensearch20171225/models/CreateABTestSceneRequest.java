// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestSceneRequest extends TeaModel {
    /**
     * <p>The ABTest scenario. For more information, see <a href="https://help.aliyun.com/document_detail/173618.html">ABTestScene</a></p>
     */
    @NameInMap("body")
    public ABTestScene body;

    /**
     * <p>Specifies whether to check the validity of input parameters. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: checks only the validity of input parameters.</li>
     * <li><strong>false</strong>: checks the validity of input parameters and creates an attribution configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateABTestSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestSceneRequest self = new CreateABTestSceneRequest();
        return TeaModel.build(map, self);
    }

    public CreateABTestSceneRequest setBody(ABTestScene body) {
        this.body = body;
        return this;
    }
    public ABTestScene getBody() {
        return this.body;
    }

    public CreateABTestSceneRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
