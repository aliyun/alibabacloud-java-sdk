// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetEndPointByDomainRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DomainURL")
    @Validation(required = true)
    public String domainURL;

    @NameInMap("RegionID")
    public String regionID;

    public static GetEndPointByDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEndPointByDomainRequest self = new GetEndPointByDomainRequest();
        return TeaModel.build(map, self);
    }

    public GetEndPointByDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetEndPointByDomainRequest setDomainURL(String domainURL) {
        this.domainURL = domainURL;
        return this;
    }
    public String getDomainURL() {
        return this.domainURL;
    }

    public GetEndPointByDomainRequest setRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }
    public String getRegionID() {
        return this.regionID;
    }

}
