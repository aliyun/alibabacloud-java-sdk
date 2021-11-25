// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddProfileCatalogResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddProfileCatalogResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AddProfileCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddProfileCatalogResponseBody self = new AddProfileCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public AddProfileCatalogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddProfileCatalogResponseBody setData(AddProfileCatalogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddProfileCatalogResponseBodyData getData() {
        return this.data;
    }

    public AddProfileCatalogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddProfileCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddProfileCatalogResponseBodyData extends TeaModel {
        @NameInMap("CatalogId")
        public Long catalogId;

        @NameInMap("CatalogName")
        public String catalogName;

        @NameInMap("IsvSubId")
        public String isvSubId;

        public static AddProfileCatalogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddProfileCatalogResponseBodyData self = new AddProfileCatalogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddProfileCatalogResponseBodyData setCatalogId(Long catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Long getCatalogId() {
            return this.catalogId;
        }

        public AddProfileCatalogResponseBodyData setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public AddProfileCatalogResponseBodyData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

    }

}
