// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListEnterpriseDingtalkGroupsResponseBody extends TeaModel {
    // 接口请求的唯一ID, 每次调用requestID唯一
    @NameInMap("RequestId")
    public String requestId;

    // 调用接口返回是否成功, true代表调用正常
    @NameInMap("Success")
    public Boolean success;

    // 错误信息, 当success=false的时候, 可以取到message
    @NameInMap("Message")
    public String message;

    // 接口请求结果返回码
    @NameInMap("Code")
    public String code;

    // 服务钉群数组
    @NameInMap("Data")
    public java.util.List<ListEnterpriseDingtalkGroupsResponseBodyData> data;

    public static ListEnterpriseDingtalkGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseDingtalkGroupsResponseBody self = new ListEnterpriseDingtalkGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseDingtalkGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnterpriseDingtalkGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListEnterpriseDingtalkGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnterpriseDingtalkGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEnterpriseDingtalkGroupsResponseBody setData(java.util.List<ListEnterpriseDingtalkGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEnterpriseDingtalkGroupsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListEnterpriseDingtalkGroupsResponseBodyData extends TeaModel {
        // 钉群ID
        @NameInMap("OpenGroupId")
        public String openGroupId;

        // 钉群名
        @NameInMap("GroupName")
        public String groupName;

        public static ListEnterpriseDingtalkGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseDingtalkGroupsResponseBodyData self = new ListEnterpriseDingtalkGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseDingtalkGroupsResponseBodyData setOpenGroupId(String openGroupId) {
            this.openGroupId = openGroupId;
            return this;
        }
        public String getOpenGroupId() {
            return this.openGroupId;
        }

        public ListEnterpriseDingtalkGroupsResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

}
