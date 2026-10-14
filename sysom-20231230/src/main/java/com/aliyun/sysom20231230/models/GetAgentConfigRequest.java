// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAgentConfigRequest extends TeaModel {
    /**
     * <p>The ID of the component for which you want to retrieve configurations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The ID of the component configuration to retrieve.</p>
     * 
     * <strong>example:</strong>
     * <p>4d5ecf02-3d01-11f0-8c90-00163e1029af</p>
     */
    @NameInMap("configId")
    public String configId;

    /**
     * <p>The name of the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Configuration-x</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <p>The current page number. This field is available when page-based pagination is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public String current;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    public static GetAgentConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentConfigRequest self = new GetAgentConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentConfigRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public GetAgentConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public GetAgentConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public GetAgentConfigRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public GetAgentConfigRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetAgentConfigRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
