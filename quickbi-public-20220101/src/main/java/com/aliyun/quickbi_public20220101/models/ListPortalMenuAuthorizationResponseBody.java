// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListPortalMenuAuthorizationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D8749D65-E80A-433C-AF1B-CE9C180FF3B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of authorization details for the BI portal menus.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListPortalMenuAuthorizationResponseBodyResult> result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListPortalMenuAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPortalMenuAuthorizationResponseBody self = new ListPortalMenuAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPortalMenuAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPortalMenuAuthorizationResponseBody setResult(java.util.List<ListPortalMenuAuthorizationResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListPortalMenuAuthorizationResponseBodyResult> getResult() {
        return this.result;
    }

    public ListPortalMenuAuthorizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPortalMenuAuthorizationResponseBodyResultReceivers extends TeaModel {
        /**
         * <p>The authorization type for the menu. Valid values:</p>
         * <ul>
         * <li><p>1: View</p>
         * </li>
         * <li><p>11: Edit</p>
         * </li>
         * <li><p>3: Export and view</p>
         * </li>
         * <li><p>10: Manage data entry</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthPointsValue")
        public Integer authPointsValue;

        /**
         * <p>The ID of the authorization object.</p>
         * <blockquote>
         * <ul>
         * <li><p>If the authorization object is an organization, this ID is the organization ID.</p>
         * </li>
         * <li><p>If the authorization object is a workspace, this ID is the workspace ID.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>121344444790****</p>
         */
        @NameInMap("ReceiverId")
        public String receiverId;

        /**
         * <p>The type of the authorization object. Valid values:</p>
         * <ul>
         * <li><p>0: User</p>
         * </li>
         * <li><p>1: User group</p>
         * </li>
         * <li><p>2: Organization</p>
         * </li>
         * <li><p>3: Workspace</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReceiverType")
        public Integer receiverType;

        public static ListPortalMenuAuthorizationResponseBodyResultReceivers build(java.util.Map<String, ?> map) throws Exception {
            ListPortalMenuAuthorizationResponseBodyResultReceivers self = new ListPortalMenuAuthorizationResponseBodyResultReceivers();
            return TeaModel.build(map, self);
        }

        public ListPortalMenuAuthorizationResponseBodyResultReceivers setAuthPointsValue(Integer authPointsValue) {
            this.authPointsValue = authPointsValue;
            return this;
        }
        public Integer getAuthPointsValue() {
            return this.authPointsValue;
        }

        public ListPortalMenuAuthorizationResponseBodyResultReceivers setReceiverId(String receiverId) {
            this.receiverId = receiverId;
            return this;
        }
        public String getReceiverId() {
            return this.receiverId;
        }

        public ListPortalMenuAuthorizationResponseBodyResultReceivers setReceiverType(Integer receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public Integer getReceiverType() {
            return this.receiverType;
        }

    }

    public static class ListPortalMenuAuthorizationResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the leaf-node menu in the BI portal.</p>
         * 
         * <strong>example:</strong>
         * <p>54kqgoa****</p>
         */
        @NameInMap("MenuId")
        public String menuId;

        /**
         * <p>The details of the authorization objects for the menu.</p>
         */
        @NameInMap("Receivers")
        public java.util.List<ListPortalMenuAuthorizationResponseBodyResultReceivers> receivers;

        /**
         * <p>Indicates whether the menu is visible only to authorized users. Valid values:</p>
         * <ul>
         * <li><p>true: The menu is visible only to authorized users.</p>
         * </li>
         * <li><p>false: The menu is visible to all users.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ShowOnlyWithAccess")
        public Boolean showOnlyWithAccess;

        public static ListPortalMenuAuthorizationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListPortalMenuAuthorizationResponseBodyResult self = new ListPortalMenuAuthorizationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListPortalMenuAuthorizationResponseBodyResult setMenuId(String menuId) {
            this.menuId = menuId;
            return this;
        }
        public String getMenuId() {
            return this.menuId;
        }

        public ListPortalMenuAuthorizationResponseBodyResult setReceivers(java.util.List<ListPortalMenuAuthorizationResponseBodyResultReceivers> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<ListPortalMenuAuthorizationResponseBodyResultReceivers> getReceivers() {
            return this.receivers;
        }

        public ListPortalMenuAuthorizationResponseBodyResult setShowOnlyWithAccess(Boolean showOnlyWithAccess) {
            this.showOnlyWithAccess = showOnlyWithAccess;
            return this;
        }
        public Boolean getShowOnlyWithAccess() {
            return this.showOnlyWithAccess;
        }

    }

}
