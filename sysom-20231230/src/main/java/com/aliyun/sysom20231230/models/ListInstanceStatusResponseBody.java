// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstanceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListInstanceStatusResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>218</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStatusResponseBody self = new ListInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceStatusResponseBody setData(java.util.List<ListInstanceStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstanceStatusResponseBodyData> getData() {
        return this.data;
    }

    public ListInstanceStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceStatusResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListInstanceStatusResponseBodyData extends TeaModel {
        @NameInMap("instance")
        public String instance;

        @NameInMap("region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static ListInstanceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceStatusResponseBodyData self = new ListInstanceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceStatusResponseBodyData setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public ListInstanceStatusResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListInstanceStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
