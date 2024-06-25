// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetSqlInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Long version;

    public static GetSqlInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSqlInstanceRequest self = new GetSqlInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetSqlInstanceRequest setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
