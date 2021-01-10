// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSCrawlerDelayRequest extends TeaModel {
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

    public static GetDWSCrawlerDelayRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSCrawlerDelayRequest self = new GetDWSCrawlerDelayRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSCrawlerDelayRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetDWSCrawlerDelayRequest setCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
        return this;
    }
    public String getCrawlerName() {
        return this.crawlerName;
    }

    public GetDWSCrawlerDelayRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetDWSCrawlerDelayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSCrawlerDelayRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
