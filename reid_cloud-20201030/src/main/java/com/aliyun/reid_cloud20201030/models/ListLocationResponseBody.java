// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListLocationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LocationInfoItems")
    public ListLocationResponseBodyLocationInfoItems locationInfoItems;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLocationResponseBody self = new ListLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLocationResponseBody setLocationInfoItems(ListLocationResponseBodyLocationInfoItems locationInfoItems) {
        this.locationInfoItems = locationInfoItems;
        return this;
    }
    public ListLocationResponseBodyLocationInfoItems getLocationInfoItems() {
        return this.locationInfoItems;
    }

    public ListLocationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListLocationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLocationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPointsPoint extends TeaModel {
        @NameInMap("Y")
        public Float y;

        @NameInMap("X")
        public Float x;

        public static ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPointsPoint build(java.util.Map<String, ?> map) throws Exception {
            ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPointsPoint self = new ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPointsPoint();
            return TeaModel.build(map, self);
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPointsPoint setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPointsPoint setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPoints extends TeaModel {
        @NameInMap("Point")
        public java.util.List<ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPointsPoint> point;

        public static ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPoints build(java.util.Map<String, ?> map) throws Exception {
            ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPoints self = new ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPoints();
            return TeaModel.build(map, self);
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPoints setPoint(java.util.List<ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPointsPoint> point) {
            this.point = point;
            return this;
        }
        public java.util.List<ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPointsPoint> getPoint() {
            return this.point;
        }

    }

    public static class ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoi extends TeaModel {
        @NameInMap("Points")
        public ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPoints points;

        public static ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoi build(java.util.Map<String, ?> map) throws Exception {
            ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoi self = new ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoi();
            return TeaModel.build(map, self);
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoi setPoints(ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPoints points) {
            this.points = points;
            return this;
        }
        public ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoiPoints getPoints() {
            return this.points;
        }

    }

    public static class ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRois extends TeaModel {
        @NameInMap("RectRoi")
        public java.util.List<ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoi> rectRoi;

        public static ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRois build(java.util.Map<String, ?> map) throws Exception {
            ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRois self = new ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRois();
            return TeaModel.build(map, self);
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRois setRectRoi(java.util.List<ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoi> rectRoi) {
            this.rectRoi = rectRoi;
            return this;
        }
        public java.util.List<ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRoisRectRoi> getRectRoi() {
            return this.rectRoi;
        }

    }

    public static class ListLocationResponseBodyLocationInfoItemsLocationInfoItem extends TeaModel {
        @NameInMap("ParentLocationId")
        public Long parentLocationId;

        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("LocationType")
        public String locationType;

        @NameInMap("LocationId")
        public Long locationId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("LocationName")
        public String locationName;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("LayerType")
        public String layerType;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("RectRois")
        public ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRois rectRois;

        public static ListLocationResponseBodyLocationInfoItemsLocationInfoItem build(java.util.Map<String, ?> map) throws Exception {
            ListLocationResponseBodyLocationInfoItemsLocationInfoItem self = new ListLocationResponseBodyLocationInfoItemsLocationInfoItem();
            return TeaModel.build(map, self);
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItem setParentLocationId(Long parentLocationId) {
            this.parentLocationId = parentLocationId;
            return this;
        }
        public Long getParentLocationId() {
            return this.parentLocationId;
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItem setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItem setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItem setLocationType(String locationType) {
            this.locationType = locationType;
            return this;
        }
        public String getLocationType() {
            return this.locationType;
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItem setLocationId(Long locationId) {
            this.locationId = locationId;
            return this;
        }
        public Long getLocationId() {
            return this.locationId;
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItem setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItem setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItem setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItem setLayerType(String layerType) {
            this.layerType = layerType;
            return this;
        }
        public String getLayerType() {
            return this.layerType;
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItem setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListLocationResponseBodyLocationInfoItemsLocationInfoItem setRectRois(ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRois rectRois) {
            this.rectRois = rectRois;
            return this;
        }
        public ListLocationResponseBodyLocationInfoItemsLocationInfoItemRectRois getRectRois() {
            return this.rectRois;
        }

    }

    public static class ListLocationResponseBodyLocationInfoItems extends TeaModel {
        @NameInMap("LocationInfoItem")
        public java.util.List<ListLocationResponseBodyLocationInfoItemsLocationInfoItem> locationInfoItem;

        public static ListLocationResponseBodyLocationInfoItems build(java.util.Map<String, ?> map) throws Exception {
            ListLocationResponseBodyLocationInfoItems self = new ListLocationResponseBodyLocationInfoItems();
            return TeaModel.build(map, self);
        }

        public ListLocationResponseBodyLocationInfoItems setLocationInfoItem(java.util.List<ListLocationResponseBodyLocationInfoItemsLocationInfoItem> locationInfoItem) {
            this.locationInfoItem = locationInfoItem;
            return this;
        }
        public java.util.List<ListLocationResponseBodyLocationInfoItemsLocationInfoItem> getLocationInfoItem() {
            return this.locationInfoItem;
        }

    }

}
