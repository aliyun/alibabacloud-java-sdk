// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListBusinessAccessPointsResponseBody extends TeaModel {
    @NameInMap("BusinessAccessPoints")
    public java.util.List<ListBusinessAccessPointsResponseBodyBusinessAccessPoints> businessAccessPoints;

    @NameInMap("RequestId")
    public String requestId;

    public static ListBusinessAccessPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessAccessPointsResponseBody self = new ListBusinessAccessPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBusinessAccessPointsResponseBody setBusinessAccessPoints(java.util.List<ListBusinessAccessPointsResponseBodyBusinessAccessPoints> businessAccessPoints) {
        this.businessAccessPoints = businessAccessPoints;
        return this;
    }
    public java.util.List<ListBusinessAccessPointsResponseBodyBusinessAccessPoints> getBusinessAccessPoints() {
        return this.businessAccessPoints;
    }

    public ListBusinessAccessPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBusinessAccessPointsResponseBodyBusinessAccessPoints extends TeaModel {
        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("AccessPointName")
        public String accessPointName;

        @NameInMap("CloudBoxInstanceIds")
        public String cloudBoxInstanceIds;

        @NameInMap("Latitude")
        public Double latitude;

        @NameInMap("Longitude")
        public Double longitude;

        @NameInMap("SupportLineOperator")
        public String supportLineOperator;

        @NameInMap("SupportPortTypes")
        public String supportPortTypes;

        public static ListBusinessAccessPointsResponseBodyBusinessAccessPoints build(java.util.Map<String, ?> map) throws Exception {
            ListBusinessAccessPointsResponseBodyBusinessAccessPoints self = new ListBusinessAccessPointsResponseBodyBusinessAccessPoints();
            return TeaModel.build(map, self);
        }

        public ListBusinessAccessPointsResponseBodyBusinessAccessPoints setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public ListBusinessAccessPointsResponseBodyBusinessAccessPoints setAccessPointName(String accessPointName) {
            this.accessPointName = accessPointName;
            return this;
        }
        public String getAccessPointName() {
            return this.accessPointName;
        }

        public ListBusinessAccessPointsResponseBodyBusinessAccessPoints setCloudBoxInstanceIds(String cloudBoxInstanceIds) {
            this.cloudBoxInstanceIds = cloudBoxInstanceIds;
            return this;
        }
        public String getCloudBoxInstanceIds() {
            return this.cloudBoxInstanceIds;
        }

        public ListBusinessAccessPointsResponseBodyBusinessAccessPoints setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }
        public Double getLatitude() {
            return this.latitude;
        }

        public ListBusinessAccessPointsResponseBodyBusinessAccessPoints setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }
        public Double getLongitude() {
            return this.longitude;
        }

        public ListBusinessAccessPointsResponseBodyBusinessAccessPoints setSupportLineOperator(String supportLineOperator) {
            this.supportLineOperator = supportLineOperator;
            return this;
        }
        public String getSupportLineOperator() {
            return this.supportLineOperator;
        }

        public ListBusinessAccessPointsResponseBodyBusinessAccessPoints setSupportPortTypes(String supportPortTypes) {
            this.supportPortTypes = supportPortTypes;
            return this;
        }
        public String getSupportPortTypes() {
            return this.supportPortTypes;
        }

    }

}
