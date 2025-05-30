// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListDataLevelPermissionWhiteListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D8749D65-E80A-433C-AF1B-CE9C180FF3B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whitelist for the specified row-level permission type.</p>
     */
    @NameInMap("Result")
    public ListDataLevelPermissionWhiteListResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
     * <ul>
     * <li>true: Request succeeded</li>
     * <li>false: Request failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataLevelPermissionWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataLevelPermissionWhiteListResponseBody self = new ListDataLevelPermissionWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataLevelPermissionWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataLevelPermissionWhiteListResponseBody setResult(ListDataLevelPermissionWhiteListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListDataLevelPermissionWhiteListResponseBodyResult getResult() {
        return this.result;
    }

    public ListDataLevelPermissionWhiteListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataLevelPermissionWhiteListResponseBodyResultUsersModel extends TeaModel {
        /**
         * <p>UserGroups.</p>
         */
        @NameInMap("UserGroups")
        public java.util.List<String> userGroups;

        /**
         * <p>Users.</p>
         */
        @NameInMap("Users")
        public java.util.List<String> users;

        public static ListDataLevelPermissionWhiteListResponseBodyResultUsersModel build(java.util.Map<String, ?> map) throws Exception {
            ListDataLevelPermissionWhiteListResponseBodyResultUsersModel self = new ListDataLevelPermissionWhiteListResponseBodyResultUsersModel();
            return TeaModel.build(map, self);
        }

        public ListDataLevelPermissionWhiteListResponseBodyResultUsersModel setUserGroups(java.util.List<String> userGroups) {
            this.userGroups = userGroups;
            return this;
        }
        public java.util.List<String> getUserGroups() {
            return this.userGroups;
        }

        public ListDataLevelPermissionWhiteListResponseBodyResultUsersModel setUsers(java.util.List<String> users) {
            this.users = users;
            return this;
        }
        public java.util.List<String> getUsers() {
            return this.users;
        }

    }

    public static class ListDataLevelPermissionWhiteListResponseBodyResult extends TeaModel {
        /**
         * <p>Dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7c7223ae-****-3c744528014b</p>
         */
        @NameInMap("CubeId")
        public String cubeId;

        /**
         * <p>Type of dataset row and column permissions. Possible values:</p>
         * <ul>
         * <li>ROW_LEVEL: Row-level permission</li>
         * <li>COLUMN_LEVEL: Column-level permission</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROW_LEVEL</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>Whitelist information.</p>
         */
        @NameInMap("UsersModel")
        public ListDataLevelPermissionWhiteListResponseBodyResultUsersModel usersModel;

        public static ListDataLevelPermissionWhiteListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataLevelPermissionWhiteListResponseBodyResult self = new ListDataLevelPermissionWhiteListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataLevelPermissionWhiteListResponseBodyResult setCubeId(String cubeId) {
            this.cubeId = cubeId;
            return this;
        }
        public String getCubeId() {
            return this.cubeId;
        }

        public ListDataLevelPermissionWhiteListResponseBodyResult setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListDataLevelPermissionWhiteListResponseBodyResult setUsersModel(ListDataLevelPermissionWhiteListResponseBodyResultUsersModel usersModel) {
            this.usersModel = usersModel;
            return this;
        }
        public ListDataLevelPermissionWhiteListResponseBodyResultUsersModel getUsersModel() {
            return this.usersModel;
        }

    }

}
