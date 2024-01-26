// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.status20200117.models;

import com.aliyun.tea.*;

public class ListEventInProgressResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListEventInProgressResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListEventInProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventInProgressResponseBody self = new ListEventInProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventInProgressResponseBody setData(java.util.List<ListEventInProgressResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEventInProgressResponseBodyData> getData() {
        return this.data;
    }

    public ListEventInProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEventInProgressResponseBodyDataEventUpdates extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("PublishTime")
        public Long publishTime;

        public static ListEventInProgressResponseBodyDataEventUpdates build(java.util.Map<String, ?> map) throws Exception {
            ListEventInProgressResponseBodyDataEventUpdates self = new ListEventInProgressResponseBodyDataEventUpdates();
            return TeaModel.build(map, self);
        }

        public ListEventInProgressResponseBodyDataEventUpdates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListEventInProgressResponseBodyDataEventUpdates setPublishTime(Long publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public Long getPublishTime() {
            return this.publishTime;
        }

    }

    public static class ListEventInProgressResponseBodyDataImpactsProduct extends TeaModel {
        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductName")
        public String productName;

        public static ListEventInProgressResponseBodyDataImpactsProduct build(java.util.Map<String, ?> map) throws Exception {
            ListEventInProgressResponseBodyDataImpactsProduct self = new ListEventInProgressResponseBodyDataImpactsProduct();
            return TeaModel.build(map, self);
        }

        public ListEventInProgressResponseBodyDataImpactsProduct setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListEventInProgressResponseBodyDataImpactsProduct setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class ListEventInProgressResponseBodyDataImpactsRegion extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        public static ListEventInProgressResponseBodyDataImpactsRegion build(java.util.Map<String, ?> map) throws Exception {
            ListEventInProgressResponseBodyDataImpactsRegion self = new ListEventInProgressResponseBodyDataImpactsRegion();
            return TeaModel.build(map, self);
        }

        public ListEventInProgressResponseBodyDataImpactsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEventInProgressResponseBodyDataImpactsRegion setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

    public static class ListEventInProgressResponseBodyDataImpacts extends TeaModel {
        @NameInMap("Product")
        public ListEventInProgressResponseBodyDataImpactsProduct product;

        @NameInMap("RecoveryTime")
        public Long recoveryTime;

        @NameInMap("Region")
        public ListEventInProgressResponseBodyDataImpactsRegion region;

        @NameInMap("StartTime")
        public Long startTime;

        public static ListEventInProgressResponseBodyDataImpacts build(java.util.Map<String, ?> map) throws Exception {
            ListEventInProgressResponseBodyDataImpacts self = new ListEventInProgressResponseBodyDataImpacts();
            return TeaModel.build(map, self);
        }

        public ListEventInProgressResponseBodyDataImpacts setProduct(ListEventInProgressResponseBodyDataImpactsProduct product) {
            this.product = product;
            return this;
        }
        public ListEventInProgressResponseBodyDataImpactsProduct getProduct() {
            return this.product;
        }

        public ListEventInProgressResponseBodyDataImpacts setRecoveryTime(Long recoveryTime) {
            this.recoveryTime = recoveryTime;
            return this;
        }
        public Long getRecoveryTime() {
            return this.recoveryTime;
        }

        public ListEventInProgressResponseBodyDataImpacts setRegion(ListEventInProgressResponseBodyDataImpactsRegion region) {
            this.region = region;
            return this;
        }
        public ListEventInProgressResponseBodyDataImpactsRegion getRegion() {
            return this.region;
        }

        public ListEventInProgressResponseBodyDataImpacts setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListEventInProgressResponseBodyData extends TeaModel {
        @NameInMap("EventUpdates")
        public java.util.List<ListEventInProgressResponseBodyDataEventUpdates> eventUpdates;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Impacts")
        public java.util.List<ListEventInProgressResponseBodyDataImpacts> impacts;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Title")
        public String title;

        public static ListEventInProgressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEventInProgressResponseBodyData self = new ListEventInProgressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEventInProgressResponseBodyData setEventUpdates(java.util.List<ListEventInProgressResponseBodyDataEventUpdates> eventUpdates) {
            this.eventUpdates = eventUpdates;
            return this;
        }
        public java.util.List<ListEventInProgressResponseBodyDataEventUpdates> getEventUpdates() {
            return this.eventUpdates;
        }

        public ListEventInProgressResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListEventInProgressResponseBodyData setImpacts(java.util.List<ListEventInProgressResponseBodyDataImpacts> impacts) {
            this.impacts = impacts;
            return this;
        }
        public java.util.List<ListEventInProgressResponseBodyDataImpacts> getImpacts() {
            return this.impacts;
        }

        public ListEventInProgressResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListEventInProgressResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
