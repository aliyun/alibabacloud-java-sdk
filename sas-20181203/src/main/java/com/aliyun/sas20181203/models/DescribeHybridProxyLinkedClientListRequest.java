// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHybridProxyLinkedClientListRequest extends TeaModel {
    /**
     * <p>The name of the proxy cluster. You can query the name of the proxy cluster in the Security Center console.</p>
     * 
     * <strong>example:</strong>
     * <p>office-proxy</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The UUID of the proxy node. You can call the DescribeHybridProxyList operation to query the UUID of the proxy node.</p>
     * 
     * <strong>example:</strong>
     * <p>inet-proxy-3bb11fad-37d6-4aee-9c37-b0ad1612XXXX</p>
     */
    @NameInMap("ProxyUuid")
    public String proxyUuid;

    /**
     * <p>The description of the proxy cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The UUID of the server on which the Security Center agent is installed. You can query the UUID by querying asset information.</p>
     * 
     * <strong>example:</strong>
     * <p>80d2f7d6-31a9-4d7f-8ff4-7ecc42f89ca****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeHybridProxyLinkedClientListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridProxyLinkedClientListRequest self = new DescribeHybridProxyLinkedClientListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridProxyLinkedClientListRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeHybridProxyLinkedClientListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeHybridProxyLinkedClientListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHybridProxyLinkedClientListRequest setProxyUuid(String proxyUuid) {
        this.proxyUuid = proxyUuid;
        return this;
    }
    public String getProxyUuid() {
        return this.proxyUuid;
    }

    public DescribeHybridProxyLinkedClientListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeHybridProxyLinkedClientListRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
