// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class SwitchGdnMemberRoleResponseBody extends TeaModel {
    @NameInMap("Data")
    public SwitchGdnMemberRoleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SwitchGdnMemberRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchGdnMemberRoleResponseBody self = new SwitchGdnMemberRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchGdnMemberRoleResponseBody setData(SwitchGdnMemberRoleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SwitchGdnMemberRoleResponseBodyData getData() {
        return this.data;
    }

    public SwitchGdnMemberRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SwitchGdnMemberRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchGdnMemberRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SwitchGdnMemberRoleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static SwitchGdnMemberRoleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SwitchGdnMemberRoleResponseBodyData self = new SwitchGdnMemberRoleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SwitchGdnMemberRoleResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
