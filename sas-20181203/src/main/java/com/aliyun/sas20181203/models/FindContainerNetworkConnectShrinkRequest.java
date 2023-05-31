// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FindContainerNetworkConnectShrinkRequest extends TeaModel {
    /**
     * <p>The type of the information that you want to query. Valid values:</p>
     * <br>
     * <p>*   **EDGE**: connection information</p>
     */
    @NameInMap("CriteriaType")
    public String criteriaType;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The information about the destination node.</p>
     */
    @NameInMap("DstNode")
    public String dstNodeShrink;

    /**
     * <p>The end time of the network connection.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>> We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The information about the source node.</p>
     */
    @NameInMap("SrcNode")
    public String srcNodeShrink;

    /**
     * <p>The start time of the network connection.</p>
     */
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
