// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetCatalogListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetCatalogListResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    public static GetCatalogListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogListResponseBody self = new GetCatalogListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCatalogListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCatalogListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCatalogListResponseBody setData(java.util.List<GetCatalogListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCatalogListResponseBodyData> getData() {
        return this.data;
    }

    public GetCatalogListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetCatalogListResponseBodyData extends TeaModel {
        @NameInMap("CatalogId")
        public Long catalogId;

        @NameInMap("CatalogName")
        public String catalogName;

        @NameInMap("IsvSubId")
        public String isvSubId;

        @NameInMap("ParentCatalogId")
        public Long parentCatalogId;

        @NameInMap("ProfileCount")
        public Long profileCount;

        public static GetCatalogListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogListResponseBodyData self = new GetCatalogListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCatalogListResponseBodyData setCatalogId(Long catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Long getCatalogId() {
            return this.catalogId;
        }

        public GetCatalogListResponseBodyData setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public GetCatalogListResponseBodyData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public GetCatalogListResponseBodyData setParentCatalogId(Long parentCatalogId) {
            this.parentCatalogId = parentCatalogId;
            return this;
        }
        public Long getParentCatalogId() {
            return this.parentCatalogId;
        }

        public GetCatalogListResponseBodyData setProfileCount(Long profileCount) {
            this.profileCount = profileCount;
            return this;
        }
        public Long getProfileCount() {
            return this.profileCount;
        }

    }

}
