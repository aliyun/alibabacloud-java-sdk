// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadCategoryGroupListResponseBody extends TeaModel {
    /**
     * <p>The error code returned by the system. For more information about error codes, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The execution result.</p>
     */
    @NameInMap("Data")
    public java.util.List<ReadCategoryGroupListResponseBodyData> data;

    /**
     * <p>The message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. true: The call was successful. false: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReadCategoryGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadCategoryGroupListResponseBody self = new ReadCategoryGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadCategoryGroupListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadCategoryGroupListResponseBody setData(java.util.List<ReadCategoryGroupListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ReadCategoryGroupListResponseBodyData> getData() {
        return this.data;
    }

    public ReadCategoryGroupListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadCategoryGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadCategoryGroupListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadCategoryGroupListResponseBodyData extends TeaModel {
        /**
         * <p>The category group code.</p>
         * 
         * <strong>example:</strong>
         * <p>prod_msg</p>
         */
        @NameInMap("GroupCode")
        public String groupCode;

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>产品消息</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static ReadCategoryGroupListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadCategoryGroupListResponseBodyData self = new ReadCategoryGroupListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadCategoryGroupListResponseBodyData setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public ReadCategoryGroupListResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

}
