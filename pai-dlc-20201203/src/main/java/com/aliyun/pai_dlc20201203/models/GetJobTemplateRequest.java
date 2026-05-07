// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobTemplateRequest extends TeaModel {
    /**
     * <p>不传返回默认版本；传具体数字返回该版本；传 all 返回全部版本</p>
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
