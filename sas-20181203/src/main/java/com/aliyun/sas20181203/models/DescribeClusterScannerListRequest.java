// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterScannerListRequest extends TeaModel {
    /**
     * <p>The list of cluster IDs.</p>
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
     * <li><strong>online</strong>: running</li>
     * <li><strong>offline</strong>: offline</li>
     * <li><strong>not_installed</strong>: not installed</li>
     * </ul>
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
