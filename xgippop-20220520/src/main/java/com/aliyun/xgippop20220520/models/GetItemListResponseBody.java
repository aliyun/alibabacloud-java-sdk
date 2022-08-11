// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetItemListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetItemListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static GetItemListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetItemListResponseBody self = new GetItemListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetItemListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetItemListResponseBody setData(java.util.List<GetItemListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetItemListResponseBodyData> getData() {
        return this.data;
    }

    public GetItemListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetItemListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetItemListResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetItemListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetItemListResponseBodyData extends TeaModel {
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("ItemBuyUrl")
        public String itemBuyUrl;

        @NameInMap("ItemCode")
        public String itemCode;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("Name")
        public String name;

        public static GetItemListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetItemListResponseBodyData self = new GetItemListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetItemListResponseBodyData setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public GetItemListResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetItemListResponseBodyData setItemBuyUrl(String itemBuyUrl) {
            this.itemBuyUrl = itemBuyUrl;
            return this;
        }
        public String getItemBuyUrl() {
            return this.itemBuyUrl;
        }

        public GetItemListResponseBodyData setItemCode(String itemCode) {
            this.itemCode = itemCode;
            return this;
        }
        public String getItemCode() {
            return this.itemCode;
        }

        public GetItemListResponseBodyData setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public GetItemListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
