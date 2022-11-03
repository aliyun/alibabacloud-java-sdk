// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class SdkGetItemInstListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SdkGetItemInstListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static SdkGetItemInstListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdkGetItemInstListResponseBody self = new SdkGetItemInstListResponseBody();
        return TeaModel.build(map, self);
    }

    public SdkGetItemInstListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SdkGetItemInstListResponseBody setData(SdkGetItemInstListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SdkGetItemInstListResponseBodyData getData() {
        return this.data;
    }

    public SdkGetItemInstListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SdkGetItemInstListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SdkGetItemInstListResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public SdkGetItemInstListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SdkGetItemInstListResponseBodyDataList extends TeaModel {
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

        public static SdkGetItemInstListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            SdkGetItemInstListResponseBodyDataList self = new SdkGetItemInstListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public SdkGetItemInstListResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SdkGetItemInstListResponseBodyDataList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public SdkGetItemInstListResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SdkGetItemInstListResponseBodyDataList setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SdkGetItemInstListResponseBodyDataList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public SdkGetItemInstListResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class SdkGetItemInstListResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("Current")
        public Integer current;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static SdkGetItemInstListResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            SdkGetItemInstListResponseBodyDataPageInfo self = new SdkGetItemInstListResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public SdkGetItemInstListResponseBodyDataPageInfo setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public SdkGetItemInstListResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SdkGetItemInstListResponseBodyDataPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class SdkGetItemInstListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<SdkGetItemInstListResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public SdkGetItemInstListResponseBodyDataPageInfo pageInfo;

        public static SdkGetItemInstListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SdkGetItemInstListResponseBodyData self = new SdkGetItemInstListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SdkGetItemInstListResponseBodyData setList(java.util.List<SdkGetItemInstListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<SdkGetItemInstListResponseBodyDataList> getList() {
            return this.list;
        }

        public SdkGetItemInstListResponseBodyData setPageInfo(SdkGetItemInstListResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public SdkGetItemInstListResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
