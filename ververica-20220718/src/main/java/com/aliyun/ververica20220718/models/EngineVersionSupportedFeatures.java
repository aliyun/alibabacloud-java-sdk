// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class EngineVersionSupportedFeatures extends TeaModel {
    /**
     * <p>Specifies whether the engine version can be used to create a native savepoint.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("supportNativeSavepoint")
    public Boolean supportNativeSavepoint;

    /**
     * <p>Specifies whether the engine version can be used to submit an SQL deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("useForSqlDeployments")
    public Boolean useForSqlDeployments;

    public static EngineVersionSupportedFeatures build(java.util.Map<String, ?> map) throws Exception {
        EngineVersionSupportedFeatures self = new EngineVersionSupportedFeatures();
        return TeaModel.build(map, self);
    }

    public EngineVersionSupportedFeatures setSupportNativeSavepoint(Boolean supportNativeSavepoint) {
        this.supportNativeSavepoint = supportNativeSavepoint;
        return this;
    }
    public Boolean getSupportNativeSavepoint() {
        return this.supportNativeSavepoint;
    }

    public EngineVersionSupportedFeatures setUseForSqlDeployments(Boolean useForSqlDeployments) {
        this.useForSqlDeployments = useForSqlDeployments;
        return this;
    }
    public Boolean getUseForSqlDeployments() {
        return this.useForSqlDeployments;
    }

}
