// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListActionDataResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Actions")
    public ListActionDataResponseBodyActions actions;

    @NameInMap("CursorTime")
    public Long cursorTime;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListActionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActionDataResponseBody self = new ListActionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActionDataResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListActionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActionDataResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListActionDataResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListActionDataResponseBody setActions(ListActionDataResponseBodyActions actions) {
        this.actions = actions;
        return this;
    }
    public ListActionDataResponseBodyActions getActions() {
        return this.actions;
    }

    public ListActionDataResponseBody setCursorTime(Long cursorTime) {
        this.cursorTime = cursorTime;
        return this;
    }
    public Long getCursorTime() {
        return this.cursorTime;
    }

    public ListActionDataResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListActionDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListActionDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListActionDataResponseBodyActionsActionPointInMap extends TeaModel {
        @NameInMap("Y")
        public Float y;

        @NameInMap("X")
        public Float x;

        public static ListActionDataResponseBodyActionsActionPointInMap build(java.util.Map<String, ?> map) throws Exception {
            ListActionDataResponseBodyActionsActionPointInMap self = new ListActionDataResponseBodyActionsActionPointInMap();
            return TeaModel.build(map, self);
        }

        public ListActionDataResponseBodyActionsActionPointInMap setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public ListActionDataResponseBodyActionsActionPointInMap setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class ListActionDataResponseBodyActionsActionObjectPositionInImage extends TeaModel {
        @NameInMap("Right")
        public Float right;

        @NameInMap("Top")
        public Float top;

        @NameInMap("Left")
        public Float left;

        @NameInMap("Bottom")
        public Float bottom;

        public static ListActionDataResponseBodyActionsActionObjectPositionInImage build(java.util.Map<String, ?> map) throws Exception {
            ListActionDataResponseBodyActionsActionObjectPositionInImage self = new ListActionDataResponseBodyActionsActionObjectPositionInImage();
            return TeaModel.build(map, self);
        }

        public ListActionDataResponseBodyActionsActionObjectPositionInImage setRight(Float right) {
            this.right = right;
            return this;
        }
        public Float getRight() {
            return this.right;
        }

        public ListActionDataResponseBodyActionsActionObjectPositionInImage setTop(Float top) {
            this.top = top;
            return this;
        }
        public Float getTop() {
            return this.top;
        }

        public ListActionDataResponseBodyActionsActionObjectPositionInImage setLeft(Float left) {
            this.left = left;
            return this;
        }
        public Float getLeft() {
            return this.left;
        }

        public ListActionDataResponseBodyActionsActionObjectPositionInImage setBottom(Float bottom) {
            this.bottom = bottom;
            return this;
        }
        public Float getBottom() {
            return this.bottom;
        }

    }

    public static class ListActionDataResponseBodyActionsAction extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("StayPeriod")
        public Integer stayPeriod;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("InStay")
        public Long inStay;

        @NameInMap("LocationLayerType")
        public String locationLayerType;

        @NameInMap("Score")
        public Float score;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("LeaveTimestamp")
        public Long leaveTimestamp;

        @NameInMap("FacePointNumber")
        public Integer facePointNumber;

        @NameInMap("UkId")
        public Long ukId;

        @NameInMap("SpecialType")
        public String specialType;

        @NameInMap("PointInMap")
        public ListActionDataResponseBodyActionsActionPointInMap pointInMap;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("Age")
        public Integer age;

        @NameInMap("StayValid")
        public Boolean stayValid;

        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("BodyPointNumber")
        public Integer bodyPointNumber;

        @NameInMap("LocationId")
        public Long locationId;

        @NameInMap("ObjectPositionInImage")
        public ListActionDataResponseBodyActionsActionObjectPositionInImage objectPositionInImage;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("ArriveTimestamp")
        public Long arriveTimestamp;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ImageObjectKey")
        public String imageObjectKey;

        public static ListActionDataResponseBodyActionsAction build(java.util.Map<String, ?> map) throws Exception {
            ListActionDataResponseBodyActionsAction self = new ListActionDataResponseBodyActionsAction();
            return TeaModel.build(map, self);
        }

        public ListActionDataResponseBodyActionsAction setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListActionDataResponseBodyActionsAction setStayPeriod(Integer stayPeriod) {
            this.stayPeriod = stayPeriod;
            return this;
        }
        public Integer getStayPeriod() {
            return this.stayPeriod;
        }

        public ListActionDataResponseBodyActionsAction setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListActionDataResponseBodyActionsAction setInStay(Long inStay) {
            this.inStay = inStay;
            return this;
        }
        public Long getInStay() {
            return this.inStay;
        }

        public ListActionDataResponseBodyActionsAction setLocationLayerType(String locationLayerType) {
            this.locationLayerType = locationLayerType;
            return this;
        }
        public String getLocationLayerType() {
            return this.locationLayerType;
        }

        public ListActionDataResponseBodyActionsAction setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public ListActionDataResponseBodyActionsAction setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListActionDataResponseBodyActionsAction setLeaveTimestamp(Long leaveTimestamp) {
            this.leaveTimestamp = leaveTimestamp;
            return this;
        }
        public Long getLeaveTimestamp() {
            return this.leaveTimestamp;
        }

        public ListActionDataResponseBodyActionsAction setFacePointNumber(Integer facePointNumber) {
            this.facePointNumber = facePointNumber;
            return this;
        }
        public Integer getFacePointNumber() {
            return this.facePointNumber;
        }

        public ListActionDataResponseBodyActionsAction setUkId(Long ukId) {
            this.ukId = ukId;
            return this;
        }
        public Long getUkId() {
            return this.ukId;
        }

        public ListActionDataResponseBodyActionsAction setSpecialType(String specialType) {
            this.specialType = specialType;
            return this;
        }
        public String getSpecialType() {
            return this.specialType;
        }

        public ListActionDataResponseBodyActionsAction setPointInMap(ListActionDataResponseBodyActionsActionPointInMap pointInMap) {
            this.pointInMap = pointInMap;
            return this;
        }
        public ListActionDataResponseBodyActionsActionPointInMap getPointInMap() {
            return this.pointInMap;
        }

        public ListActionDataResponseBodyActionsAction setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListActionDataResponseBodyActionsAction setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

        public ListActionDataResponseBodyActionsAction setStayValid(Boolean stayValid) {
            this.stayValid = stayValid;
            return this;
        }
        public Boolean getStayValid() {
            return this.stayValid;
        }

        public ListActionDataResponseBodyActionsAction setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public ListActionDataResponseBodyActionsAction setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public ListActionDataResponseBodyActionsAction setBodyPointNumber(Integer bodyPointNumber) {
            this.bodyPointNumber = bodyPointNumber;
            return this;
        }
        public Integer getBodyPointNumber() {
            return this.bodyPointNumber;
        }

        public ListActionDataResponseBodyActionsAction setLocationId(Long locationId) {
            this.locationId = locationId;
            return this;
        }
        public Long getLocationId() {
            return this.locationId;
        }

        public ListActionDataResponseBodyActionsAction setObjectPositionInImage(ListActionDataResponseBodyActionsActionObjectPositionInImage objectPositionInImage) {
            this.objectPositionInImage = objectPositionInImage;
            return this;
        }
        public ListActionDataResponseBodyActionsActionObjectPositionInImage getObjectPositionInImage() {
            return this.objectPositionInImage;
        }

        public ListActionDataResponseBodyActionsAction setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListActionDataResponseBodyActionsAction setArriveTimestamp(Long arriveTimestamp) {
            this.arriveTimestamp = arriveTimestamp;
            return this;
        }
        public Long getArriveTimestamp() {
            return this.arriveTimestamp;
        }

        public ListActionDataResponseBodyActionsAction setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListActionDataResponseBodyActionsAction setImageObjectKey(String imageObjectKey) {
            this.imageObjectKey = imageObjectKey;
            return this;
        }
        public String getImageObjectKey() {
            return this.imageObjectKey;
        }

    }

    public static class ListActionDataResponseBodyActions extends TeaModel {
        @NameInMap("Action")
        public java.util.List<ListActionDataResponseBodyActionsAction> action;

        public static ListActionDataResponseBodyActions build(java.util.Map<String, ?> map) throws Exception {
            ListActionDataResponseBodyActions self = new ListActionDataResponseBodyActions();
            return TeaModel.build(map, self);
        }

        public ListActionDataResponseBodyActions setAction(java.util.List<ListActionDataResponseBodyActionsAction> action) {
            this.action = action;
            return this;
        }
        public java.util.List<ListActionDataResponseBodyActionsAction> getAction() {
            return this.action;
        }

    }

}
