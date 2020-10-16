// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateProfileCatalogResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public UpdateProfileCatalogResponseData data;

    public static UpdateProfileCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProfileCatalogResponse self = new UpdateProfileCatalogResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProfileCatalogResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateProfileCatalogResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateProfileCatalogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProfileCatalogResponse setData(UpdateProfileCatalogResponseData data) {
        this.data = data;
        return this;
    }
    public UpdateProfileCatalogResponseData getData() {
        return this.data;
    }

    public static class UpdateProfileCatalogResponseData extends TeaModel {
        @NameInMap("IsvSubId")
        @Validation(required = true)
        public String isvSubId;

        @NameInMap("ParentCatalogId")
        @Validation(required = true)
        public String parentCatalogId;

        @NameInMap("ProfileCount")
        @Validation(required = true)
        public Long profileCount;

        @NameInMap("CatalogId")
        @Validation(required = true)
        public Long catalogId;

        @NameInMap("CatalogName")
        @Validation(required = true)
        public String catalogName;

        public static UpdateProfileCatalogResponseData build(java.util.Map<String, ?> map) throws Exception {
            UpdateProfileCatalogResponseData self = new UpdateProfileCatalogResponseData();
            return TeaModel.build(map, self);
        }

        public UpdateProfileCatalogResponseData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public UpdateProfileCatalogResponseData setParentCatalogId(String parentCatalogId) {
            this.parentCatalogId = parentCatalogId;
            return this;
        }
        public String getParentCatalogId() {
            return this.parentCatalogId;
        }

        public UpdateProfileCatalogResponseData setProfileCount(Long profileCount) {
            this.profileCount = profileCount;
            return this;
        }
        public Long getProfileCount() {
            return this.profileCount;
        }

        public UpdateProfileCatalogResponseData setCatalogId(Long catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Long getCatalogId() {
            return this.catalogId;
        }

        public UpdateProfileCatalogResponseData setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

    }

}
