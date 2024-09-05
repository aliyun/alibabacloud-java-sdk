// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class GetEnterpriseDingtalkGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetEnterpriseDingtalkGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Invalid data</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetEnterpriseDingtalkGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDingtalkGroupResponseBody self = new GetEnterpriseDingtalkGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDingtalkGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnterpriseDingtalkGroupResponseBody setData(GetEnterpriseDingtalkGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnterpriseDingtalkGroupResponseBodyData getData() {
        return this.data;
    }

    public GetEnterpriseDingtalkGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class GetEnterpriseDingtalkGroupResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>A企业服务群</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OpenGroupId")
        public String openGroupId;

        public static GetEnterpriseDingtalkGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseDingtalkGroupResponseBodyData self = new GetEnterpriseDingtalkGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseDingtalkGroupResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetEnterpriseDingtalkGroupResponseBodyData setOpenGroupId(String openGroupId) {
            this.openGroupId = openGroupId;
            return this;
        }
        public String getOpenGroupId() {
            return this.openGroupId;
        }

    }

}
