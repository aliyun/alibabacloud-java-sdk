// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterScannerYamlRequest extends TeaModel {
    /**
     * <p>The ID of the cluster that you want to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd49575861a3044d49c954e4b3911****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetClusterScannerYamlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterScannerYamlRequest self = new GetClusterScannerYamlRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterScannerYamlRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
