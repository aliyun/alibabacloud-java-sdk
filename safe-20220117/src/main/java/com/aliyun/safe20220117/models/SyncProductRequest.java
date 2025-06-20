// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SyncProductRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    @NameInMap("SyncProductList")
    public java.util.List<SyncProductRequestSyncProductList> syncProductList;

    public static SyncProductRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncProductRequest self = new SyncProductRequest();
        return TeaModel.build(map, self);
    }

    public SyncProductRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SyncProductRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public SyncProductRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public SyncProductRequest setSyncProductList(java.util.List<SyncProductRequestSyncProductList> syncProductList) {
        this.syncProductList = syncProductList;
        return this;
    }
    public java.util.List<SyncProductRequestSyncProductList> getSyncProductList() {
        return this.syncProductList;
    }

    public static class SyncProductRequestSyncProductListInnerProductList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static SyncProductRequestSyncProductListInnerProductList build(java.util.Map<String, ?> map) throws Exception {
            SyncProductRequestSyncProductListInnerProductList self = new SyncProductRequestSyncProductListInnerProductList();
            return TeaModel.build(map, self);
        }

        public SyncProductRequestSyncProductListInnerProductList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SyncProductRequestSyncProductListInnerProductList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SyncProductRequestSyncProductList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("InnerProductList")
        public java.util.List<SyncProductRequestSyncProductListInnerProductList> innerProductList;

        @NameInMap("Name")
        public String name;

        public static SyncProductRequestSyncProductList build(java.util.Map<String, ?> map) throws Exception {
            SyncProductRequestSyncProductList self = new SyncProductRequestSyncProductList();
            return TeaModel.build(map, self);
        }

        public SyncProductRequestSyncProductList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SyncProductRequestSyncProductList setInnerProductList(java.util.List<SyncProductRequestSyncProductListInnerProductList> innerProductList) {
            this.innerProductList = innerProductList;
            return this;
        }
        public java.util.List<SyncProductRequestSyncProductListInnerProductList> getInnerProductList() {
            return this.innerProductList;
        }

        public SyncProductRequestSyncProductList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
