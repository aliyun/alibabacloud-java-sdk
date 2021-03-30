// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.netana20201016.models;

import com.aliyun.tea.*;

public class ListIpGeolocationsResponseBody extends TeaModel {
    @NameInMap("IpGeolocationModels")
    public ListIpGeolocationsResponseBodyIpGeolocationModels ipGeolocationModels;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListIpGeolocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpGeolocationsResponseBody self = new ListIpGeolocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpGeolocationsResponseBody setIpGeolocationModels(ListIpGeolocationsResponseBodyIpGeolocationModels ipGeolocationModels) {
        this.ipGeolocationModels = ipGeolocationModels;
        return this;
    }
    public ListIpGeolocationsResponseBodyIpGeolocationModels getIpGeolocationModels() {
        return this.ipGeolocationModels;
    }

    public ListIpGeolocationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListIpGeolocationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpGeolocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpGeolocationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class ListIpGeolocationsResponseBodyIpGeolocationModelsIpGeolocationModel extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("ResourcePoolName")
        public String resourcePoolName;

        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("Ipv4Prefix")
        public String ipv4Prefix;

        public static ListIpGeolocationsResponseBodyIpGeolocationModelsIpGeolocationModel build(java.util.Map<String, ?> map) throws Exception {
            ListIpGeolocationsResponseBodyIpGeolocationModelsIpGeolocationModel self = new ListIpGeolocationsResponseBodyIpGeolocationModelsIpGeolocationModel();
            return TeaModel.build(map, self);
        }

        public ListIpGeolocationsResponseBodyIpGeolocationModelsIpGeolocationModel setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ListIpGeolocationsResponseBodyIpGeolocationModelsIpGeolocationModel setResourcePoolName(String resourcePoolName) {
            this.resourcePoolName = resourcePoolName;
            return this;
        }
        public String getResourcePoolName() {
            return this.resourcePoolName;
        }

        public ListIpGeolocationsResponseBodyIpGeolocationModelsIpGeolocationModel setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public ListIpGeolocationsResponseBodyIpGeolocationModelsIpGeolocationModel setIpv4Prefix(String ipv4Prefix) {
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }
        public String getIpv4Prefix() {
            return this.ipv4Prefix;
        }

    }

    public static class ListIpGeolocationsResponseBodyIpGeolocationModels extends TeaModel {
        @NameInMap("IpGeolocationModel")
        public java.util.List<ListIpGeolocationsResponseBodyIpGeolocationModelsIpGeolocationModel> ipGeolocationModel;

        public static ListIpGeolocationsResponseBodyIpGeolocationModels build(java.util.Map<String, ?> map) throws Exception {
            ListIpGeolocationsResponseBodyIpGeolocationModels self = new ListIpGeolocationsResponseBodyIpGeolocationModels();
            return TeaModel.build(map, self);
        }

        public ListIpGeolocationsResponseBodyIpGeolocationModels setIpGeolocationModel(java.util.List<ListIpGeolocationsResponseBodyIpGeolocationModelsIpGeolocationModel> ipGeolocationModel) {
            this.ipGeolocationModel = ipGeolocationModel;
            return this;
        }
        public java.util.List<ListIpGeolocationsResponseBodyIpGeolocationModelsIpGeolocationModel> getIpGeolocationModel() {
            return this.ipGeolocationModel;
        }

    }

}
