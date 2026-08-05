// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarFsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the cluster IDs of all Data Warehouse Edition clusters in a specific region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The PolarFs instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pcs-2ze0i74ka607wck3</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    public static DeletePolarFsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarFsRequest self = new DeletePolarFsRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolarFsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeletePolarFsRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

}
