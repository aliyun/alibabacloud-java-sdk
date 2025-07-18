// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpcPublishedRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether there is a token for the next query. Values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, it means there is no next query.</li>
     * <li>If <strong>NextToken</strong> has a return value, this value indicates the token for the start of the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1D0971B2-A35A-42C1-A44C-E91360C36C0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of route entry publishing status information.</p>
     */
    @NameInMap("RouteEntries")
    public java.util.List<ListVpcPublishedRouteEntriesResponseBodyRouteEntries> routeEntries;

    public static ListVpcPublishedRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcPublishedRouteEntriesResponseBody self = new ListVpcPublishedRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcPublishedRouteEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcPublishedRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcPublishedRouteEntriesResponseBody setRouteEntries(java.util.List<ListVpcPublishedRouteEntriesResponseBodyRouteEntries> routeEntries) {
        this.routeEntries = routeEntries;
        return this;
    }
    public java.util.List<ListVpcPublishedRouteEntriesResponseBodyRouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    public static class ListVpcPublishedRouteEntriesResponseBodyRouteEntriesRoutePublishTargets extends TeaModel {
        /**
         * <p>The publishing status of the route entry in the publishing target.</p>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("PublishStatus")
        public String publishStatus;

        /**
         * <p>The ID of the route publishing target instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-xvuqdfma6x57ei****</p>
         */
        @NameInMap("PublishTargetInstanceId")
        public String publishTargetInstanceId;

        /**
         * <p>The type of the route publishing target.</p>
         * 
         * <strong>example:</strong>
         * <p>ECR</p>
         */
        @NameInMap("PublishTargetType")
        public String publishTargetType;

        public static ListVpcPublishedRouteEntriesResponseBodyRouteEntriesRoutePublishTargets build(java.util.Map<String, ?> map) throws Exception {
            ListVpcPublishedRouteEntriesResponseBodyRouteEntriesRoutePublishTargets self = new ListVpcPublishedRouteEntriesResponseBodyRouteEntriesRoutePublishTargets();
            return TeaModel.build(map, self);
        }

        public ListVpcPublishedRouteEntriesResponseBodyRouteEntriesRoutePublishTargets setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public ListVpcPublishedRouteEntriesResponseBodyRouteEntriesRoutePublishTargets setPublishTargetInstanceId(String publishTargetInstanceId) {
            this.publishTargetInstanceId = publishTargetInstanceId;
            return this;
        }
        public String getPublishTargetInstanceId() {
            return this.publishTargetInstanceId;
        }

        public ListVpcPublishedRouteEntriesResponseBodyRouteEntriesRoutePublishTargets setPublishTargetType(String publishTargetType) {
            this.publishTargetType = publishTargetType;
            return this;
        }
        public String getPublishTargetType() {
            return this.publishTargetType;
        }

    }

    public static class ListVpcPublishedRouteEntriesResponseBodyRouteEntries extends TeaModel {
        /**
         * <p>The destination CIDR block of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The ID of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>rte-bp1mnnr2al0naomnpv****</p>
         */
        @NameInMap("RouteEntryId")
        public String routeEntryId;

        /**
         * <p>List of route entry publishing status information in the publishing targets.</p>
         */
        @NameInMap("RoutePublishTargets")
        public java.util.List<ListVpcPublishedRouteEntriesResponseBodyRouteEntriesRoutePublishTargets> routePublishTargets;

        /**
         * <p>The ID of the route table.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-2ze3jgygk9bmsj23s****</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static ListVpcPublishedRouteEntriesResponseBodyRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            ListVpcPublishedRouteEntriesResponseBodyRouteEntries self = new ListVpcPublishedRouteEntriesResponseBodyRouteEntries();
            return TeaModel.build(map, self);
        }

        public ListVpcPublishedRouteEntriesResponseBodyRouteEntries setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public ListVpcPublishedRouteEntriesResponseBodyRouteEntries setRouteEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        public ListVpcPublishedRouteEntriesResponseBodyRouteEntries setRoutePublishTargets(java.util.List<ListVpcPublishedRouteEntriesResponseBodyRouteEntriesRoutePublishTargets> routePublishTargets) {
            this.routePublishTargets = routePublishTargets;
            return this;
        }
        public java.util.List<ListVpcPublishedRouteEntriesResponseBodyRouteEntriesRoutePublishTargets> getRoutePublishTargets() {
            return this.routePublishTargets;
        }

        public ListVpcPublishedRouteEntriesResponseBodyRouteEntries setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

}
