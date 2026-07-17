// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestSceneRequest extends TeaModel {
    /**
     * <p>The A/B test scene. For more information, see <a href="https://help.aliyun.com/document_detail/173618.html">ABTestScene</a>.</p>
     */
    @NameInMap("body")
    public ABTestScene body;

    /**
     * <p>Specifies whether to validate only the request parameters. The default value is false.</p>
     * <p>Values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Validates only the request parameters.</p>
     * </li>
     * <li><p><strong>false</strong>: Validates the request parameters and creates the attribution configuration.</p>
     * </li>
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
