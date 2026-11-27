// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobTemplateRequest extends TeaModel {
    /**
     * <p>The version number. If you leave this parameter empty, the default version is returned. If you specify a number, the specified version is returned. If you specify all, all versions are returned.</p>
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
