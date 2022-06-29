// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListServerGroupServersRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ServerGroupId")
    public String serverGroupId;

    @NameInMap("ServerIds")
    public java.util.List<String> serverIds;

    @NameInMap("ServerIps")
    public java.util.List<String> serverIps;

    public static ListServerGroupServersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupServersRequest self = new ListServerGroupServersRequest();
        return TeaModel.build(map, self);
    }

    public ListServerGroupServersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerGroupServersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerGroupServersRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public ListServerGroupServersRequest setServerIds(java.util.List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }
    public java.util.List<String> getServerIds() {
        return this.serverIds;
    }

    public ListServerGroupServersRequest setServerIps(java.util.List<String> serverIps) {
        this.serverIps = serverIps;
        return this;
    }
    public java.util.List<String> getServerIps() {
        return this.serverIps;
    }

}
