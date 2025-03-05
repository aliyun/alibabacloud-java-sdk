// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamResourceDiscoveryAssociationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("IpamResourceDiscoveryAssociations")
    public java.util.List<ListIpamResourceDiscoveryAssociationsResponseBodyIpamResourceDiscoveryAssociations> ipamResourceDiscoveryAssociations;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>F28A239E-F88D-500E-ADE7-FA5E8CA3A170</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamResourceDiscoveryAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamResourceDiscoveryAssociationsResponseBody self = new ListIpamResourceDiscoveryAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamResourceDiscoveryAssociationsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListIpamResourceDiscoveryAssociationsResponseBody setIpamResourceDiscoveryAssociations(java.util.List<ListIpamResourceDiscoveryAssociationsResponseBodyIpamResourceDiscoveryAssociations> ipamResourceDiscoveryAssociations) {
        this.ipamResourceDiscoveryAssociations = ipamResourceDiscoveryAssociations;
        return this;
    }
    public java.util.List<ListIpamResourceDiscoveryAssociationsResponseBodyIpamResourceDiscoveryAssociations> getIpamResourceDiscoveryAssociations() {
        return this.ipamResourceDiscoveryAssociations;
    }

    public ListIpamResourceDiscoveryAssociationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpamResourceDiscoveryAssociationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamResourceDiscoveryAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamResourceDiscoveryAssociationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamResourceDiscoveryAssociationsResponseBodyIpamResourceDiscoveryAssociations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ipam-ccxbnsbhew0d6t****</p>
         */
        @NameInMap("IpamId")
        public String ipamId;

        /**
         * <strong>example:</strong>
         * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
         */
        @NameInMap("IpamResourceDiscoveryId")
        public String ipamResourceDiscoveryId;

        /**
         * <strong>example:</strong>
         * <p>1210123456******</p>
         */
        @NameInMap("IpamResourceDiscoveryOwnerId")
        public String ipamResourceDiscoveryOwnerId;

        /**
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("IpamResourceDiscoveryStatus")
        public String ipamResourceDiscoveryStatus;

        /**
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("IpamResourceDiscoveryType")
        public String ipamResourceDiscoveryType;

        /**
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListIpamResourceDiscoveryAssociationsResponseBodyIpamResourceDiscoveryAssociations build(java.util.Map<String, ?> map) throws Exception {
            ListIpamResourceDiscoveryAssociationsResponseBodyIpamResourceDiscoveryAssociations self = new ListIpamResourceDiscoveryAssociationsResponseBodyIpamResourceDiscoveryAssociations();
            return TeaModel.build(map, self);
        }

        public ListIpamResourceDiscoveryAssociationsResponseBodyIpamResourceDiscoveryAssociations setIpamId(String ipamId) {
            this.ipamId = ipamId;
            return this;
        }
        public String getIpamId() {
            return this.ipamId;
        }

        public ListIpamResourceDiscoveryAssociationsResponseBodyIpamResourceDiscoveryAssociations setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
            this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
            return this;
        }
        public String getIpamResourceDiscoveryId() {
            return this.ipamResourceDiscoveryId;
        }

        public ListIpamResourceDiscoveryAssociationsResponseBodyIpamResourceDiscoveryAssociations setIpamResourceDiscoveryOwnerId(String ipamResourceDiscoveryOwnerId) {
            this.ipamResourceDiscoveryOwnerId = ipamResourceDiscoveryOwnerId;
            return this;
        }
        public String getIpamResourceDiscoveryOwnerId() {
            return this.ipamResourceDiscoveryOwnerId;
        }

        public ListIpamResourceDiscoveryAssociationsResponseBodyIpamResourceDiscoveryAssociations setIpamResourceDiscoveryStatus(String ipamResourceDiscoveryStatus) {
            this.ipamResourceDiscoveryStatus = ipamResourceDiscoveryStatus;
            return this;
        }
        public String getIpamResourceDiscoveryStatus() {
            return this.ipamResourceDiscoveryStatus;
        }

        public ListIpamResourceDiscoveryAssociationsResponseBodyIpamResourceDiscoveryAssociations setIpamResourceDiscoveryType(String ipamResourceDiscoveryType) {
            this.ipamResourceDiscoveryType = ipamResourceDiscoveryType;
            return this;
        }
        public String getIpamResourceDiscoveryType() {
            return this.ipamResourceDiscoveryType;
        }

        public ListIpamResourceDiscoveryAssociationsResponseBodyIpamResourceDiscoveryAssociations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
