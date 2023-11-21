// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVSwitchCidrReservationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries to return per page.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, no next page exists.</p>
     * <p>*   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>A list of reserved CIDR blocks.</p>
     */
    @NameInMap("VSwitchCidrReservations")
    public java.util.List<ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations> vSwitchCidrReservations;

    public static ListVSwitchCidrReservationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVSwitchCidrReservationsResponseBody self = new ListVSwitchCidrReservationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVSwitchCidrReservationsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListVSwitchCidrReservationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVSwitchCidrReservationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVSwitchCidrReservationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVSwitchCidrReservationsResponseBody setVSwitchCidrReservations(java.util.List<ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations> vSwitchCidrReservations) {
        this.vSwitchCidrReservations = vSwitchCidrReservations;
        return this;
    }
    public java.util.List<ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations> getVSwitchCidrReservations() {
        return this.vSwitchCidrReservations;
    }

    public static class ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservationsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservationsTags build(java.util.Map<String, ?> map) throws Exception {
            ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservationsTags self = new ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservationsTags();
            return TeaModel.build(map, self);
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservationsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservationsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations extends TeaModel {
        /**
         * <p>The number of used prefixes in the reserved CIDR block.</p>
         */
        @NameInMap("AssignedCidrCount")
        public Integer assignedCidrCount;

        /**
         * <p>The number of available prefixes in the reserved CIDR block.</p>
         */
        @NameInMap("AvailableCidrCount")
        public Integer availableCidrCount;

        /**
         * <p>The time when the reserved CIDR block was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The IP version of the reserved CIDR block. Valid values:</p>
         * <br>
         * <p>*   **IPv4** (default)</p>
         * <p>*   **IPv6**</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The status of the reserved CIDR block. Valid values:</p>
         * <br>
         * <p>*   **Assigning**</p>
         * <p>*   **Assigned**</p>
         * <p>*   **Releasing**</p>
         * <p>*   **Released**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservationsTags> tags;

        /**
         * <p>The type of the reserved CIDR block. Valid value: **prefix**. CIDR blocks are allocated from the reserved CIDR block.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The reserved CIDR block.</p>
         */
        @NameInMap("VSwitchCidrReservationCidr")
        public String vSwitchCidrReservationCidr;

        /**
         * <p>The description of the reserved CIDR block.</p>
         */
        @NameInMap("VSwitchCidrReservationDescription")
        public String vSwitchCidrReservationDescription;

        /**
         * <p>The ID of the reserved CIDR block.</p>
         */
        @NameInMap("VSwitchCidrReservationId")
        public String vSwitchCidrReservationId;

        /**
         * <p>The name of the reserved CIDR block.</p>
         */
        @NameInMap("VSwitchCidrReservationName")
        public String vSwitchCidrReservationName;

        /**
         * <p>The ID of the vSwitch to which the reserved CIDR block belongs.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The virtual private cloud (VPC) to which the reserved CIDR block belongs.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations build(java.util.Map<String, ?> map) throws Exception {
            ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations self = new ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations();
            return TeaModel.build(map, self);
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations setAssignedCidrCount(Integer assignedCidrCount) {
            this.assignedCidrCount = assignedCidrCount;
            return this;
        }
        public Integer getAssignedCidrCount() {
            return this.assignedCidrCount;
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations setAvailableCidrCount(Integer availableCidrCount) {
            this.availableCidrCount = availableCidrCount;
            return this;
        }
        public Integer getAvailableCidrCount() {
            return this.availableCidrCount;
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations setTags(java.util.List<ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservationsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservationsTags> getTags() {
            return this.tags;
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations setVSwitchCidrReservationCidr(String vSwitchCidrReservationCidr) {
            this.vSwitchCidrReservationCidr = vSwitchCidrReservationCidr;
            return this;
        }
        public String getVSwitchCidrReservationCidr() {
            return this.vSwitchCidrReservationCidr;
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations setVSwitchCidrReservationDescription(String vSwitchCidrReservationDescription) {
            this.vSwitchCidrReservationDescription = vSwitchCidrReservationDescription;
            return this;
        }
        public String getVSwitchCidrReservationDescription() {
            return this.vSwitchCidrReservationDescription;
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations setVSwitchCidrReservationId(String vSwitchCidrReservationId) {
            this.vSwitchCidrReservationId = vSwitchCidrReservationId;
            return this;
        }
        public String getVSwitchCidrReservationId() {
            return this.vSwitchCidrReservationId;
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations setVSwitchCidrReservationName(String vSwitchCidrReservationName) {
            this.vSwitchCidrReservationName = vSwitchCidrReservationName;
            return this;
        }
        public String getVSwitchCidrReservationName() {
            return this.vSwitchCidrReservationName;
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListVSwitchCidrReservationsResponseBodyVSwitchCidrReservations setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
