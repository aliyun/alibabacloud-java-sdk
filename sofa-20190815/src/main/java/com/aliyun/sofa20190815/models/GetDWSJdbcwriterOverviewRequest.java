// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSJdbcwriterOverviewRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("DestDbtype")
    public String destDbtype;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JdbcwriterNames")
    public String jdbcwriterNames;

    @NameInMap("Location")
    public String location;

    @NameInMap("OrderByParam")
    public String orderByParam;

    @NameInMap("OrderByType")
    public String orderByType;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SourceDbtype")
    public String sourceDbtype;

    public static GetDWSJdbcwriterOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSJdbcwriterOverviewRequest self = new GetDWSJdbcwriterOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSJdbcwriterOverviewRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetDWSJdbcwriterOverviewRequest setDestDbtype(String destDbtype) {
        this.destDbtype = destDbtype;
        return this;
    }
    public String getDestDbtype() {
        return this.destDbtype;
    }

    public GetDWSJdbcwriterOverviewRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSJdbcwriterOverviewRequest setJdbcwriterNames(String jdbcwriterNames) {
        this.jdbcwriterNames = jdbcwriterNames;
        return this;
    }
    public String getJdbcwriterNames() {
        return this.jdbcwriterNames;
    }

    public GetDWSJdbcwriterOverviewRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public GetDWSJdbcwriterOverviewRequest setOrderByParam(String orderByParam) {
        this.orderByParam = orderByParam;
        return this;
    }
    public String getOrderByParam() {
        return this.orderByParam;
    }

    public GetDWSJdbcwriterOverviewRequest setOrderByType(String orderByType) {
        this.orderByType = orderByType;
        return this;
    }
    public String getOrderByType() {
        return this.orderByType;
    }

    public GetDWSJdbcwriterOverviewRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public GetDWSJdbcwriterOverviewRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetDWSJdbcwriterOverviewRequest setSourceDbtype(String sourceDbtype) {
        this.sourceDbtype = sourceDbtype;
        return this;
    }
    public String getSourceDbtype() {
        return this.sourceDbtype;
    }

}
