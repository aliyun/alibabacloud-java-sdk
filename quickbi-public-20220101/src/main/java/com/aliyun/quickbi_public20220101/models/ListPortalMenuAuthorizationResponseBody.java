// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListPortalMenuAuthorizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListPortalMenuAuthorizationResponseBodyResult> result;

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
        @NameInMap("ReceiverId")
        public String receiverId;

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
        @NameInMap("MenuId")
        public String menuId;

        @NameInMap("Receivers")
        public java.util.List<ListPortalMenuAuthorizationResponseBodyResultReceivers> receivers;

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
