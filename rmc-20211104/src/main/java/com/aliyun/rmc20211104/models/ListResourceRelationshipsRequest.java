// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmc20211104.models;

import com.aliyun.tea.*;

public class ListResourceRelationshipsRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("SourceRegionId")
    public String sourceRegionId;

    @NameInMap("SourceResourceId")
    public java.util.List<String> sourceResourceId;

    @NameInMap("SourceResourceType")
    public String sourceResourceType;

    @NameInMap("TargetResourceType")
    public java.util.List<String> targetResourceType;

    public static ListResourceRelationshipsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRelationshipsRequest self = new ListResourceRelationshipsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceRelationshipsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceRelationshipsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceRelationshipsRequest setSourceRegionId(String sourceRegionId) {
        this.sourceRegionId = sourceRegionId;
        return this;
    }
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public ListResourceRelationshipsRequest setSourceResourceId(java.util.List<String> sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }
    public java.util.List<String> getSourceResourceId() {
        return this.sourceResourceId;
    }

    public ListResourceRelationshipsRequest setSourceResourceType(String sourceResourceType) {
        this.sourceResourceType = sourceResourceType;
        return this;
    }
    public String getSourceResourceType() {
        return this.sourceResourceType;
    }

    public ListResourceRelationshipsRequest setTargetResourceType(java.util.List<String> targetResourceType) {
        this.targetResourceType = targetResourceType;
        return this;
    }
    public java.util.List<String> getTargetResourceType() {
        return this.targetResourceType;
    }

}
