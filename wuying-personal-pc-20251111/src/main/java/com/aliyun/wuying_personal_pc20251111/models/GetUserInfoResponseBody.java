// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class GetUserInfoResponseBody extends TeaModel {
    @NameInMap("AliyunId")
    public String aliyunId;

    @NameInMap("NickName")
    public String nickName;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UnionId")
    public String unionId;

    public static GetUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoResponseBody self = new GetUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserInfoResponseBody setAliyunId(String aliyunId) {
        this.aliyunId = aliyunId;
        return this;
    }
    public String getAliyunId() {
        return this.aliyunId;
    }

    public GetUserInfoResponseBody setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public GetUserInfoResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GetUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserInfoResponseBody setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

}
