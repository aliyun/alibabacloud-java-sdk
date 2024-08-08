// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class EditMemberBasicInfoRequest extends TeaModel {
    @NameInMap("Body")
    public EditMemberBasicInfoRequestBody body;

    public static EditMemberBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        EditMemberBasicInfoRequest self = new EditMemberBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public EditMemberBasicInfoRequest setBody(EditMemberBasicInfoRequestBody body) {
        this.body = body;
        return this;
    }
    public EditMemberBasicInfoRequestBody getBody() {
        return this.body;
    }

    public static class EditMemberBasicInfoRequestBody extends TeaModel {
        @NameInMap("Area")
        public String area;

        /**
         * <strong>example:</strong>
         * <p>xxx.jpg</p>
         */
        @NameInMap("Avatar")
        public String avatar;

        /**
         * <strong>example:</strong>
         * <p>2024-06-20</p>
         */
        @NameInMap("Birthday")
        public String birthday;

        @NameInMap("City")
        public String city;

        @NameInMap("Country")
        public String country;

        /**
         * <strong>example:</strong>
         * <p>xxx.com</p>
         */
        @NameInMap("Email")
        public String email;

        @NameInMap("MemberName")
        public String memberName;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("MemberNickName")
        public String memberNickName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1230094</p>
         */
        @NameInMap("OpenMerchantId")
        public String openMerchantId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TAOBAO</p>
         */
        @NameInMap("PlatformType")
        public String platformType;

        @NameInMap("Province")
        public String province;

        @NameInMap("Sex")
        public String sex;

        public static EditMemberBasicInfoRequestBody build(java.util.Map<String, ?> map) throws Exception {
            EditMemberBasicInfoRequestBody self = new EditMemberBasicInfoRequestBody();
            return TeaModel.build(map, self);
        }

        public EditMemberBasicInfoRequestBody setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public EditMemberBasicInfoRequestBody setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public EditMemberBasicInfoRequestBody setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public EditMemberBasicInfoRequestBody setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public EditMemberBasicInfoRequestBody setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public EditMemberBasicInfoRequestBody setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public EditMemberBasicInfoRequestBody setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public EditMemberBasicInfoRequestBody setMemberNickName(String memberNickName) {
            this.memberNickName = memberNickName;
            return this;
        }
        public String getMemberNickName() {
            return this.memberNickName;
        }

        public EditMemberBasicInfoRequestBody setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public EditMemberBasicInfoRequestBody setOpenMerchantId(String openMerchantId) {
            this.openMerchantId = openMerchantId;
            return this;
        }
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        public EditMemberBasicInfoRequestBody setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public EditMemberBasicInfoRequestBody setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public EditMemberBasicInfoRequestBody setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

    }

}
