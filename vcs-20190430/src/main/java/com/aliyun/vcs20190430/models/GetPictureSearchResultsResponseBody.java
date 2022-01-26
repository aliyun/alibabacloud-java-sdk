// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class GetPictureSearchResultsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetPictureSearchResultsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPictureSearchResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPictureSearchResultsResponseBody self = new GetPictureSearchResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPictureSearchResultsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPictureSearchResultsResponseBody setData(java.util.List<GetPictureSearchResultsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPictureSearchResultsResponseBodyData> getData() {
        return this.data;
    }

    public GetPictureSearchResultsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPictureSearchResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPictureSearchResultsResponseBodyData extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("LeftUpperCornerXCoordinate")
        public String leftUpperCornerXCoordinate;

        @NameInMap("LeftUpperCornerYCoordinate")
        public String leftUpperCornerYCoordinate;

        @NameInMap("LocationMarkTime")
        public String locationMarkTime;

        @NameInMap("PictureId1")
        public String pictureId1;

        @NameInMap("PictureId2")
        public String pictureId2;

        @NameInMap("PictureUrl1")
        public String pictureUrl1;

        @NameInMap("PictureUrl2")
        public String pictureUrl2;

        @NameInMap("RightLowerCornerXCoordinate")
        public String rightLowerCornerXCoordinate;

        @NameInMap("RightLowerCornerYCoordinate")
        public String rightLowerCornerYCoordinate;

        @NameInMap("Similarity")
        public Float similarity;

        public static GetPictureSearchResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPictureSearchResultsResponseBodyData self = new GetPictureSearchResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPictureSearchResultsResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetPictureSearchResultsResponseBodyData setLeftUpperCornerXCoordinate(String leftUpperCornerXCoordinate) {
            this.leftUpperCornerXCoordinate = leftUpperCornerXCoordinate;
            return this;
        }
        public String getLeftUpperCornerXCoordinate() {
            return this.leftUpperCornerXCoordinate;
        }

        public GetPictureSearchResultsResponseBodyData setLeftUpperCornerYCoordinate(String leftUpperCornerYCoordinate) {
            this.leftUpperCornerYCoordinate = leftUpperCornerYCoordinate;
            return this;
        }
        public String getLeftUpperCornerYCoordinate() {
            return this.leftUpperCornerYCoordinate;
        }

        public GetPictureSearchResultsResponseBodyData setLocationMarkTime(String locationMarkTime) {
            this.locationMarkTime = locationMarkTime;
            return this;
        }
        public String getLocationMarkTime() {
            return this.locationMarkTime;
        }

        public GetPictureSearchResultsResponseBodyData setPictureId1(String pictureId1) {
            this.pictureId1 = pictureId1;
            return this;
        }
        public String getPictureId1() {
            return this.pictureId1;
        }

        public GetPictureSearchResultsResponseBodyData setPictureId2(String pictureId2) {
            this.pictureId2 = pictureId2;
            return this;
        }
        public String getPictureId2() {
            return this.pictureId2;
        }

        public GetPictureSearchResultsResponseBodyData setPictureUrl1(String pictureUrl1) {
            this.pictureUrl1 = pictureUrl1;
            return this;
        }
        public String getPictureUrl1() {
            return this.pictureUrl1;
        }

        public GetPictureSearchResultsResponseBodyData setPictureUrl2(String pictureUrl2) {
            this.pictureUrl2 = pictureUrl2;
            return this;
        }
        public String getPictureUrl2() {
            return this.pictureUrl2;
        }

        public GetPictureSearchResultsResponseBodyData setRightLowerCornerXCoordinate(String rightLowerCornerXCoordinate) {
            this.rightLowerCornerXCoordinate = rightLowerCornerXCoordinate;
            return this;
        }
        public String getRightLowerCornerXCoordinate() {
            return this.rightLowerCornerXCoordinate;
        }

        public GetPictureSearchResultsResponseBodyData setRightLowerCornerYCoordinate(String rightLowerCornerYCoordinate) {
            this.rightLowerCornerYCoordinate = rightLowerCornerYCoordinate;
            return this;
        }
        public String getRightLowerCornerYCoordinate() {
            return this.rightLowerCornerYCoordinate;
        }

        public GetPictureSearchResultsResponseBodyData setSimilarity(Float similarity) {
            this.similarity = similarity;
            return this;
        }
        public Float getSimilarity() {
            return this.similarity;
        }

    }

}
