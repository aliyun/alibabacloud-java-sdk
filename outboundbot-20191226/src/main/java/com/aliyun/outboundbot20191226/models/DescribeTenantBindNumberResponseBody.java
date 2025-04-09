// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTenantBindNumberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeTenantBindNumberResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1364f208-982d-4d0c-89aa-d56e22b47589</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeTenantBindNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantBindNumberResponseBody self = new DescribeTenantBindNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantBindNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTenantBindNumberResponseBody setData(DescribeTenantBindNumberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTenantBindNumberResponseBodyData getData() {
        return this.data;
    }

    public DescribeTenantBindNumberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeTenantBindNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTenantBindNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantBindNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTenantBindNumberResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>e2d7a184-7d6c-45d4-ac24-34ab48f54669</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsBinding")
        public Boolean isBinding;

        public static DescribeTenantBindNumberResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantBindNumberResponseBodyDataList self = new DescribeTenantBindNumberResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeTenantBindNumberResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeTenantBindNumberResponseBodyDataList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeTenantBindNumberResponseBodyDataList setIsBinding(Boolean isBinding) {
            this.isBinding = isBinding;
            return this;
        }
        public Boolean getIsBinding() {
            return this.isBinding;
        }

    }

    public static class DescribeTenantBindNumberResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<DescribeTenantBindNumberResponseBodyDataList> list;

        public static DescribeTenantBindNumberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantBindNumberResponseBodyData self = new DescribeTenantBindNumberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTenantBindNumberResponseBodyData setList(java.util.List<DescribeTenantBindNumberResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeTenantBindNumberResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
