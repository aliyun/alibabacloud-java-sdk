// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class ListClusterDeprecatedAPIRequest extends TeaModel {
    @NameInMap("cluster_id")
    public String clusterId;

    @NameInMap("page_no")
    public Integer pageNo;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("target_version")
    public String targetVersion;

    public static ListClusterDeprecatedAPIRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterDeprecatedAPIRequest self = new ListClusterDeprecatedAPIRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterDeprecatedAPIRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterDeprecatedAPIRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListClusterDeprecatedAPIRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterDeprecatedAPIRequest setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
