// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSCrawlerTpsRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("CrawlerName")
    public String crawlerName;

    @NameInMap("End")
    public Long end;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Start")
    public Long start;

    public static GetDWSCrawlerTpsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSCrawlerTpsRequest self = new GetDWSCrawlerTpsRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSCrawlerTpsRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetDWSCrawlerTpsRequest setCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
        return this;
    }
    public String getCrawlerName() {
        return this.crawlerName;
    }

    public GetDWSCrawlerTpsRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetDWSCrawlerTpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSCrawlerTpsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
