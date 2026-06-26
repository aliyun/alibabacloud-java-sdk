// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsAttributeRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters under your account, including cluster IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1q76364ird*****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The PolarLakebase instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>Specifies whether to query Fuse mount information. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
