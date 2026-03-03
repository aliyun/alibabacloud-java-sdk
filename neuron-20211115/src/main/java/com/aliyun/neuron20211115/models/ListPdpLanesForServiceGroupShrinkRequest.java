// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpLanesForServiceGroupShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("companyId")
    public Long companyId;

    /**
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>yunmall</p>
     */
    @NameInMap("keyword")
    public String keyword;

    @NameInMap("laneIds")
    public String laneIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>filter</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <strong>example:</strong>
     * <p>gmtModified</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>199</p>
     */
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("serviceId")
    public Long serviceId;

    public static ListPdpLanesForServiceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPdpLanesForServiceGroupShrinkRequest self = new ListPdpLanesForServiceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPdpLanesForServiceGroupShrinkRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public ListPdpLanesForServiceGroupShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListPdpLanesForServiceGroupShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListPdpLanesForServiceGroupShrinkRequest setLaneIdsShrink(String laneIdsShrink) {
        this.laneIdsShrink = laneIdsShrink;
        return this;
    }
    public String getLaneIdsShrink() {
        return this.laneIdsShrink;
    }

    public ListPdpLanesForServiceGroupShrinkRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ListPdpLanesForServiceGroupShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPdpLanesForServiceGroupShrinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListPdpLanesForServiceGroupShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPdpLanesForServiceGroupShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPdpLanesForServiceGroupShrinkRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public ListPdpLanesForServiceGroupShrinkRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
