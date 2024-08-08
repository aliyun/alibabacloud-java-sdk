// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class AddMemberBasicInfoRequest extends TeaModel {
    @NameInMap("body")
    public AddMemberBasicInfoRequestBody body;

    public static AddMemberBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMemberBasicInfoRequest self = new AddMemberBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public AddMemberBasicInfoRequest setBody(AddMemberBasicInfoRequestBody body) {
        this.body = body;
        return this;
    }
    public AddMemberBasicInfoRequestBody getBody() {
        return this.body;
    }

    public static class AddMemberBasicInfoRequestBodyChannels extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ChannelCode")
        public String channelCode;

        @NameInMap("ChannelOpenId")
        public String channelOpenId;

        @NameInMap("ChannelUnionId")
        public String channelUnionId;

        @NameInMap("Scene")
        public String scene;

        public static AddMemberBasicInfoRequestBodyChannels build(java.util.Map<String, ?> map) throws Exception {
            AddMemberBasicInfoRequestBodyChannels self = new AddMemberBasicInfoRequestBodyChannels();
            return TeaModel.build(map, self);
        }

        public AddMemberBasicInfoRequestBodyChannels setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public AddMemberBasicInfoRequestBodyChannels setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public AddMemberBasicInfoRequestBodyChannels setChannelOpenId(String channelOpenId) {
            this.channelOpenId = channelOpenId;
            return this;
        }
        public String getChannelOpenId() {
            return this.channelOpenId;
        }

        public AddMemberBasicInfoRequestBodyChannels setChannelUnionId(String channelUnionId) {
            this.channelUnionId = channelUnionId;
            return this;
        }
        public String getChannelUnionId() {
            return this.channelUnionId;
        }

        public AddMemberBasicInfoRequestBodyChannels setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class AddMemberBasicInfoRequestBody extends TeaModel {
        @NameInMap("Area")
        public String area;

        @NameInMap("Avatar")
        public String avatar;

        /**
         * <strong>example:</strong>
         * <p>2022-09-08</p>
         */
        @NameInMap("Birthday")
        public String birthday;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Channels")
        public java.util.List<AddMemberBasicInfoRequestBodyChannels> channels;

        @NameInMap("City")
        public String city;

        @NameInMap("Country")
        public String country;

        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Extra")
        public String extra;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("MemberNickName")
        public String memberNickName;

        @NameInMap("MixMobile")
        public String mixMobile;

        /**
         * <strong>example:</strong>
         * <p>17716699087</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("OpenMerchantId")
        public String openMerchantId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("PlatFormType")
        public String platFormType;

        @NameInMap("Province")
        public String province;

        @NameInMap("Sex")
        public String sex;

        public static AddMemberBasicInfoRequestBody build(java.util.Map<String, ?> map) throws Exception {
            AddMemberBasicInfoRequestBody self = new AddMemberBasicInfoRequestBody();
            return TeaModel.build(map, self);
        }

        public AddMemberBasicInfoRequestBody setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public AddMemberBasicInfoRequestBody setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public AddMemberBasicInfoRequestBody setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public AddMemberBasicInfoRequestBody setChannels(java.util.List<AddMemberBasicInfoRequestBodyChannels> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<AddMemberBasicInfoRequestBodyChannels> getChannels() {
            return this.channels;
        }

        public AddMemberBasicInfoRequestBody setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public AddMemberBasicInfoRequestBody setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public AddMemberBasicInfoRequestBody setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public AddMemberBasicInfoRequestBody setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public AddMemberBasicInfoRequestBody setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public AddMemberBasicInfoRequestBody setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public AddMemberBasicInfoRequestBody setMemberNickName(String memberNickName) {
            this.memberNickName = memberNickName;
            return this;
        }
        public String getMemberNickName() {
            return this.memberNickName;
        }

        public AddMemberBasicInfoRequestBody setMixMobile(String mixMobile) {
            this.mixMobile = mixMobile;
            return this;
        }
        public String getMixMobile() {
            return this.mixMobile;
        }

        public AddMemberBasicInfoRequestBody setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public AddMemberBasicInfoRequestBody setOpenMerchantId(String openMerchantId) {
            this.openMerchantId = openMerchantId;
            return this;
        }
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        public AddMemberBasicInfoRequestBody setPlatFormType(String platFormType) {
            this.platFormType = platFormType;
            return this;
        }
        public String getPlatFormType() {
            return this.platFormType;
        }

        public AddMemberBasicInfoRequestBody setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public AddMemberBasicInfoRequestBody setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

    }

}
