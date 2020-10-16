// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddProfileCatalogResponse extends TeaModel {
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
    public AddProfileCatalogResponseData data;

    public static AddProfileCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProfileCatalogResponse self = new AddProfileCatalogResponse();
        return TeaModel.build(map, self);
    }

    public AddProfileCatalogResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddProfileCatalogResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddProfileCatalogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddProfileCatalogResponse setData(AddProfileCatalogResponseData data) {
        this.data = data;
        return this;
    }
    public AddProfileCatalogResponseData getData() {
        return this.data;
    }

    public static class AddProfileCatalogResponseData extends TeaModel {
        @NameInMap("CatalogId")
        @Validation(required = true)
        public Long catalogId;

        @NameInMap("CatalogName")
        @Validation(required = true)
        public String catalogName;

        @NameInMap("IsvSubId")
        @Validation(required = true)
        public String isvSubId;

        public static AddProfileCatalogResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddProfileCatalogResponseData self = new AddProfileCatalogResponseData();
            return TeaModel.build(map, self);
        }

        public AddProfileCatalogResponseData setCatalogId(Long catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Long getCatalogId() {
            return this.catalogId;
        }

        public AddProfileCatalogResponseData setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public AddProfileCatalogResponseData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

    }

}
