// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetOssPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234****</p>
     */
    @NameInMap("SubSceneId")
    public String subSceneId;

    public static GetOssPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssPolicyRequest self = new GetOssPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetOssPolicyRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

}
