// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetMainPartListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetMainPartListResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMainPartListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMainPartListResponseBody self = new GetMainPartListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMainPartListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetMainPartListResponseBody setData(GetMainPartListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMainPartListResponseBodyData getData() {
        return this.data;
    }

    public GetMainPartListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMainPartListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMainPartListResponseBodyDataList extends TeaModel {
        @NameInMap("AccountNo")
        public String accountNo;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("BrandUserId")
        public Long brandUserId;

        @NameInMap("BrandUserNick")
        public String brandUserNick;

        @NameInMap("MainId")
        public Long mainId;

        @NameInMap("MainName")
        public String mainName;

        @NameInMap("ProxyUserId")
        public Long proxyUserId;

        public static GetMainPartListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetMainPartListResponseBodyDataList self = new GetMainPartListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetMainPartListResponseBodyDataList setAccountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }
        public String getAccountNo() {
            return this.accountNo;
        }

        public GetMainPartListResponseBodyDataList setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetMainPartListResponseBodyDataList setBrandUserId(Long brandUserId) {
            this.brandUserId = brandUserId;
            return this;
        }
        public Long getBrandUserId() {
            return this.brandUserId;
        }

        public GetMainPartListResponseBodyDataList setBrandUserNick(String brandUserNick) {
            this.brandUserNick = brandUserNick;
            return this;
        }
        public String getBrandUserNick() {
            return this.brandUserNick;
        }

        public GetMainPartListResponseBodyDataList setMainId(Long mainId) {
            this.mainId = mainId;
            return this;
        }
        public Long getMainId() {
            return this.mainId;
        }

        public GetMainPartListResponseBodyDataList setMainName(String mainName) {
            this.mainName = mainName;
            return this;
        }
        public String getMainName() {
            return this.mainName;
        }

        public GetMainPartListResponseBodyDataList setProxyUserId(Long proxyUserId) {
            this.proxyUserId = proxyUserId;
            return this;
        }
        public Long getProxyUserId() {
            return this.proxyUserId;
        }

    }

    public static class GetMainPartListResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("List")
        public java.util.List<GetMainPartListResponseBodyDataList> list;

        public static GetMainPartListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMainPartListResponseBodyData self = new GetMainPartListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMainPartListResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetMainPartListResponseBodyData setList(java.util.List<GetMainPartListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetMainPartListResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
