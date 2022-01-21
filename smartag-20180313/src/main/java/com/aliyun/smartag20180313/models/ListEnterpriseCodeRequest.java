// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListEnterpriseCodeRequest extends TeaModel {
    @NameInMap("EnterpriseCode")
    public String enterpriseCode;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    public static ListEnterpriseCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseCodeRequest self = new ListEnterpriseCodeRequest();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseCodeRequest setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public ListEnterpriseCodeRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public ListEnterpriseCodeRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEnterpriseCodeRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEnterpriseCodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
