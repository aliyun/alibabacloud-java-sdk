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
     * 
     * <strong>example:</strong>
     * <p>611CB80C-B6A9-43DB-9E38-0B0AC3D9B58F</p>
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
         * 
         * <strong>example:</strong>
         * <p>ap-cn-hangzhou-xs-B</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The name of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>美国-弗吉尼亚-C</p>
         */
        @NameInMap("AccessPointName")
        public String accessPointName;

        /**
         * <p>The ID of the cloud box.</p>
         * <blockquote>
         * <p> You can query this parameter if the Express Connect circuits and access points are of the cloud box type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cb-****</p>
         */
        @NameInMap("CloudBoxInstanceIds")
        public String cloudBoxInstanceIds;

        /**
         * <p>The latitude of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>30.198416</p>
         */
        @NameInMap("Latitude")
        public Double latitude;

        /**
         * <p>The longitude of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>120.247514</p>
         */
        @NameInMap("Longitude")
        public Double longitude;

        /**
         * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>CT</strong>: China Telecom.</li>
         * <li><strong>CU</strong>: China Unicom.</li>
         * <li><strong>CM</strong>: China Mobile.</li>
         * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland.</li>
         * <li><strong>Equinix</strong>: Equinix.</li>
         * <li><strong>Other</strong>: other connectivity providers outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CT</p>
         */
        @NameInMap("SupportLineOperator")
        public String supportLineOperator;

        /**
         * <p>The port type supported by the access point. Valid values:</p>
         * <ul>
         * <li><strong>100Base-T</strong>: 100 Mbit/s copper Ethernet port</li>
         * <li><strong>1000Base-T</strong>: 1,000 Mbit/s copper Ethernet port</li>
         * <li><strong>1000Base-LX</strong>: 1,000 Mbit/s single-mode optical port (10 km)</li>
         * <li><strong>10GBase-T</strong>: 10,000 Mbit/s copper Ethernet port</li>
         * <li><strong>10GBase-LR</strong>: 10,000 Mbit/s single-mode optical port (10 km)</li>
         * <li><strong>40GBase-LR</strong>: 40,000 Mbit/s single-mode optical port</li>
         * <li><strong>100GBase-LR</strong>: 100,000 Mbit/s single-mode optical port</li>
         * </ul>
         * <blockquote>
         * <p> To use ports 40GBase-LR and 100GBase-LR, you must first contact your account manager.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000Base-T</p>
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
