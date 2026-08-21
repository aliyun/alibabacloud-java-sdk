// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetConfigByNameRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>The configuration name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>节点网络延时检测</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <p>The type of the configuration parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>attention</p>
     */
    @NameInMap("configType")
    public String configType;

    /**
     * <p>The entity ID. Default value: &quot;default&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bptest</p>
     */
    @NameInMap("entityId")
    public String entityId;

    /**
     * <p>Specifies whether to use the global UID.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("useGlobalUid")
    public Boolean useGlobalUid;

    /**
     * <p>The version ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("versionId")
    public Long versionId;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static GetConfigByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigByNameRequest self = new GetConfigByNameRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigByNameRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public GetConfigByNameRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public GetConfigByNameRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetConfigByNameRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public GetConfigByNameRequest setUseGlobalUid(Boolean useGlobalUid) {
        this.useGlobalUid = useGlobalUid;
        return this;
    }
    public Boolean getUseGlobalUid() {
        return this.useGlobalUid;
    }

    public GetConfigByNameRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

    public GetConfigByNameRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
