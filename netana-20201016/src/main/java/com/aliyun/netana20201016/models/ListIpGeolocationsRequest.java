// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.netana20201016.models;

import com.aliyun.tea.*;

public class ListIpGeolocationsRequest extends TeaModel {
    @NameInMap("CountryCode")
    public String countryCode;

    @NameInMap("CityCode")
    public String cityCode;

    @NameInMap("Ipv4Prefix")
    public String ipv4Prefix;

    @NameInMap("ResourcePoolName")
    public String resourcePoolName;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListIpGeolocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpGeolocationsRequest self = new ListIpGeolocationsRequest();
        return TeaModel.build(map, self);
    }

    public ListIpGeolocationsRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public ListIpGeolocationsRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public ListIpGeolocationsRequest setIpv4Prefix(String ipv4Prefix) {
        this.ipv4Prefix = ipv4Prefix;
        return this;
    }
    public String getIpv4Prefix() {
        return this.ipv4Prefix;
    }

    public ListIpGeolocationsRequest setResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
        return this;
    }
    public String getResourcePoolName() {
        return this.resourcePoolName;
    }

    public ListIpGeolocationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpGeolocationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

}
