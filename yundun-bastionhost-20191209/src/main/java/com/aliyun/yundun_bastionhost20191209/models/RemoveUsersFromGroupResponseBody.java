// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveUsersFromGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
    @NameInMap("Results")
    public java.util.List<RemoveUsersFromGroupResponseBodyResults> results;

    public static RemoveUsersFromGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersFromGroupResponseBody self = new RemoveUsersFromGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveUsersFromGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveUsersFromGroupResponseBody setResults(java.util.List<RemoveUsersFromGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<RemoveUsersFromGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class RemoveUsersFromGroupResponseBodyResults extends TeaModel {
        /**
         * <p>The return code that indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>OK</strong>: The call was successful.</p>
         * </li>
         * <li><p><strong>UNEXPECTED</strong>: An unknown error occurred.</p>
         * </li>
         * <li><p><strong>INVALID_ARGUMENT</strong>: A request parameter is invalid.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Make sure that the request parameters are valid and call the operation again.</p>
         * </blockquote>
         * <ul>
         * <li><strong>OBJECT_NOT_FOUND</strong>: The specified object on which you want to perform the operation does not exist.</li>
         * </ul>
         * <blockquote>
         * <p>Check whether the specified ID of the bastion host exists, whether the specified hosts exist, and whether the specified host IDs are valid. Then, call the operation again.</p>
         * </blockquote>
         * <ul>
         * <li><strong>OBJECT_AlREADY_EXISTS</strong>: The specified object on which you want to perform the operation already exists.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static RemoveUsersFromGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            RemoveUsersFromGroupResponseBodyResults self = new RemoveUsersFromGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public RemoveUsersFromGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RemoveUsersFromGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveUsersFromGroupResponseBodyResults setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public RemoveUsersFromGroupResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
