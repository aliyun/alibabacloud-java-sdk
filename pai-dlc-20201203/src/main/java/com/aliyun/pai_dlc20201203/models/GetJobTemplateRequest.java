// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobTemplateRequest extends TeaModel {
    /**
     * <p>The version to retrieve. If omitted, the default version is returned. Specify <code>all</code> to retrieve all versions.</p>
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
