// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20260603.models;

import com.aliyun.tea.*;

public class ListModelDeploymentProfilesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cmu-biz</p>
     */
    @NameInMap("BizKey")
    public String bizKey;

    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

    public static ListModelDeploymentProfilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelDeploymentProfilesRequest self = new ListModelDeploymentProfilesRequest();
        return TeaModel.build(map, self);
    }

    public ListModelDeploymentProfilesRequest setBizKey(String bizKey) {
        this.bizKey = bizKey;
        return this;
    }
    public String getBizKey() {
        return this.bizKey;
    }

    public ListModelDeploymentProfilesRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

}
