// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSCrawlerOverviewRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("CrawlerDbtype")
    public String crawlerDbtype;

    @NameInMap("CrawlerNames")
    public String crawlerNames;

    @NameInMap("InstanceId")
    public String instanceId;

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

    public static GetDWSCrawlerOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSCrawlerOverviewRequest self = new GetDWSCrawlerOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSCrawlerOverviewRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetDWSCrawlerOverviewRequest setCrawlerDbtype(String crawlerDbtype) {
        this.crawlerDbtype = crawlerDbtype;
        return this;
    }
    public String getCrawlerDbtype() {
        return this.crawlerDbtype;
    }

    public GetDWSCrawlerOverviewRequest setCrawlerNames(String crawlerNames) {
        this.crawlerNames = crawlerNames;
        return this;
    }
    public String getCrawlerNames() {
        return this.crawlerNames;
    }

    public GetDWSCrawlerOverviewRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSCrawlerOverviewRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public GetDWSCrawlerOverviewRequest setOrderByParam(String orderByParam) {
        this.orderByParam = orderByParam;
        return this;
    }
    public String getOrderByParam() {
        return this.orderByParam;
    }

    public GetDWSCrawlerOverviewRequest setOrderByType(String orderByType) {
        this.orderByType = orderByType;
        return this;
    }
    public String getOrderByType() {
        return this.orderByType;
    }

    public GetDWSCrawlerOverviewRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public GetDWSCrawlerOverviewRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
