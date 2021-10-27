// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePolarxInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreatePolarxInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreatePolarxInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarxInstanceResponseBody self = new CreatePolarxInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolarxInstanceResponseBody setData(CreatePolarxInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePolarxInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreatePolarxInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePolarxInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatePolarxInstanceResponseBodyDataDrdsInstanceIdList extends TeaModel {
        @NameInMap("drdsInstanceIdList")
        public java.util.List<String> drdsInstanceIdList;

        public static CreatePolarxInstanceResponseBodyDataDrdsInstanceIdList build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarxInstanceResponseBodyDataDrdsInstanceIdList self = new CreatePolarxInstanceResponseBodyDataDrdsInstanceIdList();
            return TeaModel.build(map, self);
        }

        public CreatePolarxInstanceResponseBodyDataDrdsInstanceIdList setDrdsInstanceIdList(java.util.List<String> drdsInstanceIdList) {
            this.drdsInstanceIdList = drdsInstanceIdList;
            return this;
        }
        public java.util.List<String> getDrdsInstanceIdList() {
            return this.drdsInstanceIdList;
        }

    }

    public static class CreatePolarxInstanceResponseBodyData extends TeaModel {
        @NameInMap("DrdsInstanceIdList")
        public CreatePolarxInstanceResponseBodyDataDrdsInstanceIdList drdsInstanceIdList;

        @NameInMap("OrderId")
        public Long orderId;

        public static CreatePolarxInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarxInstanceResponseBodyData self = new CreatePolarxInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePolarxInstanceResponseBodyData setDrdsInstanceIdList(CreatePolarxInstanceResponseBodyDataDrdsInstanceIdList drdsInstanceIdList) {
            this.drdsInstanceIdList = drdsInstanceIdList;
            return this;
        }
        public CreatePolarxInstanceResponseBodyDataDrdsInstanceIdList getDrdsInstanceIdList() {
            return this.drdsInstanceIdList;
        }

        public CreatePolarxInstanceResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
