// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListPortalMenuAuthorizationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D8749D65-E80A-433C-AF1B-CE9C180FF3B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of authorization details of the portal menu.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListPortalMenuAuthorizationResponseBodyResult> result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
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
         * <p>The ID of the authorization object.</p>
         * 
         * <strong>example:</strong>
         * <p>121344444790****</p>
         */
        @NameInMap("ReceiverId")
        public String receiverId;

        /**
         * <p>The type of the authorization object. Valid values:</p>
         * <ul>
         * <li>0: user</li>
         * <li>1: user group</li>
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
         * <p>The menu ID of the BI portal leaf node.</p>
         * 
         * <strong>example:</strong>
         * <p>54kqgoa****</p>
         */
        @NameInMap("MenuId")
        public String menuId;

        /**
         * <p>The details of the object to which the menu is authorized.</p>
         */
        @NameInMap("Receivers")
        public java.util.List<ListPortalMenuAuthorizationResponseBodyResultReceivers> receivers;

        /**
         * <p>Whether only authorization is visible. Valid values:</p>
         * <ul>
         * <li>true: Only the authorization is visible.</li>
         * <li>false: Both are visible.</li>
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
