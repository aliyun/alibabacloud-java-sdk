// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsAttributeRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    @NameInMap("QueryFuseMountInfo")
    public Boolean queryFuseMountInfo;

    public static DescribePolarFsAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsAttributeRequest self = new DescribePolarFsAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsAttributeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribePolarFsAttributeRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public DescribePolarFsAttributeRequest setQueryFuseMountInfo(Boolean queryFuseMountInfo) {
        this.queryFuseMountInfo = queryFuseMountInfo;
        return this;
    }
    public Boolean getQueryFuseMountInfo() {
        return this.queryFuseMountInfo;
    }

}
