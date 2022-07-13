// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class GetEndpointAttributeByNsiAndServiceIdRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("NsiIndex")
    public String nsiIndex;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceId")
    public String serviceId;

    public static GetEndpointAttributeByNsiAndServiceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEndpointAttributeByNsiAndServiceIdRequest self = new GetEndpointAttributeByNsiAndServiceIdRequest();
        return TeaModel.build(map, self);
    }

    public GetEndpointAttributeByNsiAndServiceIdRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetEndpointAttributeByNsiAndServiceIdRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public GetEndpointAttributeByNsiAndServiceIdRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetEndpointAttributeByNsiAndServiceIdRequest setNsiIndex(String nsiIndex) {
        this.nsiIndex = nsiIndex;
        return this;
    }
    public String getNsiIndex() {
        return this.nsiIndex;
    }

    public GetEndpointAttributeByNsiAndServiceIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetEndpointAttributeByNsiAndServiceIdRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
