// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetBusinessCategoryListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetBusinessCategoryListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBusinessCategoryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessCategoryListResponseBody self = new GetBusinessCategoryListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBusinessCategoryListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBusinessCategoryListResponseBody setData(GetBusinessCategoryListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBusinessCategoryListResponseBodyData getData() {
        return this.data;
    }

    public GetBusinessCategoryListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBusinessCategoryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBusinessCategoryListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBusinessCategoryListResponseBodyDataBusinessCategoryBasicInfo extends TeaModel {
        @NameInMap("Bid")
        public Integer bid;

        @NameInMap("BusinessName")
        public String businessName;

        @NameInMap("ServiceType")
        public Integer serviceType;

        public static GetBusinessCategoryListResponseBodyDataBusinessCategoryBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBusinessCategoryListResponseBodyDataBusinessCategoryBasicInfo self = new GetBusinessCategoryListResponseBodyDataBusinessCategoryBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetBusinessCategoryListResponseBodyDataBusinessCategoryBasicInfo setBid(Integer bid) {
            this.bid = bid;
            return this;
        }
        public Integer getBid() {
            return this.bid;
        }

        public GetBusinessCategoryListResponseBodyDataBusinessCategoryBasicInfo setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public GetBusinessCategoryListResponseBodyDataBusinessCategoryBasicInfo setServiceType(Integer serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Integer getServiceType() {
            return this.serviceType;
        }

    }

    public static class GetBusinessCategoryListResponseBodyData extends TeaModel {
        @NameInMap("BusinessCategoryBasicInfo")
        public java.util.List<GetBusinessCategoryListResponseBodyDataBusinessCategoryBasicInfo> businessCategoryBasicInfo;

        public static GetBusinessCategoryListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBusinessCategoryListResponseBodyData self = new GetBusinessCategoryListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBusinessCategoryListResponseBodyData setBusinessCategoryBasicInfo(java.util.List<GetBusinessCategoryListResponseBodyDataBusinessCategoryBasicInfo> businessCategoryBasicInfo) {
            this.businessCategoryBasicInfo = businessCategoryBasicInfo;
            return this;
        }
        public java.util.List<GetBusinessCategoryListResponseBodyDataBusinessCategoryBasicInfo> getBusinessCategoryBasicInfo() {
            return this.businessCategoryBasicInfo;
        }

    }

}
