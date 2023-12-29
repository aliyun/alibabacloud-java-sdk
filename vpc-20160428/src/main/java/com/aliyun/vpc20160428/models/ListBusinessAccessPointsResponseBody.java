// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListBusinessAccessPointsResponseBody extends TeaModel {
    /**
     * <p>The list of access points.</p>
     */
    @NameInMap("BusinessAccessPoints")
    public java.util.List<ListBusinessAccessPointsResponseBodyBusinessAccessPoints> businessAccessPoints;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The ID of the access point.</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The name of the access point.</p>
         */
        @NameInMap("AccessPointName")
        public String accessPointName;

        /**
         * <p>The ID of the cloud box.</p>
         * <br>
         * <p>>  You can query this parameter if the Express Connect circuits and access points are of the cloud box type.</p>
         */
        @NameInMap("CloudBoxInstanceIds")
        public String cloudBoxInstanceIds;

        /**
         * <p>The latitude of the access point.</p>
         */
        @NameInMap("Latitude")
        public Double latitude;

        /**
         * <p>The longitude of the access point.</p>
         */
        @NameInMap("Longitude")
        public Double longitude;

        /**
         * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
         * <br>
         * <p>*   **CT**: China Telecom.</p>
         * <p>*   **CU**: China Unicom.</p>
         * <p>*   **CM**: China Mobile.</p>
         * <p>*   **CO**: other connectivity providers in the Chinese mainland.</p>
         * <p>*   **Equinix**: Equinix.</p>
         * <p>*   **Other**: other connectivity providers outside the Chinese mainland.</p>
         */
        @NameInMap("SupportLineOperator")
        public String supportLineOperator;

        /**
         * <p>The port type supported by the access point. Valid values:</p>
         * <br>
         * <p>*   **100Base-T**: 100 Mbit/s copper Ethernet port</p>
         * <p>*   **1000Base-T**: 1,000 Mbit/s copper Ethernet port</p>
         * <p>*   **1000Base-LX**: 1,000 Mbit/s single-mode optical port (10 km)</p>
         * <p>*   **10GBase-T**: 10,000 Mbit/s copper Ethernet port</p>
         * <p>*   **10GBase-LR**: 10,000 Mbit/s single-mode optical port (10 km)</p>
         * <p>*   **40GBase-LR**: 40,000 Mbit/s single-mode optical port</p>
         * <p>*   **100GBase-LR**: 100,000 Mbit/s single-mode optical port</p>
         * <br>
         * <p>>  To use ports 40GBase-LR and 100GBase-LR, you must first contact your account manager.</p>
         */
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
