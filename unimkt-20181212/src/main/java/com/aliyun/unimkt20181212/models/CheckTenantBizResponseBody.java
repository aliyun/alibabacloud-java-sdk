// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CheckTenantBizResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CheckTenantBizResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckTenantBizResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckTenantBizResponseBody self = new CheckTenantBizResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckTenantBizResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckTenantBizResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckTenantBizResponseBody setModel(CheckTenantBizResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CheckTenantBizResponseBodyModel getModel() {
        return this.model;
    }

    public CheckTenantBizResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckTenantBizResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckTenantBizResponseBodyModel extends TeaModel {
        @NameInMap("CanAccessAdSlot")
        public Boolean canAccessAdSlot;

        @NameInMap("CanAccessMedia")
        public Boolean canAccessMedia;

        public static CheckTenantBizResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CheckTenantBizResponseBodyModel self = new CheckTenantBizResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CheckTenantBizResponseBodyModel setCanAccessAdSlot(Boolean canAccessAdSlot) {
            this.canAccessAdSlot = canAccessAdSlot;
            return this;
        }
        public Boolean getCanAccessAdSlot() {
            return this.canAccessAdSlot;
        }

        public CheckTenantBizResponseBodyModel setCanAccessMedia(Boolean canAccessMedia) {
            this.canAccessMedia = canAccessMedia;
            return this;
        }
        public Boolean getCanAccessMedia() {
            return this.canAccessMedia;
        }

    }

}
