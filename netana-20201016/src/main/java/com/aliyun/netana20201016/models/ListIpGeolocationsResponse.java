// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.netana20201016.models;

import com.aliyun.tea.*;

public class ListIpGeolocationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public Integer nextToken;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("MaxResults")
    @Validation(required = true)
    public Integer maxResults;

    @NameInMap("IpGeolocationModels")
    @Validation(required = true)
    public ListIpGeolocationsResponseIpGeolocationModels ipGeolocationModels;

    public static ListIpGeolocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpGeolocationsResponse self = new ListIpGeolocationsResponse();
        return TeaModel.build(map, self);
    }

    public ListIpGeolocationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpGeolocationsResponse setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListIpGeolocationsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListIpGeolocationsResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpGeolocationsResponse setIpGeolocationModels(ListIpGeolocationsResponseIpGeolocationModels ipGeolocationModels) {
        this.ipGeolocationModels = ipGeolocationModels;
        return this;
    }
    public ListIpGeolocationsResponseIpGeolocationModels getIpGeolocationModels() {
        return this.ipGeolocationModels;
    }

    public static class ListIpGeolocationsResponseIpGeolocationModelsIpGeolocationModel extends TeaModel {
        @NameInMap("Ipv4Prefix")
        @Validation(required = true)
        public String ipv4Prefix;

        @NameInMap("CountryCode")
        @Validation(required = true)
        public String countryCode;

        @NameInMap("CityCode")
        @Validation(required = true)
        public String cityCode;

        @NameInMap("ResourcePoolName")
        @Validation(required = true)
        public String resourcePoolName;

        public static ListIpGeolocationsResponseIpGeolocationModelsIpGeolocationModel build(java.util.Map<String, ?> map) throws Exception {
            ListIpGeolocationsResponseIpGeolocationModelsIpGeolocationModel self = new ListIpGeolocationsResponseIpGeolocationModelsIpGeolocationModel();
            return TeaModel.build(map, self);
        }

        public ListIpGeolocationsResponseIpGeolocationModelsIpGeolocationModel setIpv4Prefix(String ipv4Prefix) {
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }
        public String getIpv4Prefix() {
            return this.ipv4Prefix;
        }

        public ListIpGeolocationsResponseIpGeolocationModelsIpGeolocationModel setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public ListIpGeolocationsResponseIpGeolocationModelsIpGeolocationModel setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ListIpGeolocationsResponseIpGeolocationModelsIpGeolocationModel setResourcePoolName(String resourcePoolName) {
            this.resourcePoolName = resourcePoolName;
            return this;
        }
        public String getResourcePoolName() {
            return this.resourcePoolName;
        }

    }

    public static class ListIpGeolocationsResponseIpGeolocationModels extends TeaModel {
        @NameInMap("IpGeolocationModel")
        @Validation(required = true)
        public java.util.List<ListIpGeolocationsResponseIpGeolocationModelsIpGeolocationModel> ipGeolocationModel;

        public static ListIpGeolocationsResponseIpGeolocationModels build(java.util.Map<String, ?> map) throws Exception {
            ListIpGeolocationsResponseIpGeolocationModels self = new ListIpGeolocationsResponseIpGeolocationModels();
            return TeaModel.build(map, self);
        }

        public ListIpGeolocationsResponseIpGeolocationModels setIpGeolocationModel(java.util.List<ListIpGeolocationsResponseIpGeolocationModelsIpGeolocationModel> ipGeolocationModel) {
            this.ipGeolocationModel = ipGeolocationModel;
            return this;
        }
        public java.util.List<ListIpGeolocationsResponseIpGeolocationModelsIpGeolocationModel> getIpGeolocationModel() {
            return this.ipGeolocationModel;
        }

    }

}
