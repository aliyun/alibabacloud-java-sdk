// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetCatalogListResponse extends TeaModel {
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
    public java.util.List<GetCatalogListResponseData> data;

    public static GetCatalogListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogListResponse self = new GetCatalogListResponse();
        return TeaModel.build(map, self);
    }

    public GetCatalogListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCatalogListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCatalogListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCatalogListResponse setData(java.util.List<GetCatalogListResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCatalogListResponseData> getData() {
        return this.data;
    }

    public static class GetCatalogListResponseData extends TeaModel {
        @NameInMap("IsvSubId")
        @Validation(required = true)
        public String isvSubId;

        @NameInMap("ParentCatalogId")
        @Validation(required = true)
        public Long parentCatalogId;

        @NameInMap("ProfileCount")
        @Validation(required = true)
        public Long profileCount;

        @NameInMap("CatalogId")
        @Validation(required = true)
        public Long catalogId;

        @NameInMap("CatalogName")
        @Validation(required = true)
        public String catalogName;

        public static GetCatalogListResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogListResponseData self = new GetCatalogListResponseData();
            return TeaModel.build(map, self);
        }

        public GetCatalogListResponseData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public GetCatalogListResponseData setParentCatalogId(Long parentCatalogId) {
            this.parentCatalogId = parentCatalogId;
            return this;
        }
        public Long getParentCatalogId() {
            return this.parentCatalogId;
        }

        public GetCatalogListResponseData setProfileCount(Long profileCount) {
            this.profileCount = profileCount;
            return this;
        }
        public Long getProfileCount() {
            return this.profileCount;
        }

        public GetCatalogListResponseData setCatalogId(Long catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Long getCatalogId() {
            return this.catalogId;
        }

        public GetCatalogListResponseData setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

    }

}
