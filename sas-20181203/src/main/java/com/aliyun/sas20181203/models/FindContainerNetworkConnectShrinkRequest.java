// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FindContainerNetworkConnectShrinkRequest extends TeaModel {
    @NameInMap("CriteriaType")
    public String criteriaType;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DstNode")
    public String dstNodeShrink;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SrcNode")
    public String srcNodeShrink;

    @NameInMap("StartTime")
    public Long startTime;

    public static FindContainerNetworkConnectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FindContainerNetworkConnectShrinkRequest self = new FindContainerNetworkConnectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FindContainerNetworkConnectShrinkRequest setCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
        return this;
    }
    public String getCriteriaType() {
        return this.criteriaType;
    }

    public FindContainerNetworkConnectShrinkRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public FindContainerNetworkConnectShrinkRequest setDstNodeShrink(String dstNodeShrink) {
        this.dstNodeShrink = dstNodeShrink;
        return this;
    }
    public String getDstNodeShrink() {
        return this.dstNodeShrink;
    }

    public FindContainerNetworkConnectShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public FindContainerNetworkConnectShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public FindContainerNetworkConnectShrinkRequest setSrcNodeShrink(String srcNodeShrink) {
        this.srcNodeShrink = srcNodeShrink;
        return this;
    }
    public String getSrcNodeShrink() {
        return this.srcNodeShrink;
    }

    public FindContainerNetworkConnectShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
