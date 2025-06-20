// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountDeliveryChannelsResponseBody extends TeaModel {
    @NameInMap("DeliveryChannels")
    public java.util.List<ListMultiAccountDeliveryChannelsResponseBodyDeliveryChannels> deliveryChannels;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>17502A1B-7026-5551-8E1C-CCABD0CBC***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMultiAccountDeliveryChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountDeliveryChannelsResponseBody self = new ListMultiAccountDeliveryChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountDeliveryChannelsResponseBody setDeliveryChannels(java.util.List<ListMultiAccountDeliveryChannelsResponseBodyDeliveryChannels> deliveryChannels) {
        this.deliveryChannels = deliveryChannels;
        return this;
    }
    public java.util.List<ListMultiAccountDeliveryChannelsResponseBodyDeliveryChannels> getDeliveryChannels() {
        return this.deliveryChannels;
    }

    public ListMultiAccountDeliveryChannelsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMultiAccountDeliveryChannelsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMultiAccountDeliveryChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMultiAccountDeliveryChannelsResponseBodyDeliveryChannels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-08-17T00:23:55Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeliveryChannelDescription")
        public String deliveryChannelDescription;

        /**
         * <strong>example:</strong>
         * <p>dc-0bzhsqpnk***</p>
         */
        @NameInMap("DeliveryChannelId")
        public String deliveryChannelId;

        /**
         * <strong>example:</strong>
         * <p>test-multi-account-delivery-channel</p>
         */
        @NameInMap("DeliveryChannelName")
        public String deliveryChannelName;

        public static ListMultiAccountDeliveryChannelsResponseBodyDeliveryChannels build(java.util.Map<String, ?> map) throws Exception {
            ListMultiAccountDeliveryChannelsResponseBodyDeliveryChannels self = new ListMultiAccountDeliveryChannelsResponseBodyDeliveryChannels();
            return TeaModel.build(map, self);
        }

        public ListMultiAccountDeliveryChannelsResponseBodyDeliveryChannels setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMultiAccountDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelDescription(String deliveryChannelDescription) {
            this.deliveryChannelDescription = deliveryChannelDescription;
            return this;
        }
        public String getDeliveryChannelDescription() {
            return this.deliveryChannelDescription;
        }

        public ListMultiAccountDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        public ListMultiAccountDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelName(String deliveryChannelName) {
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

    }

}
