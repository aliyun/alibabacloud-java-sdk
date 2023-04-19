// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListListenerCertificatesRequest extends TeaModel {
    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    public static ListListenerCertificatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListListenerCertificatesRequest self = new ListListenerCertificatesRequest();
        return TeaModel.build(map, self);
    }

    public ListListenerCertificatesRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public ListListenerCertificatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListListenerCertificatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListListenerCertificatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
