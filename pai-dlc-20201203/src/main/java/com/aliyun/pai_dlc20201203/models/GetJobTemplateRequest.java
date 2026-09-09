// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobTemplateRequest extends TeaModel {
    /**
     * <p>If this parameter is not specified, the default version is returned. If a specific number is specified, the corresponding version is returned. If all is specified, all versions are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Version")
    public String version;

    public static GetJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobTemplateRequest self = new GetJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetJobTemplateRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
