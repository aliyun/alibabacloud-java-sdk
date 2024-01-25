// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmc20211104.models;

import com.aliyun.tea.*;

public class ListResourceRelationshipsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 20.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to initiate the next request.</p>
     * <br>
     * <p>If the total number of entries returned for the current request exceeds the value of the `MaxResults` parameter, the entries are truncated. In this case, you can use the token to initiate another request and obtain the remaining entries.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the resource whose associated resources you want to query.</p>
     */
    @NameInMap("SourceRegionId")
    public String sourceRegionId;

    /**
     * <p>The IDs of the resource whose associated resources you want to query.</p>
     * <br>
     * <p>You can specify a maximum of 10 resource IDs.</p>
     */
    @NameInMap("SourceResourceId")
    public java.util.List<String> sourceResourceId;

    /**
     * <p>The type of the resource whose associated resources you want to query.</p>
     */
    @NameInMap("SourceResourceType")
    public String sourceResourceType;

    /**
     * <p>The types of the associated resources that you want to query.</p>
     * <br>
     * <p>You can specify a maximum of 10 resource types.</p>
     */
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
