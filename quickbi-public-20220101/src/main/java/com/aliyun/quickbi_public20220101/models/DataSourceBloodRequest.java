// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DataSourceBloodRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>44051300991327000048</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    public static DataSourceBloodRequest build(java.util.Map<String, ?> map) throws Exception {
        DataSourceBloodRequest self = new DataSourceBloodRequest();
        return TeaModel.build(map, self);
    }

    public DataSourceBloodRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

}
