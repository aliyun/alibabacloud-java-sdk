// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    @NameInMap("DedicateHostList")
    @Validation(required = true)
    public CreateDedicatedHostResponseDedicateHostList dedicateHostList;

    public static CreateDedicatedHostResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostResponse self = new CreateDedicatedHostResponse();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDedicatedHostResponse setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateDedicatedHostResponse setDedicateHostList(CreateDedicatedHostResponseDedicateHostList dedicateHostList) {
        this.dedicateHostList = dedicateHostList;
        return this;
    }
    public CreateDedicatedHostResponseDedicateHostList getDedicateHostList() {
        return this.dedicateHostList;
    }

    public static class CreateDedicatedHostResponseDedicateHostListDedicateHostList extends TeaModel {
        @NameInMap("DedicatedHostId")
        @Validation(required = true)
        public String dedicatedHostId;

        public static CreateDedicatedHostResponseDedicateHostListDedicateHostList build(java.util.Map<String, ?> map) throws Exception {
            CreateDedicatedHostResponseDedicateHostListDedicateHostList self = new CreateDedicatedHostResponseDedicateHostListDedicateHostList();
            return TeaModel.build(map, self);
        }

        public CreateDedicatedHostResponseDedicateHostListDedicateHostList setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

    }

    public static class CreateDedicatedHostResponseDedicateHostList extends TeaModel {
        @NameInMap("DedicateHostList")
        @Validation(required = true)
        public java.util.List<CreateDedicatedHostResponseDedicateHostListDedicateHostList> dedicateHostList;

        public static CreateDedicatedHostResponseDedicateHostList build(java.util.Map<String, ?> map) throws Exception {
            CreateDedicatedHostResponseDedicateHostList self = new CreateDedicatedHostResponseDedicateHostList();
            return TeaModel.build(map, self);
        }

        public CreateDedicatedHostResponseDedicateHostList setDedicateHostList(java.util.List<CreateDedicatedHostResponseDedicateHostListDedicateHostList> dedicateHostList) {
            this.dedicateHostList = dedicateHostList;
            return this;
        }
        public java.util.List<CreateDedicatedHostResponseDedicateHostListDedicateHostList> getDedicateHostList() {
            return this.dedicateHostList;
        }

    }

}
