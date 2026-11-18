// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GetPolarClawConfigRequest extends TeaModel {
    /**
     * <p>The application ID. Usage note: In the Prerequisites section, specify that the ApplicationId can be obtained by calling DescribeApplications (filtered by ApplicationType=polardb_polarclaw), and indicate the retrieval path in the description of the ApplicationId parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>Filters configuration sections by a JSONPath dot-notation path. If this parameter is left empty, all configurations are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>models</p>
     */
    @NameInMap("ConfigPath")
    public String configPath;

    public static GetPolarClawConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolarClawConfigRequest self = new GetPolarClawConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetPolarClawConfigRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public GetPolarClawConfigRequest setConfigPath(String configPath) {
        this.configPath = configPath;
        return this;
    }
    public String getConfigPath() {
        return this.configPath;
    }

}
