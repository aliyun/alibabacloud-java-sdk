// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetOssUploadPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Scenario")
    public String scenario;

    public static GetOssUploadPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadPolicyRequest self = new GetOssUploadPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetOssUploadPolicyRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

}
