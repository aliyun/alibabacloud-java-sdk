// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListPatchBaselinesRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Name")
    public String name;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OperationSystem")
    public String operationSystem;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ShareType")
    public String shareType;

    public static ListPatchBaselinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPatchBaselinesRequest self = new ListPatchBaselinesRequest();
        return TeaModel.build(map, self);
    }

    public ListPatchBaselinesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPatchBaselinesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPatchBaselinesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPatchBaselinesRequest setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
        return this;
    }
    public String getOperationSystem() {
        return this.operationSystem;
    }

    public ListPatchBaselinesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPatchBaselinesRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

}
