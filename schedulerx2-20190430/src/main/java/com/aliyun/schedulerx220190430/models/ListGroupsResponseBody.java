// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListGroupsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the applications.</p>
     */
    @NameInMap("Data")
    public ListGroupsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsResponseBody self = new ListGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGroupsResponseBody setData(ListGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGroupsResponseBodyData getData() {
        return this.data;
    }

    public ListGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGroupsResponseBodyDataAppGroups extends TeaModel {
        /**
         * <p>The application group ID.</p>
         */
        @NameInMap("AppGroupId")
        public Long appGroupId;

        /**
         * <p>The AppKey for the application.</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The description of the application.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The application ID.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        public static ListGroupsResponseBodyDataAppGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseBodyDataAppGroups self = new ListGroupsResponseBodyDataAppGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsResponseBodyDataAppGroups setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        public ListGroupsResponseBodyDataAppGroups setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListGroupsResponseBodyDataAppGroups setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListGroupsResponseBodyDataAppGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGroupsResponseBodyDataAppGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

    public static class ListGroupsResponseBodyData extends TeaModel {
        /**
         * <p>The applications and their details.</p>
         */
        @NameInMap("AppGroups")
        public java.util.List<ListGroupsResponseBodyDataAppGroups> appGroups;

        public static ListGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseBodyData self = new ListGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGroupsResponseBodyData setAppGroups(java.util.List<ListGroupsResponseBodyDataAppGroups> appGroups) {
            this.appGroups = appGroups;
            return this;
        }
        public java.util.List<ListGroupsResponseBodyDataAppGroups> getAppGroups() {
            return this.appGroups;
        }

    }

}
