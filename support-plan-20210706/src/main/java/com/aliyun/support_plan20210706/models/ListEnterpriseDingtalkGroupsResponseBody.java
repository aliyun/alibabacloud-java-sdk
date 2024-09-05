// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListEnterpriseDingtalkGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListEnterpriseDingtalkGroupsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Data Invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>12xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListEnterpriseDingtalkGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseDingtalkGroupsResponseBody self = new ListEnterpriseDingtalkGroupsResponseBody();
        return TeaModel.build(map, self);
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

    public ListEnterpriseDingtalkGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class ListEnterpriseDingtalkGroupsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>A公司服务群</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OpenGroupId")
        public String openGroupId;

        public static ListEnterpriseDingtalkGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseDingtalkGroupsResponseBodyData self = new ListEnterpriseDingtalkGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseDingtalkGroupsResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListEnterpriseDingtalkGroupsResponseBodyData setOpenGroupId(String openGroupId) {
            this.openGroupId = openGroupId;
            return this;
        }
        public String getOpenGroupId() {
            return this.openGroupId;
        }

    }

}
