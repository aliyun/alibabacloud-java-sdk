// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListDeliveryChannelsResponseBody extends TeaModel {
    @NameInMap("DeliveryChannels")
    public java.util.List<ListDeliveryChannelsResponseBodyDeliveryChannels> deliveryChannels;

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

    public static ListDeliveryChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryChannelsResponseBody self = new ListDeliveryChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeliveryChannelsResponseBody setDeliveryChannels(java.util.List<ListDeliveryChannelsResponseBodyDeliveryChannels> deliveryChannels) {
        this.deliveryChannels = deliveryChannels;
        return this;
    }
    public java.util.List<ListDeliveryChannelsResponseBodyDeliveryChannels> getDeliveryChannels() {
        return this.deliveryChannels;
    }

    public ListDeliveryChannelsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDeliveryChannelsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeliveryChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeliveryChannelsResponseBodyDeliveryChannels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-06-20T08:46:29Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeliveryChannelDescription")
        public String deliveryChannelDescription;

        /**
         * <strong>example:</strong>
         * <p>dc-4m6ffpkgu***</p>
         */
        @NameInMap("DeliveryChannelId")
        public String deliveryChannelId;

        /**
         * <strong>example:</strong>
         * <p>test-delivery-channel</p>
         */
        @NameInMap("DeliveryChannelName")
        public String deliveryChannelName;

        public static ListDeliveryChannelsResponseBodyDeliveryChannels build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryChannelsResponseBodyDeliveryChannels self = new ListDeliveryChannelsResponseBodyDeliveryChannels();
            return TeaModel.build(map, self);
        }

        public ListDeliveryChannelsResponseBodyDeliveryChannels setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelDescription(String deliveryChannelDescription) {
            this.deliveryChannelDescription = deliveryChannelDescription;
            return this;
        }
        public String getDeliveryChannelDescription() {
            return this.deliveryChannelDescription;
        }

        public ListDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        public ListDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelName(String deliveryChannelName) {
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

    }

}
