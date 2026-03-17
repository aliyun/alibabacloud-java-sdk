// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListAccessPointsResponseBody extends TeaModel {
    /**
     * <p>The information about the access point.</p>
     */
    @NameInMap("AccessPoints")
    public java.util.List<ListAccessPointsResponseBodyAccessPoints> accessPoints;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E26DBAAE-A796-4A48-98B4-B45AFCD1F299</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of access points.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAccessPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessPointsResponseBody self = new ListAccessPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessPointsResponseBody setAccessPoints(java.util.List<ListAccessPointsResponseBodyAccessPoints> accessPoints) {
        this.accessPoints = accessPoints;
        return this;
    }
    public java.util.List<ListAccessPointsResponseBodyAccessPoints> getAccessPoints() {
        return this.accessPoints;
    }

    public ListAccessPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccessPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAccessPointsResponseBodyAccessPoints extends TeaModel {
        /**
         * <p>The ID of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>401</p>
         */
        @NameInMap("AccessPointId")
        public Integer accessPointId;

        /**
         * <p>The number of available SAG instances in the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ActiveSmartAGCount")
        public Integer activeSmartAGCount;

        /**
         * <p>The number of offline SAG instances in the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("InactiveSmartAGCount")
        public Integer inactiveSmartAGCount;

        /**
         * <p>The latitude of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>103.81****</p>
         */
        @NameInMap("Latitude")
        public String latitude;

        /**
         * <p>The longitude of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>1.35****</p>
         */
        @NameInMap("Longitude")
        public String longitude;

        public static ListAccessPointsResponseBodyAccessPoints build(java.util.Map<String, ?> map) throws Exception {
            ListAccessPointsResponseBodyAccessPoints self = new ListAccessPointsResponseBodyAccessPoints();
            return TeaModel.build(map, self);
        }

        public ListAccessPointsResponseBodyAccessPoints setAccessPointId(Integer accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public Integer getAccessPointId() {
            return this.accessPointId;
        }

        public ListAccessPointsResponseBodyAccessPoints setActiveSmartAGCount(Integer activeSmartAGCount) {
            this.activeSmartAGCount = activeSmartAGCount;
            return this;
        }
        public Integer getActiveSmartAGCount() {
            return this.activeSmartAGCount;
        }

        public ListAccessPointsResponseBodyAccessPoints setInactiveSmartAGCount(Integer inactiveSmartAGCount) {
            this.inactiveSmartAGCount = inactiveSmartAGCount;
            return this;
        }
        public Integer getInactiveSmartAGCount() {
            return this.inactiveSmartAGCount;
        }

        public ListAccessPointsResponseBodyAccessPoints setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public ListAccessPointsResponseBodyAccessPoints setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

    }

}
