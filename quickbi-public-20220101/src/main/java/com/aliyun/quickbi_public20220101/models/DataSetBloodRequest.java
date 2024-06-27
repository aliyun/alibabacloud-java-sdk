// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DataSetBloodRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>234235234,234235235,234235235</p>
     */
    @NameInMap("DataSetIds")
    public String dataSetIds;

    /**
     * <strong>example:</strong>
     * <p>dasasgaj342351</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>PAGE</p>
     */
    @NameInMap("WorksType")
    public String worksType;

    public static DataSetBloodRequest build(java.util.Map<String, ?> map) throws Exception {
        DataSetBloodRequest self = new DataSetBloodRequest();
        return TeaModel.build(map, self);
    }

    public DataSetBloodRequest setDataSetIds(String dataSetIds) {
        this.dataSetIds = dataSetIds;
        return this;
    }
    public String getDataSetIds() {
        return this.dataSetIds;
    }

    public DataSetBloodRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DataSetBloodRequest setWorksType(String worksType) {
        this.worksType = worksType;
        return this;
    }
    public String getWorksType() {
        return this.worksType;
    }

}
