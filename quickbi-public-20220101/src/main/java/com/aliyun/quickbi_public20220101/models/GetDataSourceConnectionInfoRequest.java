// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetDataSourceConnectionInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7AAB95D-*****-****-*4FC0C976</p>
     */
    @NameInMap("DsId")
    public String dsId;

    public static GetDataSourceConnectionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceConnectionInfoRequest self = new GetDataSourceConnectionInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDataSourceConnectionInfoRequest setDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }
    public String getDsId() {
        return this.dsId;
    }

}
