// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHybridProxyLinkedClientListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>office-proxy</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>inet-proxy-3bb11fad-37d6-4aee-9c37-b0ad1612XXXX</p>
     */
    @NameInMap("ProxyUuid")
    public String proxyUuid;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
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
