// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateProfileCatalogResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public UpdateProfileCatalogResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static UpdateProfileCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProfileCatalogResponseBody self = new UpdateProfileCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProfileCatalogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateProfileCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProfileCatalogResponseBody setData(UpdateProfileCatalogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateProfileCatalogResponseBodyData getData() {
        return this.data;
    }

    public UpdateProfileCatalogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class UpdateProfileCatalogResponseBodyData extends TeaModel {
        @NameInMap("CatalogId")
        public Long catalogId;

        @NameInMap("CatalogName")
        public String catalogName;

        @NameInMap("IsvSubId")
        public String isvSubId;

        @NameInMap("ParentCatalogId")
        public String parentCatalogId;

        @NameInMap("ProfileCount")
        public Long profileCount;

        public static UpdateProfileCatalogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateProfileCatalogResponseBodyData self = new UpdateProfileCatalogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateProfileCatalogResponseBodyData setCatalogId(Long catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Long getCatalogId() {
            return this.catalogId;
        }

        public UpdateProfileCatalogResponseBodyData setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public UpdateProfileCatalogResponseBodyData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public UpdateProfileCatalogResponseBodyData setParentCatalogId(String parentCatalogId) {
            this.parentCatalogId = parentCatalogId;
            return this;
        }
        public String getParentCatalogId() {
            return this.parentCatalogId;
        }

        public UpdateProfileCatalogResponseBodyData setProfileCount(Long profileCount) {
            this.profileCount = profileCount;
            return this;
        }
        public Long getProfileCount() {
            return this.profileCount;
        }

    }

}
