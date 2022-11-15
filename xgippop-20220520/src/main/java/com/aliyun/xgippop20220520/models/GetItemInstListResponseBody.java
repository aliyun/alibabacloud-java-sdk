// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetItemInstListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetItemInstListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static GetItemInstListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetItemInstListResponseBody self = new GetItemInstListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetItemInstListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetItemInstListResponseBody setData(GetItemInstListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetItemInstListResponseBodyData getData() {
        return this.data;
    }

    public GetItemInstListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetItemInstListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetItemInstListResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetItemInstListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetItemInstListResponseBodyDataList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Status")
        public Integer status;

        public static GetItemInstListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetItemInstListResponseBodyDataList self = new GetItemInstListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetItemInstListResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetItemInstListResponseBodyDataList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetItemInstListResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetItemInstListResponseBodyDataList setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetItemInstListResponseBodyDataList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetItemInstListResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetItemInstListResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("Current")
        public Integer current;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetItemInstListResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetItemInstListResponseBodyDataPageInfo self = new GetItemInstListResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public GetItemInstListResponseBodyDataPageInfo setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public GetItemInstListResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetItemInstListResponseBodyDataPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetItemInstListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetItemInstListResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public GetItemInstListResponseBodyDataPageInfo pageInfo;

        public static GetItemInstListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetItemInstListResponseBodyData self = new GetItemInstListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetItemInstListResponseBodyData setList(java.util.List<GetItemInstListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetItemInstListResponseBodyDataList> getList() {
            return this.list;
        }

        public GetItemInstListResponseBodyData setPageInfo(GetItemInstListResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public GetItemInstListResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
