// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestSceneRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public ABTestScene body;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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
