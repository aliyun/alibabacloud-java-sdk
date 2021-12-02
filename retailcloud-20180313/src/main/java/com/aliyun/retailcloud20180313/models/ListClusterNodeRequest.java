// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListClusterNodeRequest extends TeaModel {
    @NameInMap("ClusterInstanceId")
    public String clusterInstanceId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListClusterNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodeRequest self = new ListClusterNodeRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterNodeRequest setClusterInstanceId(String clusterInstanceId) {
        this.clusterInstanceId = clusterInstanceId;
        return this;
    }
    public String getClusterInstanceId() {
        return this.clusterInstanceId;
    }

    public ListClusterNodeRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListClusterNodeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
