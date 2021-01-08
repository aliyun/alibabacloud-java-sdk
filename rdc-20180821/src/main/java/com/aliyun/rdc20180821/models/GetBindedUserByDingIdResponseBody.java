// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetBindedUserByDingIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetBindedUserByDingIdResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static GetBindedUserByDingIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBindedUserByDingIdResponseBody self = new GetBindedUserByDingIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBindedUserByDingIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBindedUserByDingIdResponseBody setData(GetBindedUserByDingIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBindedUserByDingIdResponseBodyData getData() {
        return this.data;
    }

    public GetBindedUserByDingIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetBindedUserByDingIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBindedUserByDingIdResponseBodyDataDingtalkUser extends TeaModel {
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

        public static GetBindedUserByDingIdResponseBodyDataDingtalkUser build(java.util.Map<String, ?> map) throws Exception {
            GetBindedUserByDingIdResponseBodyDataDingtalkUser self = new GetBindedUserByDingIdResponseBodyDataDingtalkUser();
            return TeaModel.build(map, self);
        }

        public GetBindedUserByDingIdResponseBodyDataDingtalkUser setDingtalkUserId(Integer dingtalkUserId) {
            this.dingtalkUserId = dingtalkUserId;
            return this;
        }
        public Integer getDingtalkUserId() {
            return this.dingtalkUserId;
        }

        public GetBindedUserByDingIdResponseBodyDataDingtalkUser setDingId(String dingId) {
            this.dingId = dingId;
            return this;
        }
        public String getDingId() {
            return this.dingId;
        }

        public GetBindedUserByDingIdResponseBodyDataDingtalkUser setUnionId(String unionId) {
            this.unionId = unionId;
            return this;
        }
        public String getUnionId() {
            return this.unionId;
        }

        public GetBindedUserByDingIdResponseBodyDataDingtalkUser setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetBindedUserByDingIdResponseBodyDataDingtalkUser setCodeUserName(String codeUserName) {
            this.codeUserName = codeUserName;
            return this;
        }
        public String getCodeUserName() {
            return this.codeUserName;
        }

        public GetBindedUserByDingIdResponseBodyDataDingtalkUser setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class GetBindedUserByDingIdResponseBodyDataUserProfileDTO extends TeaModel {
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

        public static GetBindedUserByDingIdResponseBodyDataUserProfileDTO build(java.util.Map<String, ?> map) throws Exception {
            GetBindedUserByDingIdResponseBodyDataUserProfileDTO self = new GetBindedUserByDingIdResponseBodyDataUserProfileDTO();
            return TeaModel.build(map, self);
        }

        public GetBindedUserByDingIdResponseBodyDataUserProfileDTO setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public GetBindedUserByDingIdResponseBodyDataUserProfileDTO setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public GetBindedUserByDingIdResponseBodyDataUserProfileDTO setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetBindedUserByDingIdResponseBodyDataUserProfileDTO setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetBindedUserByDingIdResponseBodyDataUserProfileDTO setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public GetBindedUserByDingIdResponseBodyDataUserProfileDTO setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetBindedUserByDingIdResponseBodyDataUserProfileDTO setEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
        }
        public String getEnglishName() {
            return this.englishName;
        }

        public GetBindedUserByDingIdResponseBodyDataUserProfileDTO setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetBindedUserByDingIdResponseBodyDataUserProfileDTO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetBindedUserByDingIdResponseBodyDataAliyunUser extends TeaModel {
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

        public static GetBindedUserByDingIdResponseBodyDataAliyunUser build(java.util.Map<String, ?> map) throws Exception {
            GetBindedUserByDingIdResponseBodyDataAliyunUser self = new GetBindedUserByDingIdResponseBodyDataAliyunUser();
            return TeaModel.build(map, self);
        }

        public GetBindedUserByDingIdResponseBodyDataAliyunUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetBindedUserByDingIdResponseBodyDataAliyunUser setHavanaId(String havanaId) {
            this.havanaId = havanaId;
            return this;
        }
        public String getHavanaId() {
            return this.havanaId;
        }

        public GetBindedUserByDingIdResponseBodyDataAliyunUser setTaobaoNick(String taobaoNick) {
            this.taobaoNick = taobaoNick;
            return this;
        }
        public String getTaobaoNick() {
            return this.taobaoNick;
        }

        public GetBindedUserByDingIdResponseBodyDataAliyunUser setKp(String kp) {
            this.kp = kp;
            return this;
        }
        public String getKp() {
            return this.kp;
        }

        public GetBindedUserByDingIdResponseBodyDataAliyunUser setRealname(String realname) {
            this.realname = realname;
            return this;
        }
        public String getRealname() {
            return this.realname;
        }

        public GetBindedUserByDingIdResponseBodyDataAliyunUser setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetBindedUserByDingIdResponseBodyDataAliyunUser setAccountStructure(Integer accountStructure) {
            this.accountStructure = accountStructure;
            return this;
        }
        public Integer getAccountStructure() {
            return this.accountStructure;
        }

        public GetBindedUserByDingIdResponseBodyDataAliyunUser setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public GetBindedUserByDingIdResponseBodyDataAliyunUser setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class GetBindedUserByDingIdResponseBodyData extends TeaModel {
        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Guid")
        public String guid;

        @NameInMap("DingtalkUser")
        public GetBindedUserByDingIdResponseBodyDataDingtalkUser dingtalkUser;

        @NameInMap("UserProfileDTO")
        public GetBindedUserByDingIdResponseBodyDataUserProfileDTO userProfileDTO;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("MainAccountType")
        public String mainAccountType;

        @NameInMap("AliyunUser")
        public GetBindedUserByDingIdResponseBodyDataAliyunUser aliyunUser;

        @NameInMap("IsValid")
        public Boolean isValid;

        @NameInMap("Id")
        public Integer id;

        public static GetBindedUserByDingIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBindedUserByDingIdResponseBodyData self = new GetBindedUserByDingIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBindedUserByDingIdResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetBindedUserByDingIdResponseBodyData setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetBindedUserByDingIdResponseBodyData setDingtalkUser(GetBindedUserByDingIdResponseBodyDataDingtalkUser dingtalkUser) {
            this.dingtalkUser = dingtalkUser;
            return this;
        }
        public GetBindedUserByDingIdResponseBodyDataDingtalkUser getDingtalkUser() {
            return this.dingtalkUser;
        }

        public GetBindedUserByDingIdResponseBodyData setUserProfileDTO(GetBindedUserByDingIdResponseBodyDataUserProfileDTO userProfileDTO) {
            this.userProfileDTO = userProfileDTO;
            return this;
        }
        public GetBindedUserByDingIdResponseBodyDataUserProfileDTO getUserProfileDTO() {
            return this.userProfileDTO;
        }

        public GetBindedUserByDingIdResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetBindedUserByDingIdResponseBodyData setMainAccountType(String mainAccountType) {
            this.mainAccountType = mainAccountType;
            return this;
        }
        public String getMainAccountType() {
            return this.mainAccountType;
        }

        public GetBindedUserByDingIdResponseBodyData setAliyunUser(GetBindedUserByDingIdResponseBodyDataAliyunUser aliyunUser) {
            this.aliyunUser = aliyunUser;
            return this;
        }
        public GetBindedUserByDingIdResponseBodyDataAliyunUser getAliyunUser() {
            return this.aliyunUser;
        }

        public GetBindedUserByDingIdResponseBodyData setIsValid(Boolean isValid) {
            this.isValid = isValid;
            return this;
        }
        public Boolean getIsValid() {
            return this.isValid;
        }

        public GetBindedUserByDingIdResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
