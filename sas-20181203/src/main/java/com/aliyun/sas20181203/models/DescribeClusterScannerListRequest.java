// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterScannerListRequest extends TeaModel {
    /**
     * <p>The list of cluster IDs.</p>
     * <p>You must specify at least one of StatusList and ClusterIdList. If neither is specified, the API returns HTTP 400 with the error code InvalidParam.</p>
     * <p>Before calling this operation, make sure that an ACK cluster exists. You can obtain the cluster ID by calling the <a href="https://api.aliyun.com/document/CS/2015-12-15/DescribeClusters">DescribeClusters</a> operation of Container Service.</p>
     */
    @NameInMap("ClusterIdList")
    public java.util.List<String> clusterIdList;

    /**
     * <p>The language type for the request and response messages.</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The list of scanner statuses. Valid values:</p>
     * <ul>
     * <li><strong>online</strong>: Running.</li>
     * <li><strong>offline</strong>: Offline.</li>
     * <li><strong>not_installed</strong>: Not installed.</li>
     * </ul>
     * <p>You must specify at least one of StatusList and ClusterIdList. If neither is specified, the API returns HTTP 400 with the error code InvalidParam.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    public static DescribeClusterScannerListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterScannerListRequest self = new DescribeClusterScannerListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterScannerListRequest setClusterIdList(java.util.List<String> clusterIdList) {
        this.clusterIdList = clusterIdList;
        return this;
    }
    public java.util.List<String> getClusterIdList() {
        return this.clusterIdList;
    }

    public DescribeClusterScannerListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeClusterScannerListRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}
