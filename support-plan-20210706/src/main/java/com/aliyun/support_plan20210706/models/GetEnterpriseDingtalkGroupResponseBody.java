// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class GetEnterpriseDingtalkGroupResponseBody extends TeaModel {
    // 接口请求的唯一ID, 每次调用requestID唯一
    @NameInMap("RequestId")
    public String requestId;

    // 调用接口返回是否成功, true代表调用正常
    @NameInMap("Success")
    public Boolean success;

    // 错误信息, 当success=false的时候, 可以取到message
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetEnterpriseDingtalkGroupResponseBodyData data;

    // 接口请求结果返回码
    @NameInMap("Code")
    public String code;

    public static GetEnterpriseDingtalkGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDingtalkGroupResponseBody self = new GetEnterpriseDingtalkGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDingtalkGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEnterpriseDingtalkGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetEnterpriseDingtalkGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEnterpriseDingtalkGroupResponseBody setData(GetEnterpriseDingtalkGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnterpriseDingtalkGroupResponseBodyData getData() {
        return this.data;
    }

    public GetEnterpriseDingtalkGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetEnterpriseDingtalkGroupResponseBodyData extends TeaModel {
        // 企业服务群的ID
        @NameInMap("OpenGroupId")
        public String openGroupId;

        // 企业服务群的群名
        @NameInMap("GroupName")
        public String groupName;

        public static GetEnterpriseDingtalkGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseDingtalkGroupResponseBodyData self = new GetEnterpriseDingtalkGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseDingtalkGroupResponseBodyData setOpenGroupId(String openGroupId) {
            this.openGroupId = openGroupId;
            return this;
        }
        public String getOpenGroupId() {
            return this.openGroupId;
        }

        public GetEnterpriseDingtalkGroupResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

}
