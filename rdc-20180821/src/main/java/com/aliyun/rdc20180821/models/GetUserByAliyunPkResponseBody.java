// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetUserByAliyunPkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetUserByAliyunPkResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserByAliyunPkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserByAliyunPkResponseBody self = new GetUserByAliyunPkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserByAliyunPkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserByAliyunPkResponseBody setData(GetUserByAliyunPkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserByAliyunPkResponseBodyData getData() {
        return this.data;
    }

    public GetUserByAliyunPkResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetUserByAliyunPkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserByAliyunPkResponseBodyDataDingtalkUser extends TeaModel {
        @NameInMap("DingtalkUserId")
        public Integer dingtalkUserId;

        @NameInMap("DingId")
        public String dingId;

        @NameInMap("UnionId")
        public String unionId;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("CodeUserName")
        public String codeUserName;

        @NameInMap("Id")
        public Integer id;

        public static GetUserByAliyunPkResponseBodyDataDingtalkUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserByAliyunPkResponseBodyDataDingtalkUser self = new GetUserByAliyunPkResponseBodyDataDingtalkUser();
            return TeaModel.build(map, self);
        }

        public GetUserByAliyunPkResponseBodyDataDingtalkUser setDingtalkUserId(Integer dingtalkUserId) {
            this.dingtalkUserId = dingtalkUserId;
            return this;
        }
        public Integer getDingtalkUserId() {
            return this.dingtalkUserId;
        }

        public GetUserByAliyunPkResponseBodyDataDingtalkUser setDingId(String dingId) {
            this.dingId = dingId;
            return this;
        }
        public String getDingId() {
            return this.dingId;
        }

        public GetUserByAliyunPkResponseBodyDataDingtalkUser setUnionId(String unionId) {
            this.unionId = unionId;
            return this;
        }
        public String getUnionId() {
            return this.unionId;
        }

        public GetUserByAliyunPkResponseBodyDataDingtalkUser setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetUserByAliyunPkResponseBodyDataDingtalkUser setCodeUserName(String codeUserName) {
            this.codeUserName = codeUserName;
            return this;
        }
        public String getCodeUserName() {
            return this.codeUserName;
        }

        public GetUserByAliyunPkResponseBodyDataDingtalkUser setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class GetUserByAliyunPkResponseBodyDataUserProfileDTO extends TeaModel {
        @NameInMap("DataSource")
        public String dataSource;

        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("Email")
        public String email;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("UserId")
        public Integer userId;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("EnglishName")
        public String englishName;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("Name")
        public String name;

        public static GetUserByAliyunPkResponseBodyDataUserProfileDTO build(java.util.Map<String, ?> map) throws Exception {
            GetUserByAliyunPkResponseBodyDataUserProfileDTO self = new GetUserByAliyunPkResponseBodyDataUserProfileDTO();
            return TeaModel.build(map, self);
        }

        public GetUserByAliyunPkResponseBodyDataUserProfileDTO setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public GetUserByAliyunPkResponseBodyDataUserProfileDTO setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public GetUserByAliyunPkResponseBodyDataUserProfileDTO setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserByAliyunPkResponseBodyDataUserProfileDTO setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetUserByAliyunPkResponseBodyDataUserProfileDTO setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public GetUserByAliyunPkResponseBodyDataUserProfileDTO setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetUserByAliyunPkResponseBodyDataUserProfileDTO setEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
        }
        public String getEnglishName() {
            return this.englishName;
        }

        public GetUserByAliyunPkResponseBodyDataUserProfileDTO setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetUserByAliyunPkResponseBodyDataUserProfileDTO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetUserByAliyunPkResponseBodyDataAliyunUser extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("HavanaId")
        public String havanaId;

        @NameInMap("TaobaoNick")
        public String taobaoNick;

        @NameInMap("Kp")
        public String kp;

        @NameInMap("Realname")
        public String realname;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("AccountStructure")
        public Integer accountStructure;

        @NameInMap("AliyunId")
        public String aliyunId;

        @NameInMap("Id")
        public Integer id;

        public static GetUserByAliyunPkResponseBodyDataAliyunUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserByAliyunPkResponseBodyDataAliyunUser self = new GetUserByAliyunPkResponseBodyDataAliyunUser();
            return TeaModel.build(map, self);
        }

        public GetUserByAliyunPkResponseBodyDataAliyunUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserByAliyunPkResponseBodyDataAliyunUser setHavanaId(String havanaId) {
            this.havanaId = havanaId;
            return this;
        }
        public String getHavanaId() {
            return this.havanaId;
        }

        public GetUserByAliyunPkResponseBodyDataAliyunUser setTaobaoNick(String taobaoNick) {
            this.taobaoNick = taobaoNick;
            return this;
        }
        public String getTaobaoNick() {
            return this.taobaoNick;
        }

        public GetUserByAliyunPkResponseBodyDataAliyunUser setKp(String kp) {
            this.kp = kp;
            return this;
        }
        public String getKp() {
            return this.kp;
        }

        public GetUserByAliyunPkResponseBodyDataAliyunUser setRealname(String realname) {
            this.realname = realname;
            return this;
        }
        public String getRealname() {
            return this.realname;
        }

        public GetUserByAliyunPkResponseBodyDataAliyunUser setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetUserByAliyunPkResponseBodyDataAliyunUser setAccountStructure(Integer accountStructure) {
            this.accountStructure = accountStructure;
            return this;
        }
        public Integer getAccountStructure() {
            return this.accountStructure;
        }

        public GetUserByAliyunPkResponseBodyDataAliyunUser setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public GetUserByAliyunPkResponseBodyDataAliyunUser setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class GetUserByAliyunPkResponseBodyData extends TeaModel {
        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Guid")
        public String guid;

        @NameInMap("DingtalkUser")
        public GetUserByAliyunPkResponseBodyDataDingtalkUser dingtalkUser;

        @NameInMap("UserProfileDTO")
        public GetUserByAliyunPkResponseBodyDataUserProfileDTO userProfileDTO;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("MainAccountType")
        public String mainAccountType;

        @NameInMap("AliyunUser")
        public GetUserByAliyunPkResponseBodyDataAliyunUser aliyunUser;

        @NameInMap("IsValid")
        public Boolean isValid;

        @NameInMap("Id")
        public Integer id;

        public static GetUserByAliyunPkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserByAliyunPkResponseBodyData self = new GetUserByAliyunPkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserByAliyunPkResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetUserByAliyunPkResponseBodyData setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetUserByAliyunPkResponseBodyData setDingtalkUser(GetUserByAliyunPkResponseBodyDataDingtalkUser dingtalkUser) {
            this.dingtalkUser = dingtalkUser;
            return this;
        }
        public GetUserByAliyunPkResponseBodyDataDingtalkUser getDingtalkUser() {
            return this.dingtalkUser;
        }

        public GetUserByAliyunPkResponseBodyData setUserProfileDTO(GetUserByAliyunPkResponseBodyDataUserProfileDTO userProfileDTO) {
            this.userProfileDTO = userProfileDTO;
            return this;
        }
        public GetUserByAliyunPkResponseBodyDataUserProfileDTO getUserProfileDTO() {
            return this.userProfileDTO;
        }

        public GetUserByAliyunPkResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetUserByAliyunPkResponseBodyData setMainAccountType(String mainAccountType) {
            this.mainAccountType = mainAccountType;
            return this;
        }
        public String getMainAccountType() {
            return this.mainAccountType;
        }

        public GetUserByAliyunPkResponseBodyData setAliyunUser(GetUserByAliyunPkResponseBodyDataAliyunUser aliyunUser) {
            this.aliyunUser = aliyunUser;
            return this;
        }
        public GetUserByAliyunPkResponseBodyDataAliyunUser getAliyunUser() {
            return this.aliyunUser;
        }

        public GetUserByAliyunPkResponseBodyData setIsValid(Boolean isValid) {
            this.isValid = isValid;
            return this;
        }
        public Boolean getIsValid() {
            return this.isValid;
        }

        public GetUserByAliyunPkResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
