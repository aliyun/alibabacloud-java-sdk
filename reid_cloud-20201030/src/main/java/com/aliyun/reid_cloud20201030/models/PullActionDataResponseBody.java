// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class PullActionDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextMessageId")
    public Long nextMessageId;

    @NameInMap("Actions")
    public PullActionDataResponseBodyActions actions;

    @NameInMap("PartitionIndex")
    public Integer partitionIndex;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static PullActionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PullActionDataResponseBody self = new PullActionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public PullActionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PullActionDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PullActionDataResponseBody setNextMessageId(Long nextMessageId) {
        this.nextMessageId = nextMessageId;
        return this;
    }
    public Long getNextMessageId() {
        return this.nextMessageId;
    }

    public PullActionDataResponseBody setActions(PullActionDataResponseBodyActions actions) {
        this.actions = actions;
        return this;
    }
    public PullActionDataResponseBodyActions getActions() {
        return this.actions;
    }

    public PullActionDataResponseBody setPartitionIndex(Integer partitionIndex) {
        this.partitionIndex = partitionIndex;
        return this;
    }
    public Integer getPartitionIndex() {
        return this.partitionIndex;
    }

    public PullActionDataResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public PullActionDataResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public PullActionDataResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public PullActionDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PullActionDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PullActionDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PullActionDataResponseBodyActionsActionPointInMap extends TeaModel {
        @NameInMap("Y")
        public Float y;

        @NameInMap("X")
        public Float x;

        public static PullActionDataResponseBodyActionsActionPointInMap build(java.util.Map<String, ?> map) throws Exception {
            PullActionDataResponseBodyActionsActionPointInMap self = new PullActionDataResponseBodyActionsActionPointInMap();
            return TeaModel.build(map, self);
        }

        public PullActionDataResponseBodyActionsActionPointInMap setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public PullActionDataResponseBodyActionsActionPointInMap setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class PullActionDataResponseBodyActionsActionObjectPositionInImage extends TeaModel {
        @NameInMap("Right")
        public Float right;

        @NameInMap("Top")
        public Float top;

        @NameInMap("Left")
        public Float left;

        @NameInMap("Bottom")
        public Float bottom;

        public static PullActionDataResponseBodyActionsActionObjectPositionInImage build(java.util.Map<String, ?> map) throws Exception {
            PullActionDataResponseBodyActionsActionObjectPositionInImage self = new PullActionDataResponseBodyActionsActionObjectPositionInImage();
            return TeaModel.build(map, self);
        }

        public PullActionDataResponseBodyActionsActionObjectPositionInImage setRight(Float right) {
            this.right = right;
            return this;
        }
        public Float getRight() {
            return this.right;
        }

        public PullActionDataResponseBodyActionsActionObjectPositionInImage setTop(Float top) {
            this.top = top;
            return this;
        }
        public Float getTop() {
            return this.top;
        }

        public PullActionDataResponseBodyActionsActionObjectPositionInImage setLeft(Float left) {
            this.left = left;
            return this;
        }
        public Float getLeft() {
            return this.left;
        }

        public PullActionDataResponseBodyActionsActionObjectPositionInImage setBottom(Float bottom) {
            this.bottom = bottom;
            return this;
        }
        public Float getBottom() {
            return this.bottom;
        }

    }

    public static class PullActionDataResponseBodyActionsAction extends TeaModel {
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
        public PullActionDataResponseBodyActionsActionPointInMap pointInMap;

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
        public PullActionDataResponseBodyActionsActionObjectPositionInImage objectPositionInImage;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("ArriveTimestamp")
        public Long arriveTimestamp;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ImageObjectKey")
        public String imageObjectKey;

        public static PullActionDataResponseBodyActionsAction build(java.util.Map<String, ?> map) throws Exception {
            PullActionDataResponseBodyActionsAction self = new PullActionDataResponseBodyActionsAction();
            return TeaModel.build(map, self);
        }

        public PullActionDataResponseBodyActionsAction setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public PullActionDataResponseBodyActionsAction setStayPeriod(Integer stayPeriod) {
            this.stayPeriod = stayPeriod;
            return this;
        }
        public Integer getStayPeriod() {
            return this.stayPeriod;
        }

        public PullActionDataResponseBodyActionsAction setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public PullActionDataResponseBodyActionsAction setInStay(Long inStay) {
            this.inStay = inStay;
            return this;
        }
        public Long getInStay() {
            return this.inStay;
        }

        public PullActionDataResponseBodyActionsAction setLocationLayerType(String locationLayerType) {
            this.locationLayerType = locationLayerType;
            return this;
        }
        public String getLocationLayerType() {
            return this.locationLayerType;
        }

        public PullActionDataResponseBodyActionsAction setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public PullActionDataResponseBodyActionsAction setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public PullActionDataResponseBodyActionsAction setLeaveTimestamp(Long leaveTimestamp) {
            this.leaveTimestamp = leaveTimestamp;
            return this;
        }
        public Long getLeaveTimestamp() {
            return this.leaveTimestamp;
        }

        public PullActionDataResponseBodyActionsAction setFacePointNumber(Integer facePointNumber) {
            this.facePointNumber = facePointNumber;
            return this;
        }
        public Integer getFacePointNumber() {
            return this.facePointNumber;
        }

        public PullActionDataResponseBodyActionsAction setUkId(Long ukId) {
            this.ukId = ukId;
            return this;
        }
        public Long getUkId() {
            return this.ukId;
        }

        public PullActionDataResponseBodyActionsAction setSpecialType(String specialType) {
            this.specialType = specialType;
            return this;
        }
        public String getSpecialType() {
            return this.specialType;
        }

        public PullActionDataResponseBodyActionsAction setPointInMap(PullActionDataResponseBodyActionsActionPointInMap pointInMap) {
            this.pointInMap = pointInMap;
            return this;
        }
        public PullActionDataResponseBodyActionsActionPointInMap getPointInMap() {
            return this.pointInMap;
        }

        public PullActionDataResponseBodyActionsAction setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public PullActionDataResponseBodyActionsAction setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

        public PullActionDataResponseBodyActionsAction setStayValid(Boolean stayValid) {
            this.stayValid = stayValid;
            return this;
        }
        public Boolean getStayValid() {
            return this.stayValid;
        }

        public PullActionDataResponseBodyActionsAction setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public PullActionDataResponseBodyActionsAction setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public PullActionDataResponseBodyActionsAction setBodyPointNumber(Integer bodyPointNumber) {
            this.bodyPointNumber = bodyPointNumber;
            return this;
        }
        public Integer getBodyPointNumber() {
            return this.bodyPointNumber;
        }

        public PullActionDataResponseBodyActionsAction setLocationId(Long locationId) {
            this.locationId = locationId;
            return this;
        }
        public Long getLocationId() {
            return this.locationId;
        }

        public PullActionDataResponseBodyActionsAction setObjectPositionInImage(PullActionDataResponseBodyActionsActionObjectPositionInImage objectPositionInImage) {
            this.objectPositionInImage = objectPositionInImage;
            return this;
        }
        public PullActionDataResponseBodyActionsActionObjectPositionInImage getObjectPositionInImage() {
            return this.objectPositionInImage;
        }

        public PullActionDataResponseBodyActionsAction setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public PullActionDataResponseBodyActionsAction setArriveTimestamp(Long arriveTimestamp) {
            this.arriveTimestamp = arriveTimestamp;
            return this;
        }
        public Long getArriveTimestamp() {
            return this.arriveTimestamp;
        }

        public PullActionDataResponseBodyActionsAction setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PullActionDataResponseBodyActionsAction setImageObjectKey(String imageObjectKey) {
            this.imageObjectKey = imageObjectKey;
            return this;
        }
        public String getImageObjectKey() {
            return this.imageObjectKey;
        }

    }

    public static class PullActionDataResponseBodyActions extends TeaModel {
        @NameInMap("Action")
        public java.util.List<PullActionDataResponseBodyActionsAction> action;

        public static PullActionDataResponseBodyActions build(java.util.Map<String, ?> map) throws Exception {
            PullActionDataResponseBodyActions self = new PullActionDataResponseBodyActions();
            return TeaModel.build(map, self);
        }

        public PullActionDataResponseBodyActions setAction(java.util.List<PullActionDataResponseBodyActionsAction> action) {
            this.action = action;
            return this;
        }
        public java.util.List<PullActionDataResponseBodyActionsAction> getAction() {
            return this.action;
        }

    }

}
