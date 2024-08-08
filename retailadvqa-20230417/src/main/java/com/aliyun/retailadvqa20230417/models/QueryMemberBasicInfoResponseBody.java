// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class QueryMemberBasicInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryMemberBasicInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Lydaas.QuickMember.SystemError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>1DEFC4F1-AF11-5A3C-93B9-2880768DA218</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryMemberBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMemberBasicInfoResponseBody self = new QueryMemberBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMemberBasicInfoResponseBody setData(QueryMemberBasicInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMemberBasicInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryMemberBasicInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryMemberBasicInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryMemberBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMemberBasicInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMemberBasicInfoResponseBodyData extends TeaModel {
        @NameInMap("Area")
        public String area;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("Birthday")
        public String birthday;

        @NameInMap("City")
        public String city;

        @NameInMap("Country")
        public String country;

        @NameInMap("Email")
        public String email;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("LevelName")
        public String levelName;

        @NameInMap("LevelNum")
        public String levelNum;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("MemberNickName")
        public String memberNickName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("NearExpiredScore")
        public String nearExpiredScore;

        @NameInMap("OpenMerchantId")
        public String openMerchantId;

        @NameInMap("OuterMemberId")
        public String outerMemberId;

        @NameInMap("Points")
        public String points;

        @NameInMap("Province")
        public String province;

        @NameInMap("Score")
        public String score;

        @NameInMap("Sex")
        public String sex;

        public static QueryMemberBasicInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMemberBasicInfoResponseBodyData self = new QueryMemberBasicInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMemberBasicInfoResponseBodyData setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public QueryMemberBasicInfoResponseBodyData setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public QueryMemberBasicInfoResponseBodyData setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public QueryMemberBasicInfoResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryMemberBasicInfoResponseBodyData setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryMemberBasicInfoResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryMemberBasicInfoResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public QueryMemberBasicInfoResponseBodyData setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

        public QueryMemberBasicInfoResponseBodyData setLevelNum(String levelNum) {
            this.levelNum = levelNum;
            return this;
        }
        public String getLevelNum() {
            return this.levelNum;
        }

        public QueryMemberBasicInfoResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public QueryMemberBasicInfoResponseBodyData setMemberNickName(String memberNickName) {
            this.memberNickName = memberNickName;
            return this;
        }
        public String getMemberNickName() {
            return this.memberNickName;
        }

        public QueryMemberBasicInfoResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryMemberBasicInfoResponseBodyData setNearExpiredScore(String nearExpiredScore) {
            this.nearExpiredScore = nearExpiredScore;
            return this;
        }
        public String getNearExpiredScore() {
            return this.nearExpiredScore;
        }

        public QueryMemberBasicInfoResponseBodyData setOpenMerchantId(String openMerchantId) {
            this.openMerchantId = openMerchantId;
            return this;
        }
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        public QueryMemberBasicInfoResponseBodyData setOuterMemberId(String outerMemberId) {
            this.outerMemberId = outerMemberId;
            return this;
        }
        public String getOuterMemberId() {
            return this.outerMemberId;
        }

        public QueryMemberBasicInfoResponseBodyData setPoints(String points) {
            this.points = points;
            return this;
        }
        public String getPoints() {
            return this.points;
        }

        public QueryMemberBasicInfoResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryMemberBasicInfoResponseBodyData setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMemberBasicInfoResponseBodyData setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

    }

}
